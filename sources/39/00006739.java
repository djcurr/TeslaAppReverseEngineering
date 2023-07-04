package e50;

import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class g0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f24698a;

    /* renamed from: b  reason: collision with root package name */
    private final e40.b f24699b;

    private g0(org.bouncycastle.asn1.p pVar) {
        this.f24698a = org.bouncycastle.asn1.k.u(pVar.r(0));
        this.f24699b = org.bouncycastle.asn1.s.p(pVar.r(1)).r();
    }

    public static g0 e(Object obj) {
        if (obj instanceof g0) {
            return (g0) obj;
        }
        if (obj != null) {
            return new g0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.k f() {
        return this.f24698a;
    }

    public e40.b h() {
        return this.f24699b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24698a);
        dVar.a(new z0(true, 0, this.f24699b));
        return new org.bouncycastle.asn1.w0(dVar);
    }
}