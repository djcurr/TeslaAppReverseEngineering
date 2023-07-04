package com.stripe.android.link.ui.inline;

import com.stripe.android.link.ui.signup.SignUpState;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.h0;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class InlineSignupViewModel$watchUserInput$1 extends u implements l<SignUpState, b0> {
    final /* synthetic */ InlineSignupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineSignupViewModel$watchUserInput$1(InlineSignupViewModel inlineSignupViewModel) {
        super(1);
        this.this$0 = inlineSignupViewModel;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(SignUpState signUpState) {
        invoke2(signUpState);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SignUpState it2) {
        kotlinx.coroutines.flow.u uVar;
        h0 h0Var;
        s.g(it2, "it");
        uVar = this.this$0._signUpStatus;
        uVar.setValue(it2);
        if (it2 != SignUpState.InputtingEmail && it2 != SignUpState.VerifyingEmail) {
            if (it2 == SignUpState.InputtingPhone) {
                InlineSignupViewModel inlineSignupViewModel = this.this$0;
                h0Var = inlineSignupViewModel.consumerPhoneNumber;
                inlineSignupViewModel.onPhoneInput((String) h0Var.getValue());
                return;
            }
            return;
        }
        this.this$0.getUserInput().setValue(null);
    }
}