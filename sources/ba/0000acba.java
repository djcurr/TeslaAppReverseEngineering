package q20;

import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import m00.i;

/* loaded from: classes5.dex */
public final class a {
    public static final String a(String str) {
        s.g(str, "<this>");
        boolean z11 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt <= 'z') {
            z11 = true;
        }
        if (z11) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            s.f(substring, "(this as java.lang.String).substring(startIndex)");
            return String.valueOf(upperCase) + substring;
        }
        return str;
    }

    public static final String b(String str) {
        s.g(str, "<this>");
        boolean z11 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt <= 'Z') {
            z11 = true;
        }
        if (z11) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            s.f(substring, "(this as java.lang.String).substring(startIndex)");
            return String.valueOf(lowerCase) + substring;
        }
        return str;
    }

    public static final String c(String str, boolean z11) {
        i S;
        Integer num;
        s.g(str, "<this>");
        if ((str.length() == 0) || !d(str, 0, z11)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z11)) {
            if (z11) {
                return b(str);
            }
            if (str.length() > 0) {
                char lowerCase = Character.toLowerCase(str.charAt(0));
                String substring = str.substring(1);
                s.f(substring, "(this as java.lang.String).substring(startIndex)");
                return String.valueOf(lowerCase) + substring;
            }
            return str;
        }
        S = w.S(str);
        Iterator<Integer> it2 = S.iterator();
        while (true) {
            if (!it2.hasNext()) {
                num = null;
                break;
            }
            num = it2.next();
            if (!d(str, num.intValue(), z11)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return e(str, z11);
        }
        int intValue = num2.intValue() - 1;
        String substring2 = str.substring(0, intValue);
        s.f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String e11 = e(substring2, z11);
        String substring3 = str.substring(intValue);
        s.f(substring3, "(this as java.lang.String).substring(startIndex)");
        return s.p(e11, substring3);
    }

    private static final boolean d(String str, int i11, boolean z11) {
        char charAt = str.charAt(i11);
        if (z11) {
            return 'A' <= charAt && charAt <= 'Z';
        }
        return Character.isUpperCase(charAt);
    }

    private static final String e(String str, boolean z11) {
        if (z11) {
            return f(str);
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        s.f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final String f(String str) {
        s.g(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            i11++;
            if ('A' <= charAt && charAt <= 'Z') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        s.f(sb3, "builder.toString()");
        return sb3;
    }
}