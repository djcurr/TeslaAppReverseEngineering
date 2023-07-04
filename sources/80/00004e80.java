package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import androidx.lifecycle.l0;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository_Factory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory_Factory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import h00.a;
import javax.inject.Provider;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerGooglePayPaymentMethodLauncherComponent extends GooglePayPaymentMethodLauncherComponent {
    private Provider<Context> contextProvider;
    private Provider<DefaultGooglePayRepository> defaultGooglePayRepositoryProvider;
    private Provider<Boolean> enableLoggingProvider;
    private Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;
    private final DaggerGooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent;
    private Provider<PaymentsClientFactory> paymentsClientFactoryProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<PaymentsClient> providePaymentsClientProvider;
    private final a<String> publishableKeyProvider;
    private Provider<a<String>> publishableKeyProvider2;
    private final a<String> stripeAccountIdProvider;
    private Provider<a<String>> stripeAccountIdProvider2;
    private final StripeRepository stripeRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements GooglePayPaymentMethodLauncherComponent.Builder {
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Context context;
        private Boolean enableLogging;
        private GooglePayPaymentMethodLauncher.Config googlePayConfig;
        private g ioContext;
        private a<String> publishableKeyProvider;
        private a<String> stripeAccountIdProvider;
        private StripeRepository stripeRepository;

        private Builder() {
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public GooglePayPaymentMethodLauncherComponent build() {
            h.a(this.context, Context.class);
            h.a(this.ioContext, g.class);
            h.a(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            h.a(this.stripeRepository, StripeRepository.class);
            h.a(this.googlePayConfig, GooglePayPaymentMethodLauncher.Config.class);
            h.a(this.enableLogging, Boolean.class);
            h.a(this.publishableKeyProvider, a.class);
            h.a(this.stripeAccountIdProvider, a.class);
            return new DaggerGooglePayPaymentMethodLauncherComponent(new LoggingModule(), this.context, this.ioContext, this.analyticsRequestFactory, this.stripeRepository, this.googlePayConfig, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherComponent.Builder publishableKeyProvider(a aVar) {
            return publishableKeyProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherComponent.Builder stripeAccountIdProvider(a aVar) {
            return stripeAccountIdProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder enableLogging(boolean z11) {
            this.enableLogging = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config) {
            this.googlePayConfig = (GooglePayPaymentMethodLauncher.Config) h.b(config);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder ioContext(g gVar) {
            this.ioContext = (g) h.b(gVar);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder publishableKeyProvider(a<String> aVar) {
            this.publishableKeyProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder stripeAccountIdProvider(a<String> aVar) {
            this.stripeAccountIdProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent.Builder
        public Builder stripeRepository(StripeRepository stripeRepository) {
            this.stripeRepository = (StripeRepository) h.b(stripeRepository);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder implements GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder {
        private GooglePayPaymentMethodLauncherContract.Args args;
        private final DaggerGooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent;
        private l0 savedStateHandle;

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponent build() {
            h.a(this.args, GooglePayPaymentMethodLauncherContract.Args.class);
            h.a(this.savedStateHandle, l0.class);
            return new GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(this.args, this.savedStateHandle);
        }

        private GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(DaggerGooglePayPaymentMethodLauncherComponent daggerGooglePayPaymentMethodLauncherComponent) {
            this.googlePayPaymentMethodLauncherComponent = daggerGooglePayPaymentMethodLauncherComponent;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder args(GooglePayPaymentMethodLauncherContract.Args args) {
            this.args = (GooglePayPaymentMethodLauncherContract.Args) h.b(args);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder savedStateHandle(l0 l0Var) {
            this.savedStateHandle = (l0) h.b(l0Var);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class GooglePayPaymentMethodLauncherViewModelSubcomponentImpl implements GooglePayPaymentMethodLauncherViewModelSubcomponent {
        private final GooglePayPaymentMethodLauncherContract.Args args;
        private final DaggerGooglePayPaymentMethodLauncherComponent googlePayPaymentMethodLauncherComponent;
        private final GooglePayPaymentMethodLauncherViewModelSubcomponentImpl googlePayPaymentMethodLauncherViewModelSubcomponentImpl;
        private final l0 savedStateHandle;

        private ApiRequest.Options options() {
            return new ApiRequest.Options(this.googlePayPaymentMethodLauncherComponent.publishableKeyProvider, this.googlePayPaymentMethodLauncherComponent.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent
        public GooglePayPaymentMethodLauncherViewModel getViewModel() {
            return new GooglePayPaymentMethodLauncherViewModel((PaymentsClient) this.googlePayPaymentMethodLauncherComponent.providePaymentsClientProvider.mo0get(), options(), this.args, this.googlePayPaymentMethodLauncherComponent.stripeRepository, (GooglePayJsonFactory) this.googlePayPaymentMethodLauncherComponent.googlePayJsonFactoryProvider.mo0get(), (GooglePayRepository) this.googlePayPaymentMethodLauncherComponent.defaultGooglePayRepositoryProvider.mo0get(), this.savedStateHandle);
        }

        private GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(DaggerGooglePayPaymentMethodLauncherComponent daggerGooglePayPaymentMethodLauncherComponent, GooglePayPaymentMethodLauncherContract.Args args, l0 l0Var) {
            this.googlePayPaymentMethodLauncherViewModelSubcomponentImpl = this;
            this.googlePayPaymentMethodLauncherComponent = daggerGooglePayPaymentMethodLauncherComponent;
            this.args = args;
            this.savedStateHandle = l0Var;
        }
    }

    public static GooglePayPaymentMethodLauncherComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(LoggingModule loggingModule, Context context, g gVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeRepository stripeRepository, GooglePayPaymentMethodLauncher.Config config, Boolean bool, a<String> aVar, a<String> aVar2) {
        this.contextProvider = f.a(context);
        this.googlePayConfigProvider = f.a(config);
        PaymentsClientFactory_Factory create = PaymentsClientFactory_Factory.create(this.contextProvider);
        this.paymentsClientFactoryProvider = create;
        this.providePaymentsClientProvider = d.b(GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory.create(this.contextProvider, this.googlePayConfigProvider, create));
        this.publishableKeyProvider2 = f.a(aVar);
        e a11 = f.a(aVar2);
        this.stripeAccountIdProvider2 = a11;
        this.googlePayJsonFactoryProvider = d.b(GooglePayJsonFactory_Factory.create(this.publishableKeyProvider2, a11, this.googlePayConfigProvider));
        e a12 = f.a(bool);
        this.enableLoggingProvider = a12;
        Provider<Logger> b11 = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, a12));
        this.provideLoggerProvider = b11;
        this.defaultGooglePayRepositoryProvider = d.b(DefaultGooglePayRepository_Factory.create(this.contextProvider, this.googlePayConfigProvider, b11));
    }

    private GooglePayPaymentMethodLauncherViewModel.Factory injectFactory(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
        GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilder(factory, new GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder());
        return factory;
    }

    @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherComponent
    public void inject(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerGooglePayPaymentMethodLauncherComponent(LoggingModule loggingModule, Context context, g gVar, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeRepository stripeRepository, GooglePayPaymentMethodLauncher.Config config, Boolean bool, a<String> aVar, a<String> aVar2) {
        this.googlePayPaymentMethodLauncherComponent = this;
        this.publishableKeyProvider = aVar;
        this.stripeAccountIdProvider = aVar2;
        this.stripeRepository = stripeRepository;
        initialize(loggingModule, context, gVar, paymentAnalyticsRequestFactory, stripeRepository, config, bool, aVar, aVar2);
    }
}