package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzlp extends zzii implements RandomAccess {
    private static final zzlp zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzlp zzlpVar = new zzlp(new Object[0], 0);
        zza = zzlpVar;
        zzlpVar.zzb();
    }

    zzlp() {
        this(new Object[10], 0);
    }

    public static zzlp zze() {
        return zza;
    }

    private final String zzf(int i11) {
        int i12 = this.zzc;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i11);
        sb2.append(", Size:");
        sb2.append(i12);
        return sb2.toString();
    }

    private final void zzg(int i11) {
        if (i11 < 0 || i11 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zzbK();
        if (i11 >= 0 && i11 <= (i12 = this.zzc)) {
            Object[] objArr = this.zzb;
            if (i12 < objArr.length) {
                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
            } else {
                Object[] objArr2 = new Object[((i12 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(this.zzb, i11, objArr2, i11 + 1, this.zzc - i11);
                this.zzb = objArr2;
            }
            this.zzb[i11] = obj;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        zzg(i11);
        return this.zzb[i11];
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        int i12;
        zzbK();
        zzg(i11);
        Object[] objArr = this.zzb;
        Object obj = objArr[i11];
        if (i11 < this.zzc - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (i12 - i11) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zzbK();
        zzg(i11);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final /* bridge */ /* synthetic */ zzkg zzd(int i11) {
        if (i11 >= this.zzc) {
            return new zzlp(Arrays.copyOf(this.zzb, i11), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzlp(Object[] objArr, int i11) {
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbK();
        int i11 = this.zzc;
        Object[] objArr = this.zzb;
        if (i11 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}