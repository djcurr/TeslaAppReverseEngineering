package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f43686a;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43687p;

    /* renamed from: q  reason: collision with root package name */
    private BigInteger f43688q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f43687p = bigInteger;
        this.f43688q = bigInteger2;
        this.f43686a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            return this.f43686a.equals(gOST3410PublicKeyParameterSetSpec.f43686a) && this.f43687p.equals(gOST3410PublicKeyParameterSetSpec.f43687p) && this.f43688q.equals(gOST3410PublicKeyParameterSetSpec.f43688q);
        }
        return false;
    }

    public BigInteger getA() {
        return this.f43686a;
    }

    public BigInteger getP() {
        return this.f43687p;
    }

    public BigInteger getQ() {
        return this.f43688q;
    }

    public int hashCode() {
        return (this.f43686a.hashCode() ^ this.f43687p.hashCode()) ^ this.f43688q.hashCode();
    }
}