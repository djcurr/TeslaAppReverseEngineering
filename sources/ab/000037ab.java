package com.google.common.collect;

import com.google.common.collect.p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class r<E> extends p<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final w0<Object> f16129b = new b(n0.f16098e, 0);

    /* loaded from: classes3.dex */
    public static final class a<E> extends p.a<E> {
        public a() {
            this(4);
        }

        public a<E> d(E e11) {
            super.b(e11);
            return this;
        }

        public r<E> e() {
            this.f16118c = true;
            return r.k(this.f16116a, this.f16117b);
        }

        a(int i11) {
            super(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b<E> extends com.google.common.collect.a<E> {

        /* renamed from: c  reason: collision with root package name */
        private final r<E> f16130c;

        b(r<E> rVar, int i11) {
            super(rVar.size(), i11);
            this.f16130c = rVar;
        }

        @Override // com.google.common.collect.a
        protected E a(int i11) {
            return this.f16130c.get(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends r<E> {

        /* renamed from: c  reason: collision with root package name */
        final transient int f16131c;

        /* renamed from: d  reason: collision with root package name */
        final transient int f16132d;

        c(int i11, int i12) {
            this.f16131c = i11;
            this.f16132d = i12;
        }

        @Override // com.google.common.collect.p
        Object[] d() {
            return r.this.d();
        }

        @Override // com.google.common.collect.p
        int e() {
            return r.this.f() + this.f16131c + this.f16132d;
        }

        @Override // com.google.common.collect.p
        int f() {
            return r.this.f() + this.f16131c;
        }

        @Override // java.util.List
        public E get(int i11) {
            com.google.common.base.u.m(i11, this.f16132d);
            return r.this.get(i11 + this.f16131c);
        }

        @Override // com.google.common.collect.p
        boolean h() {
            return true;
        }

        @Override // com.google.common.collect.r, com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.r, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f16132d;
        }

        @Override // com.google.common.collect.r, java.util.List
        /* renamed from: w */
        public r<E> subList(int i11, int i12) {
            com.google.common.base.u.t(i11, i12, this.f16132d);
            r rVar = r.this;
            int i13 = this.f16131c;
            return rVar.subList(i11 + i13, i12 + i13);
        }

        @Override // com.google.common.collect.r, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
            return super.listIterator(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> r<E> j(Object[] objArr) {
        return k(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> r<E> k(Object[] objArr, int i11) {
        if (i11 == 0) {
            return r();
        }
        return new n0(objArr, i11);
    }

    public static <E> a<E> m() {
        return new a<>();
    }

    private static <E> r<E> n(Object... objArr) {
        return j(k0.b(objArr));
    }

    public static <E> r<E> o(Collection<? extends E> collection) {
        if (collection instanceof p) {
            r<E> b11 = ((p) collection).b();
            return b11.h() ? j(b11.toArray()) : b11;
        }
        return n(collection.toArray());
    }

    public static <E> r<E> r() {
        return (r<E>) n0.f16098e;
    }

    public static <E> r<E> s(E e11) {
        return n(e11);
    }

    public static <E> r<E> t(E e11, E e12) {
        return n(e11, e12);
    }

    public static <E> r<E> u(E e11, E e12, E e13, E e14, E e15) {
        return n(e11, e12, e13, e14, e15);
    }

    public static <E> r<E> v(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        com.google.common.base.u.o(comparator);
        Object[] d11 = w.d(iterable);
        k0.b(d11);
        Arrays.sort(d11, comparator);
        return j(d11);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i11, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.p
    @Deprecated
    public final r<E> b() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p
    public int c(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i11 + i12] = get(i12);
        }
        return i11 + size;
    }

    @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return z.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = ~(~((i11 * 31) + get(i12).hashCode()));
        }
        return i11;
    }

    @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public v0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return z.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return z.d(this, obj);
    }

    @Override // java.util.List
    /* renamed from: p */
    public w0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q */
    public w0<E> listIterator(int i11) {
        com.google.common.base.u.r(i11, size());
        if (isEmpty()) {
            return (w0<E>) f16129b;
        }
        return new b(this, i11);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i11, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: w */
    public r<E> subList(int i11, int i12) {
        com.google.common.base.u.t(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        if (i13 == 0) {
            return r();
        }
        return x(i11, i12);
    }

    r<E> x(int i11, int i12) {
        return new c(i11, i12 - i11);
    }
}