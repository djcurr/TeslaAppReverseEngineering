package com.stripe.android.paymentsheet;

import android.os.Parcelable;
import com.stripe.android.paymentsheet.PaymentOptionContract;

/* loaded from: classes6.dex */
final class PaymentOptionsAddPaymentMethodFragment$viewModelFactory$2 extends kotlin.jvm.internal.u implements h00.a<PaymentOptionContract.Args> {
    final /* synthetic */ PaymentOptionsAddPaymentMethodFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAddPaymentMethodFragment$viewModelFactory$2(PaymentOptionsAddPaymentMethodFragment paymentOptionsAddPaymentMethodFragment) {
        super(0);
        this.this$0 = paymentOptionsAddPaymentMethodFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentOptionContract.Args invoke() {
        Parcelable parcelable = this.this$0.requireArguments().getParcelable("com.stripe.android.paymentsheet.extra_starter_args");
        if (parcelable != null) {
            return (PaymentOptionContract.Args) parcelable;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}