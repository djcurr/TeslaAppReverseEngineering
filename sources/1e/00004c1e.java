package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {713}, m = "getPaymentIntentResult")
/* loaded from: classes2.dex */
public final class StripeKtxKt$getPaymentIntentResult$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StripeKtxKt$getPaymentIntentResult$1(zz.d<? super StripeKtxKt$getPaymentIntentResult$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.getPaymentIntentResult(null, 0, null, this);
    }
}