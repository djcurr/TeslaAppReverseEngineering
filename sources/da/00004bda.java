package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.w;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.model.StripeFile;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.AccountParams;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.CvcTokenParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PersonTokenParams;
import com.stripe.android.model.PiiTokenParams;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.StripeRepository;
import h00.l;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.e1;
import v20.i;
import v20.j;
import v20.k;
import v20.p0;
import vz.b0;
import wz.x0;
import zz.g;

/* loaded from: classes2.dex */
public final class Stripe {
    public static final String VERSION = "AndroidBindings/20.5.0";
    public static final String VERSION_NAME = "20.5.0";
    private static AppInfo appInfo;
    private final PaymentController paymentController;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final g workContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final String API_VERSION = ApiVersion.Companion.get().getCode();
    private static boolean advancedFraudSignalsEnabled = true;

    /* renamed from: com.stripe.android.Stripe$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends u implements h00.a<String> {
        final /* synthetic */ String $publishableKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(0);
            this.$publishableKey = str;
        }

        @Override // h00.a
        public final String invoke() {
            return this.$publishableKey;
        }
    }

    /* renamed from: com.stripe.android.Stripe$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends u implements h00.a<String> {
        final /* synthetic */ String $publishableKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            this.$publishableKey = str;
        }

        @Override // h00.a
        public final String invoke() {
            return this.$publishableKey;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getAdvancedFraudSignalsEnabled$annotations() {
        }

        public static /* synthetic */ void getAppInfo$annotations() {
        }

        public static /* synthetic */ void getVERSION$annotations() {
        }

        public static /* synthetic */ void getVERSION_NAME$annotations() {
        }

        public final boolean getAdvancedFraudSignalsEnabled() {
            return Stripe.advancedFraudSignalsEnabled;
        }

        public final AppInfo getAppInfo() {
            return Stripe.appInfo;
        }

        public final void setAdvancedFraudSignalsEnabled(boolean z11) {
            Stripe.advancedFraudSignalsEnabled = z11;
        }

        public final void setAppInfo(AppInfo appInfo) {
            Stripe.appInfo = appInfo;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(Context context, String publishableKey) {
        this(context, publishableKey, (String) null, false, (Set) null, 28, (DefaultConstructorMarker) null);
        s.g(context, "context");
        s.g(publishableKey, "publishableKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(Context context, String publishableKey, String str) {
        this(context, publishableKey, str, false, (Set) null, 24, (DefaultConstructorMarker) null);
        s.g(context, "context");
        s.g(publishableKey, "publishableKey");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(Context context, String publishableKey, String str, boolean z11) {
        this(context, publishableKey, str, z11, (Set) null, 16, (DefaultConstructorMarker) null);
        s.g(context, "context");
        s.g(publishableKey, "publishableKey");
    }

    public Stripe(StripeRepository stripeRepository, PaymentController paymentController, String publishableKey, String str, g workContext) {
        s.g(stripeRepository, "stripeRepository");
        s.g(paymentController, "paymentController");
        s.g(publishableKey, "publishableKey");
        s.g(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.stripeAccountId = str;
        this.workContext = workContext;
        this.publishableKey = new ApiKeyValidator().requireValid(publishableKey);
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, ComponentActivity componentActivity, Source source, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(componentActivity, source, str);
    }

    public static /* synthetic */ void confirmAlipayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmAlipayPayment(confirmPaymentIntentParams, alipayAuthenticator, str, apiResultCallback);
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, ComponentActivity componentActivity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(componentActivity, confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ PaymentIntent confirmPaymentIntentSynchronous$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return stripe.confirmPaymentIntentSynchronous(confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, ComponentActivity componentActivity, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(componentActivity, confirmSetupIntentParams, str);
    }

    public static /* synthetic */ SetupIntent confirmSetupIntentSynchronous$default(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return stripe.confirmSetupIntentSynchronous(confirmSetupIntentParams, str);
    }

    public static /* synthetic */ void confirmWeChatPayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmWeChatPayPayment(confirmPaymentIntentParams, str, apiResultCallback);
    }

    public static /* synthetic */ void createAccountToken$default(Stripe stripe, AccountParams accountParams, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createAccountToken(accountParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createAccountTokenSynchronous$default(Stripe stripe, AccountParams accountParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createAccountTokenSynchronous(accountParams, str, str2);
    }

    public static /* synthetic */ void createBankAccountToken$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createBankAccountToken(bankAccountTokenParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createBankAccountTokenSynchronous$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createBankAccountTokenSynchronous(bankAccountTokenParams, str, str2);
    }

    public static /* synthetic */ void createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createCardToken(cardParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createCardTokenSynchronous$default(Stripe stripe, CardParams cardParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createCardTokenSynchronous(cardParams, str, str2);
    }

    public static /* synthetic */ void createCvcUpdateToken$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.createCvcUpdateToken(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Token createCvcUpdateTokenSynchronous$default(Stripe stripe, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.createCvcUpdateTokenSynchronous(str, str2, str3);
    }

    public static /* synthetic */ void createFile$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createFile(stripeFileParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ StripeFile createFileSynchronous$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createFileSynchronous(stripeFileParams, str, str2);
    }

    public static /* synthetic */ void createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPaymentMethod(paymentMethodCreateParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ PaymentMethod createPaymentMethodSynchronous$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createPaymentMethodSynchronous(paymentMethodCreateParams, str, str2);
    }

    public static /* synthetic */ void createPersonToken$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPersonToken(personTokenParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Token createPersonTokenSynchronous$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createPersonTokenSynchronous(personTokenParams, str, str2);
    }

    public static /* synthetic */ void createPiiToken$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.createPiiToken(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Token createPiiTokenSynchronous$default(Stripe stripe, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.createPiiTokenSynchronous(str, str2, str3);
    }

    public static /* synthetic */ void createRadarSession$default(Stripe stripe, String str, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.createRadarSession(str, apiResultCallback);
    }

    public static /* synthetic */ void createSource$default(Stripe stripe, SourceParams sourceParams, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createSource(sourceParams, str, str2, apiResultCallback);
    }

    public static /* synthetic */ Source createSourceSynchronous$default(Stripe stripe, SourceParams sourceParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.createSourceSynchronous(sourceParams, str, str2);
    }

    private final void createToken(TokenParams tokenParams, String str, String str2, ApiResultCallback<? super Token> apiResultCallback) {
        executeAsync(apiResultCallback, new Stripe$createToken$1(this, tokenParams, str, str2, null));
    }

    static /* synthetic */ void createToken$default(Stripe stripe, TokenParams tokenParams, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        stripe.createToken(tokenParams, str, str2, apiResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends StripeModel> Object dispatchResult(Object obj, ApiResultCallback<? super T> apiResultCallback, zz.d<? super b0> dVar) {
        Object d11;
        Object g11 = i.g(e1.c(), new Stripe$dispatchResult$2(obj, apiResultCallback, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    private final <T extends StripeModel> void executeAsync(ApiResultCallback<? super T> apiResultCallback, l<? super zz.d<? super T>, ? extends Object> lVar) {
        k.d(p0.a(this.workContext), null, null, new Stripe$executeAsync$1(this, apiResultCallback, lVar, null), 3, null);
    }

    public static final boolean getAdvancedFraudSignalsEnabled() {
        return Companion.getAdvancedFraudSignalsEnabled();
    }

    public static final AppInfo getAppInfo() {
        return Companion.getAppInfo();
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, ComponentActivity componentActivity, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(componentActivity, str, str2);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, ComponentActivity componentActivity, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(componentActivity, str, str2);
    }

    public static /* synthetic */ void retrievePaymentIntent$default(Stripe stripe, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.retrievePaymentIntent(str, str2, apiResultCallback);
    }

    public static /* synthetic */ PaymentIntent retrievePaymentIntentSynchronous$default(Stripe stripe, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.retrievePaymentIntentSynchronous(str, str2);
    }

    public static /* synthetic */ void retrieveSetupIntent$default(Stripe stripe, String str, String str2, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.retrieveSetupIntent(str, str2, apiResultCallback);
    }

    public static /* synthetic */ SetupIntent retrieveSetupIntentSynchronous$default(Stripe stripe, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = stripe.stripeAccountId;
        }
        return stripe.retrieveSetupIntentSynchronous(str, str2);
    }

    public static /* synthetic */ void retrieveSource$default(Stripe stripe, String str, String str2, String str3, ApiResultCallback apiResultCallback, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        stripe.retrieveSource(str, str2, str3, apiResultCallback);
    }

    public static /* synthetic */ Source retrieveSourceSynchronous$default(Stripe stripe, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = stripe.stripeAccountId;
        }
        return stripe.retrieveSourceSynchronous(str, str2, str3);
    }

    public static final void setAdvancedFraudSignalsEnabled(boolean z11) {
        Companion.setAdvancedFraudSignalsEnabled(z11);
    }

    public static final void setAppInfo(AppInfo appInfo2) {
        Companion.setAppInfo(appInfo2);
    }

    public final void authenticateSource(ComponentActivity activity, Source source) {
        s.g(activity, "activity");
        s.g(source, "source");
        authenticateSource$default(this, activity, source, (String) null, 4, (Object) null);
    }

    public final void authenticateSource(ComponentActivity activity, Source source, String str) {
        s.g(activity, "activity");
        s.g(source, "source");
        k.d(w.a(activity), null, null, new Stripe$authenticateSource$1(this, activity, source, str, null), 3, null);
    }

    public final void authenticateSource(Fragment fragment, Source source) {
        s.g(fragment, "fragment");
        s.g(source, "source");
        authenticateSource$default(this, fragment, source, (String) null, 4, (Object) null);
    }

    public final void confirmAlipayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator authenticator, ApiResultCallback<? super PaymentIntentResult> callback) {
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        s.g(authenticator, "authenticator");
        s.g(callback, "callback");
        confirmAlipayPayment$default(this, confirmPaymentIntentParams, authenticator, null, callback, 4, null);
    }

    public final void confirmAlipayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator authenticator, String str, ApiResultCallback<? super PaymentIntentResult> callback) {
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        s.g(authenticator, "authenticator");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$confirmAlipayPayment$1(this, confirmPaymentIntentParams, authenticator, str, null));
    }

    public final void confirmPayment(ComponentActivity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        s.g(activity, "activity");
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        confirmPayment$default(this, activity, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    public final void confirmPayment(ComponentActivity activity, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) {
        s.g(activity, "activity");
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        k.d(w.a(activity), null, null, new Stripe$confirmPayment$1(this, activity, confirmPaymentIntentParams, str, null), 3, null);
    }

    public final void confirmPayment(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        s.g(fragment, "fragment");
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        confirmPayment$default(this, fragment, confirmPaymentIntentParams, (String) null, 4, (Object) null);
    }

    public final PaymentIntent confirmPaymentIntentSynchronous(ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        return confirmPaymentIntentSynchronous$default(this, confirmPaymentIntentParams, null, 2, null);
    }

    public final PaymentIntent confirmPaymentIntentSynchronous(ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) {
        Object b11;
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        b11 = j.b(null, new Stripe$confirmPaymentIntentSynchronous$1(this, confirmPaymentIntentParams, str, null), 1, null);
        return (PaymentIntent) b11;
    }

    public final void confirmSetupIntent(ComponentActivity activity, ConfirmSetupIntentParams confirmSetupIntentParams) {
        s.g(activity, "activity");
        s.g(confirmSetupIntentParams, "confirmSetupIntentParams");
        confirmSetupIntent$default(this, activity, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    public final void confirmSetupIntent(ComponentActivity activity, ConfirmSetupIntentParams confirmSetupIntentParams, String str) {
        s.g(activity, "activity");
        s.g(confirmSetupIntentParams, "confirmSetupIntentParams");
        k.d(w.a(activity), null, null, new Stripe$confirmSetupIntent$1(this, activity, confirmSetupIntentParams, str, null), 3, null);
    }

    public final void confirmSetupIntent(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams) {
        s.g(fragment, "fragment");
        s.g(confirmSetupIntentParams, "confirmSetupIntentParams");
        confirmSetupIntent$default(this, fragment, confirmSetupIntentParams, (String) null, 4, (Object) null);
    }

    public final SetupIntent confirmSetupIntentSynchronous(ConfirmSetupIntentParams confirmSetupIntentParams) {
        s.g(confirmSetupIntentParams, "confirmSetupIntentParams");
        return confirmSetupIntentSynchronous$default(this, confirmSetupIntentParams, null, 2, null);
    }

    public final SetupIntent confirmSetupIntentSynchronous(ConfirmSetupIntentParams confirmSetupIntentParams, String str) {
        Object b11;
        s.g(confirmSetupIntentParams, "confirmSetupIntentParams");
        b11 = j.b(null, new Stripe$confirmSetupIntentSynchronous$1(this, confirmSetupIntentParams, str, null), 1, null);
        return (SetupIntent) b11;
    }

    public final void confirmWeChatPayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiResultCallback<? super WeChatPayNextAction> callback) {
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        s.g(callback, "callback");
        confirmWeChatPayPayment$default(this, confirmPaymentIntentParams, null, callback, 2, null);
    }

    public final void confirmWeChatPayPayment(ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, ApiResultCallback<? super WeChatPayNextAction> callback) {
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$confirmWeChatPayPayment$1(this, confirmPaymentIntentParams, str, null));
    }

    public final void createAccountToken(AccountParams accountParams, ApiResultCallback<? super Token> callback) {
        s.g(accountParams, "accountParams");
        s.g(callback, "callback");
        createAccountToken$default(this, accountParams, null, null, callback, 6, null);
    }

    public final void createAccountToken(AccountParams accountParams, String str, ApiResultCallback<? super Token> callback) {
        s.g(accountParams, "accountParams");
        s.g(callback, "callback");
        createAccountToken$default(this, accountParams, str, null, callback, 4, null);
    }

    public final void createAccountToken(AccountParams accountParams, String str, String str2, ApiResultCallback<? super Token> callback) {
        s.g(accountParams, "accountParams");
        s.g(callback, "callback");
        createToken(accountParams, str2, str, callback);
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams) {
        s.g(accountParams, "accountParams");
        return createAccountTokenSynchronous$default(this, accountParams, null, null, 6, null);
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams, String str) {
        s.g(accountParams, "accountParams");
        return createAccountTokenSynchronous$default(this, accountParams, str, null, 4, null);
    }

    public final Token createAccountTokenSynchronous(AccountParams accountParams, String str, String str2) {
        Object b11;
        s.g(accountParams, "accountParams");
        try {
            b11 = j.b(null, new Stripe$createAccountTokenSynchronous$1(this, accountParams, str2, str, null), 1, null);
            return (Token) b11;
        } catch (CardException unused) {
            return null;
        }
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, ApiResultCallback<? super Token> callback) {
        s.g(bankAccountTokenParams, "bankAccountTokenParams");
        s.g(callback, "callback");
        createBankAccountToken$default(this, bankAccountTokenParams, null, null, callback, 6, null);
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, String str, ApiResultCallback<? super Token> callback) {
        s.g(bankAccountTokenParams, "bankAccountTokenParams");
        s.g(callback, "callback");
        createBankAccountToken$default(this, bankAccountTokenParams, str, null, callback, 4, null);
    }

    public final void createBankAccountToken(BankAccountTokenParams bankAccountTokenParams, String str, String str2, ApiResultCallback<? super Token> callback) {
        s.g(bankAccountTokenParams, "bankAccountTokenParams");
        s.g(callback, "callback");
        createToken(bankAccountTokenParams, str2, str, callback);
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams) {
        s.g(bankAccountTokenParams, "bankAccountTokenParams");
        return createBankAccountTokenSynchronous$default(this, bankAccountTokenParams, null, null, 6, null);
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams, String str) {
        s.g(bankAccountTokenParams, "bankAccountTokenParams");
        return createBankAccountTokenSynchronous$default(this, bankAccountTokenParams, str, null, 4, null);
    }

    public final Token createBankAccountTokenSynchronous(BankAccountTokenParams bankAccountTokenParams, String str, String str2) {
        Object b11;
        s.g(bankAccountTokenParams, "bankAccountTokenParams");
        b11 = j.b(null, new Stripe$createBankAccountTokenSynchronous$1(this, bankAccountTokenParams, str2, str, null), 1, null);
        return (Token) b11;
    }

    public final void createCardToken(CardParams cardParams, ApiResultCallback<? super Token> callback) {
        s.g(cardParams, "cardParams");
        s.g(callback, "callback");
        createCardToken$default(this, cardParams, null, null, callback, 6, null);
    }

    public final void createCardToken(CardParams cardParams, String str, ApiResultCallback<? super Token> callback) {
        s.g(cardParams, "cardParams");
        s.g(callback, "callback");
        createCardToken$default(this, cardParams, str, null, callback, 4, null);
    }

    public final void createCardToken(CardParams cardParams, String str, String str2, ApiResultCallback<? super Token> callback) {
        s.g(cardParams, "cardParams");
        s.g(callback, "callback");
        createToken(cardParams, str2, str, callback);
    }

    public final Token createCardTokenSynchronous(CardParams cardParams) {
        s.g(cardParams, "cardParams");
        return createCardTokenSynchronous$default(this, cardParams, null, null, 6, null);
    }

    public final Token createCardTokenSynchronous(CardParams cardParams, String str) {
        s.g(cardParams, "cardParams");
        return createCardTokenSynchronous$default(this, cardParams, str, null, 4, null);
    }

    public final Token createCardTokenSynchronous(CardParams cardParams, String str, String str2) {
        Object b11;
        s.g(cardParams, "cardParams");
        b11 = j.b(null, new Stripe$createCardTokenSynchronous$1(this, cardParams, str2, str, null), 1, null);
        return (Token) b11;
    }

    public final void createCvcUpdateToken(String cvc, ApiResultCallback<? super Token> callback) {
        s.g(cvc, "cvc");
        s.g(callback, "callback");
        createCvcUpdateToken$default(this, cvc, null, null, callback, 6, null);
    }

    public final void createCvcUpdateToken(String cvc, String str, ApiResultCallback<? super Token> callback) {
        s.g(cvc, "cvc");
        s.g(callback, "callback");
        createCvcUpdateToken$default(this, cvc, str, null, callback, 4, null);
    }

    public final void createCvcUpdateToken(String cvc, String str, String str2, ApiResultCallback<? super Token> callback) {
        s.g(cvc, "cvc");
        s.g(callback, "callback");
        createToken(new CvcTokenParams(cvc), str2, str, callback);
    }

    public final Token createCvcUpdateTokenSynchronous(String cvc) {
        s.g(cvc, "cvc");
        return createCvcUpdateTokenSynchronous$default(this, cvc, null, null, 6, null);
    }

    public final Token createCvcUpdateTokenSynchronous(String cvc, String str) {
        s.g(cvc, "cvc");
        return createCvcUpdateTokenSynchronous$default(this, cvc, str, null, 4, null);
    }

    public final Token createCvcUpdateTokenSynchronous(String cvc, String str, String str2) {
        Object b11;
        s.g(cvc, "cvc");
        b11 = j.b(null, new Stripe$createCvcUpdateTokenSynchronous$1(this, cvc, str2, str, null), 1, null);
        return (Token) b11;
    }

    public final void createFile(StripeFileParams fileParams, ApiResultCallback<? super StripeFile> callback) {
        s.g(fileParams, "fileParams");
        s.g(callback, "callback");
        createFile$default(this, fileParams, null, null, callback, 6, null);
    }

    public final void createFile(StripeFileParams fileParams, String str, ApiResultCallback<? super StripeFile> callback) {
        s.g(fileParams, "fileParams");
        s.g(callback, "callback");
        createFile$default(this, fileParams, str, null, callback, 4, null);
    }

    public final void createFile(StripeFileParams fileParams, String str, String str2, ApiResultCallback<? super StripeFile> callback) {
        s.g(fileParams, "fileParams");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$createFile$1(this, fileParams, str2, str, null));
    }

    public final StripeFile createFileSynchronous(StripeFileParams fileParams) {
        s.g(fileParams, "fileParams");
        return createFileSynchronous$default(this, fileParams, null, null, 6, null);
    }

    public final StripeFile createFileSynchronous(StripeFileParams fileParams, String str) {
        s.g(fileParams, "fileParams");
        return createFileSynchronous$default(this, fileParams, str, null, 4, null);
    }

    public final StripeFile createFileSynchronous(StripeFileParams fileParams, String str, String str2) {
        Object b11;
        s.g(fileParams, "fileParams");
        b11 = j.b(null, new Stripe$createFileSynchronous$1(this, fileParams, str2, str, null), 1, null);
        return (StripeFile) b11;
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiResultCallback<? super PaymentMethod> callback) {
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        s.g(callback, "callback");
        createPaymentMethod$default(this, paymentMethodCreateParams, null, null, callback, 6, null);
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String str, ApiResultCallback<? super PaymentMethod> callback) {
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        s.g(callback, "callback");
        createPaymentMethod$default(this, paymentMethodCreateParams, str, null, callback, 4, null);
    }

    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, ApiResultCallback<? super PaymentMethod> callback) {
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$createPaymentMethod$1(this, paymentMethodCreateParams, str2, str, null));
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams) {
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        return createPaymentMethodSynchronous$default(this, paymentMethodCreateParams, null, null, 6, null);
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        return createPaymentMethodSynchronous$default(this, paymentMethodCreateParams, str, null, 4, null);
    }

    public final PaymentMethod createPaymentMethodSynchronous(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2) {
        Object b11;
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        b11 = j.b(null, new Stripe$createPaymentMethodSynchronous$1(this, paymentMethodCreateParams, str2, str, null), 1, null);
        return (PaymentMethod) b11;
    }

    public final void createPersonToken(PersonTokenParams params, ApiResultCallback<? super Token> callback) {
        s.g(params, "params");
        s.g(callback, "callback");
        createPersonToken$default(this, params, null, null, callback, 6, null);
    }

    public final void createPersonToken(PersonTokenParams params, String str, ApiResultCallback<? super Token> callback) {
        s.g(params, "params");
        s.g(callback, "callback");
        createPersonToken$default(this, params, str, null, callback, 4, null);
    }

    public final void createPersonToken(PersonTokenParams params, String str, String str2, ApiResultCallback<? super Token> callback) {
        s.g(params, "params");
        s.g(callback, "callback");
        createToken(params, str2, str, callback);
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams params) {
        s.g(params, "params");
        return createPersonTokenSynchronous$default(this, params, null, null, 6, null);
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams params, String str) {
        s.g(params, "params");
        return createPersonTokenSynchronous$default(this, params, str, null, 4, null);
    }

    public final Token createPersonTokenSynchronous(PersonTokenParams params, String str, String str2) {
        Object b11;
        s.g(params, "params");
        b11 = j.b(null, new Stripe$createPersonTokenSynchronous$1(this, params, str2, str, null), 1, null);
        return (Token) b11;
    }

    public final void createPiiToken(String personalId, ApiResultCallback<? super Token> callback) {
        s.g(personalId, "personalId");
        s.g(callback, "callback");
        createPiiToken$default(this, personalId, null, null, callback, 6, null);
    }

    public final void createPiiToken(String personalId, String str, ApiResultCallback<? super Token> callback) {
        s.g(personalId, "personalId");
        s.g(callback, "callback");
        createPiiToken$default(this, personalId, str, null, callback, 4, null);
    }

    public final void createPiiToken(String personalId, String str, String str2, ApiResultCallback<? super Token> callback) {
        s.g(personalId, "personalId");
        s.g(callback, "callback");
        createToken(new PiiTokenParams(personalId), str2, str, callback);
    }

    public final Token createPiiTokenSynchronous(String personalId) {
        s.g(personalId, "personalId");
        return createPiiTokenSynchronous$default(this, personalId, null, null, 6, null);
    }

    public final Token createPiiTokenSynchronous(String personalId, String str) {
        s.g(personalId, "personalId");
        return createPiiTokenSynchronous$default(this, personalId, str, null, 4, null);
    }

    public final Token createPiiTokenSynchronous(String personalId, String str, String str2) {
        Object b11;
        s.g(personalId, "personalId");
        b11 = j.b(null, new Stripe$createPiiTokenSynchronous$1(this, personalId, str2, str, null), 1, null);
        return (Token) b11;
    }

    public final void createRadarSession(ApiResultCallback<? super RadarSession> callback) {
        s.g(callback, "callback");
        createRadarSession$default(this, null, callback, 1, null);
    }

    public final void createRadarSession(String str, ApiResultCallback<? super RadarSession> callback) {
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$createRadarSession$1(this, str, null));
    }

    public final void createSource(SourceParams sourceParams, ApiResultCallback<? super Source> callback) {
        s.g(sourceParams, "sourceParams");
        s.g(callback, "callback");
        createSource$default(this, sourceParams, null, null, callback, 6, null);
    }

    public final void createSource(SourceParams sourceParams, String str, ApiResultCallback<? super Source> callback) {
        s.g(sourceParams, "sourceParams");
        s.g(callback, "callback");
        createSource$default(this, sourceParams, str, null, callback, 4, null);
    }

    public final void createSource(SourceParams sourceParams, String str, String str2, ApiResultCallback<? super Source> callback) {
        s.g(sourceParams, "sourceParams");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$createSource$1(this, sourceParams, str2, str, null));
    }

    public final Source createSourceSynchronous(SourceParams params) {
        s.g(params, "params");
        return createSourceSynchronous$default(this, params, null, null, 6, null);
    }

    public final Source createSourceSynchronous(SourceParams params, String str) {
        s.g(params, "params");
        return createSourceSynchronous$default(this, params, str, null, 4, null);
    }

    public final Source createSourceSynchronous(SourceParams params, String str, String str2) {
        Object b11;
        s.g(params, "params");
        b11 = j.b(null, new Stripe$createSourceSynchronous$1(this, params, str2, str, null), 1, null);
        return (Source) b11;
    }

    public final PaymentController getPaymentController$payments_core_release() {
        return this.paymentController;
    }

    public final String getPublishableKey$payments_core_release() {
        return this.publishableKey;
    }

    public final String getStripeAccountId$payments_core_release() {
        return this.stripeAccountId;
    }

    public final StripeRepository getStripeRepository$payments_core_release() {
        return this.stripeRepository;
    }

    public final void handleNextActionForPayment(ComponentActivity activity, String clientSecret) {
        s.g(activity, "activity");
        s.g(clientSecret, "clientSecret");
        handleNextActionForPayment$default(this, activity, clientSecret, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForPayment(ComponentActivity activity, String clientSecret, String str) {
        s.g(activity, "activity");
        s.g(clientSecret, "clientSecret");
        k.d(w.a(activity), null, null, new Stripe$handleNextActionForPayment$1(this, activity, clientSecret, str, null), 3, null);
    }

    public final void handleNextActionForPayment(Fragment fragment, String clientSecret) {
        s.g(fragment, "fragment");
        s.g(clientSecret, "clientSecret");
        handleNextActionForPayment$default(this, fragment, clientSecret, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForSetupIntent(ComponentActivity activity, String clientSecret) {
        s.g(activity, "activity");
        s.g(clientSecret, "clientSecret");
        handleNextActionForSetupIntent$default(this, activity, clientSecret, (String) null, 4, (Object) null);
    }

    public final void handleNextActionForSetupIntent(ComponentActivity activity, String clientSecret, String str) {
        s.g(activity, "activity");
        s.g(clientSecret, "clientSecret");
        k.d(w.a(activity), null, null, new Stripe$handleNextActionForSetupIntent$1(this, activity, clientSecret, str, null), 3, null);
    }

    public final void handleNextActionForSetupIntent(Fragment fragment, String clientSecret) {
        s.g(fragment, "fragment");
        s.g(clientSecret, "clientSecret");
        handleNextActionForSetupIntent$default(this, fragment, clientSecret, (String) null, 4, (Object) null);
    }

    public final boolean isAuthenticateSourceResult(int i11, Intent intent) {
        return intent != null && this.paymentController.shouldHandleSourceResult(i11, intent);
    }

    public final boolean isPaymentResult(int i11, Intent intent) {
        return intent != null && this.paymentController.shouldHandlePaymentResult(i11, intent);
    }

    public final boolean isSetupResult(int i11, Intent intent) {
        return intent != null && this.paymentController.shouldHandleSetupResult(i11, intent);
    }

    public final void onAuthenticateSourceResult(Intent data, ApiResultCallback<? super Source> callback) {
        s.g(data, "data");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$onAuthenticateSourceResult$1(this, data, null));
    }

    public final boolean onPaymentResult(int i11, Intent intent, ApiResultCallback<? super PaymentIntentResult> callback) {
        s.g(callback, "callback");
        if (intent == null || !isPaymentResult(i11, intent)) {
            return false;
        }
        executeAsync(callback, new Stripe$onPaymentResult$1(this, intent, null));
        return true;
    }

    public final boolean onSetupResult(int i11, Intent intent, ApiResultCallback<? super SetupIntentResult> callback) {
        s.g(callback, "callback");
        if (intent == null || !isSetupResult(i11, intent)) {
            return false;
        }
        executeAsync(callback, new Stripe$onSetupResult$1(this, intent, null));
        return true;
    }

    public final void retrievePaymentIntent(String clientSecret, ApiResultCallback<? super PaymentIntent> callback) {
        s.g(clientSecret, "clientSecret");
        s.g(callback, "callback");
        retrievePaymentIntent$default(this, clientSecret, null, callback, 2, null);
    }

    public final void retrievePaymentIntent(String clientSecret, String str, ApiResultCallback<? super PaymentIntent> callback) {
        s.g(clientSecret, "clientSecret");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$retrievePaymentIntent$1(this, clientSecret, str, null));
    }

    public final PaymentIntent retrievePaymentIntentSynchronous(String clientSecret) {
        s.g(clientSecret, "clientSecret");
        return retrievePaymentIntentSynchronous$default(this, clientSecret, null, 2, null);
    }

    public final PaymentIntent retrievePaymentIntentSynchronous(String clientSecret, String str) {
        Object b11;
        s.g(clientSecret, "clientSecret");
        b11 = j.b(null, new Stripe$retrievePaymentIntentSynchronous$1(this, clientSecret, str, null), 1, null);
        return (PaymentIntent) b11;
    }

    public final void retrieveSetupIntent(String clientSecret, ApiResultCallback<? super SetupIntent> callback) {
        s.g(clientSecret, "clientSecret");
        s.g(callback, "callback");
        retrieveSetupIntent$default(this, clientSecret, null, callback, 2, null);
    }

    public final void retrieveSetupIntent(String clientSecret, String str, ApiResultCallback<? super SetupIntent> callback) {
        s.g(clientSecret, "clientSecret");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$retrieveSetupIntent$1(this, clientSecret, str, null));
    }

    public final SetupIntent retrieveSetupIntentSynchronous(String clientSecret) {
        s.g(clientSecret, "clientSecret");
        return retrieveSetupIntentSynchronous$default(this, clientSecret, null, 2, null);
    }

    public final SetupIntent retrieveSetupIntentSynchronous(String clientSecret, String str) {
        Object b11;
        s.g(clientSecret, "clientSecret");
        b11 = j.b(null, new Stripe$retrieveSetupIntentSynchronous$1(this, clientSecret, str, null), 1, null);
        return (SetupIntent) b11;
    }

    public final void retrieveSource(String sourceId, String clientSecret, ApiResultCallback<? super Source> callback) {
        s.g(sourceId, "sourceId");
        s.g(clientSecret, "clientSecret");
        s.g(callback, "callback");
        retrieveSource$default(this, sourceId, clientSecret, null, callback, 4, null);
    }

    public final void retrieveSource(String sourceId, String clientSecret, String str, ApiResultCallback<? super Source> callback) {
        s.g(sourceId, "sourceId");
        s.g(clientSecret, "clientSecret");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$retrieveSource$1(this, sourceId, clientSecret, str, null));
    }

    public final Source retrieveSourceSynchronous(String sourceId, String clientSecret) {
        s.g(sourceId, "sourceId");
        s.g(clientSecret, "clientSecret");
        return retrieveSourceSynchronous$default(this, sourceId, clientSecret, null, 4, null);
    }

    public final Source retrieveSourceSynchronous(String sourceId, String clientSecret, String str) {
        Object b11;
        s.g(sourceId, "sourceId");
        s.g(clientSecret, "clientSecret");
        b11 = j.b(null, new Stripe$retrieveSourceSynchronous$1(this, sourceId, clientSecret, str, null), 1, null);
        return (Source) b11;
    }

    public final void verifyPaymentIntentWithMicrodeposits(String clientSecret, int i11, int i12, ApiResultCallback<? super PaymentIntent> callback) {
        s.g(clientSecret, "clientSecret");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$verifyPaymentIntentWithMicrodeposits$1(this, clientSecret, i11, i12, null));
    }

    public final void verifySetupIntentWithMicrodeposits(String clientSecret, int i11, int i12, ApiResultCallback<? super SetupIntent> callback) {
        s.g(clientSecret, "clientSecret");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$verifySetupIntentWithMicrodeposits$1(this, clientSecret, i11, i12, null));
    }

    public static /* synthetic */ void authenticateSource$default(Stripe stripe, Fragment fragment, Source source, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.authenticateSource(fragment, source, str);
    }

    public static /* synthetic */ void confirmPayment$default(Stripe stripe, Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmPayment(fragment, confirmPaymentIntentParams, str);
    }

    public static /* synthetic */ void confirmSetupIntent$default(Stripe stripe, Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = stripe.stripeAccountId;
        }
        stripe.confirmSetupIntent(fragment, confirmSetupIntentParams, str);
    }

    public static /* synthetic */ void handleNextActionForPayment$default(Stripe stripe, Fragment fragment, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForPayment(fragment, str, str2);
    }

    public static /* synthetic */ void handleNextActionForSetupIntent$default(Stripe stripe, Fragment fragment, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.handleNextActionForSetupIntent(fragment, str, str2);
    }

    public final void authenticateSource(Fragment fragment, Source source, String str) {
        s.g(fragment, "fragment");
        s.g(source, "source");
        w.a(fragment).b(new Stripe$authenticateSource$2(this, fragment, source, str, null));
    }

    public final void confirmPayment(Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str) {
        s.g(fragment, "fragment");
        s.g(confirmPaymentIntentParams, "confirmPaymentIntentParams");
        k.d(w.a(fragment), null, null, new Stripe$confirmPayment$2(this, fragment, confirmPaymentIntentParams, str, null), 3, null);
    }

    public final void confirmSetupIntent(Fragment fragment, ConfirmSetupIntentParams confirmSetupIntentParams, String str) {
        s.g(fragment, "fragment");
        s.g(confirmSetupIntentParams, "confirmSetupIntentParams");
        k.d(w.a(fragment), null, null, new Stripe$confirmSetupIntent$2(this, fragment, confirmSetupIntentParams, str, null), 3, null);
    }

    public final void handleNextActionForPayment(Fragment fragment, String clientSecret, String str) {
        s.g(fragment, "fragment");
        s.g(clientSecret, "clientSecret");
        k.d(w.a(fragment), null, null, new Stripe$handleNextActionForPayment$2(this, fragment, clientSecret, str, null), 3, null);
    }

    public final void handleNextActionForSetupIntent(Fragment fragment, String clientSecret, String str) {
        s.g(fragment, "fragment");
        s.g(clientSecret, "clientSecret");
        k.d(w.a(fragment), null, null, new Stripe$handleNextActionForSetupIntent$2(this, fragment, clientSecret, str, null), 3, null);
    }

    public final void verifyPaymentIntentWithMicrodeposits(String clientSecret, String descriptorCode, ApiResultCallback<? super PaymentIntent> callback) {
        s.g(clientSecret, "clientSecret");
        s.g(descriptorCode, "descriptorCode");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$verifyPaymentIntentWithMicrodeposits$2(this, clientSecret, descriptorCode, null));
    }

    public final void verifySetupIntentWithMicrodeposits(String clientSecret, String descriptorCode, ApiResultCallback<? super SetupIntent> callback) {
        s.g(clientSecret, "clientSecret");
        s.g(descriptorCode, "descriptorCode");
        s.g(callback, "callback");
        executeAsync(callback, new Stripe$verifySetupIntentWithMicrodeposits$2(this, clientSecret, descriptorCode, null));
    }

    public /* synthetic */ Stripe(StripeRepository stripeRepository, PaymentController paymentController, String str, String str2, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeRepository, paymentController, str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? e1.b() : gVar);
    }

    public /* synthetic */ Stripe(Context context, String str, String str2, boolean z11, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? x0.d() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Stripe(android.content.Context r21, java.lang.String r22, java.lang.String r23, boolean r24, java.util.Set<? extends com.stripe.android.StripeApiBeta> r25) {
        /*
            r20 = this;
            r0 = r22
            r13 = r25
            java.lang.String r1 = "context"
            r2 = r21
            kotlin.jvm.internal.s.g(r2, r1)
            java.lang.String r1 = "publishableKey"
            kotlin.jvm.internal.s.g(r0, r1)
            java.lang.String r1 = "betas"
            r3 = r25
            kotlin.jvm.internal.s.g(r3, r1)
            android.content.Context r15 = r21.getApplicationContext()
            java.lang.String r3 = "context.applicationContext"
            kotlin.jvm.internal.s.f(r15, r3)
            com.stripe.android.networking.StripeApiRepository r18 = new com.stripe.android.networking.StripeApiRepository
            r1 = r18
            android.content.Context r4 = r21.getApplicationContext()
            r2 = r4
            kotlin.jvm.internal.s.f(r4, r3)
            com.stripe.android.Stripe$1 r4 = new com.stripe.android.Stripe$1
            r3 = r4
            r4.<init>(r0)
            com.stripe.android.core.AppInfo r4 = com.stripe.android.Stripe.appInfo
            com.stripe.android.core.Logger$Companion r5 = com.stripe.android.core.Logger.Companion
            r14 = r24
            com.stripe.android.core.Logger r5 = r5.getInstance(r14)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r14 = r16
            r19 = r15
            r15 = r16
            r16 = 14320(0x37f0, float:2.0067E-41)
            r17 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.stripe.android.core.ApiKeyValidator$Companion r1 = com.stripe.android.core.ApiKeyValidator.Companion
            com.stripe.android.core.ApiKeyValidator r1 = r1.get()
            java.lang.String r5 = r1.requireValid(r0)
            r2 = r20
            r3 = r19
            r4 = r18
            r6 = r23
            r7 = r24
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.Stripe.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Stripe(android.content.Context r15, com.stripe.android.networking.StripeRepository r16, java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r14 = this;
            r0 = r17
            com.stripe.android.StripePaymentController r13 = new com.stripe.android.StripePaymentController
            android.content.Context r2 = r15.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            kotlin.jvm.internal.s.f(r2, r1)
            com.stripe.android.Stripe$2 r3 = new com.stripe.android.Stripe$2
            r3.<init>(r0)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 496(0x1f0, float:6.95E-43)
            r12 = 0
            r1 = r13
            r4 = r16
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r14
            r2 = r16
            r3 = r18
            r14.<init>(r2, r13, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.Stripe.<init>(android.content.Context, com.stripe.android.networking.StripeRepository, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(StripeRepository stripeRepository, PaymentController paymentController, String publishableKey, String str) {
        this(stripeRepository, paymentController, publishableKey, str, e1.b());
        s.g(stripeRepository, "stripeRepository");
        s.g(paymentController, "paymentController");
        s.g(publishableKey, "publishableKey");
    }
}