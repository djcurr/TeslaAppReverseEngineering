package com.stripe.android.paymentsheet;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e0;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class PaymentOptionsListFragment extends BasePaymentMethodsListFragment {
    private final vz.k activityViewModel$delegate;
    private final vz.k sheetViewModel$delegate;

    public PaymentOptionsListFragment() {
        super(true);
        vz.k a11;
        this.activityViewModel$delegate = e0.a(this, m0.b(PaymentOptionsViewModel.class), new PaymentOptionsListFragment$special$$inlined$activityViewModels$1(this), new PaymentOptionsListFragment$activityViewModel$2(this));
        a11 = vz.m.a(new PaymentOptionsListFragment$sheetViewModel$2(this));
        this.sheetViewModel$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentOptionsViewModel getActivityViewModel() {
        return (PaymentOptionsViewModel) this.activityViewModel$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.BasePaymentMethodsListFragment
    public void onPaymentOptionSelected(PaymentSelection paymentSelection, boolean z11) {
        kotlin.jvm.internal.s.g(paymentSelection, "paymentSelection");
        super.onPaymentOptionSelected(paymentSelection, z11);
        if (z11) {
            getSheetViewModel().onUserSelection();
        }
    }

    @Override // com.stripe.android.paymentsheet.BasePaymentMethodsListFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        getSheetViewModel().resolveTransitionTarget(getConfig());
    }

    @Override // com.stripe.android.paymentsheet.BasePaymentMethodsListFragment
    public void transitionToAddPaymentMethod() {
        getActivityViewModel().transitionTo(new PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodFull(getConfig()));
    }

    @Override // com.stripe.android.paymentsheet.BasePaymentMethodsListFragment
    public PaymentOptionsViewModel getSheetViewModel() {
        return (PaymentOptionsViewModel) this.sheetViewModel$delegate.getValue();
    }
}