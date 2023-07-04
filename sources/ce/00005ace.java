package com.stripe.android.ui.core.elements;

import c1.o0;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import r1.w;
import vz.b0;

/* loaded from: classes6.dex */
final class OTPElementUIKt$OTPElementUI$1$1$1$textFieldModifier$1$1 extends u implements l<w, b0> {
    final /* synthetic */ o0<Integer> $focusedElementIndex$delegate;
    final /* synthetic */ int $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$1$1$1$textFieldModifier$1$1(int i11, o0<Integer> o0Var) {
        super(1);
        this.$index = i11;
        this.$focusedElementIndex$delegate = o0Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(w wVar) {
        invoke2(wVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(w focusState) {
        int m448OTPElementUI$lambda5$lambda2;
        s.g(focusState, "focusState");
        if (focusState.isFocused()) {
            OTPElementUIKt.m449OTPElementUI$lambda5$lambda3(this.$focusedElementIndex$delegate, this.$index);
        } else if (focusState.isFocused()) {
        } else {
            m448OTPElementUI$lambda5$lambda2 = OTPElementUIKt.m448OTPElementUI$lambda5$lambda2(this.$focusedElementIndex$delegate);
            if (m448OTPElementUI$lambda5$lambda2 == this.$index) {
                OTPElementUIKt.m449OTPElementUI$lambda5$lambda3(this.$focusedElementIndex$delegate, -1);
            }
        }
    }
}