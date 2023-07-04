package com.stripe.android.view;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
final class AddPaymentMethodActivity$stripe$2 extends kotlin.jvm.internal.u implements h00.a<Stripe> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$stripe$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Stripe invoke() {
        AddPaymentMethodActivityStarter.Args args;
        args = this.this$0.getArgs();
        PaymentConfiguration paymentConfiguration$payments_core_release = args.getPaymentConfiguration$payments_core_release();
        if (paymentConfiguration$payments_core_release == null) {
            paymentConfiguration$payments_core_release = PaymentConfiguration.Companion.getInstance(this.this$0);
        }
        Context applicationContext = this.this$0.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "applicationContext");
        return new Stripe(applicationContext, paymentConfiguration$payments_core_release.getPublishableKey(), paymentConfiguration$payments_core_release.getStripeAccountId(), false, (Set) null, 24, (DefaultConstructorMarker) null);
    }
}