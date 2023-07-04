package com.stripe.android.ui.core;

import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class StripeCardScanProxy$Companion$create$1 extends u implements a<DefaultStripeCardScanProxy> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ l<CardScanSheetResult, b0> $onFinished;
    final /* synthetic */ String $stripePublishableKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeCardScanProxy$Companion$create$1(Fragment fragment, String str, l<? super CardScanSheetResult, b0> lVar) {
        super(0);
        this.$fragment = fragment;
        this.$stripePublishableKey = str;
        this.$onFinished = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final DefaultStripeCardScanProxy invoke() {
        return new DefaultStripeCardScanProxy(CardScanSheet.Companion.create$default(CardScanSheet.Companion, this.$fragment, this.$stripePublishableKey, new StripeCardScanProxy$sam$com_stripe_android_stripecardscan_cardscan_CardScanSheet_CardScanResultCallback$0(this.$onFinished), (ActivityResultRegistry) null, 8, (Object) null));
    }
}