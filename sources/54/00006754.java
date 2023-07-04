package e50;

import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class s extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    t f24774a;

    /* renamed from: b  reason: collision with root package name */
    k0 f24775b;

    /* renamed from: c  reason: collision with root package name */
    x f24776c;

    public s(t tVar, k0 k0Var, x xVar) {
        this.f24774a = tVar;
        this.f24775b = k0Var;
        this.f24776c = xVar;
    }

    public s(org.bouncycastle.asn1.p pVar) {
        for (int i11 = 0; i11 != pVar.size(); i11++) {
            org.bouncycastle.asn1.s p11 = org.bouncycastle.asn1.s.p(pVar.r(i11));
            int s11 = p11.s();
            if (s11 == 0) {
                this.f24774a = t.h(p11, true);
            } else if (s11 == 1) {
                this.f24775b = new k0(org.bouncycastle.asn1.j0.w(p11, false));
            } else if (s11 != 2) {
                throw new IllegalArgumentException("Unknown tag encountered in structure: " + p11.s());
            } else {
                this.f24776c = x.h(p11, false);
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

    public static s i(Object obj) {
        if (obj == null || (obj instanceof s)) {
            return (s) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.p) {
            return new s((org.bouncycastle.asn1.p) obj);
        }
        throw new IllegalArgumentException("Invalid DistributionPoint: " + obj.getClass().getName());
    }

    public x f() {
        return this.f24776c;
    }

    public t h() {
        return this.f24774a;
    }

    public k0 j() {
        return this.f24775b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        t tVar = this.f24774a;
        if (tVar != null) {
            dVar.a(new z0(0, tVar));
        }
        k0 k0Var = this.f24775b;
        if (k0Var != null) {
            dVar.a(new z0(false, 1, k0Var));
        }
        x xVar = this.f24776c;
        if (xVar != null) {
            dVar.a(new z0(false, 2, xVar));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }

    public String toString() {
        String d11 = r70.m.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(d11);
        t tVar = this.f24774a;
        if (tVar != null) {
            e(stringBuffer, d11, "distributionPoint", tVar.toString());
        }
        k0 k0Var = this.f24775b;
        if (k0Var != null) {
            e(stringBuffer, d11, "reasons", k0Var.toString());
        }
        x xVar = this.f24776c;
        if (xVar != null) {
            e(stringBuffer, d11, "cRLIssuer", xVar.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}