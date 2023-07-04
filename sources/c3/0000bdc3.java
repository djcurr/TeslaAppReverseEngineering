package wz;

import java.lang.reflect.Array;
import java.util.Objects;

/* loaded from: classes5.dex */
class m {
    public static final <T> T[] a(T[] reference, int i11) {
        kotlin.jvm.internal.s.g(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i11);
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    public static final void b(int i11, int i12) {
        if (i11 <= i12) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is greater than size (" + i12 + ").");
    }
}