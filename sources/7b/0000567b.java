package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.l0;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.link.LinkPaymentLauncher_Factory;
import com.stripe.android.link.injection.LinkPaymentLauncherFactory;
import com.stripe.android.link.injection.LinkPaymentLauncherFactory_Impl;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository_Factory;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.ui.core.forms.resources.AsyncResourceRepository;
import com.stripe.android.ui.core.forms.resources.AsyncResourceRepository_Factory;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule_Companion_ProvideResourcesFactory;
import h00.a;
import h00.l;
import java.util.Locale;
import java.util.Set;
import javax.inject.Provider;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerPaymentOptionsViewModelFactoryComponent implements PaymentOptionsViewModelFactoryComponent {
    private Provider<AsyncResourceRepository> asyncResourceRepositoryProvider;
    private Provider<Context> contextProvider;
    private Provider<CustomerApiRepository> customerApiRepositoryProvider;
    private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private Provider<DefaultDeviceIdRepository> defaultDeviceIdRepositoryProvider;
    private Provider<DefaultEventReporter> defaultEventReporterProvider;
    private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final DaggerPaymentOptionsViewModelFactoryComponent paymentOptionsViewModelFactoryComponent;
    private final PaymentOptionsViewModelModule paymentOptionsViewModelModule;
    private Provider<PaymentOptionsViewModelSubcomponent.Builder> paymentOptionsViewModelSubcomponentBuilderProvider;
    private Provider<Set<String>> productUsageProvider;
    private Provider<Boolean> provideEnabledLoggingProvider;
    private Provider<EventReporter.Mode> provideEventReporterModeProvider;
    private Provider<Locale> provideLocaleProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
    private Provider<l<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;
    private Provider<a<String>> providePublishableKeyProvider;
    private Provider<Resources> provideResourcesProvider;
    private Provider<a<String>> provideStripeAccountIdProvider;
    private Provider<g> provideUIContextProvider;
    private Provider<g> provideWorkContextProvider;
    private Provider<StripeApiRepository> stripeApiRepositoryProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements PaymentOptionsViewModelFactoryComponent.Builder {
        private Context context;
        private Set<String> productUsage;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public PaymentOptionsViewModelFactoryComponent build() {
            h.a(this.context, Context.class);
            h.a(this.productUsage, Set.class);
            return new DaggerPaymentOptionsViewModelFactoryComponent(new PaymentOptionsViewModelModule(), new CoroutineContextModule(), new LoggingModule(), this.context, this.productUsage);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ PaymentOptionsViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) h.b(set);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class PaymentOptionsViewModelSubcomponentBuilder implements PaymentOptionsViewModelSubcomponent.Builder {
        private Application application;
        private PaymentOptionContract.Args args;
        private final DaggerPaymentOptionsViewModelFactoryComponent paymentOptionsViewModelFactoryComponent;
        private l0 savedStateHandle;

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponent build() {
            h.a(this.application, Application.class);
            h.a(this.savedStateHandle, l0.class);
            h.a(this.args, PaymentOptionContract.Args.class);
            return new PaymentOptionsViewModelSubcomponentImpl(this.application, this.savedStateHandle, this.args);
        }

        private PaymentOptionsViewModelSubcomponentBuilder(DaggerPaymentOptionsViewModelFactoryComponent daggerPaymentOptionsViewModelFactoryComponent) {
            this.paymentOptionsViewModelFactoryComponent = daggerPaymentOptionsViewModelFactoryComponent;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponentBuilder application(Application application) {
            this.application = (Application) h.b(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponentBuilder args(PaymentOptionContract.Args args) {
            this.args = (PaymentOptionContract.Args) h.b(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponentBuilder savedStateHandle(l0 l0Var) {
            this.savedStateHandle = (l0) h.b(l0Var);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class PaymentOptionsViewModelSubcomponentImpl implements PaymentOptionsViewModelSubcomponent {
        private final Application application;
        private final PaymentOptionContract.Args args;
        private Provider<LinkPaymentLauncherFactory> linkPaymentLauncherFactoryProvider;
        private LinkPaymentLauncher_Factory linkPaymentLauncherProvider;
        private final DaggerPaymentOptionsViewModelFactoryComponent paymentOptionsViewModelFactoryComponent;
        private final PaymentOptionsViewModelSubcomponentImpl paymentOptionsViewModelSubcomponentImpl;
        private final l0 savedStateHandle;

        private void initialize(Application application, l0 l0Var, PaymentOptionContract.Args args) {
            LinkPaymentLauncher_Factory create = LinkPaymentLauncher_Factory.create(this.paymentOptionsViewModelFactoryComponent.contextProvider, this.paymentOptionsViewModelFactoryComponent.productUsageProvider, this.paymentOptionsViewModelFactoryComponent.providePublishableKeyProvider, this.paymentOptionsViewModelFactoryComponent.provideStripeAccountIdProvider, this.paymentOptionsViewModelFactoryComponent.provideEnabledLoggingProvider, this.paymentOptionsViewModelFactoryComponent.provideWorkContextProvider, this.paymentOptionsViewModelFactoryComponent.provideUIContextProvider, this.paymentOptionsViewModelFactoryComponent.paymentAnalyticsRequestFactoryProvider, this.paymentOptionsViewModelFactoryComponent.defaultAnalyticsRequestExecutorProvider, this.paymentOptionsViewModelFactoryComponent.stripeApiRepositoryProvider, this.paymentOptionsViewModelFactoryComponent.asyncResourceRepositoryProvider);
            this.linkPaymentLauncherProvider = create;
            this.linkPaymentLauncherFactoryProvider = LinkPaymentLauncherFactory_Impl.create(create);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent
        public PaymentOptionsViewModel getViewModel() {
            return new PaymentOptionsViewModel(this.args, (l) this.paymentOptionsViewModelFactoryComponent.providePrefsRepositoryFactoryProvider.mo0get(), (EventReporter) this.paymentOptionsViewModelFactoryComponent.defaultEventReporterProvider.mo0get(), (CustomerRepository) this.paymentOptionsViewModelFactoryComponent.customerApiRepositoryProvider.mo0get(), (g) this.paymentOptionsViewModelFactoryComponent.provideWorkContextProvider.mo0get(), this.application, (Logger) this.paymentOptionsViewModelFactoryComponent.provideLoggerProvider.mo0get(), PaymentOptionsViewModelModule_ProvideDummyInjectorKeyFactory.provideDummyInjectorKey(this.paymentOptionsViewModelFactoryComponent.paymentOptionsViewModelModule), (ResourceRepository) this.paymentOptionsViewModelFactoryComponent.asyncResourceRepositoryProvider.mo0get(), this.savedStateHandle, this.linkPaymentLauncherFactoryProvider.mo0get());
        }

        private PaymentOptionsViewModelSubcomponentImpl(DaggerPaymentOptionsViewModelFactoryComponent daggerPaymentOptionsViewModelFactoryComponent, Application application, l0 l0Var, PaymentOptionContract.Args args) {
            this.paymentOptionsViewModelSubcomponentImpl = this;
            this.paymentOptionsViewModelFactoryComponent = daggerPaymentOptionsViewModelFactoryComponent;
            this.args = args;
            this.application = application;
            this.savedStateHandle = l0Var;
            initialize(application, l0Var, args);
        }
    }

    public static PaymentOptionsViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(PaymentOptionsViewModelModule paymentOptionsViewModelModule, CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Set<String> set) {
        this.paymentOptionsViewModelSubcomponentBuilderProvider = new Provider<PaymentOptionsViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentOptionsViewModelFactoryComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public PaymentOptionsViewModelSubcomponent.Builder mo0get() {
                return new PaymentOptionsViewModelSubcomponentBuilder();
            }
        };
        this.contextProvider = f.a(context);
        Provider<g> b11 = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        this.provideWorkContextProvider = b11;
        this.providePrefsRepositoryFactoryProvider = d.b(PaymentOptionsViewModelModule_ProvidePrefsRepositoryFactoryFactory.create(paymentOptionsViewModelModule, this.contextProvider, b11));
        this.provideEventReporterModeProvider = d.b(PaymentOptionsViewModelModule_ProvideEventReporterModeFactory.create(paymentOptionsViewModelModule));
        this.defaultDeviceIdRepositoryProvider = d.b(DefaultDeviceIdRepository_Factory.create(this.contextProvider, this.provideWorkContextProvider));
        Provider<Boolean> b12 = d.b(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
        this.provideEnabledLoggingProvider = b12;
        Provider<Logger> b13 = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, b12));
        this.provideLoggerProvider = b13;
        this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(b13, this.provideWorkContextProvider);
        PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory create = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create(this.contextProvider);
        this.providePaymentConfigurationProvider = create;
        this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(create);
        e a11 = f.a(set);
        this.productUsageProvider = a11;
        PaymentAnalyticsRequestFactory_Factory create2 = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.providePublishableKeyProvider, a11);
        this.paymentAnalyticsRequestFactoryProvider = create2;
        this.defaultEventReporterProvider = d.b(DefaultEventReporter_Factory.create(this.provideEventReporterModeProvider, this.defaultDeviceIdRepositoryProvider, this.defaultAnalyticsRequestExecutorProvider, create2, this.provideWorkContextProvider));
        StripeApiRepository_Factory create3 = StripeApiRepository_Factory.create(this.contextProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
        this.stripeApiRepositoryProvider = create3;
        this.customerApiRepositoryProvider = d.b(CustomerApiRepository_Factory.create(create3, this.providePaymentConfigurationProvider, this.provideLoggerProvider, this.provideWorkContextProvider, this.productUsageProvider));
        this.provideResourcesProvider = d.b(ResourceRepositoryModule_Companion_ProvideResourcesFactory.create(this.contextProvider));
        Provider<Locale> b14 = d.b(PaymentSheetCommonModule_Companion_ProvideLocaleFactory.create());
        this.provideLocaleProvider = b14;
        this.asyncResourceRepositoryProvider = d.b(AsyncResourceRepository_Factory.create(this.provideResourcesProvider, this.provideWorkContextProvider, b14));
        this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
        this.provideUIContextProvider = d.b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
    }

    private PaymentOptionsViewModel.Factory injectFactory(PaymentOptionsViewModel.Factory factory) {
        PaymentOptionsViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentOptionsViewModelSubcomponentBuilderProvider);
        return factory;
    }

    @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelFactoryComponent
    public void inject(PaymentOptionsViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerPaymentOptionsViewModelFactoryComponent(PaymentOptionsViewModelModule paymentOptionsViewModelModule, CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Set<String> set) {
        this.paymentOptionsViewModelFactoryComponent = this;
        this.paymentOptionsViewModelModule = paymentOptionsViewModelModule;
        initialize(paymentOptionsViewModelModule, coroutineContextModule, loggingModule, context, set);
    }
}