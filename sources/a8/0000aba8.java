package pv;

/* loaded from: classes2.dex */
public final class e implements tw.e<x20.e<z>> {

    /* renamed from: a  reason: collision with root package name */
    private final c f46934a;

    public e(c cVar) {
        this.f46934a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static x20.e<z> c(c cVar) {
        return (x20.e) tw.h.e(cVar.b());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public x20.e<z> get() {
        return c(this.f46934a);
    }
}