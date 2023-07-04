package com.stripe.android.link.ui.paymentmethod;

import c1.v1;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentMethodScreenKt$PaymentMethodBody$1 extends u implements a<b0> {
    final /* synthetic */ v1<Map<IdentifierSpec, FormFieldEntry>> $formValues$delegate;
    final /* synthetic */ PaymentMethodViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodScreenKt$PaymentMethodBody$1(v1<? extends Map<IdentifierSpec, FormFieldEntry>> v1Var, PaymentMethodViewModel paymentMethodViewModel) {
        super(0);
        this.$formValues$delegate = v1Var;
        this.$viewModel = paymentMethodViewModel;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<IdentifierSpec, FormFieldEntry> m223PaymentMethodBody$lambda0;
        m223PaymentMethodBody$lambda0 = PaymentMethodScreenKt.m223PaymentMethodBody$lambda0(this.$formValues$delegate);
        if (m223PaymentMethodBody$lambda0 == null) {
            return;
        }
        this.$viewModel.startPayment(m223PaymentMethodBody$lambda0);
    }
}