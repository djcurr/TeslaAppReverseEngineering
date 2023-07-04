package ch.qos.logback.core.pattern.util;

/* loaded from: classes.dex */
public class RegularEscapeUtil implements IEscapeUtil {
    public static String basicEscape(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            char charAt = str.charAt(i11);
            if (charAt == '\\') {
                int i13 = i12 + 1;
                char charAt2 = str.charAt(i12);
                if (charAt2 == 'n') {
                    charAt2 = '\n';
                } else if (charAt2 == 'r') {
                    charAt2 = '\r';
                } else if (charAt2 == 't') {
                    charAt2 = '\t';
                } else if (charAt2 == 'f') {
                    charAt2 = '\f';
                }
                char c11 = charAt2;
                i12 = i13;
                charAt = c11;
            }
            sb2.append(charAt);
            i11 = i12;
        }
        return sb2.toString();
    }

    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c11, int i11) {
        char c12;
        if (str.indexOf(c11) >= 0 || c11 == '\\') {
            stringBuffer.append(c11);
        } else if (c11 != '_') {
            if (c11 == 'n') {
                c12 = '\n';
            } else if (c11 == 'r') {
                c12 = '\r';
            } else if (c11 != 't') {
                String formatEscapeCharsForListing = formatEscapeCharsForListing(str);
                throw new IllegalArgumentException("Illegal char '" + c11 + " at column " + i11 + ". Only \\\\, \\_" + formatEscapeCharsForListing + ", \\t, \\n, \\r combinations are allowed as escape characters.");
            } else {
                c12 = '\t';
            }
            stringBuffer.append(c12);
        }
    }

    String formatEscapeCharsForListing(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            sb2.append(", \\");
            sb2.append(str.charAt(i11));
        }
        return sb2.toString();
    }
}