package com.stripe.android.payments.paymentlauncher;

import android.app.Application;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class PaymentLauncherConfirmationActivity$viewModelFactory$2 extends u implements h00.a<Application> {
    final /* synthetic */ PaymentLauncherConfirmationActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherConfirmationActivity$viewModelFactory$2(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
        super(0);
        this.this$0 = paymentLauncherConfirmationActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Application invoke() {
        Application application = this.this$0.getApplication();
        s.f(application, "application");
        return application;
    }
}