package io.grpc.internal;

import io.grpc.internal.j1;
import io.grpc.internal.s;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
abstract class j0 implements v {
    protected abstract v a();

    @Override // io.grpc.internal.j1
    public void b(io.grpc.f1 f1Var) {
        a().b(f1Var);
    }

    @Override // io.grpc.k0
    public io.grpc.g0 c() {
        return a().c();
    }

    @Override // io.grpc.internal.s
    public void d(s.a aVar, Executor executor) {
        a().d(aVar, executor);
    }

    @Override // io.grpc.internal.s
    public q e(io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, io.grpc.k[] kVarArr) {
        return a().e(s0Var, r0Var, cVar, kVarArr);
    }

    @Override // io.grpc.internal.j1
    public void f(io.grpc.f1 f1Var) {
        a().f(f1Var);
    }

    @Override // io.grpc.internal.j1
    public Runnable g(j1.a aVar) {
        return a().g(aVar);
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("delegate", a()).toString();
    }
}