package io.github.jonaskahn.app.services.authen;

@jakarta.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/github/jonaskahn/app/services/authen/AuthenticationServiceImpl;", "Lio/github/jonaskahn/app/services/authen/AuthenticationService;", "userRepository", "Lio/github/jonaskahn/app/repositories/UserRepository;", "passwordEncoder", "Lio/github/jonaskahn/app/services/authen/PasswordEncoder;", "environment", "Lio/jooby/Environment;", "(Lio/github/jonaskahn/app/repositories/UserRepository;Lio/github/jonaskahn/app/services/authen/PasswordEncoder;Lio/jooby/Environment;)V", "generateToken", "", "username", "password", "backend"})
public final class AuthenticationServiceImpl implements io.github.jonaskahn.app.services.authen.AuthenticationService {
    @org.jetbrains.annotations.NotNull()
    private final io.github.jonaskahn.app.repositories.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final io.github.jonaskahn.app.services.authen.PasswordEncoder passwordEncoder = null;
    @org.jetbrains.annotations.NotNull()
    private final io.jooby.Environment environment = null;
    
    @jakarta.inject.Inject()
    public AuthenticationServiceImpl(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.repositories.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.services.authen.PasswordEncoder passwordEncoder, @org.jetbrains.annotations.NotNull()
    io.jooby.Environment environment) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String generateToken(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
}