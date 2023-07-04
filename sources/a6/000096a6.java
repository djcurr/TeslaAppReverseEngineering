package org.bouncycastle.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: org.bouncycastle.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0862a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T[] f43209a;

        /* renamed from: b  reason: collision with root package name */
        private int f43210b = 0;

        public C0862a(T[] tArr) {
            this.f43209a = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43210b < this.f43209a.length;
        }

        @Override // java.util.Iterator
        public T next() {
            int i11 = this.f43210b;
            T[] tArr = this.f43209a;
            if (i11 != tArr.length) {
                this.f43210b = i11 + 1;
                return tArr[i11];
            }
            throw new NoSuchElementException("Out of elements: " + this.f43210b);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static void A(char[] cArr, char c11) {
        Arrays.fill(cArr, c11);
    }

    public static void B(int[] iArr, int i11) {
        Arrays.fill(iArr, i11);
    }

    public static void C(long[] jArr, long j11) {
        Arrays.fill(jArr, j11);
    }

    public static void D(short[] sArr, short s11) {
        Arrays.fill(sArr, s11);
    }

    private static int E(int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 >= 0) {
            return i13;
        }
        StringBuffer stringBuffer = new StringBuffer(i11);
        stringBuffer.append(" > ");
        stringBuffer.append(i12);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int F(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ bArr[length];
        }
    }

    public static int G(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            return 0;
        }
        int i13 = i12 + 1;
        while (true) {
            i12--;
            if (i12 < 0) {
                return i13;
            }
            i13 = (i13 * 257) ^ bArr[i11 + i12];
        }
    }

    public static int H(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ cArr[length];
        }
    }

    public static int I(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ iArr[length];
        }
    }

    public static int J(int[] iArr, int i11, int i12) {
        if (iArr == null) {
            return 0;
        }
        int i13 = i12 + 1;
        while (true) {
            i12--;
            if (i12 < 0) {
                return i13;
            }
            i13 = (i13 * 257) ^ iArr[i11 + i12];
        }
    }

    public static int K(long[] jArr, int i11, int i12) {
        if (jArr == null) {
            return 0;
        }
        int i13 = i12 + 1;
        while (true) {
            i12--;
            if (i12 < 0) {
                return i13;
            }
            long j11 = jArr[i11 + i12];
            i13 = (((i13 * 257) ^ ((int) j11)) * 257) ^ ((int) (j11 >>> 32));
        }
    }

    public static int L(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ (sArr[length] & 255);
        }
    }

    public static int M(short[][] sArr) {
        int i11 = 0;
        for (int i12 = 0; i12 != sArr.length; i12++) {
            i11 = (i11 * 257) + L(sArr[i12]);
        }
        return i11;
    }

    public static int N(short[][][] sArr) {
        int i11 = 0;
        for (int i12 = 0; i12 != sArr.length; i12++) {
            i11 = (i11 * 257) + M(sArr[i12]);
        }
        return i11;
    }

    public static boolean O(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static byte[] P(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i11 = 0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i11];
            i11++;
        }
    }

    public static byte[] Q(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length - 1;
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[length];
            bArr[length] = b11;
            length--;
        }
        return bArr;
    }

    public static int[] R(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = iArr[length];
            iArr[length] = i12;
            length--;
        }
        return iArr;
    }

    public static boolean a(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            i13 |= bArr[i11 + i14];
        }
        return i13 == 0;
    }

    public static boolean b(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15 = i12 - i11;
        if (i15 != i14 - i13) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (bArr[i11 + i16] != bArr2[i13 + i16]) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean f(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static void g(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public static byte[] h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || bArr2.length != bArr.length) {
            return h(bArr);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    public static char[] j(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static int[] k(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static long[] l(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static long[] m(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return l(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    public static short[] n(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static boolean[] o(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static byte[] p(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return h(bArr2);
        }
        if (bArr2 == null) {
            return h(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] q(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return p(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return p(bArr, bArr3);
        }
        if (bArr3 == null) {
            return p(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length + 0;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static byte[] r(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            return q(bArr2, bArr3, bArr4);
        }
        if (bArr2 == null) {
            return q(bArr, bArr3, bArr4);
        }
        if (bArr3 == null) {
            return q(bArr, bArr2, bArr4);
        }
        if (bArr4 == null) {
            return q(bArr, bArr2, bArr3);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length = bArr.length + 0;
        System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr5, length2, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, length2 + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static short[] s(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            return n(sArr2);
        }
        if (sArr2 == null) {
            return n(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static boolean t(int i11, byte[] bArr, int i12, byte[] bArr2, int i13) {
        Objects.requireNonNull(bArr, "'a' cannot be null");
        Objects.requireNonNull(bArr2, "'b' cannot be null");
        if (i11 >= 0) {
            if (i12 <= bArr.length - i11) {
                if (i13 <= bArr2.length - i11) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < i11; i15++) {
                        i14 |= bArr[i12 + i15] ^ bArr2[i13 + i15];
                    }
                    return i14 == 0;
                }
                throw new IndexOutOfBoundsException("'bOff' value invalid for specified length");
            }
            throw new IndexOutOfBoundsException("'aOff' value invalid for specified length");
        }
        throw new IllegalArgumentException("'len' cannot be negative");
    }

    public static boolean u(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr == bArr2) {
            return true;
        }
        int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
        int length2 = bArr.length ^ bArr2.length;
        for (int i11 = 0; i11 != length; i11++) {
            length2 |= bArr[i11] ^ bArr2[i11];
        }
        while (length < bArr2.length) {
            length2 |= bArr2[length] ^ (~bArr2[length]);
            length++;
        }
        return length2 == 0;
    }

    public static byte[] v(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i11));
        return bArr2;
    }

    public static byte[] w(byte[] bArr, int i11, int i12) {
        int E = E(i11, i12);
        byte[] bArr2 = new byte[E];
        System.arraycopy(bArr, i11, bArr2, 0, Math.min(bArr.length - i11, E));
        return bArr2;
    }

    public static int[] x(int[] iArr, int i11, int i12) {
        int E = E(i11, i12);
        int[] iArr2 = new int[E];
        System.arraycopy(iArr, i11, iArr2, 0, Math.min(iArr.length - i11, E));
        return iArr2;
    }

    public static void y(byte[] bArr, byte b11) {
        Arrays.fill(bArr, b11);
    }

    public static void z(byte[] bArr, int i11, int i12, byte b11) {
        Arrays.fill(bArr, i11, i12, b11);
    }
}