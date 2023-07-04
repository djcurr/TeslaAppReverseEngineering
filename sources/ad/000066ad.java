package e10;

import java.util.List;

/* loaded from: classes5.dex */
public final class d0 {
    public static final List<u10.f> a(u10.f name) {
        List<u10.f> m11;
        kotlin.jvm.internal.s.g(name, "name");
        String b11 = name.b();
        kotlin.jvm.internal.s.f(b11, "name.asString()");
        if (y.b(b11)) {
            m11 = wz.w.m(b(name));
            return m11;
        } else if (y.c(b11)) {
            return f(name);
        } else {
            return g.f24448a.b(name);
        }
    }

    public static final u10.f b(u10.f methodName) {
        kotlin.jvm.internal.s.g(methodName, "methodName");
        u10.f e11 = e(methodName, "get", false, null, 12, null);
        return e11 == null ? e(methodName, "is", false, null, 8, null) : e11;
    }

    public static final u10.f c(u10.f methodName, boolean z11) {
        kotlin.jvm.internal.s.g(methodName, "methodName");
        return e(methodName, "set", false, z11 ? "is" : null, 4, null);
    }

    private static final u10.f d(u10.f fVar, String str, boolean z11, String str2) {
        boolean H;
        String t02;
        String t03;
        if (fVar.g()) {
            return null;
        }
        String d11 = fVar.d();
        kotlin.jvm.internal.s.f(d11, "methodName.identifier");
        boolean z12 = false;
        H = kotlin.text.v.H(d11, str, false, 2, null);
        if (H && d11.length() != str.length()) {
            char charAt = d11.charAt(str.length());
            if ('a' <= charAt && charAt <= 'z') {
                z12 = true;
            }
            if (z12) {
                return null;
            }
            if (str2 != null) {
                t03 = kotlin.text.w.t0(d11, str);
                return u10.f.f(kotlin.jvm.internal.s.p(str2, t03));
            } else if (z11) {
                t02 = kotlin.text.w.t0(d11, str);
                String c11 = q20.a.c(t02, true);
                if (u10.f.h(c11)) {
                    return u10.f.f(c11);
                }
                return null;
            } else {
                return fVar;
            }
        }
        return null;
    }

    static /* synthetic */ u10.f e(u10.f fVar, String str, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z11, str2);
    }

    public static final List<u10.f> f(u10.f methodName) {
        List<u10.f> n11;
        kotlin.jvm.internal.s.g(methodName, "methodName");
        n11 = wz.w.n(c(methodName, false), c(methodName, true));
        return n11;
    }
}