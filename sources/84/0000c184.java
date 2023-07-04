package y2;

import j00.c;

/* loaded from: classes.dex */
public final class a {
    public static final float a(float f11, float f12, float f13) {
        return ((1 - f13) * f11) + (f13 * f12);
    }

    public static final int b(int i11, int i12, float f11) {
        int b11;
        b11 = c.b((i12 - i11) * f11);
        return i11 + b11;
    }
}