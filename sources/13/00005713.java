package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$AccountDetailsForm$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $bankName;
    final /* synthetic */ String $last4;
    final /* synthetic */ boolean $saveForFutureUsage;
    final /* synthetic */ USBankAccountFormFragment $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$AccountDetailsForm$3(USBankAccountFormFragment uSBankAccountFormFragment, String str, String str2, boolean z11, int i11) {
        super(2);
        this.$tmp0_rcvr = uSBankAccountFormFragment;
        this.$bankName = str;
        this.$last4 = str2;
        this.$saveForFutureUsage = z11;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        this.$tmp0_rcvr.AccountDetailsForm(this.$bankName, this.$last4, this.$saveForFutureUsage, iVar, this.$$changed | 1);
    }
}