package f50;

import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private j0 f25830a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.i f25831b;

    private b(p pVar) {
        if (pVar.size() == 2) {
            this.f25830a = j0.v(pVar.r(0));
            this.f25831b = org.bouncycastle.asn1.i.p(pVar.r(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static b e(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(p.p(obj));
        }
        return null;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f25830a);
        dVar.a(this.f25831b);
        return new w0(dVar);
    }
}