package com.stripe.android.link.ui.signup;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.signup.SignUpViewModel", f = "SignUpViewModel.kt", l = {115}, m = "lookupConsumerEmail")
/* loaded from: classes6.dex */
public final class SignUpViewModel$lookupConsumerEmail$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SignUpViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpViewModel$lookupConsumerEmail$1(SignUpViewModel signUpViewModel, zz.d<? super SignUpViewModel$lookupConsumerEmail$1> dVar) {
        super(dVar);
        this.this$0 = signUpViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.lookupConsumerEmail(null, this);
    }
}