package nq;

import com.nimbusds.jose.util.IntegerOverflowException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class e {
    public static int a(int i11) {
        return i11 * 8;
    }

    public static int b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return a(bArr.length);
    }

    public static int c(int i11) {
        return i11 / 8;
    }

    public static byte[] d(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            throw new IllegalStateException(e11.getMessage(), e11);
        }
    }

    public static int e(int i11) {
        long j11 = i11 * 8;
        int i12 = (int) j11;
        if (i12 == j11) {
            return i12;
        }
        throw new IntegerOverflowException();
    }

    public static int f(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return e(bArr.length);
    }

    public static byte[] g(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return bArr2;
    }
}