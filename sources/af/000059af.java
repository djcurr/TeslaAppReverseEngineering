package com.stripe.android.ui.core.cardscan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.d;
import androidx.fragment.app.q;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.ui.core.IsStripeCardScanAvailable;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.StripeCardScanProxy;
import com.stripe.android.ui.core.databinding.ActivityCardScanBinding;
import h00.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class CardScanActivity extends d {
    public static final String CARD_SCAN_PARCELABLE_NAME = "CardScanActivityResult";
    public static final Companion Companion = new Companion(null);
    private StripeCardScanProxy stripeCardScanProxy;
    private final k viewBinding$delegate;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CardScanActivity() {
        k a11;
        a11 = m.a(new CardScanActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
    }

    private final ActivityCardScanBinding getViewBinding() {
        return (ActivityCardScanBinding) this.viewBinding$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScanFinished(CardScanSheetResult cardScanSheetResult) {
        Intent putExtra = new Intent().putExtra(CARD_SCAN_PARCELABLE_NAME, (Parcelable) cardScanSheetResult);
        s.f(putExtra, "Intent()\n            .pu…     result\n            )");
        setResult(-1, putExtra);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getViewBinding().getRoot());
        this.stripeCardScanProxy = StripeCardScanProxy.Companion.create$default(StripeCardScanProxy.Companion, this, PaymentConfiguration.Companion.getInstance(this).getPublishableKey(), new CardScanActivity$onCreate$1(this), (a) null, (IsStripeCardScanAvailable) null, 24, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onStart() {
        super.onStart();
        StripeCardScanProxy stripeCardScanProxy = this.stripeCardScanProxy;
        if (stripeCardScanProxy == null) {
            s.x("stripeCardScanProxy");
            stripeCardScanProxy = null;
        }
        q supportFragmentManager = getSupportFragmentManager();
        s.f(supportFragmentManager, "supportFragmentManager");
        stripeCardScanProxy.attachCardScanFragment(this, supportFragmentManager, R.id.fragment_container, new CardScanActivity$onStart$1(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.h, android.app.Activity
    public void onStop() {
        StripeCardScanProxy.Companion companion = StripeCardScanProxy.Companion;
        q supportFragmentManager = getSupportFragmentManager();
        s.f(supportFragmentManager, "supportFragmentManager");
        StripeCardScanProxy.Companion.removeCardScanFragment$default(companion, supportFragmentManager, null, 2, null);
        super.onStop();
    }
}