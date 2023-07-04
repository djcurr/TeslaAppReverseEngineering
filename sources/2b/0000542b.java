package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.OxxoAuthenticator;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.WebIntentAuthenticator;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import sw.a;

/* loaded from: classes6.dex */
public abstract class AuthenticationModule {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultReturnUrl provideDefaultReturnUrl(Context context) {
            s.g(context, "context");
            return DefaultReturnUrl.Companion.create(context);
        }

        public final l<AuthActivityStarterHost, PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(a<DefaultPaymentAuthenticatorRegistry> lazyRegistry, DefaultReturnUrl defaultReturnUrl) {
            s.g(lazyRegistry, "lazyRegistry");
            s.g(defaultReturnUrl, "defaultReturnUrl");
            return new AuthenticationModule$Companion$providePaymentBrowserAuthStarterFactory$1(lazyRegistry, defaultReturnUrl);
        }

        public final l<AuthActivityStarterHost, PaymentRelayStarter> providePaymentRelayStarterFactory(a<DefaultPaymentAuthenticatorRegistry> lazyRegistry) {
            s.g(lazyRegistry, "lazyRegistry");
            return new AuthenticationModule$Companion$providePaymentRelayStarterFactory$1(lazyRegistry);
        }
    }

    @IntentAuthenticatorMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.SdkData.Use3DS1.class)
    public abstract PaymentAuthenticator<StripeIntent> binds3DS1Authenticator(WebIntentAuthenticator webIntentAuthenticator);

    @IntentAuthenticatorMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.AlipayRedirect.class)
    public abstract PaymentAuthenticator<StripeIntent> bindsAlipayRedirectAuthenticator(WebIntentAuthenticator webIntentAuthenticator);

    @IntentAuthenticatorMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.DisplayOxxoDetails.class)
    public abstract PaymentAuthenticator<StripeIntent> bindsOxxoAuthenticator(OxxoAuthenticator oxxoAuthenticator);

    @IntentAuthenticatorMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.RedirectToUrl.class)
    public abstract PaymentAuthenticator<StripeIntent> bindsRedirectAuthenticator(WebIntentAuthenticator webIntentAuthenticator);
}