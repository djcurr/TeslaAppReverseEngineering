package com.stripe.android.ui.core.elements;

import c1.o0;
import h00.a;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class SimpleDialogElementUIKt$SimpleDialogElementUI$3$3$1$1 extends u implements a<b0> {
    final /* synthetic */ a<b0> $onDismissListener;
    final /* synthetic */ o0<Boolean> $openDialog;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDialogElementUIKt$SimpleDialogElementUI$3$3$1$1(o0<Boolean> o0Var, a<b0> aVar) {
        super(0);
        this.$openDialog = o0Var;
        this.$onDismissListener = aVar;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$openDialog.setValue(Boolean.FALSE);
        this.$onDismissListener.invoke();
    }
}