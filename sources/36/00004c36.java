package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", l = {159, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 184, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256}, m = "startConfirmAndAuth")
/* loaded from: classes2.dex */
public final class StripePaymentController$startConfirmAndAuth$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripePaymentController$startConfirmAndAuth$1(StripePaymentController stripePaymentController, zz.d<? super StripePaymentController$startConfirmAndAuth$1> dVar) {
        super(dVar);
        this.this$0 = stripePaymentController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startConfirmAndAuth(null, null, null, this);
    }
}