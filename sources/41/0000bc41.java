package w40;

import java.util.Enumeration;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class k extends e40.c implements n {

    /* renamed from: a  reason: collision with root package name */
    private h f55515a;

    /* renamed from: b  reason: collision with root package name */
    private g f55516b;

    private k(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(((e40.b) s11.nextElement()).toASN1Primitive());
        e40.b r11 = p11.r(0);
        org.bouncycastle.asn1.k kVar = n.P1;
        if (r11.equals(kVar)) {
            this.f55515a = new h(kVar, l.e(p11.r(1)));
        } else {
            this.f55515a = h.f(p11);
        }
        this.f55516b = g.f(s11.nextElement());
    }

    public k(h hVar, g gVar) {
        this.f55515a = hVar;
        this.f55516b = gVar;
    }

    public static k f(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public g e() {
        return this.f55516b;
    }

    public h h() {
        return this.f55515a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f55515a);
        dVar.a(this.f55516b);
        return new w0(dVar);
    }
}