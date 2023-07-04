package l0;

import l0.g1;
import l0.p;

/* loaded from: classes.dex */
public interface k1<V extends p> extends g1<V> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <V extends p> V a(k1<V> k1Var, V initialValue, V targetValue, V initialVelocity) {
            kotlin.jvm.internal.s.g(k1Var, "this");
            kotlin.jvm.internal.s.g(initialValue, "initialValue");
            kotlin.jvm.internal.s.g(targetValue, "targetValue");
            kotlin.jvm.internal.s.g(initialVelocity, "initialVelocity");
            return (V) g1.a.a(k1Var, initialValue, targetValue, initialVelocity);
        }

        public static <V extends p> boolean b(k1<V> k1Var) {
            kotlin.jvm.internal.s.g(k1Var, "this");
            return false;
        }
    }
}