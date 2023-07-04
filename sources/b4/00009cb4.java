package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {
    private BigInteger dP;
    private BigInteger dQ;

    /* renamed from: e  reason: collision with root package name */
    private BigInteger f43620e;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43621p;

    /* renamed from: q  reason: collision with root package name */
    private BigInteger f43622q;
    private BigInteger qInv;

    public RSAPrivateCrtKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        super(true, bigInteger, bigInteger3);
        this.f43620e = bigInteger2;
        this.f43621p = bigInteger4;
        this.f43622q = bigInteger5;
        this.dP = bigInteger6;
        this.dQ = bigInteger7;
        this.qInv = bigInteger8;
    }

    public BigInteger getDP() {
        return this.dP;
    }

    public BigInteger getDQ() {
        return this.dQ;
    }

    public BigInteger getP() {
        return this.f43621p;
    }

    public BigInteger getPublicExponent() {
        return this.f43620e;
    }

    public BigInteger getQ() {
        return this.f43622q;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }
}