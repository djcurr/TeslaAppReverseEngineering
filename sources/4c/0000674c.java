package e50;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class o extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    n0 f24744a;

    /* renamed from: b  reason: collision with root package name */
    b f24745b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.asn1.j0 f24746c;

    /* renamed from: d  reason: collision with root package name */
    boolean f24747d = false;

    /* renamed from: e  reason: collision with root package name */
    int f24748e;

    public o(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        this.f24744a = n0.f(pVar.r(0));
        this.f24745b = b.f(pVar.r(1));
        this.f24746c = org.bouncycastle.asn1.j0.v(pVar.r(2));
    }

    public static o e(Object obj) {
        if (obj instanceof o) {
            return (o) obj;
        }
        if (obj != null) {
            return new o(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public c50.c f() {
        return this.f24744a.h();
    }

    public t0 h() {
        return this.f24744a.i();
    }

    @Override // e40.c
    public int hashCode() {
        if (!this.f24747d) {
            this.f24748e = super.hashCode();
            this.f24747d = true;
        }
        return this.f24748e;
    }

    public Enumeration i() {
        return this.f24744a.j();
    }

    public org.bouncycastle.asn1.j0 j() {
        return this.f24746c;
    }

    public b k() {
        return this.f24745b;
    }

    public n0 m() {
        return this.f24744a;
    }

    public t0 n() {
        return this.f24744a.m();
    }

    public int o() {
        return this.f24744a.n();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f24744a);
        dVar.a(this.f24745b);
        dVar.a(this.f24746c);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}