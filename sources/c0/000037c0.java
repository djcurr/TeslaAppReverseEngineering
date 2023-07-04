package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class w {
    private static <E> Collection<E> a(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return z.g(iterable.iterator());
    }

    public static <T> T b(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return (T) c(list);
            }
            throw new NoSuchElementException();
        }
        return (T) x.g(iterable.iterator());
    }

    private static <T> T c(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] d(Iterable<?> iterable) {
        return a(iterable).toArray();
    }

    public static String e(Iterable<?> iterable) {
        return x.k(iterable.iterator());
    }
}