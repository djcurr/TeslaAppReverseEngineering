package com.stripe.android.googlepaylauncher.injection;

import android.content.Context;
import androidx.lifecycle.l0;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository_Factory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory;
import com.stripe.android.googlepaylauncher.PaymentsClientFactory_Factory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import h00.a;
import java.util.Set;
import javax.inject.Provider;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent implements GooglePayPaymentMethodLauncherViewModelFactoryComponent {
    private final Context context;
    private Provider<Context> contextProvider;
    private Provider<DefaultGooglePayRepository> defaultGooglePayRepositoryProvider;
    private Provider<Boolean> enableLoggingProvider;
    private Provider<GooglePayPaymentMethodLauncher.Config> googlePayConfigProvider;
    private Provider<GooglePayJsonFactory> googlePayJsonFactoryProvider;
    private final DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent googlePayPaymentMethodLauncherViewModelFactoryComponent;
    private Provider<PaymentsClientFactory> paymentsClientFactoryProvider;
    private final Set<String> productUsage;
    private Provider<Logger> provideLoggerProvider;
    private Provider<PaymentsClient> providePaymentsClientProvider;
    private Provider<g> provideWorkContextProvider;
    private final a<String> publishableKeyProvider;
    private Provider<a<String>> publishableKeyProvider2;
    private final a<String> stripeAccountIdProvider;
    private Provider<a<String>> stripeAccountIdProvider2;

    /* loaded from: classes6.dex */
    private static final class Builder implements GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private GooglePayPaymentMethodLauncher.Config googlePayConfig;
        private Set<String> productUsage;
        private a<String> publishableKeyProvider;
        private a<String> stripeAccountIdProvider;

        private Builder() {
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public GooglePayPaymentMethodLauncherViewModelFactoryComponent build() {
            h.a(this.context, Context.class);
            h.a(this.enableLogging, Boolean.class);
            h.a(this.publishableKeyProvider, a.class);
            h.a(this.stripeAccountIdProvider, a.class);
            h.a(this.productUsage, Set.class);
            h.a(this.googlePayConfig, GooglePayPaymentMethodLauncher.Config.class);
            return new DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent(new CoroutineContextModule(), new LoggingModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage, this.googlePayConfig);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder publishableKeyProvider(a aVar) {
            return publishableKeyProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder stripeAccountIdProvider(a aVar) {
            return stripeAccountIdProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z11) {
            this.enableLogging = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder googlePayConfig(GooglePayPaymentMethodLauncher.Config config) {
            this.googlePayConfig = (GooglePayPaymentMethodLauncher.Config) h.b(config);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) h.b(set);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(a<String> aVar) {
            this.publishableKeyProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(a<String> aVar) {
            this.stripeAccountIdProvider = (a) h.b(aVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder implements GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder {
        private GooglePayPaymentMethodLauncherContract.Args args;
        private final DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent googlePayPaymentMethodLauncherViewModelFactoryComponent;
        private l0 savedStateHandle;

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder
        public GooglePayPaymentMethodLauncherViewModelSubcomponent build() {
            h.a(this.args, GooglePayPaymentMethodLauncherContract.Args.class);
            h.a(this.savedStateHandle, l0.class);
            return new GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(this.args, this.savedStateHandle);
        }

        private GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder(DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent daggerGooglePayPaymentMethodLauncherViewModelFactoryComponent) {
            this.googlePayPaymentMethodLauncherViewModelFactoryComponent = daggerGooglePayPaymentMethodLauncherViewModelFactoryComponent;
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
        private final DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent googlePayPaymentMethodLauncherViewModelFactoryComponent;
        private final GooglePayPaymentMethodLauncherViewModelSubcomponentImpl googlePayPaymentMethodLauncherViewModelSubcomponentImpl;
        private final l0 savedStateHandle;

        private ApiRequest.Options options() {
            return new ApiRequest.Options(this.googlePayPaymentMethodLauncherViewModelFactoryComponent.publishableKeyProvider, this.googlePayPaymentMethodLauncherViewModelFactoryComponent.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent
        public GooglePayPaymentMethodLauncherViewModel getViewModel() {
            return new GooglePayPaymentMethodLauncherViewModel((PaymentsClient) this.googlePayPaymentMethodLauncherViewModelFactoryComponent.providePaymentsClientProvider.mo0get(), options(), this.args, this.googlePayPaymentMethodLauncherViewModelFactoryComponent.stripeApiRepository(), (GooglePayJsonFactory) this.googlePayPaymentMethodLauncherViewModelFactoryComponent.googlePayJsonFactoryProvider.mo0get(), (GooglePayRepository) this.googlePayPaymentMethodLauncherViewModelFactoryComponent.defaultGooglePayRepositoryProvider.mo0get(), this.savedStateHandle);
        }

        private GooglePayPaymentMethodLauncherViewModelSubcomponentImpl(DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent daggerGooglePayPaymentMethodLauncherViewModelFactoryComponent, GooglePayPaymentMethodLauncherContract.Args args, l0 l0Var) {
            this.googlePayPaymentMethodLauncherViewModelSubcomponentImpl = this;
            this.googlePayPaymentMethodLauncherViewModelFactoryComponent = daggerGooglePayPaymentMethodLauncherViewModelFactoryComponent;
            this.args = args;
            this.savedStateHandle = l0Var;
        }
    }

    public static GooglePayPaymentMethodLauncherViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
        return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.mo0get(), this.provideWorkContextProvider.mo0get());
    }

    private void initialize(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Boolean bool, a<String> aVar, a<String> aVar2, Set<String> set, GooglePayPaymentMethodLauncher.Config config) {
        this.contextProvider = f.a(context);
        this.googlePayConfigProvider = f.a(config);
        PaymentsClientFactory_Factory create = PaymentsClientFactory_Factory.create(this.contextProvider);
        this.paymentsClientFactoryProvider = create;
        this.providePaymentsClientProvider = d.b(GooglePayPaymentMethodLauncherModule_Companion_ProvidePaymentsClientFactory.create(this.contextProvider, this.googlePayConfigProvider, create));
        this.provideWorkContextProvider = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        e a11 = f.a(bool);
        this.enableLoggingProvider = a11;
        this.provideLoggerProvider = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, a11));
        this.publishableKeyProvider2 = f.a(aVar);
        e a12 = f.a(aVar2);
        this.stripeAccountIdProvider2 = a12;
        this.googlePayJsonFactoryProvider = d.b(GooglePayJsonFactory_Factory.create(this.publishableKeyProvider2, a12, this.googlePayConfigProvider));
        this.defaultGooglePayRepositoryProvider = d.b(DefaultGooglePayRepository_Factory.create(this.contextProvider, this.googlePayConfigProvider, this.provideLoggerProvider));
    }

    private GooglePayPaymentMethodLauncherViewModel.Factory injectFactory(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
        GooglePayPaymentMethodLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilder(factory, new GooglePayPaymentMethodLauncherViewModelSubcomponentBuilder());
        return factory;
    }

    private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
        return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StripeApiRepository stripeApiRepository() {
        return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.mo0get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.mo0get());
    }

    @Override // com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelFactoryComponent
    public void inject(GooglePayPaymentMethodLauncherViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Boolean bool, a<String> aVar, a<String> aVar2, Set<String> set, GooglePayPaymentMethodLauncher.Config config) {
        this.googlePayPaymentMethodLauncherViewModelFactoryComponent = this;
        this.publishableKeyProvider = aVar;
        this.stripeAccountIdProvider = aVar2;
        this.context = context;
        this.productUsage = set;
        initialize(coroutineContextModule, loggingModule, context, bool, aVar, aVar2, set, config);
    }
}