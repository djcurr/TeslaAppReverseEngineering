package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzka extends zzii implements RandomAccess, zzke, zzln {
    private static final zzka zza;
    private int[] zzb;
    private int zzc;

    static {
        zzka zzkaVar = new zzka(new int[0], 0);
        zza = zzkaVar;
        zzkaVar.zzb();
    }

    zzka() {
        this(new int[10], 0);
    }

    public static zzka zzf() {
        return zza;
    }

    private final String zzi(int i11) {
        int i12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i11);
        sb2.append(", Size:");
        sb2.append(i12);
        return sb2.toString();
    }

    private final void zzj(int i11) {
        if (i11 < 0 || i11 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        int intValue = ((Integer) obj).intValue();
        zzbK();
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
        throw new IndexOutOfBoundsException(zzi(i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbK();
        zzkh.zze(collection);
        if (!(collection instanceof zzka)) {
            return super.addAll(collection);
        }
        zzka zzkaVar = (zzka) collection;
        int i11 = zzkaVar.zzc;
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
            System.arraycopy(zzkaVar.zzb, 0, this.zzb, this.zzc, zzkaVar.zzc);
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

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzka)) {
            return super.equals(obj);
        }
        zzka zzkaVar = (zzka) obj;
        if (this.zzc != zzkaVar.zzc) {
            return false;
        }
        int[] iArr = zzkaVar.zzb;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            if (this.zzb[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzj(i11);
        return Integer.valueOf(this.zzb[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        int i12;
        zzbK();
        zzj(i11);
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
        zzbK();
        if (i12 >= i11) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i12, iArr, i11, this.zzc - i12);
            this.zzc -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbK();
        zzj(i11);
        int[] iArr = this.zzb;
        int i12 = iArr[i11];
        iArr[i11] = intValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zze(int i11) {
        zzj(i11);
        return this.zzb[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    /* renamed from: zzg */
    public final zzke zzd(int i11) {
        if (i11 >= this.zzc) {
            return new zzka(Arrays.copyOf(this.zzb, i11), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i11) {
        zzbK();
        int i12 = this.zzc;
        int[] iArr = this.zzb;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        iArr3[i13] = i11;
    }

    private zzka(int[] iArr, int i11) {
        this.zzb = iArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}