package com.stripe.android.link.injection;

import android.content.Context;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.LoggingModule;
import com.stripe.android.core.injection.LoggingModule_ProvideLoggerFactory;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
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
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
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
import com.stripe.android.link.ui.inline.InlineSignupViewModel;
import com.stripe.android.link.ui.inline.InlineSignupViewModel_Factory_MembersInjector;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel_Factory_MembersInjector;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.link.ui.signup.SignUpViewModel_Factory_MembersInjector;
import com.stripe.android.link.ui.verification.VerificationViewModel;
import com.stripe.android.link.ui.verification.VerificationViewModel_Factory_MembersInjector;
import com.stripe.android.link.ui.wallet.WalletViewModel;
import com.stripe.android.link.ui.wallet.WalletViewModel_Factory_MembersInjector;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory_Impl;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher_Factory;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.forms.TransformSpecToElements;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
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
public final class DaggerLinkPaymentLauncherComponent extends LinkPaymentLauncherComponent {
    private Provider<PaymentAnalyticsRequestFactory> analyticsRequestFactoryProvider;
    private Provider<ConfirmationManager> confirmationManagerProvider;
    private final Context context;
    private Provider<Context> contextProvider;
    private Provider<CookieStore> cookieStoreProvider;
    private final String customerEmail;
    private Provider<Boolean> enableLoggingProvider;
    private Provider<EncryptedStore> encryptedStoreProvider;
    private Provider<FormControllerSubcomponent.Builder> formControllerSubcomponentBuilderProvider;
    private Provider<g> ioContextProvider;
    private Provider<LinkAccountManager> linkAccountManagerProvider;
    private Provider<LinkApiRepository> linkApiRepositoryProvider;
    private final DaggerLinkPaymentLauncherComponent linkPaymentLauncherComponent;
    private final String merchantName;
    private Provider<Navigator> navigatorProvider;
    private Provider<Set<String>> productUsageProvider;
    private Provider<Locale> provideLocaleProvider;
    private Provider<Logger> provideLoggerProvider;
    private Provider<a<String>> publishableKeyProvider;
    private final ResourceRepository resourceRepository;
    private Provider<SignUpViewModelSubcomponent.Builder> signUpViewModelSubcomponentBuilderProvider;
    private Provider<SignedInViewModelSubcomponent.Builder> signedInViewModelSubcomponentBuilderProvider;
    private final LinkActivityContract.Args starterArgs;
    private Provider<LinkActivityContract.Args> starterArgsProvider;
    private Provider<a<String>> stripeAccountIdProvider;
    private Provider<StripePaymentLauncherAssistedFactory> stripePaymentLauncherAssistedFactoryProvider;
    private StripePaymentLauncher_Factory stripePaymentLauncherProvider;
    private Provider<StripeRepository> stripeRepositoryProvider;
    private Provider<g> uiContextProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class Builder implements LinkPaymentLauncherComponent.Builder {
        private AnalyticsRequestExecutor analyticsRequestExecutor;
        private PaymentAnalyticsRequestFactory analyticsRequestFactory;
        private Context context;
        private String customerEmail;
        private Boolean enableLogging;
        private g ioContext;
        private String merchantName;
        private Set<String> productUsage;
        private a<String> publishableKeyProvider;
        private ResourceRepository resourceRepository;
        private LinkActivityContract.Args starterArgs;
        private a<String> stripeAccountIdProvider;
        private StripeRepository stripeRepository;
        private g uiContext;

        private Builder() {
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public LinkPaymentLauncherComponent build() {
            h.a(this.merchantName, String.class);
            h.a(this.context, Context.class);
            h.a(this.ioContext, g.class);
            h.a(this.uiContext, g.class);
            h.a(this.analyticsRequestFactory, PaymentAnalyticsRequestFactory.class);
            h.a(this.analyticsRequestExecutor, AnalyticsRequestExecutor.class);
            h.a(this.stripeRepository, StripeRepository.class);
            h.a(this.resourceRepository, ResourceRepository.class);
            h.a(this.enableLogging, Boolean.class);
            h.a(this.publishableKeyProvider, a.class);
            h.a(this.stripeAccountIdProvider, a.class);
            h.a(this.productUsage, Set.class);
            h.a(this.starterArgs, LinkActivityContract.Args.class);
            return new DaggerLinkPaymentLauncherComponent(new LoggingModule(), this.merchantName, this.customerEmail, this.context, this.ioContext, this.uiContext, this.analyticsRequestFactory, this.analyticsRequestExecutor, this.stripeRepository, this.resourceRepository, this.enableLogging, this.publishableKeyProvider, this.stripeAccountIdProvider, this.productUsage, this.starterArgs);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ LinkPaymentLauncherComponent.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ LinkPaymentLauncherComponent.Builder publishableKeyProvider(a aVar) {
            return publishableKeyProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public /* bridge */ /* synthetic */ LinkPaymentLauncherComponent.Builder stripeAccountIdProvider(a aVar) {
            return stripeAccountIdProvider((a<String>) aVar);
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder analyticsRequestExecutor(AnalyticsRequestExecutor analyticsRequestExecutor) {
            this.analyticsRequestExecutor = (AnalyticsRequestExecutor) h.b(analyticsRequestExecutor);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.analyticsRequestFactory = (PaymentAnalyticsRequestFactory) h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder context(Context context) {
            this.context = (Context) h.b(context);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder customerEmail(String str) {
            this.customerEmail = str;
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder enableLogging(boolean z11) {
            this.enableLogging = (Boolean) h.b(Boolean.valueOf(z11));
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder ioContext(g gVar) {
            this.ioContext = (g) h.b(gVar);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder merchantName(String str) {
            this.merchantName = (String) h.b(str);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) h.b(set);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder publishableKeyProvider(a<String> aVar) {
            this.publishableKeyProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder resourceRepository(ResourceRepository resourceRepository) {
            this.resourceRepository = (ResourceRepository) h.b(resourceRepository);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder starterArgs(LinkActivityContract.Args args) {
            this.starterArgs = (LinkActivityContract.Args) h.b(args);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder stripeAccountIdProvider(a<String> aVar) {
            this.stripeAccountIdProvider = (a) h.b(aVar);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder stripeRepository(StripeRepository stripeRepository) {
            this.stripeRepository = (StripeRepository) h.b(stripeRepository);
            return this;
        }

        @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent.Builder
        public Builder uiContext(g gVar) {
            this.uiContext = (g) h.b(gVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class FormControllerSubcomponentBuilder implements FormControllerSubcomponent.Builder {
        private LayoutSpec formSpec;
        private Map<IdentifierSpec, String> initialValues;
        private final DaggerLinkPaymentLauncherComponent linkPaymentLauncherComponent;
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

        private FormControllerSubcomponentBuilder(DaggerLinkPaymentLauncherComponent daggerLinkPaymentLauncherComponent) {
            this.linkPaymentLauncherComponent = daggerLinkPaymentLauncherComponent;
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
        private final DaggerLinkPaymentLauncherComponent linkPaymentLauncherComponent;
        private final o0 viewModelScope;
        private final Set<IdentifierSpec> viewOnlyFields;

        private TransformSpecToElements transformSpecToElements() {
            return FormControllerModule_Companion_ProvideTransformSpecToElementsFactory.provideTransformSpecToElements(this.linkPaymentLauncherComponent.resourceRepository, this.linkPaymentLauncherComponent.context, this.linkPaymentLauncherComponent.starterArgs, this.initialValues, this.viewOnlyFields);
        }

        @Override // com.stripe.android.link.injection.FormControllerSubcomponent
        public FormController getFormController() {
            return new FormController(this.formSpec, this.linkPaymentLauncherComponent.resourceRepository, transformSpecToElements(), this.viewModelScope);
        }

        private FormControllerSubcomponentImpl(DaggerLinkPaymentLauncherComponent daggerLinkPaymentLauncherComponent, LayoutSpec layoutSpec, Map<IdentifierSpec, String> map, Set<IdentifierSpec> set, o0 o0Var) {
            this.formControllerSubcomponentImpl = this;
            this.linkPaymentLauncherComponent = daggerLinkPaymentLauncherComponent;
            this.formSpec = layoutSpec;
            this.initialValues = map;
            this.viewOnlyFields = set;
            this.viewModelScope = o0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class SignUpViewModelSubcomponentBuilder implements SignUpViewModelSubcomponent.Builder {
        private final DaggerLinkPaymentLauncherComponent linkPaymentLauncherComponent;
        private String prefilledEmail;

        @Override // com.stripe.android.link.injection.SignUpViewModelSubcomponent.Builder
        public SignUpViewModelSubcomponent build() {
            return new SignUpViewModelSubcomponentImpl(this.prefilledEmail);
        }

        private SignUpViewModelSubcomponentBuilder(DaggerLinkPaymentLauncherComponent daggerLinkPaymentLauncherComponent) {
            this.linkPaymentLauncherComponent = daggerLinkPaymentLauncherComponent;
        }

        @Override // com.stripe.android.link.injection.SignUpViewModelSubcomponent.Builder
        public SignUpViewModelSubcomponentBuilder prefilledEmail(String str) {
            this.prefilledEmail = str;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    private static final class SignUpViewModelSubcomponentImpl implements SignUpViewModelSubcomponent {
        private final DaggerLinkPaymentLauncherComponent linkPaymentLauncherComponent;
        private final String prefilledEmail;
        private final SignUpViewModelSubcomponentImpl signUpViewModelSubcomponentImpl;

        @Override // com.stripe.android.link.injection.SignUpViewModelSubcomponent
        public SignUpViewModel getSignUpViewModel() {
            return new SignUpViewModel(this.linkPaymentLauncherComponent.starterArgs, this.prefilledEmail, (LinkAccountManager) this.linkPaymentLauncherComponent.linkAccountManagerProvider.mo0get(), (Navigator) this.linkPaymentLauncherComponent.navigatorProvider.mo0get(), (Logger) this.linkPaymentLauncherComponent.provideLoggerProvider.mo0get());
        }

        private SignUpViewModelSubcomponentImpl(DaggerLinkPaymentLauncherComponent daggerLinkPaymentLauncherComponent, String str) {
            this.signUpViewModelSubcomponentImpl = this;
            this.linkPaymentLauncherComponent = daggerLinkPaymentLauncherComponent;
            this.prefilledEmail = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class SignedInViewModelSubcomponentBuilder implements SignedInViewModelSubcomponent.Builder {
        private LinkAccount linkAccount;
        private final DaggerLinkPaymentLauncherComponent linkPaymentLauncherComponent;

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent.Builder
        public SignedInViewModelSubcomponent build() {
            h.a(this.linkAccount, LinkAccount.class);
            return new SignedInViewModelSubcomponentImpl(this.linkAccount);
        }

        private SignedInViewModelSubcomponentBuilder(DaggerLinkPaymentLauncherComponent daggerLinkPaymentLauncherComponent) {
            this.linkPaymentLauncherComponent = daggerLinkPaymentLauncherComponent;
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
        private final DaggerLinkPaymentLauncherComponent linkPaymentLauncherComponent;
        private final SignedInViewModelSubcomponentImpl signedInViewModelSubcomponentImpl;

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public CardEditViewModel getCardEditViewModel() {
            return new CardEditViewModel(this.linkAccount, (LinkRepository) this.linkPaymentLauncherComponent.linkApiRepositoryProvider.mo0get(), (Navigator) this.linkPaymentLauncherComponent.navigatorProvider.mo0get(), (Logger) this.linkPaymentLauncherComponent.provideLoggerProvider.mo0get(), this.linkPaymentLauncherComponent.formControllerSubcomponentBuilderProvider);
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public PaymentMethodViewModel getPaymentMethodViewModel() {
            return new PaymentMethodViewModel(this.linkPaymentLauncherComponent.starterArgs, this.linkAccount, (LinkRepository) this.linkPaymentLauncherComponent.linkApiRepositoryProvider.mo0get(), (LinkAccountManager) this.linkPaymentLauncherComponent.linkAccountManagerProvider.mo0get(), (Navigator) this.linkPaymentLauncherComponent.navigatorProvider.mo0get(), (ConfirmationManager) this.linkPaymentLauncherComponent.confirmationManagerProvider.mo0get(), (Logger) this.linkPaymentLauncherComponent.provideLoggerProvider.mo0get(), this.linkPaymentLauncherComponent.formControllerSubcomponentBuilderProvider);
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public VerificationViewModel getVerificationViewModel() {
            return new VerificationViewModel((LinkAccountManager) this.linkPaymentLauncherComponent.linkAccountManagerProvider.mo0get(), (Navigator) this.linkPaymentLauncherComponent.navigatorProvider.mo0get(), (Logger) this.linkPaymentLauncherComponent.provideLoggerProvider.mo0get(), this.linkAccount);
        }

        @Override // com.stripe.android.link.injection.SignedInViewModelSubcomponent
        public WalletViewModel getWalletViewModel() {
            return new WalletViewModel(this.linkPaymentLauncherComponent.starterArgs, this.linkAccount, (LinkRepository) this.linkPaymentLauncherComponent.linkApiRepositoryProvider.mo0get(), (LinkAccountManager) this.linkPaymentLauncherComponent.linkAccountManagerProvider.mo0get(), (Navigator) this.linkPaymentLauncherComponent.navigatorProvider.mo0get(), (ConfirmationManager) this.linkPaymentLauncherComponent.confirmationManagerProvider.mo0get(), (Logger) this.linkPaymentLauncherComponent.provideLoggerProvider.mo0get());
        }

        private SignedInViewModelSubcomponentImpl(DaggerLinkPaymentLauncherComponent daggerLinkPaymentLauncherComponent, LinkAccount linkAccount) {
            this.signedInViewModelSubcomponentImpl = this;
            this.linkPaymentLauncherComponent = daggerLinkPaymentLauncherComponent;
            this.linkAccount = linkAccount;
        }
    }

    public static LinkPaymentLauncherComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(LoggingModule loggingModule, String str, String str2, Context context, g gVar, g gVar2, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, ResourceRepository resourceRepository, Boolean bool, a<String> aVar, a<String> aVar2, Set<String> set, LinkActivityContract.Args args) {
        this.starterArgsProvider = f.a(args);
        this.publishableKeyProvider = f.a(aVar);
        this.stripeAccountIdProvider = f.a(aVar2);
        this.stripeRepositoryProvider = f.a(stripeRepository);
        e a11 = f.a(bool);
        this.enableLoggingProvider = a11;
        this.provideLoggerProvider = d.b(LoggingModule_ProvideLoggerFactory.create(loggingModule, a11));
        this.ioContextProvider = f.a(gVar);
        Provider<Locale> b11 = d.b(LinkPaymentLauncherModule_Companion_ProvideLocaleFactory.create());
        this.provideLocaleProvider = b11;
        this.linkApiRepositoryProvider = d.b(LinkApiRepository_Factory.create(this.publishableKeyProvider, this.stripeAccountIdProvider, this.stripeRepositoryProvider, this.provideLoggerProvider, this.ioContextProvider, b11));
        e a12 = f.a(context);
        this.contextProvider = a12;
        Provider<EncryptedStore> b12 = d.b(EncryptedStore_Factory.create(a12));
        this.encryptedStoreProvider = b12;
        Provider<CookieStore> b13 = d.b(CookieStore_Factory.create(b12));
        this.cookieStoreProvider = b13;
        this.linkAccountManagerProvider = d.b(LinkAccountManager_Factory.create(this.starterArgsProvider, this.linkApiRepositoryProvider, b13));
        this.navigatorProvider = d.b(Navigator_Factory.create());
        this.uiContextProvider = f.a(gVar2);
        this.analyticsRequestFactoryProvider = f.a(paymentAnalyticsRequestFactory);
        e a13 = f.a(set);
        this.productUsageProvider = a13;
        StripePaymentLauncher_Factory create = StripePaymentLauncher_Factory.create(this.contextProvider, this.enableLoggingProvider, this.ioContextProvider, this.uiContextProvider, this.stripeRepositoryProvider, this.analyticsRequestFactoryProvider, a13);
        this.stripePaymentLauncherProvider = create;
        Provider<StripePaymentLauncherAssistedFactory> create2 = StripePaymentLauncherAssistedFactory_Impl.create(create);
        this.stripePaymentLauncherAssistedFactoryProvider = create2;
        this.confirmationManagerProvider = d.b(ConfirmationManager_Factory.create(create2, this.publishableKeyProvider, this.stripeAccountIdProvider));
        this.signUpViewModelSubcomponentBuilderProvider = new Provider<SignUpViewModelSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkPaymentLauncherComponent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public SignUpViewModelSubcomponent.Builder mo0get() {
                return new SignUpViewModelSubcomponentBuilder();
            }
        };
        this.signedInViewModelSubcomponentBuilderProvider = new Provider<SignedInViewModelSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkPaymentLauncherComponent.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public SignedInViewModelSubcomponent.Builder mo0get() {
                return new SignedInViewModelSubcomponentBuilder();
            }
        };
        this.formControllerSubcomponentBuilderProvider = new Provider<FormControllerSubcomponent.Builder>() { // from class: com.stripe.android.link.injection.DaggerLinkPaymentLauncherComponent.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // javax.inject.Provider
            /* renamed from: get */
            public FormControllerSubcomponent.Builder mo0get() {
                return new FormControllerSubcomponentBuilder();
            }
        };
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

    private InlineSignupViewModel.Factory injectFactory5(InlineSignupViewModel.Factory factory) {
        InlineSignupViewModel_Factory_MembersInjector.injectViewModel(factory, inlineSignupViewModel());
        return factory;
    }

    private PaymentMethodViewModel.Factory injectFactory6(PaymentMethodViewModel.Factory factory) {
        PaymentMethodViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private CardEditViewModel.Factory injectFactory7(CardEditViewModel.Factory factory) {
        CardEditViewModel_Factory_MembersInjector.injectSubComponentBuilderProvider(factory, this.signedInViewModelSubcomponentBuilderProvider);
        return factory;
    }

    private InlineSignupViewModel inlineSignupViewModel() {
        return new InlineSignupViewModel(this.merchantName, this.customerEmail, this.linkAccountManagerProvider.mo0get(), this.provideLoggerProvider.mo0get());
    }

    private LinkActivityViewModel linkActivityViewModel() {
        return new LinkActivityViewModel(this.starterArgs, this.linkAccountManagerProvider.mo0get(), this.navigatorProvider.mo0get(), this.confirmationManagerProvider.mo0get());
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
    public LinkAccountManager getLinkAccountManager() {
        return this.linkAccountManagerProvider.mo0get();
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
    public void inject(LinkActivityViewModel.Factory factory) {
        injectFactory(factory);
    }

    private DaggerLinkPaymentLauncherComponent(LoggingModule loggingModule, String str, String str2, Context context, g gVar, g gVar2, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, ResourceRepository resourceRepository, Boolean bool, a<String> aVar, a<String> aVar2, Set<String> set, LinkActivityContract.Args args) {
        this.linkPaymentLauncherComponent = this;
        this.starterArgs = args;
        this.merchantName = str;
        this.customerEmail = str2;
        this.resourceRepository = resourceRepository;
        this.context = context;
        initialize(loggingModule, str, str2, context, gVar, gVar2, paymentAnalyticsRequestFactory, analyticsRequestExecutor, stripeRepository, resourceRepository, bool, aVar, aVar2, set, args);
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
    public void inject(SignUpViewModel.Factory factory) {
        injectFactory2(factory);
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
    public void inject(VerificationViewModel.Factory factory) {
        injectFactory3(factory);
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
    public void inject(WalletViewModel.Factory factory) {
        injectFactory4(factory);
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
    public void inject(InlineSignupViewModel.Factory factory) {
        injectFactory5(factory);
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
    public void inject(PaymentMethodViewModel.Factory factory) {
        injectFactory6(factory);
    }

    @Override // com.stripe.android.link.injection.LinkPaymentLauncherComponent
    public void inject(CardEditViewModel.Factory factory) {
        injectFactory7(factory);
    }
}