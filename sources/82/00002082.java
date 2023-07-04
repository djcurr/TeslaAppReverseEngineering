package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
final class zzce extends zzav<Float> implements zzcn<Float> {
    private static final zzce zzjm;
    private int size;
    private float[] zzjn;

    static {
        zzce zzceVar = new zzce();
        zzjm = zzceVar;
        zzceVar.zzv();
    }

    zzce() {
        this(new float[10], 0);
    }

    private zzce(float[] fArr, int i11) {
        this.zzjn = fArr;
        this.size = i11;
    }

    private final void zzc(int i11, float f11) {
        int i12;
        zzw();
        if (i11 < 0 || i11 > (i12 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i11));
        }
        float[] fArr = this.zzjn;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
        } else {
            float[] fArr2 = new float[((i12 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            System.arraycopy(this.zzjn, i11, fArr2, i11 + 1, this.size - i11);
            this.zzjn = fArr2;
        }
        this.zzjn[i11] = f11;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    private final void zzg(int i11) {
        if (i11 < 0 || i11 >= this.size) {
            throw new IndexOutOfBoundsException(zzh(i11));
        }
    }

    private final String zzh(int i11) {
        int i12 = this.size;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i11);
        sb2.append(", Size:");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        zzc(i11, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (collection instanceof zzce) {
            zzce zzceVar = (zzce) collection;
            int i11 = zzceVar.size;
            if (i11 == 0) {
                return false;
            }
            int i12 = this.size;
            if (Integer.MAX_VALUE - i12 >= i11) {
                int i13 = i12 + i11;
                float[] fArr = this.zzjn;
                if (i13 > fArr.length) {
                    this.zzjn = Arrays.copyOf(fArr, i13);
                }
                System.arraycopy(zzceVar.zzjn, 0, this.zzjn, this.size, zzceVar.size);
                this.size = i13;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzce) {
            zzce zzceVar = (zzce) obj;
            if (this.size != zzceVar.size) {
                return false;
            }
            float[] fArr = zzceVar.zzjn;
            for (int i11 = 0; i11 < this.size; i11++) {
                if (this.zzjn[i11] != fArr[i11]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzg(i11);
        return Float.valueOf(this.zzjn[i11]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.zzjn[i12]);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zzw();
        zzg(i11);
        float[] fArr = this.zzjn;
        float f11 = fArr[i11];
        int i12 = this.size;
        if (i11 < i12 - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, i12 - i11);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f11);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i11 = 0; i11 < this.size; i11++) {
            if (obj.equals(Float.valueOf(this.zzjn[i11]))) {
                float[] fArr = this.zzjn;
                System.arraycopy(fArr, i11 + 1, fArr, i11, this.size - i11);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zzw();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzjn;
        System.arraycopy(fArr, i12, fArr, i11, this.size - i12);
        this.size -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzw();
        zzg(i11);
        float[] fArr = this.zzjn;
        float f11 = fArr[i11];
        fArr[i11] = floatValue;
        return Float.valueOf(f11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzc(float f11) {
        zzc(this.size, f11);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Float> zzi(int i11) {
        if (i11 >= this.size) {
            return new zzce(Arrays.copyOf(this.zzjn, i11), this.size);
        }
        throw new IllegalArgumentException();
    }
}