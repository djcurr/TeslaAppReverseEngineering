package com.stripe.android.payments.core.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.l0;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory_MembersInjector;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import h00.a;
import java.util.Set;
import javax.inject.Provider;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerStripe3ds2TransactionViewModelFactoryComponent implements Stripe3ds2TransactionViewModelFactoryComponent {
    private final Context context;
    private Provider<Context> contextProvider;
    private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private Provider<DefaultStripe3ds2ChallengeResultProcessor> defaultStripe3ds2ChallengeResultProcessorProvider;
    private Provider<Boolean> enableLoggingProvider;
    private final Boolean isInstantApp;
    private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Set<String> productUsage;
    private Provider<Set<String>> productUsageProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<MessageVersionRegistry> provideMessageVersionRegistryProvider;
    private Provider<StripeThreeDs2Service> provideStripeThreeDs2ServiceProvider;
    private Provider<g> provideWorkContextProvider;
    private final a<String> publishableKeyProvider;
    private Provider<a<String>> publishableKeyProvider2;
    private Provider<RetryDelaySupplier> retryDelaySupplierProvider;
    private final DaggerStripe3ds2TransactionViewModelFactoryComponent stripe3ds2TransactionViewModelFactoryComponent;
    private Provider<StripeApiRepository> stripeApiRepositoryProvider;

    /* loaded from: classes6.dex */
    private static final class Builder implements Stripe3ds2TransactionViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Boolean isInstantApp;
        private Set<String> productUsage;
        private a<String> publishableKeyProvider;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Stripe3ds2TransactionViewModelFactoryComponent build() {
            h.a(this.context, Context.class);
            h.a(this.enableLogging, Boolean.class);
            h.a(this.publishableKeyProvider, a.class);
            h.a(this.productUsage, Set.class);
            h.a(this.isInstantApp, Boolean.class);
            return new DaggerStripe3ds2TransactionViewModelFactoryComponent(new CoroutineContextModule(), new LoggingModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.productUsage, this.isInstantApp);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ Stripe3ds2TransactionViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ Stripe3ds2TransactionViewModelFactoryComponent.Builder publishableKeyProvider(a aVar) {
            return publishableKeyProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z11) {
            this.enableLogging = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder isInstantApp(boolean z11) {
            this.isInstantApp = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) h.b(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(a<String> aVar) {
            this.publishableKeyProvider = (a) h.b(aVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Stripe3ds2TransactionViewModelSubcomponentBuilder implements Stripe3ds2TransactionViewModelSubcomponent.Builder {
        private Application application;
        private Stripe3ds2TransactionContract.Args args;
        private l0 savedStateHandle;
        private final DaggerStripe3ds2TransactionViewModelFactoryComponent stripe3ds2TransactionViewModelFactoryComponent;

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponent build() {
            h.a(this.args, Stripe3ds2TransactionContract.Args.class);
            h.a(this.savedStateHandle, l0.class);
            h.a(this.application, Application.class);
            return new Stripe3ds2TransactionViewModelSubcomponentImpl(new Stripe3dsTransactionViewModelModule(), this.args, this.savedStateHandle, this.application);
        }

        private Stripe3ds2TransactionViewModelSubcomponentBuilder(DaggerStripe3ds2TransactionViewModelFactoryComponent daggerStripe3ds2TransactionViewModelFactoryComponent) {
            this.stripe3ds2TransactionViewModelFactoryComponent = daggerStripe3ds2TransactionViewModelFactoryComponent;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder application(Application application) {
            this.application = (Application) h.b(application);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder args(Stripe3ds2TransactionContract.Args args) {
            this.args = (Stripe3ds2TransactionContract.Args) h.b(args);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponentBuilder savedStateHandle(l0 l0Var) {
            this.savedStateHandle = (l0) h.b(l0Var);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class Stripe3ds2TransactionViewModelSubcomponentImpl implements Stripe3ds2TransactionViewModelSubcomponent {
        private final Application application;
        private final Stripe3ds2TransactionContract.Args args;
        private final l0 savedStateHandle;
        private final DaggerStripe3ds2TransactionViewModelFactoryComponent stripe3ds2TransactionViewModelFactoryComponent;
        private final Stripe3ds2TransactionViewModelSubcomponentImpl stripe3ds2TransactionViewModelSubcomponentImpl;
        private final Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule;

        private InitChallengeRepository initChallengeRepository() {
            return Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory.providesInitChallengeRepository(this.stripe3dsTransactionViewModelModule, this.application, this.args, (g) this.stripe3ds2TransactionViewModelFactoryComponent.provideWorkContextProvider.mo0get());
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent
        public Stripe3ds2TransactionViewModel getViewModel() {
            return new Stripe3ds2TransactionViewModel(this.args, this.stripe3ds2TransactionViewModelFactoryComponent.stripeApiRepository(), this.stripe3ds2TransactionViewModelFactoryComponent.defaultAnalyticsRequestExecutor(), this.stripe3ds2TransactionViewModelFactoryComponent.paymentAnalyticsRequestFactory(), (StripeThreeDs2Service) this.stripe3ds2TransactionViewModelFactoryComponent.provideStripeThreeDs2ServiceProvider.mo0get(), (MessageVersionRegistry) this.stripe3ds2TransactionViewModelFactoryComponent.provideMessageVersionRegistryProvider.mo0get(), (Stripe3ds2ChallengeResultProcessor) this.stripe3ds2TransactionViewModelFactoryComponent.defaultStripe3ds2ChallengeResultProcessorProvider.mo0get(), initChallengeRepository(), (g) this.stripe3ds2TransactionViewModelFactoryComponent.provideWorkContextProvider.mo0get(), this.savedStateHandle, this.stripe3ds2TransactionViewModelFactoryComponent.isInstantApp.booleanValue());
        }

        private Stripe3ds2TransactionViewModelSubcomponentImpl(DaggerStripe3ds2TransactionViewModelFactoryComponent daggerStripe3ds2TransactionViewModelFactoryComponent, Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Stripe3ds2TransactionContract.Args args, l0 l0Var, Application application) {
            this.stripe3ds2TransactionViewModelSubcomponentImpl = this;
            this.stripe3ds2TransactionViewModelFactoryComponent = daggerStripe3ds2TransactionViewModelFactoryComponent;
            this.args = args;
            this.stripe3dsTransactionViewModelModule = stripe3dsTransactionViewModelModule;
            this.application = application;
            this.savedStateHandle = l0Var;
        }
    }

    public static Stripe3ds2TransactionViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
        return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.mo0get(), this.provideWorkContextProvider.mo0get());
    }

    private void initialize(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Boolean bool, a<String> aVar, Set<String> set, Boolean bool2) {
        this.provideWorkContextProvider = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        e a11 = f.a(bool);
        this.enableLoggingProvider = a11;
        this.provideLoggerProvider = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, a11));
        e a12 = f.a(context);
        this.contextProvider = a12;
        this.provideStripeThreeDs2ServiceProvider = d.b(Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory.create(a12, this.enableLoggingProvider, this.provideWorkContextProvider));
        this.provideMessageVersionRegistryProvider = d.b(Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory.create());
        this.publishableKeyProvider2 = f.a(aVar);
        e a13 = f.a(set);
        this.productUsageProvider = a13;
        this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider2, a13);
        DefaultAnalyticsRequestExecutor_Factory create = DefaultAnalyticsRequestExecutor_Factory.create(this.provideLoggerProvider, this.provideWorkContextProvider);
        this.defaultAnalyticsRequestExecutorProvider = create;
        this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider2, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, create, this.provideLoggerProvider);
        Provider<RetryDelaySupplier> b11 = d.b(RetryDelaySupplier_Factory.create());
        this.retryDelaySupplierProvider = b11;
        this.defaultStripe3ds2ChallengeResultProcessorProvider = d.b(DefaultStripe3ds2ChallengeResultProcessor_Factory.create(this.stripeApiRepositoryProvider, this.defaultAnalyticsRequestExecutorProvider, this.paymentAnalyticsRequestFactoryProvider, b11, this.provideLoggerProvider, this.provideWorkContextProvider));
    }

    private Stripe3ds2TransactionViewModelFactory injectStripe3ds2TransactionViewModelFactory(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
        Stripe3ds2TransactionViewModelFactory_MembersInjector.injectSubComponentBuilder(stripe3ds2TransactionViewModelFactory, new Stripe3ds2TransactionViewModelSubcomponentBuilder());
        return stripe3ds2TransactionViewModelFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
        return new PaymentAnalyticsRequestFactory(this.context, this.publishableKeyProvider, this.productUsage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StripeApiRepository stripeApiRepository() {
        return new StripeApiRepository(this.context, this.publishableKeyProvider, this.provideWorkContextProvider.mo0get(), this.productUsage, paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.mo0get());
    }

    @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelFactoryComponent
    public void inject(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
        injectStripe3ds2TransactionViewModelFactory(stripe3ds2TransactionViewModelFactory);
    }

    private DaggerStripe3ds2TransactionViewModelFactoryComponent(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Boolean bool, a<String> aVar, Set<String> set, Boolean bool2) {
        this.stripe3ds2TransactionViewModelFactoryComponent = this;
        this.context = context;
        this.publishableKeyProvider = aVar;
        this.productUsage = set;
        this.isInstantApp = bool2;
        initialize(coroutineContextModule, loggingModule, context, bool, aVar, set, bool2);
    }
}