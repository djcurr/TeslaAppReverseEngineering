package l2;

import o1.f;

/* loaded from: classes.dex */
public interface m extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(m mVar, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(mVar, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(mVar, predicate);
        }

        public static <R> R b(m mVar, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(mVar, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(mVar, r11, operation);
        }

        public static <R> R c(m mVar, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(mVar, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(mVar, r11, operation);
        }

        public static o1.f d(m mVar, o1.f other) {
            kotlin.jvm.internal.s.g(mVar, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(mVar, other);
        }
    }

    int getId();

    k r0();
}