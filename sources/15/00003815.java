package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends c<Boolean> implements a0.a, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    private static final g f16265d;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f16266b;

    /* renamed from: c  reason: collision with root package name */
    private int f16267c;

    static {
        g gVar = new g(new boolean[0], 0);
        f16265d = gVar;
        gVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        this(new boolean[10], 0);
    }

    private void e(int i11, boolean z11) {
        int i12;
        b();
        if (i11 >= 0 && i11 <= (i12 = this.f16267c)) {
            boolean[] zArr = this.f16266b;
            if (i12 < zArr.length) {
                System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
            } else {
                boolean[] zArr2 = new boolean[((i12 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i11);
                System.arraycopy(this.f16266b, i11, zArr2, i11 + 1, this.f16267c - i11);
                this.f16266b = zArr2;
            }
            this.f16266b[i11] = z11;
            this.f16267c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i11));
    }

    private void f(int i11) {
        if (i11 < 0 || i11 >= this.f16267c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f16267c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        b();
        a0.a(collection);
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i11 = gVar.f16267c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f16267c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            boolean[] zArr = this.f16266b;
            if (i13 > zArr.length) {
                this.f16266b = Arrays.copyOf(zArr, i13);
            }
            System.arraycopy(gVar.f16266b, 0, this.f16266b, this.f16267c, gVar.f16267c);
            this.f16267c = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addBoolean(boolean z11) {
        b();
        int i11 = this.f16267c;
        boolean[] zArr = this.f16266b;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            this.f16266b = zArr2;
        }
        boolean[] zArr3 = this.f16266b;
        int i12 = this.f16267c;
        this.f16267c = i12 + 1;
        zArr3[i12] = z11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c */
    public void add(int i11, Boolean bool) {
        e(i11, bool.booleanValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f16267c != gVar.f16267c) {
            return false;
        }
        boolean[] zArr = gVar.f16266b;
        for (int i11 = 0; i11 < this.f16267c; i11++) {
            if (this.f16266b[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public boolean getBoolean(int i11) {
        f(i11);
        return this.f16266b[i11];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Boolean get(int i11) {
        return Boolean.valueOf(getBoolean(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f16267c; i12++) {
            i11 = (i11 * 31) + a0.c(this.f16266b[i12]);
        }
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: j */
    public a0.a mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f16267c) {
            return new g(Arrays.copyOf(this.f16266b, i11), this.f16267c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Boolean remove(int i11) {
        int i12;
        b();
        f(i11);
        boolean[] zArr = this.f16266b;
        boolean z11 = zArr[i11];
        if (i11 < this.f16267c - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (i12 - i11) - 1);
        }
        this.f16267c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Boolean set(int i11, Boolean bool) {
        return Boolean.valueOf(setBoolean(i11, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        b();
        if (i12 >= i11) {
            boolean[] zArr = this.f16266b;
            System.arraycopy(zArr, i12, zArr, i11, this.f16267c - i12);
            this.f16267c -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public boolean setBoolean(int i11, boolean z11) {
        b();
        f(i11);
        boolean[] zArr = this.f16266b;
        boolean z12 = zArr[i11];
        zArr[i11] = z11;
        return z12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16267c;
    }

    private g(boolean[] zArr, int i11) {
        this.f16266b = zArr;
        this.f16267c = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i11 = 0; i11 < this.f16267c; i11++) {
            if (obj.equals(Boolean.valueOf(this.f16266b[i11]))) {
                boolean[] zArr = this.f16266b;
                System.arraycopy(zArr, i11 + 1, zArr, i11, (this.f16267c - i11) - 1);
                this.f16267c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}