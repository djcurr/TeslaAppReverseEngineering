package g40;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class j extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final e50.b f27759a;

    /* renamed from: b  reason: collision with root package name */
    private final w40.h f27760b;

    /* renamed from: c  reason: collision with root package name */
    private final org.bouncycastle.asn1.l f27761c;

    public j(e50.b bVar, w40.h hVar, byte[] bArr) {
        this.f27759a = bVar;
        this.f27760b = hVar;
        this.f27761c = new s0(org.bouncycastle.util.a.h(bArr));
    }

    private j(p pVar) {
        this.f27759a = e50.b.f(pVar.r(0));
        this.f27760b = w40.h.f(pVar.r(1));
        this.f27761c = org.bouncycastle.asn1.l.p(pVar.r(2));
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

    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f27761c.r());
    }

    public e50.b h() {
        return this.f27759a;
    }

    public w40.h i() {
        return this.f27760b;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f27759a);
        dVar.a(this.f27760b);
        dVar.a(this.f27761c);
        return new w0(dVar);
    }
}