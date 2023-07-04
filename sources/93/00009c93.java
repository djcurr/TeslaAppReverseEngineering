package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g  reason: collision with root package name */
    private BigInteger f43597g;

    /* renamed from: l  reason: collision with root package name */
    private int f43598l;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43599p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ElGamalParameters) {
            ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
            return elGamalParameters.getP().equals(this.f43599p) && elGamalParameters.getG().equals(this.f43597g) && elGamalParameters.getL() == this.f43598l;
        }
        return false;
    }

    public BigInteger getG() {
        return this.f43597g;
    }

    public int getL() {
        return this.f43598l;
    }

    public BigInteger getP() {
        return this.f43599p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f43598l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f43597g = bigInteger2;
        this.f43599p = bigInteger;
        this.f43598l = i11;
    }
}