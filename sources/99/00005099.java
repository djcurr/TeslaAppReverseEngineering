package com.stripe.android.link.ui.wallet;

import c1.o0;
import c1.s1;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class WalletScreenKt$WalletBody$9$selectedIndex$2 extends u implements a<o0<Integer>> {
    final /* synthetic */ List<ConsumerPaymentDetails.PaymentDetails> $paymentDetails;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$9$selectedIndex$2(List<? extends ConsumerPaymentDetails.PaymentDetails> list) {
        super(0);
        this.$paymentDetails = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final o0<Integer> invoke() {
        o0<Integer> d11;
        Iterator<ConsumerPaymentDetails.PaymentDetails> it2 = this.$paymentDetails.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            } else if (it2.next().isDefault()) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        d11 = s1.d(Integer.valueOf(valueOf != null ? valueOf.intValue() : 0), null, 2, null);
        return d11;
    }
}