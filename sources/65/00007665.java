package io.grpc.internal;

import io.grpc.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class g0 implements s {

    /* renamed from: a  reason: collision with root package name */
    final io.grpc.f1 f30937a;

    /* renamed from: b  reason: collision with root package name */
    private final r.a f30938b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(io.grpc.f1 f1Var, r.a aVar) {
        com.google.common.base.u.e(!f1Var.p(), "error must not be OK");
        this.f30937a = f1Var;
        this.f30938b = aVar;
    }

    @Override // io.grpc.k0
    public io.grpc.g0 c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // io.grpc.internal.s
    public q e(io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, io.grpc.k[] kVarArr) {
        return new f0(this.f30937a, this.f30938b, kVarArr);
    }
}