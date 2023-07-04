package com.stripe.android.model;

import android.os.Parcelable;

/* loaded from: classes6.dex */
public interface ConfirmStripeIntentParams extends StripeParamsModel, Parcelable {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String PARAM_CLIENT_SECRET = "client_secret";
    public static final String PARAM_MANDATE_DATA = "mandate_data";
    public static final String PARAM_MANDATE_ID = "mandate";
    public static final String PARAM_PAYMENT_METHOD_DATA = "payment_method_data";
    public static final String PARAM_PAYMENT_METHOD_ID = "payment_method";
    public static final String PARAM_RETURN_URL = "return_url";
    public static final String PARAM_USE_STRIPE_SDK = "use_stripe_sdk";

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PARAM_CLIENT_SECRET = "client_secret";
        public static final String PARAM_MANDATE_DATA = "mandate_data";
        public static final String PARAM_MANDATE_ID = "mandate";
        public static final String PARAM_PAYMENT_METHOD_DATA = "payment_method_data";
        public static final String PARAM_PAYMENT_METHOD_ID = "payment_method";
        public static final String PARAM_RETURN_URL = "return_url";
        public static final String PARAM_USE_STRIPE_SDK = "use_stripe_sdk";

        private Companion() {
        }
    }

    String getClientSecret();

    String getReturnUrl();

    void setReturnUrl(String str);

    boolean shouldUseStripeSdk();

    ConfirmStripeIntentParams withShouldUseStripeSdk(boolean z11);
}