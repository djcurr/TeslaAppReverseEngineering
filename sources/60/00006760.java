package e50;

import java.math.BigInteger;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class y extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private w f24847a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.i f24848b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.i f24849c;

    static {
        BigInteger.valueOf(0L);
    }

    private y(org.bouncycastle.asn1.p pVar) {
        org.bouncycastle.asn1.s p11;
        this.f24847a = w.f(pVar.r(0));
        int size = pVar.size();
        if (size != 1) {
            if (size == 2) {
                p11 = org.bouncycastle.asn1.s.p(pVar.r(1));
                int s11 = p11.s();
                if (s11 == 0) {
                    this.f24848b = org.bouncycastle.asn1.i.q(p11, false);
                    return;
                } else if (s11 != 1) {
                    throw new IllegalArgumentException("Bad tag number: " + p11.s());
                }
            } else if (size != 3) {
                throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
            } else {
                org.bouncycastle.asn1.s p12 = org.bouncycastle.asn1.s.p(pVar.r(1));
                if (p12.s() != 0) {
                    throw new IllegalArgumentException("Bad tag number for 'minimum': " + p12.s());
                }
                this.f24848b = org.bouncycastle.asn1.i.q(p12, false);
                p11 = org.bouncycastle.asn1.s.p(pVar.r(2));
                if (p11.s() != 1) {
                    throw new IllegalArgumentException("Bad tag number for 'maximum': " + p11.s());
                }
            }
            this.f24849c = org.bouncycastle.asn1.i.q(p11, false);
        }
    }

    public static y f(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof y ? (y) obj : new y(org.bouncycastle.asn1.p.p(obj));
    }

    public w e() {
        return this.f24847a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f24847a);
        org.bouncycastle.asn1.i iVar = this.f24848b;
        if (iVar != null && !iVar.t(0)) {
            dVar.a(new z0(false, 0, this.f24848b));
        }
        org.bouncycastle.asn1.i iVar2 = this.f24849c;
        if (iVar2 != null) {
            dVar.a(new z0(false, 1, iVar2));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}