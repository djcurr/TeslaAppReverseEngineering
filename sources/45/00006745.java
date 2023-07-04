package e50;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class m0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private b f24728a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.j0 f24729b;

    public m0(b bVar, e40.b bVar2) {
        this.f24729b = new org.bouncycastle.asn1.j0(bVar2);
        this.f24728a = bVar;
    }

    public m0(b bVar, byte[] bArr) {
        this.f24729b = new org.bouncycastle.asn1.j0(bArr);
        this.f24728a = bVar;
    }

    public m0(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() == 2) {
            Enumeration s11 = pVar.s();
            this.f24728a = b.f(s11.nextElement());
            this.f24729b = org.bouncycastle.asn1.j0.v(s11.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static m0 h(Object obj) {
        if (obj instanceof m0) {
            return (m0) obj;
        }
        if (obj != null) {
            return new m0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public b e() {
        return this.f24728a;
    }

    public b f() {
        return this.f24728a;
    }

    public org.bouncycastle.asn1.j0 i() {
        return this.f24729b;
    }

    public org.bouncycastle.asn1.n j() {
        return org.bouncycastle.asn1.n.k(this.f24729b.r());
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24728a);
        dVar.a(this.f24729b);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}