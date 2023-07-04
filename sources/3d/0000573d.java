package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$updatePrimaryButton$1 extends u implements h00.a<b0> {
    final /* synthetic */ h00.a<b0> $onClick;
    final /* synthetic */ boolean $shouldProcess;
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$updatePrimaryButton$1(boolean z11, USBankAccountFormFragment uSBankAccountFormFragment, h00.a<b0> aVar) {
        super(0);
        this.$shouldProcess = z11;
        this.this$0 = uSBankAccountFormFragment;
        this.$onClick = aVar;
    }

    @Override // h00.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo11invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
        r0 = r10.this$0.getSheetViewModel();
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2() {
        /*
            r10 = this;
            boolean r0 = r10.$shouldProcess
            if (r0 == 0) goto L12
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment r0 = r10.this$0
            com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel r0 = com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.access$getSheetViewModel(r0)
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            com.stripe.android.paymentsheet.ui.PrimaryButton$State$StartProcessing r1 = com.stripe.android.paymentsheet.ui.PrimaryButton.State.StartProcessing.INSTANCE
            r0.updatePrimaryButtonState(r1)
        L12:
            h00.a<vz.b0> r0 = r10.$onClick
            r0.mo11invoke()
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment r0 = r10.this$0
            com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel r0 = com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.access$getSheetViewModel(r0)
            if (r0 != 0) goto L20
            goto L49
        L20:
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment r1 = r10.this$0
            com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel r1 = com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.access$getSheetViewModel(r1)
            r2 = 0
            if (r1 != 0) goto L2a
            goto L46
        L2a:
            androidx.lifecycle.LiveData r1 = r1.getPrimaryButtonUIState()
            if (r1 != 0) goto L31
            goto L46
        L31:
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            com.stripe.android.paymentsheet.ui.PrimaryButton$UIState r3 = (com.stripe.android.paymentsheet.ui.PrimaryButton.UIState) r3
            if (r3 != 0) goto L3b
            goto L46
        L3b:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 13
            r9 = 0
            com.stripe.android.paymentsheet.ui.PrimaryButton$UIState r2 = com.stripe.android.paymentsheet.ui.PrimaryButton.UIState.copy$default(r3, r4, r5, r6, r7, r8, r9)
        L46:
            r0.updatePrimaryButtonUIState(r2)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$updatePrimaryButton$1.invoke2():void");
    }
}