package cw;

/* loaded from: classes6.dex */
public final class k implements tw.e<androidx.activity.result.d<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final h f23159a;

    public k(h hVar) {
        this.f23159a = hVar;
    }

    public static k a(h hVar) {
        return new k(hVar);
    }

    public static androidx.activity.result.d<String> c(h hVar) {
        return (androidx.activity.result.d) tw.h.e(hVar.a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public androidx.activity.result.d<String> get() {
        return c(this.f23159a);
    }
}