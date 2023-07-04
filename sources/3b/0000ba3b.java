package vp;

import com.jakewharton.rxrelay3.BehaviorRelay;
import hy.k;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import vp.a;

/* loaded from: classes2.dex */
public final class b<T> extends c<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f54585f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    static final a[] f54586g = new a[0];

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<T> f54587a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<BehaviorRelay.BehaviorDisposable<T>[]> f54588b;

    /* renamed from: c  reason: collision with root package name */
    final Lock f54589c;

    /* renamed from: d  reason: collision with root package name */
    final Lock f54590d;

    /* renamed from: e  reason: collision with root package name */
    long f54591e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a<T> implements iy.b, a.InterfaceC1229a<T> {

        /* renamed from: a  reason: collision with root package name */
        final k<? super T> f54592a;

        /* renamed from: b  reason: collision with root package name */
        final b<T> f54593b;

        /* renamed from: c  reason: collision with root package name */
        boolean f54594c;

        /* renamed from: d  reason: collision with root package name */
        boolean f54595d;

        /* renamed from: e  reason: collision with root package name */
        vp.a<T> f54596e;

        /* renamed from: f  reason: collision with root package name */
        boolean f54597f;

        /* renamed from: g  reason: collision with root package name */
        volatile boolean f54598g;

        /* renamed from: h  reason: collision with root package name */
        long f54599h;

        a(k<? super T> kVar, b<T> bVar) {
            this.f54592a = kVar;
            this.f54593b = bVar;
        }

        void a() {
            if (this.f54598g) {
                return;
            }
            synchronized (this) {
                if (this.f54598g) {
                    return;
                }
                if (this.f54594c) {
                    return;
                }
                b<T> bVar = this.f54593b;
                Lock lock = bVar.f54589c;
                lock.lock();
                this.f54599h = bVar.f54591e;
                T t11 = bVar.f54587a.get();
                lock.unlock();
                this.f54595d = t11 != null;
                this.f54594c = true;
                if (t11 != null) {
                    test(t11);
                    b();
                }
            }
        }

        void b() {
            vp.a<T> aVar;
            while (!this.f54598g) {
                synchronized (this) {
                    aVar = this.f54596e;
                    if (aVar == null) {
                        this.f54595d = false;
                        return;
                    }
                    this.f54596e = null;
                }
                aVar.b(this);
            }
        }

        void c(T t11, long j11) {
            if (this.f54598g) {
                return;
            }
            if (!this.f54597f) {
                synchronized (this) {
                    if (this.f54598g) {
                        return;
                    }
                    if (this.f54599h == j11) {
                        return;
                    }
                    if (this.f54595d) {
                        vp.a<T> aVar = this.f54596e;
                        if (aVar == null) {
                            aVar = new vp.a<>(4);
                            this.f54596e = aVar;
                        }
                        aVar.a(t11);
                        return;
                    }
                    this.f54594c = true;
                    this.f54597f = true;
                }
            }
            test(t11);
        }

        @Override // iy.b
        public void dispose() {
            if (this.f54598g) {
                return;
            }
            this.f54598g = true;
            this.f54593b.T(this);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f54598g;
        }

        @Override // vp.a.InterfaceC1229a, ky.i
        public boolean test(T t11) {
            if (this.f54598g) {
                return false;
            }
            this.f54592a.b(t11);
            return false;
        }
    }

    b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f54589c = reentrantReadWriteLock.readLock();
        this.f54590d = reentrantReadWriteLock.writeLock();
        this.f54588b = new AtomicReference<>(f54586g);
        this.f54587a = new AtomicReference<>();
    }

    public static <T> b<T> S() {
        return new b<>();
    }

    @Override // hy.i
    protected void L(k<? super T> kVar) {
        a<T> aVar = new a<>(kVar, this);
        kVar.a(aVar);
        R(aVar);
        if (aVar.f54598g) {
            T(aVar);
        } else {
            aVar.a();
        }
    }

    void R(a<T> aVar) {
        BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr;
        BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = (a[]) this.f54588b.get();
            int length = behaviorDisposableArr.length;
            behaviorDisposableArr2 = new a[length + 1];
            System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = aVar;
        } while (!this.f54588b.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
    }

    void T(a<T> aVar) {
        BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr;
        BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = (a[]) this.f54588b.get();
            int length = behaviorDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i11 = -1;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (behaviorDisposableArr[i12] == aVar) {
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
                behaviorDisposableArr2 = f54586g;
            } else {
                BehaviorRelay.BehaviorDisposable<T>[] behaviorDisposableArr3 = new a[length - 1];
                System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i11);
                System.arraycopy(behaviorDisposableArr, i11 + 1, behaviorDisposableArr3, i11, (length - i11) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!this.f54588b.compareAndSet(behaviorDisposableArr, behaviorDisposableArr2));
    }

    void U(T t11) {
        this.f54590d.lock();
        this.f54591e++;
        this.f54587a.lazySet(t11);
        this.f54590d.unlock();
    }

    @Override // ky.f
    public void accept(T t11) {
        Objects.requireNonNull(t11, "value == null");
        U(t11);
        for (a aVar : this.f54588b.get()) {
            aVar.c(t11, this.f54591e);
        }
    }
}