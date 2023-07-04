package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
final class zzfh extends zzef<Double> implements zzge<Double>, zzhr {
    private static final zzfh zztc;
    private int size;
    private double[] zztd;

    static {
        zzfh zzfhVar = new zzfh();
        zztc = zzfhVar;
        zzfhVar.zzci();
    }

    zzfh() {
        this(new double[10], 0);
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

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        zzc(i11, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzfh)) {
            return super.addAll(collection);
        }
        zzfh zzfhVar = (zzfh) collection;
        int i11 = zzfhVar.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            double[] dArr = this.zztd;
            if (i13 > dArr.length) {
                this.zztd = Arrays.copyOf(dArr, i13);
            }
            System.arraycopy(zzfhVar.zztd, 0, this.zztd, this.size, zzfhVar.size);
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
        if (!(obj instanceof zzfh)) {
            return super.equals(obj);
        }
        zzfh zzfhVar = (zzfh) obj;
        if (this.size != zzfhVar.size) {
            return false;
        }
        double[] dArr = zzfhVar.zztd;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (Double.doubleToLongBits(this.zztd[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzaf(i11);
        return Double.valueOf(this.zztd[i11]);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + zzga.zzo(Double.doubleToLongBits(this.zztd[i12]));
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzcj();
        for (int i11 = 0; i11 < this.size; i11++) {
            if (obj.equals(Double.valueOf(this.zztd[i11]))) {
                double[] dArr = this.zztd;
                System.arraycopy(dArr, i11 + 1, dArr, i11, this.size - i11);
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
            double[] dArr = this.zztd;
            System.arraycopy(dArr, i12, dArr, i11, this.size - i12);
            this.size -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzcj();
        zzaf(i11);
        double[] dArr = this.zztd;
        double d11 = dArr[i11];
        dArr[i11] = doubleValue;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge<Double> zzah(int i11) {
        if (i11 >= this.size) {
            return new zzfh(Arrays.copyOf(this.zztd, i11), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzc(double d11) {
        zzc(this.size, d11);
    }

    private zzfh(double[] dArr, int i11) {
        this.zztd = dArr;
        this.size = i11;
    }

    private final void zzc(int i11, double d11) {
        int i12;
        zzcj();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            double[] dArr = this.zztd;
            if (i12 < dArr.length) {
                System.arraycopy(dArr, i11, dArr, i11 + 1, i12 - i11);
            } else {
                double[] dArr2 = new double[((i12 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i11);
                System.arraycopy(this.zztd, i11, dArr2, i11 + 1, this.size - i11);
                this.zztd = dArr2;
            }
            this.zztd[i11] = d11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzag(i11));
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zzcj();
        zzaf(i11);
        double[] dArr = this.zztd;
        double d11 = dArr[i11];
        int i12 = this.size;
        if (i11 < i12 - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, i12 - i11);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d11);
    }
}