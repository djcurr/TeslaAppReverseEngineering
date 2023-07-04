package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.google.android.gms.wallet.PaymentsClient;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.PaymentController;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.k;
import vz.b0;
import wz.w0;

/* loaded from: classes6.dex */
public final class GooglePayLauncherViewModel extends p0 {
    private final f0<GooglePayLauncher.Result> _googleResult;
    private final GooglePayLauncherContract.Args args;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final GooglePayRepository googlePayRepository;
    private final LiveData<GooglePayLauncher.Result> googlePayResult;
    private boolean hasLaunched;
    private final PaymentController paymentController;
    private final PaymentsClient paymentsClient;
    private final ApiRequest.Options requestOptions;
    private final StripeRepository stripeRepository;

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GooglePayLauncher.BillingAddressConfig.Format.values().length];
            iArr[GooglePayLauncher.BillingAddressConfig.Format.Min.ordinal()] = 1;
            iArr[GooglePayLauncher.BillingAddressConfig.Format.Full.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GooglePayLauncherViewModel(PaymentsClient paymentsClient, ApiRequest.Options requestOptions, GooglePayLauncherContract.Args args, StripeRepository stripeRepository, PaymentController paymentController, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository) {
        s.g(paymentsClient, "paymentsClient");
        s.g(requestOptions, "requestOptions");
        s.g(args, "args");
        s.g(stripeRepository, "stripeRepository");
        s.g(paymentController, "paymentController");
        s.g(googlePayJsonFactory, "googlePayJsonFactory");
        s.g(googlePayRepository, "googlePayRepository");
        this.paymentsClient = paymentsClient;
        this.requestOptions = requestOptions;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = googlePayRepository;
        f0<GooglePayLauncher.Result> f0Var = new f0<>();
        this._googleResult = f0Var;
        LiveData<GooglePayLauncher.Result> a11 = o0.a(f0Var);
        s.f(a11, "distinctUntilChanged(this)");
        this.googlePayResult = a11;
    }

    public final Object confirmStripeIntent(AuthActivityStarterHost authActivityStarterHost, PaymentMethodCreateParams paymentMethodCreateParams, zz.d<? super b0> dVar) {
        ConfirmStripeIntentParams create$default;
        Object d11;
        GooglePayLauncherContract.Args args = this.args;
        if (args instanceof GooglePayLauncherContract.PaymentIntentArgs) {
            create$default = ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.Companion, paymentMethodCreateParams, args.getClientSecret$payments_core_release(), null, null, null, null, null, null, 252, null);
        } else if (args instanceof GooglePayLauncherContract.SetupIntentArgs) {
            create$default = ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.Companion, paymentMethodCreateParams, args.getClientSecret$payments_core_release(), (MandateDataParams) null, (String) null, 12, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object startConfirmAndAuth = this.paymentController.startConfirmAndAuth(authActivityStarterHost, create$default, this.requestOptions, dVar);
        d11 = a00.d.d();
        return startConfirmAndAuth == d11 ? startConfirmAndAuth : b0.f54756a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createLoadPaymentDataTask(zz.d<? super com.google.android.gms.tasks.Task<com.google.android.gms.wallet.PaymentData>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$createLoadPaymentDataTask$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$createLoadPaymentDataTask$1 r0 = (com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$createLoadPaymentDataTask$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$createLoadPaymentDataTask$1 r0 = new com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$createLoadPaymentDataTask$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            com.google.android.gms.wallet.PaymentsClient r0 = (com.google.android.gms.wallet.PaymentsClient) r0
            vz.r.b(r7)
            goto L69
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.L$0
            com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel r2 = (com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel) r2
            vz.r.b(r7)
            goto L4f
        L40:
            vz.r.b(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r6.isReadyToPay(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r6
        L4f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7d
            com.google.android.gms.wallet.PaymentsClient r7 = r2.paymentsClient
            com.stripe.android.googlepaylauncher.GooglePayLauncherContract$Args r4 = r2.args
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = r2.createPaymentDataRequest(r4, r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            r5 = r0
            r0 = r7
            r7 = r5
        L69:
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r7 = r7.toString()
            com.google.android.gms.wallet.PaymentDataRequest r7 = com.google.android.gms.wallet.PaymentDataRequest.fromJson(r7)
            com.google.android.gms.tasks.Task r7 = r0.loadPaymentData(r7)
            java.lang.String r0 = "paymentsClient.loadPayme…)\n            )\n        )"
            kotlin.jvm.internal.s.f(r7, r0)
            return r7
        L7d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Google Pay is unavailable."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel.createLoadPaymentDataTask(zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createPaymentDataRequest(com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args r15, zz.d<? super org.json.JSONObject> r16) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel.createPaymentDataRequest(com.stripe.android.googlepaylauncher.GooglePayLauncherContract$Args, zz.d):java.lang.Object");
    }

    public final GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release(StripeIntent stripeIntent, String currencyCode) {
        s.g(stripeIntent, "stripeIntent");
        s.g(currencyCode, "currencyCode");
        if (stripeIntent instanceof PaymentIntent) {
            GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus = GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Final;
            String merchantCountryCode = this.args.getConfig$payments_core_release().getMerchantCountryCode();
            String id2 = stripeIntent.getId();
            Long amount = ((PaymentIntent) stripeIntent).getAmount();
            return new GooglePayJsonFactory.TransactionInfo(currencyCode, totalPriceStatus, merchantCountryCode, id2, amount == null ? null : Integer.valueOf((int) amount.longValue()), null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.CompleteImmediatePurchase, 32, null);
        } else if (stripeIntent instanceof SetupIntent) {
            return new GooglePayJsonFactory.TransactionInfo(currencyCode, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, this.args.getConfig$payments_core_release().getMerchantCountryCode(), stripeIntent.getId(), 0, null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default, 32, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final LiveData<GooglePayLauncher.Result> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final boolean getHasLaunched() {
        return this.hasLaunched;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(2:11|12)(2:20|21))(2:22|23))(3:24|25|(3:27|(1:29)|23)(2:30|(3:32|(1:34)|12)(2:35|36)))|13|14|(1:19)(2:16|17)))|39|6|7|(0)(0)|13|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        r7 = vz.q.f54772b;
        r6 = vz.q.b(vz.r.a(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getResultFromConfirmation$payments_core_release(int r6, android.content.Intent r7, zz.d<? super com.stripe.android.googlepaylauncher.GooglePayLauncher.Result> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$getResultFromConfirmation$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$getResultFromConfirmation$1 r0 = (com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$getResultFromConfirmation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$getResultFromConfirmation$1 r0 = new com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$getResultFromConfirmation$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L75
            goto L66
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L75
            goto L50
        L38:
            vz.r.b(r8)
            vz.q$a r8 = vz.q.f54772b     // Catch: java.lang.Throwable -> L75
            com.stripe.android.PaymentController r8 = r5.paymentController     // Catch: java.lang.Throwable -> L75
            boolean r8 = r8.shouldHandlePaymentResult(r6, r7)     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L53
            com.stripe.android.PaymentController r6 = r5.paymentController     // Catch: java.lang.Throwable -> L75
            r0.label = r4     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r6.getPaymentIntentResult(r7, r0)     // Catch: java.lang.Throwable -> L75
            if (r6 != r1) goto L50
            return r1
        L50:
            com.stripe.android.googlepaylauncher.GooglePayLauncher$Result$Completed r6 = com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Completed.INSTANCE     // Catch: java.lang.Throwable -> L75
            goto L68
        L53:
            com.stripe.android.PaymentController r8 = r5.paymentController     // Catch: java.lang.Throwable -> L75
            boolean r6 = r8.shouldHandleSetupResult(r6, r7)     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L6d
            com.stripe.android.PaymentController r6 = r5.paymentController     // Catch: java.lang.Throwable -> L75
            r0.label = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r6.getSetupIntentResult(r7, r0)     // Catch: java.lang.Throwable -> L75
            if (r6 != r1) goto L66
            return r1
        L66:
            com.stripe.android.googlepaylauncher.GooglePayLauncher$Result$Completed r6 = com.stripe.android.googlepaylauncher.GooglePayLauncher.Result.Completed.INSTANCE     // Catch: java.lang.Throwable -> L75
        L68:
            java.lang.Object r6 = vz.q.b(r6)     // Catch: java.lang.Throwable -> L75
            goto L80
        L6d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "Unexpected confirmation result."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L75
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            vz.q$a r7 = vz.q.f54772b
            java.lang.Object r6 = vz.r.a(r6)
            java.lang.Object r6 = vz.q.b(r6)
        L80:
            java.lang.Throwable r7 = vz.q.e(r6)
            if (r7 != 0) goto L87
            goto L8c
        L87:
            com.stripe.android.googlepaylauncher.GooglePayLauncher$Result$Failed r6 = new com.stripe.android.googlepaylauncher.GooglePayLauncher$Result$Failed
            r6.<init>(r7)
        L8c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel.getResultFromConfirmation$payments_core_release(int, android.content.Intent, zz.d):java.lang.Object");
    }

    public final Object isReadyToPay(zz.d<? super Boolean> dVar) {
        return kotlinx.coroutines.flow.g.r(this.googlePayRepository.isReady(), dVar);
    }

    public final void onConfirmResult(int i11, Intent data) {
        s.g(data, "data");
        k.d(q0.a(this), null, null, new GooglePayLauncherViewModel$onConfirmResult$1(this, i11, data, null), 3, null);
    }

    public final void setHasLaunched(boolean z11) {
        this.hasLaunched = z11;
    }

    public final void updateResult(GooglePayLauncher.Result result) {
        s.g(result, "result");
        this._googleResult.setValue(result);
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b {
        private final Application application;
        private final GooglePayLauncherContract.Args args;
        private final boolean enableLogging;
        private final zz.g workContext;

        public Factory(Application application, GooglePayLauncherContract.Args args, boolean z11, zz.g workContext) {
            s.g(application, "application");
            s.g(args, "args");
            s.g(workContext, "workContext");
            this.application = application;
            this.args = args;
            this.enableLogging = z11;
            this.workContext = workContext;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            Set c11;
            s.g(modelClass, "modelClass");
            GooglePayEnvironment environment = this.args.getConfig$payments_core_release().getEnvironment();
            Logger companion = Logger.Companion.getInstance(this.enableLogging);
            PaymentConfiguration companion2 = PaymentConfiguration.Companion.getInstance(this.application);
            String publishableKey = companion2.getPublishableKey();
            String stripeAccountId = companion2.getStripeAccountId();
            c11 = w0.c(GooglePayLauncher.PRODUCT_USAGE);
            StripeApiRepository stripeApiRepository = new StripeApiRepository(this.application, new GooglePayLauncherViewModel$Factory$create$stripeRepository$1(publishableKey), null, companion, this.workContext, c11, null, null, null, new PaymentAnalyticsRequestFactory(this.application, publishableKey, c11), null, null, null, null, 15812, null);
            return new GooglePayLauncherViewModel(new PaymentsClientFactory(this.application).create(environment), new ApiRequest.Options(publishableKey, stripeAccountId, null, 4, null), this.args, stripeApiRepository, new StripePaymentController(this.application, new GooglePayLauncherViewModel$Factory$create$1(publishableKey), stripeApiRepository, this.enableLogging, this.workContext, null, null, null, null, 480, null), new GooglePayJsonFactory(new com.stripe.android.GooglePayConfig(publishableKey, stripeAccountId), this.args.getConfig$payments_core_release().isJcbEnabled$payments_core_release()), new DefaultGooglePayRepository(this.application, this.args.getConfig$payments_core_release().getEnvironment(), GooglePayConfigConversionKtxKt.convert(this.args.getConfig$payments_core_release().getBillingAddressConfig()), this.args.getConfig$payments_core_release().getExistingPaymentMethodRequired(), this.args.getConfig$payments_core_release().getAllowCreditCards(), companion));
        }

        public /* synthetic */ Factory(Application application, GooglePayLauncherContract.Args args, boolean z11, zz.g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(application, args, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? e1.b() : gVar);
        }
    }
}