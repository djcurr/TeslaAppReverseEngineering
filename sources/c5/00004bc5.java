package com.stripe.android;

import com.stripe.android.model.PaymentMethod;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes2.dex */
final class PaymentSessionViewModel$onCustomerRetrieved$1 extends u implements l<PaymentMethod, b0> {
    final /* synthetic */ h00.a<b0> $onComplete;
    final /* synthetic */ PaymentSessionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSessionViewModel$onCustomerRetrieved$1(h00.a<b0> aVar, PaymentSessionViewModel paymentSessionViewModel) {
        super(1);
        this.$onComplete = aVar;
        this.this$0 = paymentSessionViewModel;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(PaymentMethod paymentMethod) {
        invoke2(paymentMethod);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentMethod paymentMethod) {
        PaymentSessionData copy;
        if (paymentMethod != null) {
            PaymentSessionViewModel paymentSessionViewModel = this.this$0;
            copy = r1.copy((r22 & 1) != 0 ? r1.isShippingInfoRequired : false, (r22 & 2) != 0 ? r1.isShippingMethodRequired : false, (r22 & 4) != 0 ? r1.cartTotal : 0L, (r22 & 8) != 0 ? r1.shippingTotal : 0L, (r22 & 16) != 0 ? r1.shippingInformation : null, (r22 & 32) != 0 ? r1.shippingMethod : null, (r22 & 64) != 0 ? r1.paymentMethod : paymentMethod, (r22 & 128) != 0 ? paymentSessionViewModel.getPaymentSessionData().useGooglePay : false);
            paymentSessionViewModel.setPaymentSessionData(copy);
        }
        this.$onComplete.invoke();
    }
}