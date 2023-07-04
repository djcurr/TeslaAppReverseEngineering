package org.spongycastle.crypto.params;

import org.spongycastle.math.ec.ECPoint;

/* loaded from: classes4.dex */
public class ECPublicKeyParameters extends ECKeyParameters {
    private final ECPoint Q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.Q = validate(eCPoint);
    }

    private ECPoint validate(ECPoint eCPoint) {
        if (eCPoint != null) {
            if (!eCPoint.isInfinity()) {
                ECPoint normalize = eCPoint.normalize();
                if (normalize.isValid()) {
                    return normalize;
                }
                throw new IllegalArgumentException("point not on curve");
            }
            throw new IllegalArgumentException("point at infinity");
        }
        throw new IllegalArgumentException("point has null value");
    }

    public ECPoint getQ() {
        return this.Q;
    }
}