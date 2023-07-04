package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {776}, m = "getAuthenticateSourceResult")
/* loaded from: classes2.dex */
public final class StripeKtxKt$getAuthenticateSourceResult$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StripeKtxKt$getAuthenticateSourceResult$1(zz.d<? super StripeKtxKt$getAuthenticateSourceResult$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.getAuthenticateSourceResult(null, 0, null, this);
    }
}