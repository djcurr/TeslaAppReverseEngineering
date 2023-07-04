package wz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class v {
    public static <E> List<E> a(List<E> builder) {
        kotlin.jvm.internal.s.g(builder, "builder");
        return ((xz.b) builder).k();
    }

    public static final <T> Object[] b(T[] tArr, boolean z11) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (z11 && kotlin.jvm.internal.s.c(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <E> List<E> c() {
        return new xz.b();
    }

    public static <T> List<T> d(T t11) {
        List<T> singletonList = Collections.singletonList(t11);
        kotlin.jvm.internal.s.f(singletonList, "singletonList(element)");
        return singletonList;
    }
}