package com.reactlibrary;

import androidx.fragment.app.h;
import androidx.lifecycle.g0;
import com.adyen.checkout.components.ActionComponentData;
import com.adyen.checkout.components.model.payments.response.Threeds2ChallengeAction;
import com.adyen.checkout.components.model.payments.response.Threeds2FingerprintAction;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.ErrorBundle;
import p6.c;
import r7.e;

/* loaded from: classes2.dex */
public class AdyenBridgeModule extends ReactContextBaseJavaModule implements Runnable {
    private b actionObserver;
    private String currentAction;
    private h currentActivity;
    private c errorObserver;
    private final ReactApplicationContext reactContext;
    private p6.a threedsComponent;

    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20036b;

        a(String str, String str2) {
            this.f20035a = str;
            this.f20036b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.adyen.checkout.core.api.d dVar = this.f20035a.equals("prod") ? com.adyen.checkout.core.api.d.f9585h : com.adyen.checkout.core.api.d.f9579b;
                AdyenBridgeModule adyenBridgeModule = AdyenBridgeModule.this;
                adyenBridgeModule.threedsComponent = p6.a.f46334l.b(adyenBridgeModule.currentActivity, AdyenBridgeModule.this.currentActivity.getApplication(), new c.a(AdyenBridgeModule.this.reactContext, this.f20036b).i(dVar).a());
                AdyenBridgeModule adyenBridgeModule2 = AdyenBridgeModule.this;
                adyenBridgeModule2.errorObserver = new c(adyenBridgeModule2, null);
                AdyenBridgeModule adyenBridgeModule3 = AdyenBridgeModule.this;
                adyenBridgeModule3.actionObserver = new b(adyenBridgeModule3, null);
                AdyenBridgeModule.this.threedsComponent.l(AdyenBridgeModule.this.currentActivity, AdyenBridgeModule.this.actionObserver);
                AdyenBridgeModule.this.threedsComponent.m(AdyenBridgeModule.this.currentActivity, AdyenBridgeModule.this.errorObserver);
            } catch (Exception e11) {
                AdyenBridgeModule.this.postEvent(e11.getMessage(), null);
            }
        }
    }

    /* loaded from: classes2.dex */
    private class b implements g0<ActionComponentData> {
        private b() {
        }

        @Override // androidx.lifecycle.g0
        /* renamed from: a */
        public void onChanged(ActionComponentData actionComponentData) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            JSONObject details = actionComponentData.getDetails();
            writableNativeMap.putString("paymentData", actionComponentData.getPaymentData());
            try {
                writableNativeMap.putMap(ErrorBundle.DETAIL_ENTRY, AdyenBridgeModule.this.convertJsonToMap(details));
                AdyenBridgeModule.this.postEvent(null, writableNativeMap);
            } catch (JSONException unused) {
                AdyenBridgeModule.this.postEvent("unexpected data from Adyen3DS component", null);
            }
        }

        /* synthetic */ b(AdyenBridgeModule adyenBridgeModule, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    private class c implements g0<c7.d> {
        private c() {
        }

        @Override // androidx.lifecycle.g0
        /* renamed from: a */
        public void onChanged(c7.d dVar) {
            AdyenBridgeModule.this.postEvent(dVar.a(), null);
        }

        /* synthetic */ c(AdyenBridgeModule adyenBridgeModule, a aVar) {
            this();
        }
    }

    public AdyenBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap convertJsonToMap(JSONObject jSONObject) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof Boolean) {
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeMap.putString(next, (String) obj);
            } else {
                writableNativeMap.putString(next, obj.toString());
            }
        }
        return writableNativeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postEvent(String str, WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("error", str);
        writableNativeMap.putMap(MessageExtension.FIELD_DATA, writableMap);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(this.currentAction, writableNativeMap);
    }

    @ReactMethod
    public void encryptCardAdyen(String str, String str2, String str3, String str4, String str5, Callback callback) {
        r7.c b11 = r7.a.b(new e.a().f(str).d(str2).e(str3).c(str4).a(), str5);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("number", b11.a());
        createMap.putString("expiryMonth", b11.b());
        createMap.putString("expiryYear", b11.c());
        createMap.putString("securityCode", b11.d());
        callback.invoke(createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AdyenBridge";
    }

    @ReactMethod
    public void handle3DSChallenge(String str, String str2, Callback callback) {
        try {
            if (this.currentActivity == null) {
                this.currentAction = "nullActivity";
                postEvent("Cannot handle 3ds challenge. CurrentActivity is null", null);
                return;
            }
            Threeds2ChallengeAction threeds2ChallengeAction = new Threeds2ChallengeAction(str);
            threeds2ChallengeAction.setPaymentData(str2);
            threeds2ChallengeAction.setType(Threeds2ChallengeAction.ACTION_TYPE);
            this.currentAction = Threeds2ChallengeAction.ACTION_TYPE;
            this.threedsComponent.h(this.currentActivity, threeds2ChallengeAction);
        } catch (Exception e11) {
            postEvent(e11.getMessage(), null);
        }
    }

    @ReactMethod
    public void handle3DSFingerprint(String str, String str2, Callback callback) {
        try {
            if (this.currentActivity == null) {
                this.currentAction = "nullActivity";
                postEvent("Cannot handle 3ds Fingerprint. CurrentActivity is null", null);
                return;
            }
            Threeds2FingerprintAction threeds2FingerprintAction = new Threeds2FingerprintAction(str);
            threeds2FingerprintAction.setPaymentData(str2);
            threeds2FingerprintAction.setType(Threeds2FingerprintAction.ACTION_TYPE);
            this.currentAction = Threeds2FingerprintAction.ACTION_TYPE;
            this.threedsComponent.h(this.currentActivity, threeds2FingerprintAction);
        } catch (Exception e11) {
            postEvent(e11.getMessage(), null);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    @ReactMethod
    public void start3dsComponent(String str, String str2, Callback callback) {
        try {
            h hVar = (h) getCurrentActivity();
            this.currentActivity = hVar;
            if (hVar == null) {
                this.currentAction = "nullActivity";
                postEvent("Failed to start 3DS component. CurrentActivity is null", null);
                return;
            }
            UiThreadUtil.runOnUiThread(new a(str, str2));
        } catch (Exception e11) {
            postEvent(e11.getMessage(), null);
        }
    }
}