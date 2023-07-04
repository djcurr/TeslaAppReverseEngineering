package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import h00.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
/* synthetic */ class USBankAccountFormViewModel$registerFragment$1 extends p implements l<CollectBankAccountResult, b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public USBankAccountFormViewModel$registerFragment$1(Object obj) {
        super(1, obj, USBankAccountFormViewModel.class, "handleCollectBankAccountResult", "handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(CollectBankAccountResult collectBankAccountResult) {
        invoke2(collectBankAccountResult);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CollectBankAccountResult p02) {
        s.g(p02, "p0");
        ((USBankAccountFormViewModel) this.receiver).handleCollectBankAccountResult(p02);
    }
}