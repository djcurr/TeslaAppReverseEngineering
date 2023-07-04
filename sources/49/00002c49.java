package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
final class zzfz extends zzef<Integer> implements zzge<Integer>, zzhr {
    private static final zzfz zzxl;
    private int size;
    private int[] zzxm;

    static {
        zzfz zzfzVar = new zzfz();
        zzxl = zzfzVar;
        zzfzVar.zzci();
    }

    zzfz() {
        this(new int[10], 0);
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

    private final void zzq(int i11, int i12) {
        int i13;
        zzcj();
        if (i11 >= 0 && i11 <= (i13 = this.size)) {
            int[] iArr = this.zzxm;
            if (i13 < iArr.length) {
                System.arraycopy(iArr, i11, iArr, i11 + 1, i13 - i11);
            } else {
                int[] iArr2 = new int[((i13 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                System.arraycopy(this.zzxm, i11, iArr2, i11 + 1, this.size - i11);
                this.zzxm = iArr2;
            }
            this.zzxm[i11] = i12;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzag(i11));
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        zzq(i11, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzfz)) {
            return super.addAll(collection);
        }
        zzfz zzfzVar = (zzfz) collection;
        int i11 = zzfzVar.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            int[] iArr = this.zzxm;
            if (i13 > iArr.length) {
                this.zzxm = Arrays.copyOf(iArr, i13);
            }
            System.arraycopy(zzfzVar.zzxm, 0, this.zzxm, this.size, zzfzVar.size);
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
        if (!(obj instanceof zzfz)) {
            return super.equals(obj);
        }
        zzfz zzfzVar = (zzfz) obj;
        if (this.size != zzfzVar.size) {
            return false;
        }
        int[] iArr = zzfzVar.zzxm;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (this.zzxm[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    public final int getInt(int i11) {
        zzaf(i11);
        return this.zzxm[i11];
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + this.zzxm[i12];
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzcj();
        for (int i11 = 0; i11 < this.size; i11++) {
            if (obj.equals(Integer.valueOf(this.zzxm[i11]))) {
                int[] iArr = this.zzxm;
                System.arraycopy(iArr, i11 + 1, iArr, i11, this.size - i11);
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
            int[] iArr = this.zzxm;
            System.arraycopy(iArr, i12, iArr, i11, this.size - i12);
            this.size -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzcj();
        zzaf(i11);
        int[] iArr = this.zzxm;
        int i12 = iArr[i11];
        iArr[i11] = intValue;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge<Integer> zzah(int i11) {
        if (i11 >= this.size) {
            return new zzfz(Arrays.copyOf(this.zzxm, i11), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzbg(int i11) {
        zzq(this.size, i11);
    }

    private zzfz(int[] iArr, int i11) {
        this.zzxm = iArr;
        this.size = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zzcj();
        zzaf(i11);
        int[] iArr = this.zzxm;
        int i12 = iArr[i11];
        int i13 = this.size;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, i13 - i11);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }
}