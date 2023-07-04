package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import h00.l;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public final class PaymentOptionsViewModelModule {
    @InjectorKey
    public final String provideDummyInjectorKey() {
        return InjectorKt.DUMMY_INJECTOR_KEY;
    }

    public final EventReporter.Mode provideEventReporterMode() {
        return EventReporter.Mode.Custom;
    }

    public final l<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(Context appContext, @IOContext g workContext) {
        s.g(appContext, "appContext");
        s.g(workContext, "workContext");
        return new PaymentOptionsViewModelModule$providePrefsRepositoryFactory$1(appContext, workContext);
    }
}