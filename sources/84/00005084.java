package com.stripe.android.link.ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class WalletScreenKt$ExpandedPaymentDetails$1$2$2 extends u implements a<b0> {
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $item;
    final /* synthetic */ l<ConsumerPaymentDetails.Card, b0> $onMenuButtonClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$ExpandedPaymentDetails$1$2$2(l<? super ConsumerPaymentDetails.Card, b0> lVar, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        super(0);
        this.$onMenuButtonClick = lVar;
        this.$item = paymentDetails;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onMenuButtonClick.invoke(this.$item);
    }
}