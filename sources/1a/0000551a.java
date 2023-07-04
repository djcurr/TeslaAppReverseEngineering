package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionsAdapter;
import com.stripe.android.paymentsheet.model.SavedSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentOptionsAdapter$onCreateViewHolder$3 extends kotlin.jvm.internal.u implements h00.l<Integer, vz.b0> {
    final /* synthetic */ PaymentOptionsAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapter$onCreateViewHolder$3(PaymentOptionsAdapter paymentOptionsAdapter) {
        super(1);
        this.this$0 = paymentOptionsAdapter;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Integer num) {
        invoke(num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(int i11) {
        SavedSelection savedSelection;
        int findInitialSelectedPosition;
        PaymentOptionsAdapter paymentOptionsAdapter = this.this$0;
        savedSelection = paymentOptionsAdapter.savedSelection;
        findInitialSelectedPosition = paymentOptionsAdapter.findInitialSelectedPosition(savedSelection);
        paymentOptionsAdapter.onItemSelected$paymentsheet_release(findInitialSelectedPosition, false, true);
        this.this$0.getPaymentMethodDeleteListener().invoke((PaymentOptionsAdapter.Item.SavedPaymentMethod) this.this$0.getItems$paymentsheet_release().get(i11));
        this.this$0.notifyItemRemoved(i11);
    }
}