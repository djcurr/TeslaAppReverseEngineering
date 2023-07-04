package kotlin.jvm.internal;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c {
    public static final <T> Iterator<T> a(T[] array) {
        s.g(array, "array");
        return new b(array);
    }
}