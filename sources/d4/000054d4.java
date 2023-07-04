package com.stripe.android.paymentsheet;

import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.util.List;

/* loaded from: classes6.dex */
final class PaymentMethodsUIKt$PaymentMethodsUI$3$1$1$1$1 extends kotlin.jvm.internal.u implements h00.l<Integer, vz.b0> {
    final /* synthetic */ h00.l<LpmRepository.SupportedPaymentMethod, vz.b0> $onItemSelectedListener;
    final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodsUI$3$1$1$1$1(h00.l<? super LpmRepository.SupportedPaymentMethod, vz.b0> lVar, List<? extends LpmRepository.SupportedPaymentMethod> list) {
        super(1);
        this.$onItemSelectedListener = lVar;
        this.$paymentMethods = list;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Integer num) {
        invoke(num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(int i11) {
        this.$onItemSelectedListener.invoke(this.$paymentMethods.get(i11));
    }
}