package f2;

/* loaded from: classes.dex */
public final class s0 {
    public static final long a(float f11, float f12) {
        return r0.a((Float.floatToIntBits(f12) & 4294967295L) | (Float.floatToIntBits(f11) << 32));
    }

    public static final long b(long j11, long j12) {
        return s1.m.a(s1.l.i(j11) * r0.b(j12), s1.l.g(j11) * r0.c(j12));
    }
}