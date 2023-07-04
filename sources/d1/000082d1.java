package l60;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class m implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f37077a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f37078b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f37079c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f37080d;

    public m(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f37077a = bigInteger;
        this.f37078b = bigInteger2;
        this.f37079c = bigInteger3;
        this.f37080d = bigInteger4;
    }

    public BigInteger a() {
        return this.f37080d;
    }

    public BigInteger b() {
        return this.f37078b;
    }

    public BigInteger c() {
        return this.f37079c;
    }

    public BigInteger d() {
        return this.f37077a;
    }
}