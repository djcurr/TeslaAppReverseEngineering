package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import c1.o0;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class USBankAccountFormFragment$AccountDetailsForm$2$2$1 extends u implements h00.a<b0> {
    final /* synthetic */ o0<Boolean> $openDialog;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$AccountDetailsForm$2$2$1(o0<Boolean> o0Var) {
        super(0);
        this.$openDialog = o0Var;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$openDialog.setValue(Boolean.FALSE);
    }
}