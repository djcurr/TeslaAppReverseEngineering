package com.stripe.android.link.ui.wallet;

import c1.i;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;
import y0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletModalsKt$ConfirmRemoveDialog$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ l<Boolean, b0> $onDialogDismissed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletModalsKt$ConfirmRemoveDialog$2(l<? super Boolean, b0> lVar, int i11) {
        super(2);
        this.$onDialogDismissed = lVar;
        this.$$dirty = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [c1.i] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        l<Boolean, b0> lVar = this.$onDialogDismissed;
        iVar.x(-3686930);
        boolean O = iVar.O(lVar);
        Object y11 = iVar.y();
        if (O || y11 == i.f8486a.a()) {
            y11 = new WalletModalsKt$ConfirmRemoveDialog$2$1$1(lVar);
            iVar.p(y11);
        }
        iVar.N();
        f.c(y11, null, false, null, null, null, null, null, null, ComposableSingletons$WalletModalsKt.INSTANCE.m242getLambda1$link_release(), iVar, 805306368, 510);
    }
}