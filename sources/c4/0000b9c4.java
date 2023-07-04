package v8;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile SecureRandom f54368a;

    static {
        "0123456789ABCDEF".toCharArray();
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    public static SecureRandom b() {
        if (f54368a != null) {
            return f54368a;
        }
        synchronized (b.class) {
            if (f54368a == null) {
                f54368a = new SecureRandom();
            }
        }
        return f54368a;
    }

    public static byte[] c(byte b11) {
        return new byte[]{b11};
    }

    public static byte[] d(char c11, char c12) {
        return new byte[]{(byte) (c11 & 255), (byte) (c12 & 255)};
    }

    public static byte[] e(long j11) {
        return new byte[]{(byte) j11, (byte) (j11 >> 8), (byte) (j11 >> 16), (byte) (j11 >> 24), (byte) (j11 >> 32), (byte) (j11 >> 40), (byte) (j11 >> 48), (byte) (j11 >> 56)};
    }

    public static byte[] f(short s11) {
        return new byte[]{(byte) s11, (byte) (s11 >> 8)};
    }

    public static byte[] g(byte[]... bArr) {
        int i11 = 0;
        for (byte[] bArr2 : bArr) {
            i11 += bArr2.length;
        }
        byte[] bArr3 = null;
        int i12 = 0;
        for (byte[] bArr4 : bArr) {
            if (bArr3 == null) {
                bArr3 = Arrays.copyOf(bArr4, i11);
                i12 = bArr4.length;
            } else {
                System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
                i12 += bArr4.length;
            }
        }
        return bArr3;
    }

    public static byte[] h() {
        byte[] bArr = new byte[2];
        b().nextBytes(bArr);
        return bArr;
    }

    public static byte[] i() {
        byte[] bArr = new byte[4];
        b().nextBytes(bArr);
        return bArr;
    }
}