package io.grpc.internal;

/* loaded from: classes5.dex */
abstract class l0 extends io.grpc.p0 {

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.p0 f31045a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(io.grpc.p0 p0Var) {
        this.f31045a = p0Var;
    }

    @Override // io.grpc.d
    public String a() {
        return this.f31045a.a();
    }

    @Override // io.grpc.d
    public <RequestT, ResponseT> io.grpc.g<RequestT, ResponseT> h(io.grpc.s0<RequestT, ResponseT> s0Var, io.grpc.c cVar) {
        return this.f31045a.h(s0Var, cVar);
    }

    @Override // io.grpc.p0
    public io.grpc.p0 i() {
        return this.f31045a.i();
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("delegate", this.f31045a).toString();
    }
}