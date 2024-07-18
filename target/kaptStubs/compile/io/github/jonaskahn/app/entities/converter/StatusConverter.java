package io.github.jonaskahn.app.entities.converter;

@jakarta.persistence.Converter(autoApply = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016\u00a8\u0006\n"}, d2 = {"Lio/github/jonaskahn/app/entities/converter/StatusConverter;", "Ljakarta/persistence/AttributeConverter;", "Lio/github/jonaskahn/app/entities/enums/Status;", "", "()V", "convertToDatabaseColumn", "status", "(Lio/github/jonaskahn/app/entities/enums/Status;)Ljava/lang/Integer;", "convertToEntityAttribute", "code", "backend"})
public final class StatusConverter implements jakarta.persistence.AttributeConverter<io.github.jonaskahn.app.entities.enums.Status, java.lang.Integer> {
    
    public StatusConverter() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer convertToDatabaseColumn(@org.jetbrains.annotations.Nullable()
    io.github.jonaskahn.app.entities.enums.Status status) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public io.github.jonaskahn.app.entities.enums.Status convertToEntityAttribute(int code) {
        return null;
    }
}