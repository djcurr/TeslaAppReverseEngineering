package c1;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 {
    public static final <T> m1.r<T> a() {
        return new m1.r<>();
    }

    public static final <K, V> m1.t<K, V> b() {
        return new m1.t<>();
    }

    public static final <T> o0<T> c(T t11, m1<T> policy) {
        kotlin.jvm.internal.s.g(policy, "policy");
        return b.a(t11, policy);
    }

    public static /* synthetic */ o0 d(Object obj, m1 m1Var, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            m1Var = n1.o();
        }
        return n1.f(obj, m1Var);
    }

    public static final <T> v1<T> e(T t11, i iVar, int i11) {
        iVar.x(-1519466435);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == i.f8486a.a()) {
            y11 = d(t11, null, 2, null);
            iVar.p(y11);
        }
        iVar.N();
        o0 o0Var = (o0) y11;
        o0Var.setValue(t11);
        iVar.N();
        return o0Var;
    }
}