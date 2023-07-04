package com.stripe.android.view;

/* loaded from: classes6.dex */
/* synthetic */ class PaymentAuthWebViewActivity$onCreate$webViewClient$2 extends kotlin.jvm.internal.p implements h00.l<Throwable, vz.b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentAuthWebViewActivity$onCreate$webViewClient$2(Object obj) {
        super(1, obj, PaymentAuthWebViewActivity.class, "onAuthComplete", "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        invoke2(th2);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ((PaymentAuthWebViewActivity) this.receiver).onAuthComplete$payments_core_release(th2);
    }
}