package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f55664a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55665b;

    /* renamed from: c  reason: collision with root package name */
    private final q70.a f55666c;

    /* renamed from: d  reason: collision with root package name */
    private final e50.b f55667d;

    public b(int i11, int i12, q70.a aVar, e50.b bVar) {
        this.f55664a = i11;
        this.f55665b = i12;
        this.f55666c = new q70.a(aVar.c());
        this.f55667d = bVar;
    }

    private b(p pVar) {
        this.f55664a = ((org.bouncycastle.asn1.i) pVar.r(0)).x();
        this.f55665b = ((org.bouncycastle.asn1.i) pVar.r(1)).x();
        this.f55666c = new q70.a(((org.bouncycastle.asn1.l) pVar.r(2)).r());
        this.f55667d = e50.b.f(pVar.r(3));
    }

    public static b h(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(p.p(obj));
        }
        return null;
    }

    public e50.b e() {
        return this.f55667d;
    }

    public q70.a f() {
        return this.f55666c;
    }

    public int i() {
        return this.f55664a;
    }

    public int j() {
        return this.f55665b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(new org.bouncycastle.asn1.i(this.f55664a));
        dVar.a(new org.bouncycastle.asn1.i(this.f55665b));
        dVar.a(new s0(this.f55666c.c()));
        dVar.a(this.f55667d);
        return new w0(dVar);
    }
}