package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.d;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncherAssistedFactory;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionResult;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.injection.DaggerFlowControllerComponent;
import com.stripe.android.paymentsheet.injection.FlowControllerComponent;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import v20.i;
import v20.k;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultFlowController implements PaymentSheet.FlowController, Injector {
    public static final Companion Companion = new Companion(null);
    private final boolean enableLogging;
    private final EventReporter eventReporter;
    public FlowControllerComponent flowControllerComponent;
    private final FlowControllerInitializer flowControllerInitializer;
    private d<GooglePayPaymentMethodLauncherContract.Args> googlePayActivityLauncher;
    private final GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory;
    private final String injectorKey;
    private final Provider<PaymentConfiguration> lazyPaymentConfiguration;
    private final o0 lifecycleScope;
    private PaymentLauncher paymentLauncher;
    private final StripePaymentLauncherAssistedFactory paymentLauncherFactory;
    private final d<PaymentOptionContract.Args> paymentOptionActivityLauncher;
    private final PaymentOptionCallback paymentOptionCallback;
    private final PaymentOptionFactory paymentOptionFactory;
    private final PaymentSheetResultCallback paymentResultCallback;
    private final Set<String> productUsage;
    private final ResourceRepository resourceRepository;
    private final h00.a<Integer> statusBarColor;
    private final g uiContext;
    private final FlowControllerViewModel viewModel;

    /* loaded from: classes6.dex */
    public static final class Args implements Parcelable {
        private final String clientSecret;
        private final PaymentSheet.Configuration config;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(String clientSecret, PaymentSheet.Configuration configuration) {
            s.g(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.config = configuration;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, PaymentSheet.Configuration configuration, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = args.clientSecret;
            }
            if ((i11 & 2) != 0) {
                configuration = args.config;
            }
            return args.copy(str, configuration);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration component2() {
            return this.config;
        }

        public final Args copy(String clientSecret, PaymentSheet.Configuration configuration) {
            s.g(clientSecret, "clientSecret");
            return new Args(clientSecret, configuration);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return s.c(this.clientSecret, args.clientSecret) && s.c(this.config, args.config);
            }
            return false;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            int hashCode = this.clientSecret.hashCode() * 31;
            PaymentSheet.Configuration configuration = this.config;
            return hashCode + (configuration == null ? 0 : configuration.hashCode());
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", config=" + this.config + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.clientSecret);
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            configuration.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentSheet.FlowController getInstance(Context appContext, u0 viewModelStoreOwner, o0 lifecycleScope, v lifecycleOwner, androidx.activity.result.c activityResultCaller, h00.a<Integer> statusBarColor, PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
            s.g(appContext, "appContext");
            s.g(viewModelStoreOwner, "viewModelStoreOwner");
            s.g(lifecycleScope, "lifecycleScope");
            s.g(lifecycleOwner, "lifecycleOwner");
            s.g(activityResultCaller, "activityResultCaller");
            s.g(statusBarColor, "statusBarColor");
            s.g(paymentOptionFactory, "paymentOptionFactory");
            s.g(paymentOptionCallback, "paymentOptionCallback");
            s.g(paymentResultCallback, "paymentResultCallback");
            WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
            String o11 = m0.b(PaymentSheet.FlowController.class).o();
            if (o11 != null) {
                String nextKey = weakMapInjectorRegistry.nextKey(o11);
                FlowControllerComponent build = DaggerFlowControllerComponent.builder().appContext(appContext).viewModelStoreOwner(viewModelStoreOwner).lifecycleScope(lifecycleScope).lifeCycleOwner(lifecycleOwner).activityResultCaller(activityResultCaller).statusBarColor(statusBarColor).paymentOptionFactory(paymentOptionFactory).paymentOptionCallback(paymentOptionCallback).paymentResultCallback(paymentResultCallback).injectorKey(nextKey).build();
                DefaultFlowController flowController = build.getFlowController();
                flowController.setFlowControllerComponent(build);
                weakMapInjectorRegistry.register(flowController, nextKey);
                return flowController;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes6.dex */
    public static final class GooglePayException extends Exception {
        public static final int $stable = 8;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePayException(Throwable throwable) {
            super(throwable);
            s.g(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
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

    public DefaultFlowController(o0 lifecycleScope, v lifecycleOwner, h00.a<Integer> statusBarColor, PaymentOptionFactory paymentOptionFactory, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback, final androidx.activity.result.c activityResultCaller, @InjectorKey String injectorKey, FlowControllerInitializer flowControllerInitializer, EventReporter eventReporter, FlowControllerViewModel viewModel, StripePaymentLauncherAssistedFactory paymentLauncherFactory, ResourceRepository resourceRepository, Provider<PaymentConfiguration> lazyPaymentConfiguration, @UIContext g uiContext, boolean z11, Set<String> productUsage, GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory) {
        s.g(lifecycleScope, "lifecycleScope");
        s.g(lifecycleOwner, "lifecycleOwner");
        s.g(statusBarColor, "statusBarColor");
        s.g(paymentOptionFactory, "paymentOptionFactory");
        s.g(paymentOptionCallback, "paymentOptionCallback");
        s.g(paymentResultCallback, "paymentResultCallback");
        s.g(activityResultCaller, "activityResultCaller");
        s.g(injectorKey, "injectorKey");
        s.g(flowControllerInitializer, "flowControllerInitializer");
        s.g(eventReporter, "eventReporter");
        s.g(viewModel, "viewModel");
        s.g(paymentLauncherFactory, "paymentLauncherFactory");
        s.g(resourceRepository, "resourceRepository");
        s.g(lazyPaymentConfiguration, "lazyPaymentConfiguration");
        s.g(uiContext, "uiContext");
        s.g(productUsage, "productUsage");
        s.g(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        this.lifecycleScope = lifecycleScope;
        this.statusBarColor = statusBarColor;
        this.paymentOptionFactory = paymentOptionFactory;
        this.paymentOptionCallback = paymentOptionCallback;
        this.paymentResultCallback = paymentResultCallback;
        this.injectorKey = injectorKey;
        this.flowControllerInitializer = flowControllerInitializer;
        this.eventReporter = eventReporter;
        this.viewModel = viewModel;
        this.paymentLauncherFactory = paymentLauncherFactory;
        this.resourceRepository = resourceRepository;
        this.lazyPaymentConfiguration = lazyPaymentConfiguration;
        this.uiContext = uiContext;
        this.enableLogging = z11;
        this.productUsage = productUsage;
        this.googlePayPaymentMethodLauncherFactory = googlePayPaymentMethodLauncherFactory;
        lifecycleOwner.getLifecycle().a(new u() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.1
            @h0(p.b.ON_CREATE)
            public final void onCreate() {
                DefaultFlowController defaultFlowController = DefaultFlowController.this;
                StripePaymentLauncherAssistedFactory stripePaymentLauncherAssistedFactory = defaultFlowController.paymentLauncherFactory;
                DefaultFlowController$1$onCreate$1 defaultFlowController$1$onCreate$1 = new DefaultFlowController$1$onCreate$1(DefaultFlowController.this);
                DefaultFlowController$1$onCreate$2 defaultFlowController$1$onCreate$2 = new DefaultFlowController$1$onCreate$2(DefaultFlowController.this);
                androidx.activity.result.c cVar = activityResultCaller;
                PaymentLauncherContract paymentLauncherContract = new PaymentLauncherContract();
                final DefaultFlowController defaultFlowController2 = DefaultFlowController.this;
                d<PaymentLauncherContract.Args> registerForActivityResult = cVar.registerForActivityResult(paymentLauncherContract, new androidx.activity.result.b() { // from class: com.stripe.android.paymentsheet.flowcontroller.c
                    @Override // androidx.activity.result.b
                    public final void a(Object obj) {
                        defaultFlowController2.onPaymentResult$paymentsheet_release((PaymentResult) obj);
                    }
                });
                s.f(registerForActivityResult, "activityResultCaller.reg…                        )");
                defaultFlowController.paymentLauncher = stripePaymentLauncherAssistedFactory.create(defaultFlowController$1$onCreate$1, defaultFlowController$1$onCreate$2, registerForActivityResult);
            }

            @h0(p.b.ON_DESTROY)
            public final void onDestroy() {
                DefaultFlowController.this.paymentLauncher = null;
            }
        });
        d<PaymentOptionContract.Args> registerForActivityResult = activityResultCaller.registerForActivityResult(new PaymentOptionContract(), new androidx.activity.result.b() { // from class: com.stripe.android.paymentsheet.flowcontroller.b
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                DefaultFlowController.this.onPaymentOptionResult$paymentsheet_release((PaymentOptionResult) obj);
            }
        });
        s.f(registerForActivityResult, "activityResultCaller.reg…ptionResult\n            )");
        this.paymentOptionActivityLauncher = registerForActivityResult;
        d<GooglePayPaymentMethodLauncherContract.Args> registerForActivityResult2 = activityResultCaller.registerForActivityResult(new GooglePayPaymentMethodLauncherContract(), new androidx.activity.result.b() { // from class: com.stripe.android.paymentsheet.flowcontroller.a
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                DefaultFlowController.this.onGooglePayResult$paymentsheet_release((GooglePayPaymentMethodLauncher.Result) obj);
            }
        });
        s.f(registerForActivityResult2, "activityResultCaller.reg…lePayResult\n            )");
        this.googlePayActivityLauncher = registerForActivityResult2;
    }

    private final void configureInternal(ClientSecret clientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback) {
        if (configuration != null) {
            try {
                PaymentSheetConfigurationKtxKt.validate(configuration);
            } catch (InvalidParameterException e11) {
                configCallback.onConfigured(false, e11);
                return;
            }
        }
        clientSecret.validate();
        k.d(this.lifecycleScope, null, null, new DefaultFlowController$configureInternal$1(this, clientSecret, configuration, configCallback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetResult createPaymentSheetResult(PaymentResult paymentResult) {
        if (paymentResult instanceof PaymentResult.Completed) {
            return PaymentSheetResult.Completed.INSTANCE;
        }
        if (paymentResult instanceof PaymentResult.Canceled) {
            return PaymentSheetResult.Canceled.INSTANCE;
        }
        if (paymentResult instanceof PaymentResult.Failed) {
            return new PaymentSheetResult.Failed(((PaymentResult.Failed) paymentResult).getThrowable());
        }
        return new PaymentSheetResult.Failed(new RuntimeException("Failed to complete payment."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dispatchResult(FlowControllerInitializer.InitResult initResult, PaymentSheet.FlowController.ConfigCallback configCallback, zz.d<? super b0> dVar) {
        Object d11;
        Object g11 = i.g(this.uiContext, new DefaultFlowController$dispatchResult$2(initResult, this, configCallback, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    private final void launchGooglePay(InitData initData) {
        GooglePayEnvironment googlePayEnvironment;
        Long amount;
        PaymentSheet.Configuration config = initData.getConfig();
        if (config != null) {
            PaymentSheet.GooglePayConfiguration googlePay = config.getGooglePay();
            if (googlePay != null) {
                if (WhenMappings.$EnumSwitchMapping$0[googlePay.getEnvironment().ordinal()] == 1) {
                    googlePayEnvironment = GooglePayEnvironment.Production;
                } else {
                    googlePayEnvironment = GooglePayEnvironment.Test;
                }
                GooglePayPaymentMethodLauncher create = this.googlePayPaymentMethodLauncherFactory.create(this.lifecycleScope, new GooglePayPaymentMethodLauncher.Config(googlePayEnvironment, googlePay.getCountryCode(), config.getMerchantDisplayName(), false, null, false, false, 120, null), new GooglePayPaymentMethodLauncher.ReadyCallback() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$launchGooglePay$1
                    @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback
                    public final void onReady(boolean z11) {
                    }
                }, this.googlePayActivityLauncher, true);
                StripeIntent stripeIntent = initData.getStripeIntent();
                PaymentIntent paymentIntent = stripeIntent instanceof PaymentIntent ? (PaymentIntent) stripeIntent : null;
                String currency = paymentIntent == null ? null : paymentIntent.getCurrency();
                if (currency == null && (currency = googlePay.getCurrencyCode()) == null) {
                    currency = "";
                }
                StripeIntent stripeIntent2 = initData.getStripeIntent();
                PaymentIntent paymentIntent2 = stripeIntent2 instanceof PaymentIntent ? (PaymentIntent) stripeIntent2 : null;
                int i11 = 0;
                if (paymentIntent2 != null && (amount = paymentIntent2.getAmount()) != null) {
                    i11 = (int) amount.longValue();
                }
                create.present(currency, i11, initData.getStripeIntent().getId());
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitSuccess(InitData initData, PaymentSheet.FlowController.ConfigCallback configCallback) {
        PaymentSelection paymentSelection;
        Object obj;
        this.eventReporter.onInit(initData.getConfig());
        SavedSelection savedSelection = initData.getSavedSelection();
        if (s.c(savedSelection, SavedSelection.GooglePay.INSTANCE)) {
            paymentSelection = PaymentSelection.GooglePay.INSTANCE;
        } else {
            if (savedSelection instanceof SavedSelection.PaymentMethod) {
                Iterator<T> it2 = initData.getPaymentMethods().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (s.c(((PaymentMethod) obj).f20932id, ((SavedSelection.PaymentMethod) savedSelection).getId())) {
                        break;
                    }
                }
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                if (paymentMethod != null) {
                    paymentSelection = new PaymentSelection.Saved(paymentMethod);
                }
            }
            paymentSelection = null;
        }
        this.viewModel.setPaymentSelection(paymentSelection);
        this.viewModel.setInitData(initData);
        configCallback.onConfigured(true, null);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void configureWithPaymentIntent(String paymentIntentClientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
        s.g(callback, "callback");
        configureInternal(new PaymentIntentClientSecret(paymentIntentClientSecret), configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void configureWithSetupIntent(String setupIntentClientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        s.g(setupIntentClientSecret, "setupIntentClientSecret");
        s.g(callback, "callback");
        configureInternal(new SetupIntentClientSecret(setupIntentClientSecret), configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void confirm() {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(this.viewModel.getInitData());
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (q.e(b11) == null) {
            InitData initData = (InitData) b11;
            PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
            if (s.c(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
                launchGooglePay(initData);
                return;
            } else {
                confirmPaymentSelection(paymentSelection, initData);
                return;
            }
        }
        throw new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent() or configureWithSetupIntent() before calling confirm()".toString());
    }

    public final void confirmPaymentSelection(PaymentSelection paymentSelection, InitData initData) {
        ConfirmStripeIntentParams create;
        s.g(initData, "initData");
        ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> createFactory = ConfirmStripeIntentParamsFactory.Companion.createFactory(initData.getClientSecret());
        if (paymentSelection instanceof PaymentSelection.Saved) {
            create = createFactory.create((PaymentSelection.Saved) paymentSelection);
        } else {
            create = paymentSelection instanceof PaymentSelection.New ? createFactory.create((PaymentSelection.New) paymentSelection) : null;
        }
        if (create == null) {
            return;
        }
        k.d(this.lifecycleScope, null, null, new DefaultFlowController$confirmPaymentSelection$1$1(create, this, null), 3, null);
    }

    public final FlowControllerComponent getFlowControllerComponent() {
        FlowControllerComponent flowControllerComponent = this.flowControllerComponent;
        if (flowControllerComponent != null) {
            return flowControllerComponent;
        }
        s.x("flowControllerComponent");
        return null;
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public PaymentOption getPaymentOption() {
        PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
        if (paymentSelection == null) {
            return null;
        }
        return this.paymentOptionFactory.create(paymentSelection);
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        s.g(injectable, "injectable");
        if (injectable instanceof PaymentOptionsViewModel.Factory) {
            getFlowControllerComponent().inject((PaymentOptionsViewModel.Factory) injectable);
        } else if (injectable instanceof FormViewModel.Factory) {
            getFlowControllerComponent().inject((FormViewModel.Factory) injectable);
        } else {
            throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
        }
    }

    public final void onGooglePayResult$paymentsheet_release(GooglePayPaymentMethodLauncher.Result googlePayResult) {
        Object b11;
        s.g(googlePayResult, "googlePayResult");
        if (googlePayResult instanceof GooglePayPaymentMethodLauncher.Result.Completed) {
            try {
                q.a aVar = q.f54772b;
                b11 = q.b(this.viewModel.getInitData());
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                PaymentSelection.Saved saved = new PaymentSelection.Saved(((GooglePayPaymentMethodLauncher.Result.Completed) googlePayResult).getPaymentMethod());
                this.viewModel.setPaymentSelection(saved);
                confirmPaymentSelection(saved, (InitData) b11);
                return;
            }
            this.eventReporter.onPaymentFailure(PaymentSelection.GooglePay.INSTANCE);
            this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(e11));
        } else if (googlePayResult instanceof GooglePayPaymentMethodLauncher.Result.Failed) {
            this.eventReporter.onPaymentFailure(PaymentSelection.GooglePay.INSTANCE);
            this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(new GooglePayException(((GooglePayPaymentMethodLauncher.Result.Failed) googlePayResult).getError())));
        } else if (googlePayResult instanceof GooglePayPaymentMethodLauncher.Result.Canceled) {
            this.paymentResultCallback.onPaymentSheetResult(PaymentSheetResult.Canceled.INSTANCE);
        }
    }

    public final /* synthetic */ void onPaymentOptionResult$paymentsheet_release(PaymentOptionResult paymentOptionResult) {
        List<PaymentMethod> paymentMethods;
        if (paymentOptionResult != null && (paymentMethods = paymentOptionResult.getPaymentMethods()) != null) {
            FlowControllerViewModel flowControllerViewModel = this.viewModel;
            flowControllerViewModel.setInitData(InitData.copy$default(flowControllerViewModel.getInitData(), null, null, null, paymentMethods, null, false, 55, null));
        }
        if (paymentOptionResult instanceof PaymentOptionResult.Succeeded) {
            PaymentSelection paymentSelection = ((PaymentOptionResult.Succeeded) paymentOptionResult).getPaymentSelection();
            this.viewModel.setPaymentSelection(paymentSelection);
            this.paymentOptionCallback.onPaymentOption(this.paymentOptionFactory.create(paymentSelection));
            return;
        }
        if (paymentOptionResult instanceof PaymentOptionResult.Failed ? true : paymentOptionResult instanceof PaymentOptionResult.Canceled) {
            PaymentOptionCallback paymentOptionCallback = this.paymentOptionCallback;
            PaymentSelection paymentSelection2 = this.viewModel.getPaymentSelection();
            paymentOptionCallback.onPaymentOption(paymentSelection2 != null ? this.paymentOptionFactory.create(paymentSelection2) : null);
            return;
        }
        this.viewModel.setPaymentSelection(null);
        this.paymentOptionCallback.onPaymentOption(null);
    }

    public final void onPaymentResult$paymentsheet_release(PaymentResult paymentResult) {
        s.g(paymentResult, "paymentResult");
        k.d(this.lifecycleScope, null, null, new DefaultFlowController$onPaymentResult$1(this, paymentResult, null), 3, null);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void presentPaymentOptions() {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(this.viewModel.getInitData());
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (q.e(b11) == null) {
            InitData initData = (InitData) b11;
            d<PaymentOptionContract.Args> dVar = this.paymentOptionActivityLauncher;
            StripeIntent stripeIntent = initData.getStripeIntent();
            List<PaymentMethod> paymentMethods = initData.getPaymentMethods();
            PaymentSheet.Configuration config = initData.getConfig();
            boolean isGooglePayReady = initData.isGooglePayReady();
            PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
            dVar.b(new PaymentOptionContract.Args(stripeIntent, paymentMethods, config, isGooglePayReady, paymentSelection instanceof PaymentSelection.New ? (PaymentSelection.New) paymentSelection : null, this.statusBarColor.invoke(), this.injectorKey, this.enableLogging, this.productUsage));
            return;
        }
        throw new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent() or configureWithSetupIntent() before calling presentPaymentOptions()".toString());
    }

    public final void setFlowControllerComponent(FlowControllerComponent flowControllerComponent) {
        s.g(flowControllerComponent, "<set-?>");
        this.flowControllerComponent = flowControllerComponent;
    }
}