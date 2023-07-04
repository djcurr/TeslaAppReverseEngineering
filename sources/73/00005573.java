package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSheetViewState;

/* loaded from: classes6.dex */
final class PaymentSheetActivity$buyButtonStateObserver$1 extends kotlin.jvm.internal.u implements h00.l<PaymentSheetViewState, vz.b0> {
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$buyButtonStateObserver$1(PaymentSheetActivity paymentSheetActivity) {
        super(1);
        this.this$0 = paymentSheetActivity;
    }

    @Override // h00.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ vz.b0 mo12invoke(PaymentSheetViewState paymentSheetViewState) {
        invoke2(paymentSheetViewState);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentSheetViewState paymentSheetViewState) {
        PaymentSheetActivity paymentSheetActivity = this.this$0;
        paymentSheetActivity.updateErrorMessage(paymentSheetActivity.getMessageView(), paymentSheetViewState == null ? null : paymentSheetViewState.getErrorMessage());
        this.this$0.getViewBinding$paymentsheet_release().buyButton.updateState(paymentSheetViewState != null ? PaymentSheetViewModelKt.convert(paymentSheetViewState) : null);
    }
}