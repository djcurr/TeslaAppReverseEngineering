package com.stripe.android.link.ui.wallet;

import c1.i;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletScreenKt$CardDetails$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ConsumerPaymentDetails.Card $card;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletScreenKt$CardDetails$2(ConsumerPaymentDetails.Card card, int i11) {
        super(2);
        this.$card = card;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        WalletScreenKt.CardDetails(this.$card, iVar, this.$$changed | 1);
    }
}