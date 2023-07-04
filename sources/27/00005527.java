package com.stripe.android.paymentsheet;

import androidx.fragment.app.e0;
import androidx.lifecycle.s0;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class PaymentOptionsAddPaymentMethodFragment extends BaseAddPaymentMethodFragment {
    private final vz.k sheetViewModel$delegate;
    private final s0.b viewModelFactory;

    public PaymentOptionsAddPaymentMethodFragment() {
        PaymentOptionsAddPaymentMethodFragment$viewModelFactory$1 paymentOptionsAddPaymentMethodFragment$viewModelFactory$1 = new PaymentOptionsAddPaymentMethodFragment$viewModelFactory$1(this);
        PaymentOptionsAddPaymentMethodFragment$viewModelFactory$2 paymentOptionsAddPaymentMethodFragment$viewModelFactory$2 = new PaymentOptionsAddPaymentMethodFragment$viewModelFactory$2(this);
        androidx.savedstate.c activity = getActivity();
        androidx.savedstate.c cVar = activity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) activity : null;
        this.viewModelFactory = new PaymentOptionsViewModel.Factory(paymentOptionsAddPaymentMethodFragment$viewModelFactory$1, paymentOptionsAddPaymentMethodFragment$viewModelFactory$2, cVar == null ? this : cVar, null, 8, null);
        this.sheetViewModel$delegate = e0.a(this, m0.b(PaymentOptionsViewModel.class), new PaymentOptionsAddPaymentMethodFragment$special$$inlined$activityViewModels$1(this), new PaymentOptionsAddPaymentMethodFragment$sheetViewModel$2(this));
    }

    @Override // com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment
    public s0.b getViewModelFactory() {
        return this.viewModelFactory;
    }

    @Override // com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment
    public PaymentOptionsViewModel getSheetViewModel() {
        return (PaymentOptionsViewModel) this.sheetViewModel$delegate.getValue();
    }
}