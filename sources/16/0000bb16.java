package w0;

import java.util.List;
import r2.d;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55065a;

    static {
        String z11;
        z11 = kotlin.text.v.z("H", 10);
        f55065a = z11;
    }

    public static final long a(n2.a0 style, x2.d density, d.a resourceLoader, String text, int i11) {
        List i12;
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        kotlin.jvm.internal.s.g(text, "text");
        i12 = wz.w.i();
        n2.h c11 = n2.m.c(text, style, i12, null, i11, false, Float.POSITIVE_INFINITY, density, resourceLoader, 8, null);
        return x2.p.a(d(c11.a()), d(c11.getHeight()));
    }

    public static /* synthetic */ long b(n2.a0 a0Var, x2.d dVar, d.a aVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str = f55065a;
        }
        if ((i12 & 16) != 0) {
            i11 = 1;
        }
        return a(a0Var, dVar, aVar, str, i11);
    }

    public static final String c() {
        return f55065a;
    }

    private static final int d(float f11) {
        int c11;
        c11 = j00.c.c((float) Math.ceil(f11));
        return c11;
    }
}