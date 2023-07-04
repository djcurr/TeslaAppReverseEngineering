package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DropdownFieldUIKt$DropDown$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ DropdownFieldController $controller;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$2(DropdownFieldController dropdownFieldController, boolean z11, int i11) {
        super(2);
        this.$controller = dropdownFieldController;
        this.$enabled = z11;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        DropdownFieldUIKt.DropDown(this.$controller, this.$enabled, iVar, this.$$changed | 1);
    }
}