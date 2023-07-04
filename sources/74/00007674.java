package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.r;

/* loaded from: classes5.dex */
abstract class i0 implements r {
    @Override // io.grpc.internal.j2
    public void a(j2.a aVar) {
        e().a(aVar);
    }

    @Override // io.grpc.internal.r
    public void b(io.grpc.r0 r0Var) {
        e().b(r0Var);
    }

    @Override // io.grpc.internal.j2
    public void c() {
        e().c();
    }

    @Override // io.grpc.internal.r
    public void d(io.grpc.f1 f1Var, r.a aVar, io.grpc.r0 r0Var) {
        e().d(f1Var, aVar, r0Var);
    }

    protected abstract r e();

    public String toString() {
        return com.google.common.base.o.c(this).d("delegate", e()).toString();
    }
}