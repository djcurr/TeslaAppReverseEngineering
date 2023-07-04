package com.stripe.android.paymentsheet;

import android.app.Application;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent;
import kotlin.jvm.internal.m0;

/* loaded from: classes6.dex */
public final class DefaultPaymentSheetLauncher implements PaymentSheetLauncher, Injector {
    private final androidx.activity.result.d<PaymentSheetContract.Args> activityResultLauncher;
    private final String injectorKey;
    private final PaymentSheetLauncherComponent paymentSheetLauncherComponent;

    public DefaultPaymentSheetLauncher(androidx.activity.result.d<PaymentSheetContract.Args> activityResultLauncher, Application application) {
        kotlin.jvm.internal.s.g(activityResultLauncher, "activityResultLauncher");
        kotlin.jvm.internal.s.g(application, "application");
        this.activityResultLauncher = activityResultLauncher;
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String o11 = m0.b(PaymentSheetLauncher.class).o();
        if (o11 != null) {
            String nextKey = weakMapInjectorRegistry.nextKey(o11);
            this.injectorKey = nextKey;
            this.paymentSheetLauncherComponent = DaggerPaymentSheetLauncherComponent.builder().application(application).injectorKey(nextKey).build();
            weakMapInjectorRegistry.register(this, nextKey);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: _init_$lambda-0 */
    public static final void m294_init_$lambda0(PaymentSheetResultCallback callback, PaymentSheetResult it2) {
        kotlin.jvm.internal.s.g(callback, "$callback");
        kotlin.jvm.internal.s.f(it2, "it");
        callback.onPaymentSheetResult(it2);
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m295_init_$lambda1(PaymentSheetResultCallback callback, PaymentSheetResult it2) {
        kotlin.jvm.internal.s.g(callback, "$callback");
        kotlin.jvm.internal.s.f(it2, "it");
        callback.onPaymentSheetResult(it2);
    }

    /* renamed from: _init_$lambda-2 */
    public static final void m296_init_$lambda2(PaymentSheetResultCallback callback, PaymentSheetResult it2) {
        kotlin.jvm.internal.s.g(callback, "$callback");
        kotlin.jvm.internal.s.f(it2, "it");
        callback.onPaymentSheetResult(it2);
    }

    public static /* synthetic */ void a(PaymentSheetResultCallback paymentSheetResultCallback, PaymentSheetResult paymentSheetResult) {
        m294_init_$lambda0(paymentSheetResultCallback, paymentSheetResult);
    }

    public static /* synthetic */ void b(PaymentSheetResultCallback paymentSheetResultCallback, PaymentSheetResult paymentSheetResult) {
        m296_init_$lambda2(paymentSheetResultCallback, paymentSheetResult);
    }

    public static /* synthetic */ void c(PaymentSheetResultCallback paymentSheetResultCallback, PaymentSheetResult paymentSheetResult) {
        m295_init_$lambda1(paymentSheetResultCallback, paymentSheetResult);
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    private final void present(PaymentSheetContract.Args args) {
        this.activityResultLauncher.b(args);
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        kotlin.jvm.internal.s.g(injectable, "injectable");
        if (injectable instanceof PaymentSheetViewModel.Factory) {
            this.paymentSheetLauncherComponent.inject((PaymentSheetViewModel.Factory) injectable);
        } else if (injectable instanceof FormViewModel.Factory) {
            this.paymentSheetLauncherComponent.inject((FormViewModel.Factory) injectable);
        } else {
            throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
        }
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheetLauncher
    public void presentWithPaymentIntent(String paymentIntentClientSecret, PaymentSheet.Configuration configuration) {
        kotlin.jvm.internal.s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
        present(PaymentSheetContract.Args.Companion.createPaymentIntentArgsWithInjectorKey$paymentsheet_release(paymentIntentClientSecret, configuration, this.injectorKey));
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheetLauncher
    public void presentWithSetupIntent(String setupIntentClientSecret, PaymentSheet.Configuration configuration) {
        kotlin.jvm.internal.s.g(setupIntentClientSecret, "setupIntentClientSecret");
        present(PaymentSheetContract.Args.Companion.createSetupIntentArgsWithInjectorKey$paymentsheet_release(setupIntentClientSecret, configuration, this.injectorKey));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DefaultPaymentSheetLauncher(androidx.activity.ComponentActivity r3, final com.stripe.android.paymentsheet.PaymentSheetResultCallback r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r4, r0)
            com.stripe.android.paymentsheet.PaymentSheetContract r0 = new com.stripe.android.paymentsheet.PaymentSheetContract
            r0.<init>()
            com.stripe.android.paymentsheet.e r1 = new com.stripe.android.paymentsheet.e
            r1.<init>()
            androidx.activity.result.d r4 = r3.registerForActivityResult(r0, r1)
            java.lang.String r0 = "activity.registerForActi…SheetResult(it)\n        }"
            kotlin.jvm.internal.s.f(r4, r0)
            android.app.Application r3 = r3.getApplication()
            java.lang.String r0 = "activity.application"
            kotlin.jvm.internal.s.f(r3, r0)
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher.<init>(androidx.activity.ComponentActivity, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DefaultPaymentSheetLauncher(androidx.fragment.app.Fragment r3, final com.stripe.android.paymentsheet.PaymentSheetResultCallback r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r4, r0)
            com.stripe.android.paymentsheet.PaymentSheetContract r0 = new com.stripe.android.paymentsheet.PaymentSheetContract
            r0.<init>()
            com.stripe.android.paymentsheet.g r1 = new com.stripe.android.paymentsheet.g
            r1.<init>()
            androidx.activity.result.d r4 = r3.registerForActivityResult(r0, r1)
            java.lang.String r0 = "fragment.registerForActi…SheetResult(it)\n        }"
            kotlin.jvm.internal.s.f(r4, r0)
            androidx.fragment.app.h r3 = r3.requireActivity()
            android.app.Application r3 = r3.getApplication()
            java.lang.String r0 = "fragment.requireActivity().application"
            kotlin.jvm.internal.s.f(r3, r0)
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher.<init>(androidx.fragment.app.Fragment, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DefaultPaymentSheetLauncher(androidx.fragment.app.Fragment r3, androidx.activity.result.ActivityResultRegistry r4, final com.stripe.android.paymentsheet.PaymentSheetResultCallback r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r5, r0)
            com.stripe.android.paymentsheet.PaymentSheetContract r0 = new com.stripe.android.paymentsheet.PaymentSheetContract
            r0.<init>()
            com.stripe.android.paymentsheet.f r1 = new com.stripe.android.paymentsheet.f
            r1.<init>()
            androidx.activity.result.d r4 = r3.registerForActivityResult(r0, r4, r1)
            java.lang.String r5 = "fragment.registerForActi…SheetResult(it)\n        }"
            kotlin.jvm.internal.s.f(r4, r5)
            androidx.fragment.app.h r3 = r3.requireActivity()
            android.app.Application r3 = r3.getApplication()
            java.lang.String r5 = "fragment.requireActivity().application"
            kotlin.jvm.internal.s.f(r3, r5)
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher.<init>(androidx.fragment.app.Fragment, androidx.activity.result.ActivityResultRegistry, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }
}