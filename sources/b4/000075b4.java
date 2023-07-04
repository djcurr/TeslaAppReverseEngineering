package io.grpc;

/* loaded from: classes5.dex */
public final class b1<ReqT, RespT> {

    /* renamed from: a  reason: collision with root package name */
    private final s0<ReqT, RespT> f30518a;

    /* renamed from: b  reason: collision with root package name */
    private final a1<ReqT, RespT> f30519b;

    private b1(s0<ReqT, RespT> s0Var, a1<ReqT, RespT> a1Var) {
        this.f30518a = s0Var;
        this.f30519b = a1Var;
    }

    public static <ReqT, RespT> b1<ReqT, RespT> a(s0<ReqT, RespT> s0Var, a1<ReqT, RespT> a1Var) {
        return new b1<>(s0Var, a1Var);
    }

    public s0<ReqT, RespT> b() {
        return this.f30518a;
    }
}