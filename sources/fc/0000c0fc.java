package y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t implements z {

    /* renamed from: a  reason: collision with root package name */
    public static final t f58662a = new t();

    private t() {
    }

    @Override // y0.z
    public long a(long j11, float f11, c1.i iVar, int i11) {
        long b11;
        l a11 = h0.f58131a.a(iVar, 6);
        if (x2.g.e(f11, x2.g.f(0)) <= 0 || a11.o()) {
            return j11;
        }
        b11 = a0.b(j11, f11, iVar, (i11 & 112) | (i11 & 14));
        return t1.c0.e(b11, j11);
    }
}