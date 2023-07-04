package x2;

/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static final class a {
        public static int a(d dVar, long j11) {
            int c11;
            kotlin.jvm.internal.s.g(dVar, "this");
            c11 = j00.c.c(dVar.M(j11));
            return c11;
        }

        public static int b(d dVar, float f11) {
            int c11;
            kotlin.jvm.internal.s.g(dVar, "this");
            float i02 = dVar.i0(f11);
            if (Float.isInfinite(i02)) {
                return Integer.MAX_VALUE;
            }
            c11 = j00.c.c(i02);
            return c11;
        }

        public static float c(d dVar, int i11) {
            kotlin.jvm.internal.s.g(dVar, "this");
            return g.f(i11 / dVar.getDensity());
        }

        public static float d(d dVar, long j11) {
            kotlin.jvm.internal.s.g(dVar, "this");
            if (t.g(r.g(j11), t.f56961b.b())) {
                return r.h(j11) * dVar.c0() * dVar.getDensity();
            }
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }

        public static float e(d dVar, float f11) {
            kotlin.jvm.internal.s.g(dVar, "this");
            return f11 * dVar.getDensity();
        }

        public static long f(d dVar, long j11) {
            kotlin.jvm.internal.s.g(dVar, "this");
            if (j11 != j.f56944a.a()) {
                return s1.m.a(dVar.i0(j.f(j11)), dVar.i0(j.e(j11)));
            }
            return s1.l.f49969b.a();
        }
    }

    int G(float f11);

    float M(long j11);

    float b0(int i11);

    float c0();

    float getDensity();

    float i0(float f11);

    int l0(long j11);

    long p0(long j11);
}