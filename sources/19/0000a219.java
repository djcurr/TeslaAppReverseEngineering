package org.spongycastle.jce.spec;

import org.spongycastle.math.ec.ECPoint;

/* loaded from: classes4.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* renamed from: q  reason: collision with root package name */
    private ECPoint f43677q;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        if (eCPoint.getCurve() != null) {
            this.f43677q = eCPoint.normalize();
        } else {
            this.f43677q = eCPoint;
        }
    }

    public ECPoint getQ() {
        return this.f43677q;
    }
}