package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import java.util.HashMap;
import x9.a;

/* loaded from: classes.dex */
public class TMNTokenClient {

    /* renamed from: a  reason: collision with root package name */
    public static TMNTokenClient f10186a;

    /* renamed from: b  reason: collision with root package name */
    public Context f10187b;

    /* loaded from: classes.dex */
    public interface InitResultListener {
        void onResult(String str, int i11);
    }

    public TMNTokenClient(Context context) {
        this.f10187b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f10187b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f10186a == null) {
            synchronized (TMNTokenClient.class) {
                if (f10186a == null) {
                    f10186a = new TMNTokenClient(context);
                }
            }
        }
        return f10186a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (a.c(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (a.c(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", UtdidWrapper.getUtdid(this.f10187b));
        hashMap.put("tid", "");
        hashMap.put("userId", "");
        hashMap.put("appName", str);
        hashMap.put("appKeyClient", str2);
        hashMap.put("appchannel", "openapi");
        hashMap.put("sessionId", str3);
        hashMap.put("rpcVersion", "8");
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            @Override // java.lang.Runnable
            public void run() {
                int a11 = new com.alipay.apmobilesecuritysdk.a.a(TMNTokenClient.this.f10187b).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (a11 != 0) {
                    initResultListener2.onResult("", a11);
                    return;
                }
                initResultListener.onResult(com.alipay.apmobilesecuritysdk.a.a.a(TMNTokenClient.this.f10187b, str), 0);
            }
        });
    }
}