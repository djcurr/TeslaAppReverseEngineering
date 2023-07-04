package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m extends c<Double> implements a0.b, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    private static final m f16340d;

    /* renamed from: b  reason: collision with root package name */
    private double[] f16341b;

    /* renamed from: c  reason: collision with root package name */
    private int f16342c;

    static {
        m mVar = new m(new double[0], 0);
        f16340d = mVar;
        mVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m() {
        this(new double[10], 0);
    }

    private void e(int i11, double d11) {
        int i12;
        b();
        if (i11 >= 0 && i11 <= (i12 = this.f16342c)) {
            double[] dArr = this.f16341b;
            if (i12 < dArr.length) {
                System.arraycopy(dArr, i11, dArr, i11 + 1, i12 - i11);
            } else {
                double[] dArr2 = new double[((i12 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i11);
                System.arraycopy(this.f16341b, i11, dArr2, i11 + 1, this.f16342c - i11);
                this.f16341b = dArr2;
            }
            this.f16341b[i11] = d11;
            this.f16342c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i11));
    }

    private void f(int i11) {
        if (i11 < 0 || i11 >= this.f16342c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f16342c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        b();
        a0.a(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i11 = mVar.f16342c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f16342c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            double[] dArr = this.f16341b;
            if (i13 > dArr.length) {
                this.f16341b = Arrays.copyOf(dArr, i13);
            }
            System.arraycopy(mVar.f16341b, 0, this.f16341b, this.f16342c, mVar.f16342c);
            this.f16342c = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addDouble(double d11) {
        b();
        int i11 = this.f16342c;
        double[] dArr = this.f16341b;
        if (i11 == dArr.length) {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i11);
            this.f16341b = dArr2;
        }
        double[] dArr3 = this.f16341b;
        int i12 = this.f16342c;
        this.f16342c = i12 + 1;
        dArr3[i12] = d11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c */
    public void add(int i11, Double d11) {
        e(i11, d11.doubleValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d */
    public boolean add(Double d11) {
        addDouble(d11.doubleValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f16342c != mVar.f16342c) {
            return false;
        }
        double[] dArr = mVar.f16341b;
        for (int i11 = 0; i11 < this.f16342c; i11++) {
            if (Double.doubleToLongBits(this.f16341b[i11]) != Double.doubleToLongBits(dArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public double getDouble(int i11) {
        f(i11);
        return this.f16341b[i11];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Double get(int i11) {
        return Double.valueOf(getDouble(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f16342c; i12++) {
            i11 = (i11 * 31) + a0.f(Double.doubleToLongBits(this.f16341b[i12]));
        }
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: j */
    public a0.b mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f16342c) {
            return new m(Arrays.copyOf(this.f16341b, i11), this.f16342c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Double remove(int i11) {
        int i12;
        b();
        f(i11);
        double[] dArr = this.f16341b;
        double d11 = dArr[i11];
        if (i11 < this.f16342c - 1) {
            System.arraycopy(dArr, i11 + 1, dArr, i11, (i12 - i11) - 1);
        }
        this.f16342c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Double set(int i11, Double d11) {
        return Double.valueOf(setDouble(i11, d11.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        b();
        if (i12 >= i11) {
            double[] dArr = this.f16341b;
            System.arraycopy(dArr, i12, dArr, i11, this.f16342c - i12);
            this.f16342c -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public double setDouble(int i11, double d11) {
        b();
        f(i11);
        double[] dArr = this.f16341b;
        double d12 = dArr[i11];
        dArr[i11] = d11;
        return d12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16342c;
    }

    private m(double[] dArr, int i11) {
        this.f16341b = dArr;
        this.f16342c = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i11 = 0; i11 < this.f16342c; i11++) {
            if (obj.equals(Double.valueOf(this.f16341b[i11]))) {
                double[] dArr = this.f16341b;
                System.arraycopy(dArr, i11 + 1, dArr, i11, (this.f16342c - i11) - 1);
                this.f16342c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}