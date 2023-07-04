package rz;

import io.sentry.d0;
import io.sentry.f3;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class i {
    public static void a(Class<?> cls, Object obj, d0 d0Var) {
        f3 f3Var = f3.DEBUG;
        Object[] objArr = new Object[2];
        objArr[0] = obj != null ? obj.getClass().getCanonicalName() : "Hint";
        objArr[1] = cls.getCanonicalName();
        d0Var.c(f3Var, "%s is not %s", objArr);
    }
}