package com.stripe.android.ui.core.elements;

import c1.i;
import c1.v1;
import com.stripe.android.ui.core.R;
import h00.p;
import k2.e;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class TextFieldUIKt$TextField$6 extends u implements p<i, Integer, b0> {
    final /* synthetic */ v1<Integer> $label$delegate;
    final /* synthetic */ TextFieldController $textFieldController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$6(TextFieldController textFieldController, v1<Integer> v1Var) {
        super(2);
        this.$textFieldController = textFieldController;
        this.$label$delegate = v1Var;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        Integer m481TextField_PwfN4xk$lambda11;
        String b11;
        String str;
        Integer m481TextField_PwfN4xk$lambda112;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        if (this.$textFieldController.getShowOptionalLabel()) {
            iVar.x(-342677025);
            int i12 = R.string.form_label_optional;
            Object[] objArr = new Object[1];
            m481TextField_PwfN4xk$lambda112 = TextFieldUIKt.m481TextField_PwfN4xk$lambda11(this.$label$delegate);
            b11 = m481TextField_PwfN4xk$lambda112 != null ? e.b(m481TextField_PwfN4xk$lambda112.intValue(), iVar, 0) : null;
            objArr[0] = b11 != null ? b11 : "";
            String c11 = e.c(i12, objArr, iVar, 64);
            iVar.N();
            str = c11;
        } else {
            iVar.x(-342676824);
            m481TextField_PwfN4xk$lambda11 = TextFieldUIKt.m481TextField_PwfN4xk$lambda11(this.$label$delegate);
            b11 = m481TextField_PwfN4xk$lambda11 != null ? e.b(m481TextField_PwfN4xk$lambda11.intValue(), iVar, 0) : null;
            String str2 = b11 != null ? b11 : "";
            iVar.N();
            str = str2;
        }
        FormLabelKt.FormLabel(str, null, false, iVar, 0, 6);
    }
}