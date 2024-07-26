# Why Kooby?
- Fast, light, easy to learn
- I've been using Spring for almost my wokring time with Java/Kotlin. For large scale enterprise projects, Spring Stacks are undoubtedly the way to go, but for minimal projects, Kooby is a good choice.

## Looking for Java version
- [Checkout](https://github.com/jonaskahn/jooby-api-template)

## Which's included?
- [x] Support Default JWT
- [x] Support Role Access Layer
- [x] Hibernate, Flyway support by default
- [x] Add custom JPAQueryExecutor for the better querying
- [x] Add Jedis support instead of Lettuce
- [x] Using MapStruct for Object Mapper
- [x] Using Guice as Dependency Injection Framework
- [x] Multiple language support
- [x] Default admin user: `admin@localhost/admin`

## Default API
1. Create users 
```shell
curl --location 'http://localhost:8080/api/auth/register' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "test",
    "email": "test@localhost",
    "password": "test"
}'
```
2. Generate token
```shell
curl --location 'http://localhost:8080/api/auth/generate-token' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "test@localhost",
    "password": "test"
}'
```
3. Get User Info
```shell
# With JPA Query
curl --location 'http://localhost:8080/api/secure/user/info' \
--header 'Accept-Language: vi'
--header 'Authorization: ••••••'
```
```shell
# With JPAQueryExecutor
curl --location 'http://localhost:8080/api/secure/user/info-with-executor' \
--header 'Accept-Language: vi'
--header 'Authorization: ••••••'
```
4. Test Role
```shell
curl --location 'http://localhost:8080/api/secure/test/admin-role' \
--header 'Authorization: ••••••'
```
5. Logout
```shell
curl --location --request DELETE 'http://localhost:8080/api/auth/secure/logout' \
--header 'Authorization: ••••••'
```
## HOW
### Implement JWT
- Using [Pac4j](https://jooby.io/modules/pac4j/) Module as Security Layer
```kotlin
install(
        Pac4jModule()
            .client("/api/secure/*") {
                HeaderClient(
                    "Authorization",
                    "Bearer ",
                    AdvancedJwtAuthenticator(
                        require(JedisPooled::class.java),
                        SecretSignatureConfiguration(it.getString("jwt.salt"))
                    )
                )
            }
    )
```
1. Using `HeaderClient` to tell Jooby read `Bearer` token from header
2. By default Jooby use the `JwtAuthenticator` from Pac4j, the problems are:
   - Token is completed stateless
   - What if user is lock/inactivated/deleted -> token may still valid by the `exp` -> user still can access to system
   - There is no truly `logout`

So, I solved these problems by store `jid` of JWT in Redis, after `validate` raw token, before `createProfile` I made a simple check to ensure the `jid` exists in `redis`. If no, token is invalid

See [AdvancedJwtAuthenticator.kt](src/main/kotlin/io/github/jonaskahn/middlewares/jwt/AdvancedJwtAuthenticator.kt)
```kotlin
class AdvancedJwtAuthenticator(private val redis: JedisPooled, signatureConfiguration: SignatureConfiguration) :
    JwtAuthenticator(signatureConfiguration) {
    @Throws(ParseException::class)
    override fun createJwtProfile(
        credentials: TokenCredentials, jwt: JWT, context: WebContext?,
        sessionStore: SessionStore?
    ) {
        val jwtId = jwt.jwtClaimsSet.jwtid.toString()
        val uid = jwt.jwtClaimsSet.claims[Jwt.Attribute.UID].toString()
        if (!redis.exists(RedisNameSpace.getUserTokenExpirationKey(uid, jwtId))) {
            throw AuthorizationException()
        }
        super.createJwtProfile(credentials, jwt, context, sessionStore)
    }
}
```
3. For now, when you want `logout`, just delete the related `jid` in `redis`.

### [Role Access Verifier](src/main/kotlin/io/github/jonaskahn/middlewares/role/AccessVerifier.kt)

```kotlin
internal class AccessVerifierImpl @Inject constructor(private val context: Context) : AccessVerifier {
    override fun hasRole(role: String): Boolean {
        val user = context.getUser<UserProfile>()
        return user?.roles?.contains(role) ?: false
    }

    override fun requireRole(role: String) {
        if (!hasRole(role)) {
            throw ForbiddenAccessException()
        }
    }

    override fun hasAnyRoles(vararg roles: String): Boolean {
        val user = context.getUser<UserProfile>()
        return user?.roles?.any { roles.contains(it) } ?: false
    }

    override fun requireAnyRoles(vararg roles: String) {
        if (!hasAnyRoles(*roles)) {
            throw ForbiddenAccessException()
        }
    }
}
```
- `hasRole` or `hasAnyRoles` will check and return `true`/`false`, while `requireRole` and `requireAnyRoles` will explicitly throw exception if you do not have access.

### [JpaQueryExecutor](src/main/kotlin/io/github/jonaskahn/assistant/query/JpaQueryExecutor.kt)
- **Problem**: Sometimes we want to retrieve data from database via native query, but we do not want manually map field's value from result to pojo class. 
- To solve this problem we have so many ways. With the usage of Hibernate, I create JPA Query Executor to parse sql result to object via Jackson
```kotlin
class UserRepositoryImpl @Inject constructor(
    private val em: EntityManager
) : UserRepository {
    override fun findCustomActivatedUserByPreferredUsername(preferredUsername: Long): UserInfoDto? {
        val query =
            em.createNativeQuery("select * from users where preferred_username = :preferredUsername and status = ${StatusCode.ACTIVATED}")
        return JpaQueryExecutor.builder<UserInfoDto>()
            .with(query, mutableMapOf("preferredUsername" to preferredUsername))
            .map(UserInfoDto::class.java)
            .getSingleResult()
    }
}
```
> So, we directly map database field's value to Pojo object via Jackson, if Pojo class does not have correct field name, please using @JsonAlias (Like database field `full_name`, pojo class `fullName`)
