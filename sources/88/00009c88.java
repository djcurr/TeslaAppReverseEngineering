package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* renamed from: x  reason: collision with root package name */
    private BigInteger f43592x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f43592x = bigInteger;
    }

    public BigInteger getX() {
        return this.f43592x;
    }
}