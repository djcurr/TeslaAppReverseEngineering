package com.stripe.android.link.ui.wallet;

import c1.o0;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletScreenKt$WalletBody$7$2 extends u implements l<Boolean, b0> {
    final /* synthetic */ o0<ConsumerPaymentDetails.Card> $cardBeingRemoved$delegate;
    final /* synthetic */ ConsumerPaymentDetails.Card $it;
    final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onDeletePaymentMethod;
    final /* synthetic */ o0<Boolean> $openDialog$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$7$2(l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar, ConsumerPaymentDetails.Card card, o0<Boolean> o0Var, o0<ConsumerPaymentDetails.Card> o0Var2) {
        super(1);
        this.$onDeletePaymentMethod = lVar;
        this.$it = card;
        this.$openDialog$delegate = o0Var;
        this.$cardBeingRemoved$delegate = o0Var2;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return b0.f54756a;
    }

    public final void invoke(boolean z11) {
        if (z11) {
            this.$onDeletePaymentMethod.invoke(this.$it);
        }
        WalletScreenKt.m250WalletBody$lambda10(this.$openDialog$delegate, false);
        this.$cardBeingRemoved$delegate.setValue(null);
    }
}