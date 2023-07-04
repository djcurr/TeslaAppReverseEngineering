package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private int f55658a;

    /* renamed from: b  reason: collision with root package name */
    private int f55659b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f55660c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f55661d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f55662e;

    /* renamed from: f  reason: collision with root package name */
    private e50.b f55663f;

    public a(int i11, int i12, q70.b bVar, q70.i iVar, q70.h hVar, e50.b bVar2) {
        this.f55658a = i11;
        this.f55659b = i12;
        this.f55660c = bVar.e();
        this.f55661d = iVar.h();
        this.f55662e = hVar.a();
        this.f55663f = bVar2;
    }

    private a(p pVar) {
        this.f55658a = ((org.bouncycastle.asn1.i) pVar.r(0)).x();
        this.f55659b = ((org.bouncycastle.asn1.i) pVar.r(1)).x();
        this.f55660c = ((org.bouncycastle.asn1.l) pVar.r(2)).r();
        this.f55661d = ((org.bouncycastle.asn1.l) pVar.r(3)).r();
        this.f55662e = ((org.bouncycastle.asn1.l) pVar.r(4)).r();
        this.f55663f = e50.b.f(pVar.r(5));
    }

    public static a i(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(p.p(obj));
        }
        return null;
    }

    public e50.b e() {
        return this.f55663f;
    }

    public q70.b f() {
        return new q70.b(this.f55660c);
    }

    public q70.i h() {
        return new q70.i(f(), this.f55661d);
    }

    public int j() {
        return this.f55659b;
    }

    public int k() {
        return this.f55658a;
    }

    public q70.h m() {
        return new q70.h(this.f55662e);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(new org.bouncycastle.asn1.i(this.f55658a));
        dVar.a(new org.bouncycastle.asn1.i(this.f55659b));
        dVar.a(new s0(this.f55660c));
        dVar.a(new s0(this.f55661d));
        dVar.a(new s0(this.f55662e));
        dVar.a(this.f55663f);
        return new w0(dVar);
    }
}