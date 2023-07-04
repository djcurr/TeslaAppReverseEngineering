package com.google.firebase.perf.config;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: d */
    private static final fn.a f16914d = fn.a.e();

    /* renamed from: e */
    private static volatile a f16915e;

    /* renamed from: a */
    private final RemoteConfigManager f16916a;

    /* renamed from: b */
    private com.google.firebase.perf.util.d f16917b;

    /* renamed from: c */
    private v f16918c;

    public a(RemoteConfigManager remoteConfigManager, com.google.firebase.perf.util.d dVar, v vVar) {
        this.f16916a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f16917b = dVar == null ? new com.google.firebase.perf.util.d() : dVar;
        this.f16918c = vVar == null ? v.f() : vVar;
    }

    private boolean F(long j11) {
        return j11 >= 0;
    }

    private boolean G(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(cn.a.f9283b)) {
                return true;
            }
        }
        return false;
    }

    private boolean H(long j11) {
        return j11 >= 0;
    }

    private boolean J(float f11) {
        return BitmapDescriptorFactory.HUE_RED <= f11 && f11 <= 1.0f;
    }

    private boolean K(long j11) {
        return j11 > 0;
    }

    private boolean L(long j11) {
        return j11 > 0;
    }

    private com.google.firebase.perf.util.e<Boolean> b(t<Boolean> tVar) {
        return this.f16918c.c(tVar.a());
    }

    private com.google.firebase.perf.util.e<Float> c(t<Float> tVar) {
        return this.f16918c.e(tVar.a());
    }

    private com.google.firebase.perf.util.e<Long> d(t<Long> tVar) {
        return this.f16918c.g(tVar.a());
    }

    private com.google.firebase.perf.util.e<String> e(t<String> tVar) {
        return this.f16918c.h(tVar.a());
    }

    public static synchronized a f() {
        a aVar;
        synchronized (a.class) {
            if (f16915e == null) {
                f16915e = new a(null, null, null);
            }
            aVar = f16915e;
        }
        return aVar;
    }

    private boolean i() {
        j e11 = j.e();
        com.google.firebase.perf.util.e<Boolean> s11 = s(e11);
        if (s11.d()) {
            if (this.f16916a.isLastFetchFailed()) {
                return false;
            }
            this.f16918c.n(e11.a(), s11.c().booleanValue());
            return s11.c().booleanValue();
        }
        com.google.firebase.perf.util.e<Boolean> b11 = b(e11);
        if (b11.d()) {
            return b11.c().booleanValue();
        }
        return e11.d().booleanValue();
    }

    private boolean j() {
        i e11 = i.e();
        com.google.firebase.perf.util.e<String> v11 = v(e11);
        if (v11.d()) {
            this.f16918c.m(e11.a(), v11.c());
            return G(v11.c());
        }
        com.google.firebase.perf.util.e<String> e12 = e(e11);
        if (e12.d()) {
            return G(e12.c());
        }
        return G(e11.d());
    }

    private com.google.firebase.perf.util.e<Boolean> l(t<Boolean> tVar) {
        return this.f16917b.b(tVar.b());
    }

    private com.google.firebase.perf.util.e<Float> m(t<Float> tVar) {
        return this.f16917b.c(tVar.b());
    }

    private com.google.firebase.perf.util.e<Long> n(t<Long> tVar) {
        return this.f16917b.e(tVar.b());
    }

    private com.google.firebase.perf.util.e<Boolean> s(t<Boolean> tVar) {
        return this.f16916a.getBoolean(tVar.c());
    }

    private com.google.firebase.perf.util.e<Float> t(t<Float> tVar) {
        return this.f16916a.getFloat(tVar.c());
    }

    private com.google.firebase.perf.util.e<Long> u(t<Long> tVar) {
        return this.f16916a.getLong(tVar.c());
    }

    private com.google.firebase.perf.util.e<String> v(t<String> tVar) {
        return this.f16916a.getString(tVar.c());
    }

    public long A() {
        o e11 = o.e();
        com.google.firebase.perf.util.e<Long> n11 = n(e11);
        if (n11.d() && H(n11.c().longValue())) {
            return n11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && H(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && H(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public float B() {
        p e11 = p.e();
        com.google.firebase.perf.util.e<Float> m11 = m(e11);
        if (m11.d()) {
            float floatValue = m11.c().floatValue() / 100.0f;
            if (J(floatValue)) {
                return floatValue;
            }
        }
        com.google.firebase.perf.util.e<Float> t11 = t(e11);
        if (t11.d() && J(t11.c().floatValue())) {
            this.f16918c.k(e11.a(), t11.c().floatValue());
            return t11.c().floatValue();
        }
        com.google.firebase.perf.util.e<Float> c11 = c(e11);
        if (c11.d() && J(c11.c().floatValue())) {
            return c11.c().floatValue();
        }
        return e11.d().floatValue();
    }

    public long C() {
        q e11 = q.e();
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && F(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && F(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public long D() {
        r e11 = r.e();
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && F(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && F(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public float E() {
        s e11 = s.e();
        com.google.firebase.perf.util.e<Float> t11 = t(e11);
        if (t11.d() && J(t11.c().floatValue())) {
            this.f16918c.k(e11.a(), t11.c().floatValue());
            return t11.c().floatValue();
        }
        com.google.firebase.perf.util.e<Float> c11 = c(e11);
        if (c11.d() && J(c11.c().floatValue())) {
            return c11.c().floatValue();
        }
        return e11.d().floatValue();
    }

    public boolean I() {
        Boolean h11 = h();
        return (h11 == null || h11.booleanValue()) && k();
    }

    public void M(Context context) {
        f16914d.i(com.google.firebase.perf.util.k.b(context));
        this.f16918c.j(context);
    }

    public void N(Context context) {
        M(context.getApplicationContext());
    }

    public void O(Boolean bool) {
        String a11;
        if (g().booleanValue() || (a11 = c.d().a()) == null) {
            return;
        }
        if (bool != null) {
            this.f16918c.n(a11, Boolean.TRUE.equals(bool));
        } else {
            this.f16918c.b(a11);
        }
    }

    public void P(com.google.firebase.perf.util.d dVar) {
        this.f16917b = dVar;
    }

    public String a() {
        String f11;
        d e11 = d.e();
        if (cn.a.f9282a.booleanValue()) {
            return e11.d();
        }
        String c11 = e11.c();
        long longValue = c11 != null ? ((Long) this.f16916a.getRemoteConfigValueOrDefault(c11, -1L)).longValue() : -1L;
        String a11 = e11.a();
        if (d.g(longValue) && (f11 = d.f(longValue)) != null) {
            this.f16918c.m(a11, f11);
            return f11;
        }
        com.google.firebase.perf.util.e<String> e12 = e(e11);
        if (e12.d()) {
            return e12.c();
        }
        return e11.d();
    }

    public Boolean g() {
        b e11 = b.e();
        com.google.firebase.perf.util.e<Boolean> l11 = l(e11);
        if (l11.d()) {
            return l11.c();
        }
        return e11.d();
    }

    public Boolean h() {
        if (g().booleanValue()) {
            return Boolean.FALSE;
        }
        c d11 = c.d();
        com.google.firebase.perf.util.e<Boolean> b11 = b(d11);
        if (b11.d()) {
            return b11.c();
        }
        com.google.firebase.perf.util.e<Boolean> l11 = l(d11);
        if (l11.d()) {
            return l11.c();
        }
        return null;
    }

    public boolean k() {
        return i() && !j();
    }

    public long o() {
        e e11 = e.e();
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && F(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && F(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public long p() {
        f e11 = f.e();
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && F(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && F(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public float q() {
        g e11 = g.e();
        com.google.firebase.perf.util.e<Float> t11 = t(e11);
        if (t11.d() && J(t11.c().floatValue())) {
            this.f16918c.k(e11.a(), t11.c().floatValue());
            return t11.c().floatValue();
        }
        com.google.firebase.perf.util.e<Float> c11 = c(e11);
        if (c11.d() && J(c11.c().floatValue())) {
            return c11.c().floatValue();
        }
        return e11.d().floatValue();
    }

    public long r() {
        h e11 = h.e();
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && L(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && L(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public long w() {
        k e11 = k.e();
        com.google.firebase.perf.util.e<Long> n11 = n(e11);
        if (n11.d() && H(n11.c().longValue())) {
            return n11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && H(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && H(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public long x() {
        l e11 = l.e();
        com.google.firebase.perf.util.e<Long> n11 = n(e11);
        if (n11.d() && H(n11.c().longValue())) {
            return n11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && H(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && H(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public long y() {
        m e11 = m.e();
        com.google.firebase.perf.util.e<Long> n11 = n(e11);
        if (n11.d() && K(n11.c().longValue())) {
            return n11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && K(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && K(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }

    public long z() {
        n e11 = n.e();
        com.google.firebase.perf.util.e<Long> n11 = n(e11);
        if (n11.d() && H(n11.c().longValue())) {
            return n11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> u11 = u(e11);
        if (u11.d() && H(u11.c().longValue())) {
            this.f16918c.l(e11.a(), u11.c().longValue());
            return u11.c().longValue();
        }
        com.google.firebase.perf.util.e<Long> d11 = d(e11);
        if (d11.d() && H(d11.c().longValue())) {
            return d11.c().longValue();
        }
        return e11.d().longValue();
    }
}