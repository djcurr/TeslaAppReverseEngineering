package com.stripe.android.link.ui.signup;

import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.model.LinkAccount;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.signup.SignUpViewModel$onSignUpClick$1", f = "SignUpViewModel.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SignUpViewModel$onSignUpClick$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ String $country;
    final /* synthetic */ String $email;
    final /* synthetic */ String $phone;
    int label;
    final /* synthetic */ SignUpViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpViewModel$onSignUpClick$1(SignUpViewModel signUpViewModel, String str, String str2, String str3, d<? super SignUpViewModel$onSignUpClick$1> dVar) {
        super(2, dVar);
        this.this$0 = signUpViewModel;
        this.$email = str;
        this.$phone = str2;
        this.$country = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new SignUpViewModel$onSignUpClick$1(this.this$0, this.$email, this.$phone, this.$country, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((SignUpViewModel$onSignUpClick$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkAccountManager linkAccountManager;
        Object m162signUpBWLJW6A;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            String str = this.$email;
            String str2 = this.$phone;
            String str3 = this.$country;
            this.label = 1;
            m162signUpBWLJW6A = linkAccountManager.m162signUpBWLJW6A(str, str2, str3, this);
            if (m162signUpBWLJW6A == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            m162signUpBWLJW6A = ((q) obj).j();
        }
        SignUpViewModel signUpViewModel = this.this$0;
        Throwable e11 = q.e(m162signUpBWLJW6A);
        if (e11 == null) {
            signUpViewModel.onAccountFetched((LinkAccount) m162signUpBWLJW6A);
        } else {
            signUpViewModel.onError(e11);
        }
        return b0.f54756a;
    }
}