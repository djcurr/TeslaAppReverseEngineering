package e50;

/* loaded from: classes5.dex */
public class i0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f24716a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.p f24717b;

    private i0(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() < 1 || pVar.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        this.f24716a = org.bouncycastle.asn1.k.u(pVar.r(0));
        if (pVar.size() > 1) {
            this.f24717b = org.bouncycastle.asn1.p.p(pVar.r(1));
        }
    }

    public static i0 e(Object obj) {
        return (obj == null || (obj instanceof i0)) ? (i0) obj : new i0(org.bouncycastle.asn1.p.p(obj));
    }

    public org.bouncycastle.asn1.k f() {
        return this.f24716a;
    }

    public org.bouncycastle.asn1.p h() {
        return this.f24717b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f24716a);
        org.bouncycastle.asn1.p pVar = this.f24717b;
        if (pVar != null) {
            dVar.a(pVar);
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Policy information: ");
        stringBuffer.append(this.f24716a);
        if (this.f24717b != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i11 = 0; i11 < this.f24717b.size(); i11++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(", ");
                }
                stringBuffer2.append(j0.e(this.f24717b.r(i11)));
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}