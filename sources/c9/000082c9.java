package l60;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class e implements AlgorithmParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private n60.e f37061a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f37062b;

    /* renamed from: c  reason: collision with root package name */
    private n60.i f37063c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f37064d;

    /* renamed from: e  reason: collision with root package name */
    private BigInteger f37065e;

    public e(n60.e eVar, n60.i iVar, BigInteger bigInteger) {
        this.f37061a = eVar;
        this.f37063c = iVar.A();
        this.f37064d = bigInteger;
        this.f37065e = BigInteger.valueOf(1L);
        this.f37062b = null;
    }

    public e(n60.e eVar, n60.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f37061a = eVar;
        this.f37063c = iVar.A();
        this.f37064d = bigInteger;
        this.f37065e = bigInteger2;
        this.f37062b = bArr;
    }

    public n60.e a() {
        return this.f37061a;
    }

    public n60.i b() {
        return this.f37063c;
    }

    public BigInteger c() {
        return this.f37065e;
    }

    public BigInteger d() {
        return this.f37064d;
    }

    public byte[] e() {
        return this.f37062b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return a().l(eVar.a()) && b().e(eVar.b());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }
}