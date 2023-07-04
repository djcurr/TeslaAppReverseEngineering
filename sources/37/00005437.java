package com.stripe.android.payments.core.injection;

import android.content.Context;
import androidx.lifecycle.l0;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.ApiRequest_Options_Factory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.injection.PaymentLauncherComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel_Factory_MembersInjector;
import h00.a;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import tw.d;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerPaymentLauncherComponent implements PaymentLauncherComponent {
    private final PaymentAnalyticsRequestFactory analyticsRequestFactory;
    private Provider<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;
    private final Context context;
    private Provider<Context> contextProvider;
    private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private Provider<Boolean> enableLoggingProvider;
    private final g ioContext;
    private Provider<g> ioContextProvider;
    private Provider<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;
    private final DaggerPaymentLauncherComponent paymentLauncherComponent;
    private final PaymentLauncherModule paymentLauncherModule;
    private Provider<PaymentLauncherViewModelSubcomponent.Builder> paymentLauncherViewModelSubcomponentBuilderProvider;
    private Provider<Set<String>> productUsageProvider;
    private Provider<DefaultReturnUrl> provideDefaultReturnUrlProvider;
    private Provider<Boolean> provideIsInstantAppProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<PaymentAuthenticatorRegistry> providePaymentAuthenticatorRegistryProvider;
    private Provider<Map<String, String>> provideThreeDs1IntentReturnUrlMapProvider;
    private Provider<a<String>> publishableKeyProvider;
    private Provider<RetryDelaySupplier> retryDelaySupplierProvider;
    private Provider<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;
    private Provider<a<String>> stripeAccountIdProvider;
    private final StripeRepository stripeRepository;
    private Provider<StripeRepository> stripeRepositoryProvider;
    private final g uiContext;
    private Provider<g> uiContextProvider;

    /* loaded from: classes6.dex */
    private static final class Builder implements PaymentLauncherComponent.Builder {
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Context context;
        private Boolean enableLogging;
        private g ioContext;
        private Set<String> productUsage;
        private a<String> publishableKeyProvider;
        private a<String> stripeAccountIdProvider;
        private StripeRepository stripeRepository;
        private g uiContext;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public PaymentLauncherComponent build() {
            h.a(this.context, Context.class);
            h.a(this.enableLogging, Boolean.class);
            h.a(this.ioContext, g.class);
            h.a(this.uiContext, g.class);
            h.a(this.stripeRepository, StripeRepository.class);
            h.a(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            h.a(this.publishableKeyProvider, a.class);
            h.a(this.stripeAccountIdProvider, a.class);
            h.a(this.productUsage, Set.class);
            return new DaggerPaymentLauncherComponent(new PaymentLauncherModule(), new LoggingModule(), this.context, this.enableLogging, this.ioContext, this.uiContext, this.stripeRepository, this.analyticsRequestFactory, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherComponent.Builder publishableKeyProvider(a aVar) {
            return publishableKeyProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ PaymentLauncherComponent.Builder stripeAccountIdProvider(a aVar) {
            return stripeAccountIdProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder enableLogging(boolean z11) {
            this.enableLogging = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder ioContext(g gVar) {
            this.ioContext = (g) h.b(gVar);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) h.b(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder publishableKeyProvider(a<String> aVar) {
            this.publishableKeyProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder stripeAccountIdProvider(a<String> aVar) {
            this.stripeAccountIdProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder stripeRepository(StripeRepository stripeRepository) {
            this.stripeRepository = (StripeRepository) h.b(stripeRepository);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent.Builder
        public Builder uiContext(g gVar) {
            this.uiContext = (g) h.b(gVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class PaymentLauncherViewModelSubcomponentBuilder implements PaymentLauncherViewModelSubcomponent.Builder {
        private Boolean isPaymentIntent;
        private final DaggerPaymentLauncherComponent paymentLauncherComponent;
        private l0 savedStateHandle;

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent.Builder
        public PaymentLauncherViewModelSubcomponent build() {
            h.a(this.isPaymentIntent, Boolean.class);
            h.a(this.savedStateHandle, l0.class);
            return new PaymentLauncherViewModelSubcomponentImpl(this.isPaymentIntent, this.savedStateHandle);
        }

        private PaymentLauncherViewModelSubcomponentBuilder(DaggerPaymentLauncherComponent daggerPaymentLauncherComponent) {
            this.paymentLauncherComponent = daggerPaymentLauncherComponent;
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
        private final DaggerPaymentLauncherComponent paymentLauncherComponent;
        private final PaymentLauncherViewModelSubcomponentImpl paymentLauncherViewModelSubcomponentImpl;
        private final l0 savedStateHandle;

        private void initialize(Boolean bool, l0 l0Var) {
            this.optionsProvider = ApiRequest_Options_Factory.create(this.paymentLauncherComponent.publishableKeyProvider, this.paymentLauncherComponent.stripeAccountIdProvider);
        }

        @Override // com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent
        public PaymentLauncherViewModel getViewModel() {
            return new PaymentLauncherViewModel(this.isPaymentIntent.booleanValue(), this.paymentLauncherComponent.stripeRepository, (PaymentAuthenticatorRegistry) this.paymentLauncherComponent.providePaymentAuthenticatorRegistryProvider.mo0get(), (DefaultReturnUrl) this.paymentLauncherComponent.provideDefaultReturnUrlProvider.mo0get(), this.optionsProvider, (Map) this.paymentLauncherComponent.provideThreeDs1IntentReturnUrlMapProvider.mo0get(), d.a(this.paymentLauncherComponent.paymentIntentFlowResultProcessorProvider), d.a(this.paymentLauncherComponent.setupIntentFlowResultProcessorProvider), this.paymentLauncherComponent.defaultAnalyticsRequestExecutor(), this.paymentLauncherComponent.analyticsRequestFactory, this.paymentLauncherComponent.uiContext, this.savedStateHandle, this.paymentLauncherComponent.namedBoolean());
        }

        private PaymentLauncherViewModelSubcomponentImpl(DaggerPaymentLauncherComponent daggerPaymentLauncherComponent, Boolean bool, l0 l0Var) {
            this.paymentLauncherViewModelSubcomponentImpl = this;
            this.paymentLauncherComponent = daggerPaymentLauncherComponent;
            this.isPaymentIntent = bool;
            this.savedStateHandle = l0Var;
            initialize(bool, l0Var);
        }
    }

    public static PaymentLauncherComponent.Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
        return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.mo0get(), this.ioContext);
    }

    private void initialize(PaymentLauncherModule paymentLauncherModule, LoggingModule loggingModule, Context context, Boolean bool, g gVar, g gVar2, StripeRepository stripeRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, a<String> aVar, a<String> aVar2, Set<String> set) {
        this.paymentLauncherViewModelSubcomponentBuilderProvider = new Provider<PaymentLauncherViewModelSubcomponent.Builder>() { // from class: com.stripe.android.payments.core.injection.DaggerPaymentLauncherComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public PaymentLauncherViewModelSubcomponent.Builder mo0get() {
                return new PaymentLauncherViewModelSubcomponentBuilder();
            }
        };
        this.contextProvider = f.a(context);
        this.stripeRepositoryProvider = f.a(stripeRepository);
        this.enableLoggingProvider = f.a(bool);
        this.ioContextProvider = f.a(gVar);
        this.uiContextProvider = f.a(gVar2);
        this.provideThreeDs1IntentReturnUrlMapProvider = d.b(PaymentLauncherModule_ProvideThreeDs1IntentReturnUrlMapFactory.create(paymentLauncherModule));
        Provider<Logger> b11 = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, this.enableLoggingProvider));
        this.provideLoggerProvider = b11;
        this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(b11, this.ioContextProvider);
        this.analyticsRequestFactoryProvider = f.a(paymentAnalyticsRequestFactory);
        this.publishableKeyProvider = f.a(aVar);
        this.productUsageProvider = f.a(set);
        PaymentLauncherModule_ProvideIsInstantAppFactory create = PaymentLauncherModule_ProvideIsInstantAppFactory.create(paymentLauncherModule, this.contextProvider);
        this.provideIsInstantAppProvider = create;
        this.providePaymentAuthenticatorRegistryProvider = d.b(PaymentLauncherModule_ProvidePaymentAuthenticatorRegistryFactory.create(paymentLauncherModule, this.contextProvider, this.stripeRepositoryProvider, this.enableLoggingProvider, this.ioContextProvider, this.uiContextProvider, this.provideThreeDs1IntentReturnUrlMapProvider, this.defaultAnalyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.publishableKeyProvider, this.productUsageProvider, create));
        this.provideDefaultReturnUrlProvider = d.b(PaymentLauncherModule_ProvideDefaultReturnUrlFactory.create(paymentLauncherModule, this.contextProvider));
        this.stripeAccountIdProvider = f.a(aVar2);
        Provider<RetryDelaySupplier> b12 = d.b(RetryDelaySupplier_Factory.create());
        this.retryDelaySupplierProvider = b12;
        this.paymentIntentFlowResultProcessorProvider = d.b(PaymentIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider, this.stripeRepositoryProvider, this.provideLoggerProvider, this.ioContextProvider, b12));
        this.setupIntentFlowResultProcessorProvider = d.b(SetupIntentFlowResultProcessor_Factory.create(this.contextProvider, this.publishableKeyProvider, this.stripeRepositoryProvider, this.provideLoggerProvider, this.ioContextProvider));
    }

    private PaymentLauncherViewModel.Factory injectFactory(PaymentLauncherViewModel.Factory factory) {
        PaymentLauncherViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentLauncherViewModelSubcomponentBuilderProvider);
        return factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean namedBoolean() {
        return this.paymentLauncherModule.provideIsInstantApp(this.context);
    }

    @Override // com.stripe.android.payments.core.injection.PaymentLauncherComponent
    public void inject(PaymentLauncherViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerPaymentLauncherComponent(PaymentLauncherModule paymentLauncherModule, LoggingModule loggingModule, Context context, Boolean bool, g gVar, g gVar2, StripeRepository stripeRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, a<String> aVar, a<String> aVar2, Set<String> set) {
        this.paymentLauncherComponent = this;
        this.stripeRepository = stripeRepository;
        this.ioContext = gVar;
        this.analyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.uiContext = gVar2;
        this.context = context;
        this.paymentLauncherModule = paymentLauncherModule;
        initialize(paymentLauncherModule, loggingModule, context, bool, gVar, gVar2, stripeRepository, paymentAnalyticsRequestFactory, aVar, aVar2, set);
    }
}