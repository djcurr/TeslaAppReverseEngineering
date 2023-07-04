package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class USBankAccountFormFragment$completePayment$2 extends u implements h00.a<Boolean> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$completePayment$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    /* renamed from: invoke */
    public final Boolean mo11invoke() {
        BaseSheetViewModel sheetViewModel;
        sheetViewModel = this.this$0.getSheetViewModel();
        return Boolean.valueOf(sheetViewModel instanceof PaymentSheetViewModel);
    }
}