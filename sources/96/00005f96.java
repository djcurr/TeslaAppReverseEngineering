package com.tesla.TeslaV4.wxapi;

import android.app.Activity;
import android.os.Bundle;
import com.reactlibrary.WeChatBridgeModule;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tesla/TeslaV4/wxapi/WXPayEntryActivity;", "Landroid/app/Activity;", "<init>", "()V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class WXPayEntryActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WeChatBridgeModule.handleIntent(getIntent());
        finish();
    }
}