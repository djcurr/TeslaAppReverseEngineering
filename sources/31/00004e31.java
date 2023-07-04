package com.stripe.android.googlepaylauncher;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel", f = "GooglePayLauncherViewModel.kt", l = {198, 202}, m = "getResultFromConfirmation$payments_core_release")
/* loaded from: classes6.dex */
public final class GooglePayLauncherViewModel$getResultFromConfirmation$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayLauncherViewModel$getResultFromConfirmation$1(GooglePayLauncherViewModel googlePayLauncherViewModel, zz.d<? super GooglePayLauncherViewModel$getResultFromConfirmation$1> dVar) {
        super(dVar);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getResultFromConfirmation$payments_core_release(0, null, this);
    }
}