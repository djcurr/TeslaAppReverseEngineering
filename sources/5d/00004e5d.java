package com.stripe.android.googlepaylauncher;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel", f = "GooglePayPaymentMethodLauncherViewModel.kt", l = {89}, m = "createLoadPaymentDataTask")
/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayPaymentMethodLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1(GooglePayPaymentMethodLauncherViewModel googlePayPaymentMethodLauncherViewModel, zz.d<? super GooglePayPaymentMethodLauncherViewModel$createLoadPaymentDataTask$1> dVar) {
        super(dVar);
        this.this$0 = googlePayPaymentMethodLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createLoadPaymentDataTask(this);
    }
}