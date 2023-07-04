package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class DoubleAddMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint[] eCPointArr = new ECPoint[2];
        eCPointArr[0] = eCPoint.getCurve().getInfinity();
        eCPointArr[1] = eCPoint;
        int bitLength = bigInteger.bitLength();
        for (int i11 = 0; i11 < bitLength; i11++) {
            boolean testBit = bigInteger.testBit(i11);
            int i12 = 1 - (testBit ? 1 : 0);
            eCPointArr[i12] = eCPointArr[i12].twicePlus(eCPointArr[testBit ? 1 : 0]);
        }
        return eCPointArr[0];
    }
}