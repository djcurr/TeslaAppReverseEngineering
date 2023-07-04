package com.stripe.android.payments.core.authentication.threeds2;

import androidx.activity.result.c;
import androidx.activity.result.d;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class Stripe3DS2Authenticator implements PaymentAuthenticator<StripeIntent> {
    private final PaymentAuthConfig config;
    private final boolean enableLogging;
    private final String injectorKey;
    private final Set<String> productUsage;
    private final h00.a<String> publishableKeyProvider;
    private d<Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher;
    private final l<AuthActivityStarterHost, Stripe3ds2TransactionStarter> stripe3ds2CompletionStarterFactory;

    public Stripe3DS2Authenticator(PaymentAuthConfig config, boolean z11, @InjectorKey String injectorKey, h00.a<String> publishableKeyProvider, Set<String> productUsage) {
        s.g(config, "config");
        s.g(injectorKey, "injectorKey");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(productUsage, "productUsage");
        this.config = config;
        this.enableLogging = z11;
        this.injectorKey = injectorKey;
        this.publishableKeyProvider = publishableKeyProvider;
        this.productUsage = productUsage;
        this.stripe3ds2CompletionStarterFactory = new Stripe3DS2Authenticator$stripe3ds2CompletionStarterFactory$1(this);
    }

    public static /* synthetic */ void getStripe3ds2CompletionLauncher$payments_core_release$annotations() {
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object authenticate(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, zz.d dVar) {
        return authenticate2(authActivityStarterHost, stripeIntent, options, (zz.d<? super b0>) dVar);
    }

    public final d<Stripe3ds2TransactionContract.Args> getStripe3ds2CompletionLauncher$payments_core_release() {
        return this.stripe3ds2CompletionLauncher;
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        d<Stripe3ds2TransactionContract.Args> dVar = this.stripe3ds2CompletionLauncher;
        if (dVar != null) {
            dVar.d();
        }
        this.stripe3ds2CompletionLauncher = null;
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(c activityResultCaller, androidx.activity.result.b<PaymentFlowResult.Unvalidated> activityResultCallback) {
        s.g(activityResultCaller, "activityResultCaller");
        s.g(activityResultCallback, "activityResultCallback");
        this.stripe3ds2CompletionLauncher = activityResultCaller.registerForActivityResult(new Stripe3ds2TransactionContract(), activityResultCallback);
    }

    public final void setStripe3ds2CompletionLauncher$payments_core_release(d<Stripe3ds2TransactionContract.Args> dVar) {
        this.stripe3ds2CompletionLauncher = dVar;
    }

    /* renamed from: authenticate  reason: avoid collision after fix types in other method */
    public Object authenticate2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, zz.d<? super b0> dVar) {
        SdkTransactionId create = SdkTransactionId.Companion.create();
        PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config$payments_core_release = this.config.getStripe3ds2Config$payments_core_release();
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        Objects.requireNonNull(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        this.stripe3ds2CompletionStarterFactory.invoke(authActivityStarterHost).start(new Stripe3ds2TransactionContract.Args(create, stripe3ds2Config$payments_core_release, stripeIntent, (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData, options, this.enableLogging, authActivityStarterHost.getStatusBarColor$payments_core_release(), this.injectorKey, this.publishableKeyProvider.invoke(), this.productUsage));
        return b0.f54756a;
    }
}