package com.stripe.android.link.ui.wallet;

import c1.i;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.a;
import h00.l;
import h00.p;
import java.util.List;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletScreenKt$ExpandedPaymentDetails$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ a<b0> $onAddNewPaymentMethodClick;
    final /* synthetic */ a<b0> $onCollapse;
    final /* synthetic */ l<Integer, b0> $onIndexSelected;
    final /* synthetic */ l<ConsumerPaymentDetails.Card, b0> $onMenuButtonClick;
    final /* synthetic */ List<ConsumerPaymentDetails.PaymentDetails> $paymentDetails;
    final /* synthetic */ int $selectedIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$ExpandedPaymentDetails$2(List<? extends ConsumerPaymentDetails.PaymentDetails> list, int i11, boolean z11, l<? super Integer, b0> lVar, l<? super ConsumerPaymentDetails.Card, b0> lVar2, a<b0> aVar, a<b0> aVar2, int i12) {
        super(2);
        this.$paymentDetails = list;
        this.$selectedIndex = i11;
        this.$enabled = z11;
        this.$onIndexSelected = lVar;
        this.$onMenuButtonClick = lVar2;
        this.$onAddNewPaymentMethodClick = aVar;
        this.$onCollapse = aVar2;
        this.$$changed = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        WalletScreenKt.ExpandedPaymentDetails(this.$paymentDetails, this.$selectedIndex, this.$enabled, this.$onIndexSelected, this.$onMenuButtonClick, this.$onAddNewPaymentMethodClick, this.$onCollapse, iVar, this.$$changed | 1);
    }
}