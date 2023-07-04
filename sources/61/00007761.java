package io.grpc;

import ch.qos.logback.core.CoreConstants;
import io.grpc.b;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class m extends io.grpc.b {

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.b f31489a;

    /* renamed from: b  reason: collision with root package name */
    private final io.grpc.b f31490b;

    /* loaded from: classes5.dex */
    private static final class a extends b.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.a f31491a;

        /* renamed from: b  reason: collision with root package name */
        private final r0 f31492b;

        public a(b.a aVar, r0 r0Var) {
            this.f31491a = aVar;
            this.f31492b = r0Var;
        }

        @Override // io.grpc.b.a
        public void a(r0 r0Var) {
            com.google.common.base.u.p(r0Var, "headers");
            r0 r0Var2 = new r0();
            r0Var2.l(this.f31492b);
            r0Var2.l(r0Var);
            this.f31491a.a(r0Var2);
        }
    }

    /* loaded from: classes5.dex */
    private final class b extends b.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.AbstractC0585b f31493a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f31494b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f31495c;

        /* renamed from: d  reason: collision with root package name */
        private final r f31496d;

        public b(b.AbstractC0585b abstractC0585b, Executor executor, b.a aVar, r rVar) {
            this.f31493a = abstractC0585b;
            this.f31494b = executor;
            this.f31495c = (b.a) com.google.common.base.u.p(aVar, "delegate");
            this.f31496d = (r) com.google.common.base.u.p(rVar, CoreConstants.CONTEXT_SCOPE_VALUE);
        }

        @Override // io.grpc.b.a
        public void a(r0 r0Var) {
            com.google.common.base.u.p(r0Var, "headers");
            r b11 = this.f31496d.b();
            try {
                m.this.f31490b.a(this.f31493a, this.f31494b, new a(this.f31495c, r0Var));
            } finally {
                this.f31496d.f(b11);
            }
        }
    }

    public m(io.grpc.b bVar, io.grpc.b bVar2) {
        this.f31489a = (io.grpc.b) com.google.common.base.u.p(bVar, "creds1");
        this.f31490b = (io.grpc.b) com.google.common.base.u.p(bVar2, "creds2");
    }

    @Override // io.grpc.b
    public void a(b.AbstractC0585b abstractC0585b, Executor executor, b.a aVar) {
        this.f31489a.a(abstractC0585b, executor, new b(abstractC0585b, executor, aVar, r.e()));
    }
}