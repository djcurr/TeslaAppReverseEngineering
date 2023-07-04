package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d<E> extends AbstractCollection<E> implements Queue<E>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient E[] f32221a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f32222b = 0;

    /* renamed from: c  reason: collision with root package name */
    private transient int f32223c = 0;

    /* renamed from: d  reason: collision with root package name */
    private transient boolean f32224d = false;

    /* renamed from: e  reason: collision with root package name */
    private final int f32225e;

    /* loaded from: classes5.dex */
    class a implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        private int f32226a;

        /* renamed from: b  reason: collision with root package name */
        private int f32227b = -1;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32228c;

        a() {
            this.f32226a = d.this.f32222b;
            this.f32228c = d.this.f32224d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32228c || this.f32226a != d.this.f32223c;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                this.f32228c = false;
                int i11 = this.f32226a;
                this.f32227b = i11;
                this.f32226a = d.this.n(i11);
                return (E) d.this.f32221a[this.f32227b];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            int i11 = this.f32227b;
            if (i11 != -1) {
                if (i11 == d.this.f32222b) {
                    d.this.remove();
                    this.f32227b = -1;
                    return;
                }
                int i12 = this.f32227b + 1;
                if (d.this.f32222b >= this.f32227b || i12 >= d.this.f32223c) {
                    while (i12 != d.this.f32223c) {
                        if (i12 >= d.this.f32225e) {
                            d.this.f32221a[i12 - 1] = d.this.f32221a[0];
                            i12 = 0;
                        } else {
                            d.this.f32221a[d.this.m(i12)] = d.this.f32221a[i12];
                            i12 = d.this.n(i12);
                        }
                    }
                } else {
                    System.arraycopy(d.this.f32221a, i12, d.this.f32221a, this.f32227b, d.this.f32223c - i12);
                }
                this.f32227b = -1;
                d dVar = d.this;
                dVar.f32223c = dVar.m(dVar.f32223c);
                d.this.f32221a[d.this.f32223c] = null;
                d.this.f32224d = false;
                this.f32226a = d.this.m(this.f32226a);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i11) {
        if (i11 > 0) {
            E[] eArr = (E[]) new Object[i11];
            this.f32221a = eArr;
            this.f32225e = eArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m(int i11) {
        int i12 = i11 - 1;
        return i12 < 0 ? this.f32225e - 1 : i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n(int i11) {
        int i12 = i11 + 1;
        if (i12 >= this.f32225e) {
            return 0;
        }
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e11) {
        Objects.requireNonNull(e11, "Attempted to add null object to queue");
        if (o()) {
            remove();
        }
        E[] eArr = this.f32221a;
        int i11 = this.f32223c;
        int i12 = i11 + 1;
        this.f32223c = i12;
        eArr[i11] = e11;
        if (i12 >= this.f32225e) {
            this.f32223c = 0;
        }
        if (this.f32223c == this.f32222b) {
            this.f32224d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f32224d = false;
        this.f32222b = 0;
        this.f32223c = 0;
        Arrays.fill(this.f32221a, (Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    public boolean o() {
        return size() == this.f32225e;
    }

    @Override // java.util.Queue
    public boolean offer(E e11) {
        return add(e11);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f32221a[this.f32222b];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (!isEmpty()) {
            E[] eArr = this.f32221a;
            int i11 = this.f32222b;
            E e11 = eArr[i11];
            if (e11 != null) {
                int i12 = i11 + 1;
                this.f32222b = i12;
                eArr[i11] = null;
                if (i12 >= this.f32225e) {
                    this.f32222b = 0;
                }
                this.f32224d = false;
            }
            return e11;
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i11 = this.f32223c;
        int i12 = this.f32222b;
        if (i11 < i12) {
            return (this.f32225e - i12) + i11;
        }
        if (i11 == i12) {
            return this.f32224d ? this.f32225e : 0;
        }
        return i11 - i12;
    }
}