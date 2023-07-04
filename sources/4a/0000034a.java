package androidx.camera.core.impl;

import java.util.Set;

/* loaded from: classes.dex */
public interface d0 {

    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new androidx.camera.core.impl.b(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(a<?> aVar);
    }

    /* loaded from: classes.dex */
    public enum c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    static d0 A(d0 d0Var, d0 d0Var2) {
        x0 I;
        if (d0Var == null && d0Var2 == null) {
            return b1.F();
        }
        if (d0Var2 != null) {
            I = x0.J(d0Var2);
        } else {
            I = x0.I();
        }
        if (d0Var != null) {
            for (a<?> aVar : d0Var.e()) {
                I.n(aVar, d0Var.h(aVar), d0Var.a(aVar));
            }
        }
        return b1.G(I);
    }

    static boolean u(c cVar, c cVar2) {
        c cVar3 = c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        c cVar4 = c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    <ValueT> ValueT a(a<ValueT> aVar);

    boolean b(a<?> aVar);

    void c(String str, b bVar);

    <ValueT> ValueT d(a<ValueT> aVar, c cVar);

    Set<a<?>> e();

    Set<c> f(a<?> aVar);

    <ValueT> ValueT g(a<ValueT> aVar, ValueT valuet);

    c h(a<?> aVar);
}