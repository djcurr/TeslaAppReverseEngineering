package com.stripe.android.payments.core.injection;

import com.stripe.android.model.StripeIntent;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface IntentAuthenticatorKey {
    Class<? extends StripeIntent.NextActionData> value();
}