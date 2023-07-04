package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.s0;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;

/* loaded from: classes6.dex */
public final class FpxViewModel extends androidx.lifecycle.b {
    private final String publishableKey;
    private Integer selectedPosition;
    private final StripeRepository stripeRepository;

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b {
        private final Application application;

        public Factory(Application application) {
            kotlin.jvm.internal.s.g(application, "application");
            this.application = application;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            String publishableKey = PaymentConfiguration.Companion.getInstance(this.application).getPublishableKey();
            return new FpxViewModel(this.application, publishableKey, new StripeApiRepository(this.application, new FpxViewModel$Factory$create$stripeRepository$1(publishableKey), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpxViewModel(Application application, String publishableKey, StripeRepository stripeRepository) {
        super(application);
        kotlin.jvm.internal.s.g(application, "application");
        kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
        kotlin.jvm.internal.s.g(stripeRepository, "stripeRepository");
        this.publishableKey = publishableKey;
        this.stripeRepository = stripeRepository;
    }

    public final /* synthetic */ LiveData getFpxBankStatues$payments_core_release() {
        return androidx.lifecycle.g.b(null, 0L, new FpxViewModel$getFpxBankStatues$1(this, null), 3, null);
    }

    public final Integer getSelectedPosition$payments_core_release() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition$payments_core_release(Integer num) {
        this.selectedPosition = num;
    }
}