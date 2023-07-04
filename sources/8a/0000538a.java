package com.stripe.android.payments;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.lifecycle.r0;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import f.f;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.k;

/* loaded from: classes6.dex */
public final class StripeBrowserLauncherActivity extends d {
    private final k viewModel$delegate = new r0(m0.b(StripeBrowserLauncherViewModel.class), new StripeBrowserLauncherActivity$special$$inlined$viewModels$2(this), new StripeBrowserLauncherActivity$viewModel$2(this));

    private final StripeBrowserLauncherViewModel getViewModel() {
        return (StripeBrowserLauncherViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void h(StripeBrowserLauncherActivity stripeBrowserLauncherActivity, androidx.activity.result.a aVar) {
        stripeBrowserLauncherActivity.onResult(aVar);
    }

    public final void onResult(androidx.activity.result.a aVar) {
        finish();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.Companion;
        Intent intent = getIntent();
        s.f(intent, "intent");
        PaymentBrowserAuthContract.Args parseArgs$payments_core_release = companion.parseArgs$payments_core_release(intent);
        if (parseArgs$payments_core_release == null) {
            finish();
            return;
        }
        setResult(-1, getViewModel().getResultIntent(parseArgs$payments_core_release));
        if (getViewModel().getHasLaunched()) {
            finish();
            return;
        }
        androidx.activity.result.d registerForActivityResult = registerForActivityResult(new f(), new androidx.activity.result.b() { // from class: com.stripe.android.payments.c
            {
                StripeBrowserLauncherActivity.this = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                StripeBrowserLauncherActivity.h(StripeBrowserLauncherActivity.this, (androidx.activity.result.a) obj);
            }
        });
        s.f(registerForActivityResult, "registerForActivityResul… ::onResult\n            )");
        registerForActivityResult.b(getViewModel().createLaunchIntent(parseArgs$payments_core_release));
        getViewModel().setHasLaunched(true);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}