package ku;

import com.google.firebase.perf.metrics.Trace;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class b {
    public static final void a(Trace trace, a attribute) {
        s.g(trace, "<this>");
        s.g(attribute, "attribute");
        trace.putAttribute(b(attribute.a()), b(attribute.b().toString()));
    }

    public static final String b(String str) {
        s.g(str, "<this>");
        Locale US = Locale.US;
        s.f(US, "US");
        String lowerCase = str.toLowerCase(US);
        s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}