package com.stripe.android.financialconnections.di;

import android.app.Application;
import androidx.lifecycle.l0;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter_Factory;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.GenerateFinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository_Factory;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import javax.inject.Provider;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes2.dex */
public final class DaggerFinancialConnectionsSheetComponent implements FinancialConnectionsSheetComponent {
    private Provider<Application> applicationProvider;
    private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private Provider<DefaultFinancialConnectionsEventReporter> defaultFinancialConnectionsEventReporterProvider;
    private Provider<FinancialConnectionsApiRepository> financialConnectionsApiRepositoryProvider;
    private final DaggerFinancialConnectionsSheetComponent financialConnectionsSheetComponent;
    private final FinancialConnectionsSheetActivityArgs internalArgs;
    private Provider<FinancialConnectionsSheetActivityArgs> internalArgsProvider;
    private Provider<AnalyticsRequestFactory> provideAnalyticsRequestFactory$financial_connections_releaseProvider;
    private Provider<FinancialConnectionsRepository> provideConnectionsRepositoryProvider;
    private Provider<FinancialConnectionsEventReporter> provideEventReporterProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<StripeNetworkClient> provideStripeNetworkClientProvider;
    private Provider<g> provideWorkContextProvider;
    private Provider<AnalyticsRequestExecutor> providesAnalyticsRequestExecutor$financial_connections_releaseProvider;
    private Provider<ApiRequest.Factory> providesApiRequestFactoryProvider;
    private Provider<String> providesApplicationIdProvider;
    private Provider<FinancialConnectionsSheet.Configuration> providesConfigurationProvider;
    private Provider<Boolean> providesEnableLoggingProvider;
    private Provider<String> providesPublishableKeyProvider;
    private final l0 savedStateHandle;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class Builder implements FinancialConnectionsSheetComponent.Builder {
        private Application application;
        private FinancialConnectionsSheetActivityArgs internalArgs;
        private l0 savedStateHandle;

        private Builder() {
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public FinancialConnectionsSheetComponent build() {
            h.a(this.application, Application.class);
            h.a(this.savedStateHandle, l0.class);
            h.a(this.internalArgs, FinancialConnectionsSheetActivityArgs.class);
            return new DaggerFinancialConnectionsSheetComponent(new CoroutineContextModule(), new LoggingModule(), this.application, this.savedStateHandle, this.internalArgs);
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) h.b(application);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public Builder internalArgs(FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs) {
            this.internalArgs = (FinancialConnectionsSheetActivityArgs) h.b(financialConnectionsSheetActivityArgs);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent.Builder
        public Builder savedStateHandle(l0 l0Var) {
            this.savedStateHandle = (l0) h.b(l0Var);
            return this;
        }
    }

    public static FinancialConnectionsSheetComponent.Builder builder() {
        return new Builder();
    }

    private FetchFinancialConnectionsSession fetchFinancialConnectionsSession() {
        return new FetchFinancialConnectionsSession(this.provideConnectionsRepositoryProvider.mo0get());
    }

    private FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken() {
        return new FetchFinancialConnectionsSessionForToken(this.provideConnectionsRepositoryProvider.mo0get());
    }

    private GenerateFinancialConnectionsSessionManifest generateFinancialConnectionsSessionManifest() {
        return new GenerateFinancialConnectionsSessionManifest(this.provideConnectionsRepositoryProvider.mo0get());
    }

    private void initialize(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Application application, l0 l0Var, FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs) {
        e a11 = f.a(application);
        this.applicationProvider = a11;
        this.providesApplicationIdProvider = d.b(FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory.create(a11));
        e a12 = f.a(financialConnectionsSheetActivityArgs);
        this.internalArgsProvider = a12;
        Provider<FinancialConnectionsSheet.Configuration> b11 = d.b(FinancialConnectionsSheetConfigurationModule_ProvidesConfigurationFactory.create(a12));
        this.providesConfigurationProvider = b11;
        this.providesPublishableKeyProvider = d.b(FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory.create(b11));
        this.provideWorkContextProvider = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        Provider<Boolean> b12 = d.b(FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory.create());
        this.providesEnableLoggingProvider = b12;
        Provider<Logger> b13 = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, b12));
        this.provideLoggerProvider = b13;
        this.provideStripeNetworkClientProvider = d.b(FinancialConnectionsSheetModule_ProvideStripeNetworkClientFactory.create(this.provideWorkContextProvider, b13));
        Provider<ApiRequest.Factory> b14 = d.b(FinancialConnectionsSheetModule_ProvidesApiRequestFactoryFactory.create());
        this.providesApiRequestFactoryProvider = b14;
        FinancialConnectionsApiRepository_Factory create = FinancialConnectionsApiRepository_Factory.create(this.providesPublishableKeyProvider, this.provideStripeNetworkClientProvider, b14);
        this.financialConnectionsApiRepositoryProvider = create;
        this.provideConnectionsRepositoryProvider = d.b(FinancialConnectionsSheetModule_ProvideConnectionsRepositoryFactory.create(create));
        DefaultAnalyticsRequestExecutor_Factory create2 = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
        this.defaultAnalyticsRequestExecutorProvider = create2;
        this.providesAnalyticsRequestExecutor$financial_connections_releaseProvider = d.b(FinancialConnectionsSheetModule_ProvidesAnalyticsRequestExecutor$financial_connections_releaseFactory.create(create2));
        Provider<AnalyticsRequestFactory> b15 = d.b(FinancialConnectionsSheetModule_ProvideAnalyticsRequestFactory$financial_connections_releaseFactory.create(this.applicationProvider, this.providesPublishableKeyProvider));
        this.provideAnalyticsRequestFactory$financial_connections_releaseProvider = b15;
        DefaultFinancialConnectionsEventReporter_Factory create3 = DefaultFinancialConnectionsEventReporter_Factory.create(this.providesAnalyticsRequestExecutor$financial_connections_releaseProvider, b15, this.provideWorkContextProvider);
        this.defaultFinancialConnectionsEventReporterProvider = create3;
        this.provideEventReporterProvider = d.b(FinancialConnectionsSheetModule_ProvideEventReporterFactory.create(create3));
    }

    @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent
    public FinancialConnectionsSheetViewModel getViewModel() {
        return new FinancialConnectionsSheetViewModel(this.providesApplicationIdProvider.mo0get(), this.internalArgs, generateFinancialConnectionsSessionManifest(), fetchFinancialConnectionsSession(), fetchFinancialConnectionsSessionForToken(), this.savedStateHandle, this.provideEventReporterProvider.mo0get());
    }

    @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetComponent
    public void inject(FinancialConnectionsSheetViewModel.Factory factory) {
    }

    private DaggerFinancialConnectionsSheetComponent(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Application application, l0 l0Var, FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs) {
        this.financialConnectionsSheetComponent = this;
        this.internalArgs = financialConnectionsSheetActivityArgs;
        this.savedStateHandle = l0Var;
        initialize(coroutineContextModule, loggingModule, application, l0Var, financialConnectionsSheetActivityArgs);
    }
}