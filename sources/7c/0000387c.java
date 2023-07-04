package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w extends c<Float> implements a0.f, RandomAccess, z0 {

    /* renamed from: d  reason: collision with root package name */
    private static final w f16415d;

    /* renamed from: b  reason: collision with root package name */
    private float[] f16416b;

    /* renamed from: c  reason: collision with root package name */
    private int f16417c;

    static {
        w wVar = new w(new float[0], 0);
        f16415d = wVar;
        wVar.makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w() {
        this(new float[10], 0);
    }

    private void e(int i11, float f11) {
        int i12;
        b();
        if (i11 >= 0 && i11 <= (i12 = this.f16417c)) {
            float[] fArr = this.f16416b;
            if (i12 < fArr.length) {
                System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
            } else {
                float[] fArr2 = new float[((i12 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i11);
                System.arraycopy(this.f16416b, i11, fArr2, i11 + 1, this.f16417c - i11);
                this.f16416b = fArr2;
            }
            this.f16416b[i11] = f11;
            this.f16417c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i11));
    }

    private void f(int i11) {
        if (i11 < 0 || i11 >= this.f16417c) {
            throw new IndexOutOfBoundsException(i(i11));
        }
    }

    private String i(int i11) {
        return "Index:" + i11 + ", Size:" + this.f16417c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        b();
        a0.a(collection);
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i11 = wVar.f16417c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f16417c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            float[] fArr = this.f16416b;
            if (i13 > fArr.length) {
                this.f16416b = Arrays.copyOf(fArr, i13);
            }
            System.arraycopy(wVar.f16416b, 0, this.f16416b, this.f16417c, wVar.f16417c);
            this.f16417c = i13;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addFloat(float f11) {
        b();
        int i11 = this.f16417c;
        float[] fArr = this.f16416b;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.f16416b = fArr2;
        }
        float[] fArr3 = this.f16416b;
        int i12 = this.f16417c;
        this.f16417c = i12 + 1;
        fArr3[i12] = f11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c */
    public void add(int i11, Float f11) {
        e(i11, f11.floatValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: d */
    public boolean add(Float f11) {
        addFloat(f11.floatValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f16417c != wVar.f16417c) {
            return false;
        }
        float[] fArr = wVar.f16416b;
        for (int i11 = 0; i11 < this.f16417c; i11++) {
            if (Float.floatToIntBits(this.f16416b[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public float getFloat(int i11) {
        f(i11);
        return this.f16416b[i11];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Float get(int i11) {
        return Float.valueOf(getFloat(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f16417c; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.f16416b[i12]);
        }
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: j */
    public a0.f mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f16417c) {
            return new w(Arrays.copyOf(this.f16416b, i11), this.f16417c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Float remove(int i11) {
        int i12;
        b();
        f(i11);
        float[] fArr = this.f16416b;
        float f11 = fArr[i11];
        if (i11 < this.f16417c - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (i12 - i11) - 1);
        }
        this.f16417c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m */
    public Float set(int i11, Float f11) {
        return Float.valueOf(setFloat(i11, f11.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        b();
        if (i12 >= i11) {
            float[] fArr = this.f16416b;
            System.arraycopy(fArr, i12, fArr, i11, this.f16417c - i12);
            this.f16417c -= i12 - i11;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public float setFloat(int i11, float f11) {
        b();
        f(i11);
        float[] fArr = this.f16416b;
        float f12 = fArr[i11];
        fArr[i11] = f11;
        return f12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16417c;
    }

    private w(float[] fArr, int i11) {
        this.f16416b = fArr;
        this.f16417c = i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        for (int i11 = 0; i11 < this.f16417c; i11++) {
            if (obj.equals(Float.valueOf(this.f16416b[i11]))) {
                float[] fArr = this.f16416b;
                System.arraycopy(fArr, i11 + 1, fArr, i11, (this.f16417c - i11) - 1);
                this.f16417c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}