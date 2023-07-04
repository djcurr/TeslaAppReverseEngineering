package s20;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c {
    public static final boolean a(Throwable th2) {
        s.g(th2, "<this>");
        Class<?> cls = th2.getClass();
        while (!s.c(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable e11) {
        s.g(e11, "e");
        throw e11;
    }
}