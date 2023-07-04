package u40;

import e50.v;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class n extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private b f53166a;

    /* renamed from: b  reason: collision with root package name */
    private c f53167b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.g f53168c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.asn1.g f53169d;

    /* renamed from: e  reason: collision with root package name */
    private v f53170e;

    private n(p pVar) {
        s sVar;
        this.f53166a = b.f(pVar.r(0));
        this.f53167b = c.e(pVar.r(1));
        this.f53168c = org.bouncycastle.asn1.g.t(pVar.r(2));
        if (pVar.size() > 4) {
            this.f53169d = org.bouncycastle.asn1.g.u((s) pVar.r(3), true);
            sVar = (s) pVar.r(4);
        } else if (pVar.size() <= 3) {
            return;
        } else {
            sVar = (s) pVar.r(3);
            if (sVar.s() == 0) {
                this.f53169d = org.bouncycastle.asn1.g.u(sVar, true);
                return;
            }
        }
        this.f53170e = v.h(sVar, true);
    }

    public static n h(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(p.p(obj));
        }
        return null;
    }

    public b e() {
        return this.f53166a;
    }

    public c f() {
        return this.f53167b;
    }

    public org.bouncycastle.asn1.g i() {
        return this.f53169d;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(5);
        dVar.a(this.f53166a);
        dVar.a(this.f53167b);
        dVar.a(this.f53168c);
        org.bouncycastle.asn1.g gVar = this.f53169d;
        if (gVar != null) {
            dVar.a(new z0(true, 0, gVar));
        }
        v vVar = this.f53170e;
        if (vVar != null) {
            dVar.a(new z0(true, 1, vVar));
        }
        return new w0(dVar);
    }
}