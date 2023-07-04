package com.stripe.android.link.confirmation;

import androidx.activity.result.b;
import androidx.activity.result.c;
import androidx.activity.result.d;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import h00.a;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class ConfirmationManager {
    private l<? super q<? extends PaymentResult>, b0> completionCallback;
    private PaymentLauncher paymentLauncher;
    private final StripePaymentLauncherAssistedFactory paymentLauncherFactory;
    private final a<String> publishableKeyProvider;
    private final a<String> stripeAccountIdProvider;

    public ConfirmationManager(StripePaymentLauncherAssistedFactory paymentLauncherFactory, a<String> publishableKeyProvider, a<String> stripeAccountIdProvider) {
        s.g(paymentLauncherFactory, "paymentLauncherFactory");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeAccountIdProvider, "stripeAccountIdProvider");
        this.paymentLauncherFactory = paymentLauncherFactory;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
    }

    public static /* synthetic */ void a(ConfirmationManager confirmationManager, PaymentResult paymentResult) {
        confirmationManager.onPaymentResult(paymentResult);
    }

    public final b0 onPaymentResult(PaymentResult paymentResult) {
        l<? super q<? extends PaymentResult>, b0> lVar = this.completionCallback;
        if (lVar == null) {
            return null;
        }
        q.a aVar = q.f54772b;
        lVar.invoke(q.a(q.b(paymentResult)));
        return b0.f54756a;
    }

    public final void confirmStripeIntent(ConfirmStripeIntentParams confirmStripeIntentParams, l<? super q<? extends PaymentResult>, b0> onResult) {
        Object b11;
        PaymentLauncher paymentLauncher;
        s.g(confirmStripeIntentParams, "confirmStripeIntentParams");
        s.g(onResult, "onResult");
        this.completionCallback = onResult;
        try {
            q.a aVar = q.f54772b;
            paymentLauncher = this.paymentLauncher;
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (paymentLauncher != null) {
            b11 = q.b(paymentLauncher);
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                PaymentLauncher paymentLauncher2 = (PaymentLauncher) b11;
                if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                    paymentLauncher2.confirm((ConfirmPaymentIntentParams) confirmStripeIntentParams);
                    return;
                } else if (confirmStripeIntentParams instanceof ConfirmSetupIntentParams) {
                    paymentLauncher2.confirm((ConfirmSetupIntentParams) confirmStripeIntentParams);
                    return;
                } else {
                    return;
                }
            }
            q.a aVar3 = q.f54772b;
            onResult.invoke(q.a(q.b(r.a(e11))));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void invalidatePaymentLauncher() {
        this.paymentLauncher = null;
    }

    public final void setupPaymentLauncher(c activityResultCaller) {
        s.g(activityResultCaller, "activityResultCaller");
        StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory = this.paymentLauncherFactory;
        a<String> aVar = this.publishableKeyProvider;
        a<String> aVar2 = this.stripeAccountIdProvider;
        d<PaymentLauncherContract.Args> registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new b() { // from class: ur.a
            {
                ConfirmationManager.this = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ConfirmationManager.a(ConfirmationManager.this, (PaymentResult) obj);
            }
        });
        s.f(registerForActivityResult, "activityResultCaller.reg…ymentResult\n            )");
        this.paymentLauncher = stripePaymentLauncherAssistedFactory.create(aVar, aVar2, registerForActivityResult);
    }
}