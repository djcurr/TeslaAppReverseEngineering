package com.stripe.android.payments.core.injection;

import android.content.Context;
import androidx.lifecycle.l0;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.ApiRequest_Options_Factory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel_Factory_MembersInjector;
import h00.a;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerPaymentLauncherViewModelFactoryComponent implements PaymentLauncherViewModelFactoryComponent {
    private final Context context;
    private Provider<Context> contextProvider;
    private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private Provider<Boolean> enableLoggingProvider;
    private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;
    private final PaymentLauncherModule paymentLauncherModule;
    private final DaggerPaymentLauncherViewModelFactoryComponent paymentLauncherViewModelFactoryComponent;
    private Provider<PaymentLauncherViewModelSubcomponent.Builder> paymentLauncherViewModelSubcomponentBuilderProvider;
    private final Set<String> productUsage;
    private Provider<Set<String>> productUsageProvider;
    private Provider<DefaultReturnUrl> provideDefaultReturnUrlProvider;
    private Provider<Boolean> provideIsInstantAppProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<PaymentAuthenticatorRegistry> providePaymentAuthenticatorRegistryProvider;
    private Provider<Map<String, String>> provideThreeDs1IntentReturnUrlMapProvider;
    private Provider<g> provideUIContextProvider;
    private Provider<g> provideWorkContextProvider;
    private final a<String> publishableKeyProvider;
    private Provider<a<String>> publishableKeyProvider2;
    private Provider<RetryDelaySupplier> retryDelaySupplierProvider;
    private Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;
    private Provider<a<String>> stripeAccountIdProvider;
    private Provider<StripeApiRepository> stripeApiRepositoryProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements PaymentLauncherViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Set<String> productUsage;
        private a<String> publishableKeyProvider;
        private a<String> stripeAccountIdProvider;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public PaymentLauncherViewModelFactoryComponent build() {
            h.a(this.context, Context.class);
            h.a(this.enableLogging, Boolean.class);
            h.a(this.publishableKeyProvider, a.class);
            h.a(this.stripeAccountIdProvider, a.class);
            h.a(this.productUsage, Set.class);
            return new DaggerPaymentLauncherViewModelFactoryComponent(new PaymentLauncherModule(), new CoroutineContextModule(), new LoggingModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder publishableKeyProvider(a aVar) {
            return publishableKeyProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherViewModelFactoryComponent.Builder stripeAccountIdProvider(a aVar) {
            return stripeAccountIdProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z11) {
            this.enableLogging = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) h.b(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(a<String> aVar) {
            this.publishableKeyProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(a<String> aVar) {
            this.stripeAccountIdProvider = (a) h.b(aVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class PaymentLauncherViewModelSubcomponentBuilder implements PaymentLauncherViewModelSubcomponent.Builder {
        private Boolean isPaymentIntent;
        private final DaggerPaymentLauncherViewModelFactoryComponent paymentLauncherViewModelFactoryComponent;
        private l0 savedStateHandle;

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponent build() {
            h.a(this.isPaymentIntent, Boolean.class);
            h.a(this.savedStateHandle, l0.class);
            return new PaymentLauncherViewModelSubcomponentImpl(this.isPaymentIntent, this.savedStateHandle);
        }

        private PaymentLauncherViewModelSubcomponentBuilder(DaggerPaymentLauncherViewModelFactoryComponent daggerPaymentLauncherViewModelFactoryComponent) {
            this.paymentLauncherViewModelFactoryComponent = daggerPaymentLauncherViewModelFactoryComponent;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponentBuilder isPaymentIntent(boolean z11) {
            this.isPaymentIntent = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponentBuilder savedStateHandle(l0 l0Var) {
            this.savedStateHandle = (l0) h.b(l0Var);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class PaymentLauncherViewModelSubcomponentImpl implements PaymentLauncherViewModelSubcomponent {
        private final Boolean isPaymentIntent;
        private Provider<ApiRequest.Options> optionsProvider;
        private final DaggerPaymentLauncherViewModelFactoryComponent paymentLauncherViewModelFactoryComponent;
        private final PaymentLauncherViewModelSubcomponentImpl paymentLauncherViewModelSubcomponentImpl;
        private final l0 savedStateHandle;

        private void initialize(Boolean bool, l0 l0Var) {
            this.optionsProvider = ApiRequest_Options_Factory.create(this.paymentLauncherViewModelFactoryComponent.publishableKeyProvider2, this.paymentLauncherViewModelFactoryComponent.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent
        public PaymentLauncherViewModel getViewModel() {
            return new PaymentLauncherViewModel(this.isPaymentIntent.booleanValue(), this.paymentLauncherViewModelFactoryComponent.stripeApiRepository(), (PaymentAuthenticatorRegistry) this.paymentLauncherViewModelFactoryComponent.providePaymentAuthenticatorRegistryProvider.mo0get(), (DefaultReturnUrl) this.paymentLauncherViewModelFactoryComponent.provideDefaultReturnUrlProvider.mo0get(), this.optionsProvider, (Map) this.paymentLauncherViewModelFactoryComponent.provideThreeDs1IntentReturnUrlMapProvider.mo0get(), d.a(this.paymentLauncherViewModelFactoryComponent.paymentIntentFlowResultProcessorProvider), d.a(this.paymentLauncherViewModelFactoryComponent.setupIntentFlowResultProcessorProvider), this.paymentLauncherViewModelFactoryComponent.defaultAnalyticsRequestExecutor(), this.paymentLauncherViewModelFactoryComponent.paymentAnalyticsRequestFactory(), (g) this.paymentLauncherViewModelFactoryComponent.provideUIContextProvider.mo0get(), this.savedStateHandle, this.paymentLauncherViewModelFactoryComponent.namedBoolean());
        }

        private PaymentLauncherViewModelSubcomponentImpl(DaggerPaymentLauncherViewModelFactoryComponent daggerPaymentLauncherViewModelFactoryComponent, Boolean bool, l0 l0Var) {
            this.paymentLauncherViewModelSubcomponentImpl = this;
            this.paymentLauncherViewModelFactoryComponent = daggerPaymentLauncherViewModelFactoryComponent;
            this.isPaymentIntent = bool;
            this.savedStateHandle = l0Var;
            initialize(bool, l0Var);
        }
    }

    public static PaymentLauncherViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
        return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.mo0get(), this.provideWorkContextProvider.mo0get());
    }

    private void initialize(PaymentLauncherModule paymentLauncherModule, CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Boolean bool, a<String> aVar, a<String> aVar2, Set<String> set) {
        this.paymentLauncherViewModelSubcomponentBuilderProvider = new Provider<PaymentLauncherViewModelSubcomponent.Builder>() { // from class: com.stripe.android.payments.core.injection.DaggerPaymentLauncherViewModelFactoryComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public PaymentLauncherViewModelSubcomponent.Builder mo0get() {
                return new PaymentLauncherViewModelSubcomponentBuilder();
            }
        };
        this.provideWorkContextProvider = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        e a11 = f.a(bool);
        this.enableLoggingProvider = a11;
        this.provideLoggerProvider = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, a11));
        this.contextProvider = f.a(context);
        this.publishableKeyProvider2 = f.a(aVar);
        e a12 = f.a(set);
        this.productUsageProvider = a12;
        this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider2, a12);
        DefaultAnalyticsRequestExecutor_Factory create = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
        this.defaultAnalyticsRequestExecutorProvider = create;
        this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, create, this.provideLoggerProvider);
        this.provideUIContextProvider = d.b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
        this.provideThreeDs1IntentReturnUrlMapProvider = d.b(PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory.create(paymentLauncherModule));
        PaymentLauncherModule_ProvideIsInstantAppFactory create2 = PaymentLauncherModule_ProvideIsInstantAppFactory.create(paymentLauncherModule, this.contextProvider);
        this.provideIsInstantAppProvider = create2;
        this.providePaymentAuthenticatorRegistryProvider = d.b(PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory.create(paymentLauncherModule, this.contextProvider, this.stripeApiRepositoryProvider, this.enableLoggingProvider, this.provideWorkContextProvider, this.provideUIContextProvider, this.provideThreeDs1IntentReturnUrlMapProvider, this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.publishableKeyProvider2, this.productUsageProvider, create2));
        this.provideDefaultReturnUrlProvider = d.b(PaymentLauncherModule_ProvideDefaultReturnUrlFactory.create(paymentLauncherModule, this.contextProvider));
        this.stripeAccountIdProvider = f.a(aVar2);
        Provider<RetryDelaySupplier> b11 = d.b(RetryDelaySupplier_Factory.create());
        this.retryDelaySupplierProvider = b11;
        this.paymentIntentFlowResultProcessorProvider = d.b(PaymentIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.stripeApiRepositoryProvider, this.provideLoggerProvider, this.provideWorkContextProvider, b11));
        this.setupIntentFlowResultProcessorProvider = d.b(SetupIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.stripeApiRepositoryProvider, this.provideLoggerProvider, this.provideWorkContextProvider));
    }

    private PaymentLauncherViewModel.Factory injectFactory(PaymentLauncherViewModel.Factory factory) {
        PaymentLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentLauncherViewModelSubcomponentBuilderProvider);
        return factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean namedBoolean() {
        return this.paymentLauncherModule.provideIsInstantApp(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
        return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StripeApiRepository stripeApiRepository() {
        return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.mo0get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.mo0get());
    }

    @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelFactoryComponent
    public void inject(PaymentLauncherViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerPaymentLauncherViewModelFactoryComponent(PaymentLauncherModule paymentLauncherModule, CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Boolean bool, a<String> aVar, a<String> aVar2, Set<String> set) {
        this.paymentLauncherViewModelFactoryComponent = this;
        this.context = context;
        this.publishableKeyProvider = aVar;
        this.productUsage = set;
        this.paymentLauncherModule = paymentLauncherModule;
        initialize(paymentLauncherModule, coroutineContextModule, loggingModule, context, bool, aVar, aVar2, set);
    }
}