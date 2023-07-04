package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class PaymentLauncherConfirmationActivity$viewModelFactory$1 extends u implements h00.a<PaymentLauncherContract.Args> {
    final /* synthetic */ PaymentLauncherConfirmationActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherConfirmationActivity$viewModelFactory$1(PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity) {
        super(0);
        this.this$0 = paymentLauncherConfirmationActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentLauncherContract.Args invoke() {
        PaymentLauncherContract.Args starterArgs;
        starterArgs = this.this$0.getStarterArgs();
        if (starterArgs != null) {
            return starterArgs;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}