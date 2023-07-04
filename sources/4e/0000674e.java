package e50;

import java.util.Enumeration;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class p extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private n f24761a;

    /* renamed from: b  reason: collision with root package name */
    private n f24762b;

    public p(n nVar, n nVar2) {
        this.f24761a = nVar;
        this.f24762b = nVar2;
    }

    private p(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() != 1 && pVar.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        Enumeration s11 = pVar.s();
        while (s11.hasMoreElements()) {
            org.bouncycastle.asn1.s p11 = org.bouncycastle.asn1.s.p(s11.nextElement());
            if (p11.s() == 0) {
                this.f24761a = n.h(p11, true);
            } else if (p11.s() != 1) {
                throw new IllegalArgumentException("Bad tag number: " + p11.s());
            } else {
                this.f24762b = n.h(p11, true);
            }
        }
    }

    public static p f(Object obj) {
        if (obj == null || (obj instanceof p)) {
            return (p) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.p) {
            return new p((org.bouncycastle.asn1.p) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public n e() {
        return this.f24761a;
    }

    public n h() {
        return this.f24762b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        n nVar = this.f24761a;
        if (nVar != null) {
            dVar.a(new z0(0, nVar));
        }
        n nVar2 = this.f24762b;
        if (nVar2 != null) {
            dVar.a(new z0(1, nVar2));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}