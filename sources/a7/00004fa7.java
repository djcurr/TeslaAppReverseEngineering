package com.stripe.android.link.ui.cardedit;

import androidx.lifecycle.q0;
import com.stripe.android.link.injection.FormControllerSubcomponent;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.ErrorMessageKt;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.link.ui.forms.FormController;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.CardSpecKt;
import h00.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.u;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import wz.w0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.cardedit.CardEditViewModel$initWithPaymentDetailsId$1", f = "CardEditViewModel.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CardEditViewModel$initWithPaymentDetailsId$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ String $paymentDetailsId;
    int label;
    final /* synthetic */ CardEditViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardEditViewModel$initWithPaymentDetailsId$1(CardEditViewModel cardEditViewModel, String str, d<? super CardEditViewModel$initWithPaymentDetailsId$1> dVar) {
        super(2, dVar);
        this.this$0 = cardEditViewModel;
        this.$paymentDetailsId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CardEditViewModel$initWithPaymentDetailsId$1(this.this$0, this.$paymentDetailsId, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CardEditViewModel$initWithPaymentDetailsId$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkRepository linkRepository;
        Object mo168listPaymentDetailsgIAlus;
        b0 b0Var;
        Object obj2;
        Provider provider;
        Map<IdentifierSpec, String> buildInitialFormValues;
        Set<IdentifierSpec> c11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            linkRepository = this.this$0.linkRepository;
            String clientSecret = this.this$0.getLinkAccount().getClientSecret();
            this.label = 1;
            mo168listPaymentDetailsgIAlus = linkRepository.mo168listPaymentDetailsgIAlus(clientSecret, this);
            if (mo168listPaymentDetailsgIAlus == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            mo168listPaymentDetailsgIAlus = ((q) obj).j();
        }
        CardEditViewModel cardEditViewModel = this.this$0;
        String str = this.$paymentDetailsId;
        Throwable e11 = q.e(mo168listPaymentDetailsgIAlus);
        if (e11 == null) {
            List<ConsumerPaymentDetails.PaymentDetails> paymentDetails = ((ConsumerPaymentDetails) mo168listPaymentDetailsgIAlus).getPaymentDetails();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : paymentDetails) {
                if (obj3 instanceof ConsumerPaymentDetails.Card) {
                    arrayList.add(obj3);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                b0Var = null;
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (s.c(((ConsumerPaymentDetails.Card) obj2).getId(), str)) {
                    break;
                }
            }
            ConsumerPaymentDetails.Card card = (ConsumerPaymentDetails.Card) obj2;
            if (card != null) {
                cardEditViewModel.setPaymentDetails(card);
                u<FormController> formController = cardEditViewModel.getFormController();
                provider = cardEditViewModel.formControllerProvider;
                FormControllerSubcomponent.Builder formSpec = ((FormControllerSubcomponent.Builder) provider.get()).formSpec(CardSpecKt.getLinkCardForm());
                buildInitialFormValues = cardEditViewModel.buildInitialFormValues(card);
                FormControllerSubcomponent.Builder initialValues = formSpec.initialValues(buildInitialFormValues);
                c11 = w0.c(IdentifierSpec.Companion.getCardNumber());
                formController.setValue(initialValues.viewOnlyFields(c11).viewModelScope(q0.a(cardEditViewModel)).build().getFormController());
                b0Var = b0.f54756a;
            }
            if (b0Var == null) {
                cardEditViewModel.dismiss(new CardEditViewModel.Result.Failure(new ErrorMessage.Raw("Payment details " + str + " not found.")));
            }
        } else {
            cardEditViewModel.dismiss(new CardEditViewModel.Result.Failure(ErrorMessageKt.getErrorMessage(e11)));
        }
        return b0.f54756a;
    }
}