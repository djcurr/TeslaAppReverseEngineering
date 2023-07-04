package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class b1<T> implements o0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<T> f11340a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11341b;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11344e;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<l<T>, p0>> f11343d = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    private int f11342c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends p<T, T> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Pair f11346a;

            a(Pair pair) {
                this.f11346a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                b1 b1Var = b1.this;
                Pair pair = this.f11346a;
                b1Var.f((l) pair.first, (p0) pair.second);
            }
        }

        private void p() {
            Pair pair;
            synchronized (b1.this) {
                pair = (Pair) b1.this.f11343d.poll();
                if (pair == null) {
                    b1.d(b1.this);
                }
            }
            if (pair != null) {
                b1.this.f11344e.execute(new a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void f() {
            o().a();
            p();
        }

        @Override // com.facebook.imagepipeline.producers.p, com.facebook.imagepipeline.producers.b
        protected void g(Throwable th2) {
            o().onFailure(th2);
            p();
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void h(T t11, int i11) {
            o().b(t11, i11);
            if (com.facebook.imagepipeline.producers.b.d(i11)) {
                p();
            }
        }

        private b(l<T> lVar) {
            super(lVar);
        }
    }

    public b1(int i11, Executor executor, o0<T> o0Var) {
        this.f11341b = i11;
        this.f11344e = (Executor) md.k.g(executor);
        this.f11340a = (o0) md.k.g(o0Var);
    }

    static /* synthetic */ int d(b1 b1Var) {
        int i11 = b1Var.f11342c;
        b1Var.f11342c = i11 - 1;
        return i11;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<T> lVar, p0 p0Var) {
        boolean z11;
        p0Var.h().d(p0Var, "ThrottlingProducer");
        synchronized (this) {
            int i11 = this.f11342c;
            z11 = true;
            if (i11 >= this.f11341b) {
                this.f11343d.add(Pair.create(lVar, p0Var));
            } else {
                this.f11342c = i11 + 1;
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        f(lVar, p0Var);
    }

    void f(l<T> lVar, p0 p0Var) {
        p0Var.h().j(p0Var, "ThrottlingProducer", null);
        this.f11340a.b(new b(lVar), p0Var);
    }
}