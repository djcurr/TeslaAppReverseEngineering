package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r0<T> extends l0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final l0<? super T> f16134a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(l0<? super T> l0Var) {
        this.f16134a = (l0) com.google.common.base.u.o(l0Var);
    }

    @Override // com.google.common.collect.l0, java.util.Comparator
    public int compare(T t11, T t12) {
        return this.f16134a.compare(t12, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            return this.f16134a.equals(((r0) obj).f16134a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f16134a.hashCode();
    }

    @Override // com.google.common.collect.l0
    public <S extends T> l0<S> i() {
        return (l0<? super T>) this.f16134a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f16134a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}