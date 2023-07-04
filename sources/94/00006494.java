package cz;

import hy.k;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import yy.g;
import yy.i;

/* loaded from: classes5.dex */
public final class c<T> extends e<T> {

    /* renamed from: d  reason: collision with root package name */
    static final b[] f23189d = new b[0];

    /* renamed from: e  reason: collision with root package name */
    static final b[] f23190e = new b[0];

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f23191f = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    final a<T> f23192a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<ReplaySubject.ReplayDisposable<T>[]> f23193b = new AtomicReference<>(f23189d);

    /* renamed from: c  reason: collision with root package name */
    boolean f23194c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface a<T> {
        void a(Object obj);

        void add(T t11);

        void b(b<T> bVar);

        boolean compareAndSet(Object obj, Object obj2);

        Object get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b<T> extends AtomicInteger implements iy.b {

        /* renamed from: a  reason: collision with root package name */
        final k<? super T> f23195a;

        /* renamed from: b  reason: collision with root package name */
        final c<T> f23196b;

        /* renamed from: c  reason: collision with root package name */
        Object f23197c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f23198d;

        b(k<? super T> kVar, c<T> cVar) {
            this.f23195a = kVar;
            this.f23196b = cVar;
        }

        @Override // iy.b
        public void dispose() {
            if (this.f23198d) {
                return;
            }
            this.f23198d = true;
            this.f23196b.X(this);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f23198d;
        }
    }

    /* renamed from: cz.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0444c<T> extends AtomicReference<Object> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        final List<Object> f23199a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f23200b;

        /* renamed from: c  reason: collision with root package name */
        volatile int f23201c;

        C0444c(int i11) {
            this.f23199a = new ArrayList(i11);
        }

        @Override // cz.c.a
        public void a(Object obj) {
            this.f23199a.add(obj);
            c();
            this.f23201c++;
            this.f23200b = true;
        }

        @Override // cz.c.a
        public void add(T t11) {
            this.f23199a.add(t11);
            this.f23201c++;
        }

        @Override // cz.c.a
        public void b(b<T> bVar) {
            int i11;
            if (bVar.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f23199a;
            k<? super T> kVar = bVar.f23195a;
            Integer num = (Integer) bVar.f23197c;
            int i12 = 0;
            if (num != null) {
                i12 = num.intValue();
            } else {
                bVar.f23197c = 0;
            }
            int i13 = 1;
            while (!bVar.f23198d) {
                int i14 = this.f23201c;
                while (i14 != i12) {
                    if (bVar.f23198d) {
                        bVar.f23197c = null;
                        return;
                    }
                    Object obj = list.get(i12);
                    if (this.f23200b && (i11 = i12 + 1) == i14 && i11 == (i14 = this.f23201c)) {
                        if (i.isComplete(obj)) {
                            kVar.onComplete();
                        } else {
                            kVar.onError(i.getError(obj));
                        }
                        bVar.f23197c = null;
                        bVar.f23198d = true;
                        return;
                    }
                    kVar.b(obj);
                    i12++;
                }
                if (i12 == this.f23201c) {
                    bVar.f23197c = Integer.valueOf(i12);
                    i13 = bVar.addAndGet(-i13);
                    if (i13 == 0) {
                        return;
                    }
                }
            }
            bVar.f23197c = null;
        }

        public void c() {
        }
    }

    c(a<T> aVar) {
        this.f23192a = aVar;
    }

    public static <T> c<T> W() {
        return new c<>(new C0444c(16));
    }

    @Override // hy.i
    protected void L(k<? super T> kVar) {
        b<T> bVar = new b<>(kVar, this);
        kVar.a(bVar);
        if (V(bVar) && bVar.f23198d) {
            X(bVar);
        } else {
            this.f23192a.b(bVar);
        }
    }

    @Override // cz.e
    public boolean R() {
        return i.isComplete(this.f23192a.get());
    }

    @Override // cz.e
    public boolean S() {
        return this.f23193b.get().length != 0;
    }

    @Override // cz.e
    public boolean T() {
        return i.isError(this.f23192a.get());
    }

    boolean V(b<T> bVar) {
        ReplaySubject.ReplayDisposable<T>[] replayDisposableArr;
        ReplaySubject.ReplayDisposable<T>[] replayDisposableArr2;
        do {
            replayDisposableArr = (b[]) this.f23193b.get();
            if (replayDisposableArr == f23190e) {
                return false;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new b[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = bVar;
        } while (!this.f23193b.compareAndSet(replayDisposableArr, replayDisposableArr2));
        return true;
    }

    void X(b<T> bVar) {
        ReplaySubject.ReplayDisposable<T>[] replayDisposableArr;
        ReplaySubject.ReplayDisposable<T>[] replayDisposableArr2;
        do {
            replayDisposableArr = (b[]) this.f23193b.get();
            if (replayDisposableArr == f23190e || replayDisposableArr == f23189d) {
                return;
            }
            int length = replayDisposableArr.length;
            int i11 = -1;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (replayDisposableArr[i12] == bVar) {
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
                replayDisposableArr2 = f23189d;
            } else {
                ReplaySubject.ReplayDisposable<T>[] replayDisposableArr3 = new b[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i11);
                System.arraycopy(replayDisposableArr, i11 + 1, replayDisposableArr3, i11, (length - i11) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!this.f23193b.compareAndSet(replayDisposableArr, replayDisposableArr2));
    }

    ReplaySubject.ReplayDisposable<T>[] Y(Object obj) {
        this.f23192a.compareAndSet(null, obj);
        return this.f23193b.getAndSet(f23190e);
    }

    @Override // hy.k
    public void a(iy.b bVar) {
        if (this.f23194c) {
            bVar.dispose();
        }
    }

    @Override // hy.k
    public void b(T t11) {
        g.c(t11, "onNext called with a null value.");
        if (this.f23194c) {
            return;
        }
        a<T> aVar = this.f23192a;
        aVar.add(t11);
        for (b<T> bVar : (b[]) this.f23193b.get()) {
            aVar.b(bVar);
        }
    }

    @Override // hy.k
    public void onComplete() {
        if (this.f23194c) {
            return;
        }
        this.f23194c = true;
        Object complete = i.complete();
        a<T> aVar = this.f23192a;
        aVar.a(complete);
        for (b<T> bVar : Y(complete)) {
            aVar.b(bVar);
        }
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        if (this.f23194c) {
            az.a.r(th2);
            return;
        }
        this.f23194c = true;
        Object error = i.error(th2);
        a<T> aVar = this.f23192a;
        aVar.a(error);
        for (b<T> bVar : Y(error)) {
            aVar.b(bVar);
        }
    }
}