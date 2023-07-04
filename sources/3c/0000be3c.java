package x1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import t1.q0;
import t1.t0;
import v1.e;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: b  reason: collision with root package name */
    private t1.s f56689b;

    /* renamed from: c  reason: collision with root package name */
    private float f56690c;

    /* renamed from: d  reason: collision with root package name */
    private List<? extends f> f56691d;

    /* renamed from: e  reason: collision with root package name */
    private float f56692e;

    /* renamed from: f  reason: collision with root package name */
    private float f56693f;

    /* renamed from: g  reason: collision with root package name */
    private t1.s f56694g;

    /* renamed from: h  reason: collision with root package name */
    private int f56695h;

    /* renamed from: i  reason: collision with root package name */
    private int f56696i;

    /* renamed from: j  reason: collision with root package name */
    private float f56697j;

    /* renamed from: k  reason: collision with root package name */
    private float f56698k;

    /* renamed from: l  reason: collision with root package name */
    private float f56699l;

    /* renamed from: m  reason: collision with root package name */
    private float f56700m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f56701n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f56702o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f56703p;

    /* renamed from: q  reason: collision with root package name */
    private v1.j f56704q;

    /* renamed from: r  reason: collision with root package name */
    private final q0 f56705r;

    /* renamed from: s  reason: collision with root package name */
    private final q0 f56706s;

    /* renamed from: t  reason: collision with root package name */
    private final vz.k f56707t;

    /* renamed from: u  reason: collision with root package name */
    private final h f56708u;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<t0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56709a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final t0 invoke() {
            return t1.m.a();
        }
    }

    public e() {
        super(null);
        vz.k b11;
        this.f56690c = 1.0f;
        this.f56691d = p.e();
        p.b();
        this.f56692e = 1.0f;
        this.f56695h = p.c();
        this.f56696i = p.d();
        this.f56697j = 4.0f;
        this.f56699l = 1.0f;
        this.f56701n = true;
        this.f56702o = true;
        this.f56703p = true;
        this.f56705r = t1.n.a();
        this.f56706s = t1.n.a();
        b11 = vz.m.b(kotlin.b.NONE, a.f56709a);
        this.f56707t = b11;
        this.f56708u = new h();
    }

    private final void A() {
        this.f56706s.reset();
        if (this.f56698k == BitmapDescriptorFactory.HUE_RED) {
            if (this.f56699l == 1.0f) {
                q0.a.a(this.f56706s, this.f56705r, 0L, 2, null);
                return;
            }
        }
        f().a(this.f56705r, false);
        float length = f().getLength();
        float f11 = this.f56698k;
        float f12 = this.f56700m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f56699l + f12) % 1.0f) * length;
        if (f13 > f14) {
            f().b(f13, length, this.f56706s, true);
            f().b(BitmapDescriptorFactory.HUE_RED, f14, this.f56706s, true);
            return;
        }
        f().b(f13, f14, this.f56706s, true);
    }

    private final t0 f() {
        return (t0) this.f56707t.getValue();
    }

    private final void z() {
        this.f56708u.e();
        this.f56705r.reset();
        this.f56708u.b(this.f56691d).D(this.f56705r);
        A();
    }

    @Override // x1.j
    public void a(v1.e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        if (this.f56701n) {
            z();
        } else if (this.f56703p) {
            A();
        }
        this.f56701n = false;
        this.f56703p = false;
        t1.s sVar = this.f56689b;
        if (sVar != null) {
            e.b.g(eVar, this.f56706s, sVar, e(), null, null, 0, 56, null);
        }
        t1.s sVar2 = this.f56694g;
        if (sVar2 == null) {
            return;
        }
        v1.j jVar = this.f56704q;
        if (this.f56702o || jVar == null) {
            jVar = new v1.j(k(), j(), h(), i(), null, 16, null);
            this.f56704q = jVar;
            this.f56702o = false;
        }
        e.b.g(eVar, this.f56706s, sVar2, g(), jVar, null, 0, 48, null);
    }

    public final float e() {
        return this.f56690c;
    }

    public final float g() {
        return this.f56692e;
    }

    public final int h() {
        return this.f56695h;
    }

    public final int i() {
        return this.f56696i;
    }

    public final float j() {
        return this.f56697j;
    }

    public final float k() {
        return this.f56693f;
    }

    public final void l(t1.s sVar) {
        this.f56689b = sVar;
        c();
    }

    public final void m(float f11) {
        this.f56690c = f11;
        c();
    }

    public final void n(String value) {
        kotlin.jvm.internal.s.g(value, "value");
        c();
    }

    public final void o(List<? extends f> value) {
        kotlin.jvm.internal.s.g(value, "value");
        this.f56691d = value;
        this.f56701n = true;
        c();
    }

    public final void p(int i11) {
        this.f56706s.g(i11);
        c();
    }

    public final void q(t1.s sVar) {
        this.f56694g = sVar;
        c();
    }

    public final void r(float f11) {
        this.f56692e = f11;
        c();
    }

    public final void s(int i11) {
        this.f56695h = i11;
        this.f56702o = true;
        c();
    }

    public final void t(int i11) {
        this.f56696i = i11;
        this.f56702o = true;
        c();
    }

    public String toString() {
        return this.f56705r.toString();
    }

    public final void u(float f11) {
        this.f56697j = f11;
        this.f56702o = true;
        c();
    }

    public final void v(float f11) {
        this.f56693f = f11;
        c();
    }

    public final void w(float f11) {
        if (this.f56699l == f11) {
            return;
        }
        this.f56699l = f11;
        this.f56703p = true;
        c();
    }

    public final void x(float f11) {
        if (this.f56700m == f11) {
            return;
        }
        this.f56700m = f11;
        this.f56703p = true;
        c();
    }

    public final void y(float f11) {
        if (this.f56698k == f11) {
            return;
        }
        this.f56698k = f11;
        this.f56703p = true;
        c();
    }
}