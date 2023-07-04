package s1;

/* loaded from: classes.dex */
public final class c {
    public static final String a(float f11, int i11) {
        int max = Math.max(i11, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f12 = f11 * pow;
        int i12 = (int) f12;
        if (f12 - i12 >= 0.5f) {
            i12++;
        }
        float f13 = i12 / pow;
        if (max > 0) {
            return String.valueOf(f13);
        }
        return String.valueOf((int) f13);
    }
}