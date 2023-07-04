package dl;

import com.google.common.base.u;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: dl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0461a extends OutputStream {
        C0461a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            u.o(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            u.o(bArr);
        }
    }

    static {
        new C0461a();
    }

    private static byte[] a(Queue<byte[]> queue, int i11) {
        byte[] bArr = new byte[i11];
        int i12 = i11;
        while (i12 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i12, remove.length);
            System.arraycopy(remove, 0, bArr, i11 - i12, min);
            i12 -= min;
        }
        return bArr;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        u.o(inputStream);
        u.o(outputStream);
        byte[] c11 = c();
        long j11 = 0;
        while (true) {
            int read = inputStream.read(c11);
            if (read == -1) {
                return j11;
            }
            outputStream.write(c11, 0, read);
            j11 += read;
        }
    }

    static byte[] c() {
        return new byte[PKIFailureInfo.certRevoked];
    }

    public static byte[] d(InputStream inputStream) {
        u.o(inputStream);
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue<byte[]> queue, int i11) {
        int i12 = PKIFailureInfo.certRevoked;
        while (i11 < 2147483639) {
            int min = Math.min(i12, 2147483639 - i11);
            byte[] bArr = new byte[min];
            queue.add(bArr);
            int i13 = 0;
            while (i13 < min) {
                int read = inputStream.read(bArr, i13, min - i13);
                if (read == -1) {
                    return a(queue, i11);
                }
                i13 += read;
                i11 += read;
            }
            i12 = el.a.g(i12, 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}