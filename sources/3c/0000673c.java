package e50;

import com.adyen.checkout.components.model.payments.request.Address;
import java.util.Enumeration;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class i extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.l f24713a;

    /* renamed from: b  reason: collision with root package name */
    x f24714b;

    /* renamed from: c  reason: collision with root package name */
    org.bouncycastle.asn1.i f24715c;

    protected i(org.bouncycastle.asn1.p pVar) {
        this.f24713a = null;
        this.f24714b = null;
        this.f24715c = null;
        Enumeration s11 = pVar.s();
        while (s11.hasMoreElements()) {
            org.bouncycastle.asn1.s p11 = org.bouncycastle.asn1.s.p(s11.nextElement());
            int s12 = p11.s();
            if (s12 == 0) {
                this.f24713a = org.bouncycastle.asn1.l.q(p11, false);
            } else if (s12 == 1) {
                this.f24714b = x.h(p11, false);
            } else if (s12 != 2) {
                throw new IllegalArgumentException("illegal tag");
            } else {
                this.f24715c = org.bouncycastle.asn1.i.q(p11, false);
            }
        }
    }

    public static i e(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public byte[] f() {
        org.bouncycastle.asn1.l lVar = this.f24713a;
        if (lVar != null) {
            return lVar.r();
        }
        return null;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        org.bouncycastle.asn1.l lVar = this.f24713a;
        if (lVar != null) {
            dVar.a(new z0(false, 0, lVar));
        }
        x xVar = this.f24714b;
        if (xVar != null) {
            dVar.a(new z0(false, 1, xVar));
        }
        org.bouncycastle.asn1.i iVar = this.f24715c;
        if (iVar != null) {
            dVar.a(new z0(false, 2, iVar));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }

    public String toString() {
        org.bouncycastle.asn1.l lVar = this.f24713a;
        String f11 = lVar != null ? org.bouncycastle.util.encoders.b.f(lVar.r()) : Address.ADDRESS_NULL_PLACEHOLDER;
        return "AuthorityKeyIdentifier: KeyID(" + f11 + ")";
    }
}