package t9;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class l {
    public static String a(Context context) {
        if (com.alipay.sdk.app.a.b()) {
            return "https://mobilegw.alipaydev.com/mgw.htm";
        }
        if (com.alipay.sdk.app.a.a()) {
            return "https://mobilegw.dl.alipaydev.com/mgw.htm";
        }
        if (context == null) {
            return e9.a.f25021a;
        }
        String str = e9.a.f25021a;
        return TextUtils.isEmpty(str) ? e9.a.f25021a : str;
    }
}