package com.stripe.android.link.ui.wallet;

import c1.i;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletModalsKt$ConfirmRemoveDialog$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ l<Boolean, b0> $onDialogDismissed;
    final /* synthetic */ boolean $showDialog;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletModalsKt$ConfirmRemoveDialog$4(boolean z11, l<? super Boolean, b0> lVar, int i11) {
        super(2);
        this.$showDialog = z11;
        this.$onDialogDismissed = lVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        WalletModalsKt.ConfirmRemoveDialog(this.$showDialog, this.$onDialogDismissed, iVar, this.$$changed | 1);
    }
}