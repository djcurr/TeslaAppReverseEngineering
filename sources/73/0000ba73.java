package vy;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public final class m extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, iy.b {

    /* renamed from: b  reason: collision with root package name */
    static final Object f54723b = new Object();

    /* renamed from: c  reason: collision with root package name */
    static final Object f54724c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final Object f54725d = new Object();

    /* renamed from: e  reason: collision with root package name */
    static final Object f54726e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Runnable f54727a;

    public m(Runnable runnable, iy.c cVar) {
        super(3);
        this.f54727a = runnable;
        lazySet(0, cVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f54726e) {
                return;
            }
            if (obj == f54724c) {
                future.cancel(false);
                return;
            } else if (obj == f54725d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // iy.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f54726e || obj5 == (obj3 = f54724c) || obj5 == (obj4 = f54725d)) {
                break;
            }
            boolean z11 = get(2) != Thread.currentThread();
            if (z11) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z11);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f54726e || obj == (obj2 = f54723b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((iy.c) obj).a(this);
    }

    @Override // iy.b
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f54723b || obj == f54726e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f54727a.run();
            Object obj3 = get(0);
            if (obj3 != f54723b && compareAndSet(0, obj3, f54726e) && obj3 != null) {
                ((iy.c) obj3).a(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f54724c || obj2 == f54725d) {
                    break;
                }
            } while (!compareAndSet(1, obj2, f54726e));
            lazySet(2, null);
        } catch (Throwable th2) {
            try {
                az.a.r(th2);
                throw th2;
            } catch (Throwable th3) {
                Object obj4 = get(0);
                if (obj4 != f54723b && compareAndSet(0, obj4, f54726e) && obj4 != null) {
                    ((iy.c) obj4).a(this);
                }
                do {
                    obj = get(1);
                    if (obj == f54724c || obj == f54725d) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f54726e));
                lazySet(2, null);
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public String toString() {
        String str;
        Object obj = get(1);
        if (obj == f54726e) {
            str = "Finished";
        } else if (obj == f54724c) {
            str = "Disposed(Sync)";
        } else if (obj == f54725d) {
            str = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                str = "Waiting";
            } else {
                str = "Running on " + obj2;
            }
        }
        return m.class.getSimpleName() + "[" + str + "]";
    }
}