package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class n {
    public static final String a(u10.d dVar) {
        s.g(dVar, "<this>");
        List<u10.f> h11 = dVar.h();
        s.f(h11, "pathSegments()");
        return c(h11);
    }

    public static final String b(u10.f fVar) {
        s.g(fVar, "<this>");
        if (!d(fVar)) {
            String b11 = fVar.b();
            s.f(b11, "asString()");
            return b11;
        }
        String b12 = fVar.b();
        s.f(b12, "asString()");
        return s.p(String.valueOf('`') + b12, "`");
    }

    public static final String c(List<u10.f> pathSegments) {
        s.g(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (u10.f fVar : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private static final boolean d(u10.f fVar) {
        boolean z11;
        if (fVar.g()) {
            return false;
        }
        String b11 = fVar.b();
        s.f(b11, "asString()");
        if (!i.f35139a.contains(b11)) {
            int i11 = 0;
            while (true) {
                if (i11 >= b11.length()) {
                    z11 = false;
                    break;
                }
                char charAt = b11.charAt(i11);
                if ((Character.isLetterOrDigit(charAt) || charAt == '_') ? false : true) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }
}