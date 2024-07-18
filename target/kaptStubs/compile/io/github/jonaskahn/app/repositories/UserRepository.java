package io.github.jonaskahn.app.repositories;

@com.google.inject.ImplementedBy(value = io.github.jonaskahn.app.repositories.UserRepositoryImpl.class)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&\u00a8\u0006\f"}, d2 = {"Lio/github/jonaskahn/app/repositories/UserRepository;", "", "existsByUsernameOrEmail", "", "username", "", "email", "findByUsernameOrEmail", "Lio/github/jonaskahn/app/entities/User;", "save", "", "user", "backend"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.github.jonaskahn.app.entities.User findByUsernameOrEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract boolean existsByUsernameOrEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String email);
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.entities.User user);
}