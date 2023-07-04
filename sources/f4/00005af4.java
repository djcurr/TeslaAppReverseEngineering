package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ PhoneNumberController $controller;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $requestFocusWhenShown;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$4(boolean z11, PhoneNumberController phoneNumberController, boolean z12, int i11, int i12) {
        super(2);
        this.$enabled = z11;
        this.$controller = phoneNumberController;
        this.$requestFocusWhenShown = z12;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        PhoneNumberElementUIKt.PhoneNumberElementUI(this.$enabled, this.$controller, this.$requestFocusWhenShown, iVar, this.$$changed | 1, this.$$default);
    }
}