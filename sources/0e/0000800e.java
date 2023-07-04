package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.l0;
import v20.r0;

/* loaded from: classes5.dex */
public class k0<T extends l0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    private T[] f35483a;

    private final T[] f() {
        T[] tArr = this.f35483a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new l0[4];
            this.f35483a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((l0[]) copyOf);
            this.f35483a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void j(int i11) {
        this._size = i11;
    }

    private final void k(int i11) {
        while (true) {
            int i12 = (i11 * 2) + 1;
            if (i12 >= c()) {
                return;
            }
            T[] tArr = this.f35483a;
            kotlin.jvm.internal.s.e(tArr);
            int i13 = i12 + 1;
            if (i13 < c()) {
                T t11 = tArr[i13];
                kotlin.jvm.internal.s.e(t11);
                T t12 = tArr[i12];
                kotlin.jvm.internal.s.e(t12);
                if (((Comparable) t11).compareTo(t12) < 0) {
                    i12 = i13;
                }
            }
            T t13 = tArr[i11];
            kotlin.jvm.internal.s.e(t13);
            T t14 = tArr[i12];
            kotlin.jvm.internal.s.e(t14);
            if (((Comparable) t13).compareTo(t14) <= 0) {
                return;
            }
            m(i11, i12);
            i11 = i12;
        }
    }

    private final void l(int i11) {
        while (i11 > 0) {
            T[] tArr = this.f35483a;
            kotlin.jvm.internal.s.e(tArr);
            int i12 = (i11 - 1) / 2;
            T t11 = tArr[i12];
            kotlin.jvm.internal.s.e(t11);
            T t12 = tArr[i11];
            kotlin.jvm.internal.s.e(t12);
            if (((Comparable) t11).compareTo(t12) <= 0) {
                return;
            }
            m(i11, i12);
            i11 = i12;
        }
    }

    private final void m(int i11, int i12) {
        T[] tArr = this.f35483a;
        kotlin.jvm.internal.s.e(tArr);
        T t11 = tArr[i12];
        kotlin.jvm.internal.s.e(t11);
        T t12 = tArr[i11];
        kotlin.jvm.internal.s.e(t12);
        tArr[i11] = t11;
        tArr[i12] = t12;
        t11.setIndex(i11);
        t12.setIndex(i12);
    }

    public final void a(T t11) {
        if (r0.a()) {
            if (!(t11.b() == null)) {
                throw new AssertionError();
            }
        }
        t11.a(this);
        T[] f11 = f();
        int c11 = c();
        j(c11 + 1);
        f11[c11] = t11;
        t11.setIndex(c11);
        l(c11);
    }

    public final T b() {
        T[] tArr = this.f35483a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b11;
        synchronized (this) {
            b11 = b();
        }
        return b11;
    }

    public final boolean g(T t11) {
        boolean z11;
        synchronized (this) {
            z11 = true;
            if (t11.b() == null) {
                z11 = false;
            } else {
                int index = t11.getIndex();
                if (r0.a()) {
                    if (!(index >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(index);
            }
        }
        return z11;
    }

    public final T h(int i11) {
        if (r0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f35483a;
        kotlin.jvm.internal.s.e(tArr);
        j(c() - 1);
        if (i11 < c()) {
            m(i11, c());
            int i12 = (i11 - 1) / 2;
            if (i11 > 0) {
                T t11 = tArr[i11];
                kotlin.jvm.internal.s.e(t11);
                T t12 = tArr[i12];
                kotlin.jvm.internal.s.e(t12);
                if (((Comparable) t11).compareTo(t12) < 0) {
                    m(i11, i12);
                    l(i12);
                }
            }
            k(i11);
        }
        T t13 = tArr[c()];
        kotlin.jvm.internal.s.e(t13);
        if (r0.a()) {
            if (!(t13.b() == this)) {
                throw new AssertionError();
            }
        }
        t13.a(null);
        t13.setIndex(-1);
        tArr[c()] = null;
        return t13;
    }

    public final T i() {
        T h11;
        synchronized (this) {
            h11 = c() > 0 ? h(0) : null;
        }
        return h11;
    }
}