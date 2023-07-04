package com.stripe.android.paymentsheet.injection;

import android.app.Application;
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
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher_Factory;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule;
import com.stripe.android.googlepaylauncher.injection.GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory_Impl;
import com.stripe.android.link.LinkPaymentLauncher_Factory;
import com.stripe.android.link.injection.LinkPaymentLauncherFactory;
import com.stripe.android.link.injection.LinkPaymentLauncherFactory_Impl;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.PaymentSheetViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository_Factory;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.forms.TransformSpecToElement;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
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
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerPaymentSheetLauncherComponent implements PaymentSheetLauncherComponent {
    private final Application application;
    private Provider<Application> applicationProvider;
    private Provider<AsyncResourceRepository> asyncResourceRepositoryProvider;
    private Provider<CustomerApiRepository> customerApiRepositoryProvider;
    private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private Provider<DefaultDeviceIdRepository> defaultDeviceIdRepositoryProvider;
    private Provider<DefaultEventReporter> defaultEventReporterProvider;
    private Provider<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;
    private final String injectorKey;
    private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;
    private Provider<PaymentSheetViewModelSubcomponent.Builder> paymentSheetViewModelSubcomponentBuilderProvider;
    private Provider<Boolean> provideEnabledLoggingProvider;
    private Provider<EventReporter.Mode> provideEventReporterModeProvider;
    private Provider<l<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;
    private Provider<Locale> provideLocaleProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
    private Provider<Set<String>> provideProductUsageTokensProvider;
    private Provider<a<String>> providePublishableKeyProvider;
    private Provider<Resources> provideResourcesProvider;
    private Provider<a<String>> provideStripeAccountIdProvider;
    private Provider<g> provideUIContextProvider;
    private Provider<g> provideWorkContextProvider;
    private Provider<StripeApiRepository> stripeApiRepositoryProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements PaymentSheetLauncherComponent.Builder {
        private Application application;
        private String injectorKey;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public PaymentSheetLauncherComponent build() {
            h.a(this.application, Application.class);
            h.a(this.injectorKey, String.class);
            return new DaggerPaymentSheetLauncherComponent(new GooglePayLauncherModule(), new CoroutineContextModule(), new LoggingModule(), this.application, this.injectorKey);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) h.b(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent.Builder
        public Builder injectorKey(String str) {
            this.injectorKey = (String) h.b(str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
        private FormFragmentArguments formFragmentArguments;
        private String paymentMethodCode;
        private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponent build() {
            h.a(this.paymentMethodCode, String.class);
            h.a(this.formFragmentArguments, FormFragmentArguments.class);
            return new FormViewModelSubcomponentImpl(this.paymentMethodCode, this.formFragmentArguments);
        }

        private FormViewModelSubcomponentBuilder(DaggerPaymentSheetLauncherComponent daggerPaymentSheetLauncherComponent) {
            this.paymentSheetLauncherComponent = daggerPaymentSheetLauncherComponent;
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponentBuilder formFragmentArguments(FormFragmentArguments formFragmentArguments) {
            this.formFragmentArguments = (FormFragmentArguments) h.b(formFragmentArguments);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponentBuilder paymentMethodCode(String str) {
            this.paymentMethodCode = (String) h.b(str);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class FormViewModelSubcomponentImpl implements FormViewModelSubcomponent {
        private final FormFragmentArguments formFragmentArguments;
        private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl;
        private final String paymentMethodCode;
        private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;

        private TransformSpecToElement transformSpecToElement() {
            return new TransformSpecToElement((ResourceRepository) this.paymentSheetLauncherComponent.asyncResourceRepositoryProvider.mo0get(), this.formFragmentArguments, this.paymentSheetLauncherComponent.application);
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent
        public FormViewModel getViewModel() {
            return new FormViewModel(this.paymentMethodCode, this.formFragmentArguments, (ResourceRepository) this.paymentSheetLauncherComponent.asyncResourceRepositoryProvider.mo0get(), transformSpecToElement());
        }

        private FormViewModelSubcomponentImpl(DaggerPaymentSheetLauncherComponent daggerPaymentSheetLauncherComponent, String str, FormFragmentArguments formFragmentArguments) {
            this.formViewModelSubcomponentImpl = this;
            this.paymentSheetLauncherComponent = daggerPaymentSheetLauncherComponent;
            this.paymentMethodCode = str;
            this.formFragmentArguments = formFragmentArguments;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class PaymentSheetViewModelSubcomponentBuilder implements PaymentSheetViewModelSubcomponent.Builder {
        private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;
        private PaymentSheetViewModelModule paymentSheetViewModelModule;
        private l0 savedStateHandle;

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder
        public PaymentSheetViewModelSubcomponent build() {
            h.a(this.paymentSheetViewModelModule, PaymentSheetViewModelModule.class);
            h.a(this.savedStateHandle, l0.class);
            return new PaymentSheetViewModelSubcomponentImpl(this.paymentSheetViewModelModule, this.savedStateHandle);
        }

        private PaymentSheetViewModelSubcomponentBuilder(DaggerPaymentSheetLauncherComponent daggerPaymentSheetLauncherComponent) {
            this.paymentSheetLauncherComponent = daggerPaymentSheetLauncherComponent;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder
        public PaymentSheetViewModelSubcomponentBuilder paymentSheetViewModelModule(PaymentSheetViewModelModule paymentSheetViewModelModule) {
            this.paymentSheetViewModelModule = (PaymentSheetViewModelModule) h.b(paymentSheetViewModelModule);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.Builder
        public PaymentSheetViewModelSubcomponentBuilder savedStateHandle(l0 l0Var) {
            this.savedStateHandle = (l0) h.b(l0Var);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class PaymentSheetViewModelSubcomponentImpl implements PaymentSheetViewModelSubcomponent {
        private Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
        private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;
        private Provider<LinkPaymentLauncherFactory> linkPaymentLauncherFactoryProvider;
        private LinkPaymentLauncher_Factory linkPaymentLauncherProvider;
        private final DaggerPaymentSheetLauncherComponent paymentSheetLauncherComponent;
        private final PaymentSheetViewModelModule paymentSheetViewModelModule;
        private final PaymentSheetViewModelSubcomponentImpl paymentSheetViewModelSubcomponentImpl;
        private final l0 savedStateHandle;
        private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
        private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

        private void initialize(PaymentSheetViewModelModule paymentSheetViewModelModule, l0 l0Var) {
            StripePaymentLauncher_Factory create = StripePaymentLauncher_Factory.create(this.paymentSheetLauncherComponent.applicationProvider, this.paymentSheetLauncherComponent.provideEnabledLoggingProvider, this.paymentSheetLauncherComponent.provideWorkContextProvider, this.paymentSheetLauncherComponent.provideUIContextProvider, this.paymentSheetLauncherComponent.stripeApiRepositoryProvider, this.paymentSheetLauncherComponent.paymentAnalyticsRequestFactoryProvider, this.paymentSheetLauncherComponent.provideProductUsageTokensProvider);
            this.stripePaymentLauncherProvider = create;
            this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.create(create);
            GooglePayPaymentMethodLauncher_Factory create2 = GooglePayPaymentMethodLauncher_Factory.create(this.paymentSheetLauncherComponent.applicationProvider, this.paymentSheetLauncherComponent.provideGooglePayRepositoryFactoryProvider, this.paymentSheetLauncherComponent.provideProductUsageTokensProvider, this.paymentSheetLauncherComponent.providePublishableKeyProvider, this.paymentSheetLauncherComponent.provideStripeAccountIdProvider, this.paymentSheetLauncherComponent.provideEnabledLoggingProvider, this.paymentSheetLauncherComponent.provideWorkContextProvider, this.paymentSheetLauncherComponent.paymentAnalyticsRequestFactoryProvider, this.paymentSheetLauncherComponent.defaultAnalyticsRequestExecutorProvider, this.paymentSheetLauncherComponent.stripeApiRepositoryProvider);
            this.googlePayPaymentMethodLauncherProvider = create2;
            this.googlePayPaymentMethodLauncherFactoryProvider = GooglePayPaymentMethodLauncherFactory_Impl.create(create2);
            LinkPaymentLauncher_Factory create3 = LinkPaymentLauncher_Factory.create(this.paymentSheetLauncherComponent.applicationProvider, this.paymentSheetLauncherComponent.provideProductUsageTokensProvider, this.paymentSheetLauncherComponent.providePublishableKeyProvider, this.paymentSheetLauncherComponent.provideStripeAccountIdProvider, this.paymentSheetLauncherComponent.provideEnabledLoggingProvider, this.paymentSheetLauncherComponent.provideWorkContextProvider, this.paymentSheetLauncherComponent.provideUIContextProvider, this.paymentSheetLauncherComponent.paymentAnalyticsRequestFactoryProvider, this.paymentSheetLauncherComponent.defaultAnalyticsRequestExecutorProvider, this.paymentSheetLauncherComponent.stripeApiRepositoryProvider, this.paymentSheetLauncherComponent.asyncResourceRepositoryProvider);
            this.linkPaymentLauncherProvider = create3;
            this.linkPaymentLauncherFactoryProvider = LinkPaymentLauncherFactory_Impl.create(create3);
        }

        private PrefsRepository prefsRepository() {
            return PaymentSheetViewModelModule_ProvidePrefsRepositoryFactory.providePrefsRepository(this.paymentSheetViewModelModule, this.paymentSheetLauncherComponent.application, (g) this.paymentSheetLauncherComponent.provideWorkContextProvider.mo0get());
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent
        public PaymentSheetViewModel getViewModel() {
            return new PaymentSheetViewModel(this.paymentSheetLauncherComponent.application, PaymentSheetViewModelModule_ProvideArgsFactory.provideArgs(this.paymentSheetViewModelModule), (EventReporter) this.paymentSheetLauncherComponent.defaultEventReporterProvider.mo0get(), d.a(this.paymentSheetLauncherComponent.providePaymentConfigurationProvider), this.paymentSheetLauncherComponent.api(), new StripeIntentValidator(), (CustomerRepository) this.paymentSheetLauncherComponent.customerApiRepositoryProvider.mo0get(), prefsRepository(), (ResourceRepository) this.paymentSheetLauncherComponent.asyncResourceRepositoryProvider.mo0get(), this.stripePaymentLauncherAssistedFactoryProvider.mo0get(), this.googlePayPaymentMethodLauncherFactoryProvider.mo0get(), (Logger) this.paymentSheetLauncherComponent.provideLoggerProvider.mo0get(), (g) this.paymentSheetLauncherComponent.provideWorkContextProvider.mo0get(), this.paymentSheetLauncherComponent.injectorKey, this.savedStateHandle, this.linkPaymentLauncherFactoryProvider.mo0get());
        }

        private PaymentSheetViewModelSubcomponentImpl(DaggerPaymentSheetLauncherComponent daggerPaymentSheetLauncherComponent, PaymentSheetViewModelModule paymentSheetViewModelModule, l0 l0Var) {
            this.paymentSheetViewModelSubcomponentImpl = this;
            this.paymentSheetLauncherComponent = daggerPaymentSheetLauncherComponent;
            this.paymentSheetViewModelModule = paymentSheetViewModelModule;
            this.savedStateHandle = l0Var;
            initialize(paymentSheetViewModelModule, l0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StripeIntentRepository.Api api() {
        return new StripeIntentRepository.Api(stripeApiRepository(), this.providePaymentConfigurationProvider, this.provideWorkContextProvider.mo0get(), this.provideLocaleProvider.mo0get());
    }

    public static PaymentSheetLauncherComponent.Builder builder() {
        return new Builder();
    }

    private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
        return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.mo0get(), this.provideWorkContextProvider.mo0get());
    }

    private void initialize(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Application application, String str) {
        this.paymentSheetViewModelSubcomponentBuilderProvider = new Provider<PaymentSheetViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public PaymentSheetViewModelSubcomponent.Builder mo0get() {
                return new PaymentSheetViewModelSubcomponentBuilder();
            }
        };
        this.formViewModelSubcomponentBuilderProvider = new Provider<FormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public FormViewModelSubcomponent.Builder mo0get() {
                return new FormViewModelSubcomponentBuilder();
            }
        };
        this.provideEventReporterModeProvider = d.b(PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory.create());
        this.applicationProvider = f.a(application);
        Provider<g> b11 = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        this.provideWorkContextProvider = b11;
        this.defaultDeviceIdRepositoryProvider = d.b(DefaultDeviceIdRepository_Factory.create(this.applicationProvider, b11));
        Provider<Boolean> b12 = d.b(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
        this.provideEnabledLoggingProvider = b12;
        Provider<Logger> b13 = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, b12));
        this.provideLoggerProvider = b13;
        this.defaultAnalyticsRequestExecutorProvider = DefaultAnalyticsRequestExecutor_Factory.create(b13, this.provideWorkContextProvider);
        PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory create = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create(this.applicationProvider);
        this.providePaymentConfigurationProvider = create;
        this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(create);
        Provider<Set<String>> b14 = d.b(PaymentSheetLauncherModule_Companion_ProvideProductUsageTokensFactory.create());
        this.provideProductUsageTokensProvider = b14;
        PaymentAnalyticsRequestFactory_Factory create2 = PaymentAnalyticsRequestFactory_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, b14);
        this.paymentAnalyticsRequestFactoryProvider = create2;
        this.defaultEventReporterProvider = d.b(DefaultEventReporter_Factory.create(this.provideEventReporterModeProvider, this.defaultDeviceIdRepositoryProvider, this.defaultAnalyticsRequestExecutorProvider, create2, this.provideWorkContextProvider));
        this.provideLocaleProvider = d.b(PaymentSheetCommonModule_Companion_ProvideLocaleFactory.create());
        StripeApiRepository_Factory create3 = StripeApiRepository_Factory.create(this.applicationProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.provideLoggerProvider);
        this.stripeApiRepositoryProvider = create3;
        this.customerApiRepositoryProvider = d.b(CustomerApiRepository_Factory.create(create3, this.providePaymentConfigurationProvider, this.provideLoggerProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider));
        Provider<Resources> b15 = d.b(ResourceRepositoryModule_Companion_ProvideResourcesFactory.create(this.applicationProvider));
        this.provideResourcesProvider = b15;
        this.asyncResourceRepositoryProvider = d.b(AsyncResourceRepository_Factory.create(b15, this.provideWorkContextProvider, this.provideLocaleProvider));
        this.provideUIContextProvider = d.b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
        this.provideGooglePayRepositoryFactoryProvider = d.b(GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.applicationProvider, this.provideLoggerProvider));
        this.provideStripeAccountIdProvider = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
    }

    private PaymentSheetViewModel.Factory injectFactory(PaymentSheetViewModel.Factory factory) {
        PaymentSheetViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentSheetViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private FormViewModel.Factory injectFactory2(FormViewModel.Factory factory) {
        FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.formViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private a<String> namedFunction0OfString() {
        return PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.providePublishableKey(this.providePaymentConfigurationProvider);
    }

    private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
        return new PaymentAnalyticsRequestFactory(this.application, namedFunction0OfString(), this.provideProductUsageTokensProvider.mo0get());
    }

    private StripeApiRepository stripeApiRepository() {
        return new StripeApiRepository(this.application, namedFunction0OfString(), this.provideWorkContextProvider.mo0get(), this.provideProductUsageTokensProvider.mo0get(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.mo0get());
    }

    @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent
    public void inject(PaymentSheetViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerPaymentSheetLauncherComponent(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Application application, String str) {
        this.paymentSheetLauncherComponent = this;
        this.application = application;
        this.injectorKey = str;
        initialize(googlePayLauncherModule, coroutineContextModule, loggingModule, application, str);
    }

    @Override // com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent
    public void inject(FormViewModel.Factory factory) {
        injectFactory2(factory);
    }
}