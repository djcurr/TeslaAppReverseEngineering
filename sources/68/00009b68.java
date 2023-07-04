package org.spongycastle.crypto.agreement.jpake;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class JPAKEPrimeOrderGroup {

    /* renamed from: g  reason: collision with root package name */
    private final BigInteger f43440g;

    /* renamed from: p  reason: collision with root package name */
    private final BigInteger f43441p;

    /* renamed from: q  reason: collision with root package name */
    private final BigInteger f43442q;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }

    public BigInteger getG() {
        return this.f43440g;
    }

    public BigInteger getP() {
        return this.f43441p;
    }

    public BigInteger getQ() {
        return this.f43442q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z11) {
        JPAKEUtil.validateNotNull(bigInteger, "p");
        JPAKEUtil.validateNotNull(bigInteger2, "q");
        JPAKEUtil.validateNotNull(bigInteger3, "g");
        if (!z11) {
            BigInteger bigInteger4 = JPAKEUtil.ONE;
            if (bigInteger.subtract(bigInteger4).mod(bigInteger2).equals(JPAKEUtil.ZERO)) {
                if (bigInteger3.compareTo(BigInteger.valueOf(2L)) != -1 && bigInteger3.compareTo(bigInteger.subtract(bigInteger4)) != 1) {
                    if (bigInteger3.modPow(bigInteger2, bigInteger).equals(bigInteger4)) {
                        if (bigInteger.isProbablePrime(20)) {
                            if (!bigInteger2.isProbablePrime(20)) {
                                throw new IllegalArgumentException("q must be prime");
                            }
                        } else {
                            throw new IllegalArgumentException("p must be prime");
                        }
                    } else {
                        throw new IllegalArgumentException("g^q mod p must equal 1");
                    }
                } else {
                    throw new IllegalArgumentException("g must be in [2, p-1]");
                }
            } else {
                throw new IllegalArgumentException("p-1 must be evenly divisible by q");
            }
        }
        this.f43441p = bigInteger;
        this.f43442q = bigInteger2;
        this.f43440g = bigInteger3;
    }
}