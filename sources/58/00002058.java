package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
abstract class zzav<E> extends AbstractList<E> implements zzcn<E> {
    private boolean zzfa = true;

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        zzw();
        super.add(i11, e11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        zzw();
        return super.add(e11);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends E> collection) {
        zzw();
        return super.addAll(i11, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        zzw();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        zzw();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (obj instanceof RandomAccess) {
                List list = (List) obj;
                int size = size();
                if (size != list.size()) {
                    return false;
                }
                for (int i11 = 0; i11 < size; i11++) {
                    if (!get(i11).equals(list.get(i11))) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = (i11 * 31) + get(i12).hashCode();
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        zzw();
        return (E) super.remove(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        zzw();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        zzw();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        zzw();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        zzw();
        return (E) super.set(i11, e11);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public boolean zzu() {
        return this.zzfa;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final void zzv() {
        this.zzfa = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzw() {
        if (!this.zzfa) {
            throw new UnsupportedOperationException();
        }
    }
}