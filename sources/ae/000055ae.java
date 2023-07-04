package com.stripe.android.paymentsheet;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectableKtxKt;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.injection.LinkPaymentLauncherFactory;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelModule;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.ACHText;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.util.List;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class PaymentSheetViewModel extends BaseSheetViewModel<TransitionTarget> {
    private final f0<PaymentSheetResult> _paymentSheetResult;
    private final f0<BaseSheetViewModel.Event<ConfirmStripeIntentParams>> _startConfirm;
    private final f0<PaymentSheetViewState> _viewState;
    private final PaymentSheetContract.Args args;
    private CheckoutIdentifier checkoutIdentifier;
    private final ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> confirmParamsFactory;
    private final GooglePayPaymentMethodLauncher.Config googlePayLauncherConfig;
    private GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher;
    private final GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory;
    private PaymentSelection lastSelectedPaymentMethod;
    private final sw.a<PaymentConfiguration> lazyPaymentConfig;
    private PaymentSelection.New newLpm;
    private PaymentLauncher paymentLauncher;
    private final StripePaymentLauncherAssistedFactory paymentLauncherFactory;
    private final LiveData<PaymentSheetResult> paymentSheetResult;
    private final androidx.lifecycle.d0<Boolean> showTopContainer;
    private final LiveData<BaseSheetViewModel.Event<ConfirmStripeIntentParams>> startConfirm;
    private final StripeIntentRepository stripeIntentRepository;
    private final StripeIntentValidator stripeIntentValidator;
    private final LiveData<PaymentSheetViewState> viewState;

    /* loaded from: classes6.dex */
    public enum CheckoutIdentifier {
        SheetTopGooglePay,
        SheetBottomBuy,
        None
    }

    /* loaded from: classes6.dex */
    public static final class Factory extends androidx.lifecycle.a implements Injectable<FallbackInitializeParam> {
        private final h00.a<Application> applicationSupplier;
        private final h00.a<PaymentSheetContract.Args> starterArgsSupplier;
        public Provider<PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider;

        /* loaded from: classes6.dex */
        public static final class FallbackInitializeParam {
            private final Application application;

            public FallbackInitializeParam(Application application) {
                kotlin.jvm.internal.s.g(application, "application");
                this.application = application;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                return fallbackInitializeParam.copy(application);
            }

            public final Application component1() {
                return this.application;
            }

            public final FallbackInitializeParam copy(Application application) {
                kotlin.jvm.internal.s.g(application, "application");
                return new FallbackInitializeParam(application);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FallbackInitializeParam) && kotlin.jvm.internal.s.c(this.application, ((FallbackInitializeParam) obj).application);
            }

            public final Application getApplication() {
                return this.application;
            }

            public int hashCode() {
                return this.application.hashCode();
            }

            public String toString() {
                return "FallbackInitializeParam(application=" + this.application + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ Factory(h00.a aVar, h00.a aVar2, androidx.savedstate.c cVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, aVar2, cVar, (i11 & 8) != 0 ? null : bundle);
        }

        @Override // androidx.lifecycle.a
        protected <T extends p0> T create(String key, Class<T> modelClass, l0 savedStateHandle) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            kotlin.jvm.internal.s.g(savedStateHandle, "savedStateHandle");
            PaymentSheetContract.Args invoke = this.starterArgsSupplier.invoke();
            InjectableKtxKt.injectWithFallback(this, invoke.getInjectorKey$paymentsheet_release(), new FallbackInitializeParam(this.applicationSupplier.invoke()));
            return getSubComponentBuilderProvider().get().paymentSheetViewModelModule(new PaymentSheetViewModelModule(invoke)).savedStateHandle(savedStateHandle).build().getViewModel();
        }

        public final Provider<PaymentSheetViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<PaymentSheetViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            kotlin.jvm.internal.s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Provider<PaymentSheetViewModelSubcomponent.Builder> provider) {
            kotlin.jvm.internal.s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Factory(h00.a<? extends Application> applicationSupplier, h00.a<PaymentSheetContract.Args> starterArgsSupplier, androidx.savedstate.c owner, Bundle bundle) {
            super(owner, bundle);
            kotlin.jvm.internal.s.g(applicationSupplier, "applicationSupplier");
            kotlin.jvm.internal.s.g(starterArgsSupplier, "starterArgsSupplier");
            kotlin.jvm.internal.s.g(owner, "owner");
            this.applicationSupplier = applicationSupplier;
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public void fallbackInitialize(FallbackInitializeParam arg) {
            kotlin.jvm.internal.s.g(arg, "arg");
            DaggerPaymentSheetLauncherComponent.builder().application(arg.getApplication()).injectorKey(InjectorKt.DUMMY_INJECTOR_KEY).build().inject(this);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class TransitionTarget {

        /* loaded from: classes6.dex */
        public static final class AddPaymentMethodFull extends TransitionTarget {
            public static final int $stable = 8;
            private final FragmentConfig fragmentConfig;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddPaymentMethodFull(FragmentConfig fragmentConfig) {
                super(null);
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                this.fragmentConfig = fragmentConfig;
            }

            public static /* synthetic */ AddPaymentMethodFull copy$default(AddPaymentMethodFull addPaymentMethodFull, FragmentConfig fragmentConfig, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    fragmentConfig = addPaymentMethodFull.getFragmentConfig();
                }
                return addPaymentMethodFull.copy(fragmentConfig);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final AddPaymentMethodFull copy(FragmentConfig fragmentConfig) {
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                return new AddPaymentMethodFull(fragmentConfig);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddPaymentMethodFull) && kotlin.jvm.internal.s.c(getFragmentConfig(), ((AddPaymentMethodFull) obj).getFragmentConfig());
            }

            @Override // com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget
            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                return getFragmentConfig().hashCode();
            }

            public String toString() {
                return "AddPaymentMethodFull(fragmentConfig=" + getFragmentConfig() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes6.dex */
        public static final class AddPaymentMethodSheet extends TransitionTarget {
            public static final int $stable = 8;
            private final FragmentConfig fragmentConfig;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddPaymentMethodSheet(FragmentConfig fragmentConfig) {
                super(null);
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                this.fragmentConfig = fragmentConfig;
            }

            public static /* synthetic */ AddPaymentMethodSheet copy$default(AddPaymentMethodSheet addPaymentMethodSheet, FragmentConfig fragmentConfig, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    fragmentConfig = addPaymentMethodSheet.getFragmentConfig();
                }
                return addPaymentMethodSheet.copy(fragmentConfig);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final AddPaymentMethodSheet copy(FragmentConfig fragmentConfig) {
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                return new AddPaymentMethodSheet(fragmentConfig);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddPaymentMethodSheet) && kotlin.jvm.internal.s.c(getFragmentConfig(), ((AddPaymentMethodSheet) obj).getFragmentConfig());
            }

            @Override // com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget
            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                return getFragmentConfig().hashCode();
            }

            public String toString() {
                return "AddPaymentMethodSheet(fragmentConfig=" + getFragmentConfig() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes6.dex */
        public static final class SelectSavedPaymentMethod extends TransitionTarget {
            public static final int $stable = 8;
            private final FragmentConfig fragmentConfig;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectSavedPaymentMethod(FragmentConfig fragmentConfig) {
                super(null);
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                this.fragmentConfig = fragmentConfig;
            }

            public static /* synthetic */ SelectSavedPaymentMethod copy$default(SelectSavedPaymentMethod selectSavedPaymentMethod, FragmentConfig fragmentConfig, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    fragmentConfig = selectSavedPaymentMethod.getFragmentConfig();
                }
                return selectSavedPaymentMethod.copy(fragmentConfig);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final SelectSavedPaymentMethod copy(FragmentConfig fragmentConfig) {
                kotlin.jvm.internal.s.g(fragmentConfig, "fragmentConfig");
                return new SelectSavedPaymentMethod(fragmentConfig);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectSavedPaymentMethod) && kotlin.jvm.internal.s.c(getFragmentConfig(), ((SelectSavedPaymentMethod) obj).getFragmentConfig());
            }

            @Override // com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget
            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                return getFragmentConfig().hashCode();
            }

            public String toString() {
                return "SelectSavedPaymentMethod(fragmentConfig=" + getFragmentConfig() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private TransitionTarget() {
        }

        public /* synthetic */ TransitionTarget(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract FragmentConfig getFragmentConfig();
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.GooglePayConfiguration.Environment.values().length];
            iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetViewModel(Application application, PaymentSheetContract.Args args, EventReporter eventReporter, sw.a<PaymentConfiguration> lazyPaymentConfig, StripeIntentRepository stripeIntentRepository, StripeIntentValidator stripeIntentValidator, CustomerRepository customerRepository, PrefsRepository prefsRepository, ResourceRepository resourceRepository, StripePaymentLauncherAssistedFactory paymentLauncherFactory, GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, Logger logger, @IOContext zz.g workContext, @InjectorKey String injectorKey, l0 savedStateHandle, LinkPaymentLauncherFactory linkPaymentLauncherFactory) {
        super(application, args.getConfig$paymentsheet_release(), eventReporter, customerRepository, prefsRepository, workContext, logger, injectorKey, resourceRepository, savedStateHandle, linkPaymentLauncherFactory);
        List<LiveData<S>> l11;
        GooglePayEnvironment googlePayEnvironment;
        kotlin.jvm.internal.s.g(application, "application");
        kotlin.jvm.internal.s.g(args, "args");
        kotlin.jvm.internal.s.g(eventReporter, "eventReporter");
        kotlin.jvm.internal.s.g(lazyPaymentConfig, "lazyPaymentConfig");
        kotlin.jvm.internal.s.g(stripeIntentRepository, "stripeIntentRepository");
        kotlin.jvm.internal.s.g(stripeIntentValidator, "stripeIntentValidator");
        kotlin.jvm.internal.s.g(customerRepository, "customerRepository");
        kotlin.jvm.internal.s.g(prefsRepository, "prefsRepository");
        kotlin.jvm.internal.s.g(resourceRepository, "resourceRepository");
        kotlin.jvm.internal.s.g(paymentLauncherFactory, "paymentLauncherFactory");
        kotlin.jvm.internal.s.g(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        kotlin.jvm.internal.s.g(logger, "logger");
        kotlin.jvm.internal.s.g(workContext, "workContext");
        kotlin.jvm.internal.s.g(injectorKey, "injectorKey");
        kotlin.jvm.internal.s.g(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.s.g(linkPaymentLauncherFactory, "linkPaymentLauncherFactory");
        this.args = args;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.stripeIntentRepository = stripeIntentRepository;
        this.stripeIntentValidator = stripeIntentValidator;
        this.paymentLauncherFactory = paymentLauncherFactory;
        this.googlePayPaymentMethodLauncherFactory = googlePayPaymentMethodLauncherFactory;
        this.confirmParamsFactory = ConfirmStripeIntentParamsFactory.Companion.createFactory(args.getClientSecret$paymentsheet_release());
        f0<PaymentSheetResult> f0Var = new f0<>();
        this._paymentSheetResult = f0Var;
        this.paymentSheetResult = f0Var;
        f0<BaseSheetViewModel.Event<ConfirmStripeIntentParams>> f0Var2 = new f0<>();
        this._startConfirm = f0Var2;
        this.startConfirm = f0Var2;
        GooglePayPaymentMethodLauncher.Config config = null;
        f0<PaymentSheetViewState> f0Var3 = new f0<>(null);
        this._viewState = f0Var3;
        LiveData<PaymentSheetViewState> a11 = o0.a(f0Var3);
        kotlin.jvm.internal.s.f(a11, "distinctUntilChanged(this)");
        this.viewState = a11;
        this.checkoutIdentifier = CheckoutIdentifier.SheetBottomBuy;
        PaymentSheet.GooglePayConfiguration googlePayConfig = args.getGooglePayConfig();
        if (googlePayConfig != null) {
            if (googlePayConfig.getCurrencyCode() == null && !isProcessingPaymentIntent$paymentsheet_release()) {
                logger.warning("GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            } else {
                if (WhenMappings.$EnumSwitchMapping$0[googlePayConfig.getEnvironment().ordinal()] == 1) {
                    googlePayEnvironment = GooglePayEnvironment.Production;
                } else {
                    googlePayEnvironment = GooglePayEnvironment.Test;
                }
                config = new GooglePayPaymentMethodLauncher.Config(googlePayEnvironment, googlePayConfig.getCountryCode(), getMerchantName$paymentsheet_release(), false, null, false, false, 120, null);
            }
        }
        this.googlePayLauncherConfig = config;
        final androidx.lifecycle.d0<Boolean> d0Var = new androidx.lifecycle.d0<>();
        l11 = wz.w.l(isLinkEnabled$paymentsheet_release(), isGooglePayReady$paymentsheet_release(), getFragmentConfigEvent());
        for (LiveData<S> liveData : l11) {
            d0Var.b(liveData, new g0() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$showTopContainer$1$1$1
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    boolean z11;
                    androidx.lifecycle.d0<Boolean> d0Var2 = d0Var;
                    Boolean value = this.isLinkEnabled$paymentsheet_release().getValue();
                    Boolean bool = Boolean.TRUE;
                    if (kotlin.jvm.internal.s.c(value, bool) || kotlin.jvm.internal.s.c(this.isGooglePayReady$paymentsheet_release().getValue(), bool)) {
                        BaseSheetViewModel.Event<FragmentConfig> value2 = this.getFragmentConfigEvent().getValue();
                        if ((value2 == null ? null : value2.peekContent()) != null) {
                            z11 = true;
                            d0Var2.setValue(Boolean.valueOf(z11));
                        }
                    }
                    z11 = false;
                    d0Var2.setValue(Boolean.valueOf(z11));
                }
            });
        }
        this.showTopContainer = d0Var;
        eventReporter.onInit(getConfig$paymentsheet_release());
        if (this.googlePayLauncherConfig == null) {
            savedStateHandle.h(BaseSheetViewModel.SAVE_GOOGLE_PAY_READY, Boolean.FALSE);
        }
    }

    private final void confirmPaymentSelection(PaymentSelection paymentSelection) {
        ConfirmStripeIntentParams create;
        if (paymentSelection instanceof PaymentSelection.Saved) {
            create = this.confirmParamsFactory.create((PaymentSelection.Saved) paymentSelection);
        } else {
            create = paymentSelection instanceof PaymentSelection.New ? this.confirmParamsFactory.create((PaymentSelection.New) paymentSelection) : null;
        }
        if (create == null) {
            return;
        }
        this._startConfirm.setValue(new BaseSheetViewModel.Event<>(create));
    }

    private final PaymentResult convertToPaymentResult(LinkActivityResult linkActivityResult) {
        if (linkActivityResult instanceof LinkActivityResult.Success) {
            return PaymentResult.Completed.INSTANCE;
        }
        if (linkActivityResult instanceof LinkActivityResult.Canceled) {
            return PaymentResult.Canceled.INSTANCE;
        }
        if (linkActivityResult instanceof LinkActivityResult.Failed) {
            return new PaymentResult.Failed(((LinkActivityResult.Failed) linkActivityResult).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void g(PaymentSheetViewModel paymentSheetViewModel, CheckoutIdentifier checkoutIdentifier, androidx.lifecycle.d0 d0Var, PaymentSheetViewState paymentSheetViewState) {
        m324getButtonStateObservable$lambda0(paymentSheetViewModel, checkoutIdentifier, d0Var, paymentSheetViewState);
    }

    /* renamed from: getButtonStateObservable$lambda-0 */
    public static final void m324getButtonStateObservable$lambda0(PaymentSheetViewModel this$0, CheckoutIdentifier checkoutIdentifier, androidx.lifecycle.d0 outputLiveData, PaymentSheetViewState paymentSheetViewState) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(checkoutIdentifier, "$checkoutIdentifier");
        kotlin.jvm.internal.s.g(outputLiveData, "$outputLiveData");
        if (this$0.checkoutIdentifier == checkoutIdentifier) {
            outputLiveData.setValue(paymentSheetViewState);
        }
    }

    public static /* synthetic */ void getGooglePayLauncherConfig$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getGooglePayPaymentMethodLauncher$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void get_paymentSheetResult$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void get_viewState$paymentsheet_release$annotations() {
    }

    public final void onStripeIntentFetchResponse(StripeIntent stripeIntent) {
        Object b11;
        try {
            q.a aVar = vz.q.f54772b;
            b11 = vz.q.b(this.stripeIntentValidator.requireValid(stripeIntent));
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(r.a(th2));
        }
        Throwable e11 = vz.q.e(b11);
        if (e11 == null) {
            StripeIntent stripeIntent2 = (StripeIntent) b11;
            getSavedStateHandle().h(BaseSheetViewModel.SAVE_STRIPE_INTENT, stripeIntent);
            updatePaymentMethods(stripeIntent);
            setupLink(stripeIntent, true);
            resetViewState$default(this, null, 1, null);
            return;
        }
        onFatal(e11);
    }

    public final void processPayment(StripeIntent stripeIntent, PaymentResult paymentResult) {
        Object b11;
        r1 = null;
        PaymentSelection value = null;
        if (paymentResult instanceof PaymentResult.Completed) {
            getEventReporter$paymentsheet_release().onPaymentSuccess(getSelection$paymentsheet_release().getValue());
            PaymentSelection value2 = getSelection$paymentsheet_release().getValue();
            if (value2 instanceof PaymentSelection.New) {
                PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
                if (paymentMethod != null) {
                    value = new PaymentSelection.Saved(paymentMethod);
                }
            } else if (kotlin.jvm.internal.s.c(value2, PaymentSelection.GooglePay.INSTANCE)) {
                value = getSelection$paymentsheet_release().getValue();
            } else if (value2 instanceof PaymentSelection.Saved) {
                value = getSelection$paymentsheet_release().getValue();
            } else if (value2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (value != null) {
                getPrefsRepository().savePaymentSelection(value);
            }
            this._viewState.setValue(new PaymentSheetViewState.FinishProcessing(new PaymentSheetViewModel$processPayment$3(this)));
            return;
        }
        getEventReporter$paymentsheet_release().onPaymentFailure(getSelection$paymentsheet_release().getValue());
        try {
            q.a aVar = vz.q.f54772b;
            b11 = vz.q.b(this.stripeIntentValidator.requireValid(stripeIntent));
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(r.a(th2));
        }
        Throwable e11 = vz.q.e(b11);
        if (e11 == null) {
            StripeIntent stripeIntent2 = (StripeIntent) b11;
            resetViewState(paymentResult instanceof PaymentResult.Failed ? ((PaymentResult.Failed) paymentResult).getThrowable().getLocalizedMessage() : null);
            return;
        }
        onFatal(e11);
    }

    private final void resetViewState(String str) {
        this._viewState.setValue(new PaymentSheetViewState.Reset(str == null ? null : new BaseSheetViewModel.UserErrorMessage(str)));
        getSavedStateHandle().h(BaseSheetViewModel.SAVE_PROCESSING, Boolean.FALSE);
    }

    public static /* synthetic */ void resetViewState$default(PaymentSheetViewModel paymentSheetViewModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        paymentSheetViewModel.resetViewState(str);
    }

    private final void startProcessing(CheckoutIdentifier checkoutIdentifier) {
        if (this.checkoutIdentifier != checkoutIdentifier) {
            this._viewState.setValue(new PaymentSheetViewState.Reset(null, 1, null));
        }
        this.checkoutIdentifier = checkoutIdentifier;
        getSavedStateHandle().h(BaseSheetViewModel.SAVE_PROCESSING, Boolean.TRUE);
        this._viewState.setValue(PaymentSheetViewState.StartProcessing.INSTANCE);
    }

    public final void checkout(CheckoutIdentifier checkoutIdentifier) {
        GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher$paymentsheet_release;
        Long amount;
        kotlin.jvm.internal.s.g(checkoutIdentifier, "checkoutIdentifier");
        startProcessing(checkoutIdentifier);
        PaymentSelection value = getSelection$paymentsheet_release().getValue();
        if (value instanceof PaymentSelection.GooglePay) {
            StripeIntent value2 = getStripeIntent$paymentsheet_release().getValue();
            if (value2 == null || (googlePayPaymentMethodLauncher$paymentsheet_release = getGooglePayPaymentMethodLauncher$paymentsheet_release()) == null) {
                return;
            }
            boolean z11 = value2 instanceof PaymentIntent;
            PaymentIntent paymentIntent = z11 ? (PaymentIntent) value2 : null;
            String currency = paymentIntent == null ? null : paymentIntent.getCurrency();
            if (currency == null) {
                PaymentSheet.GooglePayConfiguration googlePayConfig = getArgs$paymentsheet_release().getGooglePayConfig();
                currency = googlePayConfig == null ? null : googlePayConfig.getCurrencyCode();
                if (currency == null) {
                    currency = "";
                }
            }
            PaymentIntent paymentIntent2 = z11 ? (PaymentIntent) value2 : null;
            int i11 = 0;
            if (paymentIntent2 != null && (amount = paymentIntent2.getAmount()) != null) {
                i11 = (int) amount.longValue();
            }
            googlePayPaymentMethodLauncher$paymentsheet_release.present(currency, i11, value2.getId());
            return;
        }
        confirmPaymentSelection(value);
    }

    public final void confirmStripeIntent(ConfirmStripeIntentParams confirmStripeIntentParams) {
        Object b11;
        PaymentLauncher paymentLauncher$paymentsheet_release;
        kotlin.jvm.internal.s.g(confirmStripeIntentParams, "confirmStripeIntentParams");
        try {
            q.a aVar = vz.q.f54772b;
            paymentLauncher$paymentsheet_release = getPaymentLauncher$paymentsheet_release();
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(r.a(th2));
        }
        if (paymentLauncher$paymentsheet_release != null) {
            b11 = vz.q.b(paymentLauncher$paymentsheet_release);
            Throwable e11 = vz.q.e(b11);
            if (e11 == null) {
                PaymentLauncher paymentLauncher = (PaymentLauncher) b11;
                if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                    paymentLauncher.confirm((ConfirmPaymentIntentParams) confirmStripeIntentParams);
                    return;
                } else if (confirmStripeIntentParams instanceof ConfirmSetupIntentParams) {
                    paymentLauncher.confirm((ConfirmSetupIntentParams) confirmStripeIntentParams);
                    return;
                } else {
                    return;
                }
            }
            onFatal(e11);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final PaymentSheetContract.Args getArgs$paymentsheet_release() {
        return this.args;
    }

    public final androidx.lifecycle.d0<PaymentSheetViewState> getButtonStateObservable$paymentsheet_release(final CheckoutIdentifier checkoutIdentifier) {
        kotlin.jvm.internal.s.g(checkoutIdentifier, "checkoutIdentifier");
        final androidx.lifecycle.d0<PaymentSheetViewState> d0Var = new androidx.lifecycle.d0<>();
        d0Var.b(this.viewState, new g0() { // from class: com.stripe.android.paymentsheet.d0
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                PaymentSheetViewModel.g(PaymentSheetViewModel.this, checkoutIdentifier, d0Var, (PaymentSheetViewState) obj);
            }
        });
        return d0Var;
    }

    public final CheckoutIdentifier getCheckoutIdentifier$paymentsheet_release() {
        return this.checkoutIdentifier;
    }

    public final GooglePayPaymentMethodLauncher.Config getGooglePayLauncherConfig$paymentsheet_release() {
        return this.googlePayLauncherConfig;
    }

    public final GooglePayPaymentMethodLauncher getGooglePayPaymentMethodLauncher$paymentsheet_release() {
        return this.googlePayPaymentMethodLauncher;
    }

    public final PaymentSelection getLastSelectedPaymentMethod$paymentsheet_release() {
        return this.lastSelectedPaymentMethod;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public PaymentSelection.New getNewLpm() {
        return this.newLpm;
    }

    public final PaymentLauncher getPaymentLauncher$paymentsheet_release() {
        return this.paymentLauncher;
    }

    public final LiveData<PaymentSheetResult> getPaymentSheetResult$paymentsheet_release() {
        return this.paymentSheetResult;
    }

    public final androidx.lifecycle.d0<Boolean> getShowTopContainer$paymentsheet_release() {
        return this.showTopContainer;
    }

    public final LiveData<BaseSheetViewModel.Event<ConfirmStripeIntentParams>> getStartConfirm$paymentsheet_release() {
        return this.startConfirm;
    }

    public final LiveData<PaymentSheetViewState> getViewState$paymentsheet_release() {
        return this.viewState;
    }

    public final f0<PaymentSheetResult> get_paymentSheetResult$paymentsheet_release() {
        return this._paymentSheetResult;
    }

    public final f0<PaymentSheetViewState> get_viewState$paymentsheet_release() {
        return this._viewState;
    }

    public final boolean isProcessingPaymentIntent$paymentsheet_release() {
        return this.args.getClientSecret$paymentsheet_release() instanceof PaymentIntentClientSecret;
    }

    public final boolean maybeFetchStripeIntent$paymentsheet_release() {
        if (getStripeIntent$paymentsheet_release().getValue() == null) {
            v20.k.d(q0.a(this), null, null, new PaymentSheetViewModel$maybeFetchStripeIntent$1(this, null), 3, null);
            return true;
        }
        return false;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(Integer num) {
        String string;
        if (num == null) {
            string = null;
        } else {
            string = getApplication().getResources().getString(num.intValue());
        }
        onError(string);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onFatal(Throwable throwable) {
        kotlin.jvm.internal.s.g(throwable, "throwable");
        getLogger().error("Payment Sheet error", throwable);
        get_fatal().setValue(throwable);
        this._paymentSheetResult.setValue(new PaymentSheetResult.Failed(throwable));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onFinish() {
        this._paymentSheetResult.setValue(PaymentSheetResult.Completed.INSTANCE);
    }

    public final void onGooglePayResult$paymentsheet_release(GooglePayPaymentMethodLauncher.Result result) {
        int i11;
        kotlin.jvm.internal.s.g(result, "result");
        setContentVisible(true);
        if (result instanceof GooglePayPaymentMethodLauncher.Result.Completed) {
            confirmPaymentSelection(new PaymentSelection.Saved(((GooglePayPaymentMethodLauncher.Result.Completed) result).getPaymentMethod()));
        } else if (result instanceof GooglePayPaymentMethodLauncher.Result.Failed) {
            GooglePayPaymentMethodLauncher.Result.Failed failed = (GooglePayPaymentMethodLauncher.Result.Failed) result;
            getLogger().error("Error processing Google Pay payment", failed.getError());
            getEventReporter$paymentsheet_release().onPaymentFailure(PaymentSelection.GooglePay.INSTANCE);
            if (failed.getErrorCode() == 3) {
                i11 = R.string.stripe_failure_connection_error;
            } else {
                i11 = R.string.stripe_internal_error;
            }
            onError(Integer.valueOf(i11));
        } else if (result instanceof GooglePayPaymentMethodLauncher.Result.Canceled) {
            resetViewState$default(this, null, 1, null);
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onLinkActivityResult(LinkActivityResult result) {
        kotlin.jvm.internal.s.g(result, "result");
        super.onLinkActivityResult(result);
        onPaymentResult(convertToPaymentResult(result));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onLinkLaunched() {
        super.onLinkLaunched();
        startProcessing(CheckoutIdentifier.SheetBottomBuy);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onLinkPaymentDetailsCollected(LinkPaymentDetails linkPaymentDetails) {
        vz.b0 b0Var;
        if (linkPaymentDetails == null) {
            b0Var = null;
        } else {
            updateSelection(convertToPaymentSelection(linkPaymentDetails));
            checkout(CheckoutIdentifier.SheetBottomBuy);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            checkout(CheckoutIdentifier.SheetBottomBuy);
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onPaymentResult(PaymentResult paymentResult) {
        kotlin.jvm.internal.s.g(paymentResult, "paymentResult");
        v20.k.d(q0.a(this), null, null, new PaymentSheetViewModel$onPaymentResult$1(this, paymentResult, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onUserCancel() {
        this._paymentSheetResult.setValue(PaymentSheetResult.Canceled.INSTANCE);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void registerFromActivity(androidx.activity.result.c activityResultCaller) {
        kotlin.jvm.internal.s.g(activityResultCaller, "activityResultCaller");
        super.registerFromActivity(activityResultCaller);
        StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory = this.paymentLauncherFactory;
        PaymentSheetViewModel$registerFromActivity$1 paymentSheetViewModel$registerFromActivity$1 = new PaymentSheetViewModel$registerFromActivity$1(this);
        PaymentSheetViewModel$registerFromActivity$2 paymentSheetViewModel$registerFromActivity$2 = new PaymentSheetViewModel$registerFromActivity$2(this);
        androidx.activity.result.d<PaymentLauncherContract.Args> registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new androidx.activity.result.b() { // from class: com.stripe.android.paymentsheet.c0
            {
                PaymentSheetViewModel.this = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                PaymentSheetViewModel.this.onPaymentResult((PaymentResult) obj);
            }
        });
        kotlin.jvm.internal.s.f(registerForActivityResult, "activityResultCaller.reg…ymentResult\n            )");
        this.paymentLauncher = stripePaymentLauncherAssistedFactory.create(paymentSheetViewModel$registerFromActivity$1, paymentSheetViewModel$registerFromActivity$2, registerForActivityResult);
    }

    public final void setCheckoutIdentifier$paymentsheet_release(CheckoutIdentifier checkoutIdentifier) {
        kotlin.jvm.internal.s.g(checkoutIdentifier, "<set-?>");
        this.checkoutIdentifier = checkoutIdentifier;
    }

    public final void setGooglePayPaymentMethodLauncher$paymentsheet_release(GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher) {
        this.googlePayPaymentMethodLauncher = googlePayPaymentMethodLauncher;
    }

    public final void setLastSelectedPaymentMethod$paymentsheet_release(PaymentSelection paymentSelection) {
        this.lastSelectedPaymentMethod = paymentSelection;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void setNewLpm(PaymentSelection.New r12) {
        this.newLpm = r12;
    }

    public final void setPaymentLauncher$paymentsheet_release(PaymentLauncher paymentLauncher) {
        this.paymentLauncher = paymentLauncher;
    }

    public final void setupGooglePay(v20.o0 lifecycleScope, androidx.activity.result.d<GooglePayPaymentMethodLauncherContract.Args> activityResultLauncher) {
        kotlin.jvm.internal.s.g(lifecycleScope, "lifecycleScope");
        kotlin.jvm.internal.s.g(activityResultLauncher, "activityResultLauncher");
        GooglePayPaymentMethodLauncher.Config config = this.googlePayLauncherConfig;
        if (config == null) {
            return;
        }
        setGooglePayPaymentMethodLauncher$paymentsheet_release(GooglePayPaymentMethodLauncherFactory.DefaultImpls.create$default(this.googlePayPaymentMethodLauncherFactory, lifecycleScope, config, new GooglePayPaymentMethodLauncher.ReadyCallback() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$setupGooglePay$1$1
            @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback
            public final void onReady(boolean z11) {
                PaymentSheetViewModel.this.getSavedStateHandle().h(BaseSheetViewModel.SAVE_GOOGLE_PAY_READY, Boolean.valueOf(z11));
            }
        }, activityResultLauncher, false, 16, null));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void unregisterFromActivity() {
        super.unregisterFromActivity();
        this.paymentLauncher = null;
    }

    public final void updatePaymentMethods(StripeIntent stripeIntent) {
        kotlin.jvm.internal.s.g(stripeIntent, "stripeIntent");
        v20.k.d(q0.a(this), null, null, new PaymentSheetViewModel$updatePaymentMethods$1(this, stripeIntent, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void updateSelection(PaymentSelection paymentSelection) {
        super.updateSelection(paymentSelection);
        if ((paymentSelection instanceof PaymentSelection.Saved) && ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().type == PaymentMethod.Type.USBankAccount) {
            ACHText aCHText = ACHText.INSTANCE;
            Application application = getApplication();
            kotlin.jvm.internal.s.f(application, "getApplication()");
            updateBelowButtonText(aCHText.getContinueMandateText(application));
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(String str) {
        resetViewState(str);
    }
}