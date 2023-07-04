package com.google.common.collect;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t0<E> extends v<E> {

    /* renamed from: c  reason: collision with root package name */
    final transient E f16142c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(E e11) {
        this.f16142c = (E) com.google.common.base.u.o(e11);
    }

    @Override // com.google.common.collect.v, com.google.common.collect.p
    public r<E> b() {
        return r.s(this.f16142c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p
    public int c(Object[] objArr, int i11) {
        objArr[i11] = this.f16142c;
        return i11 + 1;
    }

    @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f16142c.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p
    public boolean h() {
        return false;
    }

    @Override // com.google.common.collect.v, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f16142c.hashCode();
    }

    @Override // com.google.common.collect.v, com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public v0<E> iterator() {
        return x.j(this.f16142c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f16142c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}