package io.sentry;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.VisibleForTesting;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class t3 implements i0 {

    /* renamed from: a */
    private final Date f32616a;

    /* renamed from: b */
    private final Long f32617b;

    /* renamed from: c */
    private Long f32618c;

    /* renamed from: d */
    private Double f32619d;

    /* renamed from: e */
    private final u3 f32620e;

    /* renamed from: f */
    private final o3 f32621f;

    /* renamed from: g */
    private Throwable f32622g;

    /* renamed from: h */
    private final c0 f32623h;

    /* renamed from: i */
    private final AtomicBoolean f32624i;

    /* renamed from: j */
    private v3 f32625j;

    /* renamed from: k */
    private final Map<String, Object> f32626k;

    public t3(io.sentry.protocol.o oVar, w3 w3Var, o3 o3Var, String str, c0 c0Var, Date date, v3 v3Var) {
        this.f32624i = new AtomicBoolean(false);
        this.f32626k = new ConcurrentHashMap();
        this.f32620e = new u3(oVar, new w3(), str, w3Var, o3Var.v());
        this.f32621f = (o3) rz.j.a(o3Var, "transaction is required");
        this.f32623h = (c0) rz.j.a(c0Var, "hub is required");
        this.f32625j = v3Var;
        if (date != null) {
            this.f32616a = date;
            this.f32617b = null;
            return;
        }
        this.f32616a = g.b();
        this.f32617b = Long.valueOf(System.nanoTime());
    }

    private Double l(Long l11) {
        if (this.f32617b == null || l11 == null) {
            return null;
        }
        return Double.valueOf(g.h(l11.longValue() - this.f32617b.longValue()));
    }

    @Override // io.sentry.i0
    public boolean a() {
        return this.f32624i.get();
    }

    @Override // io.sentry.i0
    public i0 c(String str, String str2, Date date) {
        if (this.f32624i.get()) {
            return h1.i();
        }
        return this.f32621f.A(this.f32620e.e(), str, str2, date);
    }

    @Override // io.sentry.i0
    public void e(x3 x3Var) {
        i(x3Var, Double.valueOf(g.a(g.b())), null);
    }

    @Override // io.sentry.i0
    public void finish() {
        e(this.f32620e.f());
    }

    @Override // io.sentry.i0
    public x3 getStatus() {
        return this.f32620e.f();
    }

    @Override // io.sentry.i0
    public u3 h() {
        return this.f32620e;
    }

    public void i(x3 x3Var, Double d11, Long l11) {
        if (this.f32624i.compareAndSet(false, true)) {
            this.f32620e.k(x3Var);
            this.f32619d = d11;
            Throwable th2 = this.f32622g;
            if (th2 != null) {
                this.f32623h.j(th2, this, this.f32621f.getName());
            }
            v3 v3Var = this.f32625j;
            if (v3Var != null) {
                v3Var.a(this);
            }
            this.f32618c = Long.valueOf(l11 == null ? System.nanoTime() : l11.longValue());
        }
    }

    public Map<String, Object> j() {
        return this.f32626k;
    }

    public String k() {
        return this.f32620e.a();
    }

    public Long m() {
        return this.f32618c;
    }

    public Double n() {
        return o(this.f32618c);
    }

    public Double o(Long l11) {
        Double l12 = l(l11);
        if (l12 != null) {
            return Double.valueOf(g.g(this.f32616a.getTime() + l12.doubleValue()));
        }
        Double d11 = this.f32619d;
        if (d11 != null) {
            return d11;
        }
        return null;
    }

    public String p() {
        return this.f32620e.b();
    }

    public w3 q() {
        return this.f32620e.c();
    }

    public w3 r() {
        return this.f32620e.e();
    }

    public Date s() {
        return this.f32616a;
    }

    public Map<String, String> t() {
        return this.f32620e.g();
    }

    public Double u() {
        return this.f32619d;
    }

    public io.sentry.protocol.o v() {
        return this.f32620e.h();
    }

    public Boolean w() {
        return this.f32620e.d();
    }

    public void x(String str) {
        if (this.f32624i.get()) {
            return;
        }
        this.f32620e.i(str);
    }

    public void y(v3 v3Var) {
        this.f32625j = v3Var;
    }

    @VisibleForTesting
    public t3(e4 e4Var, o3 o3Var, c0 c0Var, Date date) {
        this.f32624i = new AtomicBoolean(false);
        this.f32626k = new ConcurrentHashMap();
        this.f32620e = (u3) rz.j.a(e4Var, "context is required");
        this.f32621f = (o3) rz.j.a(o3Var, "sentryTracer is required");
        this.f32623h = (c0) rz.j.a(c0Var, "hub is required");
        this.f32625j = null;
        if (date != null) {
            this.f32616a = date;
            this.f32617b = null;
            return;
        }
        this.f32616a = g.b();
        this.f32617b = Long.valueOf(System.nanoTime());
    }
}