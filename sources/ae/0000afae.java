package r1;

import o1.f;

/* loaded from: classes.dex */
public interface d extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(d dVar, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(dVar, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(dVar, predicate);
        }

        public static <R> R b(d dVar, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(dVar, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(dVar, r11, operation);
        }

        public static <R> R c(d dVar, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(dVar, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(dVar, r11, operation);
        }

        public static o1.f d(d dVar, o1.f other) {
            kotlin.jvm.internal.s.g(dVar, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(dVar, other);
        }
    }

    void e0(w wVar);
}