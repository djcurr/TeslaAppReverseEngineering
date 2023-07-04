package io.grpc.internal;

import io.grpc.b;

/* loaded from: classes5.dex */
final class m1 extends b.a {

    /* renamed from: a  reason: collision with root package name */
    private final s f31070a;

    /* renamed from: b  reason: collision with root package name */
    private final io.grpc.s0<?, ?> f31071b;

    /* renamed from: c  reason: collision with root package name */
    private final io.grpc.r0 f31072c;

    /* renamed from: d  reason: collision with root package name */
    private final io.grpc.c f31073d;

    /* renamed from: f  reason: collision with root package name */
    private final a f31075f;

    /* renamed from: g  reason: collision with root package name */
    private final io.grpc.k[] f31076g;

    /* renamed from: i  reason: collision with root package name */
    private q f31078i;

    /* renamed from: j  reason: collision with root package name */
    boolean f31079j;

    /* renamed from: k  reason: collision with root package name */
    b0 f31080k;

    /* renamed from: h  reason: collision with root package name */
    private final Object f31077h = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final io.grpc.r f31074e = io.grpc.r.e();

    /* loaded from: classes5.dex */
    public interface a {
        void onComplete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(s sVar, io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar, a aVar, io.grpc.k[] kVarArr) {
        this.f31070a = sVar;
        this.f31071b = s0Var;
        this.f31072c = r0Var;
        this.f31073d = cVar;
        this.f31075f = aVar;
        this.f31076g = kVarArr;
    }

    private void c(q qVar) {
        boolean z11;
        com.google.common.base.u.v(!this.f31079j, "already finalized");
        this.f31079j = true;
        synchronized (this.f31077h) {
            if (this.f31078i == null) {
                this.f31078i = qVar;
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            this.f31075f.onComplete();
            return;
        }
        com.google.common.base.u.v(this.f31080k != null, "delayedStream is null");
        Runnable v11 = this.f31080k.v(qVar);
        if (v11 != null) {
            v11.run();
        }
        this.f31075f.onComplete();
    }

    @Override // io.grpc.b.a
    public void a(io.grpc.r0 r0Var) {
        com.google.common.base.u.v(!this.f31079j, "apply() or fail() already called");
        com.google.common.base.u.p(r0Var, "headers");
        this.f31072c.l(r0Var);
        io.grpc.r b11 = this.f31074e.b();
        try {
            q e11 = this.f31070a.e(this.f31071b, this.f31072c, this.f31073d, this.f31076g);
            this.f31074e.f(b11);
            c(e11);
        } catch (Throwable th2) {
            this.f31074e.f(b11);
            throw th2;
        }
    }

    public void b(io.grpc.f1 f1Var) {
        com.google.common.base.u.e(!f1Var.p(), "Cannot fail with OK status");
        com.google.common.base.u.v(!this.f31079j, "apply() or fail() already called");
        c(new f0(f1Var, this.f31076g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q d() {
        synchronized (this.f31077h) {
            q qVar = this.f31078i;
            if (qVar == null) {
                b0 b0Var = new b0();
                this.f31080k = b0Var;
                this.f31078i = b0Var;
                return b0Var;
            }
            return qVar;
        }
    }
}