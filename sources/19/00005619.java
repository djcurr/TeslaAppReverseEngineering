package com.stripe.android.paymentsheet.flowcontroller;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer", f = "DefaultFlowControllerInitializer.kt", l = {70}, m = "isGooglePayReady")
/* loaded from: classes6.dex */
public final class DefaultFlowControllerInitializer$isGooglePayReady$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$isGooglePayReady$1(DefaultFlowControllerInitializer defaultFlowControllerInitializer, zz.d<? super DefaultFlowControllerInitializer$isGooglePayReady$1> dVar) {
        super(dVar);
        this.this$0 = defaultFlowControllerInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object isGooglePayReady;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        isGooglePayReady = this.this$0.isGooglePayReady(null, this);
        return isGooglePayReady;
    }
}