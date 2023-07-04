package h0;

import android.os.Build;
import androidx.camera.core.impl.d1;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class e implements d1 {
    private static boolean b() {
        return "Fairphone".equalsIgnoreCase(Build.MANUFACTURER) && "FP2".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return b();
    }

    public int a(boolean z11) {
        if (b() && z11) {
            return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
        }
        return 0;
    }
}