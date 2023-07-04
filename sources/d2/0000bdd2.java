package wz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class r {
    public static final <T> Collection<T> a(Iterable<? extends T> iterable, Iterable<? extends T> source) {
        List O0;
        HashSet M0;
        HashSet M02;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(source, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if (!(source instanceof Collection) || ((Collection) source).size() >= 2) {
                Collection<T> collection = (Collection) iterable;
                if (b(collection)) {
                    M02 = e0.M0(iterable);
                    return M02;
                }
                return collection;
            }
            return (Collection) iterable;
        } else if (t.f56500a) {
            M0 = e0.M0(iterable);
            return M0;
        } else {
            O0 = e0.O0(iterable);
            return O0;
        }
    }

    private static final <T> boolean b(Collection<? extends T> collection) {
        return t.f56500a && collection.size() > 2 && (collection instanceof ArrayList);
    }
}