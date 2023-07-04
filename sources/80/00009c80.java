package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* renamed from: g  reason: collision with root package name */
    private BigInteger f43579g;

    /* renamed from: j  reason: collision with root package name */
    private BigInteger f43580j;

    /* renamed from: l  reason: collision with root package name */
    private int f43581l;

    /* renamed from: m  reason: collision with root package name */
    private int f43582m;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43583p;

    /* renamed from: q  reason: collision with root package name */
    private BigInteger f43584q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    private static int getDefaultMParam(int i11) {
        if (i11 != 0 && i11 < 160) {
            return i11;
        }
        return 160;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DHParameters) {
            DHParameters dHParameters = (DHParameters) obj;
            if (getQ() != null) {
                if (!getQ().equals(dHParameters.getQ())) {
                    return false;
                }
            } else if (dHParameters.getQ() != null) {
                return false;
            }
            return dHParameters.getP().equals(this.f43583p) && dHParameters.getG().equals(this.f43579g);
        }
        return false;
    }

    public BigInteger getG() {
        return this.f43579g;
    }

    public BigInteger getJ() {
        return this.f43580j;
    }

    public int getL() {
        return this.f43581l;
    }

    public int getM() {
        return this.f43582m;
    }

    public BigInteger getP() {
        return this.f43583p;
    }

    public BigInteger getQ() {
        return this.f43584q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i11), i11, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, int i12) {
        this(bigInteger, bigInteger2, bigInteger3, i11, i12, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, dHValidationParameters);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, int i12, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i12 != 0) {
            if (i12 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i12 < i11) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.f43579g = bigInteger2;
        this.f43583p = bigInteger;
        this.f43584q = bigInteger3;
        this.f43582m = i11;
        this.f43581l = i12;
        this.f43580j = bigInteger4;
        this.validation = dHValidationParameters;
    }
}