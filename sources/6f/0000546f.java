package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.z;
import androidx.fragment.app.Fragment;
import c1.i;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public interface PaymentLauncher {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PaymentLauncher create$default(Companion companion, ComponentActivity componentActivity, String str, String str2, PaymentResultCallback paymentResultCallback, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return companion.create(componentActivity, str, str2, paymentResultCallback);
        }

        public final PaymentLauncher create(ComponentActivity activity, String publishableKey, String str, PaymentResultCallback callback) {
            s.g(activity, "activity");
            s.g(publishableKey, "publishableKey");
            s.g(callback, "callback");
            return new PaymentLauncherFactory(activity, callback).create(publishableKey, str);
        }

        public final PaymentLauncher createForCompose(String publishableKey, String str, PaymentResultCallback callback, i iVar, int i11, int i12) {
            s.g(publishableKey, "publishableKey");
            s.g(callback, "callback");
            iVar.x(47442728);
            if ((i12 & 2) != 0) {
                str = null;
            }
            PaymentLauncher create = new PaymentLauncherFactory((Context) iVar.A(z.g()), d.b.a(new PaymentLauncherContract(), new PaymentLauncher$Companion$createForCompose$1(callback), iVar, 0)).create(publishableKey, str);
            iVar.N();
            return create;
        }

        public static /* synthetic */ PaymentLauncher create$default(Companion companion, Fragment fragment, String str, String str2, PaymentResultCallback paymentResultCallback, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return companion.create(fragment, str, str2, paymentResultCallback);
        }

        public final PaymentLauncher create(Fragment fragment, String publishableKey, String str, PaymentResultCallback callback) {
            s.g(fragment, "fragment");
            s.g(publishableKey, "publishableKey");
            s.g(callback, "callback");
            return new PaymentLauncherFactory(fragment, callback).create(publishableKey, str);
        }
    }

    /* loaded from: classes6.dex */
    public interface PaymentResultCallback {
        void onPaymentResult(PaymentResult paymentResult);
    }

    void confirm(ConfirmPaymentIntentParams confirmPaymentIntentParams);

    void confirm(ConfirmSetupIntentParams confirmSetupIntentParams);

    void handleNextActionForPaymentIntent(String str);

    void handleNextActionForSetupIntent(String str);
}