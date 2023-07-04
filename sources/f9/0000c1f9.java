package y50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final p f59197a = new p();

    private void e(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i11, int i12) {
        byte[] byteArray = c(bigInteger, bigInteger2).toByteArray();
        int max = Math.max(0, byteArray.length - i12);
        int length = byteArray.length - max;
        int i13 = (i12 - length) + i11;
        org.bouncycastle.util.a.z(bArr, i11, i13, (byte) 0);
        System.arraycopy(byteArray, max, bArr, i13, length);
    }

    @Override // y50.a
    public BigInteger[] a(BigInteger bigInteger, byte[] bArr) {
        int i11 = r70.a.i(bigInteger);
        if (bArr.length == i11 * 2) {
            return new BigInteger[]{d(bigInteger, bArr, 0, i11), d(bigInteger, bArr, i11, i11)};
        }
        throw new IllegalArgumentException("Encoding has incorrect length");
    }

    @Override // y50.a
    public byte[] b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int i11 = r70.a.i(bigInteger);
        byte[] bArr = new byte[i11 * 2];
        e(bigInteger, bigInteger2, bArr, 0, i11);
        e(bigInteger, bigInteger3, bArr, i11, i11);
        return bArr;
    }

    protected BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    protected BigInteger d(BigInteger bigInteger, byte[] bArr, int i11, int i12) {
        return c(bigInteger, new BigInteger(1, org.bouncycastle.util.a.w(bArr, i11, i12 + i11)));
    }
}