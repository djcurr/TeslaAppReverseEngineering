package io.grpc.stub;

import com.google.common.base.u;
import io.grpc.a1;
import io.grpc.f1;
import io.grpc.s0;

/* loaded from: classes5.dex */
public final class i {

    /* loaded from: classes5.dex */
    public interface a<ReqT, RespT> extends c<ReqT, RespT> {
    }

    /* loaded from: classes5.dex */
    public interface b<ReqT, RespT> extends c<ReqT, RespT> {
    }

    /* loaded from: classes5.dex */
    private interface c<ReqT, RespT> {
    }

    /* loaded from: classes5.dex */
    private static final class d<ReqT, RespT> implements a1<ReqT, RespT> {
        d(c<ReqT, RespT> cVar, boolean z11) {
        }
    }

    public static <ReqT, RespT> a1<ReqT, RespT> a(a<ReqT, RespT> aVar) {
        return new d(aVar, true);
    }

    public static <ReqT, RespT> a1<ReqT, RespT> b(b<ReqT, RespT> bVar) {
        return new d(bVar, false);
    }

    public static void c(s0<?, ?> s0Var, j<?> jVar) {
        u.p(s0Var, "methodDescriptor");
        u.p(jVar, "responseObserver");
        jVar.onError(f1.f30569m.r(String.format("Method %s is unimplemented", s0Var.c())).d());
    }
}