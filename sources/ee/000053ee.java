package com.stripe.android.payments.core.authentication;

import androidx.activity.result.b;
import androidx.activity.result.c;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.ActivityResultLauncherHost;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.jvm.internal.s;
import vz.b0;
import zz.d;

/* loaded from: classes6.dex */
public interface PaymentAuthenticator<Authenticatable> extends ActivityResultLauncherHost {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static <Authenticatable> void onLauncherInvalidated(PaymentAuthenticator<Authenticatable> paymentAuthenticator) {
            s.g(paymentAuthenticator, "this");
            ActivityResultLauncherHost.DefaultImpls.onLauncherInvalidated(paymentAuthenticator);
        }

        public static <Authenticatable> void onNewActivityResultCaller(PaymentAuthenticator<Authenticatable> paymentAuthenticator, c activityResultCaller, b<PaymentFlowResult.Unvalidated> activityResultCallback) {
            s.g(paymentAuthenticator, "this");
            s.g(activityResultCaller, "activityResultCaller");
            s.g(activityResultCallback, "activityResultCallback");
            ActivityResultLauncherHost.DefaultImpls.onNewActivityResultCaller(paymentAuthenticator, activityResultCaller, activityResultCallback);
        }
    }

    Object authenticate(AuthActivityStarterHost authActivityStarterHost, Authenticatable authenticatable, ApiRequest.Options options, d<? super b0> dVar);
}