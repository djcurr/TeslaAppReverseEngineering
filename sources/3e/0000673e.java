package e50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class j extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.c f24718a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.i f24719b;

    private j(org.bouncycastle.asn1.p pVar) {
        this.f24718a = org.bouncycastle.asn1.c.s(false);
        this.f24719b = null;
        if (pVar.size() == 0) {
            this.f24718a = null;
            this.f24719b = null;
            return;
        }
        if (pVar.r(0) instanceof org.bouncycastle.asn1.c) {
            this.f24718a = org.bouncycastle.asn1.c.q(pVar.r(0));
        } else {
            this.f24718a = null;
            this.f24719b = org.bouncycastle.asn1.i.p(pVar.r(0));
        }
        if (pVar.size() > 1) {
            if (this.f24718a == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.f24719b = org.bouncycastle.asn1.i.p(pVar.r(1));
        }
    }

    public static j e(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof v0) {
            return e(v0.a((v0) obj));
        }
        if (obj != null) {
            return new j(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public BigInteger f() {
        org.bouncycastle.asn1.i iVar = this.f24719b;
        if (iVar != null) {
            return iVar.s();
        }
        return null;
    }

    public boolean h() {
        org.bouncycastle.asn1.c cVar = this.f24718a;
        return cVar != null && cVar.t();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        org.bouncycastle.asn1.c cVar = this.f24718a;
        if (cVar != null) {
            dVar.a(cVar);
        }
        org.bouncycastle.asn1.i iVar = this.f24719b;
        if (iVar != null) {
            dVar.a(iVar);
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f24719b == null) {
            sb2 = new StringBuilder();
            sb2.append("BasicConstraints: isCa(");
            sb2.append(h());
            sb2.append(")");
        } else {
            sb2 = new StringBuilder();
            sb2.append("BasicConstraints: isCa(");
            sb2.append(h());
            sb2.append("), pathLenConstraint = ");
            sb2.append(this.f24719b.s());
        }
        return sb2.toString();
    }
}