package e50;

/* loaded from: classes5.dex */
public class h extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private a[] f24700a;

    private h(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() < 1) {
            throw new IllegalArgumentException("sequence may not be empty");
        }
        this.f24700a = new a[pVar.size()];
        for (int i11 = 0; i11 != pVar.size(); i11++) {
            this.f24700a[i11] = a.h(pVar.r(i11));
        }
    }

    private static a[] e(a[] aVarArr) {
        a[] aVarArr2 = new a[aVarArr.length];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        return aVarArr2;
    }

    public static h h(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public a[] f() {
        return e(this.f24700a);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return new org.bouncycastle.asn1.w0(this.f24700a);
    }

    public String toString() {
        return "AuthorityInformationAccess: Oid(" + this.f24700a[0].f().t() + ")";
    }
}