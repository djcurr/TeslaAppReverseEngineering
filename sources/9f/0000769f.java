package io.grpc.internal;

import io.grpc.t0;

/* loaded from: classes5.dex */
abstract class m0 extends io.grpc.t0 {

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.t0 f31069a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(io.grpc.t0 t0Var) {
        com.google.common.base.u.p(t0Var, "delegate can not be null");
        this.f31069a = t0Var;
    }

    @Override // io.grpc.t0
    public void b() {
        this.f31069a.b();
    }

    @Override // io.grpc.t0
    public void c() {
        this.f31069a.c();
    }

    @Override // io.grpc.t0
    public void d(t0.e eVar) {
        this.f31069a.d(eVar);
    }

    @Override // io.grpc.t0
    @Deprecated
    public void e(t0.f fVar) {
        this.f31069a.e(fVar);
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("delegate", this.f31069a).toString();
    }
}