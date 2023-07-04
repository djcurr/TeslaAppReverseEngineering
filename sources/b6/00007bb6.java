package jf;

import android.content.Context;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.a1;
import com.facebook.imagepipeline.producers.v;
import com.facebook.imagepipeline.producers.z0;
import hf.q;
import hf.s;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: t  reason: collision with root package name */
    private static final Class<?> f33596t = l.class;

    /* renamed from: u  reason: collision with root package name */
    private static l f33597u;

    /* renamed from: v  reason: collision with root package name */
    private static boolean f33598v;

    /* renamed from: w  reason: collision with root package name */
    private static h f33599w;

    /* renamed from: a  reason: collision with root package name */
    private final z0 f33600a;

    /* renamed from: b  reason: collision with root package name */
    private final j f33601b;

    /* renamed from: c  reason: collision with root package name */
    private final a f33602c;

    /* renamed from: d  reason: collision with root package name */
    private hf.i<gd.d, nf.c> f33603d;

    /* renamed from: e  reason: collision with root package name */
    private hf.p<gd.d, nf.c> f33604e;

    /* renamed from: f  reason: collision with root package name */
    private hf.i<gd.d, PooledByteBuffer> f33605f;

    /* renamed from: g  reason: collision with root package name */
    private hf.p<gd.d, PooledByteBuffer> f33606g;

    /* renamed from: h  reason: collision with root package name */
    private hf.e f33607h;

    /* renamed from: i  reason: collision with root package name */
    private hd.i f33608i;

    /* renamed from: j  reason: collision with root package name */
    private lf.b f33609j;

    /* renamed from: k  reason: collision with root package name */
    private h f33610k;

    /* renamed from: l  reason: collision with root package name */
    private uf.d f33611l;

    /* renamed from: m  reason: collision with root package name */
    private o f33612m;

    /* renamed from: n  reason: collision with root package name */
    private p f33613n;

    /* renamed from: o  reason: collision with root package name */
    private hf.e f33614o;

    /* renamed from: p  reason: collision with root package name */
    private hd.i f33615p;

    /* renamed from: q  reason: collision with root package name */
    private gf.f f33616q;

    /* renamed from: r  reason: collision with root package name */
    private com.facebook.imagepipeline.platform.d f33617r;

    /* renamed from: s  reason: collision with root package name */
    private cf.a f33618s;

    public l(j jVar) {
        z0 a1Var;
        if (tf.b.d()) {
            tf.b.a("ImagePipelineConfig()");
        }
        j jVar2 = (j) md.k.g(jVar);
        this.f33601b = jVar2;
        if (jVar2.D().t()) {
            a1Var = new v(jVar.E().a());
        } else {
            a1Var = new a1(jVar.E().a());
        }
        this.f33600a = a1Var;
        qd.a.G0(jVar.D().b());
        this.f33602c = new a(jVar.w());
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    private h a() {
        return new h(r(), this.f33601b.f(), this.f33601b.a(), this.f33601b.b(), e(), h(), m(), s(), this.f33601b.y(), this.f33600a, this.f33601b.D().i(), this.f33601b.D().v(), this.f33601b.C(), this.f33601b);
    }

    private cf.a c() {
        if (this.f33618s == null) {
            this.f33618s = cf.b.a(o(), this.f33601b.E(), d(), this.f33601b.D().A(), this.f33601b.l());
        }
        return this.f33618s;
    }

    private lf.b i() {
        lf.b bVar;
        if (this.f33609j == null) {
            if (this.f33601b.r() != null) {
                this.f33609j = this.f33601b.r();
            } else {
                cf.a c11 = c();
                lf.b bVar2 = null;
                if (c11 != null) {
                    bVar2 = c11.c();
                    bVar = c11.b();
                } else {
                    bVar = null;
                }
                this.f33601b.o();
                this.f33609j = new lf.a(bVar2, bVar, p());
            }
        }
        return this.f33609j;
    }

    private uf.d k() {
        if (this.f33611l == null) {
            if (this.f33601b.n() == null && this.f33601b.m() == null && this.f33601b.D().w()) {
                this.f33611l = new uf.h(this.f33601b.D().f());
            } else {
                this.f33611l = new uf.f(this.f33601b.D().f(), this.f33601b.D().l(), this.f33601b.n(), this.f33601b.m(), this.f33601b.D().s());
            }
        }
        return this.f33611l;
    }

    public static l l() {
        return (l) md.k.h(f33597u, "ImagePipelineFactory was not initialized!");
    }

    private o q() {
        if (this.f33612m == null) {
            this.f33612m = this.f33601b.D().h().a(this.f33601b.getContext(), this.f33601b.t().k(), i(), this.f33601b.h(), this.f33601b.k(), this.f33601b.z(), this.f33601b.D().o(), this.f33601b.E(), this.f33601b.t().i(this.f33601b.u()), this.f33601b.t().j(), e(), h(), m(), s(), this.f33601b.y(), o(), this.f33601b.D().e(), this.f33601b.D().d(), this.f33601b.D().c(), this.f33601b.D().f(), f(), this.f33601b.D().B(), this.f33601b.D().j());
        }
        return this.f33612m;
    }

    private p r() {
        boolean z11 = Build.VERSION.SDK_INT >= 24 && this.f33601b.D().k();
        if (this.f33613n == null) {
            this.f33613n = new p(this.f33601b.getContext().getApplicationContext().getContentResolver(), q(), this.f33601b.c(), this.f33601b.z(), this.f33601b.D().y(), this.f33600a, this.f33601b.k(), z11, this.f33601b.D().x(), this.f33601b.p(), k(), this.f33601b.D().r(), this.f33601b.D().p(), this.f33601b.D().C(), this.f33601b.D().a());
        }
        return this.f33613n;
    }

    private hf.e s() {
        if (this.f33614o == null) {
            this.f33614o = new hf.e(t(), this.f33601b.t().i(this.f33601b.u()), this.f33601b.t().j(), this.f33601b.E().f(), this.f33601b.E().b(), this.f33601b.A());
        }
        return this.f33614o;
    }

    public static synchronized void u(Context context) {
        synchronized (l.class) {
            if (tf.b.d()) {
                tf.b.a("ImagePipelineFactory#initialize");
            }
            v(i.J(context).K());
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    public static synchronized void v(j jVar) {
        synchronized (l.class) {
            if (f33597u != null) {
                nd.a.C(f33596t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f33597u = new l(jVar);
        }
    }

    public mf.a b(Context context) {
        cf.a c11 = c();
        if (c11 == null) {
            return null;
        }
        return c11.a(context);
    }

    public hf.i<gd.d, nf.c> d() {
        if (this.f33603d == null) {
            this.f33603d = this.f33601b.x().a(this.f33601b.q(), this.f33601b.B(), this.f33601b.g(), this.f33601b.j());
        }
        return this.f33603d;
    }

    public hf.p<gd.d, nf.c> e() {
        if (this.f33604e == null) {
            this.f33604e = q.a(d(), this.f33601b.A());
        }
        return this.f33604e;
    }

    public a f() {
        return this.f33602c;
    }

    public hf.i<gd.d, PooledByteBuffer> g() {
        if (this.f33605f == null) {
            this.f33605f = hf.m.a(this.f33601b.s(), this.f33601b.B());
        }
        return this.f33605f;
    }

    public hf.p<gd.d, PooledByteBuffer> h() {
        s<gd.d, PooledByteBuffer> g11;
        if (this.f33606g == null) {
            if (this.f33601b.d() != null) {
                g11 = this.f33601b.d();
            } else {
                g11 = g();
            }
            this.f33606g = hf.n.a(g11, this.f33601b.A());
        }
        return this.f33606g;
    }

    public h j() {
        if (f33598v) {
            if (f33599w == null) {
                h a11 = a();
                f33599w = a11;
                this.f33610k = a11;
            }
            return f33599w;
        }
        if (this.f33610k == null) {
            this.f33610k = a();
        }
        return this.f33610k;
    }

    public hf.e m() {
        if (this.f33607h == null) {
            this.f33607h = new hf.e(n(), this.f33601b.t().i(this.f33601b.u()), this.f33601b.t().j(), this.f33601b.E().f(), this.f33601b.E().b(), this.f33601b.A());
        }
        return this.f33607h;
    }

    public hd.i n() {
        if (this.f33608i == null) {
            this.f33608i = this.f33601b.v().a(this.f33601b.e());
        }
        return this.f33608i;
    }

    public gf.f o() {
        if (this.f33616q == null) {
            this.f33616q = gf.g.a(this.f33601b.t(), p(), f());
        }
        return this.f33616q;
    }

    public com.facebook.imagepipeline.platform.d p() {
        if (this.f33617r == null) {
            this.f33617r = com.facebook.imagepipeline.platform.e.a(this.f33601b.t(), this.f33601b.D().u());
        }
        return this.f33617r;
    }

    public hd.i t() {
        if (this.f33615p == null) {
            this.f33615p = this.f33601b.v().a(this.f33601b.i());
        }
        return this.f33615p;
    }
}