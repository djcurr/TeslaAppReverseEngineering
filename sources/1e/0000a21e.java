package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43681y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f43681y = bigInteger;
    }

    public BigInteger getY() {
        return this.f43681y;
    }
}