package com.stripe.android.paymentsheet;

import java.util.List;

/* loaded from: classes6.dex */
public final class PaymentMethodsUIKt$PaymentMethodsUI$3$1$1$invoke$$inlined$itemsIndexed$default$1 extends kotlin.jvm.internal.u implements h00.l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ h00.p $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsUIKt$PaymentMethodsUI$3$1$1$invoke$$inlined$itemsIndexed$default$1(h00.p pVar, List list) {
        super(1);
        this.$key = pVar;
        this.$items = list;
    }

    public final Object invoke(int i11) {
        return this.$key.invoke(Integer.valueOf(i11), this.$items.get(i11));
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}