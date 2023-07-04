package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* renamed from: g  reason: collision with root package name */
    private BigInteger f43617g;
    int lowerSigmaBound;

    /* renamed from: n  reason: collision with root package name */
    private BigInteger f43618n;

    public NaccacheSternKeyParameters(boolean z11, BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        super(z11);
        this.f43617g = bigInteger;
        this.f43618n = bigInteger2;
        this.lowerSigmaBound = i11;
    }

    public BigInteger getG() {
        return this.f43617g;
    }

    public int getLowerSigmaBound() {
        return this.lowerSigmaBound;
    }

    public BigInteger getModulus() {
        return this.f43618n;
    }
}