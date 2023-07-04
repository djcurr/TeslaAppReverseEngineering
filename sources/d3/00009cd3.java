package org.spongycastle.crypto.prng.drbg;

import org.spongycastle.math.ec.ECPoint;

/* loaded from: classes4.dex */
public class DualECPoints {
    private final int cofactor;

    /* renamed from: p  reason: collision with root package name */
    private final ECPoint f43626p;

    /* renamed from: q  reason: collision with root package name */
    private final ECPoint f43627q;
    private final int securityStrength;

    public DualECPoints(int i11, ECPoint eCPoint, ECPoint eCPoint2, int i12) {
        if (eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            this.securityStrength = i11;
            this.f43626p = eCPoint;
            this.f43627q = eCPoint2;
            this.cofactor = i12;
            return;
        }
        throw new IllegalArgumentException("points need to be on the same curve");
    }

    private static int log2(int i11) {
        int i12 = 0;
        while (true) {
            i11 >>= 1;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f43626p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f43626p;
    }

    public ECPoint getQ() {
        return this.f43627q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f43626p.getCurve().getFieldSize();
    }
}