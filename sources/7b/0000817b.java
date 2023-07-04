package l0;

import l0.k1;
import l0.p;

/* loaded from: classes.dex */
public interface j1<V extends p> extends k1<V> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <V extends p> long a(j1<V> j1Var, V initialValue, V targetValue, V initialVelocity) {
            kotlin.jvm.internal.s.g(j1Var, "this");
            kotlin.jvm.internal.s.g(initialValue, "initialValue");
            kotlin.jvm.internal.s.g(targetValue, "targetValue");
            kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
            return (j1Var.c() + j1Var.e()) * 1000000;
        }

        public static <V extends p> V b(j1<V> j1Var, V initialValue, V targetValue, V initialVelocity) {
            kotlin.jvm.internal.s.g(j1Var, "this");
            kotlin.jvm.internal.s.g(initialValue, "initialValue");
            kotlin.jvm.internal.s.g(targetValue, "targetValue");
            kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
            return (V) k1.a.a(j1Var, initialValue, targetValue, initialVelocity);
        }

        public static <V extends p> boolean c(j1<V> j1Var) {
            kotlin.jvm.internal.s.g(j1Var, "this");
            return k1.a.b(j1Var);
        }
    }

    int c();

    int e();
}