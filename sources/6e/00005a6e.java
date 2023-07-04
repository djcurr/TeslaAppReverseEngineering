package com.stripe.android.ui.core.elements;

import c1.o0;
import h00.a;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class DropdownFieldUIKt$DropDown$1$5$1$1 extends u implements a<b0> {
    final /* synthetic */ DropdownFieldController $controller;
    final /* synthetic */ o0<Boolean> $expanded$delegate;
    final /* synthetic */ int $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$1$5$1$1(DropdownFieldController dropdownFieldController, int i11, o0<Boolean> o0Var) {
        super(0);
        this.$controller = dropdownFieldController;
        this.$index = i11;
        this.$expanded$delegate = o0Var;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DropdownFieldUIKt.m439DropDown$lambda4(this.$expanded$delegate, false);
        this.$controller.onValueChange(this.$index);
    }
}