package com.facebook.imagepipeline.producers;

/* loaded from: classes3.dex */
public class z extends y implements pf.d {

    /* renamed from: c  reason: collision with root package name */
    private final pf.e f11607c;

    /* renamed from: d  reason: collision with root package name */
    private final pf.d f11608d;

    public z(pf.e eVar, pf.d dVar) {
        super(eVar, dVar);
        this.f11607c = eVar;
        this.f11608d = dVar;
    }

    @Override // pf.d
    public void a(p0 p0Var) {
        pf.e eVar = this.f11607c;
        if (eVar != null) {
            eVar.a(p0Var.l(), p0Var.a(), p0Var.getId(), p0Var.n());
        }
        pf.d dVar = this.f11608d;
        if (dVar != null) {
            dVar.a(p0Var);
        }
    }

    @Override // pf.d
    public void e(p0 p0Var) {
        pf.e eVar = this.f11607c;
        if (eVar != null) {
            eVar.c(p0Var.l(), p0Var.getId(), p0Var.n());
        }
        pf.d dVar = this.f11608d;
        if (dVar != null) {
            dVar.e(p0Var);
        }
    }

    @Override // pf.d
    public void g(p0 p0Var) {
        pf.e eVar = this.f11607c;
        if (eVar != null) {
            eVar.k(p0Var.getId());
        }
        pf.d dVar = this.f11608d;
        if (dVar != null) {
            dVar.g(p0Var);
        }
    }

    @Override // pf.d
    public void i(p0 p0Var, Throwable th2) {
        pf.e eVar = this.f11607c;
        if (eVar != null) {
            eVar.i(p0Var.l(), p0Var.getId(), th2, p0Var.n());
        }
        pf.d dVar = this.f11608d;
        if (dVar != null) {
            dVar.i(p0Var, th2);
        }
    }
}