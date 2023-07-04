package x2;

/* loaded from: classes.dex */
public final class s {
    public static final long a(float f11, long j11) {
        return i(j11, f11);
    }

    public static final void b(long j11) {
        if (!(!g(j11))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    public static final void c(long j11, long j12) {
        if ((g(j11) || g(j12)) ? false : true) {
            if (t.g(r.g(j11), r.g(j12))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) t.i(r.g(j11))) + " and " + ((Object) t.i(r.g(j12)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    public static final long d(double d11) {
        return i(4294967296L, (float) d11);
    }

    public static final long e(float f11) {
        return i(4294967296L, f11);
    }

    public static final long f(int i11) {
        return i(4294967296L, i11);
    }

    public static final boolean g(long j11) {
        return r.f(j11) == 0;
    }

    public static final long h(long j11, long j12, float f11) {
        c(j11, j12);
        return i(r.f(j11), y2.a.a(r.h(j11), r.h(j12), f11));
    }

    public static final long i(long j11, float f11) {
        return r.c(j11 | (Float.floatToIntBits(f11) & 4294967295L));
    }
}