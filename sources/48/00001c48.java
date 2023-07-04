package com.google.android.exoplayer2.source;

import ak.k0;
import android.os.Handler;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface k {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public final int f14122a;

        /* renamed from: b */
        public final j.a f14123b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0253a> f14124c;

        /* renamed from: d */
        private final long f14125d;

        /* renamed from: com.google.android.exoplayer2.source.k$a$a */
        /* loaded from: classes3.dex */
        public static final class C0253a {

            /* renamed from: a */
            public Handler f14126a;

            /* renamed from: b */
            public k f14127b;

            public C0253a(Handler handler, k kVar) {
                this.f14126a = handler;
                this.f14127b = kVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public static /* synthetic */ void b(a aVar, k kVar, fj.g gVar, fj.h hVar, IOException iOException, boolean z11) {
            aVar.n(kVar, gVar, hVar, iOException, z11);
        }

        public static /* synthetic */ void c(a aVar, k kVar, fj.g gVar, fj.h hVar) {
            aVar.m(kVar, gVar, hVar);
        }

        public static /* synthetic */ void d(a aVar, k kVar, fj.h hVar) {
            aVar.k(kVar, hVar);
        }

        public static /* synthetic */ void e(a aVar, k kVar, fj.g gVar, fj.h hVar) {
            aVar.o(kVar, gVar, hVar);
        }

        public static /* synthetic */ void f(a aVar, k kVar, fj.g gVar, fj.h hVar) {
            aVar.l(kVar, gVar, hVar);
        }

        private long h(long j11) {
            long d11 = ci.b.d(j11);
            if (d11 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f14125d + d11;
        }

        public /* synthetic */ void k(k kVar, fj.h hVar) {
            kVar.M(this.f14122a, this.f14123b, hVar);
        }

        public /* synthetic */ void l(k kVar, fj.g gVar, fj.h hVar) {
            kVar.R(this.f14122a, this.f14123b, gVar, hVar);
        }

        public /* synthetic */ void m(k kVar, fj.g gVar, fj.h hVar) {
            kVar.Q(this.f14122a, this.f14123b, gVar, hVar);
        }

        public /* synthetic */ void n(k kVar, fj.g gVar, fj.h hVar, IOException iOException, boolean z11) {
            kVar.r(this.f14122a, this.f14123b, gVar, hVar, iOException, z11);
        }

        public /* synthetic */ void o(k kVar, fj.g gVar, fj.h hVar) {
            kVar.b(this.f14122a, this.f14123b, gVar, hVar);
        }

        public /* synthetic */ void p(k kVar, j.a aVar, fj.h hVar) {
            kVar.N(this.f14122a, aVar, hVar);
        }

        public void A(fj.g gVar, int i11, int i12, ci.i iVar, int i13, Object obj, long j11, long j12) {
            B(gVar, new fj.h(i11, i12, iVar, i13, obj, h(j11), h(j12)));
        }

        public void B(final fj.g gVar, final fj.h hVar) {
            Iterator<C0253a> it2 = this.f14124c.iterator();
            while (it2.hasNext()) {
                C0253a next = it2.next();
                final k kVar = next.f14127b;
                k0.F0(next.f14126a, new Runnable() { // from class: fj.l
                    {
                        k.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.e(k.a.this, kVar, gVar, hVar);
                    }
                });
            }
        }

        public void C(k kVar) {
            Iterator<C0253a> it2 = this.f14124c.iterator();
            while (it2.hasNext()) {
                C0253a next = it2.next();
                if (next.f14127b == kVar) {
                    this.f14124c.remove(next);
                }
            }
        }

        public void D(int i11, long j11, long j12) {
            E(new fj.h(1, i11, null, 3, null, h(j11), h(j12)));
        }

        public void E(final fj.h hVar) {
            final j.a aVar = (j.a) ak.a.e(this.f14123b);
            Iterator<C0253a> it2 = this.f14124c.iterator();
            while (it2.hasNext()) {
                C0253a next = it2.next();
                final k kVar = next.f14127b;
                k0.F0(next.f14126a, new Runnable() { // from class: fj.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.this.p(kVar, aVar, hVar);
                    }
                });
            }
        }

        public a F(int i11, j.a aVar, long j11) {
            return new a(this.f14124c, i11, aVar, j11);
        }

        public void g(Handler handler, k kVar) {
            ak.a.e(handler);
            ak.a.e(kVar);
            this.f14124c.add(new C0253a(handler, kVar));
        }

        public void i(int i11, ci.i iVar, int i12, Object obj, long j11) {
            j(new fj.h(1, i11, iVar, i12, obj, h(j11), -9223372036854775807L));
        }

        public void j(final fj.h hVar) {
            Iterator<C0253a> it2 = this.f14124c.iterator();
            while (it2.hasNext()) {
                C0253a next = it2.next();
                final k kVar = next.f14127b;
                k0.F0(next.f14126a, new Runnable() { // from class: fj.o
                    {
                        k.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.d(k.a.this, kVar, hVar);
                    }
                });
            }
        }

        public void q(fj.g gVar, int i11) {
            r(gVar, i11, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(fj.g gVar, int i11, int i12, ci.i iVar, int i13, Object obj, long j11, long j12) {
            s(gVar, new fj.h(i11, i12, iVar, i13, obj, h(j11), h(j12)));
        }

        public void s(final fj.g gVar, final fj.h hVar) {
            Iterator<C0253a> it2 = this.f14124c.iterator();
            while (it2.hasNext()) {
                C0253a next = it2.next();
                final k kVar = next.f14127b;
                k0.F0(next.f14126a, new Runnable() { // from class: fj.m
                    {
                        k.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.f(k.a.this, kVar, gVar, hVar);
                    }
                });
            }
        }

        public void t(fj.g gVar, int i11) {
            u(gVar, i11, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(fj.g gVar, int i11, int i12, ci.i iVar, int i13, Object obj, long j11, long j12) {
            v(gVar, new fj.h(i11, i12, iVar, i13, obj, h(j11), h(j12)));
        }

        public void v(final fj.g gVar, final fj.h hVar) {
            Iterator<C0253a> it2 = this.f14124c.iterator();
            while (it2.hasNext()) {
                C0253a next = it2.next();
                final k kVar = next.f14127b;
                k0.F0(next.f14126a, new Runnable() { // from class: fj.k
                    {
                        k.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.c(k.a.this, kVar, gVar, hVar);
                    }
                });
            }
        }

        public void w(fj.g gVar, int i11, int i12, ci.i iVar, int i13, Object obj, long j11, long j12, IOException iOException, boolean z11) {
            y(gVar, new fj.h(i11, i12, iVar, i13, obj, h(j11), h(j12)), iOException, z11);
        }

        public void x(fj.g gVar, int i11, IOException iOException, boolean z11) {
            w(gVar, i11, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z11);
        }

        public void y(final fj.g gVar, final fj.h hVar, final IOException iOException, final boolean z11) {
            Iterator<C0253a> it2 = this.f14124c.iterator();
            while (it2.hasNext()) {
                C0253a next = it2.next();
                final k kVar = next.f14127b;
                k0.F0(next.f14126a, new Runnable() { // from class: fj.n
                    {
                        k.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.a.b(k.a.this, kVar, gVar, hVar, iOException, z11);
                    }
                });
            }
        }

        public void z(fj.g gVar, int i11) {
            A(gVar, i11, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        private a(CopyOnWriteArrayList<C0253a> copyOnWriteArrayList, int i11, j.a aVar, long j11) {
            this.f14124c = copyOnWriteArrayList;
            this.f14122a = i11;
            this.f14123b = aVar;
            this.f14125d = j11;
        }
    }

    default void M(int i11, j.a aVar, fj.h hVar) {
    }

    default void N(int i11, j.a aVar, fj.h hVar) {
    }

    default void Q(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
    }

    default void R(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
    }

    default void b(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
    }

    default void r(int i11, j.a aVar, fj.g gVar, fj.h hVar, IOException iOException, boolean z11) {
    }
}