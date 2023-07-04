package u40;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class l extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.g f53164a;

    /* renamed from: b  reason: collision with root package name */
    private e50.m f53165b;

    private l(p pVar) {
        this.f53164a = org.bouncycastle.asn1.g.t(pVar.r(0));
        if (pVar.size() > 1) {
            this.f53165b = e50.m.e(org.bouncycastle.asn1.e.r((s) pVar.r(1), true));
        }
    }

    public static l e(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(p.p(obj));
        }
        return null;
    }

    public static l f(s sVar, boolean z11) {
        return e(p.q(sVar, z11));
    }

    public e50.m h() {
        return this.f53165b;
    }

    public org.bouncycastle.asn1.g i() {
        return this.f53164a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f53164a);
        e50.m mVar = this.f53165b;
        if (mVar != null) {
            dVar.a(new z0(true, 0, mVar));
        }
        return new w0(dVar);
    }
}