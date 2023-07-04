package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class a<E> extends w0<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f15961a;

    /* renamed from: b  reason: collision with root package name */
    private int f15962b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i11, int i12) {
        com.google.common.base.u.r(i12, i11);
        this.f15961a = i11;
        this.f15962b = i12;
    }

    protected abstract E a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15962b < this.f15961a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15962b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i11 = this.f15962b;
            this.f15962b = i11 + 1;
            return a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15962b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i11 = this.f15962b - 1;
            this.f15962b = i11;
            return a(i11);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15962b - 1;
    }
}