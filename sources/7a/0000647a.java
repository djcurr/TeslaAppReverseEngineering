package cw;

/* loaded from: classes6.dex */
public final class e implements tw.e<androidx.activity.result.d<String[]>> {

    /* renamed from: a  reason: collision with root package name */
    private final a f23153a;

    public e(a aVar) {
        this.f23153a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static androidx.activity.result.d<String[]> c(a aVar) {
        return (androidx.activity.result.d) tw.h.e(aVar.a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public androidx.activity.result.d<String[]> get() {
        return c(this.f23153a);
    }
}