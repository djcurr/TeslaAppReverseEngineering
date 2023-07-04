package com.stripe.android.payments.core.injection;

import android.content.Context;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import h00.a;
import java.util.Set;

/* loaded from: classes6.dex */
public interface Stripe3ds2TransactionViewModelFactoryComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Stripe3ds2TransactionViewModelFactoryComponent build();

        Builder context(Context context);

        Builder enableLogging(boolean z11);

        Builder isInstantApp(boolean z11);

        Builder productUsage(Set<String> set);

        Builder publishableKeyProvider(a<String> aVar);
    }

    void inject(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory);
}