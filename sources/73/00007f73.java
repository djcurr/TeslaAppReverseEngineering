package kotlin.text;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class u extends t {
    public static final Void m(String input) {
        kotlin.jvm.internal.s.g(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public static Integer n(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return o(str, 10);
    }

    public static final Integer o(String str, int i11) {
        boolean z11;
        int i12;
        kotlin.jvm.internal.s.g(str, "<this>");
        b.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        int i14 = -2147483647;
        int i15 = 1;
        if (kotlin.jvm.internal.s.i(charAt, 48) >= 0) {
            z11 = false;
            i15 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i14 = Integer.MIN_VALUE;
                z11 = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z11 = false;
            }
        }
        int i16 = -59652323;
        while (i15 < length) {
            int b11 = b.b(str.charAt(i15), i11);
            if (b11 < 0) {
                return null;
            }
            if ((i13 < i16 && (i16 != -59652323 || i13 < (i16 = i14 / i11))) || (i12 = i13 * i11) < i14 + b11) {
                return null;
            }
            i13 = i12 - b11;
            i15++;
        }
        return z11 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    public static Long p(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return q(str, 10);
    }

    public static final Long q(String str, int i11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        b.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        long j11 = -9223372036854775807L;
        boolean z11 = true;
        if (kotlin.jvm.internal.s.i(charAt, 48) >= 0) {
            z11 = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j11 = Long.MIN_VALUE;
                i12 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z11 = false;
                i12 = 1;
            }
        }
        long j12 = -256204778801521550L;
        long j13 = 0;
        long j14 = -256204778801521550L;
        while (i12 < length) {
            int b11 = b.b(str.charAt(i12), i11);
            if (b11 < 0) {
                return null;
            }
            if (j13 < j14) {
                if (j14 == j12) {
                    j14 = j11 / i11;
                    if (j13 < j14) {
                    }
                }
                return null;
            }
            long j15 = j13 * i11;
            long j16 = b11;
            if (j15 < j11 + j16) {
                return null;
            }
            j13 = j15 - j16;
            i12++;
            j12 = -256204778801521550L;
        }
        return z11 ? Long.valueOf(j13) : Long.valueOf(-j13);
    }
}