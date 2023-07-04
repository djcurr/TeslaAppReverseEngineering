package a50;

import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private int f233a;

    /* renamed from: b  reason: collision with root package name */
    private int f234b;

    /* renamed from: c  reason: collision with root package name */
    private int f235c;

    /* renamed from: d  reason: collision with root package name */
    private int f236d;

    private a(p pVar) {
        this.f233a = i.p(pVar.r(0)).v();
        if (pVar.r(1) instanceof i) {
            this.f234b = ((i) pVar.r(1)).v();
        } else if (!(pVar.r(1) instanceof p)) {
            throw new IllegalArgumentException("object parse error");
        } else {
            p p11 = p.p(pVar.r(1));
            this.f234b = i.p(p11.r(0)).v();
            this.f235c = i.p(p11.r(1)).v();
            this.f236d = i.p(p11.r(2)).v();
        }
    }

    public static a e(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(p.p(obj));
        }
        return null;
    }

    public int f() {
        return this.f234b;
    }

    public int h() {
        return this.f235c;
    }

    public int i() {
        return this.f236d;
    }

    public int j() {
        return this.f233a;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(new i(this.f233a));
        if (this.f235c == 0) {
            dVar.a(new i(this.f234b));
        } else {
            org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d(3);
            dVar2.a(new i(this.f234b));
            dVar2.a(new i(this.f235c));
            dVar2.a(new i(this.f236d));
            dVar.a(new w0(dVar2));
        }
        return new w0(dVar);
    }
}