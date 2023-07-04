package en;

/* loaded from: classes2.dex */
public final class d implements tw.e<tm.e> {

    /* renamed from: a  reason: collision with root package name */
    private final a f25211a;

    public d(a aVar) {
        this.f25211a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static tm.e c(a aVar) {
        return (tm.e) tw.h.c(aVar.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public tm.e get() {
        return c(this.f25211a);
    }
}