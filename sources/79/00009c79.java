package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;

/* loaded from: classes4.dex */
public class CramerShoupParameters implements CipherParameters {
    private Digest H;

    /* renamed from: g1  reason: collision with root package name */
    private BigInteger f43567g1;

    /* renamed from: g2  reason: collision with root package name */
    private BigInteger f43568g2;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43569p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f43569p = bigInteger;
        this.f43567g1 = bigInteger2;
        this.f43568g2 = bigInteger3;
        this.H = digest;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAParameters) {
            CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
            return cramerShoupParameters.getP().equals(this.f43569p) && cramerShoupParameters.getG1().equals(this.f43567g1) && cramerShoupParameters.getG2().equals(this.f43568g2);
        }
        return false;
    }

    public BigInteger getG1() {
        return this.f43567g1;
    }

    public BigInteger getG2() {
        return this.f43568g2;
    }

    public Digest getH() {
        this.H.reset();
        return this.H;
    }

    public BigInteger getP() {
        return this.f43569p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}