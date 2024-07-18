package io.github.jonaskahn.assistant.query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lio/github/jonaskahn/assistant/query/TransformBuilder;", "T", "", "map", "Lio/github/jonaskahn/assistant/query/QueryExecutor;", "clazz", "Ljava/lang/Class;", "backend"})
public abstract interface TransformBuilder<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.github.jonaskahn.assistant.query.QueryExecutor<T> map(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz);
}