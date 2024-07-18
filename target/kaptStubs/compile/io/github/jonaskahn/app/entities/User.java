package io.github.jonaskahn.app.entities;

@jakarta.persistence.Entity(name = "users")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b\u00a8\u0006\'"}, d2 = {"Lio/github/jonaskahn/app/entities/User;", "", "()V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "fullName", "getFullName", "setFullName", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "password", "getPassword", "setPassword", "preferredUsername", "getPreferredUsername", "setPreferredUsername", "status", "Lio/github/jonaskahn/app/entities/enums/Status;", "getStatus", "()Lio/github/jonaskahn/app/entities/enums/Status;", "setStatus", "(Lio/github/jonaskahn/app/entities/enums/Status;)V", "username", "getUsername", "setUsername", "equals", "", "other", "hashCode", "", "backend"})
public class User {
    @jakarta.persistence.Id()
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Column(name = "id", nullable = false)
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    @jakarta.persistence.Column(name = "username", nullable = false, length = 128)
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    @jakarta.persistence.Column(name = "preferred_username")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long preferredUsername;
    @jakarta.persistence.Column(name = "email", length = 128)
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @jakarta.persistence.Column(name = "full_name")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fullName;
    @jakarta.persistence.Column(name = "password", length = 80)
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    @org.hibernate.annotations.ColumnDefault(value = "1")
    @jakarta.persistence.Column(name = "status", nullable = false)
    @jakarta.persistence.Convert(converter = io.github.jonaskahn.app.entities.converter.StatusConverter.class)
    @org.jetbrains.annotations.Nullable()
    private io.github.jonaskahn.app.entities.enums.Status status = io.github.jonaskahn.app.entities.enums.Status.ACTIVATED;
    
    public User() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getUsername() {
        return null;
    }
    
    public void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Long getPreferredUsername() {
        return null;
    }
    
    public void setPreferredUsername(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getEmail() {
        return null;
    }
    
    public void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getFullName() {
        return null;
    }
    
    public void setFullName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getPassword() {
        return null;
    }
    
    public void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public io.github.jonaskahn.app.entities.enums.Status getStatus() {
        return null;
    }
    
    public void setStatus(@org.jetbrains.annotations.Nullable()
    io.github.jonaskahn.app.entities.enums.Status p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}