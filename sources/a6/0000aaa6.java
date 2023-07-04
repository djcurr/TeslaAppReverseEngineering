package ph;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import ph.u;
import yh.m0;
import yh.n0;
import yh.u0;

/* loaded from: classes3.dex */
final class e extends u {

    /* renamed from: a  reason: collision with root package name */
    private Provider<Executor> f46499a;

    /* renamed from: b  reason: collision with root package name */
    private Provider<Context> f46500b;

    /* renamed from: c  reason: collision with root package name */
    private Provider f46501c;

    /* renamed from: d  reason: collision with root package name */
    private Provider f46502d;

    /* renamed from: e  reason: collision with root package name */
    private Provider f46503e;

    /* renamed from: f  reason: collision with root package name */
    private Provider<String> f46504f;

    /* renamed from: g  reason: collision with root package name */
    private Provider<m0> f46505g;

    /* renamed from: h  reason: collision with root package name */
    private Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.c> f46506h;

    /* renamed from: i  reason: collision with root package name */
    private Provider<xh.v> f46507i;

    /* renamed from: j  reason: collision with root package name */
    private Provider<wh.c> f46508j;

    /* renamed from: k  reason: collision with root package name */
    private Provider<xh.p> f46509k;

    /* renamed from: l  reason: collision with root package name */
    private Provider<xh.t> f46510l;

    /* renamed from: m  reason: collision with root package name */
    private Provider<t> f46511m;

    /* loaded from: classes3.dex */
    private static final class b implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f46512a;

        private b() {
        }

        @Override // ph.u.a
        /* renamed from: b */
        public b a(Context context) {
            this.f46512a = (Context) sh.d.b(context);
            return this;
        }

        @Override // ph.u.a
        public u build() {
            sh.d.a(this.f46512a, Context.class);
            return new e(this.f46512a);
        }
    }

    public static u.a j() {
        return new b();
    }

    private void l(Context context) {
        this.f46499a = sh.a.b(k.a());
        sh.b a11 = sh.c.a(context);
        this.f46500b = a11;
        qh.h a12 = qh.h.a(a11, ai.c.a(), ai.d.a());
        this.f46501c = a12;
        this.f46502d = sh.a.b(qh.j.a(this.f46500b, a12));
        this.f46503e = u0.a(this.f46500b, yh.g.a(), yh.i.a());
        this.f46504f = yh.h.a(this.f46500b);
        this.f46505g = sh.a.b(n0.a(ai.c.a(), ai.d.a(), yh.j.a(), this.f46503e, this.f46504f));
        wh.g b11 = wh.g.b(ai.c.a());
        this.f46506h = b11;
        wh.i a13 = wh.i.a(this.f46500b, this.f46505g, b11, ai.d.a());
        this.f46507i = a13;
        Provider<Executor> provider = this.f46499a;
        Provider provider2 = this.f46502d;
        Provider<m0> provider3 = this.f46505g;
        this.f46508j = wh.d.a(provider, provider2, a13, provider3, provider3);
        Provider<Context> provider4 = this.f46500b;
        Provider provider5 = this.f46502d;
        Provider<m0> provider6 = this.f46505g;
        this.f46509k = xh.q.a(provider4, provider5, provider6, this.f46507i, this.f46499a, provider6, ai.c.a(), ai.d.a(), this.f46505g);
        Provider<Executor> provider7 = this.f46499a;
        Provider<m0> provider8 = this.f46505g;
        this.f46510l = xh.u.a(provider7, provider8, this.f46507i, provider8);
        this.f46511m = sh.a.b(v.a(ai.c.a(), ai.d.a(), this.f46508j, this.f46509k, this.f46510l));
    }

    @Override // ph.u
    yh.d a() {
        return this.f46505g.mo0get();
    }

    @Override // ph.u
    t g() {
        return this.f46511m.mo0get();
    }

    private e(Context context) {
        l(context);
    }
}