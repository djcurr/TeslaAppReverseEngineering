package f2;

import o1.f;

/* loaded from: classes.dex */
public interface v extends f.c {

    /* loaded from: classes.dex */
    public static final class a {
        public static boolean a(v vVar, h00.l<? super f.c, Boolean> predicate) {
            kotlin.jvm.internal.s.g(vVar, "this");
            kotlin.jvm.internal.s.g(predicate, "predicate");
            return f.c.a.a(vVar, predicate);
        }

        public static <R> R b(v vVar, R r11, h00.p<? super R, ? super f.c, ? extends R> operation) {
            kotlin.jvm.internal.s.g(vVar, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.b(vVar, r11, operation);
        }

        public static <R> R c(v vVar, R r11, h00.p<? super f.c, ? super R, ? extends R> operation) {
            kotlin.jvm.internal.s.g(vVar, "this");
            kotlin.jvm.internal.s.g(operation, "operation");
            return (R) f.c.a.c(vVar, r11, operation);
        }

        public static int d(v vVar, k receiver, j measurable, int i11) {
            kotlin.jvm.internal.s.g(vVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(measurable, "measurable");
            return d0.f25569a.a(vVar, receiver, measurable, i11);
        }

        public static int e(v vVar, k receiver, j measurable, int i11) {
            kotlin.jvm.internal.s.g(vVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(measurable, "measurable");
            return d0.f25569a.b(vVar, receiver, measurable, i11);
        }

        public static int f(v vVar, k receiver, j measurable, int i11) {
            kotlin.jvm.internal.s.g(vVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(measurable, "measurable");
            return d0.f25569a.c(vVar, receiver, measurable, i11);
        }

        public static int g(v vVar, k receiver, j measurable, int i11) {
            kotlin.jvm.internal.s.g(vVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(measurable, "measurable");
            return d0.f25569a.d(vVar, receiver, measurable, i11);
        }

        public static o1.f h(v vVar, o1.f other) {
            kotlin.jvm.internal.s.g(vVar, "this");
            kotlin.jvm.internal.s.g(other, "other");
            return f.c.a.d(vVar, other);
        }
    }

    int L(k kVar, j jVar, int i11);

    int S(k kVar, j jVar, int i11);

    a0 Z(b0 b0Var, y yVar, long j11);

    int h0(k kVar, j jVar, int i11);

    int t(k kVar, j jVar, int i11);
}