package com.stripe.android.networking;

import com.stripe.android.cards.Bin;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.Customer;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.ListPaymentMethodsParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;
import vz.b0;
import wz.w;
import zz.d;

/* loaded from: classes6.dex */
public abstract class StripeRepository {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object confirmPaymentIntent$payments_core_release$default(StripeRepository stripeRepository, ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List list, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                list = w.i();
            }
            return stripeRepository.confirmPaymentIntent$payments_core_release(confirmPaymentIntentParams, options, list, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmPaymentIntent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object confirmSetupIntent$payments_core_release$default(StripeRepository stripeRepository, ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List list, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                list = w.i();
            }
            return stripeRepository.confirmSetupIntent$payments_core_release(confirmSetupIntentParams, options, list, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmSetupIntent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object retrievePaymentIntent$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                list = w.i();
            }
            return stripeRepository.retrievePaymentIntent(str, options, list, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrievePaymentIntent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object retrieveSetupIntent$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                list = w.i();
            }
            return stripeRepository.retrieveSetupIntent(str, options, list, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveSetupIntent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object retrieveStripeIntent$payments_core_release$default(StripeRepository stripeRepository, String str, ApiRequest.Options options, List list, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                list = w.i();
            }
            return stripeRepository.retrieveStripeIntent$payments_core_release(str, options, list, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retrieveStripeIntent");
    }

    public abstract Object addCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, d<? super Source> dVar);

    public abstract Object attachFinancialConnectionsSessionToPaymentIntent(String str, String str2, String str3, ApiRequest.Options options, d<? super PaymentIntent> dVar);

    public abstract Object attachFinancialConnectionsSessionToSetupIntent(String str, String str2, String str3, ApiRequest.Options options, d<? super SetupIntent> dVar);

    public abstract Object attachPaymentMethod(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, d<? super PaymentMethod> dVar);

    public abstract Object cancelPaymentIntentSource$payments_core_release(String str, String str2, ApiRequest.Options options, d<? super PaymentIntent> dVar);

    public abstract Object cancelSetupIntentSource$payments_core_release(String str, String str2, ApiRequest.Options options, d<? super SetupIntent> dVar);

    public abstract Object complete3ds2Auth$payments_core_release(String str, ApiRequest.Options options, d<? super Stripe3ds2AuthResult> dVar);

    public abstract Object confirmConsumerVerification(String str, String str2, String str3, ApiRequest.Options options, d<? super ConsumerSession> dVar);

    public abstract Object confirmPaymentIntent$payments_core_release(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, d<? super PaymentIntent> dVar);

    public abstract Object confirmSetupIntent$payments_core_release(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, d<? super SetupIntent> dVar);

    public abstract Object consumerSignUp(String str, String str2, String str3, String str4, ApiRequest.Options options, d<? super ConsumerSession> dVar);

    public abstract Object createFile$payments_core_release(StripeFileParams stripeFileParams, ApiRequest.Options options, d<? super StripeFile> dVar);

    public abstract Object createPaymentDetails(String str, ConsumerPaymentDetailsCreateParams consumerPaymentDetailsCreateParams, ApiRequest.Options options, d<? super ConsumerPaymentDetails> dVar);

    public abstract Object createPaymentIntentFinancialConnectionsSession$payments_core_release(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, d<? super FinancialConnectionsSession> dVar);

    public abstract Object createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, d<? super PaymentMethod> dVar);

    public abstract Object createRadarSession$payments_core_release(ApiRequest.Options options, d<? super RadarSession> dVar);

    public abstract Object createSetupIntentFinancialConnectionsSession$payments_core_release(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, d<? super FinancialConnectionsSession> dVar);

    public abstract Object createSource$payments_core_release(SourceParams sourceParams, ApiRequest.Options options, d<? super Source> dVar);

    public abstract Object createToken$payments_core_release(TokenParams tokenParams, ApiRequest.Options options, d<? super Token> dVar);

    public abstract Object deleteCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, d<? super Source> dVar);

    public abstract Object deletePaymentDetails(String str, String str2, ApiRequest.Options options, d<? super b0> dVar);

    public abstract Object detachPaymentMethod(String str, Set<String> set, String str2, ApiRequest.Options options, d<? super PaymentMethod> dVar);

    public abstract Object getCardMetadata$payments_core_release(Bin bin, ApiRequest.Options options, d<? super CardMetadata> dVar);

    public abstract Object getFpxBankStatus$payments_core_release(ApiRequest.Options options, d<? super BankStatuses> dVar);

    public abstract Object getPaymentMethods(ListPaymentMethodsParams listPaymentMethodsParams, String str, Set<String> set, ApiRequest.Options options, d<? super List<PaymentMethod>> dVar);

    public abstract Object listPaymentDetails(String str, Set<String> set, ApiRequest.Options options, d<? super ConsumerPaymentDetails> dVar);

    public abstract Object logoutConsumer(String str, String str2, ApiRequest.Options options, d<? super ConsumerSession> dVar);

    public abstract Object lookupConsumerSession(String str, String str2, ApiRequest.Options options, d<? super ConsumerSessionLookup> dVar);

    public abstract Object refreshPaymentIntent$payments_core_release(String str, ApiRequest.Options options, d<? super PaymentIntent> dVar);

    public abstract Object retrieveCustomer$payments_core_release(String str, Set<String> set, ApiRequest.Options options, d<? super Customer> dVar);

    public abstract Object retrieveIssuingCardPin$payments_core_release(String str, String str2, String str3, ApiRequest.Options options, d<? super String> dVar);

    public abstract Object retrieveObject$payments_core_release(String str, ApiRequest.Options options, d<? super JSONObject> dVar);

    public abstract Object retrievePaymentIntent(String str, ApiRequest.Options options, List<String> list, d<? super PaymentIntent> dVar);

    public abstract Object retrievePaymentIntentWithOrderedPaymentMethods(String str, ApiRequest.Options options, Locale locale, d<? super PaymentIntent> dVar);

    public abstract Object retrieveSetupIntent(String str, ApiRequest.Options options, List<String> list, d<? super SetupIntent> dVar);

    public abstract Object retrieveSetupIntentWithOrderedPaymentMethods(String str, ApiRequest.Options options, Locale locale, d<? super SetupIntent> dVar);

    public abstract Object retrieveSource$payments_core_release(String str, String str2, ApiRequest.Options options, d<? super Source> dVar);

    public abstract Object retrieveStripeIntent$payments_core_release(String str, ApiRequest.Options options, List<String> list, d<? super StripeIntent> dVar);

    public abstract Object setCustomerShippingInfo$payments_core_release(String str, String str2, Set<String> set, ShippingInformation shippingInformation, ApiRequest.Options options, d<? super Customer> dVar);

    public abstract Object setDefaultCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, d<? super Customer> dVar);

    public abstract Object start3ds2Auth$payments_core_release(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, d<? super Stripe3ds2AuthResult> dVar);

    public abstract Object startConsumerVerification(String str, Locale locale, String str2, ApiRequest.Options options, d<? super ConsumerSession> dVar);

    public abstract Object updateIssuingCardPin$payments_core_release(String str, String str2, String str3, String str4, ApiRequest.Options options, d<? super b0> dVar);

    public abstract Object updatePaymentDetails(String str, ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, ApiRequest.Options options, d<? super ConsumerPaymentDetails> dVar);

    public abstract Object verifyPaymentIntentWithMicrodeposits(String str, int i11, int i12, ApiRequest.Options options, d<? super PaymentIntent> dVar);

    public abstract Object verifyPaymentIntentWithMicrodeposits(String str, String str2, ApiRequest.Options options, d<? super PaymentIntent> dVar);

    public abstract Object verifySetupIntentWithMicrodeposits(String str, int i11, int i12, ApiRequest.Options options, d<? super SetupIntent> dVar);

    public abstract Object verifySetupIntentWithMicrodeposits(String str, String str2, ApiRequest.Options options, d<? super SetupIntent> dVar);
}