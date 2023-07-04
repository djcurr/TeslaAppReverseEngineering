package f2;

import o1.f;

/* loaded from: classes.dex */
public interface l0 extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(l0 l0Var, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(l0Var, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(l0Var, predicate);
        }

        public static <R> R b(l0 l0Var, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(l0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(l0Var, r11, operation);
        }

        public static <R> R c(l0 l0Var, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(l0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(l0Var, r11, operation);
        }

        public static o1.f d(l0 l0Var, o1.f other) {
            kotlin.jvm.internal.s.g(l0Var, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(l0Var, other);
        }
    }

    Object J(x2.d dVar, Object obj);
}