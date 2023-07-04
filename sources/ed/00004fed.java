package com.stripe.android.link.ui.inline;

import androidx.compose.ui.platform.n1;
import c1.v1;
import com.stripe.android.link.ui.signup.SignUpState;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import r1.g;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.inline.LinkInlineSignupViewKt$LinkInlineSignup$1", f = "LinkInlineSignupView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LinkInlineSignupViewKt$LinkInlineSignup$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ g $focusManager;
    final /* synthetic */ n1 $keyboardController;
    final /* synthetic */ v1<SignUpState> $signUpState$delegate;
    final /* synthetic */ v1<UserInput> $userInput$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkInlineSignupViewKt$LinkInlineSignup$1(g gVar, n1 n1Var, v1<? extends SignUpState> v1Var, v1<? extends UserInput> v1Var2, d<? super LinkInlineSignupViewKt$LinkInlineSignup$1> dVar) {
        super(2, dVar);
        this.$focusManager = gVar;
        this.$keyboardController = n1Var;
        this.$signUpState$delegate = v1Var;
        this.$userInput$delegate = v1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new LinkInlineSignupViewKt$LinkInlineSignup$1(this.$focusManager, this.$keyboardController, this.$signUpState$delegate, this.$userInput$delegate, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((LinkInlineSignupViewKt$LinkInlineSignup$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SignUpState m215LinkInlineSignup$lambda0;
        UserInput m217LinkInlineSignup$lambda2;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            m215LinkInlineSignup$lambda0 = LinkInlineSignupViewKt.m215LinkInlineSignup$lambda0(this.$signUpState$delegate);
            if (m215LinkInlineSignup$lambda0 == SignUpState.InputtingEmail) {
                m217LinkInlineSignup$lambda2 = LinkInlineSignupViewKt.m217LinkInlineSignup$lambda2(this.$userInput$delegate);
                if (m217LinkInlineSignup$lambda2 != null) {
                    this.$focusManager.b(true);
                    n1 n1Var = this.$keyboardController;
                    if (n1Var != null) {
                        n1Var.hide();
                    }
                }
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}