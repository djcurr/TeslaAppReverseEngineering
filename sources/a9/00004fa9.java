package com.stripe.android.link.ui.cardedit;

import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import h00.p;
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
@f(c = "com.stripe.android.link.ui.cardedit.CardEditViewModel$updateCard$1", f = "CardEditViewModel.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CardEditViewModel$updateCard$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    int label;
    final /* synthetic */ CardEditViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardEditViewModel$updateCard$1(CardEditViewModel cardEditViewModel, PaymentMethodCreateParams paymentMethodCreateParams, d<? super CardEditViewModel$updateCard$1> dVar) {
        super(2, dVar);
        this.this$0 = cardEditViewModel;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CardEditViewModel$updateCard$1(this.this$0, this.$paymentMethodCreateParams, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CardEditViewModel$updateCard$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkRepository linkRepository;
        Object mo172updatePaymentDetails0E7RQCE;
        u uVar;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            String id2 = this.this$0.getPaymentDetails().getId();
            Boolean value = this.this$0.getSetAsDefault().getValue();
            CardEditViewModel cardEditViewModel = this.this$0;
            value.booleanValue();
            if (cardEditViewModel.isDefault()) {
                value = null;
            }
            ConsumerPaymentDetailsUpdateParams.Card card = new ConsumerPaymentDetailsUpdateParams.Card(id2, value, this.$paymentMethodCreateParams);
            linkRepository = this.this$0.linkRepository;
            String clientSecret = this.this$0.getLinkAccount().getClientSecret();
            this.label = 1;
            mo172updatePaymentDetails0E7RQCE = linkRepository.mo172updatePaymentDetails0E7RQCE(card, clientSecret, this);
            if (mo172updatePaymentDetails0E7RQCE == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            mo172updatePaymentDetails0E7RQCE = ((q) obj).j();
        }
        CardEditViewModel cardEditViewModel2 = this.this$0;
        Throwable e11 = q.e(mo172updatePaymentDetails0E7RQCE);
        if (e11 == null) {
            ConsumerPaymentDetails consumerPaymentDetails = (ConsumerPaymentDetails) mo172updatePaymentDetails0E7RQCE;
            uVar = cardEditViewModel2._isProcessing;
            uVar.setValue(b.a(false));
            cardEditViewModel2.dismiss(CardEditViewModel.Result.Success.INSTANCE);
        } else {
            cardEditViewModel2.onError(e11);
        }
        return b0.f54756a;
    }
}