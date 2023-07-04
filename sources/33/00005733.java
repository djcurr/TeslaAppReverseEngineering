package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$renderNameAndEmailCollectionScreen$3 extends u implements h00.a<b0> {
    final /* synthetic */ USBankAccountFormScreenState.NameAndEmailCollection $screenState;
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$renderNameAndEmailCollectionScreen$3(USBankAccountFormFragment uSBankAccountFormFragment, USBankAccountFormScreenState.NameAndEmailCollection nameAndEmailCollection) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
        this.$screenState = nameAndEmailCollection;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        USBankAccountFormViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.handlePrimaryButtonClick(this.$screenState);
    }
}