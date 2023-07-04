package com.stripe.android.link.ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import h00.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public /* synthetic */ class WalletScreenKt$WalletBody$3 extends p implements l<ConsumerPaymentDetails.PaymentDetails, b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public WalletScreenKt$WalletBody$3(Object obj) {
        super(1, obj, WalletViewModel.class, "deletePaymentMethod", "deletePaymentMethod(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        invoke2(paymentDetails);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConsumerPaymentDetails.PaymentDetails p02) {
        s.g(p02, "p0");
        ((WalletViewModel) this.receiver).deletePaymentMethod(p02);
    }
}