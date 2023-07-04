package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class h extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f55710a;

    /* renamed from: b  reason: collision with root package name */
    private final e50.b f55711b;

    public h(e50.b bVar) {
        this.f55710a = new org.bouncycastle.asn1.i(0L);
        this.f55711b = bVar;
    }

    private h(p pVar) {
        this.f55710a = org.bouncycastle.asn1.i.p(pVar.r(0));
        this.f55711b = e50.b.f(pVar.r(1));
    }

    public static final h e(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(p.p(obj));
        }
        return null;
    }

    public e50.b f() {
        return this.f55711b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(this.f55710a);
        dVar.a(this.f55711b);
        return new w0(dVar);
    }
}