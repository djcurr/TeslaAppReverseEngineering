package com.stripe.android.paymentsheet;

/* loaded from: classes6.dex */
final class PaymentMethodsUIKt$PaymentMethodUI$1$1$1 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
    final /* synthetic */ int $itemIndex;
    final /* synthetic */ h00.l<Integer, vz.b0> $onItemSelectedListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodUI$1$1$1(h00.l<? super Integer, vz.b0> lVar, int i11) {
        super(0);
        this.$onItemSelectedListener = lVar;
        this.$itemIndex = i11;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ vz.b0 invoke() {
        invoke2();
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemSelectedListener.invoke(Integer.valueOf(this.$itemIndex));
    }
}