package com.stripe.android.link.ui.paymentmethod;

import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import h00.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import vz.b0;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentMethodViewModel$completePayment$1 extends u implements l<q<? extends PaymentResult>, b0> {
    final /* synthetic */ PaymentMethodViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodViewModel$completePayment$1(PaymentMethodViewModel paymentMethodViewModel) {
        super(1);
        this.this$0 = paymentMethodViewModel;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(q<? extends PaymentResult> qVar) {
        m227invoke(qVar.j());
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: collision with other method in class */
    public final void m227invoke(Object obj) {
        kotlinx.coroutines.flow.u uVar;
        Navigator navigator;
        PaymentMethodViewModel paymentMethodViewModel = this.this$0;
        Throwable e11 = q.e(obj);
        if (e11 != null) {
            paymentMethodViewModel.onError(e11);
        } else {
            PaymentResult paymentResult = (PaymentResult) obj;
            if (!(paymentResult instanceof PaymentResult.Canceled)) {
                if (paymentResult instanceof PaymentResult.Failed) {
                    paymentMethodViewModel.onError(((PaymentResult.Failed) paymentResult).getThrowable());
                } else if (!(paymentResult instanceof PaymentResult.Completed)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    navigator = paymentMethodViewModel.navigator;
                    navigator.dismiss(LinkActivityResult.Success.Completed.INSTANCE);
                }
            }
        }
        uVar = this.this$0._isProcessing;
        uVar.setValue(Boolean.FALSE);
    }
}