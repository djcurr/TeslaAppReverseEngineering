package vo;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class a {
    public static float a(float f11, float f12, float f13, float f14) {
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        return (float) Math.sqrt((f15 * f15) + (f16 * f16));
    }

    public static float b(int i11, int i12, int i13, int i14) {
        int i15 = i11 - i13;
        int i16 = i12 - i14;
        return (float) Math.sqrt((i15 * i15) + (i16 * i16));
    }

    public static int c(float f11) {
        return (int) (f11 + (f11 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
    }

    public static int d(int[] iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        return i11;
    }
}