package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

/* loaded from: classes4.dex */
public class WTauNafMultiplier extends AbstractECMultiplier {
    static final String PRECOMP_NAME = "bc_wtnaf";

    private static ECPoint.AbstractF2m multiplyFromWTnaf(ECPoint.AbstractF2m abstractF2m, byte[] bArr, PreCompInfo preCompInfo) {
        ECPoint.AbstractF2m[] preComp;
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        byte byteValue = abstractF2m2.getA().toBigInteger().byteValue();
        if (preCompInfo != null && (preCompInfo instanceof WTauNafPreCompInfo)) {
            preComp = ((WTauNafPreCompInfo) preCompInfo).getPreComp();
        } else {
            preComp = Tnaf.getPreComp(abstractF2m, byteValue);
            WTauNafPreCompInfo wTauNafPreCompInfo = new WTauNafPreCompInfo();
            wTauNafPreCompInfo.setPreComp(preComp);
            abstractF2m2.setPreCompInfo(abstractF2m, PRECOMP_NAME, wTauNafPreCompInfo);
        }
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[preComp.length];
        for (int i11 = 0; i11 < preComp.length; i11++) {
            abstractF2mArr[i11] = (ECPoint.AbstractF2m) preComp[i11].negate();
        }
        ECPoint.AbstractF2m abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i12 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i12++;
            byte b11 = bArr[length];
            if (b11 != 0) {
                abstractF2m3 = (ECPoint.AbstractF2m) abstractF2m3.tauPow(i12).add(b11 > 0 ? preComp[b11 >>> 1] : abstractF2mArr[(-b11) >>> 1]);
                i12 = 0;
            }
        }
        return i12 > 0 ? abstractF2m3.tauPow(i12) : abstractF2m3;
    }

    private ECPoint.AbstractF2m multiplyWTnaf(ECPoint.AbstractF2m abstractF2m, ZTauElement zTauElement, PreCompInfo preCompInfo, byte b11, byte b12) {
        ZTauElement[] zTauElementArr = b11 == 0 ? Tnaf.alpha0 : Tnaf.alpha1;
        return multiplyFromWTnaf(abstractF2m, Tnaf.tauAdicWNaf(b12, zTauElement, (byte) 4, BigInteger.valueOf(16L), Tnaf.getTw(b12, 4), zTauElementArr), preCompInfo);
    }

    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (eCPoint instanceof ECPoint.AbstractF2m) {
            ECPoint.AbstractF2m abstractF2m = (ECPoint.AbstractF2m) eCPoint;
            ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
            int fieldSize = abstractF2m2.getFieldSize();
            byte byteValue = abstractF2m2.getA().toBigInteger().byteValue();
            byte mu2 = Tnaf.getMu(byteValue);
            return multiplyWTnaf(abstractF2m, Tnaf.partModReduction(bigInteger, fieldSize, byteValue, abstractF2m2.getSi(), mu2, (byte) 10), abstractF2m2.getPreCompInfo(abstractF2m, PRECOMP_NAME), byteValue, mu2);
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }
}