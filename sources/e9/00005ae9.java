package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt$PhoneNumberCollectionSection$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requestFocusWhenShown;
    final /* synthetic */ Integer $sectionTitle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberCollectionSection$2(boolean z11, PhoneNumberController phoneNumberController, Integer num, boolean z12, int i11, int i12) {
        super(2);
        this.$enabled = z11;
        this.$phoneNumberController = phoneNumberController;
        this.$sectionTitle = num;
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
        PhoneNumberElementUIKt.PhoneNumberCollectionSection(this.$enabled, this.$phoneNumberController, this.$sectionTitle, this.$requestFocusWhenShown, iVar, this.$$changed | 1, this.$$default);
    }
}