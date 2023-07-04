package com.stripe.android.link.injection;

import android.content.Context;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.TransformSpecToElements;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class FormControllerModule {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TransformSpecToElements provideTransformSpecToElements(ResourceRepository resourceRepository, Context context, LinkActivityContract.Args starterArgs, Map<IdentifierSpec, String> initialValues, Set<IdentifierSpec> viewOnlyFields) {
            s.g(resourceRepository, "resourceRepository");
            s.g(context, "context");
            s.g(starterArgs, "starterArgs");
            s.g(initialValues, "initialValues");
            s.g(viewOnlyFields, "viewOnlyFields");
            StripeIntent stripeIntent$link_release = starterArgs.getStripeIntent$link_release();
            PaymentIntent paymentIntent = stripeIntent$link_release instanceof PaymentIntent ? (PaymentIntent) stripeIntent$link_release : null;
            if (paymentIntent != null) {
                Long amount = paymentIntent.getAmount();
                String currency = paymentIntent.getCurrency();
                if (amount != null && currency != null) {
                    new Amount(amount.longValue(), currency);
                }
            }
            return new TransformSpecToElements(resourceRepository, initialValues, null, false, starterArgs.getMerchantName$link_release(), context, viewOnlyFields);
        }
    }
}