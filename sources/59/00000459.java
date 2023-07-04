package androidx.compose.ui.platform;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b1 {
    public static final Object a(Object obj) {
        kotlin.jvm.internal.s.g(obj, "<this>");
        return obj.getClass();
    }

    public static final String b(Object obj, String str) {
        kotlin.jvm.internal.s.g(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        kotlin.jvm.internal.q0 q0Var = kotlin.jvm.internal.q0.f34921a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.s.f(format, "format(format, *args)");
        sb2.append(format);
        return sb2.toString();
    }
}