package com.stripe.android.ui.core.elements;

import c1.i;
import c1.o0;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SimpleDialogElementUIKt$SimpleDialogElementUI$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $confirmText;
    final /* synthetic */ String $dismissText;
    final /* synthetic */ String $messageText;
    final /* synthetic */ a<b0> $onConfirmListener;
    final /* synthetic */ a<b0> $onDismissListener;
    final /* synthetic */ o0<Boolean> $openDialog;
    final /* synthetic */ String $titleText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDialogElementUIKt$SimpleDialogElementUI$4(o0<Boolean> o0Var, String str, String str2, String str3, String str4, a<b0> aVar, a<b0> aVar2, int i11, int i12) {
        super(2);
        this.$openDialog = o0Var;
        this.$titleText = str;
        this.$messageText = str2;
        this.$confirmText = str3;
        this.$dismissText = str4;
        this.$onConfirmListener = aVar;
        this.$onDismissListener = aVar2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        SimpleDialogElementUIKt.SimpleDialogElementUI(this.$openDialog, this.$titleText, this.$messageText, this.$confirmText, this.$dismissText, this.$onConfirmListener, this.$onDismissListener, iVar, this.$$changed | 1, this.$$default);
    }
}