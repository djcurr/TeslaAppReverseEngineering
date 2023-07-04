package k0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class x {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int i12;
        float f21 = BitmapDescriptorFactory.HUE_RED;
        int i13 = 0;
        float f22 = 0.0f;
        while (true) {
            float f23 = 1.0f;
            if (i13 < i11) {
                int i14 = i13 + 1;
                float f24 = i13 / i11;
                float f25 = 1.0f;
                while (true) {
                    f11 = 2.0f;
                    f12 = ((f25 - f21) / 2.0f) + f21;
                    f13 = f23 - f12;
                    f14 = f12 * 3.0f * f13;
                    f15 = f12 * f12 * f12;
                    float f26 = (((f13 * 0.175f) + (f12 * 0.35000002f)) * f14) + f15;
                    if (Math.abs(f26 - f24) < 1.0E-5d) {
                        break;
                    }
                    int i15 = i14;
                    if (f26 > f24) {
                        f25 = f12;
                    } else {
                        f21 = f12;
                    }
                    i14 = i15;
                    f23 = 1.0f;
                }
                fArr[i13] = (f14 * ((f13 * 0.5f) + f12)) + f15;
                float f27 = f23;
                while (true) {
                    f16 = ((f27 - f22) / f11) + f22;
                    f17 = f23 - f16;
                    f18 = f16 * 3.0f * f17;
                    f19 = f16 * f16 * f16;
                    float f28 = (((f17 * 0.5f) + f16) * f18) + f19;
                    i12 = i14;
                    if (Math.abs(f28 - f24) < 1.0E-5d) {
                        break;
                    }
                    if (f28 > f24) {
                        f27 = f16;
                    } else {
                        f22 = f16;
                    }
                    i14 = i12;
                    f23 = 1.0f;
                    f11 = 2.0f;
                }
                fArr2[i13] = (f18 * ((f17 * 0.175f) + (f16 * 0.35000002f))) + f19;
                i13 = i12;
            } else {
                fArr2[i11] = 1.0f;
                fArr[i11] = fArr2[i11];
                return;
            }
        }
    }
}