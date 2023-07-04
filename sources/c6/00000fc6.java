package c8;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f8925a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f8926b;

    public d(float[] fArr, int[] iArr) {
        this.f8925a = fArr;
        this.f8926b = iArr;
    }

    public int[] a() {
        return this.f8926b;
    }

    public float[] b() {
        return this.f8925a;
    }

    public int c() {
        return this.f8926b.length;
    }

    public void d(d dVar, d dVar2, float f11) {
        if (dVar.f8926b.length == dVar2.f8926b.length) {
            for (int i11 = 0; i11 < dVar.f8926b.length; i11++) {
                this.f8925a[i11] = h8.g.k(dVar.f8925a[i11], dVar2.f8925a[i11], f11);
                this.f8926b[i11] = h8.b.c(f11, dVar.f8926b[i11], dVar2.f8926b[i11]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f8926b.length + " vs " + dVar2.f8926b.length + ")");
    }
}