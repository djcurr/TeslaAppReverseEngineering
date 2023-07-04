package kotlin.text;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class a0 {
    public static final String a(char c11) {
        String valueOf = String.valueOf(c11);
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.s.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c11 == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            String substring = upperCase.substring(1);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String).substring(startIndex)");
            String lowerCase = substring.toLowerCase(locale);
            kotlin.jvm.internal.s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c11));
    }
}