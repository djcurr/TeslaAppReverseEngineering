package com.stripe.android.view;

/* loaded from: classes6.dex */
final class PaymentAuthWebViewActivity$onCreate$2 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
    final /* synthetic */ PaymentAuthWebViewClient $webViewClient;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$onCreate$2(PaymentAuthWebViewClient paymentAuthWebViewClient) {
        super(0);
        this.$webViewClient = paymentAuthWebViewClient;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ vz.b0 invoke() {
        invoke2();
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$webViewClient.setHasLoadedBlank$payments_core_release(true);
    }
}