package com.stripe.android.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.s0;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.Stripe;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.i18n.ErrorMessageTranslator;
import com.stripe.android.view.i18n.TranslatorManager;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.q;

/* loaded from: classes6.dex */
public final class AddPaymentMethodViewModel extends androidx.lifecycle.p0 {
    private final AddPaymentMethodActivityStarter.Args args;
    private final ErrorMessageTranslator errorMessageTranslator;
    private final Set<String> productUsage;
    private final Stripe stripe;

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b {
        private final AddPaymentMethodActivityStarter.Args args;
        private final Stripe stripe;

        public Factory(Stripe stripe, AddPaymentMethodActivityStarter.Args args) {
            kotlin.jvm.internal.s.g(stripe, "stripe");
            kotlin.jvm.internal.s.g(args, "args");
            this.stripe = stripe;
            this.args = args;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            return new AddPaymentMethodViewModel(this.stripe, this.args, null, 4, null);
        }
    }

    public /* synthetic */ AddPaymentMethodViewModel(Stripe stripe, AddPaymentMethodActivityStarter.Args args, ErrorMessageTranslator errorMessageTranslator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripe, args, (i11 & 4) != 0 ? TranslatorManager.INSTANCE.getErrorMessageTranslator() : errorMessageTranslator);
    }

    public final /* synthetic */ LiveData attachPaymentMethod$payments_core_release(CustomerSession customerSession, PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(customerSession, "customerSession");
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        final androidx.lifecycle.f0 f0Var = new androidx.lifecycle.f0();
        String str = paymentMethod.f20932id;
        if (str == null) {
            str = "";
        }
        customerSession.attachPaymentMethod$payments_core_release(str, this.productUsage, new CustomerSession.PaymentMethodRetrievalListener() { // from class: com.stripe.android.view.AddPaymentMethodViewModel$attachPaymentMethod$1
            @Override // com.stripe.android.CustomerSession.RetrievalListener
            public void onError(int i11, String errorMessage, StripeError stripeError) {
                ErrorMessageTranslator errorMessageTranslator;
                kotlin.jvm.internal.s.g(errorMessage, "errorMessage");
                androidx.lifecycle.f0<vz.q<PaymentMethod>> f0Var2 = f0Var;
                q.a aVar = vz.q.f54772b;
                errorMessageTranslator = this.errorMessageTranslator;
                f0Var2.setValue(vz.q.a(vz.q.b(vz.r.a(new RuntimeException(errorMessageTranslator.translate(i11, errorMessage, stripeError))))));
            }

            @Override // com.stripe.android.CustomerSession.PaymentMethodRetrievalListener
            public void onPaymentMethodRetrieved(PaymentMethod paymentMethod2) {
                kotlin.jvm.internal.s.g(paymentMethod2, "paymentMethod");
                androidx.lifecycle.f0<vz.q<PaymentMethod>> f0Var2 = f0Var;
                q.a aVar = vz.q.f54772b;
                f0Var2.setValue(vz.q.a(vz.q.b(paymentMethod2)));
            }
        });
        return f0Var;
    }

    public final LiveData<vz.q<PaymentMethod>> createPaymentMethod$payments_core_release(PaymentMethodCreateParams params) {
        kotlin.jvm.internal.s.g(params, "params");
        final androidx.lifecycle.f0 f0Var = new androidx.lifecycle.f0();
        Stripe.createPaymentMethod$default(this.stripe, updatedPaymentMethodCreateParams$payments_core_release(params), null, null, new ApiResultCallback<PaymentMethod>() { // from class: com.stripe.android.view.AddPaymentMethodViewModel$createPaymentMethod$1
            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e11) {
                kotlin.jvm.internal.s.g(e11, "e");
                androidx.lifecycle.f0<vz.q<PaymentMethod>> f0Var2 = f0Var;
                q.a aVar = vz.q.f54772b;
                f0Var2.setValue(vz.q.a(vz.q.b(vz.r.a(e11))));
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onSuccess(PaymentMethod result) {
                kotlin.jvm.internal.s.g(result, "result");
                androidx.lifecycle.f0<vz.q<PaymentMethod>> f0Var2 = f0Var;
                q.a aVar = vz.q.f54772b;
                f0Var2.setValue(vz.q.a(vz.q.b(result)));
            }
        }, 6, null);
        return f0Var;
    }

    public final PaymentMethodCreateParams updatedPaymentMethodCreateParams$payments_core_release(PaymentMethodCreateParams params) {
        PaymentMethodCreateParams copy;
        kotlin.jvm.internal.s.g(params, "params");
        copy = params.copy((r34 & 1) != 0 ? params.type : null, (r34 & 2) != 0 ? params.card : null, (r34 & 4) != 0 ? params.ideal : null, (r34 & 8) != 0 ? params.fpx : null, (r34 & 16) != 0 ? params.sepaDebit : null, (r34 & 32) != 0 ? params.auBecsDebit : null, (r34 & 64) != 0 ? params.bacsDebit : null, (r34 & 128) != 0 ? params.sofort : null, (r34 & 256) != 0 ? params.upi : null, (r34 & 512) != 0 ? params.netbanking : null, (r34 & 1024) != 0 ? params.usBankAccount : null, (r34 & 2048) != 0 ? params.link : null, (r34 & 4096) != 0 ? params.billingDetails : null, (r34 & PKIFailureInfo.certRevoked) != 0 ? params.metadata : null, (r34 & 16384) != 0 ? params.productUsage : this.productUsage, (r34 & 32768) != 0 ? params.overrideParamMap : null);
        return copy;
    }

    public AddPaymentMethodViewModel(Stripe stripe, AddPaymentMethodActivityStarter.Args args, ErrorMessageTranslator errorMessageTranslator) {
        List n11;
        Set<String> S0;
        kotlin.jvm.internal.s.g(stripe, "stripe");
        kotlin.jvm.internal.s.g(args, "args");
        kotlin.jvm.internal.s.g(errorMessageTranslator, "errorMessageTranslator");
        this.stripe = stripe;
        this.args = args;
        this.errorMessageTranslator = errorMessageTranslator;
        String[] strArr = new String[2];
        strArr[0] = AddPaymentMethodActivity.PRODUCT_TOKEN;
        strArr[1] = args.isPaymentSessionActive$payments_core_release() ? PaymentSession.PRODUCT_TOKEN : null;
        n11 = wz.w.n(strArr);
        S0 = wz.e0.S0(n11);
        this.productUsage = S0;
    }
}