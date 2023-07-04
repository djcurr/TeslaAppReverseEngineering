package sy;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class w<T, R> extends sy.a<T, R> {

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super T, ? extends hy.j<? extends R>> f50868b;

    /* renamed from: c  reason: collision with root package name */
    final int f50869c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f50870d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a<T, R> extends AtomicReference<iy.b> implements hy.k<R> {

        /* renamed from: a  reason: collision with root package name */
        final b<T, R> f50871a;

        /* renamed from: b  reason: collision with root package name */
        final long f50872b;

        /* renamed from: c  reason: collision with root package name */
        final int f50873c;

        /* renamed from: d  reason: collision with root package name */
        volatile ny.h<R> f50874d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f50875e;

        a(b<T, R> bVar, long j11, int i11) {
            this.f50871a = bVar;
            this.f50872b = j11;
            this.f50873c = i11;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.setOnce(this, bVar)) {
                if (bVar instanceof ny.c) {
                    ny.c cVar = (ny.c) bVar;
                    int requestFusion = cVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f50874d = cVar;
                        this.f50875e = true;
                        this.f50871a.g();
                        return;
                    } else if (requestFusion == 2) {
                        this.f50874d = cVar;
                        return;
                    }
                }
                this.f50874d = new uy.c(this.f50873c);
            }
        }

        @Override // hy.k
        public void b(R r11) {
            if (this.f50872b == this.f50871a.f50886j) {
                if (r11 != null) {
                    this.f50874d.offer(r11);
                }
                this.f50871a.g();
            }
        }

        public void c() {
            ly.a.dispose(this);
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50872b == this.f50871a.f50886j) {
                this.f50875e = true;
                this.f50871a.g();
            }
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            this.f50871a.h(this, th2);
        }
    }

    /* loaded from: classes5.dex */
    static final class b<T, R> extends AtomicInteger implements hy.k<T>, iy.b {

        /* renamed from: k  reason: collision with root package name */
        static final a<Object, Object> f50876k;

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super R> f50877a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super T, ? extends hy.j<? extends R>> f50878b;

        /* renamed from: c  reason: collision with root package name */
        final int f50879c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f50880d;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f50882f;

        /* renamed from: g  reason: collision with root package name */
        volatile boolean f50883g;

        /* renamed from: h  reason: collision with root package name */
        iy.b f50884h;

        /* renamed from: j  reason: collision with root package name */
        volatile long f50886j;

        /* renamed from: i  reason: collision with root package name */
        final AtomicReference<a<T, R>> f50885i = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        final yy.b f50881e = new yy.b();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f50876k = aVar;
            aVar.c();
        }

        b(hy.k<? super R> kVar, ky.h<? super T, ? extends hy.j<? extends R>> hVar, int i11, boolean z11) {
            this.f50877a = kVar;
            this.f50878b = hVar;
            this.f50879c = i11;
            this.f50880d = z11;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50884h, bVar)) {
                this.f50884h = bVar;
                this.f50877a.a(this);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            a<T, R> aVar;
            long j11 = this.f50886j + 1;
            this.f50886j = j11;
            a<T, R> aVar2 = this.f50885i.get();
            if (aVar2 != null) {
                aVar2.c();
            }
            try {
                hy.j<? extends R> apply = this.f50878b.apply(t11);
                Objects.requireNonNull(apply, "The ObservableSource returned is null");
                hy.j<? extends R> jVar = apply;
                a<T, R> aVar3 = new a<>(this, j11, this.f50879c);
                do {
                    aVar = this.f50885i.get();
                    if (aVar == f50876k) {
                        return;
                    }
                } while (!this.f50885i.compareAndSet(aVar, aVar3));
                jVar.c(aVar3);
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f50884h.dispose();
                onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void c() {
            a aVar = (a) this.f50885i.getAndSet(f50876k);
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // iy.b
        public void dispose() {
            if (this.f50883g) {
                return;
            }
            this.f50883g = true;
            this.f50884h.dispose();
            c();
            this.f50881e.d();
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x00b7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x000f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void g() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                hy.k<? super R> r0 = r13.f50877a
                java.util.concurrent.atomic.AtomicReference<sy.w$a<T, R>> r1 = r13.f50885i
                boolean r2 = r13.f50880d
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r13.f50883g
                if (r5 == 0) goto L14
                return
            L14:
                boolean r5 = r13.f50882f
                r6 = 0
                if (r5 == 0) goto L4e
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L21
                r5 = r3
                goto L22
            L21:
                r5 = r6
            L22:
                if (r2 == 0) goto L38
                if (r5 == 0) goto L4e
                yy.b r1 = r13.f50881e
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L34
                r0.onError(r1)
                goto L37
            L34:
                r0.onComplete()
            L37:
                return
            L38:
                yy.b r7 = r13.f50881e
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L48
                yy.b r1 = r13.f50881e
                r1.f(r0)
                return
            L48:
                if (r5 == 0) goto L4e
                r0.onComplete()
                return
            L4e:
                java.lang.Object r5 = r1.get()
                sy.w$a r5 = (sy.w.a) r5
                if (r5 == 0) goto Lb7
                ny.h<R> r7 = r5.f50874d
                if (r7 == 0) goto Lb7
                r8 = r6
            L5b:
                boolean r9 = r13.f50883g
                if (r9 == 0) goto L60
                return
            L60:
                java.lang.Object r9 = r1.get()
                if (r5 == r9) goto L68
            L66:
                r8 = r3
                goto Laf
            L68:
                if (r2 != 0) goto L7a
                yy.b r9 = r13.f50881e
                java.lang.Object r9 = r9.get()
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                if (r9 == 0) goto L7a
                yy.b r1 = r13.f50881e
                r1.f(r0)
                return
            L7a:
                boolean r9 = r5.f50875e
                r10 = 0
                java.lang.Object r11 = r7.poll()     // Catch: java.lang.Throwable -> L82
                goto La0
            L82:
                r8 = move-exception
                jy.a.b(r8)
                yy.b r11 = r13.f50881e
                r11.c(r8)
                r1.compareAndSet(r5, r10)
                if (r2 != 0) goto L9b
                r13.c()
                iy.b r8 = r13.f50884h
                r8.dispose()
                r13.f50882f = r3
                goto L9e
            L9b:
                r5.c()
            L9e:
                r8 = r3
                r11 = r10
            La0:
                if (r11 != 0) goto La4
                r12 = r3
                goto La5
            La4:
                r12 = r6
            La5:
                if (r9 == 0) goto Lad
                if (r12 == 0) goto Lad
                r1.compareAndSet(r5, r10)
                goto L66
            Lad:
                if (r12 == 0) goto Lb3
            Laf:
                if (r8 == 0) goto Lb7
                goto Lf
            Lb3:
                r0.b(r11)
                goto L5b
            Lb7:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sy.w.b.g():void");
        }

        void h(a<T, R> aVar, Throwable th2) {
            if (aVar.f50872b == this.f50886j && this.f50881e.b(th2)) {
                if (!this.f50880d) {
                    this.f50884h.dispose();
                    this.f50882f = true;
                }
                aVar.f50875e = true;
                g();
                return;
            }
            az.a.r(th2);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50883g;
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50882f) {
                return;
            }
            this.f50882f = true;
            g();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (!this.f50882f && this.f50881e.b(th2)) {
                if (!this.f50880d) {
                    c();
                }
                this.f50882f = true;
                g();
                return;
            }
            az.a.r(th2);
        }
    }

    public w(hy.j<T> jVar, ky.h<? super T, ? extends hy.j<? extends R>> hVar, int i11, boolean z11) {
        super(jVar);
        this.f50868b = hVar;
        this.f50869c = i11;
        this.f50870d = z11;
    }

    @Override // hy.i
    public void L(hy.k<? super R> kVar) {
        if (r.b(this.f50705a, kVar, this.f50868b)) {
            return;
        }
        this.f50705a.c(new b(kVar, this.f50868b, this.f50869c, this.f50870d));
    }
}