package com.stripe.android;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {954}, m = "verifySetupIntentWithMicrodeposits")
/* loaded from: classes2.dex */
public final class StripeKtxKt$verifySetupIntentWithMicrodeposits$3 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StripeKtxKt$verifySetupIntentWithMicrodeposits$3(zz.d<? super StripeKtxKt$verifySetupIntentWithMicrodeposits$3> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.verifySetupIntentWithMicrodeposits(null, null, null, this);
    }
}