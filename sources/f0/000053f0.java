package com.stripe.android.payments.core.authentication;

import androidx.activity.result.b;
import androidx.activity.result.c;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.ActivityResultLauncherHost;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public interface PaymentAuthenticatorRegistry extends ActivityResultLauncherHost {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static void onLauncherInvalidated(PaymentAuthenticatorRegistry paymentAuthenticatorRegistry) {
            s.g(paymentAuthenticatorRegistry, "this");
            ActivityResultLauncherHost.DefaultImpls.onLauncherInvalidated(paymentAuthenticatorRegistry);
        }

        public static void onNewActivityResultCaller(PaymentAuthenticatorRegistry paymentAuthenticatorRegistry, c activityResultCaller, b<PaymentFlowResult.Unvalidated> activityResultCallback) {
            s.g(paymentAuthenticatorRegistry, "this");
            s.g(activityResultCaller, "activityResultCaller");
            s.g(activityResultCallback, "activityResultCallback");
            ActivityResultLauncherHost.DefaultImpls.onNewActivityResultCaller(paymentAuthenticatorRegistry, activityResultCaller, activityResultCallback);
        }
    }

    <Authenticatable> PaymentAuthenticator<Authenticatable> getAuthenticator(Authenticatable authenticatable);
}