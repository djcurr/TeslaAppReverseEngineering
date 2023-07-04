package com.stripe.android.view.i18n;

import com.stripe.android.core.StripeError;

/* loaded from: classes6.dex */
public final class TranslatorManager {
    private static ErrorMessageTranslator errorMessageTranslator;
    public static final TranslatorManager INSTANCE = new TranslatorManager();
    private static final Default DEFAULT_ERROR_MESSAGE_TRANSLATOR = new Default();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    private static final class Default implements ErrorMessageTranslator {
        @Override // com.stripe.android.view.i18n.ErrorMessageTranslator
        public String translate(int i11, String str, StripeError stripeError) {
            return str == null ? "" : str;
        }
    }

    private TranslatorManager() {
    }

    public final ErrorMessageTranslator getErrorMessageTranslator() {
        ErrorMessageTranslator errorMessageTranslator2 = errorMessageTranslator;
        return errorMessageTranslator2 == null ? DEFAULT_ERROR_MESSAGE_TRANSLATOR : errorMessageTranslator2;
    }

    public final void setErrorMessageTranslator(ErrorMessageTranslator errorMessageTranslator2) {
        errorMessageTranslator = errorMessageTranslator2;
    }
}