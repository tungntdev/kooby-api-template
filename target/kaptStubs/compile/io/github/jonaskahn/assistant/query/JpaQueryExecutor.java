package io.github.jonaskahn.assistant.query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u000f\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\fR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/github/jonaskahn/assistant/query/JpaQueryExecutor;", "T", "Lio/github/jonaskahn/assistant/query/QueryExecutor;", "()V", "query", "Lorg/hibernate/query/NativeQuery;", "", "target", "Ljava/lang/Class;", "count", "", "first", "()Ljava/lang/Object;", "list", "", "unique", "Companion", "Executor", "backend"})
public final class JpaQueryExecutor<T extends java.lang.Object> implements io.github.jonaskahn.assistant.query.QueryExecutor<T> {
    @org.jetbrains.annotations.Nullable()
    private org.hibernate.query.NativeQuery<java.lang.Object> query;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Class<T> target;
    private static final com.fasterxml.jackson.databind.json.JsonMapper objectMapper = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.github.jonaskahn.assistant.query.JpaQueryExecutor.Companion Companion = null;
    
    private JpaQueryExecutor() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<T> list() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public T unique() {
        return null;
    }
    
    @java.lang.Override()
    public long count() {
        return 0L;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public T first() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public T getFirstResult() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<T> getListResult() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public T getSingleResult() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bJ5\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u001a\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\f0\u000e\"\u0006\u0012\u0002\b\u00030\fH\u0002\u00a2\u0006\u0002\u0010\u000fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/github/jonaskahn/assistant/query/JpaQueryExecutor$Companion;", "", "()V", "objectMapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "kotlin.jvm.PlatformType", "builder", "Lio/github/jonaskahn/assistant/query/JpaQueryExecutor$Executor;", "T", "getCollectionType", "Lcom/fasterxml/jackson/databind/JavaType;", "collectionClass", "Ljava/lang/Class;", "elementClasses", "", "(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;", "backend"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>io.github.jonaskahn.assistant.query.JpaQueryExecutor.Executor<T> builder() {
            return null;
        }
        
        private final com.fasterxml.jackson.databind.JavaType getCollectionType(java.lang.Class<?> collectionClass, java.lang.Class<?>... elementClasses) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/github/jonaskahn/assistant/query/JpaQueryExecutor$Executor;", "T", "Lio/github/jonaskahn/assistant/query/QueryBuilder;", "Lio/github/jonaskahn/assistant/query/TransformBuilder;", "()V", "executor", "Lio/github/jonaskahn/assistant/query/JpaQueryExecutor;", "map", "clazz", "Ljava/lang/Class;", "with", "query", "Ljakarta/persistence/Query;", "params", "", "", "", "backend"})
    public static final class Executor<T extends java.lang.Object> implements io.github.jonaskahn.assistant.query.QueryBuilder<T>, io.github.jonaskahn.assistant.query.TransformBuilder<T> {
        @org.jetbrains.annotations.NotNull()
        private final io.github.jonaskahn.assistant.query.JpaQueryExecutor<T> executor = null;
        
        public Executor() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public io.github.jonaskahn.assistant.query.TransformBuilder<T> with(@org.jetbrains.annotations.NotNull()
        jakarta.persistence.Query query, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> params) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public io.github.jonaskahn.assistant.query.TransformBuilder<T> with(@org.jetbrains.annotations.NotNull()
        jakarta.persistence.Query query) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public io.github.jonaskahn.assistant.query.JpaQueryExecutor<T> map(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> clazz) {
            return null;
        }
    }
}