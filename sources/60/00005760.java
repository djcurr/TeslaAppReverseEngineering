package com.stripe.android.paymentsheet.paymentdatacollection.ach.di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.l0;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel_Factory_MembersInjector;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent;
import h00.a;
import javax.inject.Provider;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerUSBankAccountFormComponent implements USBankAccountFormComponent {
    private final Application application;
    private Provider<Application> applicationProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<PaymentConfiguration> providePaymentConfigurationProvider;
    private Provider<g> provideWorkContextProvider;
    private Provider<Context> providesAppContextProvider;
    private Provider<Boolean> providesEnableLoggingProvider;
    private final DaggerUSBankAccountFormComponent uSBankAccountFormComponent;
    private final USBankAccountFormViewModelModule uSBankAccountFormViewModelModule;
    private Provider<USBankAccountFormViewModelSubcomponent.Builder> uSBankAccountFormViewModelSubcomponentBuilderProvider;

    /* loaded from: classes6.dex */
    private static final class Builder implements USBankAccountFormComponent.Builder {
        private Application application;
        private String injectorKey;

        private Builder() {
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent.Builder
        public USBankAccountFormComponent build() {
            h.a(this.application, Application.class);
            h.a(this.injectorKey, String.class);
            return new DaggerUSBankAccountFormComponent(new CoroutineContextModule(), new USBankAccountFormViewModelModule(), new LoggingModule(), this.application, this.injectorKey);
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) h.b(application);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent.Builder
        public Builder injectorKey(String str) {
            this.injectorKey = (String) h.b(str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class USBankAccountFormViewModelSubcomponentBuilder implements USBankAccountFormViewModelSubcomponent.Builder {
        private USBankAccountFormViewModel.Args configuration;
        private l0 savedStateHandle;
        private final DaggerUSBankAccountFormComponent uSBankAccountFormComponent;

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponent build() {
            h.a(this.savedStateHandle, l0.class);
            h.a(this.configuration, USBankAccountFormViewModel.Args.class);
            return new USBankAccountFormViewModelSubcomponentImpl(this.savedStateHandle, this.configuration);
        }

        private USBankAccountFormViewModelSubcomponentBuilder(DaggerUSBankAccountFormComponent daggerUSBankAccountFormComponent) {
            this.uSBankAccountFormComponent = daggerUSBankAccountFormComponent;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponentBuilder configuration(USBankAccountFormViewModel.Args args) {
            this.configuration = (USBankAccountFormViewModel.Args) h.b(args);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent.Builder
        public USBankAccountFormViewModelSubcomponentBuilder savedStateHandle(l0 l0Var) {
            this.savedStateHandle = (l0) h.b(l0Var);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class USBankAccountFormViewModelSubcomponentImpl implements USBankAccountFormViewModelSubcomponent {
        private final USBankAccountFormViewModel.Args configuration;
        private final l0 savedStateHandle;
        private final DaggerUSBankAccountFormComponent uSBankAccountFormComponent;
        private final USBankAccountFormViewModelSubcomponentImpl uSBankAccountFormViewModelSubcomponentImpl;

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormViewModelSubcomponent
        public USBankAccountFormViewModel getViewModel() {
            return new USBankAccountFormViewModel(this.configuration, this.uSBankAccountFormComponent.application, this.uSBankAccountFormComponent.stripeApiRepository(), this.uSBankAccountFormComponent.providePaymentConfigurationProvider, this.savedStateHandle);
        }

        private USBankAccountFormViewModelSubcomponentImpl(DaggerUSBankAccountFormComponent daggerUSBankAccountFormComponent, l0 l0Var, USBankAccountFormViewModel.Args args) {
            this.uSBankAccountFormViewModelSubcomponentImpl = this;
            this.uSBankAccountFormComponent = daggerUSBankAccountFormComponent;
            this.configuration = args;
            this.savedStateHandle = l0Var;
        }
    }

    public static USBankAccountFormComponent.Builder builder() {
        return new Builder();
    }

    private Context context() {
        return USBankAccountFormViewModelModule_ProvidesAppContextFactory.providesAppContext(this.uSBankAccountFormViewModelModule, this.application);
    }

    private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
        return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.mo0get(), this.provideWorkContextProvider.mo0get());
    }

    private void initialize(CoroutineContextModule coroutineContextModule, USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, LoggingModule loggingModule, Application application, String str) {
        this.uSBankAccountFormViewModelSubcomponentBuilderProvider = new Provider<USBankAccountFormViewModelSubcomponent.Builder>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.di.DaggerUSBankAccountFormComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public USBankAccountFormViewModelSubcomponent.Builder mo0get() {
                return new USBankAccountFormViewModelSubcomponentBuilder();
            }
        };
        this.provideWorkContextProvider = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory create = USBankAccountFormViewModelModule_ProvidesEnableLoggingFactory.create(uSBankAccountFormViewModelModule);
        this.providesEnableLoggingProvider = create;
        this.provideLoggerProvider = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, create));
        e a11 = f.a(application);
        this.applicationProvider = a11;
        USBankAccountFormViewModelModule_ProvidesAppContextFactory create2 = USBankAccountFormViewModelModule_ProvidesAppContextFactory.create(uSBankAccountFormViewModelModule, a11);
        this.providesAppContextProvider = create2;
        this.providePaymentConfigurationProvider = USBankAccountFormViewModelModule_ProvidePaymentConfigurationFactory.create(uSBankAccountFormViewModelModule, create2);
    }

    private USBankAccountFormViewModel.Factory injectFactory(USBankAccountFormViewModel.Factory factory) {
        USBankAccountFormViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.uSBankAccountFormViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private a<String> namedFunction0OfString() {
        return USBankAccountFormViewModelModule_ProvidePublishableKeyFactory.providePublishableKey(this.uSBankAccountFormViewModelModule, context());
    }

    private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
        return new PaymentAnalyticsRequestFactory(context(), namedFunction0OfString(), USBankAccountFormViewModelModule_ProvidesProductUsageFactory.providesProductUsage(this.uSBankAccountFormViewModelModule));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StripeApiRepository stripeApiRepository() {
        return new StripeApiRepository(context(), namedFunction0OfString(), this.provideWorkContextProvider.mo0get(), USBankAccountFormViewModelModule_ProvidesProductUsageFactory.providesProductUsage(this.uSBankAccountFormViewModelModule), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.mo0get());
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.ach.di.USBankAccountFormComponent
    public void inject(USBankAccountFormViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerUSBankAccountFormComponent(CoroutineContextModule coroutineContextModule, USBankAccountFormViewModelModule uSBankAccountFormViewModelModule, LoggingModule loggingModule, Application application, String str) {
        this.uSBankAccountFormComponent = this;
        this.application = application;
        this.uSBankAccountFormViewModelModule = uSBankAccountFormViewModelModule;
        initialize(coroutineContextModule, uSBankAccountFormViewModelModule, loggingModule, application, str);
    }
}