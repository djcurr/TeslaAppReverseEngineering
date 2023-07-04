package androidx.camera.core;

import androidx.camera.core.m;
import androidx.camera.core.t;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t extends r {

    /* renamed from: f */
    final Executor f2509f;

    /* renamed from: g */
    private final Object f2510g = new Object();

    /* renamed from: h */
    g0 f2511h;

    /* renamed from: i */
    private b f2512i;

    /* loaded from: classes.dex */
    public class a implements c0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ b f2513a;

        a(t tVar, b bVar) {
            this.f2513a = bVar;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r12) {
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            this.f2513a.close();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends m {

        /* renamed from: c */
        final WeakReference<t> f2514c;

        b(g0 g0Var, t tVar) {
            super(g0Var);
            this.f2514c = new WeakReference<>(tVar);
            a(new m.a() { // from class: androidx.camera.core.u
                {
                    t.b.this = this;
                }

                @Override // androidx.camera.core.m.a
                public final void a(g0 g0Var2) {
                    t.b.j(t.b.this, g0Var2);
                }
            });
        }

        public static /* synthetic */ void j(b bVar, g0 g0Var) {
            bVar.l(g0Var);
        }

        public /* synthetic */ void l(g0 g0Var) {
            final t tVar = this.f2514c.get();
            if (tVar != null) {
                tVar.f2509f.execute(new Runnable() { // from class: androidx.camera.core.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.n();
                    }
                });
            }
        }
    }

    public t(Executor executor) {
        this.f2509f = executor;
    }

    @Override // androidx.camera.core.r
    g0 d(androidx.camera.core.impl.r0 r0Var) {
        return r0Var.b();
    }

    @Override // androidx.camera.core.r
    public void g() {
        synchronized (this.f2510g) {
            g0 g0Var = this.f2511h;
            if (g0Var != null) {
                g0Var.close();
                this.f2511h = null;
            }
        }
    }

    @Override // androidx.camera.core.r
    void k(g0 g0Var) {
        synchronized (this.f2510g) {
            if (!this.f2494e) {
                g0Var.close();
            } else if (this.f2512i != null) {
                if (g0Var.l1().getTimestamp() <= this.f2512i.l1().getTimestamp()) {
                    g0Var.close();
                } else {
                    g0 g0Var2 = this.f2511h;
                    if (g0Var2 != null) {
                        g0Var2.close();
                    }
                    this.f2511h = g0Var;
                }
            } else {
                b bVar = new b(g0Var, this);
                this.f2512i = bVar;
                c0.f.b(e(bVar), new a(this, bVar), b0.a.a());
            }
        }
    }

    public void n() {
        synchronized (this.f2510g) {
            this.f2512i = null;
            g0 g0Var = this.f2511h;
            if (g0Var != null) {
                this.f2511h = null;
                k(g0Var);
            }
        }
    }
}