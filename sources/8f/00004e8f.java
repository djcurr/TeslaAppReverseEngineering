package com.stripe.android.googlepaylauncher.injection;

import androidx.activity.result.d;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import v20.o0;

/* loaded from: classes6.dex */
public interface GooglePayPaymentMethodLauncherFactory {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ GooglePayPaymentMethodLauncher create$default(GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, o0 o0Var, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, d dVar, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 16) != 0) {
                    z11 = false;
                }
                return googlePayPaymentMethodLauncherFactory.create(o0Var, config, readyCallback, dVar, z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
    }

    GooglePayPaymentMethodLauncher create(o0 o0Var, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, d<GooglePayPaymentMethodLauncherContract.Args> dVar, boolean z11);
}