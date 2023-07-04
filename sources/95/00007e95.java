package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i {
    public static final g a(g first, g second) {
        s.g(first, "first");
        s.g(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new k(first, second);
    }
}