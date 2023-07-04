package q50;

/* loaded from: classes5.dex */
class q {
    public static byte[] a(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, bArr.length - i11, bArr2, 0, i11);
        return bArr2;
    }

    public static byte[] b(byte[] bArr, int i11) {
        return org.bouncycastle.util.a.v(bArr, i11);
    }

    public static byte[] c(byte[] bArr, int i11, int i12) {
        if (bArr.length < i11 + i12) {
            i11 = bArr.length - i12;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i12, bArr2, 0, i11);
        return bArr2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
        return bArr3;
    }
}