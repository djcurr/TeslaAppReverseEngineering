package com.stripe.android.ui.core.elements;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt$PhoneNumberCollectionSection$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requestFocusWhenShown;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberCollectionSection$1(boolean z11, PhoneNumberController phoneNumberController, boolean z12, int i11) {
        super(2);
        this.$enabled = z11;
        this.$phoneNumberController = phoneNumberController;
        this.$requestFocusWhenShown = z12;
        this.$$dirty = i11;
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
        boolean z11 = this.$enabled;
        PhoneNumberController phoneNumberController = this.$phoneNumberController;
        boolean z12 = this.$requestFocusWhenShown;
        int i12 = this.$$dirty;
        PhoneNumberElementUIKt.PhoneNumberElementUI(z11, phoneNumberController, z12, iVar, (i12 & 14) | 64 | ((i12 >> 3) & 896), 0);
    }
}