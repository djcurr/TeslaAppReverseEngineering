package com.stripe.android.view;

import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;

/* loaded from: classes6.dex */
final class PaymentAuthWebViewActivity$logger$2 extends kotlin.jvm.internal.u implements h00.a<Logger> {
    final /* synthetic */ PaymentAuthWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$logger$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(0);
        this.this$0 = paymentAuthWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Logger invoke() {
        PaymentBrowserAuthContract.Args args;
        Logger.Companion companion = Logger.Companion;
        args = this.this$0.get_args();
        boolean z11 = false;
        if (args != null && args.getEnableLogging()) {
            z11 = true;
        }
        return companion.getInstance(z11);
    }
}