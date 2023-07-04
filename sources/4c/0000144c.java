package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import com.adyen.checkout.components.model.payments.request.Address;
import r9.a;

/* loaded from: classes.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* renamed from: i  reason: collision with root package name */
    public boolean f10201i = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public void a() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.f10201i) {
            try {
                r9.a a11 = a.C1076a.a(getIntent());
                if (a11 != null) {
                    c9.a.g(this, a11, "", a11.f49316d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            r9.a a11 = a.C1076a.a(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th2) {
                String uri = (intent == null || intent.getData() == null) ? Address.ADDRESS_NULL_PLACEHOLDER : intent.getData().toString();
                if (a11 != null) {
                    c9.a.e(a11, "biz", "StartActivityEx", th2, uri);
                }
                this.f10201i = true;
                throw th2;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}