package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import c1.o0;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$AccountDetailsForm$2$1 extends u implements h00.a<b0> {
    final /* synthetic */ o0<Boolean> $openDialog;
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$AccountDetailsForm$2$1(o0<Boolean> o0Var, USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.$openDialog = o0Var;
        this.this$0 = uSBankAccountFormFragment;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        USBankAccountFormViewModel viewModel;
        this.$openDialog.setValue(Boolean.FALSE);
        viewModel = this.this$0.getViewModel();
        USBankAccountFormViewModel.reset$default(viewModel, null, 1, null);
    }
}