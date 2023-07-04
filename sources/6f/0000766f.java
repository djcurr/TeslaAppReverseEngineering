package io.grpc.internal;

import java.io.InputStream;

/* loaded from: classes5.dex */
abstract class h0 implements q {
    @Override // io.grpc.internal.i2
    public void a(io.grpc.n nVar) {
        e().a(nVar);
    }

    @Override // io.grpc.internal.q
    public void b(io.grpc.f1 f1Var) {
        e().b(f1Var);
    }

    @Override // io.grpc.internal.i2
    public void c(InputStream inputStream) {
        e().c(inputStream);
    }

    @Override // io.grpc.internal.i2
    public void d() {
        e().d();
    }

    protected abstract q e();

    @Override // io.grpc.internal.i2
    public void flush() {
        e().flush();
    }

    @Override // io.grpc.internal.i2
    public void g(int i11) {
        e().g(i11);
    }

    @Override // io.grpc.internal.i2
    public boolean isReady() {
        return e().isReady();
    }

    @Override // io.grpc.internal.q
    public void j(int i11) {
        e().j(i11);
    }

    @Override // io.grpc.internal.q
    public void k(int i11) {
        e().k(i11);
    }

    @Override // io.grpc.internal.q
    public void l(io.grpc.v vVar) {
        e().l(vVar);
    }

    @Override // io.grpc.internal.q
    public void m(boolean z11) {
        e().m(z11);
    }

    @Override // io.grpc.internal.q
    public void n(String str) {
        e().n(str);
    }

    @Override // io.grpc.internal.q
    public void o(w0 w0Var) {
        e().o(w0Var);
    }

    @Override // io.grpc.internal.q
    public void p() {
        e().p();
    }

    @Override // io.grpc.internal.q
    public void q(io.grpc.t tVar) {
        e().q(tVar);
    }

    @Override // io.grpc.internal.q
    public void r(r rVar) {
        e().r(rVar);
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("delegate", e()).toString();
    }
}