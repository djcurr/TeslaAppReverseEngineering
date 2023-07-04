package com.stripe.android.link.ui.wallet;

import c1.i;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletScreenKt$CardPaymentMethodItem$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ConsumerPaymentDetails.Card $cardDetails;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ a<b0> $onClick;
    final /* synthetic */ a<b0> $onMenuButtonClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$CardPaymentMethodItem$2(ConsumerPaymentDetails.Card card, boolean z11, boolean z12, a<b0> aVar, a<b0> aVar2, int i11) {
        super(2);
        this.$cardDetails = card;
        this.$enabled = z11;
        this.$isSelected = z12;
        this.$onClick = aVar;
        this.$onMenuButtonClick = aVar2;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        WalletScreenKt.CardPaymentMethodItem(this.$cardDetails, this.$enabled, this.$isSelected, this.$onClick, this.$onMenuButtonClick, iVar, this.$$changed | 1);
    }
}