package io.github.jonaskahn.app.repositories;

@jakarta.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/github/jonaskahn/app/repositories/UserRepositoryImpl;", "Lio/github/jonaskahn/app/repositories/UserRepository;", "em", "Ljakarta/persistence/EntityManager;", "(Ljakarta/persistence/EntityManager;)V", "existsByUsernameOrEmail", "", "username", "", "email", "findByUsernameOrEmail", "Lio/github/jonaskahn/app/entities/User;", "save", "", "user", "backend"})
public final class UserRepositoryImpl implements io.github.jonaskahn.app.repositories.UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final jakarta.persistence.EntityManager em = null;
    
    @jakarta.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    jakarta.persistence.EntityManager em) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public io.github.jonaskahn.app.entities.User findByUsernameOrEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @java.lang.Override()
    public boolean existsByUsernameOrEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String email) {
        return false;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.entities.User user) {
    }
}