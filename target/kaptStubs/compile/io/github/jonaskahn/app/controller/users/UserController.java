package io.github.jonaskahn.app.controller.users;

@io.jooby.annotation.Path(value = {"/users"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/github/jonaskahn/app/controller/users/UserController;", "", "userService", "Lio/github/jonaskahn/app/services/user/UserService;", "authenticationService", "Lio/github/jonaskahn/app/services/authen/AuthenticationService;", "(Lio/github/jonaskahn/app/services/user/UserService;Lio/github/jonaskahn/app/services/authen/AuthenticationService;)V", "generateToken", "", "request", "Lio/github/jonaskahn/app/controller/users/UserTokenRequest;", "register", "", "Lio/github/jonaskahn/app/controller/users/UserRegisterRequest;", "backend"})
public final class UserController {
    @org.jetbrains.annotations.NotNull()
    private final io.github.jonaskahn.app.services.user.UserService userService = null;
    @org.jetbrains.annotations.NotNull()
    private final io.github.jonaskahn.app.services.authen.AuthenticationService authenticationService = null;
    
    @jakarta.inject.Inject()
    public UserController(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.services.user.UserService userService, @org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.services.authen.AuthenticationService authenticationService) {
        super();
    }
    
    @io.jooby.annotation.POST(value = {"/generate-token"})
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generateToken(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.controller.users.UserTokenRequest request) {
        return null;
    }
    
    @io.jooby.annotation.POST(value = {"/register"})
    @io.jooby.annotation.Transactional()
    public final void register(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.controller.users.UserRegisterRequest request) {
    }
}