package io.github.jonaskahn.app.services.authen;

@com.google.inject.ImplementedBy(value = io.github.jonaskahn.app.services.authen.BcryptPasswordEncoderImpl.class)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lio/github/jonaskahn/app/services/authen/PasswordEncoder;", "", "encode", "", "input", "matches", "", "encoded", "backend"})
public abstract interface PasswordEncoder {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String encode(@org.jetbrains.annotations.NotNull()
    java.lang.String input);
    
    public abstract boolean matches(@org.jetbrains.annotations.NotNull()
    java.lang.String input, @org.jetbrains.annotations.NotNull()
    java.lang.String encoded);
}