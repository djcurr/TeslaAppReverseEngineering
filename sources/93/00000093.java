package af;

import java.io.UnsupportedEncodingException;
import md.k;

/* loaded from: classes3.dex */
public class e {
    public static byte[] a(String str) {
        k.g(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("ASCII not found!", e11);
        }
    }

    public static boolean b(byte[] bArr, byte[] bArr2, int i11) {
        k.g(bArr);
        k.g(bArr2);
        if (bArr2.length + i11 > bArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            if (bArr[i11 + i12] != bArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 0);
    }
}