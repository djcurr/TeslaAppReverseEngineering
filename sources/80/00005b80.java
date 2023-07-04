package com.stripe.android.ui.core.elements;

import c1.i;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class TextFieldUIKt$TextField$10 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ f $modifier;
    final /* synthetic */ l<TextFieldState, b0> $onTextStateChanged;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextField$10(TextFieldController textFieldController, f fVar, int i11, boolean z11, l<? super TextFieldState, b0> lVar, int i12, int i13) {
        super(2);
        this.$textFieldController = textFieldController;
        this.$modifier = fVar;
        this.$imeAction = i11;
        this.$enabled = z11;
        this.$onTextStateChanged = lVar;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        TextFieldUIKt.m477TextFieldPwfN4xk(this.$textFieldController, this.$modifier, this.$imeAction, this.$enabled, this.$onTextStateChanged, iVar, this.$$changed | 1, this.$$default);
    }
}