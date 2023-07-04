package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class i extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f55712a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55713b;

    /* renamed from: c  reason: collision with root package name */
    private final e50.b f55714c;

    public i(int i11, e50.b bVar) {
        this.f55712a = new org.bouncycastle.asn1.i(0L);
        this.f55713b = i11;
        this.f55714c = bVar;
    }

    private i(p pVar) {
        this.f55712a = org.bouncycastle.asn1.i.p(pVar.r(0));
        this.f55713b = org.bouncycastle.asn1.i.p(pVar.r(1)).x();
        this.f55714c = e50.b.f(pVar.r(2));
    }

    public static i f(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(p.p(obj));
        }
        return null;
    }

    public int e() {
        return this.f55713b;
    }

    public e50.b h() {
        return this.f55714c;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(this.f55712a);
        dVar.a(new org.bouncycastle.asn1.i(this.f55713b));
        dVar.a(this.f55714c);
        return new w0(dVar);
    }
}