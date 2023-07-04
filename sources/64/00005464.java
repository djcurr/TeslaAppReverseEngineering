package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class WeChatPayAuthenticatorModule {
    /* JADX WARN: Multi-variable type inference failed */
    @IntentAuthenticatorMap
    @IntentAuthenticatorKey(StripeIntent.NextActionData.WeChatPayRedirect.class)
    public final PaymentAuthenticator<StripeIntent> provideWeChatAuthenticator$payments_core_release(UnsupportedAuthenticator unsupportedAuthenticator) {
        UnsupportedAuthenticator unsupportedAuthenticator2;
        Object newInstance;
        s.g(unsupportedAuthenticator, "unsupportedAuthenticator");
        try {
            q.a aVar = q.f54772b;
            newInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayAuthenticator").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            unsupportedAuthenticator2 = q.b(r.a(th2));
        }
        if (newInstance != null) {
            unsupportedAuthenticator2 = q.b((PaymentAuthenticator) newInstance);
            if (!q.g(unsupportedAuthenticator2)) {
                unsupportedAuthenticator = unsupportedAuthenticator2;
            }
            return unsupportedAuthenticator;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent>");
    }
}