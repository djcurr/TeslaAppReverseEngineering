package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
final class zzgt extends zzef<Long> implements zzge<Long>, zzhr {
    private static final zzgt zzyq;
    private int size;
    private long[] zzyr;

    static {
        zzgt zzgtVar = new zzgt();
        zzyq = zzgtVar;
        zzgtVar.zzci();
    }

    zzgt() {
        this(new long[10], 0);
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

    private final void zzk(int i11, long j11) {
        int i12;
        zzcj();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            long[] jArr = this.zzyr;
            if (i12 < jArr.length) {
                System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
            } else {
                long[] jArr2 = new long[((i12 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i11);
                System.arraycopy(this.zzyr, i11, jArr2, i11 + 1, this.size - i11);
                this.zzyr = jArr2;
            }
            this.zzyr[i11] = j11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzag(i11));
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        zzk(i11, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzcj();
        zzga.checkNotNull(collection);
        if (!(collection instanceof zzgt)) {
            return super.addAll(collection);
        }
        zzgt zzgtVar = (zzgt) collection;
        int i11 = zzgtVar.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            long[] jArr = this.zzyr;
            if (i13 > jArr.length) {
                this.zzyr = Arrays.copyOf(jArr, i13);
            }
            System.arraycopy(zzgtVar.zzyr, 0, this.zzyr, this.size, zzgtVar.size);
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
        if (!(obj instanceof zzgt)) {
            return super.equals(obj);
        }
        zzgt zzgtVar = (zzgt) obj;
        if (this.size != zzgtVar.size) {
            return false;
        }
        long[] jArr = zzgtVar.zzyr;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (this.zzyr[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        return Long.valueOf(getLong(i11));
    }

    public final long getLong(int i11) {
        zzaf(i11);
        return this.zzyr[i11];
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + zzga.zzo(this.zzyr[i12]);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzcj();
        for (int i11 = 0; i11 < this.size; i11++) {
            if (obj.equals(Long.valueOf(this.zzyr[i11]))) {
                long[] jArr = this.zzyr;
                System.arraycopy(jArr, i11 + 1, jArr, i11, this.size - i11);
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
            long[] jArr = this.zzyr;
            System.arraycopy(jArr, i12, jArr, i11, this.size - i12);
            this.size -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzcj();
        zzaf(i11);
        long[] jArr = this.zzyr;
        long j11 = jArr[i11];
        jArr[i11] = longValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzge
    public final /* synthetic */ zzge<Long> zzah(int i11) {
        if (i11 >= this.size) {
            return new zzgt(Arrays.copyOf(this.zzyr, i11), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final void zzp(long j11) {
        zzk(this.size, j11);
    }

    private zzgt(long[] jArr, int i11) {
        this.zzyr = jArr;
        this.size = i11;
    }

    @Override // com.google.android.gms.internal.vision.zzef, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zzcj();
        zzaf(i11);
        long[] jArr = this.zzyr;
        long j11 = jArr[i11];
        int i12 = this.size;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, i12 - i11);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }
}