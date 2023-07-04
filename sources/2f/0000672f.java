package e50;

/* loaded from: classes5.dex */
public class b0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private t f24663a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f24664b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24665c;

    /* renamed from: d  reason: collision with root package name */
    private k0 f24666d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f24667e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24668f;

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.asn1.p f24669g;

    private b0(org.bouncycastle.asn1.p pVar) {
        this.f24669g = pVar;
        for (int i11 = 0; i11 != pVar.size(); i11++) {
            org.bouncycastle.asn1.s p11 = org.bouncycastle.asn1.s.p(pVar.r(i11));
            int s11 = p11.s();
            if (s11 == 0) {
                this.f24663a = t.h(p11, true);
            } else if (s11 == 1) {
                this.f24664b = org.bouncycastle.asn1.c.r(p11, false).t();
            } else if (s11 == 2) {
                this.f24665c = org.bouncycastle.asn1.c.r(p11, false).t();
            } else if (s11 == 3) {
                this.f24666d = new k0(org.bouncycastle.asn1.j0.w(p11, false));
            } else if (s11 == 4) {
                this.f24667e = org.bouncycastle.asn1.c.r(p11, false).t();
            } else if (s11 != 5) {
                throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
            } else {
                this.f24668f = org.bouncycastle.asn1.c.r(p11, false).t();
            }
        }
    }

    private void e(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    private String f(boolean z11) {
        return z11 ? "true" : "false";
    }

    public static b0 i(Object obj) {
        if (obj instanceof b0) {
            return (b0) obj;
        }
        if (obj != null) {
            return new b0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public t h() {
        return this.f24663a;
    }

    public k0 j() {
        return this.f24666d;
    }

    public boolean k() {
        return this.f24667e;
    }

    public boolean m() {
        return this.f24668f;
    }

    public boolean n() {
        return this.f24665c;
    }

    public boolean o() {
        return this.f24664b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24669g;
    }

    public String toString() {
        String d11 = r70.m.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(d11);
        t tVar = this.f24663a;
        if (tVar != null) {
            e(stringBuffer, d11, "distributionPoint", tVar.toString());
        }
        boolean z11 = this.f24664b;
        if (z11) {
            e(stringBuffer, d11, "onlyContainsUserCerts", f(z11));
        }
        boolean z12 = this.f24665c;
        if (z12) {
            e(stringBuffer, d11, "onlyContainsCACerts", f(z12));
        }
        k0 k0Var = this.f24666d;
        if (k0Var != null) {
            e(stringBuffer, d11, "onlySomeReasons", k0Var.toString());
        }
        boolean z13 = this.f24668f;
        if (z13) {
            e(stringBuffer, d11, "onlyContainsAttributeCerts", f(z13));
        }
        boolean z14 = this.f24667e;
        if (z14) {
            e(stringBuffer, d11, "indirectCRL", f(z14));
        }
        stringBuffer.append("]");
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}