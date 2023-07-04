package t9;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class h {
    public static String a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(";");
        for (int i11 = 0; i11 < split.length; i11++) {
            if (split[i11].startsWith("result={") && split[i11].endsWith("}")) {
                String[] split2 = split[i11].substring(8, split[i11].length() - 1).split("&");
                int i12 = 0;
                while (true) {
                    if (i12 >= split2.length) {
                        break;
                    } else if (split2[i12].startsWith("trade_token=\"") && split2[i12].endsWith("\"")) {
                        str2 = split2[i12].substring(13, split2[i12].length() - 1);
                        break;
                    } else if (split2[i12].startsWith("trade_token=")) {
                        str2 = split2[i12].substring(12);
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        return str2;
    }

    public static String b(r9.a aVar, Context context) {
        String b11 = i.b(aVar, context, "pref_trade_token", "");
        e.f("mspl", "get trade token: " + b11);
        return b11;
    }

    public static void c(r9.a aVar, Context context, String str) {
        try {
            String a11 = a(str);
            e.f("mspl", "trade token: " + a11);
            if (TextUtils.isEmpty(a11)) {
                return;
            }
            i.c(aVar, context, "pref_trade_token", a11);
        } catch (Throwable th2) {
            c9.a.d(aVar, "biz", "SaveTradeTokenError", th2);
            e.d(th2);
        }
    }
}