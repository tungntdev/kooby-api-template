package io.github.jonaskahn.app.services.user;

@jakarta.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/github/jonaskahn/app/services/user/UserServiceImpl;", "Lio/github/jonaskahn/app/services/user/UserService;", "userRepository", "Lio/github/jonaskahn/app/repositories/UserRepository;", "passwordEncoder", "Lio/github/jonaskahn/app/services/authen/PasswordEncoder;", "(Lio/github/jonaskahn/app/repositories/UserRepository;Lio/github/jonaskahn/app/services/authen/PasswordEncoder;)V", "createUser", "", "request", "Lio/github/jonaskahn/app/controller/users/UserRegisterRequest;", "backend"})
public final class UserServiceImpl implements io.github.jonaskahn.app.services.user.UserService {
    @org.jetbrains.annotations.NotNull()
    private final io.github.jonaskahn.app.repositories.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final io.github.jonaskahn.app.services.authen.PasswordEncoder passwordEncoder = null;
    
    @jakarta.inject.Inject()
    public UserServiceImpl(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.repositories.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.services.authen.PasswordEncoder passwordEncoder) {
        super();
    }
    
    @java.lang.Override()
    public void createUser(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.controller.users.UserRegisterRequest request) {
    }
}