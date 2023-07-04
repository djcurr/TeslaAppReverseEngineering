package en;

import com.google.firebase.perf.session.SessionManager;

/* loaded from: classes2.dex */
public final class g implements tw.e<SessionManager> {

    /* renamed from: a  reason: collision with root package name */
    private final a f25214a;

    public g(a aVar) {
        this.f25214a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) tw.h.c(aVar.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public SessionManager get() {
        return c(this.f25214a);
    }
}