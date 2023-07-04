package com.stripe.android.paymentsheet.flowcontroller;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer", f = "DefaultFlowControllerInitializer.kt", l = {82, 92, 99, 107}, m = "createWithCustomer")
/* loaded from: classes6.dex */
public final class DefaultFlowControllerInitializer$createWithCustomer$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$createWithCustomer$1(DefaultFlowControllerInitializer defaultFlowControllerInitializer, zz.d<? super DefaultFlowControllerInitializer$createWithCustomer$1> dVar) {
        super(dVar);
        this.this$0 = defaultFlowControllerInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object createWithCustomer;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createWithCustomer = this.this$0.createWithCustomer(null, null, null, false, this);
        return createWithCustomer;
    }
}