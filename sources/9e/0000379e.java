package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class n0<E> extends r<E> {

    /* renamed from: e  reason: collision with root package name */
    static final r<Object> f16098e = new n0(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f16099c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f16100d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(Object[] objArr, int i11) {
        this.f16099c = objArr;
        this.f16100d = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.r, com.google.common.collect.p
    public int c(Object[] objArr, int i11) {
        System.arraycopy(this.f16099c, 0, objArr, i11, this.f16100d);
        return i11 + this.f16100d;
    }

    @Override // com.google.common.collect.p
    Object[] d() {
        return this.f16099c;
    }

    @Override // com.google.common.collect.p
    int e() {
        return this.f16100d;
    }

    @Override // com.google.common.collect.p
    int f() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i11) {
        com.google.common.base.u.m(i11, this.f16100d);
        E e11 = (E) this.f16099c[i11];
        Objects.requireNonNull(e11);
        return e11;
    }

    @Override // com.google.common.collect.p
    boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16100d;
    }
}