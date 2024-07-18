package io.github.jonaskahn.assistant.query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lio/github/jonaskahn/assistant/query/QueryExecutor;", "T", "", "count", "", "first", "()Ljava/lang/Object;", "getFirstResult", "getListResult", "", "getSingleResult", "list", "unique", "backend"})
public abstract interface QueryExecutor<T extends java.lang.Object> {
    
    public abstract long count();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<T> list();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<T> getListResult();
    
    @org.jetbrains.annotations.Nullable()
    public abstract T unique();
    
    @org.jetbrains.annotations.Nullable()
    public abstract T first();
    
    @org.jetbrains.annotations.Nullable()
    public abstract T getSingleResult();
    
    @org.jetbrains.annotations.Nullable()
    public abstract T getFirstResult();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static <T extends java.lang.Object>java.util.List<T> getListResult(@org.jetbrains.annotations.NotNull()
        io.github.jonaskahn.assistant.query.QueryExecutor<T> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static <T extends java.lang.Object>T getSingleResult(@org.jetbrains.annotations.NotNull()
        io.github.jonaskahn.assistant.query.QueryExecutor<T> $this) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static <T extends java.lang.Object>T getFirstResult(@org.jetbrains.annotations.NotNull()
        io.github.jonaskahn.assistant.query.QueryExecutor<T> $this) {
            return null;
        }
    }
}