package com.stripe.android.paymentsheet;

/* loaded from: classes6.dex */
/* synthetic */ class PaymentSheetActivity$onCreate$4$1 extends kotlin.jvm.internal.p implements h00.a<vz.b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PaymentSheetActivity$onCreate$4$1(Object obj) {
        super(0, obj, PaymentSheetViewModel.class, "launchLink", "launchLink()V", 0);
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ vz.b0 invoke() {
        invoke2();
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PaymentSheetViewModel) this.receiver).launchLink();
    }
}