package com.stripe.android.link.ui.signup;

import c1.i;
import com.stripe.android.ui.core.elements.TextFieldController;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SignUpScreenKt$EmailCollectionSection$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ SignUpState $signUpState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$EmailCollectionSection$2(boolean z11, TextFieldController textFieldController, SignUpState signUpState, int i11) {
        super(2);
        this.$enabled = z11;
        this.$emailController = textFieldController;
        this.$signUpState = signUpState;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        SignUpScreenKt.EmailCollectionSection(this.$enabled, this.$emailController, this.$signUpState, iVar, this.$$changed | 1);
    }
}