package md;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class a {
    public static long a(InputStream inputStream, OutputStream outputStream) {
        k.g(inputStream);
        k.g(outputStream);
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j11;
            }
            outputStream.write(bArr, 0, read);
            j11 += read;
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i11, int i12) {
        k.g(inputStream);
        k.g(bArr);
        if (i12 >= 0) {
            int i13 = 0;
            while (i13 < i12) {
                int read = inputStream.read(bArr, i11 + i13, i12 - i13);
                if (read == -1) {
                    break;
                }
                i13 += read;
            }
            return i13;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}