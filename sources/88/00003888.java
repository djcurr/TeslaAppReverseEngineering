package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class z extends c<Integer> implements a0.g, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    private static final z f16432d;

    /* renamed from: b  reason: collision with root package name */
    private int[] f16433b;

    /* renamed from: c  reason: collision with root package name */
    private int f16434c;

    static {
        z zVar = new z(new int[0], 0);
        f16432d = zVar;
        zVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z() {
        this(new int[10], 0);
    }

    private void e(int i11, int i12) {
        int i13;
        b();
        if (i11 >= 0 && i11 <= (i13 = this.f16434c)) {
            int[] iArr = this.f16433b;
            if (i13 < iArr.length) {
                System.arraycopy(iArr, i11, iArr, i11 + 1, i13 - i11);
            } else {
                int[] iArr2 = new int[((i13 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i11);
                System.arraycopy(this.f16433b, i11, iArr2, i11 + 1, this.f16434c - i11);
                this.f16433b = iArr2;
            }
            this.f16433b[i11] = i12;
            this.f16434c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i11));
    }

    private void f(int i11) {
        if (i11 < 0 || i11 >= this.f16434c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f16434c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        b();
        a0.a(collection);
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i11 = zVar.f16434c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f16434c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            int[] iArr = this.f16433b;
            if (i13 > iArr.length) {
                this.f16433b = Arrays.copyOf(iArr, i13);
            }
            System.arraycopy(zVar.f16433b, 0, this.f16433b, this.f16434c, zVar.f16434c);
            this.f16434c = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addInt(int i11) {
        b();
        int i12 = this.f16434c;
        int[] iArr = this.f16433b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f16433b = iArr2;
        }
        int[] iArr3 = this.f16433b;
        int i13 = this.f16434c;
        this.f16434c = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c */
    public void add(int i11, Integer num) {
        e(i11, num.intValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f16434c != zVar.f16434c) {
            return false;
        }
        int[] iArr = zVar.f16433b;
        for (int i11 = 0; i11 < this.f16434c; i11++) {
            if (this.f16433b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i11) {
        f(i11);
        return this.f16433b[i11];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Integer get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f16434c; i12++) {
            i11 = (i11 * 31) + this.f16433b[i12];
        }
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: j */
    public a0.g mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f16434c) {
            return new z(Arrays.copyOf(this.f16433b, i11), this.f16434c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Integer remove(int i11) {
        int i12;
        b();
        f(i11);
        int[] iArr = this.f16433b;
        int i13 = iArr[i11];
        if (i11 < this.f16434c - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i12 - i11) - 1);
        }
        this.f16434c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Integer set(int i11, Integer num) {
        return Integer.valueOf(setInt(i11, num.intValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        b();
        if (i12 >= i11) {
            int[] iArr = this.f16433b;
            System.arraycopy(iArr, i12, iArr, i11, this.f16434c - i12);
            this.f16434c -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int setInt(int i11, int i12) {
        b();
        f(i11);
        int[] iArr = this.f16433b;
        int i13 = iArr[i11];
        iArr[i11] = i12;
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16434c;
    }

    private z(int[] iArr, int i11) {
        this.f16433b = iArr;
        this.f16434c = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i11 = 0; i11 < this.f16434c; i11++) {
            if (obj.equals(Integer.valueOf(this.f16433b[i11]))) {
                int[] iArr = this.f16433b;
                System.arraycopy(iArr, i11 + 1, iArr, i11, (this.f16434c - i11) - 1);
                this.f16434c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}