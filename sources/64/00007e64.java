package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes5.dex */
public class m0 {

    /* renamed from: a */
    private static final n0 f34917a;

    /* renamed from: b */
    private static final n00.d[] f34918b;

    static {
        n0 n0Var = null;
        try {
            n0Var = (n0) q00.e0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (n0Var == null) {
            n0Var = new n0();
        }
        f34917a = n0Var;
        f34918b = new n00.d[0];
    }

    public static n00.h a(o oVar) {
        return f34917a.a(oVar);
    }

    public static n00.d b(Class cls) {
        return f34917a.b(cls);
    }

    public static n00.g c(Class cls) {
        return f34917a.c(cls, "");
    }

    public static n00.g d(Class cls, String str) {
        return f34917a.c(cls, str);
    }

    public static n00.j e(w wVar) {
        return f34917a.d(wVar);
    }

    public static n00.k f(y yVar) {
        return f34917a.e(yVar);
    }

    public static n00.p g(Class cls) {
        return f34917a.j(b(cls), Collections.emptyList(), true);
    }

    public static n00.p h(Class cls, n00.r rVar, n00.r rVar2) {
        return f34917a.j(b(cls), Arrays.asList(rVar, rVar2), true);
    }

    public static n00.n i(c0 c0Var) {
        return f34917a.f(c0Var);
    }

    public static n00.o j(e0 e0Var) {
        return f34917a.g(e0Var);
    }

    public static String k(n nVar) {
        return f34917a.h(nVar);
    }

    public static String l(u uVar) {
        return f34917a.i(uVar);
    }

    public static n00.p m(Class cls) {
        return f34917a.j(b(cls), Collections.emptyList(), false);
    }

    public static n00.p n(Class cls, n00.r rVar) {
        return f34917a.j(b(cls), Collections.singletonList(rVar), false);
    }

    public static n00.p o(Class cls, n00.r rVar, n00.r rVar2) {
        return f34917a.j(b(cls), Arrays.asList(rVar, rVar2), false);
    }
}