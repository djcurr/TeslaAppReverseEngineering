package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g {
    private static final void a(int i11, int i12) {
        if (i12 <= i11) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i11 + ", got " + i12 + ". Please update the Kotlin standard library.").toString());
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        String str;
        s.g(aVar, "<this>");
        f b11 = b(aVar);
        if (b11 == null) {
            return null;
        }
        a(1, b11.v());
        int c11 = c(aVar);
        int i11 = c11 < 0 ? -1 : b11.l()[c11];
        String b12 = i.f34888a.b(aVar);
        if (b12 == null) {
            str = b11.c();
        } else {
            str = b12 + '/' + b11.c();
        }
        return new StackTraceElement(str, b11.m(), b11.f(), i11);
    }
}