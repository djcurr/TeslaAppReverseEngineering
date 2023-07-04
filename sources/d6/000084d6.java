package lu;

import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.s;
import tt.h;

/* loaded from: classes6.dex */
public final class b {
    public static final String a(h hVar) {
        s.g(hVar, "<this>");
        String name = hVar.name();
        Locale US = Locale.US;
        s.f(US, "US");
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(US);
        s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}