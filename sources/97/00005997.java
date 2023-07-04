package com.stripe.android.ui.core;

import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import androidx.lifecycle.v;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import h00.a;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public interface StripeCardScanProxy {
    public static final Companion Companion = Companion.$$INSTANCE;

    void attachCardScanFragment(v vVar, q qVar, int i11, l<? super CardScanSheetResult, b0> lVar);

    void present();

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ StripeCardScanProxy create$default(Companion companion, Fragment fragment, String str, l lVar, a aVar, IsStripeCardScanAvailable isStripeCardScanAvailable, int i11, Object obj) {
            StripeCardScanProxy$Companion$create$1 stripeCardScanProxy$Companion$create$1 = aVar;
            if ((i11 & 8) != 0) {
                stripeCardScanProxy$Companion$create$1 = new StripeCardScanProxy$Companion$create$1(fragment, str, lVar);
            }
            a aVar2 = stripeCardScanProxy$Companion$create$1;
            if ((i11 & 16) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            return companion.create(fragment, str, lVar, aVar2, isStripeCardScanAvailable);
        }

        public static /* synthetic */ void removeCardScanFragment$default(Companion companion, q qVar, IsStripeCardScanAvailable isStripeCardScanAvailable, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            companion.removeCardScanFragment(qVar, isStripeCardScanAvailable);
        }

        public final StripeCardScanProxy create(Fragment fragment, String stripePublishableKey, l<? super CardScanSheetResult, b0> onFinished, a<? extends StripeCardScanProxy> provider, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            s.g(fragment, "fragment");
            s.g(stripePublishableKey, "stripePublishableKey");
            s.g(onFinished, "onFinished");
            s.g(provider, "provider");
            s.g(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedStripeCardScanProxy();
        }

        public final void removeCardScanFragment(q supportFragmentManager, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            s.g(supportFragmentManager, "supportFragmentManager");
            s.g(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                CardScanSheet.Companion.removeCardScanFragment(supportFragmentManager);
            }
        }

        public static /* synthetic */ StripeCardScanProxy create$default(Companion companion, d dVar, String str, l lVar, a aVar, IsStripeCardScanAvailable isStripeCardScanAvailable, int i11, Object obj) {
            StripeCardScanProxy$Companion$create$2 stripeCardScanProxy$Companion$create$2 = aVar;
            if ((i11 & 8) != 0) {
                stripeCardScanProxy$Companion$create$2 = new StripeCardScanProxy$Companion$create$2(dVar, str, lVar);
            }
            a aVar2 = stripeCardScanProxy$Companion$create$2;
            if ((i11 & 16) != 0) {
                isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
            }
            return companion.create(dVar, str, lVar, aVar2, isStripeCardScanAvailable);
        }

        public final StripeCardScanProxy create(d activity, String stripePublishableKey, l<? super CardScanSheetResult, b0> onFinished, a<? extends StripeCardScanProxy> provider, IsStripeCardScanAvailable isStripeCardScanAvailable) {
            s.g(activity, "activity");
            s.g(stripePublishableKey, "stripePublishableKey");
            s.g(onFinished, "onFinished");
            s.g(provider, "provider");
            s.g(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedStripeCardScanProxy();
        }
    }
}