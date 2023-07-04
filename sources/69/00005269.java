package com.stripe.android.model;

import com.stripe.android.StripePaymentController;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.w0;

/* loaded from: classes6.dex */
public final class StripeIntentKtxKt {
    private static final Set<PaymentMethod.Type> REFRESHABLE_PAYMENT_METHODS;

    static {
        Set<PaymentMethod.Type> c11;
        c11 = w0.c(PaymentMethod.Type.WeChatPay);
        REFRESHABLE_PAYMENT_METHODS = c11;
    }

    public static final Set<PaymentMethod.Type> getREFRESHABLE_PAYMENT_METHODS() {
        return REFRESHABLE_PAYMENT_METHODS;
    }

    public static final int getRequestCode(StripeIntent stripeIntent) {
        s.g(stripeIntent, "<this>");
        return StripePaymentController.Companion.getRequestCode$payments_core_release(stripeIntent);
    }

    public static final boolean shouldRefresh(StripeIntent stripeIntent) {
        boolean T;
        s.g(stripeIntent, "<this>");
        if (stripeIntent instanceof PaymentIntent) {
            Set<PaymentMethod.Type> set = REFRESHABLE_PAYMENT_METHODS;
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            T = e0.T(set, paymentMethod == null ? null : paymentMethod.type);
            if (T && stripeIntent.requiresAction()) {
                return true;
            }
        }
        return false;
    }
}