package x2;

/* loaded from: classes.dex */
public final class h {
    public static final long a(float f11, float f12) {
        return i.c((Float.floatToIntBits(f12) & 4294967295L) | (Float.floatToIntBits(f11) << 32));
    }

    public static final long b(float f11, float f12) {
        return j.c((Float.floatToIntBits(f12) & 4294967295L) | (Float.floatToIntBits(f11) << 32));
    }
}