package qy;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class g<T> extends hy.e<T> {

    /* renamed from: b  reason: collision with root package name */
    final Iterable<? extends T> f48742b;

    /* loaded from: classes5.dex */
    static abstract class a<T> extends xy.b<T> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<? extends T> f48743a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f48744b;

        /* renamed from: c  reason: collision with root package name */
        boolean f48745c;

        a(Iterator<? extends T> it2) {
            this.f48743a = it2;
        }

        abstract void a();

        abstract void b(long j11);

        @Override // b80.c
        public final void cancel() {
            this.f48744b = true;
        }

        @Override // ny.h
        public final void clear() {
            this.f48743a = null;
        }

        @Override // ny.h
        public final boolean isEmpty() {
            Iterator<? extends T> it2 = this.f48743a;
            if (it2 != null) {
                if (!this.f48745c || it2.hasNext()) {
                    return false;
                }
                clear();
                return true;
            }
            return true;
        }

        @Override // ny.h
        public final T poll() {
            Iterator<? extends T> it2 = this.f48743a;
            if (it2 == null) {
                return null;
            }
            if (!this.f48745c) {
                this.f48745c = true;
            } else if (!it2.hasNext()) {
                return null;
            }
            T next = this.f48743a.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // b80.c
        public final void request(long j11) {
            if (xy.e.validate(j11) && yy.c.a(this, j11) == 0) {
                if (j11 == Long.MAX_VALUE) {
                    a();
                } else {
                    b(j11);
                }
            }
        }

        @Override // ny.d
        public final int requestFusion(int i11) {
            return i11 & 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b<T> extends a<T> {

        /* renamed from: d  reason: collision with root package name */
        final ny.a<? super T> f48746d;

        b(ny.a<? super T> aVar, Iterator<? extends T> it2) {
            super(it2);
            this.f48746d = aVar;
        }

        @Override // qy.g.a
        void a() {
            Iterator<? extends T> it2 = this.f48743a;
            ny.a<? super T> aVar = this.f48746d;
            while (!this.f48744b) {
                try {
                    Object obj = (T) it2.next();
                    if (this.f48744b) {
                        return;
                    }
                    if (obj == null) {
                        aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.g(obj);
                    if (this.f48744b) {
                        return;
                    }
                    try {
                        if (!it2.hasNext()) {
                            if (this.f48744b) {
                                return;
                            }
                            aVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        jy.a.b(th2);
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    jy.a.b(th3);
                    aVar.onError(th3);
                    return;
                }
            }
        }

        @Override // qy.g.a
        void b(long j11) {
            Iterator<? extends T> it2 = this.f48743a;
            ny.a<? super T> aVar = this.f48746d;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 != j11) {
                        if (this.f48744b) {
                            return;
                        }
                        try {
                            Object obj = (T) it2.next();
                            if (this.f48744b) {
                                return;
                            }
                            if (obj == null) {
                                aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean g11 = aVar.g(obj);
                            if (this.f48744b) {
                                return;
                            }
                            try {
                                if (!it2.hasNext()) {
                                    if (this.f48744b) {
                                        return;
                                    }
                                    aVar.onComplete();
                                    return;
                                } else if (g11) {
                                    j12++;
                                }
                            } catch (Throwable th2) {
                                jy.a.b(th2);
                                aVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            jy.a.b(th3);
                            aVar.onError(th3);
                            return;
                        }
                    } else {
                        j11 = get();
                        if (j12 == j11) {
                            j11 = addAndGet(-j12);
                        }
                    }
                }
            } while (j11 != 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c<T> extends a<T> {

        /* renamed from: d  reason: collision with root package name */
        final b80.b<? super T> f48747d;

        c(b80.b<? super T> bVar, Iterator<? extends T> it2) {
            super(it2);
            this.f48747d = bVar;
        }

        @Override // qy.g.a
        void a() {
            Iterator<? extends T> it2 = this.f48743a;
            b80.b<? super T> bVar = this.f48747d;
            while (!this.f48744b) {
                try {
                    Object obj = (T) it2.next();
                    if (this.f48744b) {
                        return;
                    }
                    if (obj == null) {
                        bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bVar.b(obj);
                    if (this.f48744b) {
                        return;
                    }
                    try {
                        if (!it2.hasNext()) {
                            if (this.f48744b) {
                                return;
                            }
                            bVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        jy.a.b(th2);
                        bVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    jy.a.b(th3);
                    bVar.onError(th3);
                    return;
                }
            }
        }

        @Override // qy.g.a
        void b(long j11) {
            Iterator<? extends T> it2 = this.f48743a;
            b80.b<? super T> bVar = this.f48747d;
            do {
                long j12 = 0;
                while (true) {
                    if (j12 != j11) {
                        if (this.f48744b) {
                            return;
                        }
                        try {
                            Object obj = (T) it2.next();
                            if (this.f48744b) {
                                return;
                            }
                            if (obj == null) {
                                bVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            bVar.b(obj);
                            if (this.f48744b) {
                                return;
                            }
                            try {
                                if (!it2.hasNext()) {
                                    if (this.f48744b) {
                                        return;
                                    }
                                    bVar.onComplete();
                                    return;
                                }
                                j12++;
                            } catch (Throwable th2) {
                                jy.a.b(th2);
                                bVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            jy.a.b(th3);
                            bVar.onError(th3);
                            return;
                        }
                    } else {
                        j11 = get();
                        if (j12 == j11) {
                            j11 = addAndGet(-j12);
                        }
                    }
                }
            } while (j11 != 0);
        }
    }

    public g(Iterable<? extends T> iterable) {
        this.f48742b = iterable;
    }

    public static <T> void C(b80.b<? super T> bVar, Iterator<? extends T> it2) {
        try {
            if (!it2.hasNext()) {
                xy.d.complete(bVar);
            } else if (bVar instanceof ny.a) {
                bVar.c(new b((ny.a) bVar, it2));
            } else {
                bVar.c(new c(bVar, it2));
            }
        } catch (Throwable th2) {
            jy.a.b(th2);
            xy.d.error(th2, bVar);
        }
    }

    @Override // hy.e
    public void z(b80.b<? super T> bVar) {
        try {
            C(bVar, this.f48742b.iterator());
        } catch (Throwable th2) {
            jy.a.b(th2);
            xy.d.error(th2, bVar);
        }
    }
}