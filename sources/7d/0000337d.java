package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class zziy extends zziv implements List, RandomAccess {
    private static final zzjw zza = new zziw(zzjm.zza, 0);

    public static zziy zzi(Object[] objArr) {
        return zzj(objArr, objArr.length);
    }

    static zziy zzj(Object[] objArr, int i11) {
        if (i11 == 0) {
            return zzjm.zza;
        }
        return new zzjm(objArr, i11);
    }

    public static zziy zzk(Collection collection) {
        if (collection instanceof zziv) {
            zziy zzd = ((zziv) collection).zzd();
            if (zzd.zzf()) {
                Object[] array = zzd.toArray();
                return zzj(array, array.length);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzji.zza(array2, length);
        return zzj(array2, length);
    }

    public static zziy zzl(Object[] objArr) {
        if (objArr.length == 0) {
            return zzjm.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzji.zza(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zziy zzm() {
        return zzjm.zza;
    }

    public static zziy zzn(Object obj) {
        Object[] objArr = {obj};
        zzji.zza(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zziy zzo(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzji.zza(objArr, 2);
        return zzj(objArr, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zziy zzp(Comparator comparator, Iterable iterable) {
        Object[] array = iterable.toArray();
        int length = array.length;
        zzji.zza(array, length);
        Arrays.sort(array, comparator);
        return zzj(array, length);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zziv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i11 = 0; i11 < size; i11++) {
                        if (zzic.zza(get(i11), list.get(i11))) {
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it3.hasNext()) {
                            if (!zzic.zza(it2.next(), it3.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it3.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = (i11 * 31) + get(i12).hashCode();
        }
        return i11;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (obj.equals(get(i11))) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zziv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zziv
    int zza(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i12] = get(i12);
        }
        return size;
    }

    @Override // com.google.android.libraries.places.internal.zziv
    @Deprecated
    public final zziy zzd() {
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zziv
    public final zzjv zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zziy subList(int i11, int i12) {
        zzig.zzg(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        if (i13 == 0) {
            return zzjm.zza;
        }
        return new zzix(this, i11, i13);
    }

    @Override // java.util.List
    /* renamed from: zzq */
    public final zzjw listIterator(int i11) {
        zzig.zzb(i11, size(), "index");
        return isEmpty() ? zza : new zziw(this, i11);
    }
}