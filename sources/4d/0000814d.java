package l0;

/* loaded from: classes.dex */
public interface d0 extends i<Float> {

    /* loaded from: classes.dex */
    public static final class a {
        public static float a(d0 d0Var, float f11, float f12, float f13) {
            kotlin.jvm.internal.s.g(d0Var, "this");
            return d0Var.d(d0Var.e(f11, f12, f13), f11, f12, f13);
        }

        public static <V extends p> l1<V> b(d0 d0Var, d1<Float, V> converter) {
            kotlin.jvm.internal.s.g(d0Var, "this");
            kotlin.jvm.internal.s.g(converter, "converter");
            return new l1<>(d0Var);
        }
    }

    float b(float f11, float f12, float f13);

    float c(long j11, float f11, float f12, float f13);

    float d(long j11, float f11, float f12, float f13);

    long e(float f11, float f12, float f13);
}