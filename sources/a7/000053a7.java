package com.stripe.android.payments.bankaccount.di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.l0;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel;
import h00.a;
import javax.inject.Provider;
import kotlinx.coroutines.flow.t;
import tw.d;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerCollectBankAccountComponent implements CollectBankAccountComponent {
    private final Application application;
    private final DaggerCollectBankAccountComponent collectBankAccountComponent;
    private final CollectBankAccountContract.Args configuration;
    private Provider<Logger> provideLoggerProvider;
    private Provider<g> provideWorkContextProvider;
    private final l0 savedStateHandle;
    private final t<CollectBankAccountViewEffect> viewEffect;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements CollectBankAccountComponent.Builder {
        private Application application;
        private CollectBankAccountContract.Args configuration;
        private l0 savedStateHandle;
        private t<CollectBankAccountViewEffect> viewEffect;

        private Builder() {
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public CollectBankAccountComponent build() {
            h.a(this.application, Application.class);
            h.a(this.viewEffect, t.class);
            h.a(this.savedStateHandle, l0.class);
            h.a(this.configuration, CollectBankAccountContract.Args.class);
            return new DaggerCollectBankAccountComponent(new CoroutineContextModule(), new LoggingModule(), this.application, this.viewEffect, this.savedStateHandle, this.configuration);
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public /* bridge */ /* synthetic */ CollectBankAccountComponent.Builder viewEffect(t tVar) {
            return viewEffect((t<CollectBankAccountViewEffect>) tVar);
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) h.b(application);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public Builder configuration(CollectBankAccountContract.Args args) {
            this.configuration = (CollectBankAccountContract.Args) h.b(args);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public Builder savedStateHandle(l0 l0Var) {
            this.savedStateHandle = (l0) h.b(l0Var);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent.Builder
        public Builder viewEffect(t<CollectBankAccountViewEffect> tVar) {
            this.viewEffect = (t) h.b(tVar);
            return this;
        }
    }

    private AttachFinancialConnectionsSession attachFinancialConnectionsSession() {
        return new AttachFinancialConnectionsSession(stripeApiRepository());
    }

    public static CollectBankAccountComponent.Builder builder() {
        return new Builder();
    }

    private Context context() {
        return CollectBankAccountModule_ProvidesAppContextFactory.providesAppContext(this.application);
    }

    private CreateFinancialConnectionsSession createFinancialConnectionsSession() {
        return new CreateFinancialConnectionsSession(stripeApiRepository());
    }

    private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
        return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.mo0get(), this.provideWorkContextProvider.mo0get());
    }

    private void initialize(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Application application, t<CollectBankAccountViewEffect> tVar, l0 l0Var, CollectBankAccountContract.Args args) {
        this.provideWorkContextProvider = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        this.provideLoggerProvider = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, CollectBankAccountModule_ProvidesEnableLoggingFactory.create()));
    }

    private a<String> namedFunction0OfString() {
        return CollectBankAccountModule_ProvidePublishableKeyFactory.providePublishableKey(this.configuration);
    }

    private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
        return new PaymentAnalyticsRequestFactory(context(), namedFunction0OfString(), CollectBankAccountModule_ProvidesProductUsageFactory.providesProductUsage());
    }

    private RetrieveStripeIntent retrieveStripeIntent() {
        return new RetrieveStripeIntent(stripeApiRepository());
    }

    private StripeApiRepository stripeApiRepository() {
        return new StripeApiRepository(context(), namedFunction0OfString(), this.provideWorkContextProvider.mo0get(), CollectBankAccountModule_ProvidesProductUsageFactory.providesProductUsage(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.mo0get());
    }

    @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent
    public CollectBankAccountViewModel getViewModel() {
        return new CollectBankAccountViewModel(this.configuration, this.viewEffect, createFinancialConnectionsSession(), attachFinancialConnectionsSession(), retrieveStripeIntent(), this.savedStateHandle, this.provideLoggerProvider.mo0get());
    }

    @Override // com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent
    public void inject(CollectBankAccountViewModel.Factory factory) {
    }

    private DaggerCollectBankAccountComponent(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Application application, t<CollectBankAccountViewEffect> tVar, l0 l0Var, CollectBankAccountContract.Args args) {
        this.collectBankAccountComponent = this;
        this.configuration = args;
        this.viewEffect = tVar;
        this.application = application;
        this.savedStateHandle = l0Var;
        initialize(coroutineContextModule, loggingModule, application, tVar, l0Var, args);
    }
}