package w40;

import org.bouncycastle.asn1.b0;

/* loaded from: classes5.dex */
public class o extends e40.c implements n {

    /* renamed from: a  reason: collision with root package name */
    private c f55561a;

    /* renamed from: b  reason: collision with root package name */
    private i f55562b;

    private o(org.bouncycastle.asn1.p pVar) {
        this.f55562b = null;
        if (!org.bouncycastle.asn1.i.p(pVar.r(0)).t(3)) {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        this.f55561a = c.h(pVar.r(1));
        if (pVar.size() == 3) {
            this.f55562b = i.e(pVar.r(2));
        }
    }

    public o(c cVar, i iVar) {
        this.f55562b = null;
        this.f55561a = cVar;
        this.f55562b = iVar;
    }

    public static o f(Object obj) {
        if (obj instanceof o) {
            return (o) obj;
        }
        if (obj != null) {
            return new o(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public c e() {
        return this.f55561a;
    }

    public i h() {
        return this.f55562b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(new org.bouncycastle.asn1.i(3L));
        dVar.a(this.f55561a);
        i iVar = this.f55562b;
        if (iVar != null) {
            dVar.a(iVar);
        }
        return new b0(dVar);
    }
}