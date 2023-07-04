package com.stripe.android.paymentsheet;

import android.os.Parcelable;
import com.stripe.android.paymentsheet.PaymentSheetContract;

/* loaded from: classes6.dex */
final class PaymentSheetAddPaymentMethodFragment$viewModelFactory$2 extends kotlin.jvm.internal.u implements h00.a<PaymentSheetContract.Args> {
    final /* synthetic */ PaymentSheetAddPaymentMethodFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetAddPaymentMethodFragment$viewModelFactory$2(PaymentSheetAddPaymentMethodFragment paymentSheetAddPaymentMethodFragment) {
        super(0);
        this.this$0 = paymentSheetAddPaymentMethodFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PaymentSheetContract.Args invoke() {
        Parcelable parcelable = this.this$0.requireArguments().getParcelable("com.stripe.android.paymentsheet.extra_starter_args");
        if (parcelable != null) {
            return (PaymentSheetContract.Args) parcelable;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}