package org.spongycastle.util;

import java.math.BigInteger;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class Arrays {

    /* loaded from: classes4.dex */
    public static class Iterator<T> implements java.util.Iterator<T> {
        private final T[] dataArray;
        private int position = 0;

        public Iterator(T[] tArr) {
            this.dataArray = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.dataArray.length;
        }

        @Override // java.util.Iterator
        public T next() {
            int i11 = this.position;
            T[] tArr = this.dataArray;
            if (i11 != tArr.length) {
                this.position = i11 + 1;
                return tArr[i11];
            }
            throw new NoSuchElementException("Out of elements: " + this.position);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    private Arrays() {
    }

    public static byte[] append(byte[] bArr, byte b11) {
        if (bArr == null) {
            return new byte[]{b11};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b11;
        return bArr2;
    }

    public static boolean areEqual(boolean[] zArr, boolean[] zArr2) {
        if (zArr == zArr2) {
            return true;
        }
        if (zArr == null || zArr2 == null || zArr.length != zArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 != zArr.length; i11++) {
            if (zArr[i11] != zArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int compareUnsigned(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int min = Math.min(bArr.length, bArr2.length);
        for (int i11 = 0; i11 < min; i11++) {
            int i12 = bArr[i11] & 255;
            int i13 = bArr2[i11] & 255;
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        return bArr.length > bArr2.length ? 1 : 0;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            if (bArr2 != null) {
                return clone(bArr2);
            }
            return clone(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean constantTimeAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i11 = 0;
        for (int i12 = 0; i12 != bArr.length; i12++) {
            i11 |= bArr[i12] ^ bArr2[i12];
        }
        return i11 == 0;
    }

    public static boolean contains(short[] sArr, short s11) {
        for (short s12 : sArr) {
            if (s12 == s11) {
                return true;
            }
        }
        return false;
    }

    public static byte[] copyOf(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        if (i11 < bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, i11);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        return bArr2;
    }

    public static byte[] copyOfRange(byte[] bArr, int i11, int i12) {
        int length = getLength(i11, i12);
        byte[] bArr2 = new byte[length];
        if (bArr.length - i11 < length) {
            System.arraycopy(bArr, i11, bArr2, 0, bArr.length - i11);
        } else {
            System.arraycopy(bArr, i11, bArr2, 0, length);
        }
        return bArr2;
    }

    public static void fill(byte[] bArr, byte b11) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr[i11] = b11;
        }
    }

    private static int getLength(int i11, int i12) {
        int i13 = i12 - i11;
        if (i13 >= 0) {
            return i13;
        }
        StringBuffer stringBuffer = new StringBuffer(i11);
        stringBuffer.append(" > ");
        stringBuffer.append(i12);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int hashCode(byte[] bArr) {
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

    public static byte[] prepend(byte[] bArr, byte b11) {
        if (bArr == null) {
            return new byte[]{b11};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b11;
        return bArr2;
    }

    public static byte[] reverse(byte[] bArr) {
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

    public static char[] clone(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static boolean contains(int[] iArr, int i11) {
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    public static void fill(char[] cArr, char c11) {
        for (int i11 = 0; i11 < cArr.length; i11++) {
            cArr[i11] = c11;
        }
    }

    public static int hashCode(byte[] bArr, int i11, int i12) {
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

    public static boolean areEqual(char[] cArr, char[] cArr2) {
        if (cArr == cArr2) {
            return true;
        }
        if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 != cArr.length; i11++) {
            if (cArr[i11] != cArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(char[] cArr) {
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

    public static int[] reverse(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int i11 = 0;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            iArr2[length] = iArr[i11];
            i11++;
        }
    }

    public static short[] append(short[] sArr, short s11) {
        if (sArr == null) {
            return new short[]{s11};
        }
        int length = sArr.length;
        short[] sArr2 = new short[length + 1];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        sArr2[length] = s11;
        return sArr2;
    }

    public static byte[] clone(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 != null && bArr2.length == bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            return bArr2;
        }
        return clone(bArr);
    }

    public static char[] copyOf(char[] cArr, int i11) {
        char[] cArr2 = new char[i11];
        if (i11 < cArr.length) {
            System.arraycopy(cArr, 0, cArr2, 0, i11);
        } else {
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        }
        return cArr2;
    }

    public static void fill(long[] jArr, long j11) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            jArr[i11] = j11;
        }
    }

    public static short[] prepend(short[] sArr, short s11) {
        if (sArr == null) {
            return new short[]{s11};
        }
        int length = sArr.length;
        short[] sArr2 = new short[length + 1];
        System.arraycopy(sArr, 0, sArr2, 1, length);
        sArr2[0] = s11;
        return sArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            if (bArr == null) {
                return concatenate(bArr2, bArr3);
            }
            if (bArr2 == null) {
                return concatenate(bArr, bArr3);
            }
            return concatenate(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static int[] copyOfRange(int[] iArr, int i11, int i12) {
        int length = getLength(i11, i12);
        int[] iArr2 = new int[length];
        if (iArr.length - i11 < length) {
            System.arraycopy(iArr, i11, iArr2, 0, iArr.length - i11);
        } else {
            System.arraycopy(iArr, i11, iArr2, 0, length);
        }
        return iArr2;
    }

    public static int hashCode(int[][] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 != iArr.length; i12++) {
            i11 = (i11 * 257) + hashCode(iArr[i12]);
        }
        return i11;
    }

    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 != bArr.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static void fill(short[] sArr, short s11) {
        for (int i11 = 0; i11 < sArr.length; i11++) {
            sArr[i11] = s11;
        }
    }

    public static byte[][] clone(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][] bArr2 = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr2[i11] = clone(bArr[i11]);
        }
        return bArr2;
    }

    public static int hashCode(int[] iArr) {
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

    public static int[] append(int[] iArr, int i11) {
        if (iArr == null) {
            return new int[]{i11};
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i11;
        return iArr2;
    }

    public static int[] copyOf(int[] iArr, int i11) {
        int[] iArr2 = new int[i11];
        if (i11 < iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, i11);
        } else {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }
        return iArr2;
    }

    public static void fill(int[] iArr, int i11) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = i11;
        }
    }

    public static int[] prepend(int[] iArr, int i11) {
        if (iArr == null) {
            return new int[]{i11};
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 1, length);
        iArr2[0] = i11;
        return iArr2;
    }

    public static boolean areEqual(short[] sArr, short[] sArr2) {
        if (sArr == sArr2) {
            return true;
        }
        if (sArr == null || sArr2 == null || sArr.length != sArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 != sArr.length; i11++) {
            if (sArr[i11] != sArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static byte[][][] clone(byte[][][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][][] bArr2 = new byte[length][];
        for (int i11 = 0; i11 != length; i11++) {
            bArr2[i11] = clone(bArr[i11]);
        }
        return bArr2;
    }

    public static int hashCode(int[] iArr, int i11, int i12) {
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

    public static long[] copyOfRange(long[] jArr, int i11, int i12) {
        int length = getLength(i11, i12);
        long[] jArr2 = new long[length];
        if (jArr.length - i11 < length) {
            System.arraycopy(jArr, i11, jArr2, 0, jArr.length - i11);
        } else {
            System.arraycopy(jArr, i11, jArr2, 0, length);
        }
        return jArr2;
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null) {
            return 0;
        }
        int length = jArr.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            long j11 = jArr[length];
            i11 = (((i11 * 257) ^ ((int) j11)) * 257) ^ ((int) (j11 >>> 32));
        }
    }

    public static int[] clone(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean areEqual(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 != iArr.length; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr != null && bArr2 != null && bArr3 != null && bArr4 != null) {
            byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
            System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
            System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
            System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
            return bArr5;
        } else if (bArr4 == null) {
            return concatenate(bArr, bArr2, bArr3);
        } else {
            if (bArr3 == null) {
                return concatenate(bArr, bArr2, bArr4);
            }
            if (bArr2 == null) {
                return concatenate(bArr, bArr3, bArr4);
            }
            return concatenate(bArr2, bArr3, bArr4);
        }
    }

    public static long[] copyOf(long[] jArr, int i11) {
        long[] jArr2 = new long[i11];
        if (i11 < jArr.length) {
            System.arraycopy(jArr, 0, jArr2, 0, i11);
        } else {
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        }
        return jArr2;
    }

    public static int hashCode(long[] jArr, int i11, int i12) {
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

    public static long[] clone(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    public static int hashCode(short[][][] sArr) {
        int i11 = 0;
        for (int i12 = 0; i12 != sArr.length; i12++) {
            i11 = (i11 * 257) + hashCode(sArr[i12]);
        }
        return i11;
    }

    public static boolean areEqual(long[] jArr, long[] jArr2) {
        if (jArr == jArr2) {
            return true;
        }
        if (jArr == null || jArr2 == null || jArr.length != jArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 != jArr.length; i11++) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static long[] clone(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 != null && jArr2.length == jArr.length) {
            System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
            return jArr2;
        }
        return clone(jArr);
    }

    public static BigInteger[] copyOfRange(BigInteger[] bigIntegerArr, int i11, int i12) {
        int length = getLength(i11, i12);
        BigInteger[] bigIntegerArr2 = new BigInteger[length];
        if (bigIntegerArr.length - i11 < length) {
            System.arraycopy(bigIntegerArr, i11, bigIntegerArr2, 0, bigIntegerArr.length - i11);
        } else {
            System.arraycopy(bigIntegerArr, i11, bigIntegerArr2, 0, length);
        }
        return bigIntegerArr2;
    }

    public static int hashCode(short[][] sArr) {
        int i11 = 0;
        for (int i12 = 0; i12 != sArr.length; i12++) {
            i11 = (i11 * 257) + hashCode(sArr[i12]);
        }
        return i11;
    }

    public static BigInteger[] copyOf(BigInteger[] bigIntegerArr, int i11) {
        BigInteger[] bigIntegerArr2 = new BigInteger[i11];
        if (i11 < bigIntegerArr.length) {
            System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, i11);
        } else {
            System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, bigIntegerArr.length);
        }
        return bigIntegerArr2;
    }

    public static int hashCode(short[] sArr) {
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

    public static boolean areEqual(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 != objArr.length; i11++) {
            Object obj = objArr[i11];
            Object obj2 = objArr2[i11];
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static short[] clone(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    public static int hashCode(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int i11 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i11;
            }
            i11 = (i11 * 257) ^ objArr[length].hashCode();
        }
    }

    public static BigInteger[] clone(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null) {
            return null;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, bigIntegerArr.length);
        return bigIntegerArr2;
    }

    public static byte[] concatenate(byte[][] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 != bArr.length; i12++) {
            i11 += bArr[i12].length;
        }
        byte[] bArr2 = new byte[i11];
        int i13 = 0;
        for (int i14 = 0; i14 != bArr.length; i14++) {
            System.arraycopy(bArr[i14], 0, bArr2, i13, bArr[i14].length);
            i13 += bArr[i14].length;
        }
        return bArr2;
    }

    public static int[] concatenate(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return clone(iArr2);
        }
        if (iArr2 == null) {
            return clone(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }
}