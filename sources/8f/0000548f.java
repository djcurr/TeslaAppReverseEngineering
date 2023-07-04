package com.stripe.android.payments.paymentlauncher;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel", f = "PaymentLauncherViewModel.kt", l = {143, 150}, m = "confirmIntent")
/* loaded from: classes6.dex */
public final class PaymentLauncherViewModel$confirmIntent$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLauncherViewModel$confirmIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, zz.d<? super PaymentLauncherViewModel$confirmIntent$1> dVar) {
        super(dVar);
        this.this$0 = paymentLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object confirmIntent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        confirmIntent = this.this$0.confirmIntent(null, null, this);
        return confirmIntent;
    }
}