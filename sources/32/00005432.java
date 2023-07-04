package com.stripe.android.payments.core.injection;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.l0;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier_Factory;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry_Factory;
import com.stripe.android.payments.core.authentication.NoOpIntentAuthenticator;
import com.stripe.android.payments.core.authentication.NoOpIntentAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.OxxoAuthenticator;
import com.stripe.android.payments.core.authentication.OxxoAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.SourceAuthenticator;
import com.stripe.android.payments.core.authentication.SourceAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator;
import com.stripe.android.payments.core.authentication.UnsupportedAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.WebIntentAuthenticator;
import com.stripe.android.payments.core.authentication.WebIntentAuthenticator_Factory;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2Authenticator;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2Authenticator_Factory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory_MembersInjector;
import com.stripe.android.payments.core.injection.AuthenticationComponent;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.a;
import h00.l;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import tw.c;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerAuthenticationComponent implements AuthenticationComponent {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private Provider<AnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final PaymentAnalyticsRequestFactory analyticsRequestFactory;
    private Provider<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;
    private final DaggerAuthenticationComponent authenticationComponent;
    private Provider<Context> contextProvider;
    private Provider<DefaultPaymentAuthenticatorRegistry> defaultPaymentAuthenticatorRegistryProvider;
    private Provider<DefaultStripe3ds2ChallengeResultProcessor> defaultStripe3ds2ChallengeResultProcessorProvider;
    private Provider<Boolean> enableLoggingProvider;
    private Provider<String> injectorKeyProvider;
    private Provider<Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>>> intentAuthenticatorMapMapOfClassOfAndPaymentAuthenticatorOfStripeIntentProvider;
    private final Boolean isInstantApp;
    private Provider<Boolean> isInstantAppProvider;
    private Provider<NoOpIntentAuthenticator> noOpIntentAuthenticatorProvider;
    private Provider<OxxoAuthenticator> oxxoAuthenticatorProvider;
    private Provider<Set<String>> productUsageProvider;
    private Provider<DefaultReturnUrl> provideDefaultReturnUrlProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<MessageVersionRegistry> provideMessageVersionRegistryProvider;
    private Provider<PaymentAuthConfig> providePaymentAuthConfigProvider;
    private Provider<l<AuthActivityStarterHost, PaymentBrowserAuthStarter>> providePaymentBrowserAuthStarterFactoryProvider;
    private Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> providePaymentRelayStarterFactoryProvider;
    private Provider<StripeThreeDs2Service> provideStripeThreeDs2ServiceProvider;
    private Provider<PaymentAuthenticator<StripeIntent>> provideWeChatAuthenticator$payments_core_releaseProvider;
    private Provider<a<String>> publishableKeyProvider;
    private Provider<RetryDelaySupplier> retryDelaySupplierProvider;
    private Provider<SourceAuthenticator> sourceAuthenticatorProvider;
    private Provider<Stripe3DS2Authenticator> stripe3DS2AuthenticatorProvider;
    private final StripeRepository stripeRepository;
    private Provider<StripeRepository> stripeRepositoryProvider;
    private Provider<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private Provider<g> uiContextProvider;
    private Provider<UnsupportedAuthenticator> unsupportedAuthenticatorProvider;
    private Provider<WebIntentAuthenticator> webIntentAuthenticatorProvider;
    private final g workContext;
    private Provider<g> workContextProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements AuthenticationComponent.Builder {
        private AnalyticsRequestExecutor analyticsRequestExecutor;
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Context context;
        private Boolean enableLogging;
        private String injectorKey;
        private Boolean isInstantApp;
        private Set<String> productUsage;
        private a<String> publishableKeyProvider;
        private StripeRepository stripeRepository;
        private Map<String, String> threeDs1IntentReturnUrlMap;
        private g uiContext;
        private g workContext;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public AuthenticationComponent build() {
            h.a(this.context, Context.class);
            h.a(this.stripeRepository, StripeRepository.class);
            h.a(this.analyticsRequestExecutor, AnalyticsRequestExecutor.class);
            h.a(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            h.a(this.enableLogging, Boolean.class);
            h.a(this.workContext, g.class);
            h.a(this.uiContext, g.class);
            h.a(this.threeDs1IntentReturnUrlMap, Map.class);
            h.a(this.injectorKey, String.class);
            h.a(this.publishableKeyProvider, a.class);
            h.a(this.productUsage, Set.class);
            h.a(this.isInstantApp, Boolean.class);
            return new DaggerAuthenticationComponent(new WeChatPayAuthenticatorModule(), new LoggingModule(), this.context, this.stripeRepository, this.analyticsRequestExecutor, this.analyticsRequestFactory, this.enableLogging, this.workContext, this.uiContext, this.threeDs1IntentReturnUrlMap, this.injectorKey, this.publishableKeyProvider, this.productUsage, this.isInstantApp);
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public /* bridge */ /* synthetic */ AuthenticationComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public /* bridge */ /* synthetic */ AuthenticationComponent.Builder publishableKeyProvider(a aVar) {
            return publishableKeyProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public /* bridge */ /* synthetic */ AuthenticationComponent.Builder threeDs1IntentReturnUrlMap(Map map) {
            return threeDs1IntentReturnUrlMap((Map<String, String>) map);
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder analyticsRequestExecutor(AnalyticsRequestExecutor analyticsRequestExecutor) {
            this.analyticsRequestExecutor = (AnalyticsRequestExecutor) h.b(analyticsRequestExecutor);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder enableLogging(boolean z11) {
            this.enableLogging = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder injectorKey(String str) {
            this.injectorKey = (String) h.b(str);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder isInstantApp(boolean z11) {
            this.isInstantApp = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) h.b(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder publishableKeyProvider(a<String> aVar) {
            this.publishableKeyProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder stripeRepository(StripeRepository stripeRepository) {
            this.stripeRepository = (StripeRepository) h.b(stripeRepository);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder threeDs1IntentReturnUrlMap(Map<String, String> map) {
            this.threeDs1IntentReturnUrlMap = (Map) h.b(map);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder uiContext(g gVar) {
            this.uiContext = (g) h.b(gVar);
            return this;
        }

        @Override // com.stripe.android.payments.core.injection.AuthenticationComponent.Builder
        public Builder workContext(g gVar) {
            this.workContext = (g) h.b(gVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Stripe3ds2TransactionViewModelSubcomponentBuilder implements Stripe3ds2TransactionViewModelSubcomponent.Builder {
        private Application application;
        private Stripe3ds2TransactionContract.Args args;
        private final DaggerAuthenticationComponent authenticationComponent;
        private l0 savedStateHandle;

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder
        public Stripe3ds2TransactionViewModelSubcomponent build() {
            h.a(this.args, Stripe3ds2TransactionContract.Args.class);
            h.a(this.savedStateHandle, l0.class);
            h.a(this.application, Application.class);
            return new Stripe3ds2TransactionViewModelSubcomponentImpl(new Stripe3dsTransactionViewModelModule(), this.args, this.savedStateHandle, this.application);
        }

        private Stripe3ds2TransactionViewModelSubcomponentBuilder(DaggerAuthenticationComponent daggerAuthenticationComponent) {
            this.authenticationComponent = daggerAuthenticationComponent;
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
        private final DaggerAuthenticationComponent authenticationComponent;
        private final l0 savedStateHandle;
        private final Stripe3ds2TransactionViewModelSubcomponentImpl stripe3ds2TransactionViewModelSubcomponentImpl;
        private final Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule;

        private InitChallengeRepository initChallengeRepository() {
            return Stripe3dsTransactionViewModelModule_ProvidesInitChallengeRepositoryFactory.providesInitChallengeRepository(this.stripe3dsTransactionViewModelModule, this.application, this.args, this.authenticationComponent.workContext);
        }

        @Override // com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent
        public Stripe3ds2TransactionViewModel getViewModel() {
            return new Stripe3ds2TransactionViewModel(this.args, this.authenticationComponent.stripeRepository, this.authenticationComponent.analyticsRequestExecutor, this.authenticationComponent.analyticsRequestFactory, (StripeThreeDs2Service) this.authenticationComponent.provideStripeThreeDs2ServiceProvider.mo0get(), (MessageVersionRegistry) this.authenticationComponent.provideMessageVersionRegistryProvider.mo0get(), (Stripe3ds2ChallengeResultProcessor) this.authenticationComponent.defaultStripe3ds2ChallengeResultProcessorProvider.mo0get(), initChallengeRepository(), this.authenticationComponent.workContext, this.savedStateHandle, this.authenticationComponent.isInstantApp.booleanValue());
        }

        private Stripe3ds2TransactionViewModelSubcomponentImpl(DaggerAuthenticationComponent daggerAuthenticationComponent, Stripe3dsTransactionViewModelModule stripe3dsTransactionViewModelModule, Stripe3ds2TransactionContract.Args args, l0 l0Var, Application application) {
            this.stripe3ds2TransactionViewModelSubcomponentImpl = this;
            this.authenticationComponent = daggerAuthenticationComponent;
            this.args = args;
            this.stripe3dsTransactionViewModelModule = stripe3dsTransactionViewModelModule;
            this.application = application;
            this.savedStateHandle = l0Var;
        }
    }

    public static AuthenticationComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, LoggingModule loggingModule, Context context, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, g gVar, g gVar2, Map<String, String> map, String str, a<String> aVar, Set<String> set, Boolean bool2) {
        c cVar = new c();
        this.defaultPaymentAuthenticatorRegistryProvider = cVar;
        Provider<l<AuthActivityStarterHost, PaymentRelayStarter>> b11 = d.b(AuthenticationModule_Companion_ProvidePaymentRelayStarterFactoryFactory.create(cVar));
        this.providePaymentRelayStarterFactoryProvider = b11;
        this.noOpIntentAuthenticatorProvider = d.b(NoOpIntentAuthenticator_Factory.create(b11));
        e a11 = f.a(context);
        this.contextProvider = a11;
        Provider<DefaultReturnUrl> b12 = d.b(AuthenticationModule_Companion_ProvideDefaultReturnUrlFactory.create(a11));
        this.provideDefaultReturnUrlProvider = b12;
        this.providePaymentBrowserAuthStarterFactoryProvider = d.b(AuthenticationModule_Companion_ProvidePaymentBrowserAuthStarterFactoryFactory.create(this.defaultPaymentAuthenticatorRegistryProvider, b12));
        this.analyticsRequestExecutorProvider = f.a(analyticsRequestExecutor);
        this.analyticsRequestFactoryProvider = f.a(paymentAnalyticsRequestFactory);
        this.enableLoggingProvider = f.a(bool);
        this.uiContextProvider = f.a(gVar2);
        this.publishableKeyProvider = f.a(aVar);
        e a12 = f.a(bool2);
        this.isInstantAppProvider = a12;
        this.sourceAuthenticatorProvider = d.b(SourceAuthenticator_Factory.create(this.providePaymentBrowserAuthStarterFactoryProvider, this.providePaymentRelayStarterFactoryProvider, this.analyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.enableLoggingProvider, this.uiContextProvider, this.publishableKeyProvider, a12));
        Provider<UnsupportedAuthenticator> b13 = d.b(UnsupportedAuthenticator_Factory.create(this.providePaymentRelayStarterFactoryProvider));
        this.unsupportedAuthenticatorProvider = b13;
        this.provideWeChatAuthenticator$payments_core_releaseProvider = WeChatPayAuthenticatorModule_ProvideWeChatAuthenticator$payments_core_releaseFactory.create(weChatPayAuthenticatorModule, b13);
        e a13 = f.a(map);
        this.threeDs1IntentReturnUrlMapProvider = a13;
        Provider<WebIntentAuthenticator> b14 = d.b(WebIntentAuthenticator_Factory.create(this.providePaymentBrowserAuthStarterFactoryProvider, this.analyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.enableLoggingProvider, this.uiContextProvider, a13, this.publishableKeyProvider, this.isInstantAppProvider));
        this.webIntentAuthenticatorProvider = b14;
        this.oxxoAuthenticatorProvider = d.b(OxxoAuthenticator_Factory.create(b14, this.noOpIntentAuthenticatorProvider));
        this.providePaymentAuthConfigProvider = d.b(Stripe3DSAuthenticatorModule_Companion_ProvidePaymentAuthConfigFactory.create());
        this.injectorKeyProvider = f.a(str);
        e a14 = f.a(set);
        this.productUsageProvider = a14;
        this.stripe3DS2AuthenticatorProvider = d.b(Stripe3DS2Authenticator_Factory.create(this.providePaymentAuthConfigProvider, this.enableLoggingProvider, this.injectorKeyProvider, this.publishableKeyProvider, a14));
        tw.g b15 = tw.g.b(6).c(StripeIntent.NextActionData.WeChatPayRedirect.class, this.provideWeChatAuthenticator$payments_core_releaseProvider).c(StripeIntent.NextActionData.SdkData.Use3DS1.class, this.webIntentAuthenticatorProvider).c(StripeIntent.NextActionData.RedirectToUrl.class, this.webIntentAuthenticatorProvider).c(StripeIntent.NextActionData.AlipayRedirect.class, this.webIntentAuthenticatorProvider).c(StripeIntent.NextActionData.DisplayOxxoDetails.class, this.oxxoAuthenticatorProvider).c(StripeIntent.NextActionData.SdkData.Use3DS2.class, this.stripe3DS2AuthenticatorProvider).b();
        this.intentAuthenticatorMapMapOfClassOfAndPaymentAuthenticatorOfStripeIntentProvider = b15;
        c.a(this.defaultPaymentAuthenticatorRegistryProvider, d.b(DefaultPaymentAuthenticatorRegistry_Factory.create(this.noOpIntentAuthenticatorProvider, this.sourceAuthenticatorProvider, b15)));
        e a15 = f.a(gVar);
        this.workContextProvider = a15;
        this.provideStripeThreeDs2ServiceProvider = d.b(Stripe3ds2TransactionModule_Companion_ProvideStripeThreeDs2ServiceFactory.create(this.contextProvider, this.enableLoggingProvider, a15));
        this.provideMessageVersionRegistryProvider = d.b(Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory.create());
        this.stripeRepositoryProvider = f.a(stripeRepository);
        this.retryDelaySupplierProvider = d.b(RetryDelaySupplier_Factory.create());
        Provider<Logger> b16 = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, this.enableLoggingProvider));
        this.provideLoggerProvider = b16;
        this.defaultStripe3ds2ChallengeResultProcessorProvider = d.b(DefaultStripe3ds2ChallengeResultProcessor_Factory.create(this.stripeRepositoryProvider, this.analyticsRequestExecutorProvider, this.analyticsRequestFactoryProvider, this.retryDelaySupplierProvider, b16, this.workContextProvider));
    }

    private Stripe3ds2TransactionViewModelFactory injectStripe3ds2TransactionViewModelFactory(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
        Stripe3ds2TransactionViewModelFactory_MembersInjector.injectSubComponentBuilder(stripe3ds2TransactionViewModelFactory, new Stripe3ds2TransactionViewModelSubcomponentBuilder());
        return stripe3ds2TransactionViewModelFactory;
    }

    @Override // com.stripe.android.payments.core.injection.AuthenticationComponent
    public DefaultPaymentAuthenticatorRegistry getRegistry() {
        return this.defaultPaymentAuthenticatorRegistryProvider.mo0get();
    }

    @Override // com.stripe.android.payments.core.injection.AuthenticationComponent
    public void inject(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
        injectStripe3ds2TransactionViewModelFactory(stripe3ds2TransactionViewModelFactory);
    }

    private DaggerAuthenticationComponent(WeChatPayAuthenticatorModule weChatPayAuthenticatorModule, LoggingModule loggingModule, Context context, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, g gVar, g gVar2, Map<String, String> map, String str, a<String> aVar, Set<String> set, Boolean bool2) {
        this.authenticationComponent = this;
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.workContext = gVar;
        this.isInstantApp = bool2;
        initialize(weChatPayAuthenticatorModule, loggingModule, context, stripeRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, bool, gVar, gVar2, map, str, aVar, set, bool2);
    }
}