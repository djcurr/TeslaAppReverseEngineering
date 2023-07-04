package u40;

import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private k f53135a;

    /* renamed from: b  reason: collision with root package name */
    private e50.b f53136b;

    /* renamed from: c  reason: collision with root package name */
    private j0 f53137c;

    /* renamed from: d  reason: collision with root package name */
    private p f53138d;

    private a(p pVar) {
        this.f53135a = k.e(pVar.r(0));
        this.f53136b = e50.b.f(pVar.r(1));
        this.f53137c = (j0) pVar.r(2);
        if (pVar.size() > 3) {
            this.f53138d = p.q((s) pVar.r(3), true);
        }
    }

    public static a f(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(p.p(obj));
        }
        return null;
    }

    public p e() {
        return this.f53138d;
    }

    public j0 h() {
        return this.f53137c;
    }

    public e50.b i() {
        return this.f53136b;
    }

    public k j() {
        return this.f53135a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        dVar.a(this.f53135a);
        dVar.a(this.f53136b);
        dVar.a(this.f53137c);
        p pVar = this.f53138d;
        if (pVar != null) {
            dVar.a(new z0(true, 0, pVar));
        }
        return new w0(dVar);
    }
}