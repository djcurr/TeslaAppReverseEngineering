package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class p<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f16115a = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f16116a;

        /* renamed from: b  reason: collision with root package name */
        int f16117b;

        /* renamed from: c  reason: collision with root package name */
        boolean f16118c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i11) {
            h.b(i11, "initialCapacity");
            this.f16116a = new Object[i11];
            this.f16117b = 0;
        }

        private void c(int i11) {
            Object[] objArr = this.f16116a;
            if (objArr.length < i11) {
                this.f16116a = Arrays.copyOf(objArr, b.a(objArr.length, i11));
                this.f16118c = false;
            } else if (this.f16118c) {
                this.f16116a = (Object[]) objArr.clone();
                this.f16118c = false;
            }
        }

        public a<E> b(E e11) {
            com.google.common.base.u.o(e11);
            c(this.f16117b + 1);
            Object[] objArr = this.f16116a;
            int i11 = this.f16117b;
            this.f16117b = i11 + 1;
            objArr[i11] = e11;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b<E> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int a(int i11, int i12) {
            if (i12 >= 0) {
                int i13 = i11 + (i11 >> 1) + 1;
                if (i13 < i12) {
                    i13 = Integer.highestOneBit(i12 - 1) << 1;
                }
                if (i13 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i13;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public r<E> b() {
        return isEmpty() ? r.r() : r.j(toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(Object[] objArr, int i11) {
        v0<E> it2 = iterator();
        while (it2.hasNext()) {
            objArr[i11] = it2.next();
            i11++;
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] d() {
        return null;
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean h();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public abstract v0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f16115a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        com.google.common.base.u.o(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] d11 = d();
            if (d11 != null) {
                return (T[]) m0.a(d11, f(), e(), tArr);
            }
            tArr = (T[]) k0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        c(tArr, 0);
        return tArr;
    }
}