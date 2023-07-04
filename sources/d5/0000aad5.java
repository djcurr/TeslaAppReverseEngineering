package pk;

/* loaded from: classes3.dex */
public final class a {
    public static float a(float f11, float f12, float f13, float f14) {
        return (float) Math.hypot(f13 - f11, f14 - f12);
    }

    public static float b(float f11, float f12, float f13, float f14, float f15, float f16) {
        return d(a(f11, f12, f13, f14), a(f11, f12, f15, f14), a(f11, f12, f15, f16), a(f11, f12, f13, f16));
    }

    public static float c(float f11, float f12, float f13) {
        return ((1.0f - f13) * f11) + (f13 * f12);
    }

    private static float d(float f11, float f12, float f13, float f14) {
        return (f11 <= f12 || f11 <= f13 || f11 <= f14) ? (f12 <= f13 || f12 <= f14) ? f13 > f14 ? f13 : f14 : f12 : f11;
    }
}