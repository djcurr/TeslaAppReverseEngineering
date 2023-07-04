package u40;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class j extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.k f53155a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.l f53156b;

    public j(p pVar) {
        this.f53155a = (org.bouncycastle.asn1.k) pVar.r(0);
        this.f53156b = (org.bouncycastle.asn1.l) pVar.r(1);
    }

    public static j e(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(p.p(obj));
        }
        return null;
    }

    public static j f(s sVar, boolean z11) {
        return e(p.q(sVar, z11));
    }

    public org.bouncycastle.asn1.l h() {
        return this.f53156b;
    }

    public org.bouncycastle.asn1.k i() {
        return this.f53155a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f53155a);
        dVar.a(this.f53156b);
        return new w0(dVar);
    }
}