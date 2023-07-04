package com.google.android.exoplayer2.audio;

import ak.k0;
import android.os.Handler;
import com.google.android.exoplayer2.audio.a;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: com.google.android.exoplayer2.audio.a$a */
    /* loaded from: classes3.dex */
    public static final class C0246a {

        /* renamed from: a */
        private final Handler f13102a;

        /* renamed from: b */
        private final a f13103b;

        public C0246a(Handler handler, a aVar) {
            this.f13102a = aVar != null ? (Handler) ak.a.e(handler) : null;
            this.f13103b = aVar;
        }

        public static /* synthetic */ void a(C0246a c0246a, boolean z11) {
            c0246a.w(z11);
        }

        public static /* synthetic */ void b(C0246a c0246a, fi.d dVar) {
            c0246a.s(dVar);
        }

        public static /* synthetic */ void c(C0246a c0246a, Exception exc) {
            c0246a.p(exc);
        }

        public static /* synthetic */ void d(C0246a c0246a, ci.i iVar, fi.e eVar) {
            c0246a.u(iVar, eVar);
        }

        public static /* synthetic */ void e(C0246a c0246a, String str, long j11, long j12) {
            c0246a.q(str, j11, j12);
        }

        public static /* synthetic */ void f(C0246a c0246a, String str) {
            c0246a.r(str);
        }

        public static /* synthetic */ void g(C0246a c0246a, long j11) {
            c0246a.v(j11);
        }

        public static /* synthetic */ void h(C0246a c0246a, int i11, long j11, long j12) {
            c0246a.x(i11, j11, j12);
        }

        public static /* synthetic */ void i(C0246a c0246a, fi.d dVar) {
            c0246a.t(dVar);
        }

        public /* synthetic */ void p(Exception exc) {
            ((a) k0.j(this.f13103b)).c(exc);
        }

        public /* synthetic */ void q(String str, long j11, long j12) {
            ((a) k0.j(this.f13103b)).t(str, j11, j12);
        }

        public /* synthetic */ void r(String str) {
            ((a) k0.j(this.f13103b)).s(str);
        }

        public /* synthetic */ void s(fi.d dVar) {
            dVar.c();
            ((a) k0.j(this.f13103b)).z(dVar);
        }

        public /* synthetic */ void t(fi.d dVar) {
            ((a) k0.j(this.f13103b)).m(dVar);
        }

        public /* synthetic */ void u(ci.i iVar, fi.e eVar) {
            ((a) k0.j(this.f13103b)).I(iVar, eVar);
        }

        public /* synthetic */ void v(long j11) {
            ((a) k0.j(this.f13103b)).x(j11);
        }

        public /* synthetic */ void w(boolean z11) {
            ((a) k0.j(this.f13103b)).a(z11);
        }

        public /* synthetic */ void x(int i11, long j11, long j12) {
            ((a) k0.j(this.f13103b)).X(i11, j11, j12);
        }

        public void A(final int i11, final long j11, final long j12) {
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.g
                    {
                        a.C0246a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.h(a.C0246a.this, i11, j11, j12);
                    }
                });
            }
        }

        public void j(final Exception exc) {
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.l
                    {
                        a.C0246a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.c(a.C0246a.this, exc);
                    }
                });
            }
        }

        public void k(final String str, final long j11, final long j12) {
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.n
                    {
                        a.C0246a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.e(a.C0246a.this, str, j11, j12);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.m
                    {
                        a.C0246a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.f(a.C0246a.this, str);
                    }
                });
            }
        }

        public void m(final fi.d dVar) {
            dVar.c();
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.j
                    {
                        a.C0246a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.b(a.C0246a.this, dVar);
                    }
                });
            }
        }

        public void n(final fi.d dVar) {
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.k
                    {
                        a.C0246a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.i(a.C0246a.this, dVar);
                    }
                });
            }
        }

        public void o(final ci.i iVar, final fi.e eVar) {
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.d(a.C0246a.this, iVar, eVar);
                    }
                });
            }
        }

        public void y(final long j11) {
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.h
                    {
                        a.C0246a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.g(a.C0246a.this, j11);
                    }
                });
            }
        }

        public void z(final boolean z11) {
            Handler handler = this.f13102a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ei.o
                    {
                        a.C0246a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0246a.a(a.C0246a.this, z11);
                    }
                });
            }
        }
    }

    default void I(ci.i iVar, fi.e eVar) {
        Y(iVar);
    }

    default void X(int i11, long j11, long j12) {
    }

    @Deprecated
    default void Y(ci.i iVar) {
    }

    default void a(boolean z11) {
    }

    default void c(Exception exc) {
    }

    default void m(fi.d dVar) {
    }

    default void s(String str) {
    }

    default void t(String str, long j11, long j12) {
    }

    default void x(long j11) {
    }

    default void z(fi.d dVar) {
    }
}