package d2;

import o1.f;

/* loaded from: classes.dex */
public interface b0 extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(b0 b0Var, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(b0Var, predicate);
        }

        public static <R> R b(b0 b0Var, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(b0Var, r11, operation);
        }

        public static <R> R c(b0 b0Var, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(b0Var, r11, operation);
        }

        public static o1.f d(b0 b0Var, o1.f other) {
            kotlin.jvm.internal.s.g(b0Var, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(b0Var, other);
        }
    }

    a0 Y();
}