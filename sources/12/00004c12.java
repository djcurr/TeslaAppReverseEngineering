package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {623}, m = "confirmWeChatPayPayment")
/* loaded from: classes2.dex */
public final class StripeKtxKt$confirmWeChatPayPayment$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StripeKtxKt$confirmWeChatPayPayment$1(zz.d<? super StripeKtxKt$confirmWeChatPayPayment$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.confirmWeChatPayPayment(null, null, null, this);
    }
}