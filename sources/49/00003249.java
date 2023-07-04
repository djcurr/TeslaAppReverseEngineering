package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzafv extends zzadr implements RandomAccess, zzaff, zzagn {
    private static final zzafv zza;
    private long[] zzb;
    private int zzc;

    static {
        zzafv zzafvVar = new zzafv(new long[0], 0);
        zza = zzafvVar;
        zzafvVar.zzb();
    }

    zzafv() {
        this(new long[10], 0);
    }

    public static zzafv zze() {
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
        long longValue = ((Long) obj).longValue();
        zza();
        if (i11 >= 0 && i11 <= (i12 = this.zzc)) {
            long[] jArr = this.zzb;
            if (i12 < jArr.length) {
                System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
            } else {
                long[] jArr2 = new long[((i12 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i11);
                System.arraycopy(this.zzb, i11, jArr2, i11 + 1, this.zzc - i11);
                this.zzb = jArr2;
            }
            this.zzb[i11] = longValue;
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
        if (!(collection instanceof zzafv)) {
            return super.addAll(collection);
        }
        zzafv zzafvVar = (zzafv) collection;
        int i11 = zzafvVar.zzc;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zzc;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            long[] jArr = this.zzb;
            if (i13 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i13);
            }
            System.arraycopy(zzafvVar.zzb, 0, this.zzb, this.zzc, zzafvVar.zzc);
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
        if (!(obj instanceof zzafv)) {
            return super.equals(obj);
        }
        zzafv zzafvVar = (zzafv) obj;
        if (this.zzc != zzafvVar.zzc) {
            return false;
        }
        long[] jArr = zzafvVar.zzb;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            if (this.zzb[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzh(i11);
        return Long.valueOf(this.zzb[i11]);
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            i11 = (i11 * 31) + zzafh.zzc(this.zzb[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i11 = this.zzc;
            for (int i12 = 0; i12 < i11; i12++) {
                if (this.zzb[i12] == longValue) {
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
        long[] jArr = this.zzb;
        long j11 = jArr[i11];
        if (i11 < this.zzc - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zza();
        if (i12 >= i11) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i12, jArr, i11, this.zzc - i12);
            this.zzc -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzh(i11);
        long[] jArr = this.zzb;
        long j11 = jArr[i11];
        jArr[i11] = longValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final long zzd(int i11) {
        zzh(i11);
        return this.zzb[i11];
    }

    @Override // com.google.android.libraries.places.internal.zzafg
    public final /* bridge */ /* synthetic */ zzafg zzf(int i11) {
        if (i11 >= this.zzc) {
            return new zzafv(Arrays.copyOf(this.zzb, i11), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzafv(long[] jArr, int i11) {
        this.zzb = jArr;
        this.zzc = i11;
    }

    @Override // com.google.android.libraries.places.internal.zzadr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        int i11 = this.zzc;
        long[] jArr = this.zzb;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        jArr3[i12] = longValue;
        return true;
    }
}