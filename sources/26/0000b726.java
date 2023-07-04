package u40;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class f extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    g f53149a;

    /* renamed from: b  reason: collision with root package name */
    j f53150b;

    private f(p pVar) {
        this.f53149a = g.e(pVar.r(0));
        if (pVar.size() == 2) {
            this.f53150b = j.f((s) pVar.r(1), true);
        }
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

    public j f() {
        return this.f53150b;
    }

    public g h() {
        return this.f53149a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f53149a);
        j jVar = this.f53150b;
        if (jVar != null) {
            dVar.a(new z0(true, 0, jVar));
        }
        return new w0(dVar);
    }
}