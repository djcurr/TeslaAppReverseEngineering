package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import androidx.activity.result.d;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.injection.DaggerPaymentLauncherComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherComponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public final class StripePaymentLauncher implements PaymentLauncher, Injector {
    public static final int $stable = 8;
    private final boolean enableLogging;
    private final d<PaymentLauncherContract.Args> hostActivityLauncher;
    private final String injectorKey;
    private final PaymentLauncherComponent paymentLauncherComponent;
    private final Set<String> productUsage;
    private final h00.a<String> publishableKeyProvider;
    private final h00.a<String> stripeAccountIdProvider;

    public StripePaymentLauncher(h00.a<String> publishableKeyProvider, h00.a<String> stripeAccountIdProvider, d<PaymentLauncherContract.Args> hostActivityLauncher, Context context, boolean z11, @IOContext g ioContext, @UIContext g uiContext, StripeRepository stripeRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set<String> productUsage) {
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeAccountIdProvider, "stripeAccountIdProvider");
        s.g(hostActivityLauncher, "hostActivityLauncher");
        s.g(context, "context");
        s.g(ioContext, "ioContext");
        s.g(uiContext, "uiContext");
        s.g(stripeRepository, "stripeRepository");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(productUsage, "productUsage");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.hostActivityLauncher = hostActivityLauncher;
        this.enableLogging = z11;
        this.productUsage = productUsage;
        this.paymentLauncherComponent = DaggerPaymentLauncherComponent.builder().context(context).enableLogging(z11).ioContext(ioContext).uiContext(uiContext).stripeRepository(stripeRepository).analyticsRequestFactory(paymentAnalyticsRequestFactory).publishableKeyProvider(publishableKeyProvider).stripeAccountIdProvider(stripeAccountIdProvider).productUsage(productUsage).build();
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String o11 = m0.b(PaymentLauncher.class).o();
        if (o11 != null) {
            String nextKey = weakMapInjectorRegistry.nextKey(o11);
            this.injectorKey = nextKey;
            weakMapInjectorRegistry.register(this, nextKey);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher
    public void confirm(ConfirmPaymentIntentParams params) {
        s.g(params, "params");
        this.hostActivityLauncher.b(new PaymentLauncherContract.Args.IntentConfirmationArgs(this.injectorKey, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, params, null, 64, null));
    }

    @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher
    public void handleNextActionForPaymentIntent(String clientSecret) {
        s.g(clientSecret, "clientSecret");
        this.hostActivityLauncher.b(new PaymentLauncherContract.Args.PaymentIntentNextActionArgs(this.injectorKey, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, clientSecret, null, 64, null));
    }

    @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher
    public void handleNextActionForSetupIntent(String clientSecret) {
        s.g(clientSecret, "clientSecret");
        this.hostActivityLauncher.b(new PaymentLauncherContract.Args.SetupIntentNextActionArgs(this.injectorKey, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, clientSecret, null, 64, null));
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        s.g(injectable, "injectable");
        if (injectable instanceof PaymentLauncherViewModel.Factory) {
            this.paymentLauncherComponent.inject((PaymentLauncherViewModel.Factory) injectable);
            return;
        }
        throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
    }

    @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher
    public void confirm(ConfirmSetupIntentParams params) {
        s.g(params, "params");
        this.hostActivityLauncher.b(new PaymentLauncherContract.Args.IntentConfirmationArgs(this.injectorKey, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, params, null, 64, null));
    }
}