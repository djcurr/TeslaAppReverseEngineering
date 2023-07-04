package com.stripe.android.googlepaylauncher;

import com.stripe.android.PaymentConfiguration;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class StripeGooglePayActivity$publishableKey$2 extends u implements h00.a<String> {
    final /* synthetic */ StripeGooglePayActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayActivity$publishableKey$2(StripeGooglePayActivity stripeGooglePayActivity) {
        super(0);
        this.this$0 = stripeGooglePayActivity;
    }

    @Override // h00.a
    public final String invoke() {
        return PaymentConfiguration.Companion.getInstance(this.this$0).getPublishableKey();
    }
}