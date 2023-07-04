package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzaez extends zzadr implements RandomAccess, zzafd, zzagn {
    private static final zzaez zza;
    private int[] zzb;
    private int zzc;

    static {
        zzaez zzaezVar = new zzaez(new int[0], 0);
        zza = zzaezVar;
        zzaezVar.zzb();
    }

    zzaez() {
        this(new int[10], 0);
    }

    public static zzaez zze() {
        return zza;
    }

    private final String zzg(int i11) {
        int i12 = this.zzc;
        return "Index:" + i11 + ", Size:" + i12;
    }

    private final void zzh(int i11) {
        if (i11 < 0 || i11 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i11));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i11 >= 0 && i11 <= (i12 = this.zzc)) {
            int[] iArr = this.zzb;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i11, iArr, i11 + 1, i12 - i11);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                System.arraycopy(this.zzb, i11, iArr2, i11 + 1, this.zzc - i11);
                this.zzb = iArr2;
            }
            this.zzb[i11] = intValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzg(i11));
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzafh.zze(collection);
        if (!(collection instanceof zzaez)) {
            return super.addAll(collection);
        }
        zzaez zzaezVar = (zzaez) collection;
        int i11 = zzaezVar.zzc;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zzc;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            int[] iArr = this.zzb;
            if (i13 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i13);
            }
            System.arraycopy(zzaezVar.zzb, 0, this.zzb, this.zzc, zzaezVar.zzc);
            this.zzc = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaez)) {
            return super.equals(obj);
        }
        zzaez zzaezVar = (zzaez) obj;
        if (this.zzc != zzaezVar.zzc) {
            return false;
        }
        int[] iArr = zzaezVar.zzb;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            if (this.zzb[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzh(i11);
        return Integer.valueOf(this.zzb[i11]);
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            i11 = (i11 * 31) + this.zzb[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i11 = this.zzc;
            for (int i12 = 0; i12 < i11; i12++) {
                if (this.zzb[i12] == intValue) {
                    return i12;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        int i12;
        zza();
        zzh(i11);
        int[] iArr = this.zzb;
        int i13 = iArr[i11];
        if (i11 < this.zzc - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i12 - i11) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zza();
        if (i12 >= i11) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i12, iArr, i11, this.zzc - i12);
            this.zzc -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzh(i11);
        int[] iArr = this.zzb;
        int i12 = iArr[i11];
        iArr[i11] = intValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zzd(int i11) {
        zzh(i11);
        return this.zzb[i11];
    }

    @Override // com.google.android.libraries.places.internal.zzafg
    public final /* bridge */ /* synthetic */ zzafg zzf(int i11) {
        if (i11 >= this.zzc) {
            return new zzaez(Arrays.copyOf(this.zzb, i11), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzaez(int[] iArr, int i11) {
        this.zzb = iArr;
        this.zzc = i11;
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        int i11 = this.zzc;
        int[] iArr = this.zzb;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        iArr3[i12] = intValue;
        return true;
    }
}