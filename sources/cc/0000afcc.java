package r1;

import o1.f;

/* loaded from: classes.dex */
public interface t extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(t tVar, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(tVar, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(tVar, predicate);
        }

        public static <R> R b(t tVar, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(tVar, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(tVar, r11, operation);
        }

        public static <R> R c(t tVar, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(tVar, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(tVar, r11, operation);
        }

        public static o1.f d(t tVar, o1.f other) {
            kotlin.jvm.internal.s.g(tVar, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(tVar, other);
        }
    }

    s v();
}