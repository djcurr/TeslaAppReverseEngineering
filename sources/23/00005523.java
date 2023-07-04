package com.stripe.android.paymentsheet;

import c1.o0;

/* loaded from: classes6.dex */
final class PaymentOptionsAdapterKt$PaymentOptionUi$2$6$1 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
    final /* synthetic */ o0<Boolean> $openDialog;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapterKt$PaymentOptionUi$2$6$1(o0<Boolean> o0Var) {
        super(0);
        this.$openDialog = o0Var;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ vz.b0 invoke() {
        invoke2();
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$openDialog.setValue(Boolean.TRUE);
    }
}