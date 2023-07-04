package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i0 extends l0<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final i0 f16068a = new i0();

    private i0() {
    }

    @Override // com.google.common.collect.l0
    public <S extends Comparable<?>> l0<S> i() {
        return q0.f16128a;
    }

    @Override // com.google.common.collect.l0, java.util.Comparator
    /* renamed from: j */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        com.google.common.base.u.o(comparable);
        com.google.common.base.u.o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}