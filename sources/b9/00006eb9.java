package freemarker.core;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import freemarker.template.Template;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuffer a(StringBuffer stringBuffer, d dVar) {
        stringBuffer.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        stringBuffer.append(dVar.a());
        stringBuffer.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return stringBuffer;
    }

    private static String b(String str, Template template, int i11, int i12) {
        return c(str, null, i11, i12);
    }

    private static String c(String str, String str2, int i11, int i12) {
        return d(str, str2, null, false, i11, i12);
    }

    private static String d(String str, String str2, String str3, boolean z11, int i11, int i12) {
        String str4;
        String str5;
        if (i11 < 0) {
            str3 = null;
            str4 = "?eval-ed string";
        } else if (str2 != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("template ");
            stringBuffer.append(jx.e.h(str2));
            str4 = stringBuffer.toString();
        } else {
            str4 = "nameless template";
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("in ");
        stringBuffer2.append(str4);
        if (str3 != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" in ");
            stringBuffer3.append(z11 ? "function " : "macro ");
            stringBuffer3.append(jx.e.g(str3));
            str5 = stringBuffer3.toString();
        } else {
            str5 = "";
        }
        stringBuffer2.append(str5);
        stringBuffer2.append(" ");
        stringBuffer2.append(str);
        stringBuffer2.append(" ");
        stringBuffer2.append(h(i11, i12));
        return stringBuffer2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(e eVar, int i11, int i12) {
        eVar.c();
        return d("at", null, eVar.j(), eVar.l(), i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(Template template, int i11, int i12) {
        return b("at", template, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(String str, int i11, int i12) {
        return c("in", str, i11, i12);
    }

    static String h(int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("line ");
        if (i11 < 0) {
            i11 -= -1000000001;
        }
        stringBuffer.append(i11);
        stringBuffer.append(", column ");
        stringBuffer.append(i12);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(String str, int i11) {
        boolean z11;
        if (i11 < 5) {
            i11 = 5;
        }
        int indexOf = str.indexOf(10);
        boolean z12 = true;
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
            z11 = true;
        } else {
            z11 = false;
        }
        int indexOf2 = str.indexOf(13);
        if (indexOf2 != -1) {
            str = str.substring(0, indexOf2);
            z11 = true;
        }
        if (str.length() > i11) {
            str = str.substring(0, i11 - 3);
        } else {
            z12 = z11;
        }
        if (z12) {
            if (str.endsWith(".")) {
                if (str.endsWith(CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
                    if (str.endsWith("...")) {
                        return str;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(str);
                    stringBuffer.append(".");
                    return stringBuffer.toString();
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str);
                stringBuffer2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
                return stringBuffer2.toString();
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(str);
            stringBuffer3.append("...");
            return stringBuffer3.toString();
        }
        return str;
    }
}