package f50;

import java.math.BigInteger;
import n60.e;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.p;

/* loaded from: classes5.dex */
public class h extends e40.c implements o {

    /* renamed from: a  reason: collision with root package name */
    private n60.e f25866a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f25867b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.k f25868c;

    public h(m mVar, BigInteger bigInteger, BigInteger bigInteger2, p pVar) {
        int x11;
        int i11;
        int i12;
        n60.e c0796e;
        this.f25868c = null;
        org.bouncycastle.asn1.k e11 = mVar.e();
        this.f25868c = e11;
        if (e11.j(o.f25884a0)) {
            c0796e = new e.f(((org.bouncycastle.asn1.i) mVar.h()).s(), new BigInteger(1, org.bouncycastle.asn1.l.p(pVar.r(0)).r()), new BigInteger(1, org.bouncycastle.asn1.l.p(pVar.r(1)).r()), bigInteger, bigInteger2);
        } else if (!this.f25868c.j(o.f25885b0)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        } else {
            p p11 = p.p(mVar.h());
            int x12 = ((org.bouncycastle.asn1.i) p11.r(0)).x();
            org.bouncycastle.asn1.k kVar = (org.bouncycastle.asn1.k) p11.r(1);
            if (kVar.j(o.f25886c0)) {
                i11 = org.bouncycastle.asn1.i.p(p11.r(2)).x();
                i12 = 0;
                x11 = 0;
            } else if (!kVar.j(o.f25887d0)) {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            } else {
                p p12 = p.p(p11.r(2));
                int x13 = org.bouncycastle.asn1.i.p(p12.r(0)).x();
                int x14 = org.bouncycastle.asn1.i.p(p12.r(1)).x();
                x11 = org.bouncycastle.asn1.i.p(p12.r(2)).x();
                i11 = x13;
                i12 = x14;
            }
            c0796e = new e.C0796e(x12, i11, i12, x11, new BigInteger(1, org.bouncycastle.asn1.l.p(pVar.r(0)).r()), new BigInteger(1, org.bouncycastle.asn1.l.p(pVar.r(1)).r()), bigInteger, bigInteger2);
        }
        this.f25866a = c0796e;
        if (pVar.size() == 3) {
            this.f25867b = ((j0) pVar.r(2)).q();
        }
    }

    public h(n60.e eVar, byte[] bArr) {
        this.f25868c = null;
        this.f25866a = eVar;
        this.f25867b = org.bouncycastle.util.a.h(bArr);
        h();
    }

    private void h() {
        org.bouncycastle.asn1.k kVar;
        if (n60.c.n(this.f25866a)) {
            kVar = o.f25884a0;
        } else if (!n60.c.l(this.f25866a)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        } else {
            kVar = o.f25885b0;
        }
        this.f25868c = kVar;
    }

    public n60.e e() {
        return this.f25866a;
    }

    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f25867b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    @Override // e40.c, e40.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.bouncycastle.asn1.n toASN1Primitive() {
        /*
            r3 = this;
            org.bouncycastle.asn1.d r0 = new org.bouncycastle.asn1.d
            r1 = 3
            r0.<init>(r1)
            org.bouncycastle.asn1.k r1 = r3.f25868c
            org.bouncycastle.asn1.k r2 = f50.o.f25884a0
            boolean r1 = r1.j(r2)
            if (r1 == 0) goto L35
            f50.l r1 = new f50.l
            n60.e r2 = r3.f25866a
            n60.f r2 = r2.n()
            r1.<init>(r2)
            org.bouncycastle.asn1.n r1 = r1.toASN1Primitive()
            r0.a(r1)
            f50.l r1 = new f50.l
            n60.e r2 = r3.f25866a
            n60.f r2 = r2.o()
            r1.<init>(r2)
        L2d:
            org.bouncycastle.asn1.n r1 = r1.toASN1Primitive()
            r0.a(r1)
            goto L5d
        L35:
            org.bouncycastle.asn1.k r1 = r3.f25868c
            org.bouncycastle.asn1.k r2 = f50.o.f25885b0
            boolean r1 = r1.j(r2)
            if (r1 == 0) goto L5d
            f50.l r1 = new f50.l
            n60.e r2 = r3.f25866a
            n60.f r2 = r2.n()
            r1.<init>(r2)
            org.bouncycastle.asn1.n r1 = r1.toASN1Primitive()
            r0.a(r1)
            f50.l r1 = new f50.l
            n60.e r2 = r3.f25866a
            n60.f r2 = r2.o()
            r1.<init>(r2)
            goto L2d
        L5d:
            byte[] r1 = r3.f25867b
            if (r1 == 0) goto L6b
            org.bouncycastle.asn1.j0 r1 = new org.bouncycastle.asn1.j0
            byte[] r2 = r3.f25867b
            r1.<init>(r2)
            r0.a(r1)
        L6b:
            org.bouncycastle.asn1.w0 r1 = new org.bouncycastle.asn1.w0
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.h.toASN1Primitive():org.bouncycastle.asn1.n");
    }
}