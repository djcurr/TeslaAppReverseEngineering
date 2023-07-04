package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.stripe.android.PaymentController;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.AlipayRepository;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowFailureMessageFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import h00.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.i;
import vz.b0;
import wz.v;
import zz.g;

/* loaded from: classes2.dex */
public final class StripePaymentController implements PaymentController {
    private static final long CHALLENGE_DELAY;
    public static final Companion Companion = new Companion(null);
    private static final List<String> EXPAND_PAYMENT_METHOD;
    public static final int PAYMENT_REQUEST_CODE = 50000;
    private static final String REQUIRED_ERROR = "API request returned an invalid response.";
    public static final int SETUP_REQUEST_CODE = 50001;
    public static final int SOURCE_REQUEST_CODE = 50002;
    private final AlipayRepository alipayRepository;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final PaymentAuthenticatorRegistry authenticatorRegistry;
    private final DefaultReturnUrl defaultReturnUrl;
    private final boolean enableLogging;
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final boolean isInstantApp;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor;
    private androidx.activity.result.d<PaymentRelayStarter.Args> paymentRelayLauncher;
    private final l<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;
    private final h00.a<String> publishableKeyProvider;
    private final SetupIntentFlowResultProcessor setupIntentFlowResultProcessor;
    private final StripeRepository stripeRepository;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final g uiContext;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PaymentController create$default(Companion companion, Context context, String str, StripeRepository stripeRepository, boolean z11, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return companion.create(context, str, stripeRepository, z11);
        }

        public final PaymentController create(Context context, String publishableKey, StripeRepository stripeRepository) {
            s.g(context, "context");
            s.g(publishableKey, "publishableKey");
            s.g(stripeRepository, "stripeRepository");
            return create$default(this, context, publishableKey, stripeRepository, false, 8, null);
        }

        public final PaymentController create(Context context, String publishableKey, StripeRepository stripeRepository, boolean z11) {
            s.g(context, "context");
            s.g(publishableKey, "publishableKey");
            s.g(stripeRepository, "stripeRepository");
            Context applicationContext = context.getApplicationContext();
            s.f(applicationContext, "context.applicationContext");
            return new StripePaymentController(applicationContext, new StripePaymentController$Companion$create$1(publishableKey), stripeRepository, z11, null, null, null, null, null, DownloaderService.STATUS_HTTP_EXCEPTION, null);
        }

        public final long getCHALLENGE_DELAY$payments_core_release() {
            return StripePaymentController.CHALLENGE_DELAY;
        }

        public final List<String> getEXPAND_PAYMENT_METHOD$payments_core_release() {
            return StripePaymentController.EXPAND_PAYMENT_METHOD;
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(StripeIntent intent) {
            s.g(intent, "intent");
            return intent instanceof PaymentIntent ? StripePaymentController.PAYMENT_REQUEST_CODE : StripePaymentController.SETUP_REQUEST_CODE;
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(ConfirmStripeIntentParams params) {
            s.g(params, "params");
            if (params instanceof ConfirmPaymentIntentParams) {
                return StripePaymentController.PAYMENT_REQUEST_CODE;
            }
            if (params instanceof ConfirmSetupIntentParams) {
                return StripePaymentController.SETUP_REQUEST_CODE;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentController.StripeIntentType.values().length];
            iArr[PaymentController.StripeIntentType.PaymentIntent.ordinal()] = 1;
            iArr[PaymentController.StripeIntentType.SetupIntent.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<String> d11;
        d11 = v.d("payment_method");
        EXPAND_PAYMENT_METHOD = d11;
        CHALLENGE_DELAY = TimeUnit.SECONDS.toMillis(2L);
    }

    public StripePaymentController(Context context, h00.a<String> publishableKeyProvider, StripeRepository stripeRepository, boolean z11, g workContext, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AlipayRepository alipayRepository, g uiContext) {
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(stripeRepository, "stripeRepository");
        s.g(workContext, "workContext");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(alipayRepository, "alipayRepository");
        s.g(uiContext, "uiContext");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeRepository = stripeRepository;
        this.enableLogging = z11;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.alipayRepository = alipayRepository;
        this.uiContext = uiContext;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
        Logger.Companion companion = Logger.Companion;
        this.paymentIntentFlowResultProcessor = new PaymentIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, companion.getInstance(z11), workContext, new RetryDelaySupplier());
        this.setupIntentFlowResultProcessor = new SetupIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, companion.getInstance(z11), workContext);
        this.defaultReturnUrl = DefaultReturnUrl.Companion.create(context);
        boolean c11 = ek.a.c(context);
        this.isInstantApp = c11;
        this.paymentRelayStarterFactory = new StripePaymentController$paymentRelayStarterFactory$1(this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.threeDs1IntentReturnUrlMap = linkedHashMap;
        this.authenticatorRegistry = DefaultPaymentAuthenticatorRegistry.Companion.createInstance(context, stripeRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, z11, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.getDefaultProductUsageTokens$payments_core_release(), c11);
    }

    /* renamed from: _init_$lambda-0 */
    public static final String m127_init_$lambda0(h00.a tmp0) {
        s.g(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    public static /* synthetic */ String a(h00.a aVar) {
        return m127_init_$lambda0(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object authenticateAlipay(com.stripe.android.model.PaymentIntent r8, com.stripe.android.AlipayAuthenticator r9, com.stripe.android.core.networking.ApiRequest.Options r10, zz.d<? super com.stripe.android.PaymentIntentResult> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.stripe.android.StripePaymentController$authenticateAlipay$1
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.StripePaymentController$authenticateAlipay$1 r0 = (com.stripe.android.StripePaymentController$authenticateAlipay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripePaymentController$authenticateAlipay$1 r0 = new com.stripe.android.StripePaymentController$authenticateAlipay$1
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$0
            com.stripe.android.StripePaymentController r9 = (com.stripe.android.StripePaymentController) r9
            vz.r.b(r11)
            goto L87
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.L$2
            r10 = r8
            com.stripe.android.core.networking.ApiRequest$Options r10 = (com.stripe.android.core.networking.ApiRequest.Options) r10
            java.lang.Object r8 = r0.L$1
            com.stripe.android.model.PaymentIntent r8 = (com.stripe.android.model.PaymentIntent) r8
            java.lang.Object r9 = r0.L$0
            com.stripe.android.StripePaymentController r9 = (com.stripe.android.StripePaymentController) r9
            vz.r.b(r11)
            goto L60
        L4b:
            vz.r.b(r11)
            com.stripe.android.networking.AlipayRepository r11 = r7.alipayRepository
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r11 = r11.authenticate(r8, r9, r10, r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            r9 = r7
        L60:
            com.stripe.android.model.AlipayAuthResult r11 = (com.stripe.android.model.AlipayAuthResult) r11
            int r11 = r11.getOutcome()
            com.stripe.android.networking.StripeRepository r2 = r9.stripeRepository
            java.lang.String r8 = r8.getClientSecret()
            if (r8 != 0) goto L70
            java.lang.String r8 = ""
        L70:
            java.util.List<java.lang.String> r4 = com.stripe.android.StripePaymentController.EXPAND_PAYMENT_METHOD
            r0.L$0 = r9
            r5 = 0
            r0.L$1 = r5
            r0.L$2 = r5
            r0.I$0 = r11
            r0.label = r3
            java.lang.Object r8 = r2.retrievePaymentIntent(r8, r10, r4, r0)
            if (r8 != r1) goto L84
            return r1
        L84:
            r6 = r11
            r11 = r8
            r8 = r6
        L87:
            if (r11 == 0) goto L97
            com.stripe.android.model.PaymentIntent r11 = (com.stripe.android.model.PaymentIntent) r11
            com.stripe.android.PaymentIntentResult r10 = new com.stripe.android.PaymentIntentResult
            com.stripe.android.payments.PaymentFlowFailureMessageFactory r9 = r9.failureMessageFactory
            java.lang.String r9 = r9.create(r11, r8)
            r10.<init>(r11, r8, r9)
            return r10
        L97:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.authenticateAlipay(com.stripe.android.model.PaymentIntent, com.stripe.android.AlipayAuthenticator, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object confirmPaymentIntent(com.stripe.android.model.ConfirmPaymentIntentParams r5, com.stripe.android.core.networking.ApiRequest.Options r6, zz.d<? super com.stripe.android.model.PaymentIntent> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.StripePaymentController$confirmPaymentIntent$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.StripePaymentController$confirmPaymentIntent$1 r0 = (com.stripe.android.StripePaymentController$confirmPaymentIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripePaymentController$confirmPaymentIntent$1 r0 = new com.stripe.android.StripePaymentController$confirmPaymentIntent$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            vz.r.b(r7)
            com.stripe.android.networking.StripeRepository r7 = r4.stripeRepository
            com.stripe.android.model.ConfirmPaymentIntentParams r5 = r5.withShouldUseStripeSdk(r3)
            java.util.List<java.lang.String> r2 = com.stripe.android.StripePaymentController.EXPAND_PAYMENT_METHOD
            r0.label = r3
            java.lang.Object r7 = r7.confirmPaymentIntent$payments_core_release(r5, r6, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            if (r7 == 0) goto L48
            return r7
        L48:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "API request returned an invalid response."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.confirmPaymentIntent(com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object confirmSetupIntent(com.stripe.android.model.ConfirmSetupIntentParams r5, com.stripe.android.core.networking.ApiRequest.Options r6, zz.d<? super com.stripe.android.model.SetupIntent> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.StripePaymentController$confirmSetupIntent$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.StripePaymentController$confirmSetupIntent$1 r0 = (com.stripe.android.StripePaymentController$confirmSetupIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripePaymentController$confirmSetupIntent$1 r0 = new com.stripe.android.StripePaymentController$confirmSetupIntent$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            vz.r.b(r7)
            com.stripe.android.networking.StripeRepository r7 = r4.stripeRepository
            com.stripe.android.model.ConfirmSetupIntentParams r5 = r5.withShouldUseStripeSdk(r3)
            java.util.List<java.lang.String> r2 = com.stripe.android.StripePaymentController.EXPAND_PAYMENT_METHOD
            r0.label = r3
            java.lang.Object r7 = r7.confirmSetupIntent$payments_core_release(r5, r6, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            if (r7 == 0) goto L48
            return r7
        L48:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "API request returned an invalid response."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.confirmSetupIntent(com.stripe.android.model.ConfirmSetupIntentParams, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    public static final PaymentController create(Context context, String str, StripeRepository stripeRepository) {
        return Companion.create(context, str, stripeRepository);
    }

    public static final PaymentController create(Context context, String str, StripeRepository stripeRepository, boolean z11) {
        return Companion.create(context, str, stripeRepository, z11);
    }

    public final Object handleError(AuthActivityStarterHost authActivityStarterHost, int i11, Throwable th2, zz.d<? super b0> dVar) {
        Object d11;
        Object g11 = i.g(this.uiContext, new StripePaymentController$handleError$2(this, authActivityStarterHost, th2, i11, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    private final void logReturnUrl(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (s.c(str, this.defaultReturnUrl.getValue())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlDefault;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlNull;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlCustom;
        }
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    public final Object onSourceRetrieved(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, zz.d<? super b0> dVar) {
        Object d11;
        Object authenticate = this.authenticatorRegistry.getAuthenticator(source).authenticate(authActivityStarterHost, source, options, dVar);
        d11 = a00.d.d();
        return authenticate == d11 ? authenticate : b0.f54756a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006a A[PHI: r9 
      PHI: (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:45:0x0067, B:36:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object confirmAndAuthenticateAlipay(com.stripe.android.model.ConfirmPaymentIntentParams r6, com.stripe.android.AlipayAuthenticator r7, com.stripe.android.core.networking.ApiRequest.Options r8, zz.d<? super com.stripe.android.PaymentIntentResult> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1 r0 = (com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1 r0 = new com.stripe.android.StripePaymentController$confirmAndAuthenticateAlipay$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            vz.r.b(r9)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            com.stripe.android.StripePaymentController r6 = (com.stripe.android.StripePaymentController) r6
            java.lang.Object r7 = r0.L$1
            r8 = r7
            com.stripe.android.core.networking.ApiRequest$Options r8 = (com.stripe.android.core.networking.ApiRequest.Options) r8
            java.lang.Object r7 = r0.L$0
            com.stripe.android.AlipayAuthenticator r7 = (com.stripe.android.AlipayAuthenticator) r7
            vz.r.b(r9)
            goto L58
        L45:
            vz.r.b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r9 = r5.confirmPaymentIntent(r6, r8, r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            com.stripe.android.model.PaymentIntent r9 = (com.stripe.android.model.PaymentIntent) r9
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r9 = r6.authenticateAlipay(r9, r7, r8, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.confirmAndAuthenticateAlipay(com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.AlipayAuthenticator, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object confirmWeChatPay(com.stripe.android.model.ConfirmPaymentIntentParams r5, com.stripe.android.core.networking.ApiRequest.Options r6, zz.d<? super com.stripe.android.model.WeChatPayNextAction> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.StripePaymentController$confirmWeChatPay$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.StripePaymentController$confirmWeChatPay$1 r0 = (com.stripe.android.StripePaymentController$confirmWeChatPay$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.StripePaymentController$confirmWeChatPay$1 r0 = new com.stripe.android.StripePaymentController$confirmWeChatPay$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            vz.r.b(r7)
            r0.label = r3
            java.lang.Object r7 = r4.confirmPaymentIntent(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            com.stripe.android.model.PaymentIntent r7 = (com.stripe.android.model.PaymentIntent) r7
            com.stripe.android.model.StripeIntent$NextActionData r5 = r7.getNextActionData()
            boolean r5 = r5 instanceof com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect
            if (r5 == 0) goto L57
            com.stripe.android.model.WeChatPayNextAction r5 = new com.stripe.android.model.WeChatPayNextAction
            com.stripe.android.model.StripeIntent$NextActionData r6 = r7.getNextActionData()
            com.stripe.android.model.StripeIntent$NextActionData$WeChatPayRedirect r6 = (com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect) r6
            com.stripe.android.model.WeChat r6 = r6.getWeChat()
            r5.<init>(r7, r6)
            return r5
        L57:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unable to confirm Payment Intent with WeChatPay SDK"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.confirmWeChatPay(com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getAuthenticateSourceResult(android.content.Intent r23, zz.d<? super com.stripe.android.model.Source> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1
            if (r2 == 0) goto L17
            r2 = r1
            com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1 r2 = (com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1 r2 = new com.stripe.android.StripePaymentController$getAuthenticateSourceResult$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = a00.b.d()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            vz.r.b(r1)
            goto L8b
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            vz.r.b(r1)
            com.stripe.android.payments.PaymentFlowResult$Unvalidated$Companion r1 = com.stripe.android.payments.PaymentFlowResult.Unvalidated.Companion
            r4 = r23
            com.stripe.android.payments.PaymentFlowResult$Unvalidated r1 = r1.fromIntent(r4)
            java.lang.String r4 = r1.getSourceId$payments_core_release()
            java.lang.String r6 = ""
            if (r4 != 0) goto L49
            r4 = r6
        L49:
            java.lang.String r7 = r1.getClientSecret()
            if (r7 != 0) goto L50
            goto L51
        L50:
            r6 = r7
        L51:
            com.stripe.android.core.networking.ApiRequest$Options r13 = new com.stripe.android.core.networking.ApiRequest$Options
            h00.a<java.lang.String> r7 = r0.publishableKeyProvider
            java.lang.Object r7 = r7.invoke()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r1.getStripeAccountId$payments_core_release()
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            com.stripe.android.core.networking.AnalyticsRequestExecutor r1 = r0.analyticsRequestExecutor
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r14 = r0.paymentAnalyticsRequestFactory
            com.stripe.android.networking.PaymentAnalyticsEvent r15 = com.stripe.android.networking.PaymentAnalyticsEvent.AuthSourceResult
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 30
            r21 = 0
            com.stripe.android.core.networking.AnalyticsRequest r7 = com.stripe.android.networking.PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(r14, r15, r16, r17, r18, r19, r20, r21)
            r1.executeAsync(r7)
            com.stripe.android.networking.StripeRepository r1 = r0.stripeRepository
            r2.label = r5
            java.lang.Object r1 = r1.retrieveSource$payments_core_release(r4, r6, r13, r2)
            if (r1 != r3) goto L8b
            return r3
        L8b:
            if (r1 == 0) goto L8e
            return r1
        L8e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.getAuthenticateSourceResult(android.content.Intent, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.PaymentController
    public Object getPaymentIntentResult(Intent intent, zz.d<? super PaymentIntentResult> dVar) {
        return this.paymentIntentFlowResultProcessor.processResult(PaymentFlowResult.Unvalidated.Companion.fromIntent(intent), dVar);
    }

    @Override // com.stripe.android.PaymentController
    public Object getSetupIntentResult(Intent intent, zz.d<? super SetupIntentResult> dVar) {
        return this.setupIntentFlowResultProcessor.processResult(PaymentFlowResult.Unvalidated.Companion.fromIntent(intent), dVar);
    }

    @Override // com.stripe.android.PaymentController
    public Object handleNextAction(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, zz.d<? super b0> dVar) {
        Object d11;
        Object authenticate = this.authenticatorRegistry.getAuthenticator(stripeIntent).authenticate(authActivityStarterHost, stripeIntent, options, dVar);
        d11 = a00.d.d();
        return authenticate == d11 ? authenticate : b0.f54756a;
    }

    @Override // com.stripe.android.PaymentController
    public void registerLaunchersWithActivityResultCaller(androidx.activity.result.c activityResultCaller, androidx.activity.result.b<PaymentFlowResult.Unvalidated> activityResultCallback) {
        s.g(activityResultCaller, "activityResultCaller");
        s.g(activityResultCallback, "activityResultCallback");
        this.paymentRelayLauncher = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.authenticatorRegistry.onNewActivityResultCaller(activityResultCaller, activityResultCallback);
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandlePaymentResult(int i11, Intent intent) {
        return i11 == 50000 && intent != null;
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandleSetupResult(int i11, Intent intent) {
        return i11 == 50001 && intent != null;
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandleSourceResult(int i11, Intent intent) {
        return i11 == 50002 && intent != null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|(2:59|(1:(1:(3:66|30|31)(2:64|65))(4:67|68|69|22))(4:70|71|72|53))(5:9|10|11|12|(1:(4:15|16|17|(1:19)(2:21|22))(3:46|47|48))(2:49|(1:51)(2:52|53)))|(5:24|25|(2:27|(1:29))(4:32|(2:34|(1:36)(2:40|41))(1:42)|37|(1:39))|30|31)(2:43|44)))|76|6|7|(0)(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00ed, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00dc A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:117:0x00b1, B:128:0x00dc, B:129:0x00e1, B:130:0x00ec, B:126:0x00d8), top: B:160:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e1 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:117:0x00b1, B:128:0x00dc, B:129:0x00e1, B:130:0x00ec, B:126:0x00d8), top: B:160:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startAuth(com.stripe.android.view.AuthActivityStarterHost r18, java.lang.String r19, com.stripe.android.core.networking.ApiRequest.Options r20, com.stripe.android.PaymentController.StripeIntentType r21, zz.d<? super vz.b0> r22) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.startAuth(com.stripe.android.view.AuthActivityStarterHost, java.lang.String, com.stripe.android.core.networking.ApiRequest$Options, com.stripe.android.PaymentController$StripeIntentType, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0094 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #2 {all -> 0x004f, blocks: (B:80:0x004b, B:100:0x0094, B:101:0x009b, B:102:0x00a6), top: B:123:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009b A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:80:0x004b, B:100:0x0094, B:101:0x009b, B:102:0x00a6), top: B:123:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0052  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startAuthenticateSource(com.stripe.android.view.AuthActivityStarterHost r18, com.stripe.android.model.Source r19, com.stripe.android.core.networking.ApiRequest.Options r20, zz.d<? super vz.b0> r21) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.startAuthenticateSource(com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.model.Source, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(2:65|(1:(1:(3:72|37|38)(2:70|71))(4:73|74|75|49))(4:76|77|78|20))(5:9|(1:11)(5:55|(2:57|(3:59|(1:61)|(1:63)))|64|(0)|(0))|12|13|(2:15|(1:17)(2:19|20))(2:43|(2:45|(1:47)(2:48|49))(2:50|51)))|21|22|(4:24|(3:30|(1:32)|33)|34|(1:36))(2:39|(1:41))|37|38))|82|6|7|(0)(0)|21|22|(0)(0)|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00d4, code lost:
        r2 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startConfirmAndAuth(com.stripe.android.view.AuthActivityStarterHost r10, com.stripe.android.model.ConfirmStripeIntentParams r11, com.stripe.android.core.networking.ApiRequest.Options r12, zz.d<? super vz.b0> r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.startConfirmAndAuth(com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.model.ConfirmStripeIntentParams, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.PaymentController
    public void unregisterLaunchers() {
        androidx.activity.result.d<PaymentRelayStarter.Args> dVar = this.paymentRelayLauncher;
        if (dVar != null) {
            dVar.d();
        }
        this.paymentRelayLauncher = null;
        this.authenticatorRegistry.onLauncherInvalidated();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ StripePaymentController(android.content.Context r13, final h00.a r14, com.stripe.android.networking.StripeRepository r15, boolean r16, zz.g r17, com.stripe.android.core.networking.AnalyticsRequestExecutor r18, com.stripe.android.networking.PaymentAnalyticsRequestFactory r19, com.stripe.android.networking.AlipayRepository r20, zz.g r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 8
            if (r1 == 0) goto L9
            r1 = 0
            r6 = r1
            goto Lb
        L9:
            r6 = r16
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L15
            v20.j0 r1 = v20.e1.b()
            r7 = r1
            goto L17
        L15:
            r7 = r17
        L17:
            r1 = r0 & 32
            if (r1 == 0) goto L28
            com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor r1 = new com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor
            com.stripe.android.core.Logger$Companion r2 = com.stripe.android.core.Logger.Companion
            com.stripe.android.core.Logger r2 = r2.getInstance(r6)
            r1.<init>(r2, r7)
            r8 = r1
            goto L2a
        L28:
            r8 = r18
        L2a:
            r1 = r0 & 64
            if (r1 == 0) goto L44
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r1 = new com.stripe.android.networking.PaymentAnalyticsRequestFactory
            android.content.Context r2 = r13.getApplicationContext()
            java.lang.String r3 = "constructor(\n    context…nvalid response.\"\n    }\n}"
            kotlin.jvm.internal.s.f(r2, r3)
            com.stripe.android.d r3 = new com.stripe.android.d
            r4 = r14
            r3.<init>()
            r1.<init>(r2, r3)
            r9 = r1
            goto L47
        L44:
            r4 = r14
            r9 = r19
        L47:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L53
            com.stripe.android.networking.DefaultAlipayRepository r1 = new com.stripe.android.networking.DefaultAlipayRepository
            r5 = r15
            r1.<init>(r15)
            r10 = r1
            goto L56
        L53:
            r5 = r15
            r10 = r20
        L56:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L60
            v20.l2 r0 = v20.e1.c()
            r11 = r0
            goto L62
        L60:
            r11 = r21
        L62:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController.<init>(android.content.Context, h00.a, com.stripe.android.networking.StripeRepository, boolean, zz.g, com.stripe.android.core.networking.AnalyticsRequestExecutor, com.stripe.android.networking.PaymentAnalyticsRequestFactory, com.stripe.android.networking.AlipayRepository, zz.g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}