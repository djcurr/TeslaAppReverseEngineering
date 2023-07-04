package com.stripe.android;

import android.content.Intent;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.AuthActivityStarterHost;
import vz.b0;

/* loaded from: classes2.dex */
public interface PaymentController {

    /* loaded from: classes2.dex */
    public enum StripeIntentType {
        PaymentIntent,
        SetupIntent
    }

    Object confirmAndAuthenticateAlipay(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, zz.d<? super PaymentIntentResult> dVar);

    Object confirmWeChatPay(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, zz.d<? super WeChatPayNextAction> dVar);

    Object getAuthenticateSourceResult(Intent intent, zz.d<? super Source> dVar);

    Object getPaymentIntentResult(Intent intent, zz.d<? super PaymentIntentResult> dVar);

    Object getSetupIntentResult(Intent intent, zz.d<? super SetupIntentResult> dVar);

    Object handleNextAction(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, zz.d<? super b0> dVar);

    void registerLaunchersWithActivityResultCaller(androidx.activity.result.c cVar, androidx.activity.result.b<PaymentFlowResult.Unvalidated> bVar);

    boolean shouldHandlePaymentResult(int i11, Intent intent);

    boolean shouldHandleSetupResult(int i11, Intent intent);

    boolean shouldHandleSourceResult(int i11, Intent intent);

    Object startAuth(AuthActivityStarterHost authActivityStarterHost, String str, ApiRequest.Options options, StripeIntentType stripeIntentType, zz.d<? super b0> dVar);

    Object startAuthenticateSource(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, zz.d<? super b0> dVar);

    Object startConfirmAndAuth(AuthActivityStarterHost authActivityStarterHost, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, zz.d<? super b0> dVar);

    void unregisterLaunchers();
}