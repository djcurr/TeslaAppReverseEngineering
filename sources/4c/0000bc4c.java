package w40;

import org.bouncycastle.asn1.k1;
import org.bouncycastle.asn1.o1;

/* loaded from: classes5.dex */
public class v extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f55596a;

    /* renamed from: b  reason: collision with root package name */
    private e40.b f55597b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.q f55598c;

    public v(org.bouncycastle.asn1.k kVar, e40.b bVar, org.bouncycastle.asn1.q qVar) {
        this.f55596a = kVar;
        this.f55597b = bVar;
        this.f55598c = qVar;
    }

    private v(org.bouncycastle.asn1.p pVar) {
        this.f55596a = (org.bouncycastle.asn1.k) pVar.r(0);
        this.f55597b = ((org.bouncycastle.asn1.s) pVar.r(1)).r();
        if (pVar.size() == 3) {
            this.f55598c = (org.bouncycastle.asn1.q) pVar.r(2);
        }
    }

    public static v i(Object obj) {
        if (obj instanceof v) {
            return (v) obj;
        }
        if (obj != null) {
            return new v(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.q e() {
        return this.f55598c;
    }

    public org.bouncycastle.asn1.k f() {
        return this.f55596a;
    }

    public e40.b h() {
        return this.f55597b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f55596a);
        dVar.a(new o1(true, 0, this.f55597b));
        org.bouncycastle.asn1.q qVar = this.f55598c;
        if (qVar != null) {
            dVar.a(qVar);
        }
        return new k1(dVar);
    }
}