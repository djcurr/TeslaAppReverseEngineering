package com.stripe.android.ui.core.elements;

import c1.o0;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import r1.w;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class TextFieldUIKt$TextField$4 extends u implements l<w, b0> {
    final /* synthetic */ o0<Boolean> $hasFocus$delegate;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$4(TextFieldController textFieldController, o0<Boolean> o0Var) {
        super(1);
        this.$textFieldController = textFieldController;
        this.$hasFocus$delegate = o0Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(w wVar) {
        invoke2(wVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(w it2) {
        boolean m489TextField_PwfN4xk$lambda8;
        s.g(it2, "it");
        m489TextField_PwfN4xk$lambda8 = TextFieldUIKt.m489TextField_PwfN4xk$lambda8(this.$hasFocus$delegate);
        if (m489TextField_PwfN4xk$lambda8 != it2.isFocused()) {
            this.$textFieldController.onFocusChange(it2.isFocused());
        }
        TextFieldUIKt.m490TextField_PwfN4xk$lambda9(this.$hasFocus$delegate, it2.isFocused());
    }
}