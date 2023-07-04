package qy;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class l<T> extends b<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final int f48768c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f48769d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f48770e;

    /* renamed from: f  reason: collision with root package name */
    final ky.a f48771f;

    /* loaded from: classes5.dex */
    static final class a<T> extends xy.a<T> implements hy.f<T> {

        /* renamed from: a  reason: collision with root package name */
        final b80.b<? super T> f48772a;

        /* renamed from: b  reason: collision with root package name */
        final ny.g<T> f48773b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f48774c;

        /* renamed from: d  reason: collision with root package name */
        final ky.a f48775d;

        /* renamed from: e  reason: collision with root package name */
        b80.c f48776e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f48777f;

        /* renamed from: g  reason: collision with root package name */
        volatile boolean f48778g;

        /* renamed from: h  reason: collision with root package name */
        Throwable f48779h;

        /* renamed from: i  reason: collision with root package name */
        final AtomicLong f48780i = new AtomicLong();

        /* renamed from: j  reason: collision with root package name */
        boolean f48781j;

        a(b80.b<? super T> bVar, int i11, boolean z11, boolean z12, ky.a aVar) {
            ny.g<T> bVar2;
            this.f48772a = bVar;
            this.f48775d = aVar;
            this.f48774c = z12;
            if (z11) {
                bVar2 = new uy.c<>(i11);
            } else {
                bVar2 = new uy.b<>(i11);
            }
            this.f48773b = bVar2;
        }

        @Override // b80.b
        public void b(T t11) {
            if (!this.f48773b.offer(t11)) {
                this.f48776e.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f48775d.run();
                } catch (Throwable th2) {
                    jy.a.b(th2);
                    missingBackpressureException.initCause(th2);
                }
                onError(missingBackpressureException);
            } else if (this.f48781j) {
                this.f48772a.b(null);
            } else {
                e();
            }
        }

        @Override // hy.f, b80.b
        public void c(b80.c cVar) {
            if (xy.e.validate(this.f48776e, cVar)) {
                this.f48776e = cVar;
                this.f48772a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // b80.c
        public void cancel() {
            if (this.f48777f) {
                return;
            }
            this.f48777f = true;
            this.f48776e.cancel();
            if (this.f48781j || getAndIncrement() != 0) {
                return;
            }
            this.f48773b.clear();
        }

        @Override // ny.h
        public void clear() {
            this.f48773b.clear();
        }

        boolean d(boolean z11, boolean z12, b80.b<? super T> bVar) {
            if (this.f48777f) {
                this.f48773b.clear();
                return true;
            } else if (z11) {
                if (this.f48774c) {
                    if (z12) {
                        Throwable th2 = this.f48779h;
                        if (th2 != null) {
                            bVar.onError(th2);
                        } else {
                            bVar.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th3 = this.f48779h;
                if (th3 != null) {
                    this.f48773b.clear();
                    bVar.onError(th3);
                    return true;
                } else if (z12) {
                    bVar.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        void e() {
            int i11;
            if (getAndIncrement() == 0) {
                ny.g<T> gVar = this.f48773b;
                b80.b<? super T> bVar = this.f48772a;
                int i12 = 1;
                while (!d(this.f48778g, gVar.isEmpty(), bVar)) {
                    long j11 = this.f48780i.get();
                    long j12 = 0;
                    while (true) {
                        i11 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
                        if (i11 == 0) {
                            break;
                        }
                        boolean z11 = this.f48778g;
                        Object obj = (T) gVar.poll();
                        boolean z12 = obj == null;
                        if (d(z11, z12, bVar)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        bVar.b(obj);
                        j12++;
                    }
                    if (i11 == 0 && d(this.f48778g, gVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j12 != 0 && j11 != Long.MAX_VALUE) {
                        this.f48780i.addAndGet(-j12);
                    }
                    i12 = addAndGet(-i12);
                    if (i12 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // ny.h
        public boolean isEmpty() {
            return this.f48773b.isEmpty();
        }

        @Override // b80.b
        public void onComplete() {
            this.f48778g = true;
            if (this.f48781j) {
                this.f48772a.onComplete();
            } else {
                e();
            }
        }

        @Override // b80.b
        public void onError(Throwable th2) {
            this.f48779h = th2;
            this.f48778g = true;
            if (this.f48781j) {
                this.f48772a.onError(th2);
            } else {
                e();
            }
        }

        @Override // ny.h
        public T poll() {
            return this.f48773b.poll();
        }

        @Override // b80.c
        public void request(long j11) {
            if (this.f48781j || !xy.e.validate(j11)) {
                return;
            }
            yy.c.a(this.f48780i, j11);
            e();
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            if ((i11 & 2) != 0) {
                this.f48781j = true;
                return 2;
            }
            return 0;
        }
    }

    public l(hy.e<T> eVar, int i11, boolean z11, boolean z12, ky.a aVar) {
        super(eVar);
        this.f48768c = i11;
        this.f48769d = z11;
        this.f48770e = z12;
        this.f48771f = aVar;
    }

    @Override // hy.e
    protected void z(b80.b<? super T> bVar) {
        this.f48697b.y(new a(bVar, this.f48768c, this.f48769d, this.f48770e, this.f48771f));
    }
}