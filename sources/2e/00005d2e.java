package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodSwipeCallback;

/* loaded from: classes6.dex */
public final class SwipeToDeleteCallbackListener implements PaymentMethodSwipeCallback.Listener {
    private final DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory;

    public SwipeToDeleteCallbackListener(DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory) {
        kotlin.jvm.internal.s.g(deletePaymentMethodDialogFactory, "deletePaymentMethodDialogFactory");
        this.deletePaymentMethodDialogFactory = deletePaymentMethodDialogFactory;
    }

    @Override // com.stripe.android.view.PaymentMethodSwipeCallback.Listener
    public void onSwiped(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        this.deletePaymentMethodDialogFactory.create(paymentMethod).show();
    }
}