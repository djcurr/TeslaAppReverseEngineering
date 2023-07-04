package s1;

/* loaded from: classes.dex */
public final class g {
    public static final long a(float f11, float f12) {
        return f.g((Float.floatToIntBits(f12) & 4294967295L) | (Float.floatToIntBits(f11) << 32));
    }

    public static final boolean b(long j11) {
        float l11 = f.l(j11);
        if ((Float.isInfinite(l11) || Float.isNaN(l11)) ? false : true) {
            float m11 = f.m(j11);
            if ((Float.isInfinite(m11) || Float.isNaN(m11)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(long j11) {
        return j11 != f.f49950b.b();
    }

    public static final long d(long j11, long j12, float f11) {
        return a(y2.a.a(f.l(j11), f.l(j12), f11), y2.a.a(f.m(j11), f.m(j12), f11));
    }
}