package org.spongycastle.math.ec;

import java.math.BigInteger;
import okhttp3.internal.http2.Settings;

/* loaded from: classes4.dex */
public class WNafL2RMultiplier extends AbstractECMultiplier {
    protected int getWindowSize(int i11) {
        return WNafUtil.getWindowSize(i11);
    }

    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint eCPoint2;
        int max = Math.max(2, Math.min(16, getWindowSize(bigInteger.bitLength())));
        WNafPreCompInfo precompute = WNafUtil.precompute(eCPoint, max, true);
        ECPoint[] preComp = precompute.getPreComp();
        ECPoint[] preCompNeg = precompute.getPreCompNeg();
        int[] generateCompactWindowNaf = WNafUtil.generateCompactWindowNaf(max, bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = generateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i11 = generateCompactWindowNaf[length];
            int i12 = i11 >> 16;
            int i13 = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int abs = Math.abs(i12);
            ECPoint[] eCPointArr = i12 < 0 ? preCompNeg : preComp;
            if ((abs << 2) < (1 << max)) {
                byte b11 = LongArray.bitLengths[abs];
                int i14 = max - b11;
                eCPoint2 = eCPointArr[((1 << (max - 1)) - 1) >>> 1].add(eCPointArr[(((abs ^ (1 << (b11 - 1))) << i14) + 1) >>> 1]);
                i13 -= i14;
            } else {
                eCPoint2 = eCPointArr[abs >>> 1];
            }
            infinity = eCPoint2.timesPow2(i13);
        }
        while (length > 0) {
            length--;
            int i15 = generateCompactWindowNaf[length];
            int i16 = i15 >> 16;
            infinity = infinity.twicePlus((i16 < 0 ? preCompNeg : preComp)[Math.abs(i16) >>> 1]).timesPow2(i15 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        return infinity;
    }
}