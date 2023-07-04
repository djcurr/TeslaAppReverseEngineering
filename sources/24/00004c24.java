package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {870}, m = "verifyPaymentIntentWithMicrodeposits")
/* loaded from: classes2.dex */
public final class StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3(zz.d<? super StripeKtxKt$verifyPaymentIntentWithMicrodeposits$3> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.verifyPaymentIntentWithMicrodeposits(null, null, null, this);
    }
}