package net.time4j;

import java.util.Comparator;
import net.time4j.engine.j0;
import net.time4j.x;

/* loaded from: classes5.dex */
class o0<U extends x> implements net.time4j.engine.c0<U>, Comparator<j0.a<? extends net.time4j.engine.v>> {
    private o0(boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Comparator<j0.a<? extends net.time4j.engine.v>> a() {
        return new o0(false);
    }

    static int b(net.time4j.engine.v vVar, net.time4j.engine.v vVar2) {
        int compare = Double.compare(vVar2.getLength(), vVar.getLength());
        if (compare != 0 || vVar.equals(vVar2)) {
            return compare;
        }
        throw new IllegalArgumentException("Mixing different units of same length not allowed.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0<f> f() {
        return new o0<>(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0<h> g() {
        return new o0<>(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0<x> i() {
        return new o0<>(true);
    }

    @Override // java.util.Comparator
    /* renamed from: c */
    public int compare(j0.a<? extends net.time4j.engine.v> aVar, j0.a<? extends net.time4j.engine.v> aVar2) {
        return b(aVar.b(), aVar2.b());
    }
}