package c1;

import zz.g;

/* loaded from: classes.dex */
public interface m0 extends g.b {

    /* renamed from: v  reason: collision with root package name */
    public static final b f8617v = b.f8618a;

    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(m0 m0Var, R r11, h00.p<? super R, ? super g.b, ? extends R> operation) {
            kotlin.jvm.internal.s.g(m0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) g.b.a.a(m0Var, r11, operation);
        }

        public static <E extends g.b> E b(m0 m0Var, g.c<E> key) {
            kotlin.jvm.internal.s.g(m0Var, "this");
            kotlin.jvm.internal.s.g(key, "key");
            return (E) g.b.a.b(m0Var, key);
        }

        public static g.c<?> c(m0 m0Var) {
            kotlin.jvm.internal.s.g(m0Var, "this");
            return m0.f8617v;
        }

        public static zz.g d(m0 m0Var, g.c<?> key) {
            kotlin.jvm.internal.s.g(m0Var, "this");
            kotlin.jvm.internal.s.g(key, "key");
            return g.b.a.c(m0Var, key);
        }

        public static zz.g e(m0 m0Var, zz.g context) {
            kotlin.jvm.internal.s.g(m0Var, "this");
            kotlin.jvm.internal.s.g(context, "context");
            return g.b.a.d(m0Var, context);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<m0> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f8618a = new b();

        private b() {
        }
    }

    <R> Object e0(h00.l<? super Long, ? extends R> lVar, zz.d<? super R> dVar);
}