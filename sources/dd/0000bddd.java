package wz;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class w0 {
    public static <E> Set<E> a(Set<E> builder) {
        kotlin.jvm.internal.s.g(builder, "builder");
        return ((xz.h) builder).c();
    }

    public static <E> Set<E> b() {
        return new xz.h();
    }

    public static <T> Set<T> c(T t11) {
        Set<T> singleton = Collections.singleton(t11);
        kotlin.jvm.internal.s.f(singleton, "singleton(element)");
        return singleton;
    }
}