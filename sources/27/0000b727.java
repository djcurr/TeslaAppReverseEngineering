package u40;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class g extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.e f53151a;

    private g(org.bouncycastle.asn1.e eVar) {
        this.f53151a = eVar;
    }

    public static g e(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(org.bouncycastle.asn1.e.q(obj));
        }
        return null;
    }

    public int f() {
        return this.f53151a.t();
    }

    public BigInteger h() {
        return this.f53151a.s();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f53151a;
    }
}