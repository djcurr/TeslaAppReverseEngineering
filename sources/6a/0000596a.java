package com.stripe.android.ui.core;

import c1.i;
import c1.v1;
import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.OTPElement;
import com.stripe.android.ui.core.elements.OTPElementUIKt;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FormUIKt$FormUI$1$1$1$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ FormElement $element;
    final /* synthetic */ v1<Boolean> $enabled$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormUIKt$FormUI$1$1$1$1(FormElement formElement, v1<Boolean> v1Var) {
        super(2);
        this.$element = formElement;
        this.$enabled$delegate = v1Var;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        boolean m365FormUI$lambda1;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        m365FormUI$lambda1 = FormUIKt.m365FormUI$lambda1(this.$enabled$delegate);
        OTPElementUIKt.OTPElementUI(m365FormUI$lambda1, (OTPElement) this.$element, null, iVar, 64, 4);
    }
}