package cz;

import hy.k;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import yy.a;
import yy.g;
import yy.i;

/* loaded from: classes5.dex */
public final class a<T> extends e<T> {

    /* renamed from: h  reason: collision with root package name */
    static final C0443a[] f23166h = new C0443a[0];

    /* renamed from: i  reason: collision with root package name */
    static final C0443a[] f23167i = new C0443a[0];

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<Object> f23168a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<BehaviorSubject.BehaviorDisposable<T>[]> f23169b;

    /* renamed from: c  reason: collision with root package name */
    final ReadWriteLock f23170c;

    /* renamed from: d  reason: collision with root package name */
    final Lock f23171d;

    /* renamed from: e  reason: collision with root package name */
    final Lock f23172e;

    /* renamed from: f  reason: collision with root package name */
    final AtomicReference<Throwable> f23173f;

    /* renamed from: g  reason: collision with root package name */
    long f23174g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cz.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0443a<T> implements iy.b, a.InterfaceC1369a<Object> {

        /* renamed from: a  reason: collision with root package name */
        final k<? super T> f23175a;

        /* renamed from: b  reason: collision with root package name */
        final a<T> f23176b;

        /* renamed from: c  reason: collision with root package name */
        boolean f23177c;

        /* renamed from: d  reason: collision with root package name */
        boolean f23178d;

        /* renamed from: e  reason: collision with root package name */
        yy.a<Object> f23179e;

        /* renamed from: f  reason: collision with root package name */
        boolean f23180f;

        /* renamed from: g  reason: collision with root package name */
        volatile boolean f23181g;

        /* renamed from: h  reason: collision with root package name */
        long f23182h;

        C0443a(k<? super T> kVar, a<T> aVar) {
            this.f23175a = kVar;
            this.f23176b = aVar;
        }

        void a() {
            if (this.f23181g) {
                return;
            }
            synchronized (this) {
                if (this.f23181g) {
                    return;
                }
                if (this.f23177c) {
                    return;
                }
                a<T> aVar = this.f23176b;
                Lock lock = aVar.f23171d;
                lock.lock();
                this.f23182h = aVar.f23174g;
                Object obj = aVar.f23168a.get();
                lock.unlock();
                this.f23178d = obj != null;
                this.f23177c = true;
                if (obj == null || test(obj)) {
                    return;
                }
                b();
            }
        }

        void b() {
            yy.a<Object> aVar;
            while (!this.f23181g) {
                synchronized (this) {
                    aVar = this.f23179e;
                    if (aVar == null) {
                        this.f23178d = false;
                        return;
                    }
                    this.f23179e = null;
                }
                aVar.d(this);
            }
        }

        void c(Object obj, long j11) {
            if (this.f23181g) {
                return;
            }
            if (!this.f23180f) {
                synchronized (this) {
                    if (this.f23181g) {
                        return;
                    }
                    if (this.f23182h == j11) {
                        return;
                    }
                    if (this.f23178d) {
                        yy.a<Object> aVar = this.f23179e;
                        if (aVar == null) {
                            aVar = new yy.a<>(4);
                            this.f23179e = aVar;
                        }
                        aVar.c(obj);
                        return;
                    }
                    this.f23177c = true;
                    this.f23180f = true;
                }
            }
            test(obj);
        }

        @Override // iy.b
        public void dispose() {
            if (this.f23181g) {
                return;
            }
            this.f23181g = true;
            this.f23176b.X(this);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f23181g;
        }

        @Override // yy.a.InterfaceC1369a, ky.i
        public boolean test(Object obj) {
            return this.f23181g || i.accept(obj, this.f23175a);
        }
    }

    a(T t11) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f23170c = reentrantReadWriteLock;
        this.f23171d = reentrantReadWriteLock.readLock();
        this.f23172e = reentrantReadWriteLock.writeLock();
        this.f23169b = new AtomicReference<>(f23166h);
        this.f23168a = new AtomicReference<>(t11);
        this.f23173f = new AtomicReference<>();
    }

    public static <T> a<T> W() {
        return new a<>(null);
    }

    @Override // hy.i
    protected void L(k<? super T> kVar) {
        C0443a<T> c0443a = new C0443a<>(kVar, this);
        kVar.a(c0443a);
        if (V(c0443a)) {
            if (c0443a.f23181g) {
                X(c0443a);
                return;
            } else {
                c0443a.a();
                return;
            }
        }
        Throwable th2 = this.f23173f.get();
        if (th2 == g.f59922a) {
            kVar.onComplete();
        } else {
            kVar.onError(th2);
        }
    }

    @Override // cz.e
    public boolean R() {
        return i.isComplete(this.f23168a.get());
    }

    @Override // cz.e
    public boolean S() {
        return this.f23169b.get().length != 0;
    }

    @Override // cz.e
    public boolean T() {
        return i.isError(this.f23168a.get());
    }

    boolean V(C0443a<T> c0443a) {
        BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr;
        BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = (C0443a[]) this.f23169b.get();
            if (behaviorDisposableArr == f23167i) {
                return false;
            }
            int length = behaviorDisposableArr.length;
            behaviorDisposableArr2 = new C0443a[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = c0443a;
        } while (!this.f23169b.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
        return true;
    }

    void X(C0443a<T> c0443a) {
        BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr;
        BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = (C0443a[]) this.f23169b.get();
            int length = behaviorDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i11 = -1;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (behaviorDisposableArr[i12] == c0443a) {
                    i11 = i12;
                    break;
                } else {
                    i12++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr2 = f23166h;
            } else {
                BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr3 = new C0443a[length - 1];
                System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i11);
                System.arraycopy(behaviorDisposableArr, i11 + 1, behaviorDisposableArr3, i11, (length - i11) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!this.f23169b.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
    }

    void Y(Object obj) {
        this.f23172e.lock();
        this.f23174g++;
        this.f23168a.lazySet(obj);
        this.f23172e.unlock();
    }

    BehaviorSubject.BehaviorDisposable<T>[] Z(Object obj) {
        Y(obj);
        return this.f23169b.getAndSet(f23167i);
    }

    @Override // hy.k
    public void a(iy.b bVar) {
        if (this.f23173f.get() != null) {
            bVar.dispose();
        }
    }

    @Override // hy.k
    public void b(T t11) {
        g.c(t11, "onNext called with a null value.");
        if (this.f23173f.get() != null) {
            return;
        }
        Object next = i.next(t11);
        Y(next);
        for (C0443a c0443a : this.f23169b.get()) {
            c0443a.c(next, this.f23174g);
        }
    }

    @Override // hy.k
    public void onComplete() {
        if (this.f23173f.compareAndSet(null, g.f59922a)) {
            Object complete = i.complete();
            for (C0443a c0443a : Z(complete)) {
                c0443a.c(complete, this.f23174g);
            }
        }
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        if (!this.f23173f.compareAndSet(null, th2)) {
            az.a.r(th2);
            return;
        }
        Object error = i.error(th2);
        for (C0443a c0443a : Z(error)) {
            c0443a.c(error, this.f23174g);
        }
    }
}