package vq;

import android.content.Context;

/* loaded from: classes2.dex */
public class b {
    public static boolean a(Context context) {
        return androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") == 0;
    }

    public static void b(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[(bArr.length - i11) - 1];
            bArr[(bArr.length - i11) - 1] = b11;
        }
    }
}