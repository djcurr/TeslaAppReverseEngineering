package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheetResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentSheetViewModel$processPayment$3 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$processPayment$3(PaymentSheetViewModel paymentSheetViewModel) {
        super(0);
        this.this$0 = paymentSheetViewModel;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ vz.b0 invoke() {
        invoke2();
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.get_paymentSheetResult$paymentsheet_release().setValue(PaymentSheetResult.Completed.INSTANCE);
    }
}