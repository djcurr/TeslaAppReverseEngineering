package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzjs extends zzii implements RandomAccess, zzln {
    private static final zzjs zza;
    private float[] zzb;
    private int zzc;

    static {
        zzjs zzjsVar = new zzjs(new float[0], 0);
        zza = zzjsVar;
        zzjsVar.zzb();
    }

    zzjs() {
        this(new float[10], 0);
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
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        float floatValue = ((Float) obj).floatValue();
        zzbK();
        if (i11 >= 0 && i11 <= (i12 = this.zzc)) {
            float[] fArr = this.zzb;
            if (i12 < fArr.length) {
                System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
            } else {
                float[] fArr2 = new float[((i12 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i11);
                System.arraycopy(this.zzb, i11, fArr2, i11 + 1, this.zzc - i11);
                this.zzb = fArr2;
            }
            this.zzb[i11] = floatValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i11));
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbK();
        zzkh.zze(collection);
        if (!(collection instanceof zzjs)) {
            return super.addAll(collection);
        }
        zzjs zzjsVar = (zzjs) collection;
        int i11 = zzjsVar.zzc;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zzc;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            float[] fArr = this.zzb;
            if (i13 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i13);
            }
            System.arraycopy(zzjsVar.zzb, 0, this.zzb, this.zzc, zzjsVar.zzc);
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
        if (!(obj instanceof zzjs)) {
            return super.equals(obj);
        }
        zzjs zzjsVar = (zzjs) obj;
        if (this.zzc != zzjsVar.zzc) {
            return false;
        }
        float[] fArr = zzjsVar.zzb;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            if (Float.floatToIntBits(this.zzb[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzg(i11);
        return Float.valueOf(this.zzb[i11]);
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.zzb[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i11 = this.zzc;
            for (int i12 = 0; i12 < i11; i12++) {
                if (this.zzb[i12] == floatValue) {
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
        zzg(i11);
        float[] fArr = this.zzb;
        float f11 = fArr[i11];
        if (i11 < this.zzc - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (i12 - i11) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zzbK();
        if (i12 >= i11) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i12, fArr, i11, this.zzc - i12);
            this.zzc -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzbK();
        zzg(i11);
        float[] fArr = this.zzb;
        float f11 = fArr[i11];
        fArr[i11] = floatValue;
        return Float.valueOf(f11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final /* bridge */ /* synthetic */ zzkg zzd(int i11) {
        if (i11 >= this.zzc) {
            return new zzjs(Arrays.copyOf(this.zzb, i11), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f11) {
        zzbK();
        int i11 = this.zzc;
        float[] fArr = this.zzb;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        fArr3[i12] = f11;
    }

    private zzjs(float[] fArr, int i11) {
        this.zzb = fArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}