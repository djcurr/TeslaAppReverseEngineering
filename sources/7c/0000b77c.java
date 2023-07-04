package u50;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes5.dex */
public class y implements n60.d {

    /* renamed from: g  reason: collision with root package name */
    private final n60.e f53314g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f53315h;

    /* renamed from: i  reason: collision with root package name */
    private final n60.i f53316i;

    /* renamed from: j  reason: collision with root package name */
    private final BigInteger f53317j;

    /* renamed from: k  reason: collision with root package name */
    private final BigInteger f53318k;

    /* renamed from: l  reason: collision with root package name */
    private BigInteger f53319l;

    public y(f50.i iVar) {
        this(iVar.e(), iVar.f(), iVar.j(), iVar.h(), iVar.k());
    }

    public y(n60.e eVar, n60.i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eVar, iVar, bigInteger, bigInteger2, null);
    }

    public y(n60.e eVar, n60.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f53319l = null;
        Objects.requireNonNull(eVar, "curve");
        Objects.requireNonNull(bigInteger, "n");
        this.f53314g = eVar;
        this.f53316i = h(eVar, iVar);
        this.f53317j = bigInteger;
        this.f53318k = bigInteger2;
        this.f53315h = org.bouncycastle.util.a.h(bArr);
    }

    static n60.i h(n60.e eVar, n60.i iVar) {
        Objects.requireNonNull(iVar, "Point cannot be null");
        n60.i A = n60.c.k(eVar, iVar).A();
        if (A.u()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (A.w()) {
            return A;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public n60.e a() {
        return this.f53314g;
    }

    public n60.i b() {
        return this.f53316i;
    }

    public BigInteger c() {
        return this.f53318k;
    }

    public synchronized BigInteger d() {
        if (this.f53319l == null) {
            this.f53319l = r70.a.k(this.f53317j, this.f53318k);
        }
        return this.f53319l;
    }

    public BigInteger e() {
        return this.f53317j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            return this.f53314g.l(yVar.f53314g) && this.f53316i.e(yVar.f53316i) && this.f53317j.equals(yVar.f53317j);
        }
        return false;
    }

    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f53315h);
    }

    public BigInteger g(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "Scalar cannot be null");
        if (bigInteger.compareTo(n60.d.f40585b) < 0 || bigInteger.compareTo(e()) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public int hashCode() {
        return ((((this.f53314g.hashCode() ^ 1028) * 257) ^ this.f53316i.hashCode()) * 257) ^ this.f53317j.hashCode();
    }

    public n60.i i(n60.i iVar) {
        return h(a(), iVar);
    }
}