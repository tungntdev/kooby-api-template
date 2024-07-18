package io.github.jonaskahn.app.services.user;

@com.google.inject.ImplementedBy(value = io.github.jonaskahn.app.services.user.UserServiceImpl.class)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/github/jonaskahn/app/services/user/UserService;", "", "createUser", "", "request", "Lio/github/jonaskahn/app/controller/users/UserRegisterRequest;", "backend"})
public abstract interface UserService {
    
    public abstract void createUser(@org.jetbrains.annotations.NotNull()
    io.github.jonaskahn.app.controller.users.UserRegisterRequest request);
}