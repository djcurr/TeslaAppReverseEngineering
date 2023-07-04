package f9;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class f {
    static {
        Pattern.compile("([\t\r\n])+");
    }

    public static int a(String str) {
        if (str.length() > 0) {
            int i11 = 0;
            for (char c11 : str.toCharArray()) {
                i11 = (i11 * 31) + c11;
            }
            return i11;
        }
        return 0;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}