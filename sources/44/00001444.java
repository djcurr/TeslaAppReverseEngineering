package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;
import x9.a;

/* loaded from: classes.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        String a11;
        synchronized (SecurityClientMobile.class) {
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", a.b(map, "utdid", ""));
            hashMap.put("tid", a.b(map, "tid", ""));
            hashMap.put("userId", a.b(map, "userId", ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            a11 = com.alipay.apmobilesecuritysdk.a.a.a(context);
        }
        return a11;
    }
}