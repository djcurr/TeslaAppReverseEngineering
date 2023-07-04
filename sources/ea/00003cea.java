package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private E[] array;
    private int size;

    static {
        ProtobufArrayList<Object> protobufArrayList = new ProtobufArrayList<>(new Object[0], 0);
        EMPTY_LIST = protobufArrayList;
        protobufArrayList.makeImmutable();
    }

    ProtobufArrayList() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i11) {
        return (E[]) new Object[i11];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
    }

    private void ensureIndexInRange(int i11) {
        if (i11 < 0 || i11 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i11));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i11) {
        return "Index:" + i11 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        ensureIsMutable();
        int i11 = this.size;
        E[] eArr = this.array;
        if (i11 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i11 * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        eArr2[i12] = e11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        ensureIndexInRange(i11);
        return this.array[i11];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i11) {
        int i12;
        ensureIsMutable();
        ensureIndexInRange(i11);
        E[] eArr = this.array;
        E e11 = eArr[i11];
        if (i11 < this.size - 1) {
            System.arraycopy(eArr, i11 + 1, eArr, i11, (i12 - i11) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        E[] eArr = this.array;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] eArr, int i11) {
        this.array = eArr;
        this.size = i11;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    public ProtobufArrayList<E> mutableCopyWithCapacity(int i11) {
        if (i11 >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.array, i11), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        int i12;
        ensureIsMutable();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            E[] eArr = this.array;
            if (i12 < eArr.length) {
                System.arraycopy(eArr, i11, eArr, i11 + 1, i12 - i11);
            } else {
                E[] eArr2 = (E[]) createArray(((i12 * 3) / 2) + 1);
                System.arraycopy(this.array, 0, eArr2, 0, i11);
                System.arraycopy(this.array, i11, eArr2, i11 + 1, this.size - i11);
                this.array = eArr2;
            }
            this.array[i11] = e11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i11));
    }
}