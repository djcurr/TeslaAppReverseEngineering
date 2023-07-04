package com.reactnativestripesdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactnativestripesdk.g0;
import com.reactnativestripesdk.x;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import com.stripe.android.StripeKtxKt;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.model.Address;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Token;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.e1;
import vz.q;
import wz.s0;

@fg.a(name = StripeSdkModule.NAME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001d\b\u0007\u0018\u0000 k2\u00020\u0001:\u0001lB\u000f\u0012\u0006\u0010h\u001a\u00020g¢\u0006\u0004\bi\u0010jJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J \u0010!\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J(\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J(\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001a\u0010-\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010.\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u0010/\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u00100\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u00101\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u00102\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J(\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J(\u00106\u001a\u00020\u00072\u0006\u00104\u001a\u0002032\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u00107\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0018\u00108\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010KR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006m"}, d2 = {"Lcom/reactnativestripesdk/StripeSdkModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "Lvz/b0;", "dispatchActivityResultsToFragments", "Lcom/facebook/react/bridge/ReadableMap;", "params", "configure3dSecure", "payWithFpx", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "result", "onFpxPaymentMethodResult", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "createTokenFromPii", "createTokenFromBankAccount", "createTokenFromCard", "Landroidx/appcompat/app/d;", "getCurrentActivityOrResolveWithError", "", "getName", "", "", "getConstants", "initialise", "initPaymentSheet", "presentPaymentSheet", "confirmPaymentSheetPayment", "options", "createPaymentMethod", "createToken", "cvc", "createTokenForCVCUpdate", "paymentIntentClientSecret", "handleNextAction", "confirmPayment", "clientSecret", "retrievePaymentIntent", "retrieveSetupIntent", "setupIntentClientSecret", "confirmSetupIntent", "isGooglePaySupported", "initGooglePay", "presentGooglePay", "createGooglePayPaymentMethod", "canAddCardToWallet", "isCardInWallet", "", NamedConstantsKt.IS_PAYMENT_INTENT, "collectBankAccount", "verifyMicrodeposits", "collectBankAccountToken", "collectFinancialConnectionsAccounts", "Lcom/reactnativestripesdk/k;", "cardFieldView", "Lcom/reactnativestripesdk/k;", "getCardFieldView", "()Lcom/reactnativestripesdk/k;", "setCardFieldView", "(Lcom/reactnativestripesdk/k;)V", "Lcom/reactnativestripesdk/v;", "cardFormView", "Lcom/reactnativestripesdk/v;", "getCardFormView", "()Lcom/reactnativestripesdk/v;", "setCardFormView", "(Lcom/reactnativestripesdk/v;)V", "Lcom/stripe/android/Stripe;", "stripe", "Lcom/stripe/android/Stripe;", "publishableKey", "Ljava/lang/String;", com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID, "urlScheme", "Lcom/reactnativestripesdk/m0;", "paymentSheetFragment", "Lcom/reactnativestripesdk/m0;", "Lcom/reactnativestripesdk/b0;", "googlePayFragment", "Lcom/reactnativestripesdk/b0;", "Lcom/reactnativestripesdk/g0;", "paymentLauncherFragment", "Lcom/reactnativestripesdk/g0;", "Lcom/reactnativestripesdk/w;", "collectBankAccountLauncherFragment", "Lcom/reactnativestripesdk/w;", "Lcom/reactnativestripesdk/x;", "financialConnectionsSheetFragment", "Lcom/reactnativestripesdk/x;", "", "Landroidx/fragment/app/Fragment;", "allFragments", "[Landroidx/fragment/app/Fragment;", "confirmPromise", "Lcom/facebook/react/bridge/Promise;", "confirmPaymentClientSecret", "com/reactnativestripesdk/StripeSdkModule$i", "mActivityEventListener", "Lcom/reactnativestripesdk/StripeSdkModule$i;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StripeSdkModule extends ReactContextBaseJavaModule {
    public static final a Companion = new a(null);
    public static final String NAME = "StripeSdk";
    private Fragment[] allFragments;
    private com.reactnativestripesdk.k cardFieldView;
    private v cardFormView;
    private w collectBankAccountLauncherFragment;
    private String confirmPaymentClientSecret;
    private Promise confirmPromise;
    private x financialConnectionsSheetFragment;
    private b0 googlePayFragment;
    private final i mActivityEventListener;
    private g0 paymentLauncherFragment;
    private m0 paymentSheetFragment;
    private String publishableKey;
    private Stripe stripe;
    private String stripeAccountId;
    private String urlScheme;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.q<Boolean, WritableMap, WritableMap, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f20212b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Promise promise) {
            super(3);
            this.f20212b = promise;
        }

        public final void a(boolean z11, WritableMap writableMap, WritableMap writableMap2) {
            WritableNativeMap b11 = writableMap2 == null ? null : hr.d.b(false, "MISSING_CONFIGURATION", null);
            if (b11 == null) {
                b11 = hr.d.b(!z11, z11 ? "CARD_ALREADY_EXISTS" : null, writableMap);
            }
            this.f20212b.resolve(b11);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(Boolean bool, WritableMap writableMap, WritableMap writableMap2) {
            a(bool.booleanValue(), writableMap, writableMap2);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ApiResultCallback<PaymentMethod> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f20213a;

        c(Promise promise) {
            this.f20213a = promise;
        }

        @Override // com.stripe.android.ApiResultCallback
        /* renamed from: a */
        public void onSuccess(PaymentMethod result) {
            kotlin.jvm.internal.s.g(result, "result");
            this.f20213a.resolve(hr.d.d("paymentMethod", hr.d.v(result)));
        }

        @Override // com.stripe.android.ApiResultCallback
        public void onError(Exception e11) {
            kotlin.jvm.internal.s.g(e11, "e");
            this.f20213a.resolve(hr.a.c("Failed", e11));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ApiResultCallback<Token> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f20214a;

        d(Promise promise) {
            this.f20214a = promise;
        }

        @Override // com.stripe.android.ApiResultCallback
        /* renamed from: a */
        public void onSuccess(Token result) {
            kotlin.jvm.internal.s.g(result, "result");
            String id2 = result.getId();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("tokenId", id2);
            this.f20214a.resolve(writableNativeMap);
        }

        @Override // com.stripe.android.ApiResultCallback
        public void onError(Exception e11) {
            kotlin.jvm.internal.s.g(e11, "e");
            this.f20214a.resolve(hr.a.c("Failed", e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromBankAccount$1", f = "StripeSdkModule.kt", l = {289}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f20215a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f20216b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BankAccountTokenParams f20218d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f20219e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(BankAccountTokenParams bankAccountTokenParams, Promise promise, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f20218d = bankAccountTokenParams;
            this.f20219e = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            e eVar = new e(this.f20218d, this.f20219e, dVar);
            eVar.f20216b = obj;
            return eVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((e) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object b11;
            Promise promise;
            d11 = a00.d.d();
            int i11 = this.f20215a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    v20.o0 o0Var = (v20.o0) this.f20216b;
                    StripeSdkModule stripeSdkModule = StripeSdkModule.this;
                    BankAccountTokenParams bankAccountTokenParams = this.f20218d;
                    Promise promise2 = this.f20219e;
                    q.a aVar = vz.q.f54772b;
                    Stripe stripe = stripeSdkModule.stripe;
                    if (stripe == null) {
                        kotlin.jvm.internal.s.x("stripe");
                        stripe = null;
                    }
                    String str = stripeSdkModule.stripeAccountId;
                    this.f20216b = promise2;
                    this.f20215a = 1;
                    obj = StripeKtxKt.createBankAccountToken(stripe, bankAccountTokenParams, null, str, this);
                    if (obj == d11) {
                        return d11;
                    }
                    promise = promise2;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    promise = (Promise) this.f20216b;
                    vz.r.b(obj);
                }
                promise.resolve(hr.d.d("token", hr.d.y((Token) obj)));
                b11 = vz.q.b(vz.b0.f54756a);
            } catch (Throwable th2) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th2));
            }
            Promise promise3 = this.f20219e;
            Throwable e11 = vz.q.e(b11);
            if (e11 != null) {
                promise3.resolve(hr.a.d(com.reactnativestripesdk.utils.c.Failed.toString(), e11.getMessage()));
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromCard$1", f = "StripeSdkModule.kt", l = {319}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f20220a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CardParams f20222c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f20223d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CardParams cardParams, Promise promise, zz.d<? super f> dVar) {
            super(2, dVar);
            this.f20222c = cardParams;
            this.f20223d = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new f(this.f20222c, this.f20223d, dVar);
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((f) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f20220a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    Stripe stripe = StripeSdkModule.this.stripe;
                    if (stripe == null) {
                        kotlin.jvm.internal.s.x("stripe");
                        stripe = null;
                    }
                    Stripe stripe2 = stripe;
                    CardParams cardParams = this.f20222c;
                    String str = StripeSdkModule.this.stripeAccountId;
                    this.f20220a = 1;
                    obj = StripeKtxKt.createCardToken$default(stripe2, cardParams, null, str, this, 2, null);
                    if (obj == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                this.f20223d.resolve(hr.d.d("token", hr.d.y((Token) obj)));
            } catch (Exception e11) {
                this.f20223d.resolve(hr.a.d(com.reactnativestripesdk.utils.c.Failed.toString(), e11.getMessage()));
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.reactnativestripesdk.StripeSdkModule$createTokenFromPii$1$1", f = "StripeSdkModule.kt", l = {260}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f20224a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f20225b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f20227d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f20228e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Promise promise, zz.d<? super g> dVar) {
            super(2, dVar);
            this.f20227d = str;
            this.f20228e = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            g gVar = new g(this.f20227d, this.f20228e, dVar);
            gVar.f20225b = obj;
            return gVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((g) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object b11;
            Promise promise;
            d11 = a00.d.d();
            int i11 = this.f20224a;
            try {
                if (i11 == 0) {
                    vz.r.b(obj);
                    v20.o0 o0Var = (v20.o0) this.f20225b;
                    StripeSdkModule stripeSdkModule = StripeSdkModule.this;
                    String str = this.f20227d;
                    Promise promise2 = this.f20228e;
                    q.a aVar = vz.q.f54772b;
                    Stripe stripe = stripeSdkModule.stripe;
                    if (stripe == null) {
                        kotlin.jvm.internal.s.x("stripe");
                        stripe = null;
                    }
                    String str2 = stripeSdkModule.stripeAccountId;
                    this.f20225b = promise2;
                    this.f20224a = 1;
                    obj = StripeKtxKt.createPiiToken(stripe, str, null, str2, this);
                    if (obj == d11) {
                        return d11;
                    }
                    promise = promise2;
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    promise = (Promise) this.f20225b;
                    vz.r.b(obj);
                }
                promise.resolve(hr.d.d("token", hr.d.y((Token) obj)));
                b11 = vz.q.b(vz.b0.f54756a);
            } catch (Throwable th2) {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th2));
            }
            Promise promise3 = this.f20228e;
            Throwable e11 = vz.q.e(b11);
            if (e11 != null) {
                promise3.resolve(hr.a.d(com.reactnativestripesdk.utils.c.Failed.toString(), e11.getMessage()));
            }
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    static final class h extends kotlin.jvm.internal.u implements h00.q<Boolean, WritableMap, WritableMap, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f20230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Promise promise) {
            super(3);
            this.f20230b = promise;
        }

        public final void a(boolean z11, WritableMap writableMap, WritableMap writableMap2) {
            if (writableMap2 == null) {
                writableMap2 = new WritableNativeMap();
                writableMap2.putBoolean("isInWallet", z11);
                writableMap2.putMap("token", writableMap);
            }
            this.f20230b.resolve(writableMap2);
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(Boolean bool, WritableMap writableMap, WritableMap writableMap2) {
            a(bool.booleanValue(), writableMap, writableMap2);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends BaseActivityEventListener {
        i() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            kotlin.jvm.internal.s.g(activity, "activity");
            if (StripeSdkModule.this.stripe != null) {
                StripeSdkModule.this.dispatchActivityResultsToFragments(i11, i12, intent);
                try {
                    AddPaymentMethodActivityStarter.Result fromIntent = AddPaymentMethodActivityStarter.Result.Companion.fromIntent(intent);
                    if ((intent == null ? null : intent.getParcelableExtra("extra_activity_result")) != null) {
                        StripeSdkModule.this.onFpxPaymentMethodResult(fromIntent);
                    }
                } catch (Exception e11) {
                    String localizedMessage = e11.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = e11.toString();
                    }
                    Log.d("Error", localizedMessage);
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.reactnativestripesdk.StripeSdkModule$retrievePaymentIntent$1", f = "StripeSdkModule.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f20232a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f20233b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f20235d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f20236e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Promise promise, zz.d<? super j> dVar) {
            super(2, dVar);
            this.f20235d = str;
            this.f20236e = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            j jVar = new j(this.f20235d, this.f20236e, dVar);
            jVar.f20233b = obj;
            return jVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((j) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f20232a == 0) {
                vz.r.b(obj);
                v20.o0 o0Var = (v20.o0) this.f20233b;
                Stripe stripe = StripeSdkModule.this.stripe;
                vz.b0 b0Var = null;
                if (stripe == null) {
                    kotlin.jvm.internal.s.x("stripe");
                    stripe = null;
                }
                PaymentIntent retrievePaymentIntentSynchronous$default = Stripe.retrievePaymentIntentSynchronous$default(stripe, this.f20235d, null, 2, null);
                if (retrievePaymentIntentSynchronous$default != null) {
                    this.f20236e.resolve(hr.d.d("paymentIntent", hr.d.u(retrievePaymentIntentSynchronous$default)));
                    b0Var = vz.b0.f54756a;
                }
                if (b0Var == null) {
                    this.f20236e.resolve(hr.a.d(com.reactnativestripesdk.utils.g.Unknown.toString(), "Failed to retrieve the PaymentIntent"));
                }
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.reactnativestripesdk.StripeSdkModule$retrieveSetupIntent$1", f = "StripeSdkModule.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f20237a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f20238b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f20240d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f20241e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, Promise promise, zz.d<? super k> dVar) {
            super(2, dVar);
            this.f20240d = str;
            this.f20241e = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            k kVar = new k(this.f20240d, this.f20241e, dVar);
            kVar.f20238b = obj;
            return kVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((k) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f20237a == 0) {
                vz.r.b(obj);
                v20.o0 o0Var = (v20.o0) this.f20238b;
                Stripe stripe = StripeSdkModule.this.stripe;
                vz.b0 b0Var = null;
                if (stripe == null) {
                    kotlin.jvm.internal.s.x("stripe");
                    stripe = null;
                }
                SetupIntent retrieveSetupIntentSynchronous$default = Stripe.retrieveSetupIntentSynchronous$default(stripe, this.f20240d, null, 2, null);
                if (retrieveSetupIntentSynchronous$default != null) {
                    this.f20241e.resolve(hr.d.d("setupIntent", hr.d.x(retrieveSetupIntentSynchronous$default)));
                    b0Var = vz.b0.f54756a;
                }
                if (b0Var == null) {
                    this.f20241e.resolve(hr.a.d(com.reactnativestripesdk.utils.h.Unknown.toString(), "Failed to retrieve the SetupIntent"));
                }
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements ApiResultCallback<PaymentIntent> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f20242a;

        l(Promise promise) {
            this.f20242a = promise;
        }

        @Override // com.stripe.android.ApiResultCallback
        /* renamed from: a */
        public void onSuccess(PaymentIntent result) {
            kotlin.jvm.internal.s.g(result, "result");
            this.f20242a.resolve(hr.d.d("paymentIntent", hr.d.u(result)));
        }

        @Override // com.stripe.android.ApiResultCallback
        public void onError(Exception e11) {
            kotlin.jvm.internal.s.g(e11, "e");
            this.f20242a.resolve(hr.a.c(com.reactnativestripesdk.utils.d.Failed.toString(), e11));
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements ApiResultCallback<SetupIntent> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f20243a;

        m(Promise promise) {
            this.f20243a = promise;
        }

        @Override // com.stripe.android.ApiResultCallback
        /* renamed from: a */
        public void onSuccess(SetupIntent result) {
            kotlin.jvm.internal.s.g(result, "result");
            this.f20243a.resolve(hr.d.d("setupIntent", hr.d.x(result)));
        }

        @Override // com.stripe.android.ApiResultCallback
        public void onError(Exception e11) {
            kotlin.jvm.internal.s.g(e11, "e");
            this.f20243a.resolve(hr.a.c(com.reactnativestripesdk.utils.d.Failed.toString(), e11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        this.allFragments = new Fragment[]{this.paymentSheetFragment, this.googlePayFragment, this.paymentLauncherFragment, this.collectBankAccountLauncherFragment, this.financialConnectionsSheetFragment};
        i iVar = new i();
        this.mActivityEventListener = iVar;
        reactContext.addActivityEventListener(iVar);
    }

    private final void configure3dSecure(ReadableMap readableMap) {
        PaymentAuthConfig.Stripe3ds2Config.Builder builder = new PaymentAuthConfig.Stripe3ds2Config.Builder();
        if (readableMap.hasKey("timeout")) {
            builder.setTimeout(readableMap.getInt("timeout"));
        }
        PaymentAuthConfig.Companion.init(new PaymentAuthConfig.Builder().set3ds2Config(builder.setUiCustomization(hr.d.N(readableMap)).build()).build());
    }

    private final void createTokenFromBankAccount(ReadableMap readableMap, Promise promise) {
        String i11 = hr.d.i(readableMap, "accountHolderName", null);
        String i12 = hr.d.i(readableMap, "accountHolderType", null);
        String i13 = hr.d.i(readableMap, "accountNumber", null);
        String i14 = hr.d.i(readableMap, "country", null);
        String i15 = hr.d.i(readableMap, "currency", null);
        String i16 = hr.d.i(readableMap, "routingNumber", null);
        kotlin.jvm.internal.s.e(i14);
        kotlin.jvm.internal.s.e(i15);
        kotlin.jvm.internal.s.e(i13);
        v20.k.d(v20.p0.a(e1.b()), null, null, new e(new BankAccountTokenParams(i14, i15, i13, hr.d.H(i12), i11, i16), promise, null), 3, null);
    }

    private final void createTokenFromCard(ReadableMap readableMap, Promise promise) {
        com.reactnativestripesdk.k kVar = this.cardFieldView;
        PaymentMethodCreateParams.Card cardParams = kVar == null ? null : kVar.getCardParams();
        if (cardParams == null) {
            v vVar = this.cardFormView;
            cardParams = vVar == null ? null : vVar.getCardParams();
        }
        Map<String, Object> paramMap = cardParams == null ? null : cardParams.toParamMap();
        if (paramMap == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.c.Failed.toString(), "Card details not complete"));
            return;
        }
        com.reactnativestripesdk.k kVar2 = this.cardFieldView;
        Address cardAddress = kVar2 == null ? null : kVar2.getCardAddress();
        if (cardAddress == null) {
            v vVar2 = this.cardFormView;
            cardAddress = vVar2 == null ? null : vVar2.getCardAddress();
        }
        ReadableMap g11 = hr.d.g(readableMap, "address");
        Object obj = paramMap.get("number");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = paramMap.get("exp_month");
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = paramMap.get("exp_year");
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj3).intValue();
        Object obj4 = paramMap.get("cvc");
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
        v20.k.d(v20.p0.a(e1.b()), null, null, new f(new CardParams(str, intValue, intValue2, (String) obj4, hr.d.i(readableMap, "name", null), hr.d.G(g11, cardAddress), hr.d.i(readableMap, "currency", null), (Map) null, 128, (DefaultConstructorMarker) null), promise, null), 3, null);
    }

    private final void createTokenFromPii(ReadableMap readableMap, Promise promise) {
        String i11 = hr.d.i(readableMap, "personalId", null);
        if ((i11 != null ? v20.k.d(v20.p0.a(e1.b()), null, null, new g(i11, promise, null), 3, null) : null) == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.c.Failed.toString(), "personalId parameter is required"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchActivityResultsToFragments(int i11, int i12, Intent intent) {
        androidx.fragment.app.h activity;
        ActivityResultRegistry activityResultRegistry;
        Fragment[] fragmentArr = this.allFragments;
        int length = fragmentArr.length;
        int i13 = 0;
        while (i13 < length) {
            Fragment fragment = fragmentArr[i13];
            i13++;
            if (fragment != null && (activity = fragment.getActivity()) != null && (activityResultRegistry = activity.getActivityResultRegistry()) != null) {
                activityResultRegistry.b(i11, i12, intent);
            }
        }
    }

    private final androidx.appcompat.app.d getCurrentActivityOrResolveWithError(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        androidx.appcompat.app.d dVar = currentActivity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) currentActivity : null;
        if (dVar == null) {
            if (promise != null) {
                promise.resolve(hr.a.f());
            }
            return null;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFpxPaymentMethodResult(AddPaymentMethodActivityStarter.Result result) {
        Promise promise;
        Stripe stripe;
        String str;
        if (result instanceof AddPaymentMethodActivityStarter.Result.Success) {
            if (this.confirmPaymentClientSecret != null && this.confirmPromise != null) {
                g0.a aVar = g0.f20278l;
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
                Stripe stripe2 = this.stripe;
                if (stripe2 == null) {
                    kotlin.jvm.internal.s.x("stripe");
                    stripe = null;
                } else {
                    stripe = stripe2;
                }
                String str2 = this.publishableKey;
                if (str2 == null) {
                    kotlin.jvm.internal.s.x("publishableKey");
                    str = null;
                } else {
                    str = str2;
                }
                String str3 = this.stripeAccountId;
                Promise promise2 = this.confirmPromise;
                kotlin.jvm.internal.s.e(promise2);
                String str4 = this.confirmPaymentClientSecret;
                kotlin.jvm.internal.s.e(str4);
                ConfirmPaymentIntentParams.Companion companion = ConfirmPaymentIntentParams.Companion;
                String str5 = ((AddPaymentMethodActivityStarter.Result.Success) result).getPaymentMethod().f20932id;
                kotlin.jvm.internal.s.e(str5);
                String str6 = this.confirmPaymentClientSecret;
                kotlin.jvm.internal.s.e(str6);
                this.paymentLauncherFragment = aVar.c(reactApplicationContext, stripe, str, str3, promise2, str4, ConfirmPaymentIntentParams.Companion.createWithPaymentMethodId$default(companion, str5, str6, null, null, null, null, null, null, 252, null));
            } else {
                Log.e("StripeReactNative", "FPX payment failed. Promise and/or client secret is not set.");
                Promise promise3 = this.confirmPromise;
                if (promise3 != null) {
                    promise3.resolve(hr.a.d(com.reactnativestripesdk.utils.a.Failed.toString(), "FPX payment failed. Client secret is not set."));
                }
            }
        } else if (result instanceof AddPaymentMethodActivityStarter.Result.Failure) {
            Promise promise4 = this.confirmPromise;
            if (promise4 != null) {
                promise4.resolve(hr.a.e(com.reactnativestripesdk.utils.a.Failed.toString(), ((AddPaymentMethodActivityStarter.Result.Failure) result).getException()));
            }
        } else if ((result instanceof AddPaymentMethodActivityStarter.Result.Canceled) && (promise = this.confirmPromise) != null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.a.Canceled.toString(), "The payment has been canceled"));
        }
        this.confirmPaymentClientSecret = null;
        this.confirmPromise = null;
    }

    private final void payWithFpx() {
        androidx.appcompat.app.d currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(this.confirmPromise);
        if (currentActivityOrResolveWithError == null) {
            return;
        }
        new AddPaymentMethodActivityStarter(currentActivityOrResolveWithError).startForResult(new AddPaymentMethodActivityStarter.Args.Builder().setPaymentMethodType(PaymentMethod.Type.Fpx).build());
    }

    @ReactMethod
    public final void canAddCardToWallet(ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        String i11 = hr.d.i(params, "cardLastFour", null);
        if (i11 == null) {
            promise.resolve(hr.a.d("Failed", "You must provide cardLastFour"));
            return;
        }
        com.reactnativestripesdk.pushprovisioning.f fVar = com.reactnativestripesdk.pushprovisioning.f.f20353a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        if (!fVar.g(reactApplicationContext)) {
            promise.resolve(hr.d.c(false, "UNSUPPORTED_DEVICE", null, 4, null));
            return;
        }
        androidx.appcompat.app.d currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError == null) {
            return;
        }
        fVar.f(currentActivityOrResolveWithError, i11, new b(promise));
    }

    @ReactMethod
    public final void collectBankAccount(boolean z11, String clientSecret, ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        ReadableMap g11 = hr.d.g(params, "paymentMethodData");
        String str = null;
        if (hr.d.K(hr.d.i(params, Action.PAYMENT_METHOD_TYPE, null)) != PaymentMethod.Type.USBankAccount) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), "collectBankAccount currently only accepts the USBankAccount payment method type."));
            return;
        }
        ReadableMap g12 = hr.d.g(g11, "billingDetails");
        String string = g12 == null ? null : g12.getString("name");
        if (string == null || string.length() == 0) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), "You must provide a name when collecting US bank account details."));
            return;
        }
        CollectBankAccountConfiguration.USBankAccount uSBankAccount = new CollectBankAccountConfiguration.USBankAccount(string, g12.getString("email"));
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        String str2 = this.publishableKey;
        if (str2 == null) {
            kotlin.jvm.internal.s.x("publishableKey");
        } else {
            str = str2;
        }
        this.collectBankAccountLauncherFragment = new w(reactApplicationContext, str, clientSecret, z11, uSBankAccount, promise);
        androidx.appcompat.app.d currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError == null) {
            return;
        }
        try {
            androidx.fragment.app.z m11 = currentActivityOrResolveWithError.getSupportFragmentManager().m();
            w wVar = this.collectBankAccountLauncherFragment;
            kotlin.jvm.internal.s.e(wVar);
            m11.e(wVar, "collect_bank_account_launcher_fragment").h();
        } catch (IllegalStateException e11) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), e11.getMessage()));
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    @ReactMethod
    public final void collectBankAccountToken(String clientSecret, Promise promise) {
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(hr.a.g());
            return;
        }
        x xVar = new x();
        x.b bVar = x.b.ForToken;
        String str = this.publishableKey;
        if (str == null) {
            kotlin.jvm.internal.s.x("publishableKey");
            str = null;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        xVar.g(clientSecret, bVar, str, promise, reactApplicationContext);
        vz.b0 b0Var = vz.b0.f54756a;
        this.financialConnectionsSheetFragment = xVar;
    }

    @ReactMethod
    public final void collectFinancialConnectionsAccounts(String clientSecret, Promise promise) {
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(promise, "promise");
        if (this.stripe == null) {
            promise.resolve(hr.a.g());
            return;
        }
        x xVar = new x();
        x.b bVar = x.b.ForSession;
        String str = this.publishableKey;
        if (str == null) {
            kotlin.jvm.internal.s.x("publishableKey");
            str = null;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        xVar.g(clientSecret, bVar, str, promise, reactApplicationContext);
        vz.b0 b0Var = vz.b0.f54756a;
        this.financialConnectionsSheetFragment = xVar;
    }

    @ReactMethod
    public final void confirmPayment(String paymentIntentClientSecret, ReadableMap params, ReadableMap options, Promise promise) {
        Stripe stripe;
        String str;
        kotlin.jvm.internal.s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(options, "options");
        kotlin.jvm.internal.s.g(promise, "promise");
        ReadableMap g11 = hr.d.g(params, "paymentMethodData");
        String j11 = hr.d.j(params, Action.PAYMENT_METHOD_TYPE, null, 4, null);
        PaymentMethod.Type K = j11 == null ? null : hr.d.K(j11);
        if (K == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.a.Failed.toString(), "You must provide paymentMethodType"));
            return;
        }
        boolean e11 = hr.d.e(params, "testOfflineBank");
        if (K == PaymentMethod.Type.Fpx && !e11) {
            this.confirmPaymentClientSecret = paymentIntentClientSecret;
            this.confirmPromise = promise;
            payWithFpx();
            return;
        }
        try {
            ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) new h0(g11, options, this.cardFieldView, this.cardFormView).q(paymentIntentClientSecret, K, true);
            String str2 = this.urlScheme;
            if (str2 != null) {
                confirmPaymentIntentParams.setReturnUrl(hr.d.L(str2));
            }
            confirmPaymentIntentParams.setShipping(hr.d.M(hr.d.g(g11, "shippingDetails")));
            g0.a aVar = g0.f20278l;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
            Stripe stripe2 = this.stripe;
            if (stripe2 == null) {
                kotlin.jvm.internal.s.x("stripe");
                stripe = null;
            } else {
                stripe = stripe2;
            }
            String str3 = this.publishableKey;
            if (str3 == null) {
                kotlin.jvm.internal.s.x("publishableKey");
                str = null;
            } else {
                str = str3;
            }
            this.paymentLauncherFragment = aVar.c(reactApplicationContext, stripe, str, this.stripeAccountId, promise, paymentIntentClientSecret, confirmPaymentIntentParams);
        } catch (PaymentMethodCreateParamsException e12) {
            promise.resolve(hr.a.c(com.reactnativestripesdk.utils.a.Failed.toString(), e12));
        }
    }

    @ReactMethod
    public final void confirmPaymentSheetPayment(Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        m0 m0Var = this.paymentSheetFragment;
        if (m0Var == null) {
            return;
        }
        m0Var.g(promise);
    }

    @ReactMethod
    public final void confirmSetupIntent(String setupIntentClientSecret, ReadableMap params, ReadableMap options, Promise promise) {
        Stripe stripe;
        String str;
        kotlin.jvm.internal.s.g(setupIntentClientSecret, "setupIntentClientSecret");
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(options, "options");
        kotlin.jvm.internal.s.g(promise, "promise");
        String j11 = hr.d.j(params, Action.PAYMENT_METHOD_TYPE, null, 4, null);
        PaymentMethod.Type K = j11 == null ? null : hr.d.K(j11);
        if (K == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.a.Failed.toString(), "You must provide paymentMethodType"));
            return;
        }
        try {
            ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) new h0(hr.d.g(params, "paymentMethodData"), options, this.cardFieldView, this.cardFormView).q(setupIntentClientSecret, K, false);
            String str2 = this.urlScheme;
            if (str2 != null) {
                confirmSetupIntentParams.setReturnUrl(hr.d.L(str2));
            }
            g0.a aVar = g0.f20278l;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
            Stripe stripe2 = this.stripe;
            if (stripe2 == null) {
                kotlin.jvm.internal.s.x("stripe");
                stripe = null;
            } else {
                stripe = stripe2;
            }
            String str3 = this.publishableKey;
            if (str3 == null) {
                kotlin.jvm.internal.s.x("publishableKey");
                str = null;
            } else {
                str = str3;
            }
            this.paymentLauncherFragment = aVar.d(reactApplicationContext, stripe, str, this.stripeAccountId, promise, setupIntentClientSecret, confirmSetupIntentParams);
        } catch (PaymentMethodCreateParamsException e11) {
            promise.resolve(hr.a.c(com.reactnativestripesdk.utils.a.Failed.toString(), e11));
        }
    }

    @ReactMethod
    public final void createGooglePayPaymentMethod(ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        String i11 = hr.d.i(params, "currencyCode", null);
        if (i11 == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Failed.toString(), "you must provide currencyCode"));
            return;
        }
        Integer f11 = hr.d.f(params, BaseSheetViewModel.SAVE_AMOUNT);
        if (f11 == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Failed.toString(), "you must provide amount"));
            return;
        }
        int intValue = f11.intValue();
        b0 b0Var = this.googlePayFragment;
        if (b0Var == null) {
            return;
        }
        b0Var.e(i11, intValue, promise);
    }

    @ReactMethod
    public final void createPaymentMethod(ReadableMap data, ReadableMap options, Promise promise) {
        Stripe stripe;
        kotlin.jvm.internal.s.g(data, "data");
        kotlin.jvm.internal.s.g(options, "options");
        kotlin.jvm.internal.s.g(promise, "promise");
        String j11 = hr.d.j(data, Action.PAYMENT_METHOD_TYPE, null, 4, null);
        PaymentMethod.Type K = j11 == null ? null : hr.d.K(j11);
        if (K == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.a.Failed.toString(), "You must provide paymentMethodType"));
            return;
        }
        try {
            PaymentMethodCreateParams t11 = new h0(hr.d.g(data, "paymentMethodData"), options, this.cardFieldView, this.cardFormView).t(K);
            Stripe stripe2 = this.stripe;
            if (stripe2 == null) {
                kotlin.jvm.internal.s.x("stripe");
                stripe = null;
            } else {
                stripe = stripe2;
            }
            Stripe.createPaymentMethod$default(stripe, t11, null, null, new c(promise), 6, null);
        } catch (PaymentMethodCreateParamsException e11) {
            promise.resolve(hr.a.c(com.reactnativestripesdk.utils.a.Failed.toString(), e11));
        }
    }

    @ReactMethod
    public final void createToken(ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        String i11 = hr.d.i(params, "type", null);
        if (i11 == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.c.Failed.toString(), "type parameter is required"));
            return;
        }
        int hashCode = i11.hashCode();
        if (hashCode != 80240) {
            if (hashCode != 2092848) {
                if (hashCode == 811305009 && i11.equals("BankAccount")) {
                    createTokenFromBankAccount(params, promise);
                    return;
                }
            } else if (i11.equals("Card")) {
                createTokenFromCard(params, promise);
                return;
            }
        } else if (i11.equals("Pii")) {
            createTokenFromPii(params, promise);
            return;
        }
        promise.resolve(hr.a.d(com.reactnativestripesdk.utils.c.Failed.toString(), kotlin.jvm.internal.s.p(i11, " type is not supported yet")));
    }

    @ReactMethod
    public final void createTokenForCVCUpdate(String cvc, Promise promise) {
        kotlin.jvm.internal.s.g(cvc, "cvc");
        kotlin.jvm.internal.s.g(promise, "promise");
        Stripe stripe = this.stripe;
        if (stripe == null) {
            kotlin.jvm.internal.s.x("stripe");
            stripe = null;
        }
        Stripe.createCvcUpdateToken$default(stripe, cvc, null, null, new d(promise), 6, null);
    }

    public final com.reactnativestripesdk.k getCardFieldView() {
        return this.cardFieldView;
    }

    public final v getCardFormView() {
        return this.cardFormView;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap k11;
        HashMap k12;
        k11 = s0.k(vz.v.a("CORE", ApiVersion.API_VERSION_CODE), vz.v.a("ISSUING", com.reactnativestripesdk.pushprovisioning.f.f20353a.d()));
        k12 = s0.k(vz.v.a("API_VERSIONS", k11));
        return k12;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void handleNextAction(String paymentIntentClientSecret, Promise promise) {
        kotlin.jvm.internal.s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
        kotlin.jvm.internal.s.g(promise, "promise");
        g0.a aVar = g0.f20278l;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        Stripe stripe = this.stripe;
        if (stripe == null) {
            kotlin.jvm.internal.s.x("stripe");
            stripe = null;
        }
        String str = this.publishableKey;
        if (str == null) {
            kotlin.jvm.internal.s.x("publishableKey");
            str = null;
        }
        this.paymentLauncherFragment = aVar.b(reactApplicationContext, stripe, str, this.stripeAccountId, promise, paymentIntentClientSecret);
    }

    @ReactMethod
    public final void initGooglePay(ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        b0 b0Var = new b0(promise);
        b0Var.setArguments(hr.d.R(params));
        vz.b0 b0Var2 = vz.b0.f54756a;
        this.googlePayFragment = b0Var;
        androidx.appcompat.app.d currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError == null) {
            return;
        }
        try {
            androidx.fragment.app.z m11 = currentActivityOrResolveWithError.getSupportFragmentManager().m();
            b0 b0Var3 = this.googlePayFragment;
            kotlin.jvm.internal.s.e(b0Var3);
            m11.e(b0Var3, "google_pay_launch_fragment").h();
        } catch (IllegalStateException e11) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), e11.getMessage()));
            vz.b0 b0Var4 = vz.b0.f54756a;
        }
    }

    @ReactMethod
    public final void initPaymentSheet(ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        androidx.appcompat.app.d currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError == null) {
            return;
        }
        m0 m0Var = this.paymentSheetFragment;
        if (m0Var != null) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
            hr.c.c(m0Var, reactApplicationContext);
        }
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext2, "reactApplicationContext");
        m0 m0Var2 = new m0(reactApplicationContext2, promise);
        m0Var2.setArguments(hr.d.R(params));
        vz.b0 b0Var = vz.b0.f54756a;
        this.paymentSheetFragment = m0Var2;
        try {
            androidx.fragment.app.z m11 = currentActivityOrResolveWithError.getSupportFragmentManager().m();
            m0 m0Var3 = this.paymentSheetFragment;
            kotlin.jvm.internal.s.e(m0Var3);
            m11.e(m0Var3, "payment_sheet_launch_fragment").h();
        } catch (IllegalStateException e11) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), e11.getMessage()));
            vz.b0 b0Var2 = vz.b0.f54756a;
        }
    }

    @ReactMethod
    public final void initialise(ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        String i11 = hr.d.i(params, "publishableKey", null);
        Objects.requireNonNull(i11, "null cannot be cast to non-null type kotlin.String");
        ReadableMap g11 = hr.d.g(params, "appInfo");
        Objects.requireNonNull(g11, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
        this.stripeAccountId = hr.d.i(params, com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID, null);
        String i12 = hr.d.i(params, "urlScheme", null);
        if (!hr.d.e(params, "setReturnUrlSchemeOnAndroid")) {
            i12 = null;
        }
        this.urlScheme = i12;
        ReadableMap g12 = hr.d.g(params, "threeDSecureParams");
        if (g12 != null) {
            configure3dSecure(g12);
        }
        this.publishableKey = i11;
        String i13 = hr.d.i(g11, "name", "");
        Objects.requireNonNull(i13, "null cannot be cast to non-null type kotlin.String");
        Stripe.Companion.setAppInfo(AppInfo.Companion.create(i13, hr.d.i(g11, "version", ""), hr.d.i(g11, "url", ""), hr.d.i(g11, "partnerId", "")));
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        this.stripe = new Stripe((Context) reactApplicationContext, i11, this.stripeAccountId, false, (Set) null, 24, (DefaultConstructorMarker) null);
        PaymentConfiguration.Companion companion = PaymentConfiguration.Companion;
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext2, "reactApplicationContext");
        companion.init(reactApplicationContext2, i11, this.stripeAccountId);
        promise.resolve(null);
    }

    @ReactMethod
    public final void isCardInWallet(ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        String i11 = hr.d.i(params, "cardLastFour", null);
        if (i11 == null) {
            promise.resolve(hr.a.d("Failed", "You must provide cardLastFour"));
            return;
        }
        androidx.appcompat.app.d currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError == null) {
            return;
        }
        com.reactnativestripesdk.pushprovisioning.f.f20353a.f(currentActivityOrResolveWithError, i11, new h(promise));
    }

    @ReactMethod
    public final void isGooglePaySupported(ReadableMap readableMap, Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        e0 e0Var = new e0(reactApplicationContext, hr.d.e(readableMap, "testEnv"), hr.d.e(readableMap, "existingPaymentMethodRequired"), promise);
        androidx.appcompat.app.d currentActivityOrResolveWithError = getCurrentActivityOrResolveWithError(promise);
        if (currentActivityOrResolveWithError == null) {
            return;
        }
        try {
            currentActivityOrResolveWithError.getSupportFragmentManager().m().e(e0Var, "google_pay_support_fragment").h();
        } catch (IllegalStateException e11) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), e11.getMessage()));
            vz.b0 b0Var = vz.b0.f54756a;
        }
    }

    @ReactMethod
    public final void presentGooglePay(ReadableMap params, Promise promise) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        String j11 = hr.d.j(params, "clientSecret", null, 4, null);
        if (j11 == null) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Failed.toString(), "you must provide clientSecret"));
        } else if (hr.d.e(params, "forSetupIntent")) {
            String j12 = hr.d.j(params, "currencyCode", null, 4, null);
            if (j12 == null) {
                promise.resolve(hr.a.d(com.reactnativestripesdk.utils.e.Failed.toString(), "you must provide currencyCode"));
                return;
            }
            b0 b0Var = this.googlePayFragment;
            if (b0Var == null) {
                return;
            }
            b0Var.o(j11, j12, promise);
        } else {
            b0 b0Var2 = this.googlePayFragment;
            if (b0Var2 == null) {
                return;
            }
            b0Var2.n(j11, promise);
        }
    }

    @ReactMethod
    public final void presentPaymentSheet(Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        m0 m0Var = this.paymentSheetFragment;
        if (m0Var == null) {
            return;
        }
        m0Var.k(promise);
    }

    @ReactMethod
    public final void retrievePaymentIntent(String clientSecret, Promise promise) {
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(promise, "promise");
        v20.k.d(v20.p0.a(e1.b()), null, null, new j(clientSecret, promise, null), 3, null);
    }

    @ReactMethod
    public final void retrieveSetupIntent(String clientSecret, Promise promise) {
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(promise, "promise");
        v20.k.d(v20.p0.a(e1.b()), null, null, new k(clientSecret, promise, null), 3, null);
    }

    public final void setCardFieldView(com.reactnativestripesdk.k kVar) {
        this.cardFieldView = kVar;
    }

    public final void setCardFormView(v vVar) {
        this.cardFormView = vVar;
    }

    @ReactMethod
    public final void verifyMicrodeposits(boolean z11, String clientSecret, ReadableMap params, Promise promise) {
        vz.b0 b0Var;
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(promise, "promise");
        ReadableArray array = params.getArray("amounts");
        String string = params.getString("descriptorCode");
        if ((array != null && string != null) || (array == null && string == null)) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), "You must provide either amounts OR descriptorCode, not both."));
            return;
        }
        l lVar = new l(promise);
        m mVar = new m(promise);
        Stripe stripe = null;
        if (array == null) {
            b0Var = null;
        } else if (array.size() != 2) {
            promise.resolve(hr.a.d(com.reactnativestripesdk.utils.d.Failed.toString(), kotlin.jvm.internal.s.p("Expected 2 integers in the amounts array, but received ", Integer.valueOf(array.size()))));
            return;
        } else {
            if (z11) {
                Stripe stripe2 = this.stripe;
                if (stripe2 == null) {
                    kotlin.jvm.internal.s.x("stripe");
                    stripe2 = null;
                }
                stripe2.verifyPaymentIntentWithMicrodeposits(clientSecret, array.getInt(0), array.getInt(1), lVar);
            } else {
                Stripe stripe3 = this.stripe;
                if (stripe3 == null) {
                    kotlin.jvm.internal.s.x("stripe");
                    stripe3 = null;
                }
                stripe3.verifySetupIntentWithMicrodeposits(clientSecret, array.getInt(0), array.getInt(1), mVar);
            }
            b0Var = vz.b0.f54756a;
        }
        if (b0Var != null || string == null) {
            return;
        }
        if (z11) {
            Stripe stripe4 = this.stripe;
            if (stripe4 == null) {
                kotlin.jvm.internal.s.x("stripe");
            } else {
                stripe = stripe4;
            }
            stripe.verifyPaymentIntentWithMicrodeposits(clientSecret, string, lVar);
            return;
        }
        Stripe stripe5 = this.stripe;
        if (stripe5 == null) {
            kotlin.jvm.internal.s.x("stripe");
        } else {
            stripe = stripe5;
        }
        stripe.verifySetupIntentWithMicrodeposits(clientSecret, string, mVar);
    }
}