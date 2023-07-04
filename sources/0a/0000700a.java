package g40;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class k extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.k f27762a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.asn1.l f27763b;

    public k(org.bouncycastle.asn1.k kVar, byte[] bArr) {
        this.f27762a = kVar;
        this.f27763b = new s0(org.bouncycastle.util.a.h(bArr));
    }

    private k(p pVar) {
        this.f27762a = org.bouncycastle.asn1.k.u(pVar.r(0));
        this.f27763b = org.bouncycastle.asn1.l.p(pVar.r(1));
    }

    public static k e(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.k f() {
        return this.f27762a;
    }

    public byte[] h() {
        return org.bouncycastle.util.a.h(this.f27763b.r());
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f27762a);
        dVar.a(this.f27763b);
        return new w0(dVar);
    }
}