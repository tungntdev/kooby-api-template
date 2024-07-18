package io.github.jonaskahn.app.controller;

@io.jooby.annotation.Path(value = {"/"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lio/github/jonaskahn/app/controller/HealthController;", "", "()V", "up", "", "backend"})
public final class HealthController {
    
    public HealthController() {
        super();
    }
    
    @io.swagger.v3.oas.annotations.Operation(summary = "Health Check Endpoints")
    @io.jooby.annotation.GET()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String up() {
        return null;
    }
}