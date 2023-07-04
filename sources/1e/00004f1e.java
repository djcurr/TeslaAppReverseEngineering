package com.stripe.android.link.injection;

import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideUIContextFactory;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor_Factory;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkActivityViewModel_Factory_MembersInjector;
import com.stripe.android.link.account.CookieStore;
import com.stripe.android.link.account.CookieStore_Factory;
import com.stripe.android.link.account.EncryptedStore;
import com.stripe.android.link.account.EncryptedStore_Factory;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAccountManager_Factory;
import com.stripe.android.link.confirmation.ConfirmationManager;
import com.stripe.android.link.confirmation.ConfirmationManager_Factory;
import com.stripe.android.link.injection.FormControllerSubcomponent;
import com.stripe.android.link.injection.LinkViewModelFactoryComponent;
import com.stripe.android.link.injection.SignUpViewModelSubcomponent;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.model.Navigator_Factory;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkApiRepository_Factory;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.link.ui.cardedit.CardEditViewModel_Factory_MembersInjector;
import com.stripe.android.link.ui.forms.FormController;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel_Factory_MembersInjector;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.link.ui.signup.SignUpViewModel_Factory_MembersInjector;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.ui.verification.VerificationViewModel_Factory_MembersInjector;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import com.stripe.android.link.ui.wallet.WalletViewModel_Factory_MembersInjector;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.forms.TransformSpecToElements;
import com.stripe.android.ui.core.forms.resources.AsyncResourceRepository;
import com.stripe.android.ui.core.forms.resources.AsyncResourceRepository_Factory;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import com.stripe.android.ui.core.forms.resources.injection.ResourceRepositoryModule_Companion_ProvideResourcesFactory;
import h00.a;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import tw.d;
import tw.e;
import tw.f;
import tw.h;
import v20.o0;
import zz.g;

/* loaded from: classes6.dex */
public final class DaggerLinkViewModelFactoryComponent implements LinkViewModelFactoryComponent {
    private Provider<AsyncResourceRepository> asyncResourceRepositoryProvider;
    private Provider<ConfirmationManager> confirmationManagerProvider;
    private final Context context;
    private Provider<Context> contextProvider;
    private Provider<CookieStore> cookieStoreProvider;
    private Provider<DefaultAnalyticsRequestExecutor> defaultAnalyticsRequestExecutorProvider;
    private Provider<Boolean> enableLoggingProvider;
    private Provider<EncryptedStore> encryptedStoreProvider;
    private Provider<FormControllerSubcomponent.Builder> formControllerSubcomponentBuilderProvider;
    private Provider<LinkAccountManager> linkAccountManagerProvider;
    private Provider<LinkApiRepository> linkApiRepositoryProvider;
    private final DaggerLinkViewModelFactoryComponent linkViewModelFactoryComponent;
    private Provider<Navigator> navigatorProvider;
    private Provider<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private Provider<Set<String>> productUsageProvider;
    private Provider<Locale> provideLocaleProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<Resources> provideResourcesProvider;
    private Provider<g> provideUIContextProvider;
    private Provider<g> provideWorkContextProvider;
    private Provider<a<String>> publishableKeyProvider;
    private Provider<SignUpViewModelSubcomponent.Builder> signUpViewModelSubcomponentBuilderProvider;
    private Provider<SignedInViewModelSubcomponent.Builder> signedInViewModelSubcomponentBuilderProvider;
    private final LinkActivityContract.Args starterArgs;
    private Provider<LinkActivityContract.Args> starterArgsProvider;
    private Provider<a<String>> stripeAccountIdProvider;
    private Provider<StripeApiRepository> stripeApiRepositoryProvider;
    private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
    private StripePaymentLauncher_Factory stripePaymentLauncherProvider;

    /* loaded from: classes6.dex */
    private static final class Builder implements LinkViewModelFactoryComponent.Builder {
        private Context context;
        private Boolean enableLogging;
        private Set<String> productUsage;
        private a<String> publishableKeyProvider;
        private LinkActivityContract.Args starterArgs;
        private a<String> stripeAccountIdProvider;

        private Builder() {
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public LinkViewModelFactoryComponent build() {
            h.a(this.context, Context.class);
            h.a(this.enableLogging, Boolean.class);
            h.a(this.publishableKeyProvider, a.class);
            h.a(this.stripeAccountIdProvider, a.class);
            h.a(this.productUsage, Set.class);
            h.a(this.starterArgs, LinkActivityContract.Args.class);
            return new DaggerLinkViewModelFactoryComponent(new CoroutineContextModule(), new LoggingModule(), this.context, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage, this.starterArgs);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ LinkViewModelFactoryComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ LinkViewModelFactoryComponent.Builder publishableKeyProvider(a aVar) {
            return publishableKeyProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public /* bridge */ /* synthetic */ LinkViewModelFactoryComponent.Builder stripeAccountIdProvider(a aVar) {
            return stripeAccountIdProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder enableLogging(boolean z11) {
            this.enableLogging = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) h.b(set);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder publishableKeyProvider(a<String> aVar) {
            this.publishableKeyProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder starterArgs(LinkActivityContract.Args args) {
            this.starterArgs = (LinkActivityContract.Args) h.b(args);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent.Builder
        public Builder stripeAccountIdProvider(a<String> aVar) {
            this.stripeAccountIdProvider = (a) h.b(aVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class FormControllerSubcomponentBuilder implements FormControllerSubcomponent.Builder {
        private LayoutSpec formSpec;
        private Map<IdentifierSpec, String> initialValues;
        private final DaggerLinkViewModelFactoryComponent linkViewModelFactoryComponent;
        private o0 viewModelScope;
        private Set<IdentifierSpec> viewOnlyFields;

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponent build() {
            h.a(this.formSpec, LayoutSpec.class);
            h.a(this.initialValues, Map.class);
            h.a(this.viewOnlyFields, Set.class);
            h.a(this.viewModelScope, o0.class);
            return new FormControllerSubcomponentImpl(this.formSpec, this.initialValues, this.viewOnlyFields, this.viewModelScope);
        }

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent.Builder
        public /* bridge */ /* synthetic */ FormControllerSubcomponent.Builder initialValues(Map map) {
            return initialValues((Map<IdentifierSpec, String>) map);
        }

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent.Builder
        public /* bridge */ /* synthetic */ FormControllerSubcomponent.Builder viewOnlyFields(Set set) {
            return viewOnlyFields((Set<IdentifierSpec>) set);
        }

        private FormControllerSubcomponentBuilder(DaggerLinkViewModelFactoryComponent daggerLinkViewModelFactoryComponent) {
            this.linkViewModelFactoryComponent = daggerLinkViewModelFactoryComponent;
        }

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder formSpec(LayoutSpec layoutSpec) {
            this.formSpec = (LayoutSpec) h.b(layoutSpec);
            return this;
        }

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder initialValues(Map<IdentifierSpec, String> map) {
            this.initialValues = (Map) h.b(map);
            return this;
        }

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder viewModelScope(o0 o0Var) {
            this.viewModelScope = (o0) h.b(o0Var);
            return this;
        }

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent.Builder
        public FormControllerSubcomponentBuilder viewOnlyFields(Set<IdentifierSpec> set) {
            this.viewOnlyFields = (Set) h.b(set);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class FormControllerSubcomponentImpl implements FormControllerSubcomponent {
        private final FormControllerSubcomponentImpl formControllerSubcomponentImpl;
        private final LayoutSpec formSpec;
        private final Map<IdentifierSpec, String> initialValues;
        private final DaggerLinkViewModelFactoryComponent linkViewModelFactoryComponent;
        private final o0 viewModelScope;
        private final Set<IdentifierSpec> viewOnlyFields;

        private TransformSpecToElements transformSpecToElements() {
            return FormControllerModule_Companion_ProvideTransformSpecToElementsFactory.provideTransformSpecToElements((ResourceRepository) this.linkViewModelFactoryComponent.asyncResourceRepositoryProvider.mo0get(), this.linkViewModelFactoryComponent.context, this.linkViewModelFactoryComponent.starterArgs, this.initialValues, this.viewOnlyFields);
        }

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent
        public FormController getFormController() {
            return new FormController(this.formSpec, (ResourceRepository) this.linkViewModelFactoryComponent.asyncResourceRepositoryProvider.mo0get(), transformSpecToElements(), this.viewModelScope);
        }

        private FormControllerSubcomponentImpl(DaggerLinkViewModelFactoryComponent daggerLinkViewModelFactoryComponent, LayoutSpec layoutSpec, Map<IdentifierSpec, String> map, Set<IdentifierSpec> set, o0 o0Var) {
            this.formControllerSubcomponentImpl = this;
            this.linkViewModelFactoryComponent = daggerLinkViewModelFactoryComponent;
            this.formSpec = layoutSpec;
            this.initialValues = map;
            this.viewOnlyFields = set;
            this.viewModelScope = o0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class SignUpViewModelSubcomponentBuilder implements SignUpViewModelSubcomponent.Builder {
        private final DaggerLinkViewModelFactoryComponent linkViewModelFactoryComponent;
        private String prefilledEmail;

        @Override // com.stripe.android.link.injection.SignUpViewModelSubcomponent.Builder
        public SignUpViewModelSubcomponent build() {
            return new SignUpViewModelSubcomponentImpl(this.prefilledEmail);
        }

        private SignUpViewModelSubcomponentBuilder(DaggerLinkViewModelFactoryComponent daggerLinkViewModelFactoryComponent) {
            this.linkViewModelFactoryComponent = daggerLinkViewModelFactoryComponent;
        }

        @Override // com.stripe.android.link.injection.SignUpViewModelSubcomponent.Builder
        public SignUpViewModelSubcomponentBuilder prefilledEmail(String str) {
            this.prefilledEmail = str;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class SignUpViewModelSubcomponentImpl implements SignUpViewModelSubcomponent {
        private final DaggerLinkViewModelFactoryComponent linkViewModelFactoryComponent;
        private final String prefilledEmail;
        private final SignUpViewModelSubcomponentImpl signUpViewModelSubcomponentImpl;

        @Override // com.stripe.android.link.injection.SignUpViewModelSubcomponent
        public SignUpViewModel getSignUpViewModel() {
            return new SignUpViewModel(this.linkViewModelFactoryComponent.starterArgs, this.prefilledEmail, (LinkAccountManager) this.linkViewModelFactoryComponent.linkAccountManagerProvider.mo0get(), (Navigator) this.linkViewModelFactoryComponent.navigatorProvider.mo0get(), (Logger) this.linkViewModelFactoryComponent.provideLoggerProvider.mo0get());
        }

        private SignUpViewModelSubcomponentImpl(DaggerLinkViewModelFactoryComponent daggerLinkViewModelFactoryComponent, String str) {
            this.signUpViewModelSubcomponentImpl = this;
            this.linkViewModelFactoryComponent = daggerLinkViewModelFactoryComponent;
            this.prefilledEmail = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class SignedInViewModelSubcomponentBuilder implements SignedInViewModelSubcomponent.Builder {
        private LinkAccount linkAccount;
        private final DaggerLinkViewModelFactoryComponent linkViewModelFactoryComponent;

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent.Builder
        public SignedInViewModelSubcomponent build() {
            h.a(this.linkAccount, LinkAccount.class);
            return new SignedInViewModelSubcomponentImpl(this.linkAccount);
        }

        private SignedInViewModelSubcomponentBuilder(DaggerLinkViewModelFactoryComponent daggerLinkViewModelFactoryComponent) {
            this.linkViewModelFactoryComponent = daggerLinkViewModelFactoryComponent;
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent.Builder
        public SignedInViewModelSubcomponentBuilder linkAccount(LinkAccount linkAccount) {
            this.linkAccount = (LinkAccount) h.b(linkAccount);
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class SignedInViewModelSubcomponentImpl implements SignedInViewModelSubcomponent {
        private final LinkAccount linkAccount;
        private final DaggerLinkViewModelFactoryComponent linkViewModelFactoryComponent;
        private final SignedInViewModelSubcomponentImpl signedInViewModelSubcomponentImpl;

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public CardEditViewModel getCardEditViewModel() {
            return new CardEditViewModel(this.linkAccount, (LinkRepository) this.linkViewModelFactoryComponent.linkApiRepositoryProvider.mo0get(), (Navigator) this.linkViewModelFactoryComponent.navigatorProvider.mo0get(), (Logger) this.linkViewModelFactoryComponent.provideLoggerProvider.mo0get(), this.linkViewModelFactoryComponent.formControllerSubcomponentBuilderProvider);
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public PaymentMethodViewModel getPaymentMethodViewModel() {
            return new PaymentMethodViewModel(this.linkViewModelFactoryComponent.starterArgs, this.linkAccount, (LinkRepository) this.linkViewModelFactoryComponent.linkApiRepositoryProvider.mo0get(), (LinkAccountManager) this.linkViewModelFactoryComponent.linkAccountManagerProvider.mo0get(), (Navigator) this.linkViewModelFactoryComponent.navigatorProvider.mo0get(), (ConfirmationManager) this.linkViewModelFactoryComponent.confirmationManagerProvider.mo0get(), (Logger) this.linkViewModelFactoryComponent.provideLoggerProvider.mo0get(), this.linkViewModelFactoryComponent.formControllerSubcomponentBuilderProvider);
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public VerificationViewModel getVerificationViewModel() {
            return new VerificationViewModel((LinkAccountManager) this.linkViewModelFactoryComponent.linkAccountManagerProvider.mo0get(), (Navigator) this.linkViewModelFactoryComponent.navigatorProvider.mo0get(), (Logger) this.linkViewModelFactoryComponent.provideLoggerProvider.mo0get(), this.linkAccount);
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public WalletViewModel getWalletViewModel() {
            return new WalletViewModel(this.linkViewModelFactoryComponent.starterArgs, this.linkAccount, (LinkRepository) this.linkViewModelFactoryComponent.linkApiRepositoryProvider.mo0get(), (LinkAccountManager) this.linkViewModelFactoryComponent.linkAccountManagerProvider.mo0get(), (Navigator) this.linkViewModelFactoryComponent.navigatorProvider.mo0get(), (ConfirmationManager) this.linkViewModelFactoryComponent.confirmationManagerProvider.mo0get(), (Logger) this.linkViewModelFactoryComponent.provideLoggerProvider.mo0get());
        }

        private SignedInViewModelSubcomponentImpl(DaggerLinkViewModelFactoryComponent daggerLinkViewModelFactoryComponent, LinkAccount linkAccount) {
            this.signedInViewModelSubcomponentImpl = this;
            this.linkViewModelFactoryComponent = daggerLinkViewModelFactoryComponent;
            this.linkAccount = linkAccount;
        }
    }

    public static LinkViewModelFactoryComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Boolean bool, a<String> aVar, a<String> aVar2, Set<String> set, LinkActivityContract.Args args) {
        this.starterArgsProvider = f.a(args);
        this.publishableKeyProvider = f.a(aVar);
        this.stripeAccountIdProvider = f.a(aVar2);
        this.contextProvider = f.a(context);
        this.provideWorkContextProvider = d.b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
        e a11 = f.a(set);
        this.productUsageProvider = a11;
        this.paymentAnalyticsRequestFactoryProvider = PaymentAnalyticsRequestFactory_Factory.create(this.contextProvider, this.publishableKeyProvider, a11);
        e a12 = f.a(bool);
        this.enableLoggingProvider = a12;
        Provider<Logger> b11 = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, a12));
        this.provideLoggerProvider = b11;
        DefaultAnalyticsRequestExecutor_Factory create = DefaultAnalyticsRequestExecutor_Factory.create(b11, this.provideWorkContextProvider);
        this.defaultAnalyticsRequestExecutorProvider = create;
        this.stripeApiRepositoryProvider = StripeApiRepository_Factory.create(this.contextProvider, this.publishableKeyProvider, this.provideWorkContextProvider, this.productUsageProvider, this.paymentAnalyticsRequestFactoryProvider, create, this.provideLoggerProvider);
        Provider<Locale> b12 = d.b(LinkPaymentLauncherModule_Companion_ProvideLocaleFactory.create());
        this.provideLocaleProvider = b12;
        this.linkApiRepositoryProvider = d.b(LinkApiRepository_Factory.create(this.publishableKeyProvider, this.stripeAccountIdProvider, this.stripeApiRepositoryProvider, this.provideLoggerProvider, this.provideWorkContextProvider, b12));
        Provider<EncryptedStore> b13 = d.b(EncryptedStore_Factory.create(this.contextProvider));
        this.encryptedStoreProvider = b13;
        Provider<CookieStore> b14 = d.b(CookieStore_Factory.create(b13));
        this.cookieStoreProvider = b14;
        this.linkAccountManagerProvider = d.b(LinkAccountManager_Factory.create(this.starterArgsProvider, this.linkApiRepositoryProvider, b14));
        this.navigatorProvider = d.b(Navigator_Factory.create());
        Provider<g> b15 = d.b(CoroutineContextModule_ProvideUIContextFactory.create(coroutineContextModule));
        this.provideUIContextProvider = b15;
        StripePaymentLauncher_Factory create2 = StripePaymentLauncher_Factory.create(this.contextProvider, this.enableLoggingProvider, this.provideWorkContextProvider, b15, this.stripeApiRepositoryProvider, this.paymentAnalyticsRequestFactoryProvider, this.productUsageProvider);
        this.stripePaymentLauncherProvider = create2;
        Provider<StripePaymentLauncherAssistedFactory> create3 = StripePaymentLauncherAssistedFactory_Impl.create(create2);
        this.stripePaymentLauncherAssistedFactoryProvider = create3;
        this.confirmationManagerProvider = d.b(ConfirmationManager_Factory.create(create3, this.publishableKeyProvider, this.stripeAccountIdProvider));
        this.signUpViewModelSubcomponentBuilderProvider = new Provider<SignUpViewModelSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkViewModelFactoryComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public SignUpViewModelSubcomponent.Builder mo0get() {
                return new SignUpViewModelSubcomponentBuilder();
            }
        };
        this.signedInViewModelSubcomponentBuilderProvider = new Provider<SignedInViewModelSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkViewModelFactoryComponent.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public SignedInViewModelSubcomponent.Builder mo0get() {
                return new SignedInViewModelSubcomponentBuilder();
            }
        };
        this.formControllerSubcomponentBuilderProvider = new Provider<FormControllerSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkViewModelFactoryComponent.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public FormControllerSubcomponent.Builder mo0get() {
                return new FormControllerSubcomponentBuilder();
            }
        };
        Provider<Resources> b16 = d.b(ResourceRepositoryModule_Companion_ProvideResourcesFactory.create(this.contextProvider));
        this.provideResourcesProvider = b16;
        this.asyncResourceRepositoryProvider = d.b(AsyncResourceRepository_Factory.create(b16, this.provideWorkContextProvider, this.provideLocaleProvider));
    }

    private LinkActivityViewModel.Factory injectFactory(LinkActivityViewModel.Factory factory) {
        LinkActivityViewModel_Factory_MembersInjector.injectViewModel(factory, linkActivityViewModel());
        return factory;
    }

    private SignUpViewModel.Factory injectFactory2(SignUpViewModel.Factory factory) {
        SignUpViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signUpViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private VerificationViewModel.Factory injectFactory3(VerificationViewModel.Factory factory) {
        VerificationViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private WalletViewModel.Factory injectFactory4(WalletViewModel.Factory factory) {
        WalletViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private PaymentMethodViewModel.Factory injectFactory5(PaymentMethodViewModel.Factory factory) {
        PaymentMethodViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private CardEditViewModel.Factory injectFactory6(CardEditViewModel.Factory factory) {
        CardEditViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private LinkActivityViewModel linkActivityViewModel() {
        return new LinkActivityViewModel(this.starterArgs, this.linkAccountManagerProvider.mo0get(), this.navigatorProvider.mo0get(), this.confirmationManagerProvider.mo0get());
    }

    @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
    public void inject(LinkActivityViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerLinkViewModelFactoryComponent(CoroutineContextModule coroutineContextModule, LoggingModule loggingModule, Context context, Boolean bool, a<String> aVar, a<String> aVar2, Set<String> set, LinkActivityContract.Args args) {
        this.linkViewModelFactoryComponent = this;
        this.starterArgs = args;
        this.context = context;
        initialize(coroutineContextModule, loggingModule, context, bool, aVar, aVar2, set, args);
    }

    @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
    public void inject(SignUpViewModel.Factory factory) {
        injectFactory2(factory);
    }

    @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
    public void inject(VerificationViewModel.Factory factory) {
        injectFactory3(factory);
    }

    @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
    public void inject(WalletViewModel.Factory factory) {
        injectFactory4(factory);
    }

    @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
    public void inject(PaymentMethodViewModel.Factory factory) {
        injectFactory5(factory);
    }

    @Override // com.stripe.android.link.injection.LinkViewModelFactoryComponent
    public void inject(CardEditViewModel.Factory factory) {
        injectFactory6(factory);
    }
}