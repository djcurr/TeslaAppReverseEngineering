package e50;

/* loaded from: classes5.dex */
public class x extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final w[] f24817a;

    public x(w wVar) {
        this.f24817a = new w[]{wVar};
    }

    private x(org.bouncycastle.asn1.p pVar) {
        this.f24817a = new w[pVar.size()];
        for (int i11 = 0; i11 != pVar.size(); i11++) {
            this.f24817a[i11] = w.f(pVar.r(i11));
        }
    }

    private static w[] e(w[] wVarArr) {
        w[] wVarArr2 = new w[wVarArr.length];
        System.arraycopy(wVarArr, 0, wVarArr2, 0, wVarArr.length);
        return wVarArr2;
    }

    public static x f(Object obj) {
        if (obj instanceof x) {
            return (x) obj;
        }
        if (obj != null) {
            return new x(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public static x h(org.bouncycastle.asn1.s sVar, boolean z11) {
        return new x(org.bouncycastle.asn1.p.q(sVar, z11));
    }

    public w[] i() {
        return e(this.f24817a);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return new org.bouncycastle.asn1.w0(this.f24817a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = r70.m.d();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(d11);
        for (int i11 = 0; i11 != this.f24817a.length; i11++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.f24817a[i11]);
            stringBuffer.append(d11);
        }
        return stringBuffer.toString();
    }
}