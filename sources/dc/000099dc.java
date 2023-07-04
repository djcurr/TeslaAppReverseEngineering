package org.spongycastle.asn1.x9;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;

/* loaded from: classes5.dex */
public class X9IntegerConverter {
    public int getByteLength(ECCurve eCCurve) {
        return (eCCurve.getFieldSize() + 7) / 8;
    }

    public byte[] integerToBytes(BigInteger bigInteger, int i11) {
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

    public int getByteLength(ECFieldElement eCFieldElement) {
        return (eCFieldElement.getFieldSize() + 7) / 8;
    }
}