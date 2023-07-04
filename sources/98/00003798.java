package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class l0<T> implements Comparator<T> {
    public static <T> l0<T> a(Comparator<T> comparator) {
        if (comparator instanceof l0) {
            return (l0) comparator;
        }
        return new l(comparator);
    }

    public static <C extends Comparable> l0<C> c() {
        return i0.f16068a;
    }

    public <E extends T> r<E> b(Iterable<E> iterable) {
        return r.v(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t11, T t12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T2 extends T> l0<Map.Entry<T2, ?>> f() {
        return (l0<Map.Entry<T2, ?>>) g(d0.d());
    }

    public <F> l0<F> g(com.google.common.base.l<F, ? extends T> lVar) {
        return new g(lVar, this);
    }

    public <S extends T> l0<S> i() {
        return new r0(this);
    }
}