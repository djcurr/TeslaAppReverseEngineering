package a0;

import androidx.camera.core.n0;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public final class b {
    public static int a(int i11, int i12, boolean z11) {
        int i13;
        if (z11) {
            i13 = ((i12 - i11) + 360) % 360;
        } else {
            i13 = (i12 + i11) % 360;
        }
        if (n0.g("CameraOrientationUtil")) {
            n0.a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11), Integer.valueOf(i13)));
        }
        return i13;
    }

    public static int b(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return 270;
                    }
                    throw new IllegalArgumentException("Unsupported surface rotation: " + i11);
                }
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            }
            return 90;
        }
        return 0;
    }
}