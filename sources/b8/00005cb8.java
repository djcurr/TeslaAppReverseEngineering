package com.stripe.android.view;

import com.stripe.android.Stripe;
import com.stripe.android.core.networking.StripeClientUserAgentHeaderFactory;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentAuthWebViewActivityViewModel$extraHeaders$2 extends kotlin.jvm.internal.u implements h00.a<Map<String, ? extends String>> {
    public static final PaymentAuthWebViewActivityViewModel$extraHeaders$2 INSTANCE = new PaymentAuthWebViewActivityViewModel$extraHeaders$2();

    PaymentAuthWebViewActivityViewModel$extraHeaders$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<String, ? extends String> invoke() {
        return new StripeClientUserAgentHeaderFactory(null, 1, null).create(Stripe.Companion.getAppInfo());
    }
}