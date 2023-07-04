package com.stripe.android.googlepaylauncher;

import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.googlepaylauncher.StripeGooglePayContract;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class StripeGooglePayActivity$paymentsClient$2 extends u implements h00.a<PaymentsClient> {
    final /* synthetic */ StripeGooglePayActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayActivity$paymentsClient$2(StripeGooglePayActivity stripeGooglePayActivity) {
        super(0);
        this.this$0 = stripeGooglePayActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentsClient invoke() {
        StripeGooglePayContract.Args args;
        PaymentsClientFactory paymentsClientFactory = new PaymentsClientFactory(this.this$0);
        args = this.this$0.args;
        if (args == null) {
            s.x("args");
            args = null;
        }
        return paymentsClientFactory.create(args.getConfig().getEnvironment());
    }
}