package com.stripe.android.paymentsheet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentOptionsAdapterKt$PaymentOptionUi$2$8$1 extends kotlin.jvm.internal.u implements h00.l<l2.v, vz.b0> {
    final /* synthetic */ String $description;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapterKt$PaymentOptionUi$2$8$1(String str) {
        super(1);
        this.$description = str;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(l2.v vVar) {
        invoke2(vVar);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(l2.v semantics) {
        kotlin.jvm.internal.s.g(semantics, "$this$semantics");
        l2.t.F(semantics, new kotlin.text.i("\\d").i(this.$description, "$0 "));
    }
}