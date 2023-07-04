package com.stripe.android.link.ui.paymentmethod;

import com.stripe.android.link.ui.forms.FormUIKt;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p0.i;
import vz.b0;

/* loaded from: classes6.dex */
final class PaymentMethodScreenKt$PaymentMethodBody$3 extends u implements q<i, c1.i, Integer, b0> {
    final /* synthetic */ PaymentMethodViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodScreenKt$PaymentMethodBody$3(PaymentMethodViewModel paymentMethodViewModel) {
        super(3);
        this.$viewModel = paymentMethodViewModel;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i PaymentMethodBody, c1.i iVar, int i11) {
        s.g(PaymentMethodBody, "$this$PaymentMethodBody");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
        } else {
            FormUIKt.Form(this.$viewModel.getFormController(), this.$viewModel.isEnabled(), iVar, 72);
        }
    }
}