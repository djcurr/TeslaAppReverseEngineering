package com.stripe.android.view;

import android.text.TextWatcher;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;

/* loaded from: classes6.dex */
public interface CardWidget {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final boolean DEFAULT_POSTAL_CODE_ENABLED = true;
    public static final boolean DEFAULT_POSTAL_CODE_REQUIRED = false;
    public static final boolean DEFAULT_US_ZIP_CODE_REQUIRED = false;

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final boolean DEFAULT_POSTAL_CODE_ENABLED = true;
        public static final boolean DEFAULT_POSTAL_CODE_REQUIRED = false;
        public static final boolean DEFAULT_US_ZIP_CODE_REQUIRED = false;

        private Companion() {
        }
    }

    void clear();

    CardParams getCardParams();

    PaymentMethodCreateParams.Card getPaymentMethodCard();

    PaymentMethodCreateParams getPaymentMethodCreateParams();

    void setCardHint(String str);

    void setCardInputListener(CardInputListener cardInputListener);

    void setCardNumber(String str);

    void setCardNumberTextWatcher(TextWatcher textWatcher);

    void setCardValidCallback(CardValidCallback cardValidCallback);

    void setCvcCode(String str);

    void setCvcNumberTextWatcher(TextWatcher textWatcher);

    void setExpiryDate(int i11, int i12);

    void setExpiryDateTextWatcher(TextWatcher textWatcher);

    void setPostalCodeTextWatcher(TextWatcher textWatcher);
}