package n00;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(d<T> dVar, Object obj) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        if (dVar.m(obj)) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.n());
    }
}