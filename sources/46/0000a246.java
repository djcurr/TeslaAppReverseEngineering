package org.spongycastle.math.ec;

import java.math.BigInteger;
import okhttp3.internal.http2.Settings;

/* loaded from: classes4.dex */
public class MixedNafR2LMultiplier extends AbstractECMultiplier {
    protected int additionCoord;
    protected int doublingCoord;

    public MixedNafR2LMultiplier() {
        this(2, 4);
    }

    protected ECCurve configureCurve(ECCurve eCCurve, int i11) {
        if (eCCurve.getCoordinateSystem() == i11) {
            return eCCurve;
        }
        if (eCCurve.supportsCoordinateSystem(i11)) {
            return eCCurve.configure().setCoordinateSystem(i11).create();
        }
        throw new IllegalArgumentException("Coordinate system " + i11 + " not supported by this curve");
    }

    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        ECCurve configureCurve = configureCurve(curve, this.additionCoord);
        ECCurve configureCurve2 = configureCurve(curve, this.doublingCoord);
        int[] generateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = configureCurve.getInfinity();
        ECPoint importPoint = configureCurve2.importPoint(eCPoint);
        int i11 = 0;
        ECPoint eCPoint2 = infinity;
        int i12 = 0;
        while (i11 < generateCompactNaf.length) {
            int i13 = generateCompactNaf[i11];
            int i14 = i13 >> 16;
            importPoint = importPoint.timesPow2(i12 + (i13 & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            ECPoint importPoint2 = configureCurve.importPoint(importPoint);
            if (i14 < 0) {
                importPoint2 = importPoint2.negate();
            }
            eCPoint2 = eCPoint2.add(importPoint2);
            i11++;
            i12 = 1;
        }
        return curve.importPoint(eCPoint2);
    }

    public MixedNafR2LMultiplier(int i11, int i12) {
        this.additionCoord = i11;
        this.doublingCoord = i12;
    }
}