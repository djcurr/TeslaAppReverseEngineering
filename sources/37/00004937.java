package com.reactlibrary;

import android.os.Bundle;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.app.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.model.AlipayAuthResult;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AlipayBridgeModule extends ReactContextBaseJavaModule {
    private final ArrayList<String> errorList;
    private final ReactApplicationContext reactContext;

    /* loaded from: classes2.dex */
    class a implements b.InterfaceC0193b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f20040a;

        a(AlipayBridgeModule alipayBridgeModule, Promise promise) {
            this.f20040a = promise;
        }

        @Override // com.alipay.sdk.app.b.InterfaceC0193b
        public void a(int i11, String str, Bundle bundle) {
            Boolean bool = Boolean.FALSE;
            String string = bundle.getString("alipay_user_agreement_page_sign_response");
            if (string != null) {
                try {
                    bool = Boolean.valueOf("10000".equals(new JSONObject(string).getString(PaymentMethodOptionsParams.Blik.PARAM_CODE)));
                } catch (JSONException unused) {
                    bool = Boolean.FALSE;
                }
            }
            if (bool.booleanValue()) {
                return;
            }
            this.f20040a.reject("sign rejected", "The agreement was cancelled by user");
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f20042b;

        b(String str, Promise promise) {
            this.f20041a = str;
            this.f20042b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> payV2 = new PayTask(AlipayBridgeModule.this.getCurrentActivity()).payV2(this.f20041a, true);
            String str = payV2.get("resultStatus");
            String str2 = payV2.get("memo");
            if (AlipayBridgeModule.this.errorList.contains(str)) {
                this.f20042b.reject(str, str2);
            }
        }
    }

    public AlipayBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.errorList = new ArrayList<>(Arrays.asList(AlipayAuthResult.RESULT_CODE_FAILED, "5000", AlipayAuthResult.RESULT_CODE_CANCELLED, "6002"));
        this.reactContext = reactApplicationContext;
    }

    private WritableMap getWritableMap(Map<String, String> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            createMap.putString(entry.getKey(), entry.getValue().toString());
        }
        return createMap;
    }

    @ReactMethod
    public void alipay(String str, String str2, Promise promise) {
        if (str2.contains("alipay.user.agreement.page.sign")) {
            com.alipay.sdk.app.b bVar = new com.alipay.sdk.app.b(getCurrentActivity());
            HashMap hashMap = new HashMap();
            hashMap.put("sign_params", str2);
            bVar.f(str, b.a.Deduct, hashMap, new a(this, promise), true);
            return;
        }
        new Thread(new b(str2, promise)).start();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AlipayBridge";
    }
}