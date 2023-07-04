package l60;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class i implements AlgorithmParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f37069a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f37070b;

    public i(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f37069a = bigInteger;
        this.f37070b = bigInteger2;
    }

    public BigInteger a() {
        return this.f37070b;
    }

    public BigInteger b() {
        return this.f37069a;
    }
}