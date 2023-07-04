package com.stripe.android.paymentsheet.viewmodels;

import androidx.lifecycle.f0;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BaseSheetViewModel$payWithLink$1$1 extends u implements l<Boolean, b0> {
    final /* synthetic */ PaymentMethodCreateParams $params;
    final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$payWithLink$1$1(BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, PaymentMethodCreateParams paymentMethodCreateParams) {
        super(1);
        this.this$0 = baseSheetViewModel;
        this.$params = paymentMethodCreateParams;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return b0.f54756a;
    }

    public final void invoke(boolean z11) {
        f0 f0Var;
        this.this$0.setLinkVerificationCallback(null);
        f0Var = ((BaseSheetViewModel) this.this$0)._showLinkVerificationDialog;
        Boolean bool = Boolean.FALSE;
        f0Var.setValue(bool);
        if (z11) {
            this.this$0.createLinkPaymentDetails(this.$params);
            return;
        }
        this.this$0.getSavedStateHandle().h(BaseSheetViewModel.SAVE_PROCESSING, bool);
        this.this$0.updatePrimaryButtonState(PrimaryButton.State.Ready.INSTANCE);
    }
}