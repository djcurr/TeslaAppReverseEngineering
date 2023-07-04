package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (b.class) {
            hashMap = new HashMap();
            String b11 = x9.a.b(map, "tid", "");
            String b12 = x9.a.b(map, "utdid", "");
            String b13 = x9.a.b(map, "userId", "");
            String b14 = x9.a.b(map, "appName", "");
            String b15 = x9.a.b(map, "appKeyClient", "");
            String b16 = x9.a.b(map, "tmxSessionId", "");
            String f11 = h.f(context);
            String b17 = x9.a.b(map, "sessionId", "");
            hashMap.put("AC1", b11);
            hashMap.put("AC2", b12);
            hashMap.put("AC3", "");
            hashMap.put("AC4", f11);
            hashMap.put("AC5", b13);
            hashMap.put("AC6", b16);
            hashMap.put("AC7", "");
            hashMap.put("AC8", b14);
            hashMap.put("AC9", b15);
            if (x9.a.f(b17)) {
                hashMap.put("AC10", b17);
            }
        }
        return hashMap;
    }
}