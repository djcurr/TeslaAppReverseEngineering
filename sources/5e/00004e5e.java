package com.stripe.android.googlepaylauncher;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel", f = "GooglePayPaymentMethodLauncherViewModel.kt", l = {106}, m = "createPaymentMethod")
/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayPaymentMethodLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1(GooglePayPaymentMethodLauncherViewModel googlePayPaymentMethodLauncherViewModel, zz.d<? super GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1> dVar) {
        super(dVar);
        this.this$0 = googlePayPaymentMethodLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createPaymentMethod(null, this);
    }
}