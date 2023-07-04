package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g<F, T> extends l0<F> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final com.google.common.base.l<F, ? extends T> f16065a;

    /* renamed from: b  reason: collision with root package name */
    final l0<T> f16066b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.google.common.base.l<F, ? extends T> lVar, l0<T> l0Var) {
        this.f16065a = (com.google.common.base.l) com.google.common.base.u.o(lVar);
        this.f16066b = (l0) com.google.common.base.u.o(l0Var);
    }

    @Override // com.google.common.collect.l0, java.util.Comparator
    public int compare(F f11, F f12) {
        return this.f16066b.compare(this.f16065a.apply(f11), this.f16065a.apply(f12));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f16065a.equals(gVar.f16065a) && this.f16066b.equals(gVar.f16066b);
        }
        return false;
    }

    public int hashCode() {
        return com.google.common.base.q.b(this.f16065a, this.f16066b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f16066b);
        String valueOf2 = String.valueOf(this.f16065a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}