package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class h implements ak.q {

    /* renamed from: a  reason: collision with root package name */
    private final ak.c0 f13494a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13495b;

    /* renamed from: c  reason: collision with root package name */
    private v0 f13496c;

    /* renamed from: d  reason: collision with root package name */
    private ak.q f13497d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13498e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13499f;

    /* loaded from: classes3.dex */
    public interface a {
        void e(ci.l lVar);
    }

    public h(a aVar, ak.b bVar) {
        this.f13495b = aVar;
        this.f13494a = new ak.c0(bVar);
    }

    private boolean f(boolean z11) {
        v0 v0Var = this.f13496c;
        return v0Var == null || v0Var.c() || (!this.f13496c.isReady() && (z11 || this.f13496c.g()));
    }

    private void j(boolean z11) {
        if (f(z11)) {
            this.f13498e = true;
            if (this.f13499f) {
                this.f13494a.c();
                return;
            }
            return;
        }
        ak.q qVar = (ak.q) ak.a.e(this.f13497d);
        long s11 = qVar.s();
        if (this.f13498e) {
            if (s11 < this.f13494a.s()) {
                this.f13494a.d();
                return;
            }
            this.f13498e = false;
            if (this.f13499f) {
                this.f13494a.c();
            }
        }
        this.f13494a.a(s11);
        ci.l b11 = qVar.b();
        if (b11.equals(this.f13494a.b())) {
            return;
        }
        this.f13494a.e(b11);
        this.f13495b.e(b11);
    }

    public void a(v0 v0Var) {
        if (v0Var == this.f13496c) {
            this.f13497d = null;
            this.f13496c = null;
            this.f13498e = true;
        }
    }

    @Override // ak.q
    public ci.l b() {
        ak.q qVar = this.f13497d;
        if (qVar != null) {
            return qVar.b();
        }
        return this.f13494a.b();
    }

    public void c(v0 v0Var) {
        ak.q qVar;
        ak.q y11 = v0Var.y();
        if (y11 == null || y11 == (qVar = this.f13497d)) {
            return;
        }
        if (qVar == null) {
            this.f13497d = y11;
            this.f13496c = v0Var;
            y11.e(this.f13494a.b());
            return;
        }
        throw ExoPlaybackException.e(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    public void d(long j11) {
        this.f13494a.a(j11);
    }

    @Override // ak.q
    public void e(ci.l lVar) {
        ak.q qVar = this.f13497d;
        if (qVar != null) {
            qVar.e(lVar);
            lVar = this.f13497d.b();
        }
        this.f13494a.e(lVar);
    }

    public void g() {
        this.f13499f = true;
        this.f13494a.c();
    }

    public void h() {
        this.f13499f = false;
        this.f13494a.d();
    }

    public long i(boolean z11) {
        j(z11);
        return s();
    }

    @Override // ak.q
    public long s() {
        if (this.f13498e) {
            return this.f13494a.s();
        }
        return ((ak.q) ak.a.e(this.f13497d)).s();
    }
}