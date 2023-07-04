package w40;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.k1;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private c[] f55494a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55495b;

    private a(org.bouncycastle.asn1.p pVar) {
        this.f55495b = true;
        this.f55494a = new c[pVar.size()];
        int i11 = 0;
        while (true) {
            c[] cVarArr = this.f55494a;
            if (i11 == cVarArr.length) {
                this.f55495b = pVar instanceof b0;
                return;
            } else {
                cVarArr[i11] = c.h(pVar.r(i11));
                i11++;
            }
        }
    }

    public a(c[] cVarArr) {
        this.f55495b = true;
        this.f55494a = e(cVarArr);
    }

    private c[] e(c[] cVarArr) {
        int length = cVarArr.length;
        c[] cVarArr2 = new c[length];
        System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
        return cVarArr2;
    }

    public static a h(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public c[] f() {
        return e(this.f55494a);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f55495b ? new b0(this.f55494a) : new k1(this.f55494a);
    }
}