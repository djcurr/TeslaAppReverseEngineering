package e50;

import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class t extends e40.c implements e40.a {

    /* renamed from: a  reason: collision with root package name */
    e40.b f24778a;

    /* renamed from: b  reason: collision with root package name */
    int f24779b;

    public t(int i11, e40.b bVar) {
        this.f24779b = i11;
        this.f24778a = bVar;
    }

    public t(org.bouncycastle.asn1.s sVar) {
        int s11 = sVar.s();
        this.f24779b = s11;
        this.f24778a = s11 == 0 ? x.h(sVar, false) : org.bouncycastle.asn1.q.r(sVar, false);
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

    public static t f(Object obj) {
        if (obj == null || (obj instanceof t)) {
            return (t) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.s) {
            return new t((org.bouncycastle.asn1.s) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public static t h(org.bouncycastle.asn1.s sVar, boolean z11) {
        return f(org.bouncycastle.asn1.s.q(sVar, true));
    }

    public e40.b i() {
        return this.f24778a;
    }

    public int j() {
        return this.f24779b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return new z0(false, this.f24779b, this.f24778a);
    }

    public String toString() {
        String obj;
        String str;
        String d11 = r70.m.d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(d11);
        if (this.f24779b == 0) {
            obj = this.f24778a.toString();
            str = "fullName";
        } else {
            obj = this.f24778a.toString();
            str = "nameRelativeToCRLIssuer";
        }
        e(stringBuffer, d11, str, obj);
        stringBuffer.append("]");
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}