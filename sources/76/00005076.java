package com.stripe.android.link.ui.wallet;

import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class WalletModalsKt$ConfirmRemoveDialog$3$1$1 extends u implements a<b0> {
    final /* synthetic */ l<Boolean, b0> $onDialogDismissed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletModalsKt$ConfirmRemoveDialog$3$1$1(l<? super Boolean, b0> lVar) {
        super(0);
        this.$onDialogDismissed = lVar;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDialogDismissed.invoke(Boolean.FALSE);
    }
}