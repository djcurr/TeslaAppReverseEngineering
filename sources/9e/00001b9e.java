package com.google.android.exoplayer2;

import com.google.android.exoplayer2.z0;

/* loaded from: classes3.dex */
public class f implements ci.c {

    /* renamed from: a  reason: collision with root package name */
    private final z0.c f13409a;

    /* renamed from: b  reason: collision with root package name */
    private long f13410b;

    /* renamed from: c  reason: collision with root package name */
    private long f13411c;

    public f() {
        this(15000L, 5000L);
    }

    private static void l(s0 s0Var, long j11) {
        long C = s0Var.C() + j11;
        long k11 = s0Var.k();
        if (k11 != -9223372036854775807L) {
            C = Math.min(C, k11);
        }
        s0Var.n(s0Var.g(), Math.max(C, 0L));
    }

    @Override // ci.c
    public boolean a(s0 s0Var) {
        if (f() && s0Var.e()) {
            l(s0Var, -this.f13410b);
            return true;
        }
        return true;
    }

    @Override // ci.c
    public boolean b(s0 s0Var, int i11, long j11) {
        s0Var.n(i11, j11);
        return true;
    }

    @Override // ci.c
    public boolean c(s0 s0Var, boolean z11) {
        s0Var.p(z11);
        return true;
    }

    @Override // ci.c
    public boolean d(s0 s0Var, int i11) {
        s0Var.x(i11);
        return true;
    }

    @Override // ci.c
    public boolean e(s0 s0Var) {
        if (j() && s0Var.e()) {
            l(s0Var, this.f13411c);
            return true;
        }
        return true;
    }

    @Override // ci.c
    public boolean f() {
        return this.f13410b > 0;
    }

    @Override // ci.c
    public boolean g(s0 s0Var) {
        s0Var.a();
        return true;
    }

    @Override // ci.c
    public boolean h(s0 s0Var) {
        z0 l11 = s0Var.l();
        if (!l11.q() && !s0Var.c()) {
            int g11 = s0Var.g();
            l11.n(g11, this.f13409a);
            int u11 = s0Var.u();
            boolean z11 = this.f13409a.f() && !this.f13409a.f14794h;
            if (u11 != -1 && (s0Var.C() <= 3000 || z11)) {
                s0Var.n(u11, -9223372036854775807L);
            } else if (!z11) {
                s0Var.n(g11, 0L);
            }
        }
        return true;
    }

    @Override // ci.c
    public boolean i(s0 s0Var) {
        z0 l11 = s0Var.l();
        if (!l11.q() && !s0Var.c()) {
            int g11 = s0Var.g();
            l11.n(g11, this.f13409a);
            int y11 = s0Var.y();
            if (y11 != -1) {
                s0Var.n(y11, -9223372036854775807L);
            } else if (this.f13409a.f() && this.f13409a.f14795i) {
                s0Var.n(g11, -9223372036854775807L);
            }
        }
        return true;
    }

    @Override // ci.c
    public boolean j() {
        return this.f13411c > 0;
    }

    @Override // ci.c
    public boolean k(s0 s0Var, boolean z11) {
        s0Var.h(z11);
        return true;
    }

    @Deprecated
    public void m(long j11) {
        this.f13411c = j11;
    }

    @Deprecated
    public void n(long j11) {
        this.f13410b = j11;
    }

    public f(long j11, long j12) {
        this.f13411c = j11;
        this.f13410b = j12;
        this.f13409a = new z0.c();
    }
}