package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import v20.o0;
import vz.q;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$maybeFetchStripeIntent$1", f = "PaymentSheetViewModel.kt", l = {226}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentSheetViewModel$maybeFetchStripeIntent$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel$maybeFetchStripeIntent$1(PaymentSheetViewModel paymentSheetViewModel, zz.d<? super PaymentSheetViewModel$maybeFetchStripeIntent$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        PaymentSheetViewModel$maybeFetchStripeIntent$1 paymentSheetViewModel$maybeFetchStripeIntent$1 = new PaymentSheetViewModel$maybeFetchStripeIntent$1(this.this$0, dVar);
        paymentSheetViewModel$maybeFetchStripeIntent$1.L$0 = obj;
        return paymentSheetViewModel$maybeFetchStripeIntent$1;
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((PaymentSheetViewModel$maybeFetchStripeIntent$1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        StripeIntentRepository stripeIntentRepository;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.L$0;
                PaymentSheetViewModel paymentSheetViewModel = this.this$0;
                q.a aVar = vz.q.f54772b;
                stripeIntentRepository = paymentSheetViewModel.stripeIntentRepository;
                ClientSecret clientSecret$paymentsheet_release = paymentSheetViewModel.getArgs$paymentsheet_release().getClientSecret$paymentsheet_release();
                this.label = 1;
                obj = stripeIntentRepository.get(clientSecret$paymentsheet_release, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            b11 = vz.q.b((StripeIntent) obj);
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(r.a(th2));
        }
        PaymentSheetViewModel paymentSheetViewModel2 = this.this$0;
        Throwable e11 = vz.q.e(b11);
        if (e11 == null) {
            paymentSheetViewModel2.onStripeIntentFetchResponse((StripeIntent) b11);
        } else {
            paymentSheetViewModel2.setStripeIntent(null);
            paymentSheetViewModel2.onFatal(e11);
        }
        return vz.b0.f54756a;
    }
}