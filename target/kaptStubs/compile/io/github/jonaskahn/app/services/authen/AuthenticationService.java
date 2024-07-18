package io.github.jonaskahn.app.services.authen;

@com.google.inject.ImplementedBy(value = io.github.jonaskahn.app.services.authen.AuthenticationServiceImpl.class)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/github/jonaskahn/app/services/authen/AuthenticationService;", "", "generateToken", "", "username", "password", "backend"})
public abstract interface AuthenticationService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String generateToken(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
}