package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import h00.p;
import java.util.Map;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.u;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1", f = "USBankAccountFormViewModel.kt", l = {332, 343}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ String $bankName;
    final /* synthetic */ ClientSecret $clientSecret;
    final /* synthetic */ String $intentId;
    final /* synthetic */ String $last4;
    final /* synthetic */ String $linkAccountId;
    int label;
    final /* synthetic */ USBankAccountFormViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1(ClientSecret clientSecret, USBankAccountFormViewModel uSBankAccountFormViewModel, String str, String str2, String str3, String str4, d<? super USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1> dVar) {
        super(2, dVar);
        this.$clientSecret = clientSecret;
        this.this$0 = uSBankAccountFormViewModel;
        this.$intentId = str;
        this.$linkAccountId = str2;
        this.$last4 = str3;
        this.$bankName = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1(this.$clientSecret, this.this$0, this.$intentId, this.$linkAccountId, this.$last4, this.$bankName, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
        return ((USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        StripeRepository stripeRepository;
        Provider provider;
        Provider provider2;
        StripeRepository stripeRepository2;
        Provider provider3;
        Provider provider4;
        Application application;
        USBankAccountFormViewModel.Args args;
        PaymentSelection.CustomerRequestedSave customerRequestedSave;
        USBankAccountFormViewModel.Args args2;
        u uVar;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            ClientSecret clientSecret = this.$clientSecret;
            if (clientSecret instanceof PaymentIntentClientSecret) {
                stripeRepository2 = this.this$0.stripeRepository;
                String value = this.$clientSecret.getValue();
                String str = this.$intentId;
                String str2 = this.$linkAccountId;
                provider3 = this.this$0.lazyPaymentConfig;
                String publishableKey = ((PaymentConfiguration) provider3.mo0get()).getPublishableKey();
                provider4 = this.this$0.lazyPaymentConfig;
                ApiRequest.Options options = new ApiRequest.Options(publishableKey, ((PaymentConfiguration) provider4.mo0get()).getStripeAccountId(), null, 4, null);
                this.label = 1;
                if (stripeRepository2.attachFinancialConnectionsSessionToPaymentIntent(value, str, str2, options, this) == d11) {
                    return d11;
                }
            } else if (clientSecret instanceof SetupIntentClientSecret) {
                stripeRepository = this.this$0.stripeRepository;
                String value2 = this.$clientSecret.getValue();
                String str3 = this.$intentId;
                String str4 = this.$linkAccountId;
                provider = this.this$0.lazyPaymentConfig;
                String publishableKey2 = ((PaymentConfiguration) provider.mo0get()).getPublishableKey();
                provider2 = this.this$0.lazyPaymentConfig;
                ApiRequest.Options options2 = new ApiRequest.Options(publishableKey2, ((PaymentConfiguration) provider2.mo0get()).getStripeAccountId(), null, 4, null);
                this.label = 2;
                if (stripeRepository.attachFinancialConnectionsSessionToSetupIntent(value2, str3, str4, options2, this) == d11) {
                    return d11;
                }
            }
        } else if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        application = this.this$0.application;
        String string = application.getString(R.string.paymentsheet_payment_method_item_card_number, new Object[]{this.$last4});
        int invoke = TransformToBankIcon.Companion.invoke(this.$bankName);
        PaymentMethodCreateParams create$default = PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.USBankAccount(this.$linkAccountId), new PaymentMethod.BillingDetails(null, this.this$0.getEmail().mo260getValue(), this.this$0.getName().mo260getValue(), null, 9, null), (Map) null, 4, (Object) null);
        args = this.this$0.args;
        if (args.getFormArgs().getShowCheckbox()) {
            if (this.this$0.getSaveForFutureUse().mo260getValue().booleanValue()) {
                customerRequestedSave = PaymentSelection.CustomerRequestedSave.RequestReuse;
            } else {
                customerRequestedSave = PaymentSelection.CustomerRequestedSave.RequestNoReuse;
            }
        } else {
            customerRequestedSave = PaymentSelection.CustomerRequestedSave.NoRequest;
        }
        s.f(string, "getString(\n             …                        )");
        PaymentSelection.New.USBankAccount uSBankAccount = new PaymentSelection.New.USBankAccount(string, invoke, this.$bankName, this.$last4, this.$linkAccountId, this.$intentId, create$default, customerRequestedSave);
        args2 = this.this$0.args;
        if (args2.getCompletePayment()) {
            this.this$0.confirm(this.$clientSecret, uSBankAccount);
        } else {
            uVar = this.this$0._currentScreenState;
            String str5 = this.$linkAccountId;
            String str6 = this.$intentId;
            String str7 = this.$bankName;
            String str8 = this.$last4;
            while (true) {
                Object mo260getValue = uVar.mo260getValue();
                USBankAccountFormScreenState uSBankAccountFormScreenState = (USBankAccountFormScreenState) mo260getValue;
                PaymentSelection.New.USBankAccount uSBankAccount2 = uSBankAccount;
                if (uVar.compareAndSet(mo260getValue, new USBankAccountFormScreenState.Finished(uSBankAccount, str5, str6, str7, str8))) {
                    break;
                }
                uSBankAccount = uSBankAccount2;
            }
        }
        return b0.f54756a;
    }
}