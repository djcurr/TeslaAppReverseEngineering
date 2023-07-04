package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class c extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private int f55668a;

    /* renamed from: b  reason: collision with root package name */
    private int f55669b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f55670c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f55671d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f55672e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f55673f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f55674g;

    public c(int i11, int i12, q70.b bVar, q70.i iVar, q70.h hVar, q70.h hVar2, q70.a aVar) {
        this.f55668a = i11;
        this.f55669b = i12;
        this.f55670c = bVar.e();
        this.f55671d = iVar.h();
        this.f55672e = aVar.c();
        this.f55673f = hVar.a();
        this.f55674g = hVar2.a();
    }

    private c(p pVar) {
        this.f55668a = ((org.bouncycastle.asn1.i) pVar.r(0)).x();
        this.f55669b = ((org.bouncycastle.asn1.i) pVar.r(1)).x();
        this.f55670c = ((org.bouncycastle.asn1.l) pVar.r(2)).r();
        this.f55671d = ((org.bouncycastle.asn1.l) pVar.r(3)).r();
        this.f55673f = ((org.bouncycastle.asn1.l) pVar.r(4)).r();
        this.f55674g = ((org.bouncycastle.asn1.l) pVar.r(5)).r();
        this.f55672e = ((org.bouncycastle.asn1.l) pVar.r(6)).r();
    }

    public static c h(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(p.p(obj));
        }
        return null;
    }

    public q70.b e() {
        return new q70.b(this.f55670c);
    }

    public q70.i f() {
        return new q70.i(e(), this.f55671d);
    }

    public int i() {
        return this.f55669b;
    }

    public int j() {
        return this.f55668a;
    }

    public q70.h k() {
        return new q70.h(this.f55673f);
    }

    public q70.h m() {
        return new q70.h(this.f55674g);
    }

    public q70.a n() {
        return new q70.a(this.f55672e);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(new org.bouncycastle.asn1.i(this.f55668a));
        dVar.a(new org.bouncycastle.asn1.i(this.f55669b));
        dVar.a(new s0(this.f55670c));
        dVar.a(new s0(this.f55671d));
        dVar.a(new s0(this.f55673f));
        dVar.a(new s0(this.f55674g));
        dVar.a(new s0(this.f55672e));
        return new w0(dVar);
    }
}