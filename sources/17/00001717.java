package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class n0 implements o0<qd.a<nf.c>> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<qd.a<nf.c>> f11498a;

    /* renamed from: b  reason: collision with root package name */
    private final gf.f f11499b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11500c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends p<qd.a<nf.c>, qd.a<nf.c>> {

        /* renamed from: c  reason: collision with root package name */
        private final r0 f11501c;

        /* renamed from: d  reason: collision with root package name */
        private final p0 f11502d;

        /* renamed from: e  reason: collision with root package name */
        private final sf.b f11503e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11504f;

        /* renamed from: g  reason: collision with root package name */
        private qd.a<nf.c> f11505g;

        /* renamed from: h  reason: collision with root package name */
        private int f11506h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f11507i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f11508j;

        /* loaded from: classes3.dex */
        class a extends e {
            a(n0 n0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                b.this.B();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.n0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0217b implements Runnable {
            RunnableC0217b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                qd.a aVar;
                int i11;
                synchronized (b.this) {
                    aVar = b.this.f11505g;
                    i11 = b.this.f11506h;
                    b.this.f11505g = null;
                    b.this.f11507i = false;
                }
                if (qd.a.n0(aVar)) {
                    try {
                        b.this.y(aVar, i11);
                    } finally {
                        qd.a.C(aVar);
                    }
                }
                b.this.w();
            }
        }

        public b(l<qd.a<nf.c>> lVar, r0 r0Var, sf.b bVar, p0 p0Var) {
            super(lVar);
            this.f11505g = null;
            this.f11506h = 0;
            this.f11507i = false;
            this.f11508j = false;
            this.f11501c = r0Var;
            this.f11503e = bVar;
            this.f11502d = p0Var;
            p0Var.c(new a(n0.this));
        }

        private synchronized boolean A() {
            return this.f11504f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B() {
            if (x()) {
                o().a();
            }
        }

        private void C(Throwable th2) {
            if (x()) {
                o().onFailure(th2);
            }
        }

        private void D(qd.a<nf.c> aVar, int i11) {
            boolean d11 = com.facebook.imagepipeline.producers.b.d(i11);
            if ((d11 || A()) && !(d11 && x())) {
                return;
            }
            o().b(aVar, i11);
        }

        private qd.a<nf.c> F(nf.c cVar) {
            nf.d dVar = (nf.d) cVar;
            qd.a<Bitmap> b11 = this.f11503e.b(dVar.p(), n0.this.f11499b);
            try {
                nf.d dVar2 = new nf.d(b11, cVar.a(), dVar.a0(), dVar.R());
                dVar2.m(dVar.getExtras());
                return qd.a.p0(dVar2);
            } finally {
                qd.a.C(b11);
            }
        }

        private synchronized boolean G() {
            if (this.f11504f || !this.f11507i || this.f11508j || !qd.a.n0(this.f11505g)) {
                return false;
            }
            this.f11508j = true;
            return true;
        }

        private boolean H(nf.c cVar) {
            return cVar instanceof nf.d;
        }

        private void I() {
            n0.this.f11500c.execute(new RunnableC0217b());
        }

        private void J(qd.a<nf.c> aVar, int i11) {
            synchronized (this) {
                if (this.f11504f) {
                    return;
                }
                qd.a<nf.c> aVar2 = this.f11505g;
                this.f11505g = qd.a.m(aVar);
                this.f11506h = i11;
                this.f11507i = true;
                boolean G = G();
                qd.a.C(aVar2);
                if (G) {
                    I();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w() {
            boolean G;
            synchronized (this) {
                this.f11508j = false;
                G = G();
            }
            if (G) {
                I();
            }
        }

        private boolean x() {
            synchronized (this) {
                if (this.f11504f) {
                    return false;
                }
                qd.a<nf.c> aVar = this.f11505g;
                this.f11505g = null;
                this.f11504f = true;
                qd.a.C(aVar);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void y(qd.a<nf.c> aVar, int i11) {
            md.k.b(Boolean.valueOf(qd.a.n0(aVar)));
            if (!H(aVar.J())) {
                D(aVar, i11);
                return;
            }
            this.f11501c.d(this.f11502d, "PostprocessorProducer");
            try {
                try {
                    qd.a<nf.c> F = F(aVar.J());
                    r0 r0Var = this.f11501c;
                    p0 p0Var = this.f11502d;
                    r0Var.j(p0Var, "PostprocessorProducer", z(r0Var, p0Var, this.f11503e));
                    D(F, i11);
                    qd.a.C(F);
                } catch (Exception e11) {
                    r0 r0Var2 = this.f11501c;
                    p0 p0Var2 = this.f11502d;
                    r0Var2.k(p0Var2, "PostprocessorProducer", e11, z(r0Var2, p0Var2, this.f11503e));
                    C(e11);
                    qd.a.C(null);
                }
            } catch (Throwable th2) {
                qd.a.C(null);
                throw th2;
            }
        }

        private Map<String, String> z(r0 r0Var, p0 p0Var, sf.b bVar) {
            if (r0Var.f(p0Var, "PostprocessorProducer")) {
                return md.g.of("Postprocessor", bVar.getName());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: E */
        public void h(qd.a<nf.c> aVar, int i11) {
            if (!qd.a.n0(aVar)) {
                if (com.facebook.imagepipeline.producers.b.d(i11)) {
                    D(null, i11);
                    return;
                }
                return;
            }
            J(aVar, i11);
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void f() {
            B();
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th2) {
            C(th2);
        }
    }

    /* loaded from: classes3.dex */
    class c extends p<qd.a<nf.c>, qd.a<nf.c>> implements sf.d {

        /* renamed from: c  reason: collision with root package name */
        private boolean f11512c;

        /* renamed from: d  reason: collision with root package name */
        private qd.a<nf.c> f11513d;

        /* loaded from: classes3.dex */
        class a extends e {
            a(n0 n0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                if (c.this.q()) {
                    c.this.o().a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean q() {
            synchronized (this) {
                if (this.f11512c) {
                    return false;
                }
                qd.a<nf.c> aVar = this.f11513d;
                this.f11513d = null;
                this.f11512c = true;
                qd.a.C(aVar);
                return true;
            }
        }

        private void s(qd.a<nf.c> aVar) {
            synchronized (this) {
                if (this.f11512c) {
                    return;
                }
                qd.a<nf.c> aVar2 = this.f11513d;
                this.f11513d = qd.a.m(aVar);
                qd.a.C(aVar2);
            }
        }

        private void t() {
            synchronized (this) {
                if (this.f11512c) {
                    return;
                }
                qd.a<nf.c> m11 = qd.a.m(this.f11513d);
                try {
                    o().b(m11, 0);
                } finally {
                    qd.a.C(m11);
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void f() {
            if (q()) {
                o().a();
            }
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th2) {
            if (q()) {
                o().onFailure(th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: r */
        public void h(qd.a<nf.c> aVar, int i11) {
            if (com.facebook.imagepipeline.producers.b.e(i11)) {
                return;
            }
            s(aVar);
            t();
        }

        private c(n0 n0Var, b bVar, sf.c cVar, p0 p0Var) {
            super(bVar);
            this.f11512c = false;
            this.f11513d = null;
            cVar.c(this);
            p0Var.c(new a(n0Var));
        }
    }

    /* loaded from: classes3.dex */
    class d extends p<qd.a<nf.c>, qd.a<nf.c>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: p */
        public void h(qd.a<nf.c> aVar, int i11) {
            if (com.facebook.imagepipeline.producers.b.e(i11)) {
                return;
            }
            o().b(aVar, i11);
        }

        private d(n0 n0Var, b bVar) {
            super(bVar);
        }
    }

    public n0(o0<qd.a<nf.c>> o0Var, gf.f fVar, Executor executor) {
        this.f11498a = (o0) md.k.g(o0Var);
        this.f11499b = fVar;
        this.f11500c = (Executor) md.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<qd.a<nf.c>> lVar, p0 p0Var) {
        l<qd.a<nf.c>> dVar;
        r0 h11 = p0Var.h();
        sf.b i11 = p0Var.l().i();
        b bVar = new b(lVar, h11, i11, p0Var);
        if (i11 instanceof sf.c) {
            dVar = new c(bVar, (sf.c) i11, p0Var);
        } else {
            dVar = new d(bVar);
        }
        this.f11498a.b(dVar, p0Var);
    }
}