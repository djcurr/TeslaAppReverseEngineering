package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class FixedPointUtil {
    public static final String PRECOMP_NAME = "bc_fixed_point";

    public static int getCombSize(ECCurve eCCurve) {
        BigInteger order = eCCurve.getOrder();
        return order == null ? eCCurve.getFieldSize() + 1 : order.bitLength();
    }

    public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo != null && (preCompInfo instanceof FixedPointPreCompInfo)) {
            return (FixedPointPreCompInfo) preCompInfo;
        }
        return new FixedPointPreCompInfo();
    }

    public static FixedPointPreCompInfo precompute(ECPoint eCPoint, int i11) {
        ECCurve curve = eCPoint.getCurve();
        int i12 = 1 << i11;
        FixedPointPreCompInfo fixedPointPreCompInfo = getFixedPointPreCompInfo(curve.getPreCompInfo(eCPoint, PRECOMP_NAME));
        ECPoint[] preComp = fixedPointPreCompInfo.getPreComp();
        if (preComp == null || preComp.length < i12) {
            int combSize = ((getCombSize(curve) + i11) - 1) / i11;
            ECPoint[] eCPointArr = new ECPoint[i11];
            eCPointArr[0] = eCPoint;
            for (int i13 = 1; i13 < i11; i13++) {
                eCPointArr[i13] = eCPointArr[i13 - 1].timesPow2(combSize);
            }
            curve.normalizeAll(eCPointArr);
            ECPoint[] eCPointArr2 = new ECPoint[i12];
            eCPointArr2[0] = curve.getInfinity();
            for (int i14 = i11 - 1; i14 >= 0; i14--) {
                ECPoint eCPoint2 = eCPointArr[i14];
                int i15 = 1 << i14;
                for (int i16 = i15; i16 < i12; i16 += i15 << 1) {
                    eCPointArr2[i16] = eCPointArr2[i16 - i15].add(eCPoint2);
                }
            }
            curve.normalizeAll(eCPointArr2);
            fixedPointPreCompInfo.setPreComp(eCPointArr2);
            fixedPointPreCompInfo.setWidth(i11);
            curve.setPreCompInfo(eCPoint, PRECOMP_NAME, fixedPointPreCompInfo);
        }
        return fixedPointPreCompInfo;
    }
}