package com.stripe.android.link.ui.signup;

import h00.q;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.link.ui.signup.SignUpViewModel$isReadyToSignUp$1", f = "SignUpViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class SignUpViewModel$isReadyToSignUp$1 extends l implements q<String, String, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignUpViewModel$isReadyToSignUp$1(d<? super SignUpViewModel$isReadyToSignUp$1> dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public final Object invoke(String str, String str2, d<? super Boolean> dVar) {
        SignUpViewModel$isReadyToSignUp$1 signUpViewModel$isReadyToSignUp$1 = new SignUpViewModel$isReadyToSignUp$1(dVar);
        signUpViewModel$isReadyToSignUp$1.L$0 = str;
        signUpViewModel$isReadyToSignUp$1.L$1 = str2;
        return signUpViewModel$isReadyToSignUp$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            return b.a((((String) this.L$0) == null || ((String) this.L$1) == null) ? false : true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}