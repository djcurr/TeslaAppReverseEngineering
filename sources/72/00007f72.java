package kotlin.text;

import java.math.BigDecimal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class t extends s {
    public static BigDecimal k(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        try {
            if (l.f35216b.g(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double l(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        try {
            if (l.f35216b.g(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}