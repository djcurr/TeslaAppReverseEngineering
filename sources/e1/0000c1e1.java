package y5;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public interface b<T, V> {

    /* loaded from: classes.dex */
    public static final class a {
        public static <T, V> boolean a(b<T, V> bVar, T data) {
            s.g(data, "data");
            return true;
        }
    }

    boolean a(T t11);

    V b(T t11);
}