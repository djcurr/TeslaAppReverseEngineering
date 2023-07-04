package com.stripe.android.ui.core;

import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.d;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class StripeCardScanProxy$Companion$create$2 extends u implements a<DefaultStripeCardScanProxy> {
    final /* synthetic */ d $activity;
    final /* synthetic */ l<CardScanSheetResult, b0> $onFinished;
    final /* synthetic */ String $stripePublishableKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeCardScanProxy$Companion$create$2(d dVar, String str, l<? super CardScanSheetResult, b0> lVar) {
        super(0);
        this.$activity = dVar;
        this.$stripePublishableKey = str;
        this.$onFinished = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final DefaultStripeCardScanProxy invoke() {
        return new DefaultStripeCardScanProxy(CardScanSheet.Companion.create$default(CardScanSheet.Companion, this.$activity, this.$stripePublishableKey, new StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0(this.$onFinished), (ActivityResultRegistry) null, 8, (Object) null));
    }
}