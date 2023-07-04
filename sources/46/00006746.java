package e50;

/* loaded from: classes5.dex */
public class n extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.p f24730a;

    /* renamed from: b  reason: collision with root package name */
    o0 f24731b;

    /* renamed from: c  reason: collision with root package name */
    b f24732c;

    /* renamed from: d  reason: collision with root package name */
    org.bouncycastle.asn1.j0 f24733d;

    private n(org.bouncycastle.asn1.p pVar) {
        this.f24730a = pVar;
        if (pVar.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.f24731b = o0.h(pVar.r(0));
        this.f24732c = b.f(pVar.r(1));
        this.f24733d = org.bouncycastle.asn1.j0.v(pVar.r(2));
    }

    public static n f(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public static n h(org.bouncycastle.asn1.s sVar, boolean z11) {
        return f(org.bouncycastle.asn1.p.q(sVar, z11));
    }

    public t0 e() {
        return this.f24731b.e();
    }

    public c50.c i() {
        return this.f24731b.i();
    }

    public org.bouncycastle.asn1.i j() {
        return this.f24731b.k();
    }

    public org.bouncycastle.asn1.j0 k() {
        return this.f24733d;
    }

    public b m() {
        return this.f24732c;
    }

    public t0 n() {
        return this.f24731b.n();
    }

    public c50.c o() {
        return this.f24731b.o();
    }

    public m0 p() {
        return this.f24731b.p();
    }

    public o0 q() {
        return this.f24731b;
    }

    public int r() {
        return this.f24731b.r();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24730a;
    }
}