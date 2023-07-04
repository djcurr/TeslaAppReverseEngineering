package uy;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import ny.g;

/* loaded from: classes5.dex */
public final class a<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<C1206a<T>> f53733a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<C1206a<T>> f53734b = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uy.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1206a<E> extends AtomicReference<C1206a<E>> {

        /* renamed from: a  reason: collision with root package name */
        private E f53735a;

        C1206a() {
        }

        public E a() {
            E b11 = b();
            e(null);
            return b11;
        }

        public E b() {
            return this.f53735a;
        }

        public C1206a<E> c() {
            return get();
        }

        public void d(C1206a<E> c1206a) {
            lazySet(c1206a);
        }

        public void e(E e11) {
            this.f53735a = e11;
        }

        C1206a(E e11) {
            e(e11);
        }
    }

    public a() {
        C1206a<T> c1206a = new C1206a<>();
        d(c1206a);
        e(c1206a);
    }

    C1206a<T> a() {
        return this.f53734b.get();
    }

    C1206a<T> b() {
        return this.f53734b.get();
    }

    C1206a<T> c() {
        return this.f53733a.get();
    }

    @Override // ny.h
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    void d(C1206a<T> c1206a) {
        this.f53734b.lazySet(c1206a);
    }

    C1206a<T> e(C1206a<T> c1206a) {
        return this.f53733a.getAndSet(c1206a);
    }

    @Override // ny.h
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // ny.h
    public boolean offer(T t11) {
        Objects.requireNonNull(t11, "Null is not a valid element");
        C1206a<T> c1206a = new C1206a<>(t11);
        e(c1206a).d(c1206a);
        return true;
    }

    @Override // ny.g, ny.h
    public T poll() {
        C1206a<T> c11;
        C1206a<T> a11 = a();
        C1206a<T> c12 = a11.c();
        if (c12 != null) {
            T a12 = c12.a();
            d(c12);
            return a12;
        } else if (a11 != c()) {
            do {
                c11 = a11.c();
            } while (c11 == null);
            T a13 = c11.a();
            d(c11);
            return a13;
        } else {
            return null;
        }
    }
}