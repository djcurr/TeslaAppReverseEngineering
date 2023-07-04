package ak;

import android.os.Trace;

/* loaded from: classes3.dex */
public final class h0 {
    public static void a(String str) {
        if (k0.f477a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (k0.f477a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}