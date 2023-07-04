package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c1<E> extends c<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final c1<Object> f16239d;

    /* renamed from: b  reason: collision with root package name */
    private E[] f16240b;

    /* renamed from: c  reason: collision with root package name */
    private int f16241c;

    static {
        c1<Object> c1Var = new c1<>(new Object[0], 0);
        f16239d = c1Var;
        c1Var.makeImmutable();
    }

    private c1(E[] eArr, int i11) {
        this.f16240b = eArr;
        this.f16241c = i11;
    }

    private static <E> E[] c(int i11) {
        return (E[]) new Object[i11];
    }

    public static <E> c1<E> d() {
        return (c1<E>) f16239d;
    }

    private void e(int i11) {
        if (i11 < 0 || i11 >= this.f16241c) {
            throw new IndexOutOfBoundsException(f(i11));
        }
    }

    private String f(int i11) {
        return "Index:" + i11 + ", Size:" + this.f16241c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        b();
        int i11 = this.f16241c;
        E[] eArr = this.f16240b;
        if (i11 == eArr.length) {
            this.f16240b = (E[]) Arrays.copyOf(eArr, ((i11 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f16240b;
        int i12 = this.f16241c;
        this.f16241c = i12 + 1;
        eArr2[i12] = e11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        e(i11);
        return this.f16240b[i11];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: h */
    public c1<E> mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f16241c) {
            return new c1<>(Arrays.copyOf(this.f16240b, i11), this.f16241c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        int i12;
        b();
        e(i11);
        E[] eArr = this.f16240b;
        E e11 = eArr[i11];
        if (i11 < this.f16241c - 1) {
            System.arraycopy(eArr, i11 + 1, eArr, i11, (i12 - i11) - 1);
        }
        this.f16241c--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        b();
        e(i11);
        E[] eArr = this.f16240b;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16241c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        int i12;
        b();
        if (i11 >= 0 && i11 <= (i12 = this.f16241c)) {
            E[] eArr = this.f16240b;
            if (i12 < eArr.length) {
                System.arraycopy(eArr, i11, eArr, i11 + 1, i12 - i11);
            } else {
                E[] eArr2 = (E[]) c(((i12 * 3) / 2) + 1);
                System.arraycopy(this.f16240b, 0, eArr2, 0, i11);
                System.arraycopy(this.f16240b, i11, eArr2, i11 + 1, this.f16241c - i11);
                this.f16240b = eArr2;
            }
            this.f16240b[i11] = e11;
            this.f16241c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i11));
    }
}