package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.j;

/* loaded from: classes3.dex */
final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.exoplayer2.source.i f13570a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13571b;

    /* renamed from: c  reason: collision with root package name */
    public final fj.r[] f13572c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13573d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13574e;

    /* renamed from: f  reason: collision with root package name */
    public l0 f13575f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13576g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f13577h;

    /* renamed from: i  reason: collision with root package name */
    private final ci.n[] f13578i;

    /* renamed from: j  reason: collision with root package name */
    private final xj.m f13579j;

    /* renamed from: k  reason: collision with root package name */
    private final q0 f13580k;

    /* renamed from: l  reason: collision with root package name */
    private k0 f13581l;

    /* renamed from: m  reason: collision with root package name */
    private fj.v f13582m;

    /* renamed from: n  reason: collision with root package name */
    private xj.n f13583n;

    /* renamed from: o  reason: collision with root package name */
    private long f13584o;

    public k0(ci.n[] nVarArr, long j11, xj.m mVar, zj.b bVar, q0 q0Var, l0 l0Var, xj.n nVar) {
        this.f13578i = nVarArr;
        this.f13584o = j11;
        this.f13579j = mVar;
        this.f13580k = q0Var;
        j.a aVar = l0Var.f13586a;
        this.f13571b = aVar.f26303a;
        this.f13575f = l0Var;
        this.f13582m = fj.v.f26353d;
        this.f13583n = nVar;
        this.f13572c = new fj.r[nVarArr.length];
        this.f13577h = new boolean[nVarArr.length];
        this.f13570a = e(aVar, q0Var, bVar, l0Var.f13587b, l0Var.f13589d);
    }

    private void c(fj.r[] rVarArr) {
        int i11 = 0;
        while (true) {
            ci.n[] nVarArr = this.f13578i;
            if (i11 >= nVarArr.length) {
                return;
            }
            if (nVarArr[i11].d() == 7 && this.f13583n.c(i11)) {
                rVarArr[i11] = new fj.e();
            }
            i11++;
        }
    }

    private static com.google.android.exoplayer2.source.i e(j.a aVar, q0 q0Var, zj.b bVar, long j11, long j12) {
        com.google.android.exoplayer2.source.i h11 = q0Var.h(aVar, bVar, j11);
        return (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? h11 : new com.google.android.exoplayer2.source.c(h11, true, 0L, j12);
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i11 = 0;
        while (true) {
            xj.n nVar = this.f13583n;
            if (i11 >= nVar.f57588a) {
                return;
            }
            boolean c11 = nVar.c(i11);
            xj.g gVar = this.f13583n.f57590c[i11];
            if (c11 && gVar != null) {
                gVar.disable();
            }
            i11++;
        }
    }

    private void g(fj.r[] rVarArr) {
        int i11 = 0;
        while (true) {
            ci.n[] nVarArr = this.f13578i;
            if (i11 >= nVarArr.length) {
                return;
            }
            if (nVarArr[i11].d() == 7) {
                rVarArr[i11] = null;
            }
            i11++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i11 = 0;
        while (true) {
            xj.n nVar = this.f13583n;
            if (i11 >= nVar.f57588a) {
                return;
            }
            boolean c11 = nVar.c(i11);
            xj.g gVar = this.f13583n.f57590c[i11];
            if (c11 && gVar != null) {
                gVar.enable();
            }
            i11++;
        }
    }

    private boolean r() {
        return this.f13581l == null;
    }

    private static void u(long j11, q0 q0Var, com.google.android.exoplayer2.source.i iVar) {
        try {
            if (j11 != -9223372036854775807L && j11 != Long.MIN_VALUE) {
                q0Var.z(((com.google.android.exoplayer2.source.c) iVar).f13802a);
            } else {
                q0Var.z(iVar);
            }
        } catch (RuntimeException e11) {
            ak.o.d("MediaPeriodHolder", "Period release failed.", e11);
        }
    }

    public long a(xj.n nVar, long j11, boolean z11) {
        return b(nVar, j11, z11, new boolean[this.f13578i.length]);
    }

    public long b(xj.n nVar, long j11, boolean z11, boolean[] zArr) {
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (i11 >= nVar.f57588a) {
                break;
            }
            boolean[] zArr2 = this.f13577h;
            if (z11 || !nVar.b(this.f13583n, i11)) {
                z12 = false;
            }
            zArr2[i11] = z12;
            i11++;
        }
        g(this.f13572c);
        f();
        this.f13583n = nVar;
        h();
        long o11 = this.f13570a.o(nVar.f57590c, this.f13577h, this.f13572c, zArr, j11);
        c(this.f13572c);
        this.f13574e = false;
        int i12 = 0;
        while (true) {
            fj.r[] rVarArr = this.f13572c;
            if (i12 >= rVarArr.length) {
                return o11;
            }
            if (rVarArr[i12] != null) {
                ak.a.f(nVar.c(i12));
                if (this.f13578i[i12].d() != 7) {
                    this.f13574e = true;
                }
            } else {
                ak.a.f(nVar.f57590c[i12] == null);
            }
            i12++;
        }
    }

    public void d(long j11) {
        ak.a.f(r());
        this.f13570a.e(y(j11));
    }

    public long i() {
        if (!this.f13573d) {
            return this.f13575f.f13587b;
        }
        long g11 = this.f13574e ? this.f13570a.g() : Long.MIN_VALUE;
        return g11 == Long.MIN_VALUE ? this.f13575f.f13590e : g11;
    }

    public k0 j() {
        return this.f13581l;
    }

    public long k() {
        if (this.f13573d) {
            return this.f13570a.b();
        }
        return 0L;
    }

    public long l() {
        return this.f13584o;
    }

    public long m() {
        return this.f13575f.f13587b + this.f13584o;
    }

    public fj.v n() {
        return this.f13582m;
    }

    public xj.n o() {
        return this.f13583n;
    }

    public void p(float f11, z0 z0Var) {
        this.f13573d = true;
        this.f13582m = this.f13570a.t();
        xj.n v11 = v(f11, z0Var);
        l0 l0Var = this.f13575f;
        long j11 = l0Var.f13587b;
        long j12 = l0Var.f13590e;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        long a11 = a(v11, j11, false);
        long j13 = this.f13584o;
        l0 l0Var2 = this.f13575f;
        this.f13584o = j13 + (l0Var2.f13587b - a11);
        this.f13575f = l0Var2.b(a11);
    }

    public boolean q() {
        return this.f13573d && (!this.f13574e || this.f13570a.g() == Long.MIN_VALUE);
    }

    public void s(long j11) {
        ak.a.f(r());
        if (this.f13573d) {
            this.f13570a.h(y(j11));
        }
    }

    public void t() {
        f();
        u(this.f13575f.f13589d, this.f13580k, this.f13570a);
    }

    public xj.n v(float f11, z0 z0Var) {
        xj.g[] gVarArr;
        xj.n e11 = this.f13579j.e(this.f13578i, n(), this.f13575f.f13586a, z0Var);
        for (xj.g gVar : e11.f57590c) {
            if (gVar != null) {
                gVar.f(f11);
            }
        }
        return e11;
    }

    public void w(k0 k0Var) {
        if (k0Var == this.f13581l) {
            return;
        }
        f();
        this.f13581l = k0Var;
        h();
    }

    public void x(long j11) {
        this.f13584o = j11;
    }

    public long y(long j11) {
        return j11 - l();
    }

    public long z(long j11) {
        return j11 + l();
    }
}