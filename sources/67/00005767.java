package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.app.Application;
import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import h00.a;
import java.util.Set;
import kotlin.jvm.internal.s;
import wz.x0;

/* loaded from: classes6.dex */
public final class USBankAccountFormViewModelModule {
    public final PaymentConfiguration providePaymentConfiguration(Context appContext) {
        s.g(appContext, "appContext");
        return PaymentConfiguration.Companion.getInstance(appContext);
    }

    public final a<String> providePublishableKey(Context appContext) {
        s.g(appContext, "appContext");
        return new USBankAccountFormViewModelModule$providePublishableKey$1(appContext);
    }

    public final Context providesAppContext(Application application) {
        s.g(application, "application");
        return application;
    }

    public final boolean providesEnableLogging() {
        return false;
    }

    public final Set<String> providesProductUsage() {
        Set<String> d11;
        d11 = x0.d();
        return d11;
    }
}