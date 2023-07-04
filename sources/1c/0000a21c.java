package org.spongycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g  reason: collision with root package name */
    private BigInteger f43678g;

    /* renamed from: p  reason: collision with root package name */
    private BigInteger f43679p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f43679p = bigInteger;
        this.f43678g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f43678g;
    }

    public BigInteger getP() {
        return this.f43679p;
    }
}