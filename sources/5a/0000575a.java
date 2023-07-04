package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.u;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$confirm$1", f = "USBankAccountFormViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class USBankAccountFormViewModel$confirm$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ ClientSecret $clientSecret;
    final /* synthetic */ PaymentSelection.New $paymentSelection;
    int label;
    final /* synthetic */ USBankAccountFormViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormViewModel$confirm$1(ClientSecret clientSecret, PaymentSelection.New r22, USBankAccountFormViewModel uSBankAccountFormViewModel, d<? super USBankAccountFormViewModel$confirm$1> dVar) {
        super(2, dVar);
        this.$clientSecret = clientSecret;
        this.$paymentSelection = r22;
        this.this$0 = uSBankAccountFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new USBankAccountFormViewModel$confirm$1(this.$clientSecret, this.$paymentSelection, this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((USBankAccountFormViewModel$confirm$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        u uVar;
        Object value;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            ConfirmStripeIntentParams create = ConfirmStripeIntentParamsFactory.Companion.createFactory(this.$clientSecret).create(this.$paymentSelection);
            uVar = this.this$0._currentScreenState;
            do {
                value = uVar.getValue();
                USBankAccountFormScreenState uSBankAccountFormScreenState = (USBankAccountFormScreenState) value;
            } while (!uVar.compareAndSet(value, new USBankAccountFormScreenState.ConfirmIntent(create)));
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}