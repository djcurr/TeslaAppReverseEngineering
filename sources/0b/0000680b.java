package en;

/* loaded from: classes2.dex */
public final class e implements tw.e<sm.b<com.google.firebase.remoteconfig.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final a f25212a;

    public e(a aVar) {
        this.f25212a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static sm.b<com.google.firebase.remoteconfig.c> c(a aVar) {
        return (sm.b) tw.h.c(aVar.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public sm.b<com.google.firebase.remoteconfig.c> get() {
        return c(this.f25212a);
    }
}