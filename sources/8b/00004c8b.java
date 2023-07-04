package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class AuthenticationException extends StripeException {
    public /* synthetic */ AuthenticationException(StripeError stripeError, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeError, (i11 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationException(StripeError stripeError, String str) {
        super(stripeError, str, 401, null, null, 24, null);
        s.g(stripeError, "stripeError");
    }
}