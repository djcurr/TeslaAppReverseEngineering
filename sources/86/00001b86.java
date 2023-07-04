package com.google.android.exoplayer2.drm;

import ak.k0;
import android.os.Handler;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public interface f {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public final int f13357a;

        /* renamed from: b */
        public final j.a f13358b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0248a> f13359c;

        /* renamed from: com.google.android.exoplayer2.drm.f$a$a */
        /* loaded from: classes3.dex */
        public static final class C0248a {

            /* renamed from: a */
            public Handler f13360a;

            /* renamed from: b */
            public f f13361b;

            public C0248a(Handler handler, f fVar) {
                this.f13360a = handler;
                this.f13361b = fVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public /* synthetic */ void n(f fVar) {
            fVar.S(this.f13357a, this.f13358b);
        }

        public /* synthetic */ void o(f fVar) {
            fVar.v(this.f13357a, this.f13358b);
        }

        public /* synthetic */ void p(f fVar) {
            fVar.a0(this.f13357a, this.f13358b);
        }

        public /* synthetic */ void q(f fVar) {
            fVar.w(this.f13357a, this.f13358b);
        }

        public /* synthetic */ void r(f fVar, Exception exc) {
            fVar.F(this.f13357a, this.f13358b, exc);
        }

        public /* synthetic */ void s(f fVar) {
            fVar.U(this.f13357a, this.f13358b);
        }

        public void g(Handler handler, f fVar) {
            ak.a.e(handler);
            ak.a.e(fVar);
            this.f13359c.add(new C0248a(handler, fVar));
        }

        public void h() {
            Iterator<C0248a> it2 = this.f13359c.iterator();
            while (it2.hasNext()) {
                C0248a next = it2.next();
                final f fVar = next.f13361b;
                k0.F0(next.f13360a, new Runnable() { // from class: hi.i
                    {
                        f.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.this.n(fVar);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0248a> it2 = this.f13359c.iterator();
            while (it2.hasNext()) {
                C0248a next = it2.next();
                final f fVar = next.f13361b;
                k0.F0(next.f13360a, new Runnable() { // from class: hi.h
                    {
                        f.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.this.o(fVar);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0248a> it2 = this.f13359c.iterator();
            while (it2.hasNext()) {
                C0248a next = it2.next();
                final f fVar = next.f13361b;
                k0.F0(next.f13360a, new Runnable() { // from class: hi.j
                    {
                        f.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.this.p(fVar);
                    }
                });
            }
        }

        public void k() {
            Iterator<C0248a> it2 = this.f13359c.iterator();
            while (it2.hasNext()) {
                C0248a next = it2.next();
                final f fVar = next.f13361b;
                k0.F0(next.f13360a, new Runnable() { // from class: hi.f
                    {
                        f.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.this.q(fVar);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0248a> it2 = this.f13359c.iterator();
            while (it2.hasNext()) {
                C0248a next = it2.next();
                final f fVar = next.f13361b;
                k0.F0(next.f13360a, new Runnable() { // from class: hi.k
                    {
                        f.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.this.r(fVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0248a> it2 = this.f13359c.iterator();
            while (it2.hasNext()) {
                C0248a next = it2.next();
                final f fVar = next.f13361b;
                k0.F0(next.f13360a, new Runnable() { // from class: hi.g
                    {
                        f.a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.this.s(fVar);
                    }
                });
            }
        }

        public a t(int i11, j.a aVar) {
            return new a(this.f13359c, i11, aVar);
        }

        private a(CopyOnWriteArrayList<C0248a> copyOnWriteArrayList, int i11, j.a aVar) {
            this.f13359c = copyOnWriteArrayList;
            this.f13357a = i11;
            this.f13358b = aVar;
        }
    }

    default void F(int i11, j.a aVar, Exception exc) {
    }

    default void S(int i11, j.a aVar) {
    }

    default void U(int i11, j.a aVar) {
    }

    default void a0(int i11, j.a aVar) {
    }

    default void v(int i11, j.a aVar) {
    }

    default void w(int i11, j.a aVar) {
    }
}