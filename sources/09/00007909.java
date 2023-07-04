package io.sentry.android.core;

import io.sentry.f3;
import io.sentry.g3;

/* loaded from: classes5.dex */
public final class i0 {
    public boolean a(String str, io.sentry.d0 d0Var) {
        return c(str, d0Var) != null;
    }

    public boolean b(String str, g3 g3Var) {
        return a(str, g3Var != null ? g3Var.getLogger() : null);
    }

    public Class<?> c(String str, io.sentry.d0 d0Var) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            if (d0Var != null) {
                f3 f3Var = f3.DEBUG;
                d0Var.b(f3Var, "Class not available:" + str, e11);
                return null;
            }
            return null;
        } catch (UnsatisfiedLinkError e12) {
            if (d0Var != null) {
                f3 f3Var2 = f3.ERROR;
                d0Var.b(f3Var2, "Failed to load (UnsatisfiedLinkError) " + str, e12);
                return null;
            }
            return null;
        } catch (Throwable th2) {
            if (d0Var != null) {
                f3 f3Var3 = f3.ERROR;
                d0Var.b(f3Var3, "Failed to initialize " + str, th2);
                return null;
            }
            return null;
        }
    }
}