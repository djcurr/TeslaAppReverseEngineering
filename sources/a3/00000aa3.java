package atd.i0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {
    public static byte[] a(byte[] bArr, int i11, String str, String str2, String str3) {
        byte[] a11 = a(1);
        byte[] a12 = a(str);
        byte[] a13 = a(str2);
        byte[] a14 = a(str3);
        byte[] a15 = a(i11);
        byte[] bArr2 = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(a11);
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(a12);
            byteArrayOutputStream.write(a13);
            byteArrayOutputStream.write(a14);
            byteArrayOutputStream.write(a15);
            byteArrayOutputStream.write(bArr2);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(atd.s0.a.a(-796599133203008L));
                messageDigest.update(byteArrayOutputStream.toByteArray());
                return Arrays.copyOf(messageDigest.digest(), i11 / 8);
            } catch (NoSuchAlgorithmException e11) {
                throw atd.y.c.CRYPTO_FAILURE.a(e11);
            }
        } catch (IOException e12) {
            throw atd.y.c.CRYPTO_FAILURE.a(e12);
        }
    }

    private static byte[] a(String str) {
        if (str == null) {
            str = atd.s0.a.a(-796633492941376L);
        }
        return ByteBuffer.allocate(str.length() + 4).putInt(str.length()).put(str.getBytes(com.adyen.threeds2.internal.b.f9630a)).array();
    }

    private static byte[] a(int i11) {
        return ByteBuffer.allocate(4).putInt(i11).array();
    }
}