package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes4.dex */
public class DHPublicKeyParameters extends DHKeyParameters {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43586y;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        this.f43586y = validate(bigInteger, dHParameters);
    }

    private BigInteger validate(BigInteger bigInteger, DHParameters dHParameters) {
        Objects.requireNonNull(bigInteger, "y value cannot be null");
        BigInteger bigInteger2 = TWO;
        if (bigInteger.compareTo(bigInteger2) >= 0 && bigInteger.compareTo(dHParameters.getP().subtract(bigInteger2)) <= 0) {
            if (dHParameters.getQ() == null || ONE.equals(bigInteger.modPow(dHParameters.getQ(), dHParameters.getP()))) {
                return bigInteger;
            }
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
        throw new IllegalArgumentException("invalid DH public key");
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj).getY().equals(this.f43586y) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f43586y;
    }

    @Override // org.spongycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f43586y.hashCode() ^ super.hashCode();
    }
}