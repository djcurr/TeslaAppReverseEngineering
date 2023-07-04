package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
final class zzaz extends zzav<Boolean> implements zzcn<Boolean> {
    private static final zzaz zzfg;
    private int size;
    private boolean[] zzfh;

    static {
        zzaz zzazVar = new zzaz();
        zzfg = zzazVar;
        zzazVar.zzv();
    }

    zzaz() {
        this(new boolean[10], 0);
    }

    private zzaz(boolean[] zArr, int i11) {
        this.zzfh = zArr;
        this.size = i11;
    }

    private final void zza(int i11, boolean z11) {
        int i12;
        zzw();
        if (i11 < 0 || i11 > (i12 = this.size)) {
            throw new IndexOutOfBoundsException(zzh(i11));
        }
        boolean[] zArr = this.zzfh;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[((i12 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            System.arraycopy(this.zzfh, i11, zArr2, i11 + 1, this.size - i11);
            this.zzfh = zArr2;
        }
        this.zzfh[i11] = z11;
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
        zza(i11, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzw();
        zzci.checkNotNull(collection);
        if (collection instanceof zzaz) {
            zzaz zzazVar = (zzaz) collection;
            int i11 = zzazVar.size;
            if (i11 == 0) {
                return false;
            }
            int i12 = this.size;
            if (Integer.MAX_VALUE - i12 >= i11) {
                int i13 = i12 + i11;
                boolean[] zArr = this.zzfh;
                if (i13 > zArr.length) {
                    this.zzfh = Arrays.copyOf(zArr, i13);
                }
                System.arraycopy(zzazVar.zzfh, 0, this.zzfh, this.size, zzazVar.size);
                this.size = i13;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    public final void addBoolean(boolean z11) {
        zza(this.size, z11);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaz) {
            zzaz zzazVar = (zzaz) obj;
            if (this.size != zzazVar.size) {
                return false;
            }
            boolean[] zArr = zzazVar.zzfh;
            for (int i11 = 0; i11 < this.size; i11++) {
                if (this.zzfh[i11] != zArr[i11]) {
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
        return Boolean.valueOf(this.zzfh[i11]);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + zzci.zzc(this.zzfh[i12]);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i11) {
        zzw();
        zzg(i11);
        boolean[] zArr = this.zzfh;
        boolean z11 = zArr[i11];
        int i12 = this.size;
        if (i11 < i12 - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, i12 - i11);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i11 = 0; i11 < this.size; i11++) {
            if (obj.equals(Boolean.valueOf(this.zzfh[i11]))) {
                boolean[] zArr = this.zzfh;
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
        zzw();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzfh;
        System.arraycopy(zArr, i12, zArr, i11, this.size - i12);
        this.size -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i11, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzw();
        zzg(i11);
        boolean[] zArr = this.zzfh;
        boolean z11 = zArr[i11];
        zArr[i11] = booleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn<Boolean> zzi(int i11) {
        if (i11 >= this.size) {
            return new zzaz(Arrays.copyOf(this.zzfh, i11), this.size);
        }
        throw new IllegalArgumentException();
    }
}