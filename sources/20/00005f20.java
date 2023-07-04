package com.tencent.mm.opensdk.openapi;

import android.content.Context;
import com.tencent.mm.opensdk.utils.Log;

/* loaded from: classes6.dex */
public class WXAPIFactory {
    private static final String TAG = "MicroMsg.PaySdk.WXFactory";

    private WXAPIFactory() {
        throw new RuntimeException(WXAPIFactory.class.getSimpleName() + " should not be instantiated");
    }

    public static IWXAPI createWXAPI(Context context, String str) {
        return createWXAPI(context, str, true);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z11) {
        Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z11);
        return createWXAPI(context, str, z11, 2);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z11, int i11) {
        Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z11 + ", launchMode = " + i11);
        return new WXApiImplV10(context, str, z11, i11);
    }
}