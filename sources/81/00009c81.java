package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* renamed from: x  reason: collision with root package name */
    private BigInteger f43585x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f43585x = bigInteger;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj).getX().equals(this.f43585x) && super.equals(obj);
    }

    public BigInteger getX() {
        return this.f43585x;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f43585x.hashCode() ^ super.hashCode();
    }
}