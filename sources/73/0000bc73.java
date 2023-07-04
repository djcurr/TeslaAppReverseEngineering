package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class d extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f55675a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55676b;

    /* renamed from: c  reason: collision with root package name */
    private final q70.a f55677c;

    public d(int i11, int i12, q70.a aVar) {
        this.f55675a = i11;
        this.f55676b = i12;
        this.f55677c = new q70.a(aVar);
    }

    private d(p pVar) {
        this.f55675a = ((org.bouncycastle.asn1.i) pVar.r(0)).x();
        this.f55676b = ((org.bouncycastle.asn1.i) pVar.r(1)).x();
        this.f55677c = new q70.a(((org.bouncycastle.asn1.l) pVar.r(2)).r());
    }

    public static d f(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(p.p(obj));
        }
        return null;
    }

    public q70.a e() {
        return new q70.a(this.f55677c);
    }

    public int h() {
        return this.f55675a;
    }

    public int i() {
        return this.f55676b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(new org.bouncycastle.asn1.i(this.f55675a));
        dVar.a(new org.bouncycastle.asn1.i(this.f55676b));
        dVar.a(new s0(this.f55677c.c()));
        return new w0(dVar);
    }
}