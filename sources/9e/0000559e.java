package com.stripe.android.paymentsheet;

import androidx.fragment.app.e0;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class PaymentSheetListFragment extends BasePaymentMethodsListFragment {
    private final vz.k activityViewModel$delegate;
    private final vz.k sheetViewModel$delegate;

    public PaymentSheetListFragment() {
        super(false);
        vz.k a11;
        this.activityViewModel$delegate = e0.a(this, m0.b(PaymentSheetViewModel.class), new PaymentSheetListFragment$special$$inlined$activityViewModels$1(this), new PaymentSheetListFragment$activityViewModel$2(this));
        a11 = vz.m.a(new PaymentSheetListFragment$sheetViewModel$2(this));
        this.sheetViewModel$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetViewModel getActivityViewModel() {
        return (PaymentSheetViewModel) this.activityViewModel$delegate.getValue();
    }

    @Override // com.stripe.android.paymentsheet.BasePaymentMethodsListFragment
    public void transitionToAddPaymentMethod() {
        getActivityViewModel().transitionTo(new PaymentSheetViewModel.TransitionTarget.AddPaymentMethodFull(getConfig()));
    }

    @Override // com.stripe.android.paymentsheet.BasePaymentMethodsListFragment
    public PaymentSheetViewModel getSheetViewModel() {
        return (PaymentSheetViewModel) this.sheetViewModel$delegate.getValue();
    }
}