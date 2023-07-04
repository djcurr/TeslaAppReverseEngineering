package pl;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g {
    public static byte[] a(byte[]... bArr) {
        int i11 = 0;
        for (byte[] bArr2 : bArr) {
            if (i11 <= Integer.MAX_VALUE - bArr2.length) {
                i11 += bArr2.length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i11];
        int i12 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
            i12 += bArr4.length;
        }
        return bArr3;
    }

    public static final boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i11 |= bArr[i12] ^ bArr2[i12];
        }
        return i11 == 0;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11) {
        if (i11 < 0 || byteBuffer2.remaining() < i11 || byteBuffer3.remaining() < i11 || byteBuffer.remaining() < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] d(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        if (i13 >= 0 && bArr.length - i13 >= i11 && bArr2.length - i13 >= i12) {
            byte[] bArr3 = new byte[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                bArr3[i14] = (byte) (bArr[i14 + i11] ^ bArr2[i14 + i12]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return d(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] f(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= bArr2.length) {
            int length = bArr.length - bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                int i12 = length + i11;
                copyOf[i12] = (byte) (copyOf[i12] ^ bArr2[i11]);
            }
            return copyOf;
        }
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    }
}