package l60;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class o implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f37084a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f37085b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f37086c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f37087d;

    public o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f37084a = bigInteger;
        this.f37085b = bigInteger2;
        this.f37086c = bigInteger3;
        this.f37087d = bigInteger4;
    }

    public BigInteger a() {
        return this.f37087d;
    }

    public BigInteger b() {
        return this.f37085b;
    }

    public BigInteger c() {
        return this.f37086c;
    }

    public BigInteger d() {
        return this.f37084a;
    }
}