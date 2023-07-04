package e50;

/* loaded from: classes5.dex */
public class k extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.p f24722a;

    private k(org.bouncycastle.asn1.p pVar) {
        this.f24722a = null;
        this.f24722a = pVar;
    }

    public static k f(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public s[] e() {
        s[] sVarArr = new s[this.f24722a.size()];
        for (int i11 = 0; i11 != this.f24722a.size(); i11++) {
            sVarArr[i11] = s.i(this.f24722a.r(i11));
        }
        return sVarArr;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24722a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = r70.m.d();
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(d11);
        s[] e11 = e();
        for (int i11 = 0; i11 != e11.length; i11++) {
            stringBuffer.append("    ");
            stringBuffer.append(e11[i11]);
            stringBuffer.append(d11);
        }
        return stringBuffer.toString();
    }
}