package com.stripe.android.link.ui.wallet;

import c1.i;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletModalsKt$WalletBottomSheetContent$6 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ a<b0> $onCancelClick;
    final /* synthetic */ a<b0> $onEditClick;
    final /* synthetic */ a<b0> $onRemoveClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletModalsKt$WalletBottomSheetContent$6(a<b0> aVar, a<b0> aVar2, a<b0> aVar3, int i11) {
        super(2);
        this.$onCancelClick = aVar;
        this.$onEditClick = aVar2;
        this.$onRemoveClick = aVar3;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        WalletModalsKt.WalletBottomSheetContent(this.$onCancelClick, this.$onEditClick, this.$onRemoveClick, iVar, this.$$changed | 1);
    }
}