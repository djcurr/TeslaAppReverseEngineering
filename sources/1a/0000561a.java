package com.stripe.android.paymentsheet.flowcontroller;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer", f = "DefaultFlowControllerInitializer.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384}, m = "retrieveStripeIntent")
/* loaded from: classes6.dex */
public final class DefaultFlowControllerInitializer$retrieveStripeIntent$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$retrieveStripeIntent$1(DefaultFlowControllerInitializer defaultFlowControllerInitializer, zz.d<? super DefaultFlowControllerInitializer$retrieveStripeIntent$1> dVar) {
        super(dVar);
        this.this$0 = defaultFlowControllerInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object retrieveStripeIntent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        retrieveStripeIntent = this.this$0.retrieveStripeIntent(null, this);
        return retrieveStripeIntent;
    }
}