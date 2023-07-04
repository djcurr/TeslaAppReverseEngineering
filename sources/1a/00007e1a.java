package kl;

import java.security.GeneralSecurityException;
import ol.j0;

/* loaded from: classes3.dex */
public final class b {
    static {
        new a().c();
        j0.D();
        j0.D();
        try {
            a();
        } catch (GeneralSecurityException e11) {
            throw new ExceptionInInitializerError(e11);
        }
    }

    @Deprecated
    public static void a() {
        b();
    }

    public static void b() {
        a.n(true);
        c.e();
    }
}