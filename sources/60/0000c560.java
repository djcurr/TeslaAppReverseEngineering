package zu;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class e0 {
    public static final String a(String str) {
        String lowerCase;
        kotlin.jvm.internal.s.g(str, "<this>");
        int length = str.length();
        String str2 = "";
        if (length > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt) && i11 > 0) {
                    lowerCase = "_" + charAt;
                } else {
                    String valueOf = String.valueOf(charAt);
                    Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                    lowerCase = valueOf.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.s.f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                }
                str2 = str2 + lowerCase;
                if (i12 >= length) {
                    break;
                }
                i11 = i12;
            }
        }
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String upperCase = str2.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.s.f(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}