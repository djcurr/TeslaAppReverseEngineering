package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$NameAndEmailForm$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $email;
    final /* synthetic */ String $name;
    final /* synthetic */ USBankAccountFormFragment $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$NameAndEmailForm$2(USBankAccountFormFragment uSBankAccountFormFragment, String str, String str2, int i11) {
        super(2);
        this.$tmp0_rcvr = uSBankAccountFormFragment;
        this.$name = str;
        this.$email = str2;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        this.$tmp0_rcvr.NameAndEmailForm(this.$name, this.$email, iVar, this.$$changed | 1);
    }
}