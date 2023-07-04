package com.stripe.android.paymentsheet;

import com.stripe.android.model.ConfirmStripeIntentParams;
import v20.o0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$7$1", f = "PaymentSheetActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentSheetActivity$onCreate$7$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ ConfirmStripeIntentParams $confirmParams;
    int label;
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$onCreate$7$1(PaymentSheetActivity paymentSheetActivity, ConfirmStripeIntentParams confirmStripeIntentParams, zz.d<? super PaymentSheetActivity$onCreate$7$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentSheetActivity;
        this.$confirmParams = confirmStripeIntentParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new PaymentSheetActivity$onCreate$7$1(this.this$0, this.$confirmParams, dVar);
    }

    @Override // h00.p
    public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((PaymentSheetActivity$onCreate$7$1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            this.this$0.getViewModel().confirmStripeIntent(this.$confirmParams);
            return vz.b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}