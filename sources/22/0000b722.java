package u40;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    e50.b f53139a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.l f53140b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.asn1.l f53141c;

    /* renamed from: d  reason: collision with root package name */
    org.bouncycastle.asn1.i f53142d;

    public b(e50.b bVar, org.bouncycastle.asn1.l lVar, org.bouncycastle.asn1.l lVar2, org.bouncycastle.asn1.i iVar) {
        this.f53139a = bVar;
        this.f53140b = lVar;
        this.f53141c = lVar2;
        this.f53142d = iVar;
    }

    private b(p pVar) {
        this.f53139a = e50.b.f(pVar.r(0));
        this.f53140b = (org.bouncycastle.asn1.l) pVar.r(1);
        this.f53141c = (org.bouncycastle.asn1.l) pVar.r(2);
        this.f53142d = (org.bouncycastle.asn1.i) pVar.r(3);
    }

    public static b f(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(p.p(obj));
        }
        return null;
    }

    public e50.b e() {
        return this.f53139a;
    }

    public org.bouncycastle.asn1.i h() {
        return this.f53142d;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        dVar.a(this.f53139a);
        dVar.a(this.f53140b);
        dVar.a(this.f53141c);
        dVar.a(this.f53142d);
        return new w0(dVar);
    }
}