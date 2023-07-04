package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.googlepaylauncher.StripeGooglePayContract;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import v20.e1;
import vz.q;

/* loaded from: classes6.dex */
public final class StripeGooglePayViewModel extends androidx.lifecycle.b {
    private final f0<GooglePayLauncherResult> _googleResult;
    private final String appName;
    private final StripeGooglePayContract.Args args;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final LiveData<GooglePayLauncherResult> googlePayResult;
    private boolean hasLaunched;
    private PaymentMethod paymentMethod;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final zz.g workContext;

    public /* synthetic */ StripeGooglePayViewModel(Application application, String str, String str2, StripeGooglePayContract.Args args, StripeRepository stripeRepository, String str3, zz.g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, (i11 & 4) != 0 ? null : str2, args, stripeRepository, str3, gVar);
    }

    public final IsReadyToPayRequest createIsReadyToPayRequest() {
        IsReadyToPayRequest fromJson = IsReadyToPayRequest.fromJson(GooglePayJsonFactory.createIsReadyToPayRequest$default(this.googlePayJsonFactory, null, null, null, 7, null).toString());
        s.f(fromJson, "fromJson(\n            go…st().toString()\n        )");
        return fromJson;
    }

    public final JSONObject createPaymentDataRequestForPaymentIntentArgs() {
        GooglePayJsonFactory googlePayJsonFactory = this.googlePayJsonFactory;
        GooglePayJsonFactory.TransactionInfo transactionInfo = new GooglePayJsonFactory.TransactionInfo(this.args.getConfig().getCurrencyCode$payments_core_release(), GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Final, this.args.getConfig().getCountryCode$payments_core_release(), this.args.getConfig().getTransactionId$payments_core_release(), this.args.getConfig().getAmount$payments_core_release(), null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.CompleteImmediatePurchase, 32, null);
        String merchantName$payments_core_release = this.args.getConfig().getMerchantName$payments_core_release();
        if (merchantName$payments_core_release == null) {
            merchantName$payments_core_release = this.appName;
        }
        return GooglePayJsonFactory.createPaymentDataRequest$default(googlePayJsonFactory, transactionInfo, new GooglePayJsonFactory.BillingAddressParameters(true, GooglePayJsonFactory.BillingAddressParameters.Format.Min, false), null, this.args.getConfig().isEmailRequired$payments_core_release(), new GooglePayJsonFactory.MerchantInfo(merchantName$payments_core_release), null, 36, null);
    }

    public final LiveData<q<PaymentMethod>> createPaymentMethod(PaymentMethodCreateParams params) {
        s.g(params, "params");
        return androidx.lifecycle.g.b(null, 0L, new StripeGooglePayViewModel$createPaymentMethod$1(this, params, null), 3, null);
    }

    public final LiveData<GooglePayLauncherResult> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final boolean getHasLaunched() {
        return this.hasLaunched;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final void setHasLaunched(boolean z11) {
        this.hasLaunched = z11;
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public final void updateGooglePayResult(GooglePayLauncherResult result) {
        s.g(result, "result");
        this._googleResult.setValue(result);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeGooglePayViewModel(Application application, String publishableKey, String str, StripeGooglePayContract.Args args, StripeRepository stripeRepository, String appName, zz.g workContext) {
        super(application);
        s.g(application, "application");
        s.g(publishableKey, "publishableKey");
        s.g(args, "args");
        s.g(stripeRepository, "stripeRepository");
        s.g(appName, "appName");
        s.g(workContext, "workContext");
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.appName = appName;
        this.workContext = workContext;
        this.googlePayJsonFactory = new GooglePayJsonFactory((Context) application, false, 2, (DefaultConstructorMarker) null);
        f0<GooglePayLauncherResult> f0Var = new f0<>();
        this._googleResult = f0Var;
        LiveData<GooglePayLauncherResult> a11 = o0.a(f0Var);
        s.f(a11, "distinctUntilChanged(this)");
        this.googlePayResult = a11;
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b {
        private final Application application;
        private final StripeGooglePayContract.Args args;
        private final String publishableKey;
        private final String stripeAccountId;

        public Factory(Application application, String publishableKey, String str, StripeGooglePayContract.Args args) {
            s.g(application, "application");
            s.g(publishableKey, "publishableKey");
            s.g(args, "args");
            this.application = application;
            this.publishableKey = publishableKey;
            this.stripeAccountId = str;
            this.args = args;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            s.g(modelClass, "modelClass");
            return new StripeGooglePayViewModel(this.application, this.publishableKey, this.stripeAccountId, this.args, new StripeApiRepository(this.application, new StripeGooglePayViewModel$Factory$create$1(this), null, null, null, null, null, null, null, null, null, null, null, null, 16380, null), this.application.getApplicationInfo().loadLabel(this.application.getPackageManager()).toString(), e1.b());
        }

        public /* synthetic */ Factory(Application application, String str, String str2, StripeGooglePayContract.Args args, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(application, str, (i11 & 4) != 0 ? null : str2, args);
        }
    }
}