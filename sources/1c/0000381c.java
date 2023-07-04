package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h0 extends c<Long> implements a0.h, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    private static final h0 f16271d;

    /* renamed from: b  reason: collision with root package name */
    private long[] f16272b;

    /* renamed from: c  reason: collision with root package name */
    private int f16273c;

    static {
        h0 h0Var = new h0(new long[0], 0);
        f16271d = h0Var;
        h0Var.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0() {
        this(new long[10], 0);
    }

    private void e(int i11, long j11) {
        int i12;
        b();
        if (i11 >= 0 && i11 <= (i12 = this.f16273c)) {
            long[] jArr = this.f16272b;
            if (i12 < jArr.length) {
                System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
            } else {
                long[] jArr2 = new long[((i12 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i11);
                System.arraycopy(this.f16272b, i11, jArr2, i11 + 1, this.f16273c - i11);
                this.f16272b = jArr2;
            }
            this.f16272b[i11] = j11;
            this.f16273c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i11));
    }

    private void f(int i11) {
        if (i11 < 0 || i11 >= this.f16273c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f16273c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        b();
        a0.a(collection);
        if (!(collection instanceof h0)) {
            return super.addAll(collection);
        }
        h0 h0Var = (h0) collection;
        int i11 = h0Var.f16273c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f16273c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            long[] jArr = this.f16272b;
            if (i13 > jArr.length) {
                this.f16272b = Arrays.copyOf(jArr, i13);
            }
            System.arraycopy(h0Var.f16272b, 0, this.f16272b, this.f16273c, h0Var.f16273c);
            this.f16273c = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addLong(long j11) {
        b();
        int i11 = this.f16273c;
        long[] jArr = this.f16272b;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.f16272b = jArr2;
        }
        long[] jArr3 = this.f16272b;
        int i12 = this.f16273c;
        this.f16273c = i12 + 1;
        jArr3[i12] = j11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c */
    public void add(int i11, Long l11) {
        e(i11, l11.longValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d */
    public boolean add(Long l11) {
        addLong(l11.longValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        if (this.f16273c != h0Var.f16273c) {
            return false;
        }
        long[] jArr = h0Var.f16272b;
        for (int i11 = 0; i11 < this.f16273c; i11++) {
            if (this.f16272b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public long getLong(int i11) {
        f(i11);
        return this.f16272b[i11];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Long get(int i11) {
        return Long.valueOf(getLong(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f16273c; i12++) {
            i11 = (i11 * 31) + a0.f(this.f16272b[i12]);
        }
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: j */
    public a0.h mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f16273c) {
            return new h0(Arrays.copyOf(this.f16272b, i11), this.f16273c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Long remove(int i11) {
        int i12;
        b();
        f(i11);
        long[] jArr = this.f16272b;
        long j11 = jArr[i11];
        if (i11 < this.f16273c - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.f16273c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Long set(int i11, Long l11) {
        return Long.valueOf(setLong(i11, l11.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        b();
        if (i12 >= i11) {
            long[] jArr = this.f16272b;
            System.arraycopy(jArr, i12, jArr, i11, this.f16273c - i12);
            this.f16273c -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public long setLong(int i11, long j11) {
        b();
        f(i11);
        long[] jArr = this.f16272b;
        long j12 = jArr[i11];
        jArr[i11] = j11;
        return j12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16273c;
    }

    private h0(long[] jArr, int i11) {
        this.f16272b = jArr;
        this.f16273c = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i11 = 0; i11 < this.f16273c; i11++) {
            if (obj.equals(Long.valueOf(this.f16272b[i11]))) {
                long[] jArr = this.f16272b;
                System.arraycopy(jArr, i11 + 1, jArr, i11, (this.f16273c - i11) - 1);
                this.f16273c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}