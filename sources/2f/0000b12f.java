package ry;

import b80.c;
import hy.e;
import hy.o;
import hy.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ky.h;
import yy.f;

/* loaded from: classes5.dex */
public final class b<T, R> extends e<R> {

    /* renamed from: b  reason: collision with root package name */
    final e<T> f49743b;

    /* renamed from: c  reason: collision with root package name */
    final h<? super T, ? extends q<? extends R>> f49744c;

    /* renamed from: d  reason: collision with root package name */
    final f f49745d;

    /* renamed from: e  reason: collision with root package name */
    final int f49746e;

    /* loaded from: classes5.dex */
    static final class a<T, R> extends ry.a<T> implements c {

        /* renamed from: i  reason: collision with root package name */
        final b80.b<? super R> f49747i;

        /* renamed from: j  reason: collision with root package name */
        final h<? super T, ? extends q<? extends R>> f49748j;

        /* renamed from: k  reason: collision with root package name */
        final AtomicLong f49749k;

        /* renamed from: l  reason: collision with root package name */
        final C1089a<R> f49750l;

        /* renamed from: m  reason: collision with root package name */
        long f49751m;

        /* renamed from: n  reason: collision with root package name */
        int f49752n;

        /* renamed from: o  reason: collision with root package name */
        R f49753o;

        /* renamed from: p  reason: collision with root package name */
        volatile int f49754p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ry.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1089a<R> extends AtomicReference<iy.b> implements o<R> {

            /* renamed from: a  reason: collision with root package name */
            final a<?, R> f49755a;

            C1089a(a<?, R> aVar) {
                this.f49755a = aVar;
            }

            @Override // hy.o
            public void a(iy.b bVar) {
                ly.a.replace(this, bVar);
            }

            void b() {
                ly.a.dispose(this);
            }

            @Override // hy.o
            public void onError(Throwable th2) {
                this.f49755a.i(th2);
            }

            @Override // hy.o
            public void onSuccess(R r11) {
                this.f49755a.j(r11);
            }
        }

        a(b80.b<? super R> bVar, h<? super T, ? extends q<? extends R>> hVar, int i11, f fVar) {
            super(i11, fVar);
            this.f49747i = bVar;
            this.f49748j = hVar;
            this.f49749k = new AtomicLong();
            this.f49750l = new C1089a<>(this);
        }

        @Override // ry.a
        void a() {
            this.f49753o = null;
        }

        @Override // b80.c
        public void cancel() {
            h();
        }

        @Override // ry.a
        void d() {
            this.f49750l.b();
        }

        @Override // ry.a
        void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            b80.b<? super R> bVar = this.f49747i;
            f fVar = this.f49737c;
            ny.h<T> hVar = this.f49738d;
            yy.b bVar2 = this.f49735a;
            AtomicLong atomicLong = this.f49749k;
            int i11 = this.f49736b;
            int i12 = i11 - (i11 >> 1);
            boolean z11 = this.f49742h;
            int i13 = 1;
            while (true) {
                if (this.f49741g) {
                    hVar.clear();
                    this.f49753o = null;
                } else {
                    int i14 = this.f49754p;
                    if (bVar2.get() == null || (fVar != f.IMMEDIATE && (fVar != f.BOUNDARY || i14 != 0))) {
                        if (i14 == 0) {
                            boolean z12 = this.f49740f;
                            try {
                                T poll = hVar.poll();
                                boolean z13 = poll == null;
                                if (z12 && z13) {
                                    bVar2.e(bVar);
                                    return;
                                } else if (!z13) {
                                    if (!z11) {
                                        int i15 = this.f49752n + 1;
                                        if (i15 == i12) {
                                            this.f49752n = 0;
                                            this.f49739e.request(i12);
                                        } else {
                                            this.f49752n = i15;
                                        }
                                    }
                                    try {
                                        q<? extends R> apply = this.f49748j.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                        q<? extends R> qVar = apply;
                                        this.f49754p = 1;
                                        qVar.a(this.f49750l);
                                    } catch (Throwable th2) {
                                        jy.a.b(th2);
                                        this.f49739e.cancel();
                                        hVar.clear();
                                        bVar2.c(th2);
                                        bVar2.e(bVar);
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                jy.a.b(th3);
                                this.f49739e.cancel();
                                bVar2.c(th3);
                                bVar2.e(bVar);
                                return;
                            }
                        } else if (i14 == 2) {
                            long j11 = this.f49751m;
                            if (j11 != atomicLong.get()) {
                                this.f49753o = null;
                                bVar.b((R) this.f49753o);
                                this.f49751m = j11 + 1;
                                this.f49754p = 0;
                            }
                        }
                    }
                }
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
            }
            hVar.clear();
            this.f49753o = null;
            bVar2.e(bVar);
        }

        @Override // ry.a
        void f() {
            this.f49747i.c(this);
        }

        void i(Throwable th2) {
            if (this.f49735a.c(th2)) {
                if (this.f49737c != f.END) {
                    this.f49739e.cancel();
                }
                this.f49754p = 0;
                e();
            }
        }

        void j(R r11) {
            this.f49753o = r11;
            this.f49754p = 2;
            e();
        }

        @Override // b80.c
        public void request(long j11) {
            yy.c.a(this.f49749k, j11);
            e();
        }
    }

    public b(e<T> eVar, h<? super T, ? extends q<? extends R>> hVar, f fVar, int i11) {
        this.f49743b = eVar;
        this.f49744c = hVar;
        this.f49745d = fVar;
        this.f49746e = i11;
    }

    @Override // hy.e
    protected void z(b80.b<? super R> bVar) {
        this.f49743b.y(new a(bVar, this.f49744c, this.f49746e, this.f49745d));
    }
}