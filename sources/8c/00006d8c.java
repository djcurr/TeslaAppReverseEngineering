package f50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class n {
    public int a(n60.e eVar) {
        return (eVar.t() + 7) / 8;
    }

    public int b(n60.f fVar) {
        return (fVar.f() + 7) / 8;
    }

    public byte[] c(BigInteger bigInteger, int i11) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i11 < byteArray.length) {
            byte[] bArr = new byte[i11];
            System.arraycopy(byteArray, byteArray.length - i11, bArr, 0, i11);
            return bArr;
        } else if (i11 > byteArray.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(byteArray, 0, bArr2, i11 - byteArray.length, byteArray.length);
            return bArr2;
        } else {
            return byteArray;
        }
    }
}