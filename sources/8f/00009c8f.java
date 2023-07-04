package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* renamed from: d  reason: collision with root package name */
    BigInteger f43596d;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f43596d = bigInteger;
    }

    public BigInteger getD() {
        return this.f43596d;
    }
}