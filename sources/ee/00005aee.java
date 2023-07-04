package com.stripe.android.ui.core.elements;

import c1.i;
import c1.o0;
import c1.v1;
import h00.p;
import kotlin.jvm.internal.u;
import kotlin.text.v;
import vz.b0;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$2$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ o0<Boolean> $hasFocus$delegate;
    final /* synthetic */ v1<String> $placeholder$delegate;
    final /* synthetic */ v1<String> $value$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$2$3(o0<Boolean> o0Var, v1<String> v1Var, v1<String> v1Var2) {
        super(2);
        this.$hasFocus$delegate = o0Var;
        this.$value$delegate = v1Var;
        this.$placeholder$delegate = v1Var2;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        boolean m456PhoneNumberElementUI$lambda11;
        String m462PhoneNumberElementUI$lambda7;
        String m459PhoneNumberElementUI$lambda4;
        boolean w11;
        if (((i11 & 11) ^ 2) != 0 || !iVar.i()) {
            m456PhoneNumberElementUI$lambda11 = PhoneNumberElementUIKt.m456PhoneNumberElementUI$lambda11(this.$hasFocus$delegate);
            if (!m456PhoneNumberElementUI$lambda11) {
                m459PhoneNumberElementUI$lambda4 = PhoneNumberElementUIKt.m459PhoneNumberElementUI$lambda4(this.$value$delegate);
                w11 = v.w(m459PhoneNumberElementUI$lambda4);
                if (!(!w11)) {
                    return;
                }
            }
            m462PhoneNumberElementUI$lambda7 = PhoneNumberElementUIKt.m462PhoneNumberElementUI$lambda7(this.$placeholder$delegate);
            o1.b(m462PhoneNumberElementUI$lambda7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, 65534);
            return;
        }
        iVar.G();
    }
}