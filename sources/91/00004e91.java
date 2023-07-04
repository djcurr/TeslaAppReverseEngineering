package com.stripe.android.googlepaylauncher.injection;

import androidx.activity.result.d;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher_Factory;
import javax.inject.Provider;
import tw.f;
import v20.o0;

/* loaded from: classes6.dex */
public final class GooglePayPaymentMethodLauncherFactory_Impl implements GooglePayPaymentMethodLauncherFactory {
    private final GooglePayPaymentMethodLauncher_Factory delegateFactory;

    GooglePayPaymentMethodLauncherFactory_Impl(GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_Factory) {
        this.delegateFactory = googlePayPaymentMethodLauncher_Factory;
    }

    @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory
    public GooglePayPaymentMethodLauncher create(o0 o0Var, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, d<GooglePayPaymentMethodLauncherContract.Args> dVar, boolean z11) {
        return this.delegateFactory.get(o0Var, config, readyCallback, dVar, z11);
    }

    public static Provider<GooglePayPaymentMethodLauncherFactory> create(GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncher_Factory) {
        return f.a(new GooglePayPaymentMethodLauncherFactory_Impl(googlePayPaymentMethodLauncher_Factory));
    }
}