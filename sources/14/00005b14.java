package com.stripe.android.ui.core.elements;

import c1.v1;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2 extends u implements l<Boolean, b0> {
    final /* synthetic */ v1<Boolean> $checked$delegate;
    final /* synthetic */ SaveForFutureUseController $controller;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$2(SaveForFutureUseController saveForFutureUseController, v1<Boolean> v1Var) {
        super(1);
        this.$controller = saveForFutureUseController;
        this.$checked$delegate = v1Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return b0.f54756a;
    }

    public final void invoke(boolean z11) {
        boolean m472SaveForFutureUseElementUI$lambda0;
        SaveForFutureUseController saveForFutureUseController = this.$controller;
        m472SaveForFutureUseElementUI$lambda0 = SaveForFutureUseElementUIKt.m472SaveForFutureUseElementUI$lambda0(this.$checked$delegate);
        saveForFutureUseController.onValueChange(!m472SaveForFutureUseElementUI$lambda0);
    }
}