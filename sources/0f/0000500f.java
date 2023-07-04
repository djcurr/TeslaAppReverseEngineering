package com.stripe.android.link.ui.paymentmethod;

import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import h00.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.u;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel$startPayment$1", f = "PaymentMethodViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PaymentMethodViewModel$startPayment$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    int label;
    final /* synthetic */ PaymentMethodViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodViewModel$startPayment$1(PaymentMethodViewModel paymentMethodViewModel, PaymentMethodCreateParams paymentMethodCreateParams, d<? super PaymentMethodViewModel$startPayment$1> dVar) {
        super(2, dVar);
        this.this$0 = paymentMethodViewModel;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new PaymentMethodViewModel$startPayment$1(this.this$0, this.$paymentMethodCreateParams, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((PaymentMethodViewModel$startPayment$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        u uVar;
        LinkRepository linkRepository;
        Object mo166createPaymentDetailsyxL6bBk;
        Navigator navigator;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            uVar = this.this$0._isProcessing;
            uVar.setValue(b.a(true));
            linkRepository = this.this$0.linkRepository;
            ConsumerPaymentDetailsCreateParams.Card createParams = this.this$0.getPaymentMethod().createParams(this.$paymentMethodCreateParams, this.this$0.getLinkAccount().getEmail());
            String clientSecret = this.this$0.getLinkAccount().getClientSecret();
            StripeIntent stripeIntent$link_release = this.this$0.getArgs().getStripeIntent$link_release();
            Map<String, Map<String, Object>> extraConfirmationParams = this.this$0.getPaymentMethod().extraConfirmationParams(this.$paymentMethodCreateParams);
            this.label = 1;
            mo166createPaymentDetailsyxL6bBk = linkRepository.mo166createPaymentDetailsyxL6bBk(createParams, clientSecret, stripeIntent$link_release, extraConfirmationParams, this);
            if (mo166createPaymentDetailsyxL6bBk == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            mo166createPaymentDetailsyxL6bBk = ((q) obj).j();
        }
        PaymentMethodViewModel paymentMethodViewModel = this.this$0;
        Throwable e11 = q.e(mo166createPaymentDetailsyxL6bBk);
        if (e11 != null) {
            paymentMethodViewModel.onError(e11);
        } else {
            LinkPaymentDetails linkPaymentDetails = (LinkPaymentDetails) mo166createPaymentDetailsyxL6bBk;
            if (paymentMethodViewModel.getArgs().getCompletePayment$link_release()) {
                paymentMethodViewModel.completePayment(linkPaymentDetails);
            } else {
                navigator = paymentMethodViewModel.navigator;
                navigator.dismiss(new LinkActivityResult.Success.Selected(linkPaymentDetails));
            }
        }
        return b0.f54756a;
    }
}