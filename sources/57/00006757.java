package e50;

import java.text.ParseException;
import java.util.Date;

/* loaded from: classes5.dex */
public class t0 extends e40.c implements e40.a {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.n f24780a;

    public t0(org.bouncycastle.asn1.n nVar) {
        if (!(nVar instanceof org.bouncycastle.asn1.t) && !(nVar instanceof org.bouncycastle.asn1.g)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.f24780a = nVar;
    }

    public static t0 f(Object obj) {
        if (obj == null || (obj instanceof t0)) {
            return (t0) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.t) {
            return new t0((org.bouncycastle.asn1.t) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.g) {
            return new t0((org.bouncycastle.asn1.g) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public Date e() {
        try {
            org.bouncycastle.asn1.n nVar = this.f24780a;
            return nVar instanceof org.bouncycastle.asn1.t ? ((org.bouncycastle.asn1.t) nVar).p() : ((org.bouncycastle.asn1.g) nVar).s();
        } catch (ParseException e11) {
            throw new IllegalStateException("invalid date string: " + e11.getMessage());
        }
    }

    public String h() {
        org.bouncycastle.asn1.n nVar = this.f24780a;
        return nVar instanceof org.bouncycastle.asn1.t ? ((org.bouncycastle.asn1.t) nVar).q() : ((org.bouncycastle.asn1.g) nVar).v();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24780a;
    }

    public String toString() {
        return h();
    }
}