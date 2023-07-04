package f50;

import java.math.BigInteger;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class m extends e40.c implements o {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f25882a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.n f25883b;

    public m(int i11, int i12) {
        this(i11, i12, 0, 0);
    }

    public m(int i11, int i12, int i13, int i14) {
        this.f25882a = o.f25885b0;
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(new org.bouncycastle.asn1.i(i11));
        if (i13 == 0) {
            if (i14 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            dVar.a(o.f25886c0);
            dVar.a(new org.bouncycastle.asn1.i(i12));
        } else if (i13 <= i12 || i14 <= i13) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            dVar.a(o.f25887d0);
            org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d(3);
            dVar2.a(new org.bouncycastle.asn1.i(i12));
            dVar2.a(new org.bouncycastle.asn1.i(i13));
            dVar2.a(new org.bouncycastle.asn1.i(i14));
            dVar.a(new w0(dVar2));
        }
        this.f25883b = new w0(dVar);
    }

    public m(BigInteger bigInteger) {
        this.f25882a = o.f25884a0;
        this.f25883b = new org.bouncycastle.asn1.i(bigInteger);
    }

    private m(p pVar) {
        this.f25882a = org.bouncycastle.asn1.k.u(pVar.r(0));
        this.f25883b = pVar.r(1).toASN1Primitive();
    }

    public static m f(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.k e() {
        return this.f25882a;
    }

    public org.bouncycastle.asn1.n h() {
        return this.f25883b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f25882a);
        dVar.a(this.f25883b);
        return new w0(dVar);
    }
}