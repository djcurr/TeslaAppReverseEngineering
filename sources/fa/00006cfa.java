package f2;

import o1.f;

/* loaded from: classes.dex */
public interface p0 extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(p0 p0Var, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(p0Var, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(p0Var, predicate);
        }

        public static <R> R b(p0 p0Var, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(p0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(p0Var, r11, operation);
        }

        public static <R> R c(p0 p0Var, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(p0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(p0Var, r11, operation);
        }

        public static o1.f d(p0 p0Var, o1.f other) {
            kotlin.jvm.internal.s.g(p0Var, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(p0Var, other);
        }
    }

    void D(o0 o0Var);
}