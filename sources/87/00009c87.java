package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g  reason: collision with root package name */
    private BigInteger f43589g;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43590p;

    /* renamed from: q  reason: collision with root package name */
    private BigInteger f43591q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f43589g = bigInteger3;
        this.f43590p = bigInteger;
        this.f43591q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAParameters) {
            DSAParameters dSAParameters = (DSAParameters) obj;
            return dSAParameters.getP().equals(this.f43590p) && dSAParameters.getQ().equals(this.f43591q) && dSAParameters.getG().equals(this.f43589g);
        }
        return false;
    }

    public BigInteger getG() {
        return this.f43589g;
    }

    public BigInteger getP() {
        return this.f43590p;
    }

    public BigInteger getQ() {
        return this.f43591q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f43589g = bigInteger3;
        this.f43590p = bigInteger;
        this.f43591q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}