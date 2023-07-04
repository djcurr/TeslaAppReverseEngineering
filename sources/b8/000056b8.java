package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.PrefsRepository;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModelModule {
    private final PaymentSheetContract.Args starterArgs;

    public PaymentSheetViewModelModule(PaymentSheetContract.Args starterArgs) {
        s.g(starterArgs, "starterArgs");
        this.starterArgs = starterArgs;
    }

    public final PaymentSheetContract.Args provideArgs() {
        return this.starterArgs;
    }

    public final PrefsRepository providePrefsRepository(Context appContext, @IOContext g workContext) {
        PaymentSheet.CustomerConfiguration customer;
        s.g(appContext, "appContext");
        s.g(workContext, "workContext");
        PaymentSheet.Configuration config$paymentsheet_release = this.starterArgs.getConfig$paymentsheet_release();
        DefaultPrefsRepository defaultPrefsRepository = null;
        if (config$paymentsheet_release != null && (customer = config$paymentsheet_release.getCustomer()) != null) {
            defaultPrefsRepository = new DefaultPrefsRepository(appContext, customer.component1(), workContext);
        }
        return defaultPrefsRepository == null ? new PrefsRepository.Noop() : defaultPrefsRepository;
    }
}