package en;

/* loaded from: classes2.dex */
public final class c implements tw.e<com.google.firebase.d> {

    /* renamed from: a  reason: collision with root package name */
    private final a f25210a;

    public c(a aVar) {
        this.f25210a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static com.google.firebase.d c(a aVar) {
        return (com.google.firebase.d) tw.h.c(aVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public com.google.firebase.d get() {
        return c(this.f25210a);
    }
}