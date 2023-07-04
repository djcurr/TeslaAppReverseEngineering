package com.stripe.android.paymentsheet;

import c1.n1;
import c1.v1;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BaseAddPaymentMethodFragment$setupRecyclerView$1$1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ LpmRepository.SupportedPaymentMethod $initialSelectedItem;
    final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;
    final /* synthetic */ BaseAddPaymentMethodFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment$setupRecyclerView$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.l<LpmRepository.SupportedPaymentMethod, vz.b0> {
        final /* synthetic */ BaseAddPaymentMethodFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BaseAddPaymentMethodFragment baseAddPaymentMethodFragment) {
            super(1);
            this.this$0 = baseAddPaymentMethodFragment;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(LpmRepository.SupportedPaymentMethod supportedPaymentMethod) {
            invoke2(supportedPaymentMethod);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LpmRepository.SupportedPaymentMethod selectedLpm) {
            kotlin.jvm.internal.s.g(selectedLpm, "selectedLpm");
            if (kotlin.jvm.internal.s.c(this.this$0.getSheetViewModel().getAddFragmentSelectedLPM$paymentsheet_release(), selectedLpm)) {
                return;
            }
            this.this$0.onPaymentMethodSelected$paymentsheet_release(selectedLpm);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseAddPaymentMethodFragment$setupRecyclerView$1$1(BaseAddPaymentMethodFragment baseAddPaymentMethodFragment, LpmRepository.SupportedPaymentMethod supportedPaymentMethod, List<? extends LpmRepository.SupportedPaymentMethod> list) {
        super(2);
        this.this$0 = baseAddPaymentMethodFragment;
        this.$initialSelectedItem = supportedPaymentMethod;
        this.$paymentMethods = list;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    private static final boolean m289invoke$lambda0(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    private static final LpmRepository.SupportedPaymentMethod m290invoke$lambda1(v1<? extends LpmRepository.SupportedPaymentMethod> v1Var) {
        return v1Var.getValue();
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        v1 a11 = n1.a(androidx.lifecycle.l.a(this.this$0.getSheetViewModel().getProcessing()), Boolean.FALSE, null, iVar, 56, 2);
        v1 a12 = n1.a(androidx.lifecycle.l.a(this.this$0.getSheetViewModel().getAddFragmentSelectedLpm()), this.$initialSelectedItem, null, iVar, (LpmRepository.SupportedPaymentMethod.$stable << 3) | 8, 2);
        PaymentMethodsUIKt.PaymentMethodsUI(this.$paymentMethods, this.$paymentMethods.indexOf(m290invoke$lambda1(a12)), !m289invoke$lambda0(a11), new AnonymousClass1(this.this$0), iVar, 8);
    }
}