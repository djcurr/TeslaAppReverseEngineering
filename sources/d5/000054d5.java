package com.stripe.android.paymentsheet;

import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentMethodsUIKt$PaymentMethodsUI$4 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ h00.l<LpmRepository.SupportedPaymentMethod, vz.b0> $onItemSelectedListener;
    final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;
    final /* synthetic */ int $selectedIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodsUI$4(List<? extends LpmRepository.SupportedPaymentMethod> list, int i11, boolean z11, h00.l<? super LpmRepository.SupportedPaymentMethod, vz.b0> lVar, int i12) {
        super(2);
        this.$paymentMethods = list;
        this.$selectedIndex = i11;
        this.$isEnabled = z11;
        this.$onItemSelectedListener = lVar;
        this.$$changed = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        PaymentMethodsUIKt.PaymentMethodsUI(this.$paymentMethods, this.$selectedIndex, this.$isEnabled, this.$onItemSelectedListener, iVar, this.$$changed | 1);
    }
}