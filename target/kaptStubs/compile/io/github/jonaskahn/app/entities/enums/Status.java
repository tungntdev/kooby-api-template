package io.github.jonaskahn.app.entities.enums;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lio/github/jonaskahn/app/entities/enums/Status;", "", "id", "", "description", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "()I", "INACTIVATED", "ACTIVATED", "LOCK", "DELETED", "Companion", "backend"})
public enum Status {
    /*public static final*/ INACTIVATED /* = new INACTIVATED(0, null) */,
    /*public static final*/ ACTIVATED /* = new ACTIVATED(0, null) */,
    /*public static final*/ LOCK /* = new LOCK(0, null) */,
    /*public static final*/ DELETED /* = new DELETED(0, null) */;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.Integer, io.github.jonaskahn.app.entities.enums.Status> valuesAsMap = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.github.jonaskahn.app.entities.enums.Status.Companion Companion = null;
    
    Status(int id, java.lang.String description) {
    }
    
    @com.fasterxml.jackson.annotation.JsonValue()
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<io.github.jonaskahn.app.entities.enums.Status> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/github/jonaskahn/app/entities/enums/Status$Companion;", "", "()V", "valuesAsMap", "", "", "Lio/github/jonaskahn/app/entities/enums/Status;", "of", "id", "backend"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.github.jonaskahn.app.entities.enums.Status of(int id) {
            return null;
        }
    }
}