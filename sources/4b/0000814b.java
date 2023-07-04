package l0;

import l0.p;

/* loaded from: classes.dex */
public interface d<T, V extends p> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T, V extends p> boolean a(d<T, V> dVar, long j11) {
            kotlin.jvm.internal.s.g(dVar, "this");
            return j11 >= dVar.d();
        }
    }

    boolean a();

    V b(long j11);

    boolean c(long j11);

    long d();

    d1<T, V> e();

    T f(long j11);

    T g();
}