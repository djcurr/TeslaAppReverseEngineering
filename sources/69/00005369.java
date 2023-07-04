package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PaymentFlowFailureMessageFactory {
    private final Context context;

    public PaymentFlowFailureMessageFactory(Context context) {
        s.g(context, "context");
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (((r0 == null || (r0 = r0.type) == null || !r0.isVoucher) ? false : true) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String createForPaymentIntent(com.stripe.android.model.PaymentIntent r5) {
        /*
            r4 = this;
            com.stripe.android.model.StripeIntent$Status r0 = r5.getStatus()
            com.stripe.android.model.StripeIntent$Status r1 = com.stripe.android.model.StripeIntent.Status.RequiresAction
            r2 = 0
            if (r0 != r1) goto L1e
            com.stripe.android.model.PaymentMethod r0 = r5.getPaymentMethod()
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L13
        L11:
            r1 = r3
            goto L1c
        L13:
            com.stripe.android.model.PaymentMethod$Type r0 = r0.type
            if (r0 != 0) goto L18
            goto L11
        L18:
            boolean r0 = r0.isVoucher
            if (r0 != r1) goto L11
        L1c:
            if (r1 == 0) goto L32
        L1e:
            com.stripe.android.model.PaymentIntent$Error r0 = r5.getLastPaymentError()
            if (r0 != 0) goto L26
            r0 = r2
            goto L2a
        L26:
            java.lang.String r0 = r0.getCode()
        L2a:
            java.lang.String r1 = "payment_intent_authentication_failure"
            boolean r0 = kotlin.jvm.internal.s.c(r0, r1)
            if (r0 == 0) goto L3f
        L32:
            android.content.Context r5 = r4.context
            android.content.res.Resources r5 = r5.getResources()
            int r0 = com.stripe.android.R.string.stripe_failure_reason_authentication
            java.lang.String r2 = r5.getString(r0)
            goto L57
        L3f:
            com.stripe.android.model.PaymentIntent$Error r0 = r5.getLastPaymentError()
            if (r0 != 0) goto L47
            r0 = r2
            goto L4b
        L47:
            com.stripe.android.model.PaymentIntent$Error$Type r0 = r0.getType()
        L4b:
            com.stripe.android.model.PaymentIntent$Error$Type r1 = com.stripe.android.model.PaymentIntent.Error.Type.CardError
            if (r0 != r1) goto L57
            com.stripe.android.model.PaymentIntent$Error r5 = r5.getLastPaymentError()
            java.lang.String r2 = r5.getMessage()
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.PaymentFlowFailureMessageFactory.createForPaymentIntent(com.stripe.android.model.PaymentIntent):java.lang.String");
    }

    private final String createForSetupIntent(SetupIntent setupIntent) {
        SetupIntent.Error lastSetupError = setupIntent.getLastSetupError();
        if (s.c(lastSetupError == null ? null : lastSetupError.getCode(), SetupIntent.Error.CODE_AUTHENTICATION_ERROR)) {
            return this.context.getResources().getString(com.stripe.android.R.string.stripe_failure_reason_authentication);
        }
        SetupIntent.Error lastSetupError2 = setupIntent.getLastSetupError();
        if ((lastSetupError2 == null ? null : lastSetupError2.getType()) == SetupIntent.Error.Type.CardError) {
            return setupIntent.getLastSetupError().getMessage();
        }
        return null;
    }

    public final String create(StripeIntent intent, int i11) {
        s.g(intent, "intent");
        if (i11 == 4) {
            return this.context.getResources().getString(com.stripe.android.R.string.stripe_failure_reason_timed_out);
        }
        if (intent.getStatus() == StripeIntent.Status.RequiresPaymentMethod || intent.getStatus() == StripeIntent.Status.RequiresAction) {
            if (intent instanceof PaymentIntent) {
                return createForPaymentIntent((PaymentIntent) intent);
            }
            if (intent instanceof SetupIntent) {
                return createForSetupIntent((SetupIntent) intent);
            }
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}