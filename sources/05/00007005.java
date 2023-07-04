package g40;

import java.util.Iterator;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.util.a;

/* loaded from: classes5.dex */
public class f extends e40.c implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    private final e40.b[] f27748a;

    private f(p pVar) {
        this.f27748a = new e40.b[pVar.size()];
        int i11 = 0;
        while (true) {
            e40.b[] bVarArr = this.f27748a;
            if (i11 == bVarArr.length) {
                return;
            }
            bVarArr[i11] = e.i(pVar.r(i11));
            i11++;
        }
    }

    public f(e[] eVarArr) {
        e40.b[] bVarArr = new e40.b[eVarArr.length];
        this.f27748a = bVarArr;
        System.arraycopy(eVarArr, 0, bVarArr, 0, eVarArr.length);
    }

    public static f e(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(p.p(obj));
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<e40.b> iterator() {
        return new a.C0862a(this.f27748a);
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        return new w0(this.f27748a);
    }
}