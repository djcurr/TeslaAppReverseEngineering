package com.stripe.android.ui.core;

import androidx.fragment.app.q;
import androidx.lifecycle.v;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class UnsupportedStripeCardScanProxy implements StripeCardScanProxy {
    @Override // com.stripe.android.ui.core.StripeCardScanProxy
    public void attachCardScanFragment(v lifecycleOwner, q supportFragmentManager, int i11, l<? super CardScanSheetResult, b0> onFinished) {
        s.g(lifecycleOwner, "lifecycleOwner");
        s.g(supportFragmentManager, "supportFragmentManager");
        s.g(onFinished, "onFinished");
    }

    @Override // com.stripe.android.ui.core.StripeCardScanProxy
    public void present() {
    }
}