package fs;

import java.util.Locale;
import jt.f;
import jt.g;
import jt.h;
import kotlin.jvm.internal.s;
import kotlin.text.w;

/* loaded from: classes6.dex */
public final class a {
    public static final f a(String error) {
        s.g(error, "error");
        return new f(g.ERROR, null, null, null, new h(c(error), null, 2, null), null, 46, null);
    }

    public static final f b() {
        return new f(g.SUCCESS, new jt.a(false, null, 2, null), null, null, null, null, 60, null);
    }

    public static final String c(String str) {
        s.g(str, "<this>");
        Locale US = Locale.US;
        s.f(US, "US");
        String lowerCase = str.toLowerCase(US);
        s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final f d(int i11) {
        g gVar = g.REASON;
        return new f(gVar, null, null, null, new h("ownerapi: {{" + i11 + "}}", null, 2, null), null, 46, null);
    }

    public static final f e(String reason) {
        s.g(reason, "reason");
        return new f(g.REASON, null, null, null, new h(c(reason), null, 2, null), null, 46, null);
    }

    public static final f f(ot.f result) {
        String P0;
        s.g(result, "result");
        g gVar = g.COMMAND_RESULT;
        P0 = w.P0(result.name(), "COMMAND_", null, 2, null);
        return new f(gVar, null, null, null, new h(c(P0), null, 2, null), null, 46, null);
    }

    public static final f g() {
        return new f(g.SUCCESS, new jt.a(true, null, 2, null), null, null, null, null, 60, null);
    }
}