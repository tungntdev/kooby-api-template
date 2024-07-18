package io.github.jonaskahn.assistant;

@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.annotation.JsonPropertyOrder(value = {"status", "timestamp", "payload"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lio/github/jonaskahn/assistant/Response;", "T", "", "status", "", "payload", "(ILjava/lang/Object;)V", "getPayload", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStatus", "()I", "Companion", "backend"})
public final class Response<T extends java.lang.Object> {
    private final int status = 0;
    @org.jetbrains.annotations.Nullable()
    private final T payload = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.github.jonaskahn.assistant.Response.Companion Companion = null;
    
    public Response(int status, @org.jetbrains.annotations.Nullable()
    T payload) {
        super();
    }
    
    public final int getStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getPayload() {
        return null;
    }
    
    public Response() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005H\u0002J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007\"\u0004\b\u0001\u0010\u00052\u0006\u0010\r\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lio/github/jonaskahn/assistant/Response$Companion;", "", "()V", "builder", "Lio/github/jonaskahn/assistant/Response$Companion$ResponseBuilder;", "T", "fail", "Lio/github/jonaskahn/assistant/Response;", "", "message", "code", "Lio/jooby/StatusCode;", "ok", "payload", "(Ljava/lang/Object;)Lio/github/jonaskahn/assistant/Response;", "ResponseBuilder", "backend"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final <T extends java.lang.Object>io.github.jonaskahn.assistant.Response.Companion.ResponseBuilder<T> builder() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>io.github.jonaskahn.assistant.Response<T> ok(T payload) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.github.jonaskahn.assistant.Response<java.lang.String> fail(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        io.jooby.StatusCode code) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0001X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/github/jonaskahn/assistant/Response$Companion$ResponseBuilder;", "T", "", "()V", "payload", "Ljava/lang/Object;", "status", "", "build", "Lio/github/jonaskahn/assistant/Response;", "(Ljava/lang/Object;)Lio/github/jonaskahn/assistant/Response$Companion$ResponseBuilder;", "toString", "", "backend"})
        public static final class ResponseBuilder<T extends java.lang.Object> {
            private int status = 0;
            @org.jetbrains.annotations.Nullable()
            private T payload;
            
            public ResponseBuilder() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.github.jonaskahn.assistant.Response.Companion.ResponseBuilder<T> status(int status) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.github.jonaskahn.assistant.Response.Companion.ResponseBuilder<T> payload(T payload) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.github.jonaskahn.assistant.Response<T> build() {
                return null;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
}