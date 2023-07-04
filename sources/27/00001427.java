package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {
    public static synchronized Map<String, String> a() {
        HashMap hashMap;
        synchronized (d.class) {
            hashMap = new HashMap();
            try {
                new com.alipay.apmobilesecuritysdk.c.b();
                hashMap.put("AE16", "");
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static synchronized Map<String, String> a(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            l8.e.b();
            l8.b.c(APSecuritySdk.getInstance(context));
            hashMap = new HashMap();
            hashMap.put("AE1", l8.e.c());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l8.e.d() ? "1" : "0");
            hashMap.put("AE2", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(l8.e.e() ? "1" : "0");
            hashMap.put("AE3", sb3.toString());
            hashMap.put("AE4", l8.e.f());
            hashMap.put("AE5", l8.e.g());
            hashMap.put("AE6", l8.e.h());
            hashMap.put("AE7", l8.e.i());
            hashMap.put("AE8", l8.e.j());
            hashMap.put("AE9", l8.e.k());
            hashMap.put("AE10", l8.e.l());
            hashMap.put("AE11", l8.e.m());
            hashMap.put("AE12", l8.e.n());
            hashMap.put("AE13", l8.e.o());
            hashMap.put("AE14", l8.e.p());
            hashMap.put("AE15", l8.e.q());
            hashMap.put("AE21", l8.b.m());
        }
        return hashMap;
    }
}