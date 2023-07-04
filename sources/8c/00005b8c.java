package com.stripe.android.ui.core.elements;

import c1.i;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import o1.f;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class TextFieldUIKt$TextFieldSection$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ f $modifier;
    final /* synthetic */ l<TextFieldState, b0> $onTextStateChanged;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextFieldSection$2(TextFieldController textFieldController, f fVar, int i11, boolean z11, l<? super TextFieldState, b0> lVar, int i12) {
        super(2);
        this.$textFieldController = textFieldController;
        this.$modifier = fVar;
        this.$imeAction = i11;
        this.$enabled = z11;
        this.$onTextStateChanged = lVar;
        this.$$dirty = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        TextFieldController textFieldController = this.$textFieldController;
        f fVar = this.$modifier;
        int i12 = this.$imeAction;
        boolean z11 = this.$enabled;
        l<TextFieldState, b0> lVar = this.$onTextStateChanged;
        int i13 = this.$$dirty;
        TextFieldUIKt.m477TextFieldPwfN4xk(textFieldController, fVar, i12, z11, lVar, iVar, (i13 & 14) | (i13 & 112) | ((i13 >> 3) & 896) | ((i13 >> 3) & 7168) | ((i13 >> 3) & 57344), 0);
    }
}