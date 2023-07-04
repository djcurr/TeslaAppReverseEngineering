package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import com.stripe.android.payments.PaymentFlowResult;

/* loaded from: classes6.dex */
public final class PaymentRelayActivity extends androidx.appcompat.app.d {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(-1, new Intent().putExtras(PaymentFlowResult.Unvalidated.Companion.fromIntent(getIntent()).toBundle()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        finish();
    }
}