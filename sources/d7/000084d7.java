package lu;

import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.s;
import tt.k;

/* loaded from: classes6.dex */
public final class c {
    public static final String a(k kVar) {
        s.g(kVar, "<this>");
        String name = kVar.name();
        Locale ROOT = Locale.ROOT;
        s.f(ROOT, "ROOT");
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = name.toLowerCase(ROOT);
        s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}