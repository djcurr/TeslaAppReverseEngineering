package com.stripe.android.link.ui.wallet;

import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import h00.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import vz.b0;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletViewModel$onSelectedPaymentDetails$1 extends u implements l<q<? extends PaymentResult>, b0> {
    final /* synthetic */ WalletViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$onSelectedPaymentDetails$1(WalletViewModel walletViewModel) {
        super(1);
        this.this$0 = walletViewModel;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(q<? extends PaymentResult> qVar) {
        m265invoke(qVar.j());
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: collision with other method in class */
    public final void m265invoke(Object obj) {
        kotlinx.coroutines.flow.u uVar;
        WalletViewModel walletViewModel = this.this$0;
        Throwable e11 = q.e(obj);
        if (e11 != null) {
            walletViewModel.onError(e11);
        } else {
            PaymentResult paymentResult = (PaymentResult) obj;
            if (!(paymentResult instanceof PaymentResult.Canceled)) {
                if (paymentResult instanceof PaymentResult.Failed) {
                    walletViewModel.onError(((PaymentResult.Failed) paymentResult).getThrowable());
                } else if (!(paymentResult instanceof PaymentResult.Completed)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    walletViewModel.navigator.dismiss(LinkActivityResult.Success.Completed.INSTANCE);
                }
            }
        }
        uVar = this.this$0._isProcessing;
        uVar.setValue(Boolean.FALSE);
    }
}