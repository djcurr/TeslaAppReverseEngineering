package com.stripe.android.view;

/* loaded from: classes6.dex */
public interface CardInputListener {

    /* loaded from: classes6.dex */
    public enum FocusField {
        CardNumber,
        ExpiryDate,
        Cvc,
        PostalCode
    }

    void onCardComplete();

    void onCvcComplete();

    void onExpirationComplete();

    void onFocusChange(FocusField focusField);

    void onPostalCodeComplete();
}