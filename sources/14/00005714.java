package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import c1.i;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$MandateCollectionScreen$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ USBankAccountFormScreenState.MandateCollection $screenState;
    final /* synthetic */ USBankAccountFormFragment $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$MandateCollectionScreen$2(USBankAccountFormFragment uSBankAccountFormFragment, USBankAccountFormScreenState.MandateCollection mandateCollection, int i11) {
        super(2);
        this.$tmp0_rcvr = uSBankAccountFormFragment;
        this.$screenState = mandateCollection;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        this.$tmp0_rcvr.MandateCollectionScreen(this.$screenState, iVar, this.$$changed | 1);
    }
}