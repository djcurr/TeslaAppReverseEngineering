package cz;

import hy.k;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import yy.g;

/* loaded from: classes5.dex */
public final class b<T> extends e<T> {

    /* renamed from: c  reason: collision with root package name */
    static final a[] f23183c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    static final a[] f23184d = new a[0];

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<PublishSubject.PublishDisposable<T>[]> f23185a = new AtomicReference<>(f23184d);

    /* renamed from: b  reason: collision with root package name */
    Throwable f23186b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a<T> extends AtomicBoolean implements iy.b {

        /* renamed from: a  reason: collision with root package name */
        final k<? super T> f23187a;

        /* renamed from: b  reason: collision with root package name */
        final b<T> f23188b;

        a(k<? super T> kVar, b<T> bVar) {
            this.f23187a = kVar;
            this.f23188b = bVar;
        }

        public void a() {
            if (get()) {
                return;
            }
            this.f23187a.onComplete();
        }

        public void b(Throwable th2) {
            if (get()) {
                az.a.r(th2);
            } else {
                this.f23187a.onError(th2);
            }
        }

        public void c(T t11) {
            if (get()) {
                return;
            }
            this.f23187a.b(t11);
        }

        @Override // iy.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f23188b.X(this);
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return get();
        }
    }

    b() {
    }

    public static <T> b<T> W() {
        return new b<>();
    }

    @Override // hy.i
    protected void L(k<? super T> kVar) {
        a<T> aVar = new a<>(kVar, this);
        kVar.a(aVar);
        if (V(aVar)) {
            if (aVar.isDisposed()) {
                X(aVar);
                return;
            }
            return;
        }
        Throwable th2 = this.f23186b;
        if (th2 != null) {
            kVar.onError(th2);
        } else {
            kVar.onComplete();
        }
    }

    @Override // cz.e
    public boolean R() {
        return this.f23185a.get() == f23183c && this.f23186b == null;
    }

    @Override // cz.e
    public boolean S() {
        return this.f23185a.get().length != 0;
    }

    @Override // cz.e
    public boolean T() {
        return this.f23185a.get() == f23183c && this.f23186b != null;
    }

    boolean V(a<T> aVar) {
        PublishSubject.PublishDisposable<T>[] publishDisposableArr;
        PublishSubject.PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = (a[]) this.f23185a.get();
            if (publishDisposableArr == f23183c) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new a[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = aVar;
        } while (!this.f23185a.compareAndSet(publishDisposableArr, publishDisposableArr2));
        return true;
    }

    void X(a<T> aVar) {
        PublishSubject.PublishDisposable<T>[] publishDisposableArr;
        PublishSubject.PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = (a[]) this.f23185a.get();
            if (publishDisposableArr == f23183c || publishDisposableArr == f23184d) {
                return;
            }
            int length = publishDisposableArr.length;
            int i11 = -1;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                } else if (publishDisposableArr[i12] == aVar) {
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
                publishDisposableArr2 = f23184d;
            } else {
                PublishSubject.PublishDisposable<T>[] publishDisposableArr3 = new a[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i11);
                System.arraycopy(publishDisposableArr, i11 + 1, publishDisposableArr3, i11, (length - i11) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!this.f23185a.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }

    @Override // hy.k
    public void a(iy.b bVar) {
        if (this.f23185a.get() == f23183c) {
            bVar.dispose();
        }
    }

    @Override // hy.k
    public void b(T t11) {
        g.c(t11, "onNext called with a null value.");
        for (a aVar : this.f23185a.get()) {
            aVar.c(t11);
        }
    }

    @Override // hy.k
    public void onComplete() {
        PublishSubject.PublishDisposable<T>[] publishDisposableArr = this.f23185a.get();
        PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = f23183c;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (a aVar : this.f23185a.getAndSet(publishDisposableArr2)) {
            aVar.a();
        }
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        PublishSubject.PublishDisposable<T>[] publishDisposableArr = this.f23185a.get();
        PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = f23183c;
        if (publishDisposableArr == publishDisposableArr2) {
            az.a.r(th2);
            return;
        }
        this.f23186b = th2;
        for (a aVar : this.f23185a.getAndSet(publishDisposableArr2)) {
            aVar.b(th2);
        }
    }
}