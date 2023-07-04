package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* renamed from: x  reason: collision with root package name */
    private BigInteger f43680x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f43680x = bigInteger;
    }

    public BigInteger getX() {
        return this.f43680x;
    }
}