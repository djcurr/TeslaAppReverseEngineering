package w40;

import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f55496a;

    /* renamed from: b  reason: collision with root package name */
    private e40.b f55497b;

    public b(org.bouncycastle.asn1.k kVar, e40.b bVar) {
        this.f55496a = kVar;
        this.f55497b = bVar;
    }

    private b(org.bouncycastle.asn1.p pVar) {
        this.f55496a = org.bouncycastle.asn1.k.u(pVar.r(0));
        this.f55497b = org.bouncycastle.asn1.s.p(pVar.r(1)).r();
    }

    public static b h(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.k e() {
        return this.f55496a;
    }

    public e40.b f() {
        return this.f55497b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f55496a);
        dVar.a(new z0(0, this.f55497b));
        return new w0(dVar);
    }
}