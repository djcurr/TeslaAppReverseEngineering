package com.stripe.android.view;

import android.content.Intent;
import com.stripe.android.auth.PaymentBrowserAuthContract;

/* loaded from: classes6.dex */
final class PaymentAuthWebViewActivity$_args$2 extends kotlin.jvm.internal.u implements h00.a<PaymentBrowserAuthContract.Args> {
    final /* synthetic */ PaymentAuthWebViewActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$_args$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(0);
        this.this$0 = paymentAuthWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentBrowserAuthContract.Args invoke() {
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.Companion;
        Intent intent = this.this$0.getIntent();
        kotlin.jvm.internal.s.f(intent, "intent");
        return companion.parseArgs$payments_core_release(intent);
    }
}