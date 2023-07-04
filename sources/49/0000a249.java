package org.spongycastle.math.ec;

import java.math.BigInteger;
import okhttp3.internal.http2.Settings;

/* loaded from: classes4.dex */
public class NafR2LMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        int[] generateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int i11 = 0;
        int i12 = 0;
        while (i11 < generateCompactNaf.length) {
            int i13 = generateCompactNaf[i11];
            int i14 = i13 >> 16;
            eCPoint = eCPoint.timesPow2(i12 + (i13 & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            infinity = infinity.add(i14 < 0 ? eCPoint.negate() : eCPoint);
            i11++;
            i12 = 1;
        }
        return infinity;
    }
}