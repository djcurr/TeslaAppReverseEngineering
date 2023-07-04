package com.stripe.android.ui.core.elements;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class TextFieldUIKt$TextField$2 extends u implements l<String, b0> {
    final /* synthetic */ l<TextFieldState, b0> $onTextStateChanged;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldUIKt$TextField$2(TextFieldController textFieldController, l<? super TextFieldState, b0> lVar) {
        super(1);
        this.$textFieldController = textFieldController;
        this.$onTextStateChanged = lVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(String str) {
        invoke2(str);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it2) {
        s.g(it2, "it");
        TextFieldState onValueChange = this.$textFieldController.onValueChange(it2);
        if (onValueChange != null) {
            this.$onTextStateChanged.invoke(onValueChange);
        }
    }
}