package t9;

import ch.qos.logback.classic.spi.CallerData;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class k {
    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
        } catch (Throwable th2) {
            e.d(th2);
        }
        return CallerData.NA;
    }

    public static Map<String, String> b() {
        a9.c b11 = a9.c.b(a9.c.CANCELED.b());
        HashMap hashMap = new HashMap();
        hashMap.put("resultStatus", Integer.toString(b11.b()));
        hashMap.put("memo", b11.a());
        hashMap.put("result", "");
        return hashMap;
    }

    public static Map<String, String> c(String str) {
        String[] split = str.split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            hashMap.put(substring, e(str2, substring));
        }
        return hashMap;
    }

    public static Map<String, String> d(r9.a aVar, String str) {
        Map<String, String> b11 = b();
        try {
            return c(str);
        } catch (Throwable th2) {
            c9.a.d(aVar, "biz", "FormatResultEx", th2);
            return b11;
        }
    }

    public static String e(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }
}