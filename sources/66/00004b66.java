package com.stripe.android;

import android.content.Context;
import android.util.Log;
import com.stripe.android.EphemeralKeyManager;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.IssuingCardPinService;
import com.stripe.android.core.AppInfo;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.i;
import v20.k;
import v20.p0;
import vz.b0;
import wz.w0;
import zz.g;

/* loaded from: classes2.dex */
public final class IssuingCardPinService {
    private final EphemeralKeyManager ephemeralKeyManager;
    private final OperationIdFactory operationIdFactory;
    private final Map<String, IssuingCardPinRetrievalListener> retrievalListeners;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final Map<String, IssuingCardPinUpdateListener> updateListeners;
    private final g workContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = IssuingCardPinService.class.getName();

    /* loaded from: classes2.dex */
    public enum CardPinActionError {
        UNKNOWN_ERROR,
        EPHEMERAL_KEY_ERROR,
        ONE_TIME_CODE_INCORRECT,
        ONE_TIME_CODE_EXPIRED,
        ONE_TIME_CODE_TOO_MANY_ATTEMPTS,
        ONE_TIME_CODE_ALREADY_REDEEMED
    }

    /* loaded from: classes2.dex */
    public interface IssuingCardPinRetrievalListener extends Listener {
        void onIssuingCardPinRetrieved(String str);
    }

    /* loaded from: classes2.dex */
    public interface IssuingCardPinUpdateListener extends Listener {
        void onIssuingCardPinUpdated();
    }

    /* loaded from: classes2.dex */
    public interface Listener {
        void onError(CardPinActionError cardPinActionError, String str, Throwable th2);
    }

    public IssuingCardPinService(EphemeralKeyProvider keyProvider, StripeRepository stripeRepository, OperationIdFactory operationIdFactory, String str, g workContext) {
        s.g(keyProvider, "keyProvider");
        s.g(stripeRepository, "stripeRepository");
        s.g(operationIdFactory, "operationIdFactory");
        s.g(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.operationIdFactory = operationIdFactory;
        this.stripeAccountId = str;
        this.workContext = workContext;
        this.retrievalListeners = new LinkedHashMap();
        this.updateListeners = new LinkedHashMap();
        this.ephemeralKeyManager = new EphemeralKeyManager(keyProvider, new EphemeralKeyManager.KeyManagerListener() { // from class: com.stripe.android.IssuingCardPinService$ephemeralKeyManager$1
            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyError(String operationId, int i11, String errorMessage) {
                b0 b0Var;
                s.g(operationId, "operationId");
                s.g(errorMessage, "errorMessage");
                IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = (IssuingCardPinService.IssuingCardPinUpdateListener) IssuingCardPinService.access$getUpdateListeners$p(IssuingCardPinService.this).remove(operationId);
                IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = (IssuingCardPinService.IssuingCardPinRetrievalListener) IssuingCardPinService.access$getRetrievalListeners$p(IssuingCardPinService.this).remove(operationId);
                if (issuingCardPinRetrievalListener == null) {
                    b0Var = null;
                } else {
                    issuingCardPinRetrievalListener.onError(IssuingCardPinService.CardPinActionError.EPHEMERAL_KEY_ERROR, errorMessage, null);
                    b0Var = b0.f54756a;
                }
                if (b0Var != null || issuingCardPinUpdateListener == null) {
                    return;
                }
                issuingCardPinUpdateListener.onError(IssuingCardPinService.CardPinActionError.EPHEMERAL_KEY_ERROR, errorMessage, null);
            }

            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation operation) {
                s.g(ephemeralKey, "ephemeralKey");
                s.g(operation, "operation");
                b0 b0Var = null;
                if (operation instanceof EphemeralOperation.Issuing.RetrievePin) {
                    IssuingCardPinService.IssuingCardPinRetrievalListener issuingCardPinRetrievalListener = (IssuingCardPinService.IssuingCardPinRetrievalListener) IssuingCardPinService.access$getRetrievalListeners$p(IssuingCardPinService.this).remove(operation.getId$payments_core_release());
                    if (issuingCardPinRetrievalListener != null) {
                        IssuingCardPinService.access$fireRetrievePinRequest(IssuingCardPinService.this, ephemeralKey, (EphemeralOperation.Issuing.RetrievePin) operation, issuingCardPinRetrievalListener);
                        b0Var = b0.f54756a;
                    }
                    if (b0Var == null) {
                        IssuingCardPinService.access$logMissingListener(IssuingCardPinService.this);
                    }
                } else if (operation instanceof EphemeralOperation.Issuing.UpdatePin) {
                    IssuingCardPinService.IssuingCardPinUpdateListener issuingCardPinUpdateListener = (IssuingCardPinService.IssuingCardPinUpdateListener) IssuingCardPinService.access$getUpdateListeners$p(IssuingCardPinService.this).remove(operation.getId$payments_core_release());
                    if (issuingCardPinUpdateListener != null) {
                        IssuingCardPinService.access$fireUpdatePinRequest(IssuingCardPinService.this, ephemeralKey, (EphemeralOperation.Issuing.UpdatePin) operation, issuingCardPinUpdateListener);
                        b0Var = b0.f54756a;
                    }
                    if (b0Var == null) {
                        IssuingCardPinService.access$logMissingListener(IssuingCardPinService.this);
                    }
                }
            }
        }, operationIdFactory, true, null, 0L, 48, null);
    }

    public static final /* synthetic */ void access$fireRetrievePinRequest(IssuingCardPinService issuingCardPinService, EphemeralKey ephemeralKey, EphemeralOperation.Issuing.RetrievePin retrievePin, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener) {
        issuingCardPinService.fireRetrievePinRequest(ephemeralKey, retrievePin, issuingCardPinRetrievalListener);
    }

    public static final /* synthetic */ void access$fireUpdatePinRequest(IssuingCardPinService issuingCardPinService, EphemeralKey ephemeralKey, EphemeralOperation.Issuing.UpdatePin updatePin, IssuingCardPinUpdateListener issuingCardPinUpdateListener) {
        issuingCardPinService.fireUpdatePinRequest(ephemeralKey, updatePin, issuingCardPinUpdateListener);
    }

    public static final /* synthetic */ Map access$getRetrievalListeners$p(IssuingCardPinService issuingCardPinService) {
        return issuingCardPinService.retrievalListeners;
    }

    public static final /* synthetic */ Map access$getUpdateListeners$p(IssuingCardPinService issuingCardPinService) {
        return issuingCardPinService.updateListeners;
    }

    public static final /* synthetic */ void access$logMissingListener(IssuingCardPinService issuingCardPinService) {
        issuingCardPinService.logMissingListener();
    }

    public static final IssuingCardPinService create(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create(context, ephemeralKeyProvider);
    }

    public static final IssuingCardPinService create(Context context, String str, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create(context, str, ephemeralKeyProvider);
    }

    public static final IssuingCardPinService create(Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider) {
        return Companion.create(context, str, str2, ephemeralKeyProvider);
    }

    public final void fireRetrievePinRequest(EphemeralKey ephemeralKey, EphemeralOperation.Issuing.RetrievePin retrievePin, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener) {
        k.d(p0.a(this.workContext), null, null, new IssuingCardPinService$fireRetrievePinRequest$1(this, retrievePin, ephemeralKey, issuingCardPinRetrievalListener, null), 3, null);
    }

    public final void fireUpdatePinRequest(EphemeralKey ephemeralKey, EphemeralOperation.Issuing.UpdatePin updatePin, IssuingCardPinUpdateListener issuingCardPinUpdateListener) {
        k.d(p0.a(this.workContext), null, null, new IssuingCardPinService$fireUpdatePinRequest$1(this, updatePin, ephemeralKey, issuingCardPinUpdateListener, null), 3, null);
    }

    public final void logMissingListener() {
        Log.e(TAG, s.p(IssuingCardPinService.class.getName(), " was called without a listener"));
    }

    public final Object onRetrievePinError(Throwable th2, IssuingCardPinRetrievalListener issuingCardPinRetrievalListener, zz.d<? super b0> dVar) {
        Object d11;
        Object g11 = i.g(e1.c(), new IssuingCardPinService$onRetrievePinError$2(th2, issuingCardPinRetrievalListener, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    public final Object onUpdatePinError(Throwable th2, IssuingCardPinUpdateListener issuingCardPinUpdateListener, zz.d<? super b0> dVar) {
        Object d11;
        Object g11 = i.g(e1.c(), new IssuingCardPinService$onUpdatePinError$2(th2, issuingCardPinUpdateListener, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : b0.f54756a;
    }

    public final void retrievePin(String cardId, String verificationId, String userOneTimeCode, IssuingCardPinRetrievalListener listener) {
        s.g(cardId, "cardId");
        s.g(verificationId, "verificationId");
        s.g(userOneTimeCode, "userOneTimeCode");
        s.g(listener, "listener");
        String create = this.operationIdFactory.create();
        this.retrievalListeners.put(create, listener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(new EphemeralOperation.Issuing.RetrievePin(cardId, verificationId, userOneTimeCode, create));
    }

    public final void updatePin(String cardId, String newPin, String verificationId, String userOneTimeCode, IssuingCardPinUpdateListener listener) {
        s.g(cardId, "cardId");
        s.g(newPin, "newPin");
        s.g(verificationId, "verificationId");
        s.g(userOneTimeCode, "userOneTimeCode");
        s.g(listener, "listener");
        String create = this.operationIdFactory.create();
        this.updateListeners.put(create, listener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(new EphemeralOperation.Issuing.UpdatePin(cardId, newPin, verificationId, userOneTimeCode, create));
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ IssuingCardPinService create$default(Companion companion, Context context, String str, String str2, EphemeralKeyProvider ephemeralKeyProvider, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return companion.create(context, str, str2, ephemeralKeyProvider);
        }

        public final IssuingCardPinService create(Context context, EphemeralKeyProvider keyProvider) {
            s.g(context, "context");
            s.g(keyProvider, "keyProvider");
            PaymentConfiguration companion = PaymentConfiguration.Companion.getInstance(context);
            return create(context, companion.getPublishableKey(), companion.getStripeAccountId(), keyProvider);
        }

        public final IssuingCardPinService create(Context context, String publishableKey, EphemeralKeyProvider keyProvider) {
            s.g(context, "context");
            s.g(publishableKey, "publishableKey");
            s.g(keyProvider, "keyProvider");
            return create$default(this, context, publishableKey, null, keyProvider, 4, null);
        }

        public final IssuingCardPinService create(Context context, String publishableKey, String str, EphemeralKeyProvider keyProvider) {
            Set c11;
            s.g(context, "context");
            s.g(publishableKey, "publishableKey");
            s.g(keyProvider, "keyProvider");
            IssuingCardPinService$Companion$create$1 issuingCardPinService$Companion$create$1 = new IssuingCardPinService$Companion$create$1(publishableKey);
            AppInfo appInfo = Stripe.Companion.getAppInfo();
            IssuingCardPinService$Companion$create$2 issuingCardPinService$Companion$create$2 = new IssuingCardPinService$Companion$create$2(publishableKey);
            c11 = w0.c("IssuingCardPinService");
            return new IssuingCardPinService(keyProvider, new StripeApiRepository(context, issuingCardPinService$Companion$create$1, appInfo, null, null, null, null, null, null, new PaymentAnalyticsRequestFactory(context, issuingCardPinService$Companion$create$2, c11), null, null, null, null, 15864, null), new StripeOperationIdFactory(), str, null, 16, null);
        }
    }

    public /* synthetic */ IssuingCardPinService(EphemeralKeyProvider ephemeralKeyProvider, StripeRepository stripeRepository, OperationIdFactory operationIdFactory, String str, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ephemeralKeyProvider, stripeRepository, (i11 & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? e1.b() : gVar);
    }
}