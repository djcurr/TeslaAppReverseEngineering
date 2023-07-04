package qy;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class c<T, R> extends b<T, R> {

    /* renamed from: c  reason: collision with root package name */
    final ky.h<? super T, ? extends b80.a<? extends R>> f48698c;

    /* renamed from: d  reason: collision with root package name */
    final int f48699d;

    /* renamed from: e  reason: collision with root package name */
    final int f48700e;

    /* renamed from: f  reason: collision with root package name */
    final yy.f f48701f;

    /* loaded from: classes5.dex */
    static final class a<T, R> extends AtomicInteger implements hy.f<T>, b80.c, wy.d<R> {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super R> f48702a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super T, ? extends b80.a<? extends R>> f48703b;

        /* renamed from: c  reason: collision with root package name */
        final int f48704c;

        /* renamed from: d  reason: collision with root package name */
        final int f48705d;

        /* renamed from: e  reason: collision with root package name */
        final yy.f f48706e;

        /* renamed from: f  reason: collision with root package name */
        final yy.b f48707f = new yy.b();

        /* renamed from: g  reason: collision with root package name */
        final AtomicLong f48708g = new AtomicLong();

        /* renamed from: h  reason: collision with root package name */
        final uy.c<wy.c<R>> f48709h;

        /* renamed from: i  reason: collision with root package name */
        b80.c f48710i;

        /* renamed from: j  reason: collision with root package name */
        volatile boolean f48711j;

        /* renamed from: k  reason: collision with root package name */
        volatile boolean f48712k;

        /* renamed from: l  reason: collision with root package name */
        volatile wy.c<R> f48713l;

        a(b80.b<? super R> bVar, ky.h<? super T, ? extends b80.a<? extends R>> hVar, int i11, int i12, yy.f fVar) {
            this.f48702a = bVar;
            this.f48703b = hVar;
            this.f48704c = i11;
            this.f48705d = i12;
            this.f48706e = fVar;
            this.f48709h = new uy.c<>(Math.min(i12, i11));
        }

        @Override // wy.d
        public void a() {
            wy.c<R> cVar;
            int i11;
            boolean z11;
            long j11;
            long j12;
            ny.h<R> d11;
            int i12;
            if (getAndIncrement() != 0) {
                return;
            }
            wy.c<R> cVar2 = this.f48713l;
            b80.b<? super R> bVar = this.f48702a;
            yy.f fVar = this.f48706e;
            int i13 = 1;
            while (true) {
                long j13 = this.f48708g.get();
                if (cVar2 != null) {
                    cVar = cVar2;
                } else if (fVar != yy.f.END && this.f48707f.get() != null) {
                    h();
                    this.f48707f.e(this.f48702a);
                    return;
                } else {
                    boolean z12 = this.f48712k;
                    cVar = this.f48709h.poll();
                    if (z12 && cVar == null) {
                        this.f48707f.e(this.f48702a);
                        return;
                    } else if (cVar != null) {
                        this.f48713l = cVar;
                    }
                }
                if (cVar == null || (d11 = cVar.d()) == null) {
                    i11 = i13;
                    z11 = false;
                    j11 = 0;
                    j12 = 0;
                } else {
                    j12 = 0;
                    while (true) {
                        i12 = (j12 > j13 ? 1 : (j12 == j13 ? 0 : -1));
                        i11 = i13;
                        if (i12 == 0) {
                            break;
                        } else if (this.f48711j) {
                            h();
                            return;
                        } else if (fVar == yy.f.IMMEDIATE && this.f48707f.get() != null) {
                            this.f48713l = null;
                            cVar.cancel();
                            h();
                            this.f48707f.e(this.f48702a);
                            return;
                        } else {
                            boolean a11 = cVar.a();
                            try {
                                R poll = d11.poll();
                                boolean z13 = poll == null;
                                if (a11 && z13) {
                                    this.f48713l = null;
                                    this.f48710i.request(1L);
                                    cVar = null;
                                    z11 = true;
                                    break;
                                } else if (z13) {
                                    break;
                                } else {
                                    bVar.b(poll);
                                    j12++;
                                    cVar.request(1L);
                                    i13 = i11;
                                }
                            } catch (Throwable th2) {
                                jy.a.b(th2);
                                this.f48713l = null;
                                cVar.cancel();
                                h();
                                bVar.onError(th2);
                                return;
                            }
                        }
                    }
                    z11 = false;
                    if (i12 == 0) {
                        if (this.f48711j) {
                            h();
                            return;
                        } else if (fVar == yy.f.IMMEDIATE && this.f48707f.get() != null) {
                            this.f48713l = null;
                            cVar.cancel();
                            h();
                            this.f48707f.e(this.f48702a);
                            return;
                        } else {
                            boolean a12 = cVar.a();
                            boolean isEmpty = d11.isEmpty();
                            if (a12 && isEmpty) {
                                this.f48713l = null;
                                this.f48710i.request(1L);
                                cVar = null;
                                z11 = true;
                            }
                        }
                    }
                    j11 = 0;
                }
                if (j12 != j11 && j13 != Long.MAX_VALUE) {
                    this.f48708g.addAndGet(-j12);
                }
                if (z11) {
                    cVar2 = cVar;
                    i13 = i11;
                } else {
                    i13 = addAndGet(-i11);
                    if (i13 == 0) {
                        return;
                    }
                    cVar2 = cVar;
                }
            }
        }

        @Override // b80.b
        public void b(T t11) {
            try {
                b80.a<? extends R> apply = this.f48703b.apply(t11);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                b80.a<? extends R> aVar = apply;
                wy.c<R> cVar = new wy.c<>(this, this.f48705d);
                if (this.f48711j) {
                    return;
                }
                this.f48709h.offer(cVar);
                aVar.a(cVar);
                if (this.f48711j) {
                    cVar.cancel();
                    i();
                }
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f48710i.cancel();
                onError(th2);
            }
        }

        @Override // hy.f, b80.b
        public void c(b80.c cVar) {
            if (xy.e.validate(this.f48710i, cVar)) {
                this.f48710i = cVar;
                this.f48702a.c(this);
                int i11 = this.f48704c;
                cVar.request(i11 == Integer.MAX_VALUE ? Long.MAX_VALUE : i11);
            }
        }

        @Override // b80.c
        public void cancel() {
            if (this.f48711j) {
                return;
            }
            this.f48711j = true;
            this.f48710i.cancel();
            this.f48707f.d();
            i();
        }

        @Override // wy.d
        public void d(wy.c<R> cVar, R r11) {
            if (cVar.d().offer(r11)) {
                a();
                return;
            }
            cVar.cancel();
            f(cVar, new MissingBackpressureException());
        }

        @Override // wy.d
        public void e(wy.c<R> cVar) {
            cVar.e();
            a();
        }

        @Override // wy.d
        public void f(wy.c<R> cVar, Throwable th2) {
            if (this.f48707f.c(th2)) {
                cVar.e();
                if (this.f48706e != yy.f.END) {
                    this.f48710i.cancel();
                }
                a();
            }
        }

        void h() {
            wy.c<R> cVar = this.f48713l;
            this.f48713l = null;
            if (cVar != null) {
                cVar.cancel();
            }
            while (true) {
                wy.c<R> poll = this.f48709h.poll();
                if (poll == null) {
                    return;
                }
                poll.cancel();
            }
        }

        void i() {
            if (getAndIncrement() == 0) {
                do {
                    h();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // b80.b
        public void onComplete() {
            this.f48712k = true;
            a();
        }

        @Override // b80.b
        public void onError(Throwable th2) {
            if (this.f48707f.c(th2)) {
                this.f48712k = true;
                a();
            }
        }

        @Override // b80.c
        public void request(long j11) {
            if (xy.e.validate(j11)) {
                yy.c.a(this.f48708g, j11);
                a();
            }
        }
    }

    public c(hy.e<T> eVar, ky.h<? super T, ? extends b80.a<? extends R>> hVar, int i11, int i12, yy.f fVar) {
        super(eVar);
        this.f48698c = hVar;
        this.f48699d = i11;
        this.f48700e = i12;
        this.f48701f = fVar;
    }

    @Override // hy.e
    protected void z(b80.b<? super R> bVar) {
        this.f48697b.y(new a(bVar, this.f48698c, this.f48699d, this.f48700e, this.f48701f));
    }
}