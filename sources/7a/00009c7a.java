package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {

    /* renamed from: pk  reason: collision with root package name */
    private CramerShoupPublicKeyParameters f43570pk;

    /* renamed from: x1  reason: collision with root package name */
    private BigInteger f43571x1;

    /* renamed from: x2  reason: collision with root package name */
    private BigInteger f43572x2;

    /* renamed from: y1  reason: collision with root package name */
    private BigInteger f43573y1;

    /* renamed from: y2  reason: collision with root package name */
    private BigInteger f43574y2;

    /* renamed from: z  reason: collision with root package name */
    private BigInteger f43575z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f43571x1 = bigInteger;
        this.f43572x2 = bigInteger2;
        this.f43573y1 = bigInteger3;
        this.f43574y2 = bigInteger4;
        this.f43575z = bigInteger5;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupPrivateKeyParameters) {
            CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj;
            return cramerShoupPrivateKeyParameters.getX1().equals(this.f43571x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f43572x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f43573y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.f43574y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.f43575z) && super.equals(obj);
        }
        return false;
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.f43570pk;
    }

    public BigInteger getX1() {
        return this.f43571x1;
    }

    public BigInteger getX2() {
        return this.f43572x2;
    }

    public BigInteger getY1() {
        return this.f43573y1;
    }

    public BigInteger getY2() {
        return this.f43574y2;
    }

    public BigInteger getZ() {
        return this.f43575z;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f43571x1.hashCode() ^ this.f43572x2.hashCode()) ^ this.f43573y1.hashCode()) ^ this.f43574y2.hashCode()) ^ this.f43575z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.f43570pk = cramerShoupPublicKeyParameters;
    }
}