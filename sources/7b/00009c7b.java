package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f43576c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f43577d;

    /* renamed from: h  reason: collision with root package name */
    private BigInteger f43578h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f43576c = bigInteger;
        this.f43577d = bigInteger2;
        this.f43578h = bigInteger3;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupPublicKeyParameters) {
            CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
            return cramerShoupPublicKeyParameters.getC().equals(this.f43576c) && cramerShoupPublicKeyParameters.getD().equals(this.f43577d) && cramerShoupPublicKeyParameters.getH().equals(this.f43578h) && super.equals(obj);
        }
        return false;
    }

    public BigInteger getC() {
        return this.f43576c;
    }

    public BigInteger getD() {
        return this.f43577d;
    }

    public BigInteger getH() {
        return this.f43578h;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f43576c.hashCode() ^ this.f43577d.hashCode()) ^ this.f43578h.hashCode()) ^ super.hashCode();
    }
}