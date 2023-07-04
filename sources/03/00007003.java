package g40;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class d extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final e50.b f27740a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.asn1.l f27741b;

    public d(e50.b bVar, byte[] bArr) {
        this.f27740a = bVar;
        this.f27741b = new s0(org.bouncycastle.util.a.h(bArr));
    }

    private d(p pVar) {
        this.f27740a = e50.b.f(pVar.r(0));
        this.f27741b = org.bouncycastle.asn1.l.p(pVar.r(1));
    }

    public static d f(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(p.p(obj));
        }
        return null;
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f27741b.r());
    }

    public e50.b h() {
        return this.f27740a;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f27740a);
        dVar.a(this.f27741b);
        return new w0(dVar);
    }
}