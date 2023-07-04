package com.stripe.android.link.ui.inline;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel", f = "InlineSignupViewModel.kt", l = {120}, m = "lookupConsumerEmail")
/* loaded from: classes6.dex */
public final class InlineSignupViewModel$lookupConsumerEmail$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InlineSignupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineSignupViewModel$lookupConsumerEmail$1(InlineSignupViewModel inlineSignupViewModel, zz.d<? super InlineSignupViewModel$lookupConsumerEmail$1> dVar) {
        super(dVar);
        this.this$0 = inlineSignupViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object lookupConsumerEmail;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        lookupConsumerEmail = this.this$0.lookupConsumerEmail(null, this);
        return lookupConsumerEmail;
    }
}