package com.google.common.collect;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p0<E> extends v<E> {

    /* renamed from: h  reason: collision with root package name */
    private static final Object[] f16119h;

    /* renamed from: i  reason: collision with root package name */
    static final p0<Object> f16120i;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f16121c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f16122d;

    /* renamed from: e  reason: collision with root package name */
    final transient Object[] f16123e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f16124f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f16125g;

    static {
        Object[] objArr = new Object[0];
        f16119h = objArr;
        f16120i = new p0<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.f16121c = objArr;
        this.f16122d = i11;
        this.f16123e = objArr2;
        this.f16124f = i12;
        this.f16125g = i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p
    public int c(Object[] objArr, int i11) {
        System.arraycopy(this.f16121c, 0, objArr, i11, this.f16125g);
        return i11 + this.f16125g;
    }

    @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f16123e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c11 = o.c(obj);
        while (true) {
            int i11 = c11 & this.f16124f;
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c11 = i11 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p
    public Object[] d() {
        return this.f16121c;
    }

    @Override // com.google.common.collect.p
    int e() {
        return this.f16125g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p
    public int f() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p
    public boolean h() {
        return false;
    }

    @Override // com.google.common.collect.v, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f16122d;
    }

    @Override // com.google.common.collect.v, com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public v0<E> iterator() {
        return b().iterator();
    }

    @Override // com.google.common.collect.v
    r<E> n() {
        return r.k(this.f16121c, this.f16125g);
    }

    @Override // com.google.common.collect.v
    boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f16125g;
    }
}