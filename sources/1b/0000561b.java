package com.stripe.android.paymentsheet.flowcontroller;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer", f = "DefaultFlowControllerInitializer.kt", l = {158}, m = "setLastSavedPaymentMethod")
/* loaded from: classes6.dex */
public final class DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1 extends d {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1(DefaultFlowControllerInitializer defaultFlowControllerInitializer, zz.d<? super DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1> dVar) {
        super(dVar);
        this.this$0 = defaultFlowControllerInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object lastSavedPaymentMethod;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        lastSavedPaymentMethod = this.this$0.setLastSavedPaymentMethod(null, false, null, this);
        return lastSavedPaymentMethod;
    }
}