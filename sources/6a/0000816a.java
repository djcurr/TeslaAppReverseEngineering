package l0;

import l0.p;

/* loaded from: classes.dex */
public interface g1<V extends p> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <V extends p> V a(g1<V> g1Var, V initialValue, V targetValue, V initialVelocity) {
            kotlin.jvm.internal.s.g(g1Var, "this");
            kotlin.jvm.internal.s.g(initialValue, "initialValue");
            kotlin.jvm.internal.s.g(targetValue, "targetValue");
            kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
            return g1Var.g(g1Var.f(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
        }
    }

    boolean a();

    V b(long j11, V v11, V v12, V v13);

    V d(V v11, V v12, V v13);

    long f(V v11, V v12, V v13);

    V g(long j11, V v11, V v12, V v13);
}