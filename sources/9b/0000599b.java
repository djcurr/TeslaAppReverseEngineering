package com.stripe.android.ui.core;

import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import h00.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import vz.g;

/* loaded from: classes6.dex */
final class StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0 implements CardScanSheet.CardScanResultCallback, m {
    private final /* synthetic */ l function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0(l lVar) {
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CardScanSheet.CardScanResultCallback) && (obj instanceof m)) {
            return s.c(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.m
    public final g<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onCardScanSheetResult(CardScanSheetResult cardScanSheetResult) {
        this.function.invoke(cardScanSheetResult);
    }
}