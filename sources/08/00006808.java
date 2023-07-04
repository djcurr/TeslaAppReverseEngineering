package en;

/* loaded from: classes2.dex */
public final class b implements tw.e<com.google.firebase.perf.config.a> {

    /* renamed from: a  reason: collision with root package name */
    private final a f25209a;

    public b(a aVar) {
        this.f25209a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static com.google.firebase.perf.config.a c(a aVar) {
        return (com.google.firebase.perf.config.a) tw.h.c(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public com.google.firebase.perf.config.a get() {
        return c(this.f25209a);
    }
}