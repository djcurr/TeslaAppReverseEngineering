package t1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class l0 {
    public static final boolean a(float[] isIdentity) {
        kotlin.jvm.internal.s.g(isIdentity, "$this$isIdentity");
        int i11 = 0;
        while (i11 < 4) {
            int i12 = i11 + 1;
            int i13 = 0;
            while (i13 < 4) {
                int i14 = i13 + 1;
                if (!(isIdentity[(i11 * 4) + i13] == (i11 == i13 ? 1.0f : BitmapDescriptorFactory.HUE_RED))) {
                    return false;
                }
                i13 = i14;
            }
            i11 = i12;
        }
        return true;
    }
}