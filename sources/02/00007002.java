package g40;

import e50.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class c extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final w40.f f27738a;

    /* renamed from: b  reason: collision with root package name */
    private final n[] f27739b;

    private c(p pVar) {
        int i11 = 0;
        this.f27738a = w40.f.h(pVar.r(0));
        p p11 = p.p(pVar.r(1));
        this.f27739b = new n[p11.size()];
        while (true) {
            n[] nVarArr = this.f27739b;
            if (i11 == nVarArr.length) {
                return;
            }
            nVarArr[i11] = n.f(p11.r(i11));
            i11++;
        }
    }

    public c(w40.f fVar, n[] nVarArr) {
        this.f27738a = fVar;
        n[] nVarArr2 = new n[nVarArr.length];
        this.f27739b = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
    }

    public static c h(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(p.p(obj));
        }
        return null;
    }

    public n[] e() {
        n[] nVarArr = this.f27739b;
        n[] nVarArr2 = new n[nVarArr.length];
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        return nVarArr2;
    }

    public w40.f f() {
        return this.f27738a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f27738a);
        dVar.a(new w0(this.f27739b));
        return new w0(dVar);
    }
}