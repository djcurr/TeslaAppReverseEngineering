package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
final class zzem extends zzef<Boolean> implements zzge<Boolean>, zzhr {
    private static final zzem zzrv;
    private int size;
    private boolean[] zzrw;

    static {
        zzem zzemVar = new zzem();
        zzrv = zzemVar;
        zzemVar.zzci();
    }

    zzem() {
        this(new boolean[10], 0);
    }

    private final void zza(int i11, boolean z11) {
        int i12;
        zzcj();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            boolean[] zArr = this.zzrw;
            if (i12 < zArr.length) {
                System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
            } else {
                boolean[] zArr2 = new boolean[((i12 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i11);
                System.arraycopy(this.zzrw, i11, zArr2, i11 + 1, this.size - i11);
                this.zzrw = zArr2;
            }
            this.zzrw[i11] = z11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzag(i11));
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
        zza(i11, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzem)) {
            return super.addAll(collection);
        }
        zzem zzemVar = (zzem) collection;
        int i11 = zzemVar.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            boolean[] zArr = this.zzrw;
            if (i13 > zArr.length) {
                this.zzrw = Arrays.copyOf(zArr, i13);
            }
            System.arraycopy(zzemVar.zzrw, 0, this.zzrw, this.size, zzemVar.size);
            this.size = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void addBoolean(boolean z11) {
        zza(this.size, z11);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzem)) {
            return super.equals(obj);
        }
        zzem zzemVar = (zzem) obj;
        if (this.size != zzemVar.size) {
            return false;
        }
        boolean[] zArr = zzemVar.zzrw;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (this.zzrw[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzaf(i11);
        return Boolean.valueOf(this.zzrw[i11]);
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + zzga.zzj(this.zzrw[i12]);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzcj();
        for (int i11 = 0; i11 < this.size; i11++) {
            if (obj.equals(Boolean.valueOf(this.zzrw[i11]))) {
                boolean[] zArr = this.zzrw;
                System.arraycopy(zArr, i11 + 1, zArr, i11, this.size - i11);
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
            boolean[] zArr = this.zzrw;
            System.arraycopy(zArr, i12, zArr, i11, this.size - i12);
            this.size -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzcj();
        zzaf(i11);
        boolean[] zArr = this.zzrw;
        boolean z11 = zArr[i11];
        zArr[i11] = booleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge<Boolean> zzah(int i11) {
        if (i11 >= this.size) {
            return new zzem(Arrays.copyOf(this.zzrw, i11), this.size);
        }
        throw new IllegalArgumentException();
    }

    private zzem(boolean[] zArr, int i11) {
        this.zzrw = zArr;
        this.size = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zzcj();
        zzaf(i11);
        boolean[] zArr = this.zzrw;
        boolean z11 = zArr[i11];
        int i12 = this.size;
        if (i11 < i12 - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, i12 - i11);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }
}