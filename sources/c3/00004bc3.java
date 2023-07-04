package com.stripe.android;

import androidx.lifecycle.f0;
import com.stripe.android.PaymentSessionViewModel;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes2.dex */
final class PaymentSessionViewModel$fetchCustomer$1$onCustomerRetrieved$1 extends u implements h00.a<b0> {
    final /* synthetic */ f0<PaymentSessionViewModel.FetchCustomerResult> $resultData;
    final /* synthetic */ PaymentSessionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSessionViewModel$fetchCustomer$1$onCustomerRetrieved$1(PaymentSessionViewModel paymentSessionViewModel, f0<PaymentSessionViewModel.FetchCustomerResult> f0Var) {
        super(0);
        this.this$0 = paymentSessionViewModel;
        this.$resultData = f0Var;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        f0 f0Var;
        f0Var = this.this$0._networkState;
        f0Var.setValue(PaymentSessionViewModel.NetworkState.Inactive);
        this.$resultData.setValue(PaymentSessionViewModel.FetchCustomerResult.Success.INSTANCE);
    }
}