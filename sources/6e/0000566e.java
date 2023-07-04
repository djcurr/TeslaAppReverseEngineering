package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.activity.result.c;
import androidx.lifecycle.l0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
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
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository;
import com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository_Factory;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter_Factory;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer_Factory;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController_Factory;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.forms.FormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.forms.TransformSpecToElement;
import com.stripe.android.paymentsheet.injection.FlowControllerComponent;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.StripeIntentValidator_Factory;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository;
import com.stripe.android.paymentsheet.repositories.CustomerApiRepository_Factory;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository_Api_Factory;
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
import v20.o0;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerFlowControllerComponent implements FlowControllerComponent {
    private Provider<c> activityResultCallerProvider;
    private Provider<StripeIntentRepository.Api> apiProvider;
    private final Context appContext;
    private Provider<Context> appContextProvider;
    private Provider<AsyncResourceRepository> asyncResourceRepositoryProvider;
    private Provider<CustomerApiRepository> customerApiRepositoryProvider;
    private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private Provider<DefaultDeviceIdRepository> defaultDeviceIdRepositoryProvider;
    private Provider<DefaultEventReporter> defaultEventReporterProvider;
    private Provider<DefaultFlowControllerInitializer> defaultFlowControllerInitializerProvider;
    private Provider<DefaultFlowController> defaultFlowControllerProvider;
    private final DaggerFlowControllerComponent flowControllerComponent;
    private Provider<FormViewModelSubcomponent.Builder> formViewModelSubcomponentBuilderProvider;
    private Provider<GooglePayPaymentMethodLauncherFactory> googlePayPaymentMethodLauncherFactoryProvider;
    private GooglePayPaymentMethodLauncher_Factory googlePayPaymentMethodLauncherProvider;
    private final String injectorKey;
    private Provider<String> injectorKeyProvider;
    private Provider<v> lifeCycleOwnerProvider;
    private Provider<o0> lifecycleScopeProvider;
    private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private Provider<PaymentOptionCallback> paymentOptionCallbackProvider;
    private Provider<PaymentOptionFactory> paymentOptionFactoryProvider;
    private Provider<PaymentOptionsViewModelSubcomponent.Builder> paymentOptionsViewModelSubcomponentBuilderProvider;
    private Provider<PaymentSheetResultCallback> paymentResultCallbackProvider;
    private Provider<Boolean> provideEnabledLoggingProvider;
    private Provider<EventReporter.Mode> provideEventReporterModeProvider;
    private Provider<l<GooglePayEnvironment, GooglePayRepository>> provideGooglePayRepositoryFactoryProvider;
    private Provider<Locale> provideLocaleProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
    private Provider<l<PaymentSheet.CustomerConfiguration, PrefsRepository>> providePrefsRepositoryFactoryProvider;
    private Provider<Set<String>> provideProductUsageTokensProvider;
    private Provider<a<String>> providePublishableKeyProvider;
    private Provider<Resources> provideResourcesProvider;
    private Provider<a<String>> provideStripeAccountIdProvider;
    private Provider<g> provideUIContextProvider;
    private Provider<FlowControllerViewModel> provideViewModelProvider;
    private Provider<g> provideWorkContextProvider;
    private Provider<a<Integer>> statusBarColorProvider;
    private Provider<StripeApiRepository> stripeApiRepositoryProvider;
    private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
    private StripePaymentLauncher_Factory stripePaymentLauncherProvider;
    private Provider<u0> viewModelStoreOwnerProvider;

    /* loaded from: classes6.dex */
    private static final class Builder implements FlowControllerComponent.Builder {
        private c activityResultCaller;
        private Context appContext;
        private String injectorKey;
        private v lifeCycleOwner;
        private o0 lifecycleScope;
        private PaymentOptionCallback paymentOptionCallback;
        private PaymentOptionFactory paymentOptionFactory;
        private PaymentSheetResultCallback paymentResultCallback;
        private a<Integer> statusBarColor;
        private u0 viewModelStoreOwner;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public FlowControllerComponent build() {
            h.a(this.appContext, Context.class);
            h.a(this.viewModelStoreOwner, u0.class);
            h.a(this.lifecycleScope, o0.class);
            h.a(this.lifeCycleOwner, v.class);
            h.a(this.activityResultCaller, c.class);
            h.a(this.statusBarColor, a.class);
            h.a(this.paymentOptionFactory, PaymentOptionFactory.class);
            h.a(this.paymentOptionCallback, PaymentOptionCallback.class);
            h.a(this.paymentResultCallback, PaymentSheetResultCallback.class);
            h.a(this.injectorKey, String.class);
            return new DaggerFlowControllerComponent(new GooglePayLauncherModule(), new CoroutineContextModule(), new LoggingModule(), this.appContext, this.viewModelStoreOwner, this.lifecycleScope, this.lifeCycleOwner, this.activityResultCaller, this.statusBarColor, this.paymentOptionFactory, this.paymentOptionCallback, this.paymentResultCallback, this.injectorKey);
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public /* bridge */ /* synthetic */ FlowControllerComponent.Builder statusBarColor(a aVar) {
            return statusBarColor((a<Integer>) aVar);
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder activityResultCaller(c cVar) {
            this.activityResultCaller = (c) h.b(cVar);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder appContext(Context context) {
            this.appContext = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder injectorKey(String str) {
            this.injectorKey = (String) h.b(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder lifeCycleOwner(v vVar) {
            this.lifeCycleOwner = (v) h.b(vVar);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder lifecycleScope(o0 o0Var) {
            this.lifecycleScope = (o0) h.b(o0Var);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder paymentOptionCallback(PaymentOptionCallback paymentOptionCallback) {
            this.paymentOptionCallback = (PaymentOptionCallback) h.b(paymentOptionCallback);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder paymentOptionFactory(PaymentOptionFactory paymentOptionFactory) {
            this.paymentOptionFactory = (PaymentOptionFactory) h.b(paymentOptionFactory);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder paymentResultCallback(PaymentSheetResultCallback paymentSheetResultCallback) {
            this.paymentResultCallback = (PaymentSheetResultCallback) h.b(paymentSheetResultCallback);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder statusBarColor(a<Integer> aVar) {
            this.statusBarColor = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent.Builder
        public Builder viewModelStoreOwner(u0 u0Var) {
            this.viewModelStoreOwner = (u0) h.b(u0Var);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class FormViewModelSubcomponentBuilder implements FormViewModelSubcomponent.Builder {
        private final DaggerFlowControllerComponent flowControllerComponent;
        private FormFragmentArguments formFragmentArguments;
        private String paymentMethodCode;

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder
        public FormViewModelSubcomponent build() {
            h.a(this.paymentMethodCode, String.class);
            h.a(this.formFragmentArguments, FormFragmentArguments.class);
            return new FormViewModelSubcomponentImpl(this.paymentMethodCode, this.formFragmentArguments);
        }

        private FormViewModelSubcomponentBuilder(DaggerFlowControllerComponent daggerFlowControllerComponent) {
            this.flowControllerComponent = daggerFlowControllerComponent;
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
        private final DaggerFlowControllerComponent flowControllerComponent;
        private final FormFragmentArguments formFragmentArguments;
        private final FormViewModelSubcomponentImpl formViewModelSubcomponentImpl;
        private final String paymentMethodCode;

        private TransformSpecToElement transformSpecToElement() {
            return new TransformSpecToElement((ResourceRepository) this.flowControllerComponent.asyncResourceRepositoryProvider.mo0get(), this.formFragmentArguments, this.flowControllerComponent.appContext);
        }

        @Override // com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent
        public FormViewModel getViewModel() {
            return new FormViewModel(this.paymentMethodCode, this.formFragmentArguments, (ResourceRepository) this.flowControllerComponent.asyncResourceRepositoryProvider.mo0get(), transformSpecToElement());
        }

        private FormViewModelSubcomponentImpl(DaggerFlowControllerComponent daggerFlowControllerComponent, String str, FormFragmentArguments formFragmentArguments) {
            this.formViewModelSubcomponentImpl = this;
            this.flowControllerComponent = daggerFlowControllerComponent;
            this.paymentMethodCode = str;
            this.formFragmentArguments = formFragmentArguments;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class PaymentOptionsViewModelSubcomponentBuilder implements PaymentOptionsViewModelSubcomponent.Builder {
        private Application application;
        private PaymentOptionContract.Args args;
        private final DaggerFlowControllerComponent flowControllerComponent;
        private l0 savedStateHandle;

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder
        public PaymentOptionsViewModelSubcomponent build() {
            h.a(this.application, Application.class);
            h.a(this.savedStateHandle, l0.class);
            h.a(this.args, PaymentOptionContract.Args.class);
            return new PaymentOptionsViewModelSubcomponentImpl(this.application, this.savedStateHandle, this.args);
        }

        private PaymentOptionsViewModelSubcomponentBuilder(DaggerFlowControllerComponent daggerFlowControllerComponent) {
            this.flowControllerComponent = daggerFlowControllerComponent;
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
        private final DaggerFlowControllerComponent flowControllerComponent;
        private Provider<LinkPaymentLauncherFactory> linkPaymentLauncherFactoryProvider;
        private LinkPaymentLauncher_Factory linkPaymentLauncherProvider;
        private final PaymentOptionsViewModelSubcomponentImpl paymentOptionsViewModelSubcomponentImpl;
        private final l0 savedStateHandle;

        private void initialize(Application application, l0 l0Var, PaymentOptionContract.Args args) {
            LinkPaymentLauncher_Factory create = LinkPaymentLauncher_Factory.create(this.flowControllerComponent.appContextProvider, this.flowControllerComponent.provideProductUsageTokensProvider, this.flowControllerComponent.providePublishableKeyProvider, this.flowControllerComponent.provideStripeAccountIdProvider, this.flowControllerComponent.provideEnabledLoggingProvider, this.flowControllerComponent.provideWorkContextProvider, this.flowControllerComponent.provideUIContextProvider, this.flowControllerComponent.paymentAnalyticsRequestFactoryProvider, this.flowControllerComponent.defaultAnalyticsRequestExecutorProvider, this.flowControllerComponent.stripeApiRepositoryProvider, this.flowControllerComponent.asyncResourceRepositoryProvider);
            this.linkPaymentLauncherProvider = create;
            this.linkPaymentLauncherFactoryProvider = LinkPaymentLauncherFactory_Impl.create(create);
        }

        @Override // com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent
        public PaymentOptionsViewModel getViewModel() {
            return new PaymentOptionsViewModel(this.args, (l) this.flowControllerComponent.providePrefsRepositoryFactoryProvider.mo0get(), (EventReporter) this.flowControllerComponent.defaultEventReporterProvider.mo0get(), (CustomerRepository) this.flowControllerComponent.customerApiRepositoryProvider.mo0get(), (g) this.flowControllerComponent.provideWorkContextProvider.mo0get(), this.application, (Logger) this.flowControllerComponent.provideLoggerProvider.mo0get(), this.flowControllerComponent.injectorKey, (ResourceRepository) this.flowControllerComponent.asyncResourceRepositoryProvider.mo0get(), this.savedStateHandle, this.linkPaymentLauncherFactoryProvider.mo0get());
        }

        private PaymentOptionsViewModelSubcomponentImpl(DaggerFlowControllerComponent daggerFlowControllerComponent, Application application, l0 l0Var, PaymentOptionContract.Args args) {
            this.paymentOptionsViewModelSubcomponentImpl = this;
            this.flowControllerComponent = daggerFlowControllerComponent;
            this.args = args;
            this.application = application;
            this.savedStateHandle = l0Var;
            initialize(application, l0Var, args);
        }
    }

    public static FlowControllerComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, u0 u0Var, o0 o0Var, v vVar, c cVar, a<Integer> aVar, PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback, String str) {
        this.lifecycleScopeProvider = f.a(o0Var);
        this.lifeCycleOwnerProvider = f.a(vVar);
        this.statusBarColorProvider = f.a(aVar);
        this.paymentOptionFactoryProvider = f.a(paymentOptionFactory);
        this.paymentOptionCallbackProvider = f.a(paymentOptionCallback);
        this.paymentResultCallbackProvider = f.a(paymentSheetResultCallback);
        this.activityResultCallerProvider = f.a(cVar);
        this.injectorKeyProvider = f.a(str);
        this.appContextProvider = f.a(context);
        Provider<g> b11 = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        this.provideWorkContextProvider = b11;
        this.providePrefsRepositoryFactoryProvider = d.b(FlowControllerModule_Companion_ProvidePrefsRepositoryFactoryFactory.create(this.appContextProvider, b11));
        Provider<Boolean> b12 = d.b(PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory.create());
        this.provideEnabledLoggingProvider = b12;
        Provider<Logger> b13 = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, b12));
        this.provideLoggerProvider = b13;
        this.provideGooglePayRepositoryFactoryProvider = d.b(GooglePayLauncherModule_ProvideGooglePayRepositoryFactoryFactory.create(googlePayLauncherModule, this.appContextProvider, b13));
        PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory create = PaymentSheetCommonModule_Companion_ProvidePaymentConfigurationFactory.create(this.appContextProvider);
        this.providePaymentConfigurationProvider = create;
        this.providePublishableKeyProvider = PaymentSheetCommonModule_Companion_ProvidePublishableKeyFactory.create(create);
        Provider<Set<String>> b14 = d.b(FlowControllerModule_Companion_ProvideProductUsageTokensFactory.create());
        this.provideProductUsageTokensProvider = b14;
        this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.appContextProvider, this.providePublishableKeyProvider, b14);
        DefaultAnalyticsRequestExecutor_Factory create2 = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
        this.defaultAnalyticsRequestExecutorProvider = create2;
        this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.appContextProvider, this.providePublishableKeyProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider, this.paymentAnalyticsRequestFactoryProvider, create2, this.provideLoggerProvider);
        Provider<Locale> b15 = d.b(PaymentSheetCommonModule_Companion_ProvideLocaleFactory.create());
        this.provideLocaleProvider = b15;
        this.apiProvider = StripeIntentRepository_Api_Factory.create(this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideWorkContextProvider, b15);
        this.customerApiRepositoryProvider = d.b(CustomerApiRepository_Factory.create(this.stripeApiRepositoryProvider, this.providePaymentConfigurationProvider, this.provideLoggerProvider, this.provideWorkContextProvider, this.provideProductUsageTokensProvider));
        Provider<Resources> b16 = d.b(ResourceRepositoryModule_Companion_ProvideResourcesFactory.create(this.appContextProvider));
        this.provideResourcesProvider = b16;
        this.asyncResourceRepositoryProvider = d.b(AsyncResourceRepository_Factory.create(b16, this.provideWorkContextProvider, this.provideLocaleProvider));
        this.defaultFlowControllerInitializerProvider = d.b(DefaultFlowControllerInitializer_Factory.create(this.providePrefsRepositoryFactoryProvider, this.provideGooglePayRepositoryFactoryProvider, this.apiProvider, StripeIntentValidator_Factory.create(), this.customerApiRepositoryProvider, this.asyncResourceRepositoryProvider, this.provideLoggerProvider, this.provideWorkContextProvider));
        this.provideEventReporterModeProvider = d.b(FlowControllerModule_Companion_ProvideEventReporterModeFactory.create());
        Provider<DefaultDeviceIdRepository> b17 = d.b(DefaultDeviceIdRepository_Factory.create(this.appContextProvider, this.provideWorkContextProvider));
        this.defaultDeviceIdRepositoryProvider = b17;
        this.defaultEventReporterProvider = d.b(DefaultEventReporter_Factory.create(this.provideEventReporterModeProvider, b17, this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, this.provideWorkContextProvider));
        e a11 = f.a(u0Var);
        this.viewModelStoreOwnerProvider = a11;
        this.provideViewModelProvider = d.b(FlowControllerModule_Companion_ProvideViewModelFactory.create(a11));
        Provider<g> b18 = d.b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
        this.provideUIContextProvider = b18;
        StripePaymentLauncher_Factory create3 = StripePaymentLauncher_Factory.create(this.appContextProvider, this.provideEnabledLoggingProvider, this.provideWorkContextProvider, b18, this.stripeApiRepositoryProvider, this.paymentAnalyticsRequestFactoryProvider, this.provideProductUsageTokensProvider);
        this.stripePaymentLauncherProvider = create3;
        this.stripePaymentLauncherAssistedFactoryProvider = StripePaymentLauncherAssistedFactory_Impl.create(create3);
        PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory create4 = PaymentSheetCommonModule_Companion_ProvideStripeAccountIdFactory.create(this.providePaymentConfigurationProvider);
        this.provideStripeAccountIdProvider = create4;
        GooglePayPaymentMethodLauncher_Factory create5 = GooglePayPaymentMethodLauncher_Factory.create(this.appContextProvider, this.provideGooglePayRepositoryFactoryProvider, this.provideProductUsageTokensProvider, this.providePublishableKeyProvider, create4, this.provideEnabledLoggingProvider, this.provideWorkContextProvider, this.paymentAnalyticsRequestFactoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.stripeApiRepositoryProvider);
        this.googlePayPaymentMethodLauncherProvider = create5;
        Provider<GooglePayPaymentMethodLauncherFactory> create6 = GooglePayPaymentMethodLauncherFactory_Impl.create(create5);
        this.googlePayPaymentMethodLauncherFactoryProvider = create6;
        this.defaultFlowControllerProvider = d.b(DefaultFlowController_Factory.create(this.lifecycleScopeProvider, this.lifeCycleOwnerProvider, this.statusBarColorProvider, this.paymentOptionFactoryProvider, this.paymentOptionCallbackProvider, this.paymentResultCallbackProvider, this.activityResultCallerProvider, this.injectorKeyProvider, this.defaultFlowControllerInitializerProvider, this.defaultEventReporterProvider, this.provideViewModelProvider, this.stripePaymentLauncherAssistedFactoryProvider, this.asyncResourceRepositoryProvider, this.providePaymentConfigurationProvider, this.provideUIContextProvider, this.provideEnabledLoggingProvider, this.provideProductUsageTokensProvider, create6));
        this.paymentOptionsViewModelSubcomponentBuilderProvider = new Provider<PaymentOptionsViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerFlowControllerComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public PaymentOptionsViewModelSubcomponent.Builder mo0get() {
                return new PaymentOptionsViewModelSubcomponentBuilder();
            }
        };
        this.formViewModelSubcomponentBuilderProvider = new Provider<FormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.injection.DaggerFlowControllerComponent.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public FormViewModelSubcomponent.Builder mo0get() {
                return new FormViewModelSubcomponentBuilder();
            }
        };
    }

    private PaymentOptionsViewModel.Factory injectFactory(PaymentOptionsViewModel.Factory factory) {
        PaymentOptionsViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.paymentOptionsViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private FormViewModel.Factory injectFactory2(FormViewModel.Factory factory) {
        FormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.formViewModelSubcomponentBuilderProvider);
        return factory;
    }

    @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent
    public DefaultFlowController getFlowController() {
        return this.defaultFlowControllerProvider.mo0get();
    }

    @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent
    public void inject(PaymentOptionsViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerFlowControllerComponent(GooglePayLauncherModule googlePayLauncherModule, CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, u0 u0Var, o0 o0Var, v vVar, c cVar, a<Integer> aVar, PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback, String str) {
        this.flowControllerComponent = this;
        this.injectorKey = str;
        this.appContext = context;
        initialize(googlePayLauncherModule, coroutineContextModule, loggingModule, context, u0Var, o0Var, vVar, cVar, aVar, paymentOptionFactory, paymentOptionCallback, paymentSheetResultCallback, str);
    }

    @Override // com.stripe.android.paymentsheet.injection.FlowControllerComponent
    public void inject(FormViewModel.Factory factory) {
        injectFactory2(factory);
    }
}