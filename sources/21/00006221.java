package com.teslamotors.plugins.securewebview;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* loaded from: classes6.dex */
public class SecureWebviewModule extends ReactContextBaseJavaModule {
    static final String ALLOW_PDFS = "allowPDFs";
    static final String BAR_COLOR = "barTintColor";
    static final String CONTROL_COLOR = "controlTintColor";
    private static final String FALLBACK_HEADER_TEXT = "Tesla";
    static final String HEADER = "header";
    static final String IS_FROM_BOTTOM = "isFromBottom";
    private static final String ON_DISMISS_EVENT = "SecureWebviewOnDismiss";
    private static final String ON_LOAD_EVENT = "SecureWebviewOnShow";
    private static final String REACT_CLASS = "TMSecureWebview";
    private static final String TAG = "SecureWebviewModule";
    static final String URL = "url";
    static final int WEBVIEW_DISMISS_CODE = 201;

    /* loaded from: classes6.dex */
    private class b implements ActivityEventListener {
        private b() {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            if (i11 == SecureWebviewModule.WEBVIEW_DISMISS_CODE) {
                SecureWebviewModule.this.emitNativeEvent(SecureWebviewModule.ON_DISMISS_EVENT);
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    public SecureWebviewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emitNativeEvent(String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, null);
    }

    @ReactMethod
    public void dismiss() {
        try {
            if (getCurrentActivity() != null) {
                o4.a.b(getReactApplicationContext()).d(new Intent("com.teslamotors.plugins.securewebview.dismiss"));
            }
        } catch (Exception e11) {
            Log.e(TAG, "Fail to dismiss Webview.", e11);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void show(ReadableMap readableMap) {
        if (readableMap.hasKey("url")) {
            try {
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null) {
                    Intent intent = new Intent(currentActivity, SecureWebviewActivity.class);
                    String string = readableMap.hasKey(HEADER) ? readableMap.getString(HEADER) : FALLBACK_HEADER_TEXT;
                    int parseColor = readableMap.hasKey(BAR_COLOR) ? Color.parseColor(readableMap.getString(BAR_COLOR)) : -16777216;
                    int parseColor2 = readableMap.hasKey(CONTROL_COLOR) ? Color.parseColor(readableMap.getString(CONTROL_COLOR)) : -7829368;
                    intent.putExtra(HEADER, string);
                    intent.putExtra("url", readableMap.getString("url"));
                    intent.putExtra(BAR_COLOR, parseColor);
                    intent.putExtra(CONTROL_COLOR, parseColor2);
                    intent.putExtra(ALLOW_PDFS, readableMap.getBoolean(ALLOW_PDFS));
                    boolean z11 = readableMap.hasKey(IS_FROM_BOTTOM) && readableMap.getBoolean(IS_FROM_BOTTOM);
                    currentActivity.startActivityForResult(intent, WEBVIEW_DISMISS_CODE, ActivityOptions.makeCustomAnimation(currentActivity, z11 ? com.teslamotors.plugins.securewebview.a.f22259a : d.activity_slide_in, z11 ? com.teslamotors.plugins.securewebview.a.f22260b : d.activity_slide_out).toBundle());
                    emitNativeEvent(ON_LOAD_EVENT);
                }
            } catch (Exception e11) {
                Log.e(TAG, "Fail to load URL", e11);
            }
        }
    }
}