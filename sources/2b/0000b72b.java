package u40;

import e50.v;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class k extends e40.c {

    /* renamed from: g  reason: collision with root package name */
    private static final org.bouncycastle.asn1.i f53157g = new org.bouncycastle.asn1.i(0);

    /* renamed from: a  reason: collision with root package name */
    private boolean f53158a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.i f53159b;

    /* renamed from: c  reason: collision with root package name */
    private i f53160c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.asn1.g f53161d;

    /* renamed from: e  reason: collision with root package name */
    private p f53162e;

    /* renamed from: f  reason: collision with root package name */
    private v f53163f;

    private k(p pVar) {
        int i11 = 0;
        if ((pVar.r(0) instanceof s) && ((s) pVar.r(0)).s() == 0) {
            this.f53158a = true;
            this.f53159b = org.bouncycastle.asn1.i.q((s) pVar.r(0), true);
            i11 = 1;
        } else {
            this.f53159b = f53157g;
        }
        int i12 = i11 + 1;
        this.f53160c = i.e(pVar.r(i11));
        int i13 = i12 + 1;
        this.f53161d = org.bouncycastle.asn1.g.t(pVar.r(i12));
        int i14 = i13 + 1;
        this.f53162e = (p) pVar.r(i13);
        if (pVar.size() > i14) {
            this.f53163f = v.h((s) pVar.r(i14), true);
        }
    }

    public static k e(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(p.p(obj));
        }
        return null;
    }

    public i f() {
        return this.f53160c;
    }

    public v h() {
        return this.f53163f;
    }

    public p i() {
        return this.f53162e;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(5);
        if (this.f53158a || !this.f53159b.j(f53157g)) {
            dVar.a(new z0(true, 0, this.f53159b));
        }
        dVar.a(this.f53160c);
        dVar.a(this.f53161d);
        dVar.a(this.f53162e);
        v vVar = this.f53163f;
        if (vVar != null) {
            dVar.a(new z0(true, 1, vVar));
        }
        return new w0(dVar);
    }
}