package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class q0 extends l0<Comparable<?>> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final q0 f16128a = new q0();

    private q0() {
    }

    @Override // com.google.common.collect.l0
    public <S extends Comparable<?>> l0<S> i() {
        return l0.c();
    }

    @Override // com.google.common.collect.l0, java.util.Comparator
    /* renamed from: j */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        com.google.common.base.u.o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}