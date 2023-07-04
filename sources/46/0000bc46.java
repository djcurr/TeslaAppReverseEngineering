package w40;

import java.util.Enumeration;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class p extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.i f55563a;

    /* renamed from: b  reason: collision with root package name */
    private e50.b f55564b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.l f55565c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.asn1.q f55566d;

    /* renamed from: e  reason: collision with root package name */
    private org.bouncycastle.asn1.b f55567e;

    public p(e50.b bVar, e40.b bVar2) {
        this(bVar, bVar2, null, null);
    }

    public p(e50.b bVar, e40.b bVar2, org.bouncycastle.asn1.q qVar) {
        this(bVar, bVar2, qVar, null);
    }

    public p(e50.b bVar, e40.b bVar2, org.bouncycastle.asn1.q qVar, byte[] bArr) {
        this.f55563a = new org.bouncycastle.asn1.i(bArr != null ? r70.a.f49294b : r70.a.f49293a);
        this.f55564b = bVar;
        this.f55565c = new s0(bVar2);
        this.f55566d = qVar;
        this.f55567e = bArr == null ? null : new j0(bArr);
    }

    private p(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        org.bouncycastle.asn1.i p11 = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f55563a = p11;
        int k11 = k(p11);
        this.f55564b = e50.b.f(s11.nextElement());
        this.f55565c = org.bouncycastle.asn1.l.p(s11.nextElement());
        int i11 = -1;
        while (s11.hasMoreElements()) {
            org.bouncycastle.asn1.s sVar = (org.bouncycastle.asn1.s) s11.nextElement();
            int s12 = sVar.s();
            if (s12 <= i11) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (s12 == 0) {
                this.f55566d = org.bouncycastle.asn1.q.r(sVar, false);
            } else if (s12 != 1) {
                throw new IllegalArgumentException("unknown optional field in private key info");
            } else {
                if (k11 < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f55567e = j0.w(sVar, false);
            }
            i11 = s12;
        }
    }

    public static p f(Object obj) {
        if (obj instanceof p) {
            return (p) obj;
        }
        if (obj != null) {
            return new p(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    private static int k(org.bouncycastle.asn1.i iVar) {
        int x11 = iVar.x();
        if (x11 < 0 || x11 > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        return x11;
    }

    public org.bouncycastle.asn1.q e() {
        return this.f55566d;
    }

    public org.bouncycastle.asn1.l h() {
        return new s0(this.f55565c.r());
    }

    public e50.b i() {
        return this.f55564b;
    }

    public org.bouncycastle.asn1.b j() {
        return this.f55567e;
    }

    public boolean m() {
        return this.f55567e != null;
    }

    public e40.b n() {
        return org.bouncycastle.asn1.n.k(this.f55565c.r());
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(5);
        dVar.a(this.f55563a);
        dVar.a(this.f55564b);
        dVar.a(this.f55565c);
        org.bouncycastle.asn1.q qVar = this.f55566d;
        if (qVar != null) {
            dVar.a(new z0(false, 0, qVar));
        }
        org.bouncycastle.asn1.b bVar = this.f55567e;
        if (bVar != null) {
            dVar.a(new z0(false, 1, bVar));
        }
        return new w0(dVar);
    }
}