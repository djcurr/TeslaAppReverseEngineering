package com.stripe.android.link.ui.signup;

import c1.i;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.TextFieldController;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SignUpScreenKt$SignUpBody$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ boolean $isReadyToSignUp;
    final /* synthetic */ String $merchantName;
    final /* synthetic */ a<b0> $onSignUpClick;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ SignUpState $signUpState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$4(String str, TextFieldController textFieldController, PhoneNumberController phoneNumberController, SignUpState signUpState, boolean z11, ErrorMessage errorMessage, a<b0> aVar, int i11) {
        super(2);
        this.$merchantName = str;
        this.$emailController = textFieldController;
        this.$phoneNumberController = phoneNumberController;
        this.$signUpState = signUpState;
        this.$isReadyToSignUp = z11;
        this.$errorMessage = errorMessage;
        this.$onSignUpClick = aVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        SignUpScreenKt.SignUpBody(this.$merchantName, this.$emailController, this.$phoneNumberController, this.$signUpState, this.$isReadyToSignUp, this.$errorMessage, this.$onSignUpClick, iVar, this.$$changed | 1);
    }
}