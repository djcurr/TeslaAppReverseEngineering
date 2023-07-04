package io.grpc;

import io.grpc.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public class j {

    /* loaded from: classes5.dex */
    class a extends g<Object, Object> {
        a() {
        }

        @Override // io.grpc.g
        public void a(String str, Throwable th2) {
        }

        @Override // io.grpc.g
        public void b() {
        }

        @Override // io.grpc.g
        public void c(int i11) {
        }

        @Override // io.grpc.g
        public void d(Object obj) {
        }

        @Override // io.grpc.g
        public void e(g.a<Object> aVar, r0 r0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final d f31478a;

        /* renamed from: b  reason: collision with root package name */
        private final h f31479b;

        /* synthetic */ b(d dVar, h hVar, i iVar) {
            this(dVar, hVar);
        }

        @Override // io.grpc.d
        public String a() {
            return this.f31478a.a();
        }

        @Override // io.grpc.d
        public <ReqT, RespT> g<ReqT, RespT> h(s0<ReqT, RespT> s0Var, c cVar) {
            return this.f31479b.a(s0Var, cVar, this.f31478a);
        }

        private b(d dVar, h hVar) {
            this.f31478a = dVar;
            this.f31479b = (h) com.google.common.base.u.p(hVar, "interceptor");
        }
    }

    static {
        new a();
    }

    public static d a(d dVar, List<? extends h> list) {
        com.google.common.base.u.p(dVar, "channel");
        for (h hVar : list) {
            dVar = new b(dVar, hVar, null);
        }
        return dVar;
    }

    public static d b(d dVar, h... hVarArr) {
        return a(dVar, Arrays.asList(hVarArr));
    }
}