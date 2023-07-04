package f2;

import o1.f;

/* loaded from: classes.dex */
public interface e0 extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(e0 e0Var, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(e0Var, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(e0Var, predicate);
        }

        public static <R> R b(e0 e0Var, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(e0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(e0Var, r11, operation);
        }

        public static <R> R c(e0 e0Var, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(e0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(e0Var, r11, operation);
        }

        public static o1.f d(e0 e0Var, o1.f other) {
            kotlin.jvm.internal.s.g(e0Var, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(e0Var, other);
        }
    }

    void T(o oVar);
}