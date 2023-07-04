package e50;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class r extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f24771a;

    /* renamed from: b  reason: collision with root package name */
    private b f24772b;

    public r(b bVar, byte[] bArr) {
        this.f24771a = org.bouncycastle.util.a.h(bArr);
        this.f24772b = bVar;
    }

    public r(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        this.f24772b = b.f(s11.nextElement());
        this.f24771a = org.bouncycastle.asn1.l.p(s11.nextElement()).r();
    }

    public static r h(Object obj) {
        if (obj instanceof r) {
            return (r) obj;
        }
        if (obj != null) {
            return new r(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public b e() {
        return this.f24772b;
    }

    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f24771a);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24772b);
        dVar.a(new org.bouncycastle.asn1.s0(this.f24771a));
        return new org.bouncycastle.asn1.w0(dVar);
    }
}