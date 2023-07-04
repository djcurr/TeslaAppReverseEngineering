package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes4.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f43689a;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43690p;

    /* renamed from: q  reason: collision with root package name */
    private BigInteger f43691q;

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43692y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f43692y = bigInteger;
        this.f43690p = bigInteger2;
        this.f43691q = bigInteger3;
        this.f43689a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f43689a;
    }

    public BigInteger getP() {
        return this.f43690p;
    }

    public BigInteger getQ() {
        return this.f43691q;
    }

    public BigInteger getY() {
        return this.f43692y;
    }
}