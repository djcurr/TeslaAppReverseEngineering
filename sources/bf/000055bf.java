package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModelKt {
    public static final PrimaryButton.State convert(PaymentSheetViewState paymentSheetViewState) {
        kotlin.jvm.internal.s.g(paymentSheetViewState, "<this>");
        if (paymentSheetViewState instanceof PaymentSheetViewState.Reset) {
            return PrimaryButton.State.Ready.INSTANCE;
        }
        if (paymentSheetViewState instanceof PaymentSheetViewState.StartProcessing) {
            return PrimaryButton.State.StartProcessing.INSTANCE;
        }
        if (paymentSheetViewState instanceof PaymentSheetViewState.FinishProcessing) {
            return new PrimaryButton.State.FinishProcessing(((PaymentSheetViewState.FinishProcessing) paymentSheetViewState).getOnComplete());
        }
        throw new NoWhenBranchMatchedException();
    }
}