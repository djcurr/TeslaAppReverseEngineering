package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class ECPrivateKeySpec extends ECKeySpec {

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f43676d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f43676d = bigInteger;
    }

    public BigInteger getD() {
        return this.f43676d;
    }
}