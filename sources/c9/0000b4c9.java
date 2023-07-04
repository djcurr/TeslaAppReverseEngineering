package t70;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.util.io.StreamOverflowException;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static int f51755a = 4096;

    public static void a(InputStream inputStream, OutputStream outputStream) {
        int i11 = f51755a;
        byte[] bArr = new byte[i11];
        while (true) {
            int read = inputStream.read(bArr, 0, i11);
            if (read < 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static long b(InputStream inputStream, long j11, OutputStream outputStream) {
        int i11 = f51755a;
        byte[] bArr = new byte[i11];
        long j12 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, i11);
            if (read < 0) {
                return j12;
            }
            long j13 = read;
            if (j11 - j12 < j13) {
                throw new StreamOverflowException("Data Overflow");
            }
            j12 += j13;
            outputStream.write(bArr, 0, read);
        }
    }

    public static byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] d(InputStream inputStream, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b(inputStream, i11, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int e(InputStream inputStream, byte[] bArr) {
        return f(inputStream, bArr, 0, bArr.length);
    }

    public static int f(InputStream inputStream, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int read = inputStream.read(bArr, i11 + i13, i12 - i13);
            if (read < 0) {
                break;
            }
            i13 += read;
        }
        return i13;
    }
}