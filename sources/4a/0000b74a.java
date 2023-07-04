package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class i implements org.bouncycastle.crypto.i {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f53220a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f53221b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53222c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f53223d;

    /* renamed from: e  reason: collision with root package name */
    private int f53224e;

    /* renamed from: f  reason: collision with root package name */
    private int f53225f;

    /* renamed from: g  reason: collision with root package name */
    private n f53226g;

    public i(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, a(i11), i11, null, null);
    }

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i11, int i12, BigInteger bigInteger4, n nVar) {
        if (i12 != 0) {
            if (i12 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i12 < i11) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i11 > bigInteger.bitLength() && !r70.j.c("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f53220a = bigInteger2;
        this.f53221b = bigInteger;
        this.f53222c = bigInteger3;
        this.f53224e = i11;
        this.f53225f = i12;
        this.f53223d = bigInteger4;
        this.f53226g = nVar;
    }

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, n nVar) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, nVar);
    }

    private static int a(int i11) {
        if (i11 != 0 && i11 < 160) {
            return i11;
        }
        return 160;
    }

    public BigInteger b() {
        return this.f53220a;
    }

    public BigInteger c() {
        return this.f53223d;
    }

    public int d() {
        return this.f53225f;
    }

    public int e() {
        return this.f53224e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (g() != null) {
                if (!g().equals(iVar.g())) {
                    return false;
                }
            } else if (iVar.g() != null) {
                return false;
            }
            return iVar.f().equals(this.f53221b) && iVar.b().equals(this.f53220a);
        }
        return false;
    }

    public BigInteger f() {
        return this.f53221b;
    }

    public BigInteger g() {
        return this.f53222c;
    }

    public n h() {
        return this.f53226g;
    }

    public int hashCode() {
        return (f().hashCode() ^ b().hashCode()) ^ (g() != null ? g().hashCode() : 0);
    }
}