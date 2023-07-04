package com.stripe.android.ui.core;

/* loaded from: classes6.dex */
public final class DefaultIsStripeCardScanAvailable implements IsStripeCardScanAvailable {
    @Override // com.stripe.android.ui.core.IsStripeCardScanAvailable
    public boolean invoke() {
        try {
            Class.forName("com.stripe.android.stripecardscan.cardscan.CardScanSheet");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}