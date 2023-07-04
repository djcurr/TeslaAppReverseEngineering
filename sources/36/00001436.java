package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import java.util.HashMap;
import java.util.Map;
import l8.f;

/* loaded from: classes.dex */
public class APSecuritySdk implements f {

    /* renamed from: a  reason: collision with root package name */
    public static APSecuritySdk f10178a;
    public static APSecBgCheckerInterface bgChecker;

    /* renamed from: c  reason: collision with root package name */
    public static IDeviceInfo f10179c;

    /* renamed from: d  reason: collision with root package name */
    public static Object f10180d = new Object();

    /* renamed from: b  reason: collision with root package name */
    public Context f10181b;

    /* loaded from: classes.dex */
    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    /* loaded from: classes.dex */
    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.f10181b = context;
    }

    public static IDeviceInfo getDeviceInfo() {
        return f10179c;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f10178a == null) {
            synchronized (f10180d) {
                if (f10178a == null) {
                    f10178a = new APSecuritySdk(context);
                }
            }
        }
        return f10178a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        f10179c = iDeviceInfo;
    }

    @Override // l8.f
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = f10179c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public String getApdidToken() {
        String a11 = a.a(this.f10181b, "");
        if (x9.a.c(a11)) {
            initToken(0, new HashMap(), null);
        }
        return a11;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202303020703";
    }

    @Override // l8.f
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = f10179c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.f10181b, "");
            tokenResult.clientKey = h.f(this.f10181b);
            tokenResult.apdid = a.a(this.f10181b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f10181b);
            if (x9.a.c(tokenResult.apdid) || x9.a.c(tokenResult.apdidToken) || x9.a.c(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i11, Map<String, String> map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i11);
        String b11 = h.b(this.f10181b);
        String c11 = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (x9.a.f(b11) && !x9.a.d(b11, c11)) {
            com.alipay.apmobilesecuritysdk.e.a.a(this.f10181b);
            d.a(this.f10181b);
            g.a(this.f10181b);
            i.h();
        }
        if (!x9.a.d(b11, c11)) {
            h.c(this.f10181b, c11);
        }
        String b12 = x9.a.b(map, "utdid", "");
        String b13 = x9.a.b(map, "tid", "");
        String b14 = x9.a.b(map, "userId", "");
        if (x9.a.c(b12)) {
            b12 = UtdidWrapper.getUtdid(this.f10181b);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("utdid", b12);
        hashMap.put("tid", b13);
        hashMap.put("userId", b14);
        hashMap.put("appName", "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put("rpcVersion", "8");
        b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            @Override // java.lang.Runnable
            public void run() {
                new a(APSecuritySdk.this.f10181b).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }

    @Override // l8.f
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }
}