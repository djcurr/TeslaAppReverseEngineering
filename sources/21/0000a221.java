package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes4.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f43682a;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43683p;

    /* renamed from: q  reason: collision with root package name */
    private BigInteger f43684q;

    /* renamed from: x  reason: collision with root package name */
    private BigInteger f43685x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f43685x = bigInteger;
        this.f43683p = bigInteger2;
        this.f43684q = bigInteger3;
        this.f43682a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f43682a;
    }

    public BigInteger getP() {
        return this.f43683p;
    }

    public BigInteger getQ() {
        return this.f43684q;
    }

    public BigInteger getX() {
        return this.f43685x;
    }
}