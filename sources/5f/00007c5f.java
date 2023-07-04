package jx;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f34015a = b();

    private static String a(String str, char c11, boolean z11) {
        int length = str.length();
        char c12 = CoreConstants.SINGLE_QUOTE_CHAR;
        if (c11 == 0) {
            c12 = 0;
        } else if (c11 != '\"') {
            if (c11 != '\'') {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unsupported quotation character: ");
                stringBuffer.append(c11);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            c12 = '\"';
        }
        int length2 = f34015a.length;
        StringBuffer stringBuffer2 = null;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            char c13 = CoreConstants.CURLY_LEFT;
            if (charAt < length2) {
                c13 = f34015a[charAt];
            } else if (charAt != '{' || i11 <= 0 || !f(str.charAt(i11 - 1))) {
                c13 = 0;
            }
            if (c13 != 0 && c13 != c12) {
                if (stringBuffer2 == null) {
                    stringBuffer2 = new StringBuffer(str.length() + 4 + (z11 ? 2 : 0));
                    if (z11) {
                        stringBuffer2.append(c11);
                    }
                    stringBuffer2.append(str.substring(0, i11));
                }
                if (c13 == 1) {
                    stringBuffer2.append("\\x00");
                    int i12 = (charAt >> 4) & 15;
                    char c14 = (char) (charAt & 15);
                    stringBuffer2.append((char) (i12 < 10 ? i12 + 48 : (i12 - 10) + 65));
                    stringBuffer2.append((char) (c14 < '\n' ? c14 + '0' : (c14 - '\n') + 65));
                } else {
                    stringBuffer2.append(CoreConstants.ESCAPE_CHAR);
                    stringBuffer2.append(c13);
                }
            } else if (stringBuffer2 != null) {
                stringBuffer2.append(charAt);
            }
        }
        if (stringBuffer2 != null) {
            if (z11) {
                stringBuffer2.append(c11);
            }
            return stringBuffer2.toString();
        } else if (z11) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(c11);
            stringBuffer3.append(str);
            stringBuffer3.append(c11);
            return stringBuffer3.toString();
        } else {
            return str;
        }
    }

    private static char[] b() {
        char[] cArr = new char[93];
        for (int i11 = 0; i11 < 32; i11++) {
            cArr[i11] = 1;
        }
        cArr[92] = CoreConstants.ESCAPE_CHAR;
        cArr[39] = CoreConstants.SINGLE_QUOTE_CHAR;
        cArr[34] = CoreConstants.DOUBLE_QUOTE_CHAR;
        cArr[60] = 'l';
        cArr[62] = 'g';
        cArr[38] = 'a';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[12] = 'f';
        cArr[13] = 'r';
        return cArr;
    }

    public static String c(String str) {
        char c11 = CoreConstants.DOUBLE_QUOTE_CHAR;
        if (str.indexOf(34) != -1 && str.indexOf(39) == -1) {
            c11 = '\'';
        }
        return a(str, c11, true);
    }

    public static boolean d(char c11) {
        return e(c11) || (c11 >= '0' && c11 <= '9');
    }

    public static boolean e(char c11) {
        if (c11 >= 170) {
            return c11 < 43000 ? c11 < 11631 ? c11 < 8488 ? c11 < 8336 ? c11 < 216 ? c11 < 186 ? c11 == 170 || c11 == 181 : c11 == 186 || (c11 >= 192 && c11 <= 214) : c11 < 8305 ? (c11 >= 216 && c11 <= 246) || (c11 >= 248 && c11 <= 8191) : c11 == 8305 || c11 == 8319 : c11 < 8469 ? c11 < 8455 ? (c11 >= 8336 && c11 <= 8348) || c11 == 8450 : c11 == 8455 || (c11 >= 8458 && c11 <= 8467) : c11 < 8484 ? c11 == 8469 || (c11 >= 8473 && c11 <= 8477) : c11 == 8484 || c11 == 8486 : c11 < 11312 ? c11 < 8517 ? c11 < 8495 ? c11 == 8488 || (c11 >= 8490 && c11 <= 8493) : (c11 >= 8495 && c11 <= 8505) || (c11 >= 8508 && c11 <= 8511) : c11 < 8579 ? (c11 >= 8517 && c11 <= 8521) || c11 == 8526 : (c11 >= 8579 && c11 <= 8580) || (c11 >= 11264 && c11 <= 11310) : c11 < 11520 ? c11 < 11499 ? (c11 >= 11312 && c11 <= 11358) || (c11 >= 11360 && c11 <= 11492) : (c11 >= 11499 && c11 <= 11502) || (c11 >= 11506 && c11 <= 11507) : c11 < 11565 ? (c11 >= 11520 && c11 <= 11557) || c11 == 11559 : c11 == 11565 || (c11 >= 11568 && c11 <= 11623) : c11 < 12784 ? c11 < 11728 ? c11 < 11696 ? c11 < 11680 ? c11 == 11631 || (c11 >= 11648 && c11 <= 11670) : (c11 >= 11680 && c11 <= 11686) || (c11 >= 11688 && c11 <= 11694) : c11 < 11712 ? (c11 >= 11696 && c11 <= 11702) || (c11 >= 11704 && c11 <= 11710) : (c11 >= 11712 && c11 <= 11718) || (c11 >= 11720 && c11 <= 11726) : c11 < 12337 ? c11 < 11823 ? (c11 >= 11728 && c11 <= 11734) || (c11 >= 11736 && c11 <= 11742) : c11 == 11823 || (c11 >= 12293 && c11 <= 12294) : c11 < 12352 ? (c11 >= 12337 && c11 <= 12341) || (c11 >= 12347 && c11 <= 12348) : (c11 >= 12352 && c11 <= 12687) || (c11 >= 12704 && c11 <= 12730) : c11 < 42623 ? c11 < 42192 ? c11 < 13312 ? (c11 >= 12784 && c11 <= 12799) || (c11 >= 13056 && c11 <= 13183) : (c11 >= 13312 && c11 <= 19893) || (c11 >= 19968 && c11 <= 42124) : c11 < 42512 ? (c11 >= 42192 && c11 <= 42237) || (c11 >= 42240 && c11 <= 42508) : (c11 >= 42512 && c11 <= 42539) || (c11 >= 42560 && c11 <= 42606) : c11 < 42891 ? c11 < 42775 ? (c11 >= 42623 && c11 <= 42647) || (c11 >= 42656 && c11 <= 42725) : (c11 >= 42775 && c11 <= 42783) || (c11 >= 42786 && c11 <= 42888) : c11 < 42912 ? (c11 >= 42891 && c11 <= 42894) || (c11 >= 42896 && c11 <= 42899) : c11 >= 42912 && c11 <= 42922 : c11 < 43808 ? c11 < 43588 ? c11 < 43259 ? c11 < 43072 ? c11 < 43015 ? (c11 >= 43000 && c11 <= 43009) || (c11 >= 43011 && c11 <= 43013) : (c11 >= 43015 && c11 <= 43018) || (c11 >= 43020 && c11 <= 43042) : c11 < 43216 ? (c11 >= 43072 && c11 <= 43123) || (c11 >= 43138 && c11 <= 43187) : (c11 >= 43216 && c11 <= 43225) || (c11 >= 43250 && c11 <= 43255) : c11 < 43396 ? c11 < 43312 ? c11 == 43259 || (c11 >= 43264 && c11 <= 43301) : (c11 >= 43312 && c11 <= 43334) || (c11 >= 43360 && c11 <= 43388) : c11 < 43520 ? (c11 >= 43396 && c11 <= 43442) || (c11 >= 43471 && c11 <= 43481) : (c11 >= 43520 && c11 <= 43560) || (c11 >= 43584 && c11 <= 43586) : c11 < 43712 ? c11 < 43648 ? c11 < 43616 ? (c11 >= 43588 && c11 <= 43595) || (c11 >= 43600 && c11 <= 43609) : (c11 >= 43616 && c11 <= 43638) || c11 == 43642 : c11 < 43701 ? (c11 >= 43648 && c11 <= 43695) || c11 == 43697 : (c11 >= 43701 && c11 <= 43702) || (c11 >= 43705 && c11 <= 43709) : c11 < 43762 ? c11 < 43739 ? c11 == 43712 || c11 == 43714 : (c11 >= 43739 && c11 <= 43741) || (c11 >= 43744 && c11 <= 43754) : c11 < 43785 ? (c11 >= 43762 && c11 <= 43764) || (c11 >= 43777 && c11 <= 43782) : (c11 >= 43785 && c11 <= 43790) || (c11 >= 43793 && c11 <= 43798) : c11 < 64326 ? c11 < 64275 ? c11 < 44032 ? c11 < 43968 ? (c11 >= 43808 && c11 <= 43814) || (c11 >= 43816 && c11 <= 43822) : (c11 >= 43968 && c11 <= 44002) || (c11 >= 44016 && c11 <= 44025) : c11 < 55243 ? (c11 >= 44032 && c11 <= 55203) || (c11 >= 55216 && c11 <= 55238) : (c11 >= 55243 && c11 <= 55291) || (c11 >= 63744 && c11 <= 64262) : c11 < 64312 ? c11 < 64287 ? (c11 >= 64275 && c11 <= 64279) || c11 == 64285 : (c11 >= 64287 && c11 <= 64296) || (c11 >= 64298 && c11 <= 64310) : c11 < 64320 ? (c11 >= 64312 && c11 <= 64316) || c11 == 64318 : (c11 >= 64320 && c11 <= 64321) || (c11 >= 64323 && c11 <= 64324) : c11 < 65313 ? c11 < 65008 ? c11 < 64848 ? (c11 >= 64326 && c11 <= 64433) || (c11 >= 64467 && c11 <= 64829) : (c11 >= 64848 && c11 <= 64911) || (c11 >= 64914 && c11 <= 64967) : c11 < 65142 ? (c11 >= 65008 && c11 <= 65019) || (c11 >= 65136 && c11 <= 65140) : (c11 >= 65142 && c11 <= 65276) || (c11 >= 65296 && c11 <= 65305) : c11 < 65482 ? c11 < 65382 ? (c11 >= 65313 && c11 <= 65338) || (c11 >= 65345 && c11 <= 65370) : (c11 >= 65382 && c11 <= 65470) || (c11 >= 65474 && c11 <= 65479) : c11 < 65498 ? (c11 >= 65482 && c11 <= 65487) || (c11 >= 65490 && c11 <= 65495) : c11 >= 65498 && c11 <= 65500;
        } else if ((c11 < 'a' || c11 > 'z') && (c11 < '@' || c11 > 'Z')) {
            return c11 == '$' || c11 == '_';
        } else {
            return true;
        }
    }

    private static boolean f(char c11) {
        return c11 == '$' || c11 == '#';
    }

    public static String g(String str) {
        if (str == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt == '\\') {
                stringBuffer.append("\\\\");
            } else if (charAt >= ' ') {
                stringBuffer.append(charAt);
            } else if (charAt == '\n') {
                stringBuffer.append("\\n");
            } else if (charAt == '\r') {
                stringBuffer.append("\\r");
            } else if (charAt == '\f') {
                stringBuffer.append("\\f");
            } else if (charAt == '\b') {
                stringBuffer.append("\\b");
            } else if (charAt == '\t') {
                stringBuffer.append("\\t");
            } else {
                stringBuffer.append("\\u00");
                stringBuffer.append(k(charAt / 16));
                stringBuffer.append(k(charAt & 15));
            }
        }
        stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        return stringBuffer.toString();
    }

    public static String h(String str) {
        if (str == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt == '\\') {
                stringBuffer.append("\\\\");
            } else if (charAt == '<') {
                stringBuffer.append("\\u003C");
            } else if (charAt >= ' ') {
                stringBuffer.append(charAt);
            } else if (charAt == '\n') {
                stringBuffer.append("\\n");
            } else if (charAt == '\r') {
                stringBuffer.append("\\r");
            } else if (charAt == '\f') {
                stringBuffer.append("\\f");
            } else if (charAt == '\b') {
                stringBuffer.append("\\b");
            } else if (charAt == '\t') {
                stringBuffer.append("\\t");
            } else {
                stringBuffer.append("\\u00");
                stringBuffer.append(k(charAt / 16));
                stringBuffer.append(k(charAt & 15));
            }
        }
        stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        return stringBuffer.toString();
    }

    public static String i(String str, String str2, String str3) {
        return j(str, str2, str3, false, false);
    }

    public static String j(String str, String str2, String str3, boolean z11, boolean z12) {
        int length = str2.length();
        int i11 = 0;
        if (length == 0) {
            int length2 = str3.length();
            if (length2 == 0) {
                return str;
            }
            if (z12) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str3);
                stringBuffer.append(str);
                return stringBuffer.toString();
            }
            int length3 = str.length();
            StringBuffer stringBuffer2 = new StringBuffer(((length3 + 1) * length2) + length3);
            stringBuffer2.append(str3);
            while (i11 < length3) {
                stringBuffer2.append(str.charAt(i11));
                stringBuffer2.append(str3);
                i11++;
            }
            return stringBuffer2.toString();
        }
        if (z11) {
            str2 = str2.toLowerCase();
        }
        String lowerCase = z11 ? str.toLowerCase() : str;
        int indexOf = lowerCase.indexOf(str2);
        if (indexOf == -1) {
            return str;
        }
        StringBuffer stringBuffer3 = new StringBuffer(str.length() + (Math.max(str3.length() - length, 0) * 3));
        do {
            stringBuffer3.append(str.substring(i11, indexOf));
            stringBuffer3.append(str3);
            i11 = indexOf + length;
            indexOf = lowerCase.indexOf(str2, i11);
            if (indexOf == -1) {
                break;
            }
        } while (!z12);
        stringBuffer3.append(str.substring(i11));
        return stringBuffer3.toString();
    }

    private static char k(int i11) {
        return (char) (i11 < 10 ? i11 + 48 : (i11 - 10) + 65);
    }
}