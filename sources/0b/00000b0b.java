package atd.r0;

import java.nio.charset.Charset;
import java.util.Random;

/* loaded from: classes.dex */
public final class g {
    static {
        atd.s0.a.a(-840373439883840L);
    }

    public static String a(String str) {
        a a11 = a.a();
        Charset b11 = a11.b();
        String[] split = a11.c(str).split(atd.s0.a.a(-840382029818432L));
        return new String(a(a11.c(split[0]).getBytes(b11), a11.c(split[1]).getBytes(b11)), b11);
    }

    public static String b(String str) {
        a a11 = a.a();
        byte[] bytes = str.getBytes(a11.b());
        byte[] a12 = a(bytes.length);
        byte[] a13 = a(bytes, a12);
        String d11 = a11.d(a12);
        String d12 = a11.d(a13);
        return a11.d(d11 + atd.s0.a.a(-840356260014656L) + d12);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 % bArr2.length]);
        }
        return bArr3;
    }

    private static byte[] a(int i11) {
        byte[] bArr = new byte[i11];
        new Random(System.currentTimeMillis()).nextBytes(bArr);
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (Math.abs((int) bArr[i12]) % 127);
        }
        return bArr;
    }
}