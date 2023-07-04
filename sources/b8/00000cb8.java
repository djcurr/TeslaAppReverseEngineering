package bk;

import ak.k0;
import android.os.Handler;
import android.view.Surface;
import bk.w;

/* loaded from: classes3.dex */
public interface w {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f7833a;

        /* renamed from: b */
        private final w f7834b;

        public a(Handler handler, w wVar) {
            this.f7833a = wVar != null ? (Handler) ak.a.e(handler) : null;
            this.f7834b = wVar;
        }

        public static /* synthetic */ void a(a aVar, fi.d dVar) {
            aVar.r(dVar);
        }

        public static /* synthetic */ void b(a aVar, String str) {
            aVar.q(str);
        }

        public static /* synthetic */ void c(a aVar, fi.d dVar) {
            aVar.t(dVar);
        }

        public static /* synthetic */ void d(a aVar, Surface surface) {
            aVar.v(surface);
        }

        public static /* synthetic */ void e(a aVar, int i11, long j11) {
            aVar.s(i11, j11);
        }

        public static /* synthetic */ void f(a aVar, String str, long j11, long j12) {
            aVar.p(str, j11, j12);
        }

        public static /* synthetic */ void g(a aVar, ci.i iVar, fi.e eVar) {
            aVar.u(iVar, eVar);
        }

        public static /* synthetic */ void h(a aVar, int i11, int i12, int i13, float f11) {
            aVar.x(i11, i12, i13, f11);
        }

        public static /* synthetic */ void i(a aVar, long j11, int i11) {
            aVar.w(j11, i11);
        }

        public /* synthetic */ void p(String str, long j11, long j12) {
            ((w) k0.j(this.f7834b)).k(str, j11, j12);
        }

        public /* synthetic */ void q(String str) {
            ((w) k0.j(this.f7834b)).i(str);
        }

        public /* synthetic */ void r(fi.d dVar) {
            dVar.c();
            ((w) k0.j(this.f7834b)).W(dVar);
        }

        public /* synthetic */ void s(int i11, long j11) {
            ((w) k0.j(this.f7834b)).H(i11, j11);
        }

        public /* synthetic */ void t(fi.d dVar) {
            ((w) k0.j(this.f7834b)).K(dVar);
        }

        public /* synthetic */ void u(ci.i iVar, fi.e eVar) {
            ((w) k0.j(this.f7834b)).A(iVar, eVar);
        }

        public /* synthetic */ void v(Surface surface) {
            ((w) k0.j(this.f7834b)).p(surface);
        }

        public /* synthetic */ void w(long j11, int i11) {
            ((w) k0.j(this.f7834b)).Z(j11, i11);
        }

        public /* synthetic */ void x(int i11, int i12, int i13, float f11) {
            ((w) k0.j(this.f7834b)).d(i11, i12, i13, f11);
        }

        public void A(final int i11, final int i12, final int i13, final float f11) {
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.n
                    {
                        w.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.h(w.a.this, i11, i12, i13, f11);
                    }
                });
            }
        }

        public void j(final String str, final long j11, final long j12) {
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.v
                    {
                        w.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.f(w.a.this, str, j11, j12);
                    }
                });
            }
        }

        public void k(final String str) {
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.u
                    {
                        w.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.b(w.a.this, str);
                    }
                });
            }
        }

        public void l(final fi.d dVar) {
            dVar.c();
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.s
                    {
                        w.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.a(w.a.this, dVar);
                    }
                });
            }
        }

        public void m(final int i11, final long j11) {
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.o
                    {
                        w.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.e(w.a.this, i11, j11);
                    }
                });
            }
        }

        public void n(final fi.d dVar) {
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.t
                    {
                        w.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.c(w.a.this, dVar);
                    }
                });
            }
        }

        public void o(final ci.i iVar, final fi.e eVar) {
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.g(w.a.this, iVar, eVar);
                    }
                });
            }
        }

        public void y(final Surface surface) {
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.q
                    {
                        w.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.d(w.a.this, surface);
                    }
                });
            }
        }

        public void z(final long j11, final int i11) {
            Handler handler = this.f7833a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: bk.p
                    {
                        w.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.i(w.a.this, j11, i11);
                    }
                });
            }
        }
    }

    default void A(ci.i iVar, fi.e eVar) {
        y(iVar);
    }

    default void H(int i11, long j11) {
    }

    default void K(fi.d dVar) {
    }

    default void W(fi.d dVar) {
    }

    default void Z(long j11, int i11) {
    }

    default void d(int i11, int i12, int i13, float f11) {
    }

    default void i(String str) {
    }

    default void k(String str, long j11, long j12) {
    }

    default void p(Surface surface) {
    }

    @Deprecated
    default void y(ci.i iVar) {
    }
}