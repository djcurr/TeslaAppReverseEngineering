package qy;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* loaded from: classes5.dex */
public final class e<T> extends qy.b<T, T> {

    /* renamed from: c  reason: collision with root package name */
    final ky.f<? super T> f48729c;

    /* renamed from: d  reason: collision with root package name */
    final ky.f<? super Throwable> f48730d;

    /* renamed from: e  reason: collision with root package name */
    final ky.a f48731e;

    /* renamed from: f  reason: collision with root package name */
    final ky.a f48732f;

    /* loaded from: classes5.dex */
    static final class a<T> extends wy.a<T, T> {

        /* renamed from: f  reason: collision with root package name */
        final ky.f<? super T> f48733f;

        /* renamed from: g  reason: collision with root package name */
        final ky.f<? super Throwable> f48734g;

        /* renamed from: h  reason: collision with root package name */
        final ky.a f48735h;

        /* renamed from: i  reason: collision with root package name */
        final ky.a f48736i;

        a(ny.a<? super T> aVar, ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar2, ky.a aVar3) {
            super(aVar);
            this.f48733f = fVar;
            this.f48734g = fVar2;
            this.f48735h = aVar2;
            this.f48736i = aVar3;
        }

        @Override // b80.b
        public void b(T t11) {
            if (this.f56440d) {
                return;
            }
            if (this.f56441e != 0) {
                this.f56437a.b(null);
                return;
            }
            try {
                this.f48733f.accept(t11);
                this.f56437a.b(t11);
            } catch (Throwable th2) {
                e(th2);
            }
        }

        @Override // ny.a
        public boolean g(T t11) {
            if (this.f56440d) {
                return false;
            }
            try {
                this.f48733f.accept(t11);
                return this.f56437a.g(t11);
            } catch (Throwable th2) {
                e(th2);
                return false;
            }
        }

        @Override // b80.b
        public void onComplete() {
            if (this.f56440d) {
                return;
            }
            try {
                this.f48735h.run();
                this.f56440d = true;
                this.f56437a.onComplete();
                try {
                    this.f48736i.run();
                } catch (Throwable th2) {
                    jy.a.b(th2);
                    az.a.r(th2);
                }
            } catch (Throwable th3) {
                e(th3);
            }
        }

        @Override // wy.a, b80.b
        public void onError(Throwable th2) {
            if (this.f56440d) {
                az.a.r(th2);
                return;
            }
            boolean z11 = true;
            this.f56440d = true;
            try {
                this.f48734g.accept(th2);
            } catch (Throwable th3) {
                jy.a.b(th3);
                this.f56437a.onError(new CompositeException(th2, th3));
                z11 = false;
            }
            if (z11) {
                this.f56437a.onError(th2);
            }
            try {
                this.f48736i.run();
            } catch (Throwable th4) {
                jy.a.b(th4);
                az.a.r(th4);
            }
        }

        @Override // ny.h
        public T poll() {
            try {
                T poll = this.f56439c.poll();
                if (poll != null) {
                    try {
                        this.f48733f.accept(poll);
                    } catch (Throwable th2) {
                        try {
                            jy.a.b(th2);
                            this.f48734g.accept(th2);
                            throw yy.g.f(th2);
                        } finally {
                            this.f48736i.run();
                        }
                    }
                } else if (this.f56441e == 1) {
                    this.f48735h.run();
                }
                return poll;
            } catch (Throwable th3) {
                jy.a.b(th3);
                try {
                    this.f48734g.accept(th3);
                    throw yy.g.f(th3);
                } catch (Throwable th4) {
                    jy.a.b(th4);
                    throw new CompositeException(th3, th4);
                }
            }
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            return f(i11);
        }
    }

    /* loaded from: classes5.dex */
    static final class b<T> extends wy.b<T, T> {

        /* renamed from: f  reason: collision with root package name */
        final ky.f<? super T> f48737f;

        /* renamed from: g  reason: collision with root package name */
        final ky.f<? super Throwable> f48738g;

        /* renamed from: h  reason: collision with root package name */
        final ky.a f48739h;

        /* renamed from: i  reason: collision with root package name */
        final ky.a f48740i;

        b(b80.b<? super T> bVar, ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar, ky.a aVar2) {
            super(bVar);
            this.f48737f = fVar;
            this.f48738g = fVar2;
            this.f48739h = aVar;
            this.f48740i = aVar2;
        }

        @Override // b80.b
        public void b(T t11) {
            if (this.f56445d) {
                return;
            }
            if (this.f56446e != 0) {
                this.f56442a.b(null);
                return;
            }
            try {
                this.f48737f.accept(t11);
                this.f56442a.b(t11);
            } catch (Throwable th2) {
                e(th2);
            }
        }

        @Override // b80.b
        public void onComplete() {
            if (this.f56445d) {
                return;
            }
            try {
                this.f48739h.run();
                this.f56445d = true;
                this.f56442a.onComplete();
                try {
                    this.f48740i.run();
                } catch (Throwable th2) {
                    jy.a.b(th2);
                    az.a.r(th2);
                }
            } catch (Throwable th3) {
                e(th3);
            }
        }

        @Override // wy.b, b80.b
        public void onError(Throwable th2) {
            if (this.f56445d) {
                az.a.r(th2);
                return;
            }
            boolean z11 = true;
            this.f56445d = true;
            try {
                this.f48738g.accept(th2);
            } catch (Throwable th3) {
                jy.a.b(th3);
                this.f56442a.onError(new CompositeException(th2, th3));
                z11 = false;
            }
            if (z11) {
                this.f56442a.onError(th2);
            }
            try {
                this.f48740i.run();
            } catch (Throwable th4) {
                jy.a.b(th4);
                az.a.r(th4);
            }
        }

        @Override // ny.h
        public T poll() {
            try {
                T poll = this.f56444c.poll();
                if (poll != null) {
                    try {
                        this.f48737f.accept(poll);
                    } catch (Throwable th2) {
                        try {
                            jy.a.b(th2);
                            this.f48738g.accept(th2);
                            throw yy.g.f(th2);
                        } finally {
                            this.f48740i.run();
                        }
                    }
                } else if (this.f56446e == 1) {
                    this.f48739h.run();
                }
                return poll;
            } catch (Throwable th3) {
                jy.a.b(th3);
                try {
                    this.f48738g.accept(th3);
                    throw yy.g.f(th3);
                } catch (Throwable th4) {
                    jy.a.b(th4);
                    throw new CompositeException(th3, th4);
                }
            }
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            return f(i11);
        }
    }

    public e(hy.e<T> eVar, ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar, ky.a aVar2) {
        super(eVar);
        this.f48729c = fVar;
        this.f48730d = fVar2;
        this.f48731e = aVar;
        this.f48732f = aVar2;
    }

    @Override // hy.e
    protected void z(b80.b<? super T> bVar) {
        if (bVar instanceof ny.a) {
            this.f48697b.y(new a((ny.a) bVar, this.f48729c, this.f48730d, this.f48731e, this.f48732f));
        } else {
            this.f48697b.y(new b(bVar, this.f48729c, this.f48730d, this.f48731e, this.f48732f));
        }
    }
}