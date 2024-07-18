package io.github.jonaskahn.assistant.query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lio/github/jonaskahn/assistant/query/QueryBuilder;", "T", "", "with", "Lio/github/jonaskahn/assistant/query/TransformBuilder;", "query", "Ljakarta/persistence/Query;", "params", "", "", "backend"})
public abstract interface QueryBuilder<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.github.jonaskahn.assistant.query.TransformBuilder<T> with(@org.jetbrains.annotations.NotNull()
    jakarta.persistence.Query query, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.github.jonaskahn.assistant.query.TransformBuilder<T> with(@org.jetbrains.annotations.NotNull()
    jakarta.persistence.Query query);
}