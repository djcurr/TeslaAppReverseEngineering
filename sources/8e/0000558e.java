package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.s0;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class PaymentSheetAddPaymentMethodFragment extends BaseAddPaymentMethodFragment {
    private final vz.k sheetViewModel$delegate;
    private final s0.b viewModelFactory;

    public PaymentSheetAddPaymentMethodFragment() {
        Intent intent;
        PaymentSheetAddPaymentMethodFragment$viewModelFactory$1 paymentSheetAddPaymentMethodFragment$viewModelFactory$1 = new PaymentSheetAddPaymentMethodFragment$viewModelFactory$1(this);
        PaymentSheetAddPaymentMethodFragment$viewModelFactory$2 paymentSheetAddPaymentMethodFragment$viewModelFactory$2 = new PaymentSheetAddPaymentMethodFragment$viewModelFactory$2(this);
        androidx.savedstate.c activity = getActivity();
        Bundle bundle = null;
        androidx.savedstate.c cVar = activity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) activity : null;
        cVar = cVar == null ? this : cVar;
        androidx.fragment.app.h activity2 = getActivity();
        androidx.appcompat.app.d dVar = activity2 instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) activity2 : null;
        if (dVar != null && (intent = dVar.getIntent()) != null) {
            bundle = intent.getExtras();
        }
        this.viewModelFactory = new PaymentSheetViewModel.Factory(paymentSheetAddPaymentMethodFragment$viewModelFactory$1, paymentSheetAddPaymentMethodFragment$viewModelFactory$2, cVar, bundle);
        this.sheetViewModel$delegate = e0.a(this, m0.b(PaymentSheetViewModel.class), new PaymentSheetAddPaymentMethodFragment$special$$inlined$activityViewModels$1(this), new PaymentSheetAddPaymentMethodFragment$sheetViewModel$2(this));
    }

    public static /* synthetic */ void b(PaymentSheetAddPaymentMethodFragment paymentSheetAddPaymentMethodFragment, Boolean bool) {
        m323onViewCreated$lambda0(paymentSheetAddPaymentMethodFragment, bool);
    }

    /* renamed from: onViewCreated$lambda-0 */
    public static final void m323onViewCreated$lambda0(PaymentSheetAddPaymentMethodFragment this$0, Boolean visible) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        f0<String> headerText$paymentsheet_release = this$0.getSheetViewModel().getHeaderText$paymentsheet_release();
        kotlin.jvm.internal.s.f(visible, "visible");
        headerText$paymentsheet_release.setValue(visible.booleanValue() ? null : this$0.getString(R.string.stripe_paymentsheet_add_payment_method_title));
    }

    @Override // com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment
    public s0.b getViewModelFactory() {
        return this.viewModelFactory;
    }

    @Override // com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        getSheetViewModel().getShowTopContainer$paymentsheet_release().observe(getViewLifecycleOwner(), new g0() { // from class: com.stripe.android.paymentsheet.b0
            {
                PaymentSheetAddPaymentMethodFragment.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentSheetAddPaymentMethodFragment.b(PaymentSheetAddPaymentMethodFragment.this, (Boolean) obj);
            }
        });
    }

    @Override // com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment
    public PaymentSheetViewModel getSheetViewModel() {
        return (PaymentSheetViewModel) this.sheetViewModel$delegate.getValue();
    }
}