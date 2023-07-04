package com.stripe.android.paymentsheet;

import android.app.Application;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$viewModelFactory$1 extends kotlin.jvm.internal.u implements h00.a<Application> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$viewModelFactory$1(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Application invoke() {
        Application application = this.this$0.getApplication();
        kotlin.jvm.internal.s.f(application, "application");
        return application;
    }
}