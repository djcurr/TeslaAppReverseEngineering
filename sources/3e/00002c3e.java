package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
final class zzfv extends zzef<Float> implements zzge<Float>, zzhr {
    private static final zzfv zzwf;
    private int size;
    private float[] zzwg;

    static {
        zzfv zzfvVar = new zzfv();
        zzwf = zzfvVar;
        zzfvVar.zzci();
    }

    zzfv() {
        this(new float[10], 0);
    }

    private final void zzaf(int i11) {
        if (i11 < 0 || i11 >= this.size) {
            throw new IndexOutOfBoundsException(zzag(i11));
        }
    }

    private final String zzag(int i11) {
        int i12 = this.size;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i11);
        sb2.append(", Size:");
        sb2.append(i12);
        return sb2.toString();
    }

    private final void zzc(int i11, float f11) {
        int i12;
        zzcj();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            float[] fArr = this.zzwg;
            if (i12 < fArr.length) {
                System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
            } else {
                float[] fArr2 = new float[((i12 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i11);
                System.arraycopy(this.zzwg, i11, fArr2, i11 + 1, this.size - i11);
                this.zzwg = fArr2;
            }
            this.zzwg[i11] = f11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzag(i11));
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        zzc(i11, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzfv)) {
            return super.addAll(collection);
        }
        zzfv zzfvVar = (zzfv) collection;
        int i11 = zzfvVar.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            float[] fArr = this.zzwg;
            if (i13 > fArr.length) {
                this.zzwg = Arrays.copyOf(fArr, i13);
            }
            System.arraycopy(zzfvVar.zzwg, 0, this.zzwg, this.size, zzfvVar.size);
            this.size = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfv)) {
            return super.equals(obj);
        }
        zzfv zzfvVar = (zzfv) obj;
        if (this.size != zzfvVar.size) {
            return false;
        }
        float[] fArr = zzfvVar.zzwg;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (Float.floatToIntBits(this.zzwg[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzaf(i11);
        return Float.valueOf(this.zzwg[i11]);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.zzwg[i12]);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzcj();
        for (int i11 = 0; i11 < this.size; i11++) {
            if (obj.equals(Float.valueOf(this.zzwg[i11]))) {
                float[] fArr = this.zzwg;
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
        zzcj();
        if (i12 >= i11) {
            float[] fArr = this.zzwg;
            System.arraycopy(fArr, i12, fArr, i11, this.size - i12);
            this.size -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzcj();
        zzaf(i11);
        float[] fArr = this.zzwg;
        float f11 = fArr[i11];
        fArr[i11] = floatValue;
        return Float.valueOf(f11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge<Float> zzah(int i11) {
        if (i11 >= this.size) {
            return new zzfv(Arrays.copyOf(this.zzwg, i11), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(float f11) {
        zzc(this.size, f11);
    }

    private zzfv(float[] fArr, int i11) {
        this.zzwg = fArr;
        this.size = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zzcj();
        zzaf(i11);
        float[] fArr = this.zzwg;
        float f11 = fArr[i11];
        int i12 = this.size;
        if (i11 < i12 - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, i12 - i11);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f11);
    }
}