package c50;

import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.x0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private q f8880a;

    public b(k kVar, e40.b bVar) {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(kVar);
        dVar.a(bVar);
        this.f8880a = new x0(new w0(dVar));
    }

    private b(q qVar) {
        this.f8880a = qVar;
    }

    public b(a[] aVarArr) {
        this.f8880a = new x0(aVarArr);
    }

    public static b h(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(q.q(obj));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(k kVar) {
        int size = this.f8880a.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (a.e(this.f8880a.s(i11)).f().j(kVar)) {
                return true;
            }
        }
        return false;
    }

    public a f() {
        if (this.f8880a.size() == 0) {
            return null;
        }
        return a.e(this.f8880a.s(0));
    }

    public a[] i() {
        int size = this.f8880a.size();
        a[] aVarArr = new a[size];
        for (int i11 = 0; i11 != size; i11++) {
            aVarArr[i11] = a.e(this.f8880a.s(i11));
        }
        return aVarArr;
    }

    public boolean j() {
        return this.f8880a.size() > 1;
    }

    public int size() {
        return this.f8880a.size();
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        return this.f8880a;
    }
}