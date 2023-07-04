package zj;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import zj.d;

/* loaded from: classes3.dex */
public interface d {

    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: zj.d$a$a */
        /* loaded from: classes3.dex */
        public static final class C1384a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C1385a> f60428a = new CopyOnWriteArrayList<>();

            /* renamed from: zj.d$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C1385a {

                /* renamed from: a */
                private final Handler f60429a;

                /* renamed from: b */
                private final a f60430b;

                /* renamed from: c */
                private boolean f60431c;

                public C1385a(Handler handler, a aVar) {
                    this.f60429a = handler;
                    this.f60430b = aVar;
                }

                public void d() {
                    this.f60431c = true;
                }
            }

            public static /* synthetic */ void a(C1385a c1385a, int i11, long j11, long j12) {
                d(c1385a, i11, j11, j12);
            }

            public static /* synthetic */ void d(C1385a c1385a, int i11, long j11, long j12) {
                c1385a.f60430b.o(i11, j11, j12);
            }

            public void b(Handler handler, a aVar) {
                ak.a.e(handler);
                ak.a.e(aVar);
                e(aVar);
                this.f60428a.add(new C1385a(handler, aVar));
            }

            public void c(final int i11, final long j11, final long j12) {
                Iterator<C1385a> it2 = this.f60428a.iterator();
                while (it2.hasNext()) {
                    final C1385a next = it2.next();
                    if (!next.f60431c) {
                        next.f60429a.post(new Runnable() { // from class: zj.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C1384a.a(d.a.C1384a.C1385a.this, i11, j11, j12);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C1385a> it2 = this.f60428a.iterator();
                while (it2.hasNext()) {
                    C1385a next = it2.next();
                    if (next.f60430b == aVar) {
                        next.d();
                        this.f60428a.remove(next);
                    }
                }
            }
        }

        void o(int i11, long j11, long j12);
    }

    void a(a aVar);

    void c(Handler handler, a aVar);

    n d();

    long e();
}