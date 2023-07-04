package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l<T> extends l0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Comparator<T> f16092a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Comparator<T> comparator) {
        this.f16092a = (Comparator) com.google.common.base.u.o(comparator);
    }

    @Override // com.google.common.collect.l0, java.util.Comparator
    public int compare(T t11, T t12) {
        return this.f16092a.compare(t11, t12);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return this.f16092a.equals(((l) obj).f16092a);
        }
        return false;
    }

    public int hashCode() {
        return this.f16092a.hashCode();
    }

    public String toString() {
        return this.f16092a.toString();
    }
}