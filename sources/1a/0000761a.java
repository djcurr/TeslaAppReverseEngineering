package io.grpc.internal;

import io.grpc.internal.f;
import io.grpc.internal.j2;
import io.grpc.internal.k1;
import io.grpc.l;
import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class d implements i2 {

    /* loaded from: classes5.dex */
    public static abstract class a implements f.h, k1.b {

        /* renamed from: a  reason: collision with root package name */
        private y f30758a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f30759b = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final n2 f30760c;

        /* renamed from: d  reason: collision with root package name */
        private final k1 f30761d;

        /* renamed from: e  reason: collision with root package name */
        private int f30762e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f30763f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f30764g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class RunnableC0588a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ dy.b f30765a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f30766b;

            RunnableC0588a(dy.b bVar, int i11) {
                this.f30765a = bVar;
                this.f30766b = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                dy.c.f("AbstractStream.request");
                dy.c.d(this.f30765a);
                try {
                    a.this.f30758a.g(this.f30766b);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i11, h2 h2Var, n2 n2Var) {
            h2 h2Var2 = (h2) com.google.common.base.u.p(h2Var, "statsTraceCtx");
            this.f30760c = (n2) com.google.common.base.u.p(n2Var, "transportTracer");
            k1 k1Var = new k1(this, l.b.f31488a, i11, h2Var, n2Var);
            this.f30761d = k1Var;
            this.f30758a = k1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean m() {
            boolean z11;
            synchronized (this.f30759b) {
                z11 = this.f30763f && this.f30762e < 32768 && !this.f30764g;
            }
            return z11;
        }

        private void o() {
            boolean m11;
            synchronized (this.f30759b) {
                m11 = m();
            }
            if (m11) {
                n().c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(int i11) {
            synchronized (this.f30759b) {
                this.f30762e += i11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(int i11) {
            e(new RunnableC0588a(dy.c.e(), i11));
        }

        @Override // io.grpc.internal.k1.b
        public void a(j2.a aVar) {
            n().a(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void j(boolean z11) {
            if (z11) {
                this.f30758a.close();
            } else {
                this.f30758a.p();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void k(u1 u1Var) {
            try {
                this.f30758a.m(u1Var);
            } catch (Throwable th2) {
                c(th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public n2 l() {
            return this.f30760c;
        }

        protected abstract j2 n();

        public final void q(int i11) {
            boolean z11;
            synchronized (this.f30759b) {
                com.google.common.base.u.v(this.f30763f, "onStreamAllocated was not called, but it seems the stream is active");
                int i12 = this.f30762e;
                z11 = true;
                boolean z12 = i12 < 32768;
                int i13 = i12 - i11;
                this.f30762e = i13;
                boolean z13 = i13 < 32768;
                if (z12 || !z13) {
                    z11 = false;
                }
            }
            if (z11) {
                o();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void r() {
            com.google.common.base.u.u(n() != null);
            synchronized (this.f30759b) {
                com.google.common.base.u.v(this.f30763f ? false : true, "Already allocated");
                this.f30763f = true;
            }
            o();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void s() {
            synchronized (this.f30759b) {
                this.f30764g = true;
            }
        }

        final void t() {
            this.f30761d.p0(this);
            this.f30758a = this.f30761d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void v(io.grpc.u uVar) {
            this.f30758a.l(uVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void w(r0 r0Var) {
            this.f30761d.n0(r0Var);
            this.f30758a = new f(this, this, this.f30761d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void x(int i11) {
            this.f30758a.j(i11);
        }
    }

    @Override // io.grpc.internal.i2
    public final void a(io.grpc.n nVar) {
        h().a((io.grpc.n) com.google.common.base.u.p(nVar, "compressor"));
    }

    @Override // io.grpc.internal.i2
    public final void c(InputStream inputStream) {
        com.google.common.base.u.p(inputStream, "message");
        try {
            if (!h().isClosed()) {
                h().b(inputStream);
            }
        } finally {
            q0.e(inputStream);
        }
    }

    @Override // io.grpc.internal.i2
    public void d() {
        s().t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        h().close();
    }

    @Override // io.grpc.internal.i2
    public final void flush() {
        if (h().isClosed()) {
            return;
        }
        h().flush();
    }

    @Override // io.grpc.internal.i2
    public final void g(int i11) {
        s().u(i11);
    }

    protected abstract o0 h();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i11) {
        s().p(i11);
    }

    @Override // io.grpc.internal.i2
    public boolean isReady() {
        return s().m();
    }

    protected abstract a s();
}