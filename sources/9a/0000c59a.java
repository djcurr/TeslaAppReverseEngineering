package zv;

import android.content.Context;
import android.net.Uri;
import com.squareup.moshi.f;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.withpersona.sdk.inquiry.network.JsonAdapterBinding;
import com.withpersona.sdk.inquiry.network.NetworkConstants_ViewRegistryFactory;
import com.withpersona.sdk.inquiry.network.NetworkModule;
import com.withpersona.sdk.inquiry.network.NetworkModule_InterceptorFactory;
import com.withpersona.sdk.inquiry.network.NetworkModule_KeyInflectionFactory;
import com.withpersona.sdk.inquiry.network.NetworkModule_MoshiFactory;
import com.withpersona.sdk.inquiry.network.NetworkModule_OkhttpClientFactory;
import com.withpersona.sdk.inquiry.network.NetworkModule_RetrofitFactory;
import dw.l;
import gw.o;
import iw.a;
import iw.c;
import iw.d;
import iw.e;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import pv.r;
import sv.a;
import sv.d;
import sv.e;
import vv.b;
import wv.h;
import yv.a;
import yv.c;
import yv.d;
import yv.e;
import zv.a;
import zv.b;
import zv.c;
import zv.d;
import zv.p0;

/* loaded from: classes6.dex */
public final class e implements m {
    private Provider<pv.v> A;
    private Provider<wv.j> B;
    private Provider<Set<pr.u<?>>> C;
    private Provider<pv.x> D;
    private Provider<gw.p> E;
    private Provider<Set<pr.u<?>>> F;
    private Provider<Set<pr.u<?>>> G;
    private Provider<pr.v> H;

    /* renamed from: a  reason: collision with root package name */
    private final h f60856a;

    /* renamed from: b  reason: collision with root package name */
    private Provider<Interceptor> f60857b;

    /* renamed from: c  reason: collision with root package name */
    private Provider<String> f60858c;

    /* renamed from: d  reason: collision with root package name */
    private Provider<Map<String, String>> f60859d;

    /* renamed from: e  reason: collision with root package name */
    private Provider<OkHttpClient> f60860e;

    /* renamed from: f  reason: collision with root package name */
    private Provider<Set<Object>> f60861f;

    /* renamed from: g  reason: collision with root package name */
    private Provider<Set<JsonAdapterBinding<?>>> f60862g;

    /* renamed from: h  reason: collision with root package name */
    private Provider<Set<f.d>> f60863h;

    /* renamed from: i  reason: collision with root package name */
    private Provider<com.squareup.moshi.p> f60864i;

    /* renamed from: j  reason: collision with root package name */
    private Provider<retrofit2.t> f60865j;

    /* renamed from: k  reason: collision with root package name */
    private Provider<bw.n> f60866k;

    /* renamed from: l  reason: collision with root package name */
    private Provider<Context> f60867l;

    /* renamed from: m  reason: collision with root package name */
    private Provider<f> f60868m;

    /* renamed from: n  reason: collision with root package name */
    private Provider<fw.a> f60869n;

    /* renamed from: o  reason: collision with root package name */
    private Provider<yv.b> f60870o;

    /* renamed from: p  reason: collision with root package name */
    private Provider<androidx.activity.result.d<String>> f60871p;

    /* renamed from: q  reason: collision with root package name */
    private Provider<x20.e<r.a>> f60872q;

    /* renamed from: r  reason: collision with root package name */
    private Provider<iw.b> f60873r;

    /* renamed from: s  reason: collision with root package name */
    private Provider<x20.e<pv.z>> f60874s;

    /* renamed from: t  reason: collision with root package name */
    private Provider<sv.c> f60875t;

    /* renamed from: u  reason: collision with root package name */
    private Provider<androidx.activity.result.d<Uri>> f60876u;

    /* renamed from: v  reason: collision with root package name */
    private Provider<androidx.activity.result.d<String[]>> f60877v;

    /* renamed from: w  reason: collision with root package name */
    private Provider<vv.a> f60878w;

    /* renamed from: x  reason: collision with root package name */
    private Provider<pv.n> f60879x;

    /* renamed from: y  reason: collision with root package name */
    private Provider<pv.l> f60880y;

    /* renamed from: z  reason: collision with root package name */
    private Provider<pv.p> f60881z;

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private NetworkModule f60882a;

        /* renamed from: b  reason: collision with root package name */
        private bw.a f60883b;

        /* renamed from: c  reason: collision with root package name */
        private h f60884c;

        /* renamed from: d  reason: collision with root package name */
        private pv.c f60885d;

        /* renamed from: e  reason: collision with root package name */
        private cw.h f60886e;

        /* renamed from: f  reason: collision with root package name */
        private cw.a f60887f;

        public m a() {
            if (this.f60882a == null) {
                this.f60882a = new NetworkModule();
            }
            if (this.f60883b == null) {
                this.f60883b = new bw.a();
            }
            tw.h.a(this.f60884c, h.class);
            if (this.f60885d == null) {
                this.f60885d = new pv.c();
            }
            tw.h.a(this.f60886e, cw.h.class);
            tw.h.a(this.f60887f, cw.a.class);
            return new e(this.f60882a, this.f60883b, this.f60884c, this.f60885d, this.f60886e, this.f60887f);
        }

        public b b(cw.a aVar) {
            this.f60887f = (cw.a) tw.h.b(aVar);
            return this;
        }

        public b c(h hVar) {
            this.f60884c = (h) tw.h.b(hVar);
            return this;
        }

        public b d(cw.h hVar) {
            this.f60886e = (cw.h) tw.h.b(hVar);
            return this;
        }

        private b() {
        }
    }

    private dw.m A() {
        return new dw.m(this.f60869n.mo0get());
    }

    private o.b B() {
        return new o.b(i.a(this.f60856a), D());
    }

    private gw.s C() {
        return new gw.s(D());
    }

    private pv.x D() {
        return new pv.x(new pv.a0(), this.f60874s.mo0get());
    }

    private c.a E() {
        return new c.a(this.f60873r.mo0get());
    }

    private gw.g0 F() {
        return new gw.g0(d(), K(), H(), g(), B(), C());
    }

    private d.a G() {
        return new d.a(this.f60870o.mo0get());
    }

    private d.a H() {
        return new d.a(this.f60873r.mo0get());
    }

    private p0.a I() {
        return new p0.a(this.f60866k.mo0get());
    }

    private e.a J() {
        return new e.a(this.f60870o.mo0get());
    }

    private e.a K() {
        return new e.a(this.f60873r.mo0get());
    }

    private e.a L() {
        return new e.a(this.f60875t.mo0get());
    }

    public static b c() {
        return new b();
    }

    private pv.f d() {
        return new pv.f(this.f60871p.mo0get(), i.a(this.f60856a));
    }

    private a.C1391a e() {
        return new a.C1391a(this.f60866k.mo0get(), this.f60868m.mo0get());
    }

    private a.b f() {
        return new a.b(this.f60870o.mo0get());
    }

    private a.b g() {
        return new a.b(this.f60873r.mo0get());
    }

    private a.b h() {
        return new a.b(this.f60875t.mo0get());
    }

    private b.a i() {
        return new b.a(this.f60866k.mo0get());
    }

    private wv.g j() {
        return new wv.g(i.a(this.f60856a), this.f60872q.mo0get());
    }

    private c.a k() {
        return new c.a(this.f60866k.mo0get(), this.f60868m.mo0get());
    }

    private d.a l() {
        return new d.a(this.f60866k.mo0get());
    }

    private d.a m() {
        return new d.a(this.f60875t.mo0get());
    }

    private qv.m n() {
        return new qv.m(L(), h());
    }

    private tv.a o() {
        return new tv.a(this.f60876u.mo0get(), i.a(this.f60856a));
    }

    private tv.i p() {
        return new tv.i(this.f60877v.mo0get(), i.a(this.f60856a));
    }

    private b.a q() {
        return new b.a(this.f60878w.mo0get());
    }

    private tv.j r() {
        return new tv.j(o(), p(), q());
    }

    private h.a s() {
        return new h.a(i.a(this.f60856a), u(), t(), v());
    }

    private pv.l t() {
        return new pv.l(new pv.r(), this.f60872q.mo0get());
    }

    private pv.n u() {
        return new pv.n(new pv.r(), this.f60872q.mo0get());
    }

    private pv.p v() {
        return new pv.p(new pv.r(), this.f60872q.mo0get());
    }

    private c.a w() {
        return new c.a(this.f60870o.mo0get());
    }

    private com.withpersona.sdk.inquiry.governmentid.b x() {
        return new com.withpersona.sdk.inquiry.governmentid.b(d(), J(), G(), f(), s(), j());
    }

    private void y(NetworkModule networkModule, bw.a aVar, h hVar, pv.c cVar, cw.h hVar2, cw.a aVar2) {
        this.f60857b = NetworkModule_InterceptorFactory.create(networkModule);
        this.f60858c = NetworkModule_KeyInflectionFactory.create(networkModule);
        tw.g b11 = tw.g.b(2).c("Key-Inflection", this.f60858c).c(NetworkConstantsKt.HEADER_USER_AGENT, bw.b.a()).b();
        this.f60859d = b11;
        this.f60860e = NetworkModule_OkhttpClientFactory.create(networkModule, this.f60857b, b11);
        this.f60861f = tw.i.a(0, 1).a(bw.i.a()).b();
        this.f60862g = tw.i.a(0, 1).a(bw.h.a()).b();
        tw.i b12 = tw.i.a(0, 1).a(bw.j.a()).b();
        this.f60863h = b12;
        this.f60864i = tw.d.b(NetworkModule_MoshiFactory.create(networkModule, this.f60861f, this.f60862g, b12));
        Provider<retrofit2.t> b13 = tw.d.b(NetworkModule_RetrofitFactory.create(networkModule, NetworkConstants_ViewRegistryFactory.create(), this.f60860e, this.f60864i));
        this.f60865j = b13;
        this.f60866k = tw.d.b(bw.f.a(aVar, b13));
        i b14 = i.b(hVar);
        this.f60867l = b14;
        this.f60868m = tw.d.b(g.a(b14));
        this.f60869n = tw.d.b(bw.g.a(aVar, this.f60865j));
        this.f60870o = tw.d.b(bw.e.a(aVar, this.f60865j));
        this.f60871p = tw.d.b(cw.k.a(hVar2));
        this.f60872q = tw.d.b(pv.d.a(cVar));
        this.f60873r = tw.d.b(bw.l.a(aVar, this.f60865j));
        this.f60874s = tw.d.b(pv.e.a(cVar));
        this.f60875t = tw.d.b(bw.c.a(aVar, this.f60865j));
        this.f60876u = tw.d.b(cw.f.a(aVar2));
        this.f60877v = tw.d.b(cw.e.a(aVar2));
        this.f60878w = tw.d.b(bw.d.a(aVar, this.f60865j));
        this.f60879x = pv.o.a(pv.s.a(), this.f60872q);
        this.f60880y = pv.m.a(pv.s.a(), this.f60872q);
        this.f60881z = pv.q.a(pv.s.a(), this.f60872q);
        pv.w a11 = pv.w.a(this.f60872q);
        this.A = a11;
        wv.k a12 = wv.k.a(this.f60879x, this.f60880y, this.f60881z, a11, pv.j.a());
        this.B = a12;
        this.C = wv.r.a(a12);
        this.D = pv.y.a(pv.b0.a(), this.f60874s);
        gw.r a13 = gw.r.a(pv.j.a(), this.D);
        this.E = a13;
        this.F = gw.a0.a(a13);
        tw.i b15 = tw.i.a(0, 6).a(bw.k.a()).a(dw.h.a()).a(this.C).a(this.F).a(tv.h.a()).a(qv.i.a()).b();
        this.G = b15;
        this.H = tw.d.b(bw.m.a(b15));
    }

    private l.a z() {
        return new l.a(this.f60869n.mo0get());
    }

    @Override // zv.m
    public pr.v a() {
        return this.H.mo0get();
    }

    @Override // zv.m
    public j0 b() {
        return new j0(l(), k(), e(), I(), i(), z(), A(), w(), x(), E(), F(), m(), n(), r());
    }

    private e(NetworkModule networkModule, bw.a aVar, h hVar, pv.c cVar, cw.h hVar2, cw.a aVar2) {
        this.f60856a = hVar;
        y(networkModule, aVar, hVar, cVar, hVar2, aVar2);
    }
}