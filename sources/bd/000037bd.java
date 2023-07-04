package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class u0<F, T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    final Iterator<? extends F> f16157a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(Iterator<? extends F> it2) {
        this.f16157a = (Iterator) com.google.common.base.u.o(it2);
    }

    abstract T a(F f11);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16157a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f16157a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16157a.remove();
    }
}