package androidx.camera.core;

import androidx.camera.core.impl.r0;
import androidx.camera.core.o;
import androidx.concurrent.futures.b;
import androidx.core.os.OperationCanceledException;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class r implements r0.a {

    /* renamed from: a  reason: collision with root package name */
    private o.a f2490a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f2491b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f2492c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f2493d = new Object();

    /* renamed from: e  reason: collision with root package name */
    protected boolean f2494e = true;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(g0 g0Var, o.a aVar, b.a aVar2) {
        if (this.f2494e) {
            aVar.a(new b1(g0Var, m0.d(g0Var.l1().a(), g0Var.l1().getTimestamp(), this.f2491b)));
            aVar2.c(null);
            return;
        }
        aVar2.f(new OperationCanceledException("ImageAnalysis is detached"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object j(Executor executor, final g0 g0Var, final o.a aVar, final b.a aVar2) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.q
            @Override // java.lang.Runnable
            public final void run() {
                r.this.i(g0Var, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    @Override // androidx.camera.core.impl.r0.a
    public void a(androidx.camera.core.impl.r0 r0Var) {
        try {
            g0 d11 = d(r0Var);
            if (d11 != null) {
                k(d11);
            }
        } catch (IllegalStateException e11) {
            n0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e11);
        }
    }

    abstract g0 d(androidx.camera.core.impl.r0 r0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.c<Void> e(final g0 g0Var) {
        final Executor executor;
        final o.a aVar;
        synchronized (this.f2493d) {
            executor = this.f2492c;
            aVar = this.f2490a;
        }
        if (aVar != null && executor != null) {
            return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.p
                @Override // androidx.concurrent.futures.b.c
                public final Object a(b.a aVar2) {
                    Object j11;
                    j11 = r.this.j(executor, g0Var, aVar, aVar2);
                    return j11;
                }
            });
        }
        return c0.f.f(new OperationCanceledException("No analyzer or executor currently set."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f2494e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.f2494e = false;
        g();
    }

    abstract void k(g0 g0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Executor executor, o.a aVar) {
        synchronized (this.f2493d) {
            if (aVar == null) {
                g();
            }
            this.f2490a = aVar;
            this.f2492c = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i11) {
        this.f2491b = i11;
    }
}