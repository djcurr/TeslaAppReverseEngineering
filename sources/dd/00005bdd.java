package com.stripe.android.view;

import androidx.lifecycle.s0;
import com.stripe.android.Stripe;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.AddPaymentMethodViewModel;

/* loaded from: classes6.dex */
final class AddPaymentMethodActivity$viewModel$2 extends kotlin.jvm.internal.u implements h00.a<s0.b> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$viewModel$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        Stripe stripe;
        AddPaymentMethodActivityStarter.Args args;
        stripe = this.this$0.getStripe();
        args = this.this$0.getArgs();
        return new AddPaymentMethodViewModel.Factory(stripe, args);
    }
}