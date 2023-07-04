package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class j extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f55715a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55716b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55717c;

    /* renamed from: d  reason: collision with root package name */
    private final e50.b f55718d;

    public j(int i11, int i12, e50.b bVar) {
        this.f55715a = new org.bouncycastle.asn1.i(0L);
        this.f55716b = i11;
        this.f55717c = i12;
        this.f55718d = bVar;
    }

    private j(p pVar) {
        this.f55715a = org.bouncycastle.asn1.i.p(pVar.r(0));
        this.f55716b = org.bouncycastle.asn1.i.p(pVar.r(1)).x();
        this.f55717c = org.bouncycastle.asn1.i.p(pVar.r(2)).x();
        this.f55718d = e50.b.f(pVar.r(3));
    }

    public static j f(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(p.p(obj));
        }
        return null;
    }

    public int e() {
        return this.f55716b;
    }

    public int h() {
        return this.f55717c;
    }

    public e50.b i() {
        return this.f55718d;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(this.f55715a);
        dVar.a(new org.bouncycastle.asn1.i(this.f55716b));
        dVar.a(new org.bouncycastle.asn1.i(this.f55717c));
        dVar.a(this.f55718d);
        return new w0(dVar);
    }
}