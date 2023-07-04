package f2;

import o1.f;

/* loaded from: classes.dex */
public interface i0 extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(i0 i0Var, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(i0Var, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(i0Var, predicate);
        }

        public static <R> R b(i0 i0Var, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(i0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(i0Var, r11, operation);
        }

        public static <R> R c(i0 i0Var, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(i0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(i0Var, r11, operation);
        }

        public static o1.f d(i0 i0Var, o1.f other) {
            kotlin.jvm.internal.s.g(i0Var, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(i0Var, other);
        }
    }

    void o(long j11);
}