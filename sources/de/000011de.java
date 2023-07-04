package ch.qos.logback.core.util;

import org.spongycastle.i18n.TextBundle;

/* loaded from: classes.dex */
public class ContentTypeUtil {
    public static String getSubType(String str) {
        int indexOf;
        int i11;
        if (str == null || (indexOf = str.indexOf(47)) == -1 || (i11 = indexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i11);
    }

    public static boolean isTextual(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(TextBundle.TEXT_ENTRY);
    }
}