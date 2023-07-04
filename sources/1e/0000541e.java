package com.stripe.android.payments.core.authentication.threeds2;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", l = {CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384}, m = "on3ds2AuthSuccess$payments_core_release")
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModel$on3ds2AuthSuccess$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2TransactionViewModel$on3ds2AuthSuccess$1(Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, zz.d<? super Stripe3ds2TransactionViewModel$on3ds2AuthSuccess$1> dVar) {
        super(dVar);
        this.this$0 = stripe3ds2TransactionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.on3ds2AuthSuccess$payments_core_release(null, null, null, 0, this);
    }
}