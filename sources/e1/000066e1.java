package e2;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final d[] f24527a;

    public a(int i11, int i12) {
        d[] dVarArr = new d[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            dVarArr[i13] = new d(i12);
        }
        this.f24527a = dVarArr;
    }

    public final float a(int i11, int i12) {
        return this.f24527a[i11].a(i12);
    }

    public final d b(int i11) {
        return this.f24527a[i11];
    }

    public final void c(int i11, int i12, float f11) {
        this.f24527a[i11].c(i12, f11);
    }
}