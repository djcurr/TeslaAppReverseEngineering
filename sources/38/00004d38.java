package com.stripe.android.financialconnections;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.d;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetRedirectActivity extends d {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent flags = new Intent(this, FinancialConnectionsSheetActivity.class).setFlags(603979776);
        flags.setData(getIntent().getData());
        startActivity(flags);
        finish();
    }
}