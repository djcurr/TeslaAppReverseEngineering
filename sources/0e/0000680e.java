package en;

/* loaded from: classes2.dex */
public final class h implements tw.e<sm.b<nh.g>> {

    /* renamed from: a  reason: collision with root package name */
    private final a f25215a;

    public h(a aVar) {
        this.f25215a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static sm.b<nh.g> c(a aVar) {
        return (sm.b) tw.h.c(aVar.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public sm.b<nh.g> get() {
        return c(this.f25215a);
    }
}