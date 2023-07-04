package com.stripe.android.ui.core.cardscan;

import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import h00.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
/* synthetic */ class CardScanActivity$onCreate$1 extends p implements l<CardScanSheetResult, b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CardScanActivity$onCreate$1(Object obj) {
        super(1, obj, CardScanActivity.class, "onScanFinished", "onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(CardScanSheetResult cardScanSheetResult) {
        invoke2(cardScanSheetResult);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CardScanSheetResult p02) {
        s.g(p02, "p0");
        ((CardScanActivity) this.receiver).onScanFinished(p02);
    }
}