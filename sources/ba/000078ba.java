package io.realm;

/* loaded from: classes5.dex */
public abstract class n0 implements l0 {
    public static <E extends l0> boolean h(E e11) {
        if (e11 instanceof io.realm.internal.m) {
            return ((io.realm.internal.m) e11).d().c().a0();
        }
        return false;
    }

    public static <E extends l0> boolean i(E e11) {
        return e11 instanceof io.realm.internal.m;
    }

    public static <E extends l0> boolean j(E e11) {
        if (!(e11 instanceof io.realm.internal.m)) {
            return e11 != null;
        }
        io.realm.internal.o d11 = ((io.realm.internal.m) e11).d().d();
        return d11 != null && d11.isValid();
    }
}