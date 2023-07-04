package s1;

/* loaded from: classes.dex */
public final class b {
    public static final long a(float f11, float f12) {
        return a.b((Float.floatToIntBits(f12) & 4294967295L) | (Float.floatToIntBits(f11) << 32));
    }

    public static /* synthetic */ long b(float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        return a(f11, f12);
    }
}