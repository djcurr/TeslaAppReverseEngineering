package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzht<E> extends zzef<E> {
    private static final zzht<Object> zzzz;
    private final List<E> zzym;

    static {
        zzht<Object> zzhtVar = new zzht<>();
        zzzz = zzhtVar;
        zzhtVar.zzci();
    }

    zzht() {
        this(new ArrayList(10));
    }

    public static <E> zzht<E> zzgm() {
        return (zzht<E>) zzzz;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        zzcj();
        this.zzym.add(i11, e11);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        return this.zzym.get(i11);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final E remove(int i11) {
        zzcj();
        E remove = this.zzym.remove(i11);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        zzcj();
        E e12 = this.zzym.set(i11, e11);
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzym.size();
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge zzah(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.zzym);
            return new zzht(arrayList);
        }
        throw new IllegalArgumentException();
    }

    private zzht(List<E> list) {
        this.zzym = list;
    }
}