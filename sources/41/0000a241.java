package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    protected int getWidthForCombSize(int i11) {
        return i11 > 257 ? 6 : 5;
    }

    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() <= combSize) {
            FixedPointPreCompInfo precompute = FixedPointUtil.precompute(eCPoint, getWidthForCombSize(combSize));
            ECPoint[] preComp = precompute.getPreComp();
            int width = precompute.getWidth();
            int i11 = ((combSize + width) - 1) / width;
            ECPoint infinity = curve.getInfinity();
            int i12 = (width * i11) - 1;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = 0;
                for (int i15 = i12 - i13; i15 >= 0; i15 -= i11) {
                    i14 <<= 1;
                    if (bigInteger.testBit(i15)) {
                        i14 |= 1;
                    }
                }
                infinity = infinity.twicePlus(preComp[i14]);
            }
            return infinity;
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}