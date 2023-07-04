package com.stripe.android.networking;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.StripeApiBeta;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.core.networking.StripeResponseKtxKt;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.Customer;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.model.parsers.ConsumerPaymentDetailsJsonParser;
import com.stripe.android.model.parsers.ConsumerSessionJsonParser;
import com.stripe.android.model.parsers.ConsumerSessionLookupJsonParser;
import com.stripe.android.model.parsers.CustomerJsonParser;
import com.stripe.android.model.parsers.FinancialConnectionsSessionJsonParser;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.parsers.PaymentMethodPreferenceForPaymentIntentJsonParser;
import com.stripe.android.model.parsers.PaymentMethodPreferenceForSetupIntentJsonParser;
import com.stripe.android.model.parsers.PaymentMethodPreferenceJsonParser;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import com.stripe.android.model.parsers.SourceJsonParser;
import com.stripe.android.model.parsers.Stripe3ds2AuthResultJsonParser;
import com.stripe.android.model.parsers.TokenJsonParser;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.security.Security;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;
import vz.p;
import vz.q;
import vz.r;
import vz.v;
import wz.e0;
import wz.r0;
import wz.s0;
import wz.w;
import wz.w0;
import wz.x0;
import wz.y0;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class StripeApiRepository extends StripeRepository {
    private static final String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";
    private static final String PAYMENT_USER_AGENT = "payment_user_agent";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final ApiRequest.Factory apiRequestFactory;
    private final AppInfo appInfo;
    private final FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils;
    private final FraudDetectionDataRepository fraudDetectionDataRepository;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final Set<String> productUsageTokens;
    private final StripeNetworkClient stripeNetworkClient;
    private final g workContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, List<String>> createExpandParam(List<String> list) {
            Map<String, List<String>> i11;
            if (!(!list.isEmpty())) {
                list = null;
            }
            Map<String, List<String>> f11 = list != null ? r0.f(v.a("expand", list)) : null;
            if (f11 == null) {
                i11 = s0.i();
                return i11;
            }
            return f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, String> createVerificationParam(String str, String str2) {
            Map<String, String> l11;
            l11 = s0.l(v.a("id", str), v.a("one_time_code", str2));
            return l11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String str, Object... objArr) {
            q0 q0Var = q0.f34921a;
            Locale locale = Locale.ENGLISH;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            s.f(format, "format(locale, format, *args)");
            return getApiUrl(format);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEdgeUrl(String str) {
            return s.p("https://api.stripe.com/edge-internal/", str);
        }

        public final /* synthetic */ String getAddCustomerSourceUrl$payments_core_release(String customerId) {
            s.g(customerId, "customerId");
            return getApiUrl("customers/%s/sources", customerId);
        }

        public final /* synthetic */ String getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release(String paymentIntentId, String financialConnectionsSessionId) {
            s.g(paymentIntentId, "paymentIntentId");
            s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
            return getApiUrl("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release(String setupIntentId, String financialConnectionsSessionId) {
            s.g(setupIntentId, "setupIntentId");
            s.g(financialConnectionsSessionId, "financialConnectionsSessionId");
            return getApiUrl("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String getAttachPaymentMethodUrl$payments_core_release(String paymentMethodId) {
            s.g(paymentMethodId, "paymentMethodId");
            return getApiUrl("payment_methods/%s/attach", paymentMethodId);
        }

        public final /* synthetic */ String getCancelPaymentIntentSourceUrl$payments_core_release(String paymentIntentId) {
            s.g(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/source_cancel", paymentIntentId);
        }

        public final /* synthetic */ String getCancelSetupIntentSourceUrl$payments_core_release(String setupIntentId) {
            s.g(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s/source_cancel", setupIntentId);
        }

        public final /* synthetic */ String getConfirmConsumerVerificationUrl$payments_core_release() {
            return getApiUrl("consumers/sessions/confirm_verification");
        }

        public final /* synthetic */ String getConfirmPaymentIntentUrl$payments_core_release(String paymentIntentId) {
            s.g(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/confirm", paymentIntentId);
        }

        public final /* synthetic */ String getConfirmSetupIntentUrl$payments_core_release(String setupIntentId) {
            s.g(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s/confirm", setupIntentId);
        }

        public final /* synthetic */ String getConsumerPaymentDetailsUrl$payments_core_release() {
            return getApiUrl("consumers/payment_details");
        }

        public final /* synthetic */ String getConsumerSessionLookupUrl$payments_core_release() {
            return getApiUrl("consumers/sessions/lookup");
        }

        public final /* synthetic */ String getConsumerSignUpUrl$payments_core_release() {
            return getApiUrl("consumers/accounts/sign_up");
        }

        public final /* synthetic */ String getDeleteCustomerSourceUrl$payments_core_release(String customerId, String sourceId) {
            s.g(customerId, "customerId");
            s.g(sourceId, "sourceId");
            return getApiUrl("customers/%s/sources/%s", customerId, sourceId);
        }

        public final /* synthetic */ String getIssuingCardPinUrl$payments_core_release(String cardId) {
            s.g(cardId, "cardId");
            return getApiUrl("issuing/cards/%s/pin", cardId);
        }

        public final /* synthetic */ String getLogoutConsumerUrl$payments_core_release() {
            return getApiUrl("consumers/sessions/log_out");
        }

        public final /* synthetic */ String getPaymentMethodsUrl$payments_core_release() {
            return getApiUrl("payment_methods");
        }

        public final /* synthetic */ String getRefreshPaymentIntentUrl$payments_core_release(String paymentIntentId) {
            s.g(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String getRetrieveCustomerUrl$payments_core_release(String customerId) {
            s.g(customerId, "customerId");
            return getApiUrl("customers/%s", customerId);
        }

        public final /* synthetic */ String getRetrievePaymentIntentUrl$payments_core_release(String paymentIntentId) {
            s.g(paymentIntentId, "paymentIntentId");
            return getApiUrl("payment_intents/%s", paymentIntentId);
        }

        public final /* synthetic */ String getRetrieveSetupIntentUrl$payments_core_release(String setupIntentId) {
            s.g(setupIntentId, "setupIntentId");
            return getApiUrl("setup_intents/%s", setupIntentId);
        }

        public final /* synthetic */ String getRetrieveSourceApiUrl$payments_core_release(String sourceId) {
            s.g(sourceId, "sourceId");
            return getApiUrl("sources/%s", sourceId);
        }

        public final /* synthetic */ String getRetrieveTokenApiUrl$payments_core_release(String tokenId) {
            s.g(tokenId, "tokenId");
            return getApiUrl("tokens/%s", tokenId);
        }

        public final /* synthetic */ String getSourcesUrl$payments_core_release() {
            return getApiUrl("sources");
        }

        public final /* synthetic */ String getStartConsumerVerificationUrl$payments_core_release() {
            return getApiUrl("consumers/sessions/start_verification");
        }

        public final /* synthetic */ String getTokensUrl$payments_core_release() {
            return getApiUrl("tokens");
        }

        public final /* synthetic */ String getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(String clientSecret) {
            s.g(clientSecret, "clientSecret");
            return getApiUrl("payment_intents/%s/verify_microdeposits", clientSecret);
        }

        public final /* synthetic */ String getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(String clientSecret) {
            s.g(clientSecret, "clientSecret");
            return getApiUrl("setup_intents/%s/verify_microdeposits", clientSecret);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getApiUrl(String str) {
            return s.p("https://api.stripe.com/v1/", str);
        }

        public final /* synthetic */ String getConsumerPaymentDetailsUrl$payments_core_release(String paymentDetailsId) {
            s.g(paymentDetailsId, "paymentDetailsId");
            return getApiUrl(s.p("consumers/payment_details/", paymentDetailsId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static abstract class DnsCacheData {

        /* loaded from: classes6.dex */
        public static final class Failure extends DnsCacheData {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            private Failure() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Success extends DnsCacheData {
            public static final int $stable = 0;
            private final String originalDnsCacheTtl;

            public Success(String str) {
                super(null);
                this.originalDnsCacheTtl = str;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = success.originalDnsCacheTtl;
                }
                return success.copy(str);
            }

            public final String component1() {
                return this.originalDnsCacheTtl;
            }

            public final Success copy(String str) {
                return new Success(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && s.c(this.originalDnsCacheTtl, ((Success) obj).originalDnsCacheTtl);
            }

            public final String getOriginalDnsCacheTtl() {
                return this.originalDnsCacheTtl;
            }

            public int hashCode() {
                String str = this.originalDnsCacheTtl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Success(originalDnsCacheTtl=" + ((Object) this.originalDnsCacheTtl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private DnsCacheData() {
        }

        public /* synthetic */ DnsCacheData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider) {
        this(context, publishableKeyProvider, null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo) {
        this(context, publishableKeyProvider, appInfo, null, null, null, null, null, null, null, null, null, null, null, 16376, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger) {
        this(context, publishableKeyProvider, appInfo, logger, null, null, null, null, null, null, null, null, null, null, 16368, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, null, null, null, null, null, null, null, null, null, 16352, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, null, null, null, null, null, null, null, null, 16320, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, null, null, null, null, null, null, null, 16256, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(stripeNetworkClient, "stripeNetworkClient");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, null, null, null, null, null, null, 16128, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, null, null, null, null, null, 15872, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(fraudDetectionDataRepository, "fraudDetectionDataRepository");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, paymentAnalyticsRequestFactory, null, null, null, null, 15360, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, null, null, null, 14336, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, betas, null, null, 12288, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        s.g(betas, "betas");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas, String apiVersion) {
        this(context, publishableKeyProvider, appInfo, logger, workContext, productUsageTokens, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, paymentAnalyticsRequestFactory, fraudDetectionDataParamsUtils, betas, apiVersion, null, PKIFailureInfo.certRevoked, null);
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        s.g(betas, "betas");
        s.g(apiVersion, "apiVersion");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ StripeApiRepository(android.content.Context r19, h00.a r20, com.stripe.android.core.AppInfo r21, com.stripe.android.core.Logger r22, zz.g r23, java.util.Set r24, com.stripe.android.core.networking.StripeNetworkClient r25, com.stripe.android.core.networking.AnalyticsRequestExecutor r26, com.stripe.android.FraudDetectionDataRepository r27, com.stripe.android.networking.PaymentAnalyticsRequestFactory r28, com.stripe.android.networking.FraudDetectionDataParamsUtils r29, java.util.Set r30, java.lang.String r31, java.lang.String r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.<init>(android.content.Context, h00.a, com.stripe.android.core.AppInfo, com.stripe.android.core.Logger, zz.g, java.util.Set, com.stripe.android.core.networking.StripeNetworkClient, com.stripe.android.core.networking.AnalyticsRequestExecutor, com.stripe.android.FraudDetectionDataRepository, com.stripe.android.networking.PaymentAnalyticsRequestFactory, com.stripe.android.networking.FraudDetectionDataParamsUtils, java.util.Set, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final p<String, String> buildPaymentUserAgentPair(Set<String> set) {
        Set c11;
        Set m11;
        Set m12;
        String l02;
        c11 = w0.c("stripe-android/20.5.0");
        m11 = y0.m(c11, this.productUsageTokens);
        m12 = y0.m(m11, set);
        l02 = e0.l0(m12, ";", null, null, 0, null, null, 62, null);
        return v.a(PAYMENT_USER_AGENT, l02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ p buildPaymentUserAgentPair$default(StripeApiRepository stripeApiRepository, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = x0.d();
        }
        return stripeApiRepository.buildPaymentUserAgentPair(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object confirmPaymentIntentInternal(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, List<String> list, d<? super PaymentIntent> dVar) {
        Map<String, ?> p11;
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = this.fraudDetectionDataParamsUtils;
        Map<String, Object> paramMap = confirmPaymentIntentParams.toParamMap();
        if (options.getApiKeyIsUserKey()) {
            paramMap = s0.m(paramMap, "client_secret");
        }
        Map<String, Object> maybeAddPaymentUserAgent = maybeAddPaymentUserAgent(paramMap, confirmPaymentIntentParams.getPaymentMethodCreateParams(), confirmPaymentIntentParams.getSourceParams());
        Companion companion = Companion;
        p11 = s0.p(maybeAddPaymentUserAgent, companion.createExpandParam(list));
        Map<String, ?> addFraudDetectionData$payments_core_release = fraudDetectionDataParamsUtils.addFraudDetectionData$payments_core_release(p11, getFraudDetectionData());
        String confirmPaymentIntentUrl$payments_core_release = companion.getConfirmPaymentIntentUrl$payments_core_release(new PaymentIntent.ClientSecret(confirmPaymentIntentParams.getClientSecret()).getPaymentIntentId$payments_core_release());
        fireFraudDetectionDataRequest();
        return fetchStripeModel(this.apiRequestFactory.createPost(confirmPaymentIntentUrl$payments_core_release, options, addFraudDetectionData$payments_core_release), new PaymentIntentJsonParser(), new StripeApiRepository$confirmPaymentIntentInternal$2(confirmPaymentIntentParams, this), dVar);
    }

    private final Map<String, Object> createClientSecretParam(String str, List<String> list) {
        Map f11;
        Map<String, Object> p11;
        f11 = r0.f(v.a("client_secret", str));
        p11 = s0.p(f11, Companion.createExpandParam(list));
        return p11;
    }

    private final DnsCacheData disableDnsCache() {
        DnsCacheData.Failure b11;
        try {
            q.a aVar = q.f54772b;
            String property = Security.getProperty(DNS_CACHE_TTL_PROPERTY_NAME);
            Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, "0");
            b11 = q.b(new DnsCacheData.Success(property));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        DnsCacheData.Failure failure = DnsCacheData.Failure.INSTANCE;
        if (q.g(b11)) {
            b11 = failure;
        }
        return (DnsCacheData) b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <ModelType extends com.stripe.android.core.model.StripeModel> java.lang.Object fetchStripeModel(com.stripe.android.core.networking.ApiRequest r5, com.stripe.android.core.model.parsers.ModelJsonParser<? extends ModelType> r6, h00.a<vz.b0> r7, zz.d<? super ModelType> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1 r0 = (com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1 r0 = new com.stripe.android.networking.StripeApiRepository$fetchStripeModel$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            r6 = r5
            com.stripe.android.core.model.parsers.ModelJsonParser r6 = (com.stripe.android.core.model.parsers.ModelJsonParser) r6
            vz.r.b(r8)
            goto L44
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            vz.r.b(r8)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r4.makeApiRequest$payments_core_release(r5, r7, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            com.stripe.android.core.networking.StripeResponse r8 = (com.stripe.android.core.networking.StripeResponse) r8
            org.json.JSONObject r5 = com.stripe.android.core.networking.StripeResponseKtxKt.responseJson(r8)
            com.stripe.android.core.model.StripeModel r5 = r6.parse(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.fetchStripeModel(com.stripe.android.core.networking.ApiRequest, com.stripe.android.core.model.parsers.ModelJsonParser, h00.a, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireAnalyticsRequest(PaymentAnalyticsEvent paymentAnalyticsEvent) {
        fireAnalyticsRequest$payments_core_release(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    private final void fireFraudDetectionDataRequest() {
        this.fraudDetectionDataRepository.refresh();
    }

    private final FraudDetectionData getFraudDetectionData() {
        return this.fraudDetectionDataRepository.getCached();
    }

    private final void handleApiError(StripeResponse<String> stripeResponse) {
        RequestId requestId = stripeResponse.getRequestId();
        String value = requestId == null ? null : requestId.getValue();
        int code = stripeResponse.getCode();
        StripeError parse = new StripeErrorJsonParser().parse(StripeResponseKtxKt.responseJson(stripeResponse));
        if (code != 429) {
            switch (code) {
                case 400:
                case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                    throw new InvalidRequestException(parse, value, code, null, null, 24, null);
                case 401:
                    throw new AuthenticationException(parse, value);
                case WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE /* 402 */:
                    throw new CardException(parse, value);
                case DownloaderService.STATUS_FORBIDDEN /* 403 */:
                    throw new PermissionException(parse, value);
                default:
                    throw new APIException(parse, value, code, null, null, 24, null);
            }
        }
        throw new RateLimitException(parse, value, null, null, 12, null);
    }

    private final Map<String, Object> maybeAddPaymentUserAgent(Map<String, ? extends Object> map, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams) {
        Map q11;
        Map<String, Object> q12;
        Map q13;
        Object obj = map.get("payment_method_data");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 == null) {
            q12 = null;
        } else {
            Set attribution$payments_core_release = paymentMethodCreateParams == null ? null : paymentMethodCreateParams.getAttribution$payments_core_release();
            if (attribution$payments_core_release == null) {
                attribution$payments_core_release = x0.d();
            }
            q11 = s0.q(map2, buildPaymentUserAgentPair(attribution$payments_core_release));
            q12 = s0.q(map, v.a("payment_method_data", q11));
        }
        if (q12 == null) {
            Object obj2 = map.get(ConfirmPaymentIntentParams.PARAM_SOURCE_DATA);
            Map map3 = obj2 instanceof Map ? (Map) obj2 : null;
            if (map3 == null) {
                return map;
            }
            Set<String> attribution$payments_core_release2 = sourceParams != null ? sourceParams.getAttribution$payments_core_release() : null;
            if (attribution$payments_core_release2 == null) {
                attribution$payments_core_release2 = x0.d();
            }
            q13 = s0.q(map3, buildPaymentUserAgentPair(attribution$payments_core_release2));
            q12 = s0.q(map, v.a(ConfirmPaymentIntentParams.PARAM_SOURCE_DATA, q13));
            if (q12 == null) {
                return map;
            }
        }
        return q12;
    }

    static /* synthetic */ Map maybeAddPaymentUserAgent$default(StripeApiRepository stripeApiRepository, Map map, PaymentMethodCreateParams paymentMethodCreateParams, SourceParams sourceParams, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            sourceParams = null;
        }
        return stripeApiRepository.maybeAddPaymentUserAgent(map, paymentMethodCreateParams, sourceParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object maybeForDashboard(com.stripe.android.model.ConfirmPaymentIntentParams r5, com.stripe.android.core.networking.ApiRequest.Options r6, zz.d<? super com.stripe.android.model.ConfirmPaymentIntentParams> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.networking.StripeApiRepository$maybeForDashboard$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.networking.StripeApiRepository$maybeForDashboard$1 r0 = (com.stripe.android.networking.StripeApiRepository$maybeForDashboard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$maybeForDashboard$1 r0 = new com.stripe.android.networking.StripeApiRepository$maybeForDashboard$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.stripe.android.model.ConfirmPaymentIntentParams r5 = (com.stripe.android.model.ConfirmPaymentIntentParams) r5
            vz.r.b(r7)
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            vz.r.b(r7)
            boolean r7 = r6.getApiKeyIsUserKey()
            if (r7 == 0) goto L75
            com.stripe.android.model.PaymentMethodCreateParams r7 = r5.getPaymentMethodCreateParams()
            if (r7 != 0) goto L45
            goto L75
        L45:
            com.stripe.android.model.PaymentMethodCreateParams r7 = r5.getPaymentMethodCreateParams()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r4.createPaymentMethod(r7, r6, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            com.stripe.android.model.PaymentMethod r7 = (com.stripe.android.model.PaymentMethod) r7
            if (r7 != 0) goto L5a
            r6 = 0
            goto L5c
        L5a:
            java.lang.String r6 = r7.f20932id
        L5c:
            if (r6 == 0) goto L69
            com.stripe.android.model.ConfirmPaymentIntentParams$Companion r7 = com.stripe.android.model.ConfirmPaymentIntentParams.Companion
            java.lang.String r5 = r5.getClientSecret()
            com.stripe.android.model.ConfirmPaymentIntentParams r5 = r7.createForDashboard$payments_core_release(r5, r6)
            return r5
        L69:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.maybeForDashboard(com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    private final void resetDnsCache(DnsCacheData dnsCacheData) {
        if (dnsCacheData instanceof DnsCacheData.Success) {
            String originalDnsCacheTtl = ((DnsCacheData.Success) dnsCacheData).getOriginalDnsCacheTtl();
            if (originalDnsCacheTtl == null) {
                originalDnsCacheTtl = "-1";
            }
            Security.setProperty(DNS_CACHE_TTL_PROPERTY_NAME, originalDnsCacheTtl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends StripeIntent> Object retrieveStripeIntentWithOrderedPaymentMethods(String str, ApiRequest.Options options, Locale locale, PaymentMethodPreferenceJsonParser<? extends T> paymentMethodPreferenceJsonParser, PaymentAnalyticsEvent paymentAnalyticsEvent, d<? super T> dVar) {
        List<String> d11;
        Map l11;
        Map<String, ?> p11;
        if (options.getApiKeyIsUserKey()) {
            return null;
        }
        fireFraudDetectionDataRequest();
        d11 = wz.v.d("payment_method_preference." + paymentMethodPreferenceJsonParser.getStripeIntentFieldName() + ".payment_method");
        Map<String, Object> createClientSecretParam = createClientSecretParam(str, d11);
        l11 = s0.l(v.a("type", paymentMethodPreferenceJsonParser.getStripeIntentFieldName()), v.a("locale", locale.toLanguageTag()));
        p11 = s0.p(createClientSecretParam, l11);
        return fetchStripeModel(this.apiRequestFactory.createGet(Companion.getApiUrl("elements/sessions"), options, p11), paymentMethodPreferenceJsonParser, new StripeApiRepository$retrieveStripeIntentWithOrderedPaymentMethods$2(this, paymentAnalyticsEvent), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object addCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, d<? super Source> dVar) {
        Map<String, ?> f11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String addCustomerSourceUrl$payments_core_release = Companion.getAddCustomerSourceUrl$payments_core_release(str);
        f11 = r0.f(v.a(Stripe3ds2AuthParams.FIELD_SOURCE, str3));
        return fetchStripeModel(factory.createPost(addCustomerSourceUrl$payments_core_release, options, f11), new SourceJsonParser(), new StripeApiRepository$addCustomerSource$2(this, set, str4), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object attachFinancialConnectionsSessionToPaymentIntent(String str, String str2, String str3, ApiRequest.Options options, d<? super PaymentIntent> dVar) {
        Map<String, ?> f11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String attachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release = Companion.getAttachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release(str2, str3);
        f11 = r0.f(v.a("client_secret", str));
        return fetchStripeModel(factory.createPost(attachFinancialConnectionsSessionToPaymentIntentUrl$payments_core_release, options, f11), new PaymentIntentJsonParser(), StripeApiRepository$attachFinancialConnectionsSessionToPaymentIntent$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object attachFinancialConnectionsSessionToSetupIntent(String str, String str2, String str3, ApiRequest.Options options, d<? super SetupIntent> dVar) {
        Map<String, ?> f11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String attachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release = Companion.getAttachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release(str2, str3);
        f11 = r0.f(v.a("client_secret", str));
        return fetchStripeModel(factory.createPost(attachFinancialConnectionsSessionToSetupIntentUrl$payments_core_release, options, f11), new SetupIntentJsonParser(), StripeApiRepository$attachFinancialConnectionsSessionToSetupIntent$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object attachPaymentMethod(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, d<? super PaymentMethod> dVar) {
        Map<String, ?> f11;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String attachPaymentMethodUrl$payments_core_release = Companion.getAttachPaymentMethodUrl$payments_core_release(str3);
        f11 = r0.f(v.a(PaymentSheetEvent.FIELD_CUSTOMER, str));
        return fetchStripeModel(factory.createPost(attachPaymentMethodUrl$payments_core_release, options, f11), new PaymentMethodJsonParser(), new StripeApiRepository$attachPaymentMethod$2(this, set), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object cancelPaymentIntentSource$payments_core_release(String str, String str2, ApiRequest.Options options, d<? super PaymentIntent> dVar) {
        Map<String, ?> f11;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String cancelPaymentIntentSourceUrl$payments_core_release = Companion.getCancelPaymentIntentSourceUrl$payments_core_release(str);
        f11 = r0.f(v.a(Stripe3ds2AuthParams.FIELD_SOURCE, str2));
        return fetchStripeModel(factory.createPost(cancelPaymentIntentSourceUrl$payments_core_release, options, f11), new PaymentIntentJsonParser(), new StripeApiRepository$cancelPaymentIntentSource$2(this), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object cancelSetupIntentSource$payments_core_release(String str, String str2, ApiRequest.Options options, d<? super SetupIntent> dVar) {
        Map<String, ?> f11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String cancelSetupIntentSourceUrl$payments_core_release = Companion.getCancelSetupIntentSourceUrl$payments_core_release(str);
        f11 = r0.f(v.a(Stripe3ds2AuthParams.FIELD_SOURCE, str2));
        return fetchStripeModel(factory.createPost(cancelSetupIntentSourceUrl$payments_core_release, options, f11), new SetupIntentJsonParser(), new StripeApiRepository$cancelSetupIntentSource$2(this), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object complete3ds2Auth$payments_core_release(String str, ApiRequest.Options options, d<? super Stripe3ds2AuthResult> dVar) {
        Map<String, ?> f11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String apiUrl = Companion.getApiUrl("3ds2/challenge_complete");
        f11 = r0.f(v.a(Stripe3ds2AuthParams.FIELD_SOURCE, str));
        return fetchStripeModel(factory.createPost(apiUrl, options, f11), new Stripe3ds2AuthResultJsonParser(), StripeApiRepository$complete3ds2Auth$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object confirmConsumerVerification(String str, String str2, String str3, ApiRequest.Options options, d<? super ConsumerSession> dVar) {
        Map f11;
        Map l11;
        List d11;
        Map f12;
        Map f13;
        Map<String, ?> p11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String confirmConsumerVerificationUrl$payments_core_release = Companion.getConfirmConsumerVerificationUrl$payments_core_release();
        f11 = r0.f(v.a("consumer_session_client_secret", str));
        l11 = s0.l(v.a("credentials", f11), v.a("type", "SMS"), v.a(PaymentMethodOptionsParams.Blik.PARAM_CODE, str2), v.a("client_type", "MOBILE_SDK"));
        if (str3 == null) {
            f13 = null;
        } else {
            d11 = wz.v.d(str3);
            f12 = r0.f(v.a("verification_session_client_secrets", d11));
            f13 = r0.f(v.a("cookies", f12));
        }
        if (f13 == null) {
            f13 = s0.i();
        }
        p11 = s0.p(l11, f13);
        return fetchStripeModel(factory.createPost(confirmConsumerVerificationUrl$payments_core_release, options, p11), new ConsumerSessionJsonParser(), StripeApiRepository$confirmConsumerVerification$3.INSTANCE, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r9 
      PHI: (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:21:0x0067, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object confirmPaymentIntent$payments_core_release(com.stripe.android.model.ConfirmPaymentIntentParams r6, com.stripe.android.core.networking.ApiRequest.Options r7, java.util.List<java.lang.String> r8, zz.d<? super com.stripe.android.model.PaymentIntent> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.StripeApiRepository$confirmPaymentIntent$1
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.StripeApiRepository$confirmPaymentIntent$1 r0 = (com.stripe.android.networking.StripeApiRepository$confirmPaymentIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$confirmPaymentIntent$1 r0 = new com.stripe.android.networking.StripeApiRepository$confirmPaymentIntent$1
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
            com.stripe.android.networking.StripeApiRepository r6 = (com.stripe.android.networking.StripeApiRepository) r6
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r0.L$0
            com.stripe.android.core.networking.ApiRequest$Options r7 = (com.stripe.android.core.networking.ApiRequest.Options) r7
            vz.r.b(r9)
            goto L58
        L45:
            vz.r.b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r9 = r5.maybeForDashboard(r6, r7, r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            com.stripe.android.model.ConfirmPaymentIntentParams r9 = (com.stripe.android.model.ConfirmPaymentIntentParams) r9
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r9 = r6.confirmPaymentIntentInternal(r9, r7, r8, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.confirmPaymentIntent$payments_core_release(com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.core.networking.ApiRequest$Options, java.util.List, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object confirmSetupIntent$payments_core_release(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, List<String> list, d<? super SetupIntent> dVar) {
        Map<String, ?> p11;
        String setupIntentId$payments_core_release = new SetupIntent.ClientSecret(confirmSetupIntentParams.getClientSecret()).getSetupIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        String confirmSetupIntentUrl$payments_core_release = companion.getConfirmSetupIntentUrl$payments_core_release(setupIntentId$payments_core_release);
        FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = this.fraudDetectionDataParamsUtils;
        p11 = s0.p(maybeAddPaymentUserAgent$default(this, confirmSetupIntentParams.toParamMap(), confirmSetupIntentParams.getPaymentMethodCreateParams$payments_core_release(), null, 4, null), companion.createExpandParam(list));
        return fetchStripeModel(factory.createPost(confirmSetupIntentUrl$payments_core_release, options, fraudDetectionDataParamsUtils.addFraudDetectionData$payments_core_release(p11, getFraudDetectionData())), new SetupIntentJsonParser(), new StripeApiRepository$confirmSetupIntent$2(this, confirmSetupIntentParams), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object consumerSignUp(String str, String str2, String str3, String str4, ApiRequest.Options options, d<? super ConsumerSession> dVar) {
        Map l11;
        List d11;
        Map f11;
        Map f12;
        Map<String, ?> p11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerSignUpUrl$payments_core_release = Companion.getConsumerSignUpUrl$payments_core_release();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        l11 = s0.l(v.a("email_address", lowerCase), v.a("phone_number", str2), v.a("country", str3));
        if (str4 == null) {
            f12 = null;
        } else {
            d11 = wz.v.d(str4);
            f11 = r0.f(v.a("verification_session_client_secrets", d11));
            f12 = r0.f(v.a("cookies", f11));
        }
        if (f12 == null) {
            f12 = s0.i();
        }
        p11 = s0.p(l11, f12);
        return fetchStripeModel(factory.createPost(consumerSignUpUrl$payments_core_release, options, p11), new ConsumerSessionJsonParser(), StripeApiRepository$consumerSignUp$3.INSTANCE, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object createFile$payments_core_release(com.stripe.android.core.model.StripeFileParams r12, com.stripe.android.core.networking.ApiRequest.Options r13, zz.d<? super com.stripe.android.core.model.StripeFile> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.StripeApiRepository$createFile$1
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.StripeApiRepository$createFile$1 r0 = (com.stripe.android.networking.StripeApiRepository$createFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$createFile$1 r0 = new com.stripe.android.networking.StripeApiRepository$createFile$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r14)
            goto L50
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            vz.r.b(r14)
            com.stripe.android.core.networking.FileUploadRequest r14 = new com.stripe.android.core.networking.FileUploadRequest
            com.stripe.android.core.AppInfo r7 = r11.appInfo
            r8 = 0
            r9 = 8
            r10 = 0
            r4 = r14
            r5 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.stripe.android.networking.StripeApiRepository$createFile$response$1 r12 = new com.stripe.android.networking.StripeApiRepository$createFile$response$1
            r12.<init>(r11)
            r0.label = r3
            java.lang.Object r14 = r11.makeFileUploadRequest$payments_core_release(r14, r12, r0)
            if (r14 != r1) goto L50
            return r1
        L50:
            com.stripe.android.core.networking.StripeResponse r14 = (com.stripe.android.core.networking.StripeResponse) r14
            com.stripe.android.core.model.parsers.StripeFileJsonParser r12 = new com.stripe.android.core.model.parsers.StripeFileJsonParser
            r12.<init>()
            org.json.JSONObject r13 = com.stripe.android.core.networking.StripeResponseKtxKt.responseJson(r14)
            com.stripe.android.core.model.StripeFile r12 = r12.parse(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.createFile$payments_core_release(com.stripe.android.core.model.StripeFileParams, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createPaymentDetails(String str, ConsumerPaymentDetailsCreateParams consumerPaymentDetailsCreateParams, ApiRequest.Options options, d<? super ConsumerPaymentDetails> dVar) {
        Map f11;
        Map l11;
        Map<String, ?> p11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerPaymentDetailsUrl$payments_core_release = Companion.getConsumerPaymentDetailsUrl$payments_core_release();
        f11 = r0.f(v.a("consumer_session_client_secret", str));
        l11 = s0.l(v.a("credentials", f11), v.a("active", b.a(false)));
        p11 = s0.p(l11, consumerPaymentDetailsCreateParams.toParamMap());
        return fetchStripeModel(factory.createPost(consumerPaymentDetailsUrl$payments_core_release, options, p11), new ConsumerPaymentDetailsJsonParser(), StripeApiRepository$createPaymentDetails$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createPaymentIntentFinancialConnectionsSession$payments_core_release(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, d<? super FinancialConnectionsSession> dVar) {
        return fetchStripeModel(this.apiRequestFactory.createPost(getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release(str), options, createFinancialConnectionsSessionParams.toMap()), new FinancialConnectionsSessionJsonParser(), StripeApiRepository$createPaymentIntentFinancialConnectionsSession$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, ApiRequest.Options options, d<? super PaymentMethod> dVar) {
        Map q11;
        Map<String, ?> p11;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String paymentMethodsUrl$payments_core_release = Companion.getPaymentMethodsUrl$payments_core_release();
        q11 = s0.q(paymentMethodCreateParams.toParamMap(), buildPaymentUserAgentPair(paymentMethodCreateParams.getAttribution$payments_core_release()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData == null ? null : fraudDetectionData.getParams();
        if (params == null) {
            params = s0.i();
        }
        p11 = s0.p(q11, params);
        return fetchStripeModel(factory.createPost(paymentMethodsUrl$payments_core_release, options, p11), new PaymentMethodJsonParser(), new StripeApiRepository$createPaymentMethod$2(this, paymentMethodCreateParams), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #1 {all -> 0x0041, blocks: (B:16:0x003d, B:28:0x0062, B:29:0x0069, B:30:0x0074), top: B:48:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:16:0x003d, B:28:0x0062, B:29:0x0069, B:30:0x0074), top: B:48:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object createRadarSession$payments_core_release(com.stripe.android.core.networking.ApiRequest.Options r9, zz.d<? super com.stripe.android.model.RadarSession> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.stripe.android.networking.StripeApiRepository$createRadarSession$1
            if (r0 == 0) goto L13
            r0 = r10
            com.stripe.android.networking.StripeApiRepository$createRadarSession$1 r0 = (com.stripe.android.networking.StripeApiRepository$createRadarSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$createRadarSession$1 r0 = new com.stripe.android.networking.StripeApiRepository$createRadarSession$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            vz.r.b(r10)
            goto Lc9
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$1
            com.stripe.android.core.networking.ApiRequest$Options r9 = (com.stripe.android.core.networking.ApiRequest.Options) r9
            java.lang.Object r2 = r0.L$0
            com.stripe.android.networking.StripeApiRepository r2 = (com.stripe.android.networking.StripeApiRepository) r2
            vz.r.b(r10)     // Catch: java.lang.Throwable -> L41
            goto L60
        L41:
            r10 = move-exception
            goto L83
        L43:
            vz.r.b(r10)
            vz.q$a r10 = vz.q.f54772b     // Catch: java.lang.Throwable -> L81
            com.stripe.android.Stripe$Companion r10 = com.stripe.android.Stripe.Companion     // Catch: java.lang.Throwable -> L81
            boolean r10 = r10.getAdvancedFraudSignalsEnabled()     // Catch: java.lang.Throwable -> L81
            if (r10 == 0) goto L75
            com.stripe.android.FraudDetectionDataRepository r10 = r8.fraudDetectionDataRepository     // Catch: java.lang.Throwable -> L81
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L81
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L81
            r0.label = r4     // Catch: java.lang.Throwable -> L81
            java.lang.Object r10 = r10.getLatest(r0)     // Catch: java.lang.Throwable -> L81
            if (r10 != r1) goto L5f
            return r1
        L5f:
            r2 = r8
        L60:
            if (r10 == 0) goto L69
            com.stripe.android.networking.FraudDetectionData r10 = (com.stripe.android.networking.FraudDetectionData) r10     // Catch: java.lang.Throwable -> L41
            java.lang.Object r10 = vz.q.b(r10)     // Catch: java.lang.Throwable -> L41
            goto L8d
        L69:
            java.lang.String r10 = "Could not obtain fraud data required to create a Radar Session."
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L41
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L41
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L41
            throw r5     // Catch: java.lang.Throwable -> L41
        L75:
            java.lang.String r10 = "Stripe.advancedFraudSignalsEnabled must be set to 'true' to create a Radar Session."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L81
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L81
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L81
            throw r2     // Catch: java.lang.Throwable -> L81
        L81:
            r10 = move-exception
            r2 = r8
        L83:
            vz.q$a r5 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
        L8d:
            boolean r5 = vz.q.h(r10)
            if (r5 == 0) goto Lcb
            vz.q$a r5 = vz.q.f54772b
            com.stripe.android.networking.FraudDetectionData r10 = (com.stripe.android.networking.FraudDetectionData) r10
            java.util.Map r10 = r10.getParams()
            r5 = 0
            vz.p r4 = buildPaymentUserAgentPair$default(r2, r5, r4, r5)
            java.util.Map r10 = wz.p0.q(r10, r4)
            com.stripe.android.core.networking.ApiRequest$Factory r4 = r2.apiRequestFactory
            com.stripe.android.networking.StripeApiRepository$Companion r6 = com.stripe.android.networking.StripeApiRepository.Companion
            java.lang.String r7 = "radar/session"
            java.lang.String r6 = com.stripe.android.networking.StripeApiRepository.Companion.access$getApiUrl(r6, r7)
            com.stripe.android.core.networking.ApiRequest r9 = r4.createPost(r6, r9, r10)
            com.stripe.android.model.parsers.RadarSessionJsonParser r10 = new com.stripe.android.model.parsers.RadarSessionJsonParser
            r10.<init>()
            com.stripe.android.networking.StripeApiRepository$createRadarSession$3$1 r4 = new com.stripe.android.networking.StripeApiRepository$createRadarSession$3$1
            r4.<init>(r2)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r10 = r2.fetchStripeModel(r9, r10, r4, r0)
            if (r10 != r1) goto Lc9
            return r1
        Lc9:
            com.stripe.android.model.RadarSession r10 = (com.stripe.android.model.RadarSession) r10
        Lcb:
            java.lang.Object r9 = vz.q.b(r10)
            java.lang.Throwable r10 = vz.q.e(r9)
            if (r10 != 0) goto Ld6
            return r9
        Ld6:
            com.stripe.android.core.exception.StripeException$Companion r9 = com.stripe.android.core.exception.StripeException.Companion
            com.stripe.android.core.exception.StripeException r9 = r9.create(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.createRadarSession$payments_core_release(com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createSetupIntentFinancialConnectionsSession$payments_core_release(String str, CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, ApiRequest.Options options, d<? super FinancialConnectionsSession> dVar) {
        return fetchStripeModel(this.apiRequestFactory.createPost(getSetupIntentFinancialConnectionsSessionUrl$payments_core_release(str), options, createFinancialConnectionsSessionParams.toMap()), new FinancialConnectionsSessionJsonParser(), StripeApiRepository$createSetupIntentFinancialConnectionsSession$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createSource$payments_core_release(SourceParams sourceParams, ApiRequest.Options options, d<? super Source> dVar) {
        Map q11;
        Map<String, ?> p11;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String sourcesUrl$payments_core_release = Companion.getSourcesUrl$payments_core_release();
        q11 = s0.q(sourceParams.toParamMap(), buildPaymentUserAgentPair(sourceParams.getAttribution$payments_core_release()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData == null ? null : fraudDetectionData.getParams();
        if (params == null) {
            params = s0.i();
        }
        p11 = s0.p(q11, params);
        return fetchStripeModel(factory.createPost(sourcesUrl$payments_core_release, options, p11), new SourceJsonParser(), new StripeApiRepository$createSource$2(this, sourceParams), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object createToken$payments_core_release(TokenParams tokenParams, ApiRequest.Options options, d<? super Token> dVar) {
        Map q11;
        Map<String, ?> p11;
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String tokensUrl$payments_core_release = Companion.getTokensUrl$payments_core_release();
        q11 = s0.q(tokenParams.toParamMap(), buildPaymentUserAgentPair(tokenParams.getAttribution()));
        FraudDetectionData fraudDetectionData = getFraudDetectionData();
        Map<String, String> params = fraudDetectionData == null ? null : fraudDetectionData.getParams();
        if (params == null) {
            params = s0.i();
        }
        p11 = s0.p(q11, params);
        return fetchStripeModel(factory.createPost(tokensUrl$payments_core_release, options, p11), new TokenJsonParser(), new StripeApiRepository$createToken$2(this, tokenParams), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object deleteCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, ApiRequest.Options options, d<? super Source> dVar) {
        return fetchStripeModel(ApiRequest.Factory.createDelete$default(this.apiRequestFactory, Companion.getDeleteCustomerSourceUrl$payments_core_release(str, str3), options, null, 4, null), new SourceJsonParser(), new StripeApiRepository$deleteCustomerSource$2(this, set), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object deletePaymentDetails(String str, String str2, ApiRequest.Options options, d<? super b0> dVar) {
        Map f11;
        Map<String, ?> f12;
        Object d11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerPaymentDetailsUrl$payments_core_release = Companion.getConsumerPaymentDetailsUrl$payments_core_release(str2);
        f11 = r0.f(v.a("consumer_session_client_secret", str));
        f12 = r0.f(v.a("credentials", f11));
        Object makeApiRequest$payments_core_release = makeApiRequest$payments_core_release(factory.createDelete(consumerPaymentDetailsUrl$payments_core_release, options, f12), StripeApiRepository$deletePaymentDetails$2.INSTANCE, dVar);
        d11 = a00.d.d();
        return makeApiRequest$payments_core_release == d11 ? makeApiRequest$payments_core_release : b0.f54756a;
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object detachPaymentMethod(String str, Set<String> set, String str2, ApiRequest.Options options, d<? super PaymentMethod> dVar) {
        return fetchStripeModel(ApiRequest.Factory.createPost$default(this.apiRequestFactory, getDetachPaymentMethodUrl$payments_core_release(str2), options, null, 4, null), new PaymentMethodJsonParser(), new StripeApiRepository$detachPaymentMethod$2(this, set), dVar);
    }

    public final void fireAnalyticsRequest$payments_core_release(AnalyticsRequest params) {
        s.g(params, "params");
        this.analyticsRequestExecutor.executeAsync(params);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getCardMetadata$payments_core_release(com.stripe.android.cards.Bin r11, com.stripe.android.core.networking.ApiRequest.Options r12, zz.d<? super com.stripe.android.model.CardMetadata> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.stripe.android.networking.StripeApiRepository$getCardMetadata$1
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.networking.StripeApiRepository$getCardMetadata$1 r0 = (com.stripe.android.networking.StripeApiRepository$getCardMetadata$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$getCardMetadata$1 r0 = new com.stripe.android.networking.StripeApiRepository$getCardMetadata$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r0.L$0
            com.stripe.android.networking.StripeApiRepository r11 = (com.stripe.android.networking.StripeApiRepository) r11
            vz.r.b(r13)     // Catch: java.lang.Throwable -> L2d
            goto L87
        L2d:
            r12 = move-exception
            goto L90
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            vz.r.b(r13)
            vz.q$a r13 = vz.q.f54772b     // Catch: java.lang.Throwable -> L8e
            com.stripe.android.core.networking.ApiRequest$Factory r13 = r10.apiRequestFactory     // Catch: java.lang.Throwable -> L8e
            com.stripe.android.networking.StripeApiRepository$Companion r2 = com.stripe.android.networking.StripeApiRepository.Companion     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "card-metadata"
            java.lang.String r2 = com.stripe.android.networking.StripeApiRepository.Companion.access$getEdgeUrl(r2, r4)     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 5
            r9 = 0
            r4 = r12
            com.stripe.android.core.networking.ApiRequest$Options r4 = com.stripe.android.core.networking.ApiRequest.Options.copy$default(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8e
            r5 = 2
            vz.p[] r5 = new vz.p[r5]     // Catch: java.lang.Throwable -> L8e
            r6 = 0
            java.lang.String r7 = "key"
            java.lang.String r12 = r12.getApiKey()     // Catch: java.lang.Throwable -> L8e
            vz.p r12 = vz.v.a(r7, r12)     // Catch: java.lang.Throwable -> L8e
            r5[r6] = r12     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = "bin_prefix"
            java.lang.String r6 = r11.getValue()     // Catch: java.lang.Throwable -> L8e
            vz.p r12 = vz.v.a(r12, r6)     // Catch: java.lang.Throwable -> L8e
            r5[r3] = r12     // Catch: java.lang.Throwable -> L8e
            java.util.Map r12 = wz.p0.l(r5)     // Catch: java.lang.Throwable -> L8e
            com.stripe.android.core.networking.ApiRequest r12 = r13.createGet(r2, r4, r12)     // Catch: java.lang.Throwable -> L8e
            com.stripe.android.model.parsers.CardMetadataJsonParser r13 = new com.stripe.android.model.parsers.CardMetadataJsonParser     // Catch: java.lang.Throwable -> L8e
            r13.<init>(r11)     // Catch: java.lang.Throwable -> L8e
            com.stripe.android.networking.StripeApiRepository$getCardMetadata$2$1 r11 = com.stripe.android.networking.StripeApiRepository$getCardMetadata$2$1.INSTANCE     // Catch: java.lang.Throwable -> L8e
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L8e
            r0.label = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r13 = r10.fetchStripeModel(r12, r13, r11, r0)     // Catch: java.lang.Throwable -> L8e
            if (r13 != r1) goto L86
            return r1
        L86:
            r11 = r10
        L87:
            com.stripe.android.model.CardMetadata r13 = (com.stripe.android.model.CardMetadata) r13     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r12 = vz.q.b(r13)     // Catch: java.lang.Throwable -> L2d
            goto L9a
        L8e:
            r12 = move-exception
            r11 = r10
        L90:
            vz.q$a r13 = vz.q.f54772b
            java.lang.Object r12 = vz.r.a(r12)
            java.lang.Object r12 = vz.q.b(r12)
        L9a:
            java.lang.Throwable r13 = vz.q.e(r12)
            if (r13 == 0) goto La5
            com.stripe.android.networking.PaymentAnalyticsEvent r13 = com.stripe.android.networking.PaymentAnalyticsEvent.CardMetadataLoadFailure
            r11.fireAnalyticsRequest(r13)
        La5:
            boolean r11 = vz.q.g(r12)
            if (r11 == 0) goto Lac
            r12 = 0
        Lac:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.getCardMetadata$payments_core_release(com.stripe.android.cards.Bin, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    public final String getDetachPaymentMethodUrl$payments_core_release(String paymentMethodId) {
        s.g(paymentMethodId, "paymentMethodId");
        return Companion.getApiUrl("payment_methods/%s/detach", paymentMethodId);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|(3:13|14|(2:16|17)(1:19))(2:20|21)))|30|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        r12 = vz.q.f54772b;
        r11 = vz.q.b(vz.r.a(r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x0025, B:19:0x006d, B:21:0x0071, B:22:0x0076, B:23:0x0081, B:16:0x0034), top: B:30:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x0025, B:19:0x006d, B:21:0x0071, B:22:0x0076, B:23:0x0081, B:16:0x0034), top: B:30:0x0021 }] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFpxBankStatus$payments_core_release(com.stripe.android.core.networking.ApiRequest.Options r11, zz.d<? super com.stripe.android.model.BankStatuses> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1 r0 = (com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1 r0 = new com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r12)     // Catch: java.lang.Throwable -> L82
            goto L6d
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            vz.r.b(r12)
            vz.q$a r12 = vz.q.f54772b     // Catch: java.lang.Throwable -> L82
            com.stripe.android.core.networking.ApiRequest$Factory r12 = r10.apiRequestFactory     // Catch: java.lang.Throwable -> L82
            com.stripe.android.networking.StripeApiRepository$Companion r2 = com.stripe.android.networking.StripeApiRepository.Companion     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "fpx/bank_statuses"
            java.lang.String r2 = com.stripe.android.networking.StripeApiRepository.Companion.access$getApiUrl(r2, r4)     // Catch: java.lang.Throwable -> L82
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 5
            r9 = 0
            r4 = r11
            com.stripe.android.core.networking.ApiRequest$Options r11 = com.stripe.android.core.networking.ApiRequest.Options.copy$default(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "account_holder_type"
            java.lang.String r5 = "individual"
            vz.p r4 = vz.v.a(r4, r5)     // Catch: java.lang.Throwable -> L82
            java.util.Map r4 = wz.p0.f(r4)     // Catch: java.lang.Throwable -> L82
            com.stripe.android.core.networking.ApiRequest r11 = r12.createGet(r2, r11, r4)     // Catch: java.lang.Throwable -> L82
            com.stripe.android.model.parsers.FpxBankStatusesJsonParser r12 = new com.stripe.android.model.parsers.FpxBankStatusesJsonParser     // Catch: java.lang.Throwable -> L82
            r12.<init>()     // Catch: java.lang.Throwable -> L82
            com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1 r2 = new com.stripe.android.networking.StripeApiRepository$getFpxBankStatus$2$fpxBankStatuses$1     // Catch: java.lang.Throwable -> L82
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L82
            r0.label = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r12 = r10.fetchStripeModel(r11, r12, r2, r0)     // Catch: java.lang.Throwable -> L82
            if (r12 != r1) goto L6d
            return r1
        L6d:
            com.stripe.android.model.BankStatuses r12 = (com.stripe.android.model.BankStatuses) r12     // Catch: java.lang.Throwable -> L82
            if (r12 == 0) goto L76
            java.lang.Object r11 = vz.q.b(r12)     // Catch: java.lang.Throwable -> L82
            goto L8d
        L76:
            java.lang.String r11 = "Required value was null."
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L82
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L82
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L82
            throw r12     // Catch: java.lang.Throwable -> L82
        L82:
            r11 = move-exception
            vz.q$a r12 = vz.q.f54772b
            java.lang.Object r11 = vz.r.a(r11)
            java.lang.Object r11 = vz.q.b(r11)
        L8d:
            com.stripe.android.model.BankStatuses r12 = new com.stripe.android.model.BankStatuses
            r0 = 0
            r12.<init>(r0, r3, r0)
            boolean r0 = vz.q.g(r11)
            if (r0 == 0) goto L9a
            r11 = r12
        L9a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.getFpxBankStatus$payments_core_release(com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    public final /* synthetic */ String getPaymentIntentFinancialConnectionsSessionUrl$payments_core_release(String paymentIntentId) {
        s.g(paymentIntentId, "paymentIntentId");
        return Companion.getApiUrl("payment_intents/%s/link_account_sessions", paymentIntentId);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getPaymentMethods(com.stripe.android.model.ListPaymentMethodsParams r4, java.lang.String r5, java.util.Set<java.lang.String> r6, com.stripe.android.core.networking.ApiRequest.Options r7, zz.d<? super java.util.List<com.stripe.android.model.PaymentMethod>> r8) {
        /*
            r3 = this;
            boolean r5 = r8 instanceof com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1
            if (r5 == 0) goto L13
            r5 = r8
            com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1 r5 = (com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.label = r0
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1 r5 = new com.stripe.android.networking.StripeApiRepository$getPaymentMethods$1
            r5.<init>(r3, r8)
        L18:
            java.lang.Object r8 = r5.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            vz.r.b(r8)
            goto L57
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r8)
            com.stripe.android.core.networking.ApiRequest$Factory r8 = r3.apiRequestFactory
            com.stripe.android.networking.StripeApiRepository$Companion r1 = com.stripe.android.networking.StripeApiRepository.Companion
            java.lang.String r1 = r1.getPaymentMethodsUrl$payments_core_release()
            java.util.Map r4 = r4.toParamMap()
            com.stripe.android.core.networking.ApiRequest r4 = r8.createGet(r1, r7, r4)
            com.stripe.android.model.parsers.PaymentMethodsListJsonParser r7 = new com.stripe.android.model.parsers.PaymentMethodsListJsonParser
            r7.<init>()
            com.stripe.android.networking.StripeApiRepository$getPaymentMethods$paymentMethodsList$1 r8 = new com.stripe.android.networking.StripeApiRepository$getPaymentMethods$paymentMethodsList$1
            r8.<init>(r3, r6)
            r5.label = r2
            java.lang.Object r8 = r3.fetchStripeModel(r4, r7, r8, r5)
            if (r8 != r0) goto L57
            return r0
        L57:
            com.stripe.android.model.PaymentMethodsList r8 = (com.stripe.android.model.PaymentMethodsList) r8
            if (r8 != 0) goto L5d
            r4 = 0
            goto L61
        L5d:
            java.util.List r4 = r8.getPaymentMethods()
        L61:
            if (r4 != 0) goto L67
            java.util.List r4 = wz.u.i()
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.getPaymentMethods(com.stripe.android.model.ListPaymentMethodsParams, java.lang.String, java.util.Set, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    public final /* synthetic */ String getSetupIntentFinancialConnectionsSessionUrl$payments_core_release(String setupIntentId) {
        s.g(setupIntentId, "setupIntentId");
        return Companion.getApiUrl("setup_intents/%s/link_account_sessions", setupIntentId);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object listPaymentDetails(String str, Set<String> set, ApiRequest.Options options, d<? super ConsumerPaymentDetails> dVar) {
        Map f11;
        List O0;
        Map<String, ?> l11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerPaymentDetailsUrl$payments_core_release = Companion.getConsumerPaymentDetailsUrl$payments_core_release();
        f11 = r0.f(v.a("consumer_session_client_secret", str));
        O0 = e0.O0(set);
        l11 = s0.l(v.a("credentials", f11), v.a("types", O0));
        return fetchStripeModel(factory.createGet(consumerPaymentDetailsUrl$payments_core_release, options, l11), new ConsumerPaymentDetailsJsonParser(), StripeApiRepository$listPaymentDetails$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object logoutConsumer(String str, String str2, ApiRequest.Options options, d<? super ConsumerSession> dVar) {
        Map f11;
        Map f12;
        List d11;
        Map f13;
        Map f14;
        Map<String, ?> p11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String logoutConsumerUrl$payments_core_release = Companion.getLogoutConsumerUrl$payments_core_release();
        f11 = r0.f(v.a("consumer_session_client_secret", str));
        f12 = r0.f(v.a("credentials", f11));
        if (str2 == null) {
            f14 = null;
        } else {
            d11 = wz.v.d(str2);
            f13 = r0.f(v.a("verification_session_client_secrets", d11));
            f14 = r0.f(v.a("cookies", f13));
        }
        if (f14 == null) {
            f14 = s0.i();
        }
        p11 = s0.p(f12, f14);
        return fetchStripeModel(factory.createPost(logoutConsumerUrl$payments_core_release, options, p11), new ConsumerSessionJsonParser(), StripeApiRepository$logoutConsumer$3.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object lookupConsumerSession(String str, String str2, ApiRequest.Options options, d<? super ConsumerSessionLookup> dVar) {
        Map f11;
        Map<String, ?> p11;
        List d11;
        Map f12;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerSessionLookupUrl$payments_core_release = Companion.getConsumerSessionLookupUrl$payments_core_release();
        Map map = null;
        if (str == null) {
            f11 = null;
        } else {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            f11 = r0.f(v.a("email_address", lowerCase));
        }
        if (f11 == null) {
            f11 = s0.i();
        }
        if (str2 != null) {
            d11 = wz.v.d(str2);
            f12 = r0.f(v.a("verification_session_client_secrets", d11));
            map = r0.f(v.a("cookies", f12));
        }
        if (map == null) {
            map = s0.i();
        }
        p11 = s0.p(f11, map);
        return fetchStripeModel(factory.createPost(consumerSessionLookupUrl$payments_core_release, options, p11), new ConsumerSessionLookupJsonParser(), StripeApiRepository$lookupConsumerSession$4.INSTANCE, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:34|35))(4:36|37|38|(1:40)(1:41))|13|14|15|(4:17|(1:19)|20|21)(2:23|(2:25|26)(1:27))))|45|6|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object makeApiRequest$payments_core_release(com.stripe.android.core.networking.ApiRequest r6, h00.a<vz.b0> r7, zz.d<? super com.stripe.android.core.networking.StripeResponse<java.lang.String>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.StripeApiRepository$makeApiRequest$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.networking.StripeApiRepository$makeApiRequest$1 r0 = (com.stripe.android.networking.StripeApiRepository$makeApiRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$makeApiRequest$1 r0 = new com.stripe.android.networking.StripeApiRepository$makeApiRequest$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r6 = r0.L$3
            com.stripe.android.networking.StripeApiRepository$DnsCacheData r6 = (com.stripe.android.networking.StripeApiRepository.DnsCacheData) r6
            java.lang.Object r7 = r0.L$2
            h00.a r7 = (h00.a) r7
            java.lang.Object r1 = r0.L$1
            com.stripe.android.core.networking.ApiRequest r1 = (com.stripe.android.core.networking.ApiRequest) r1
            java.lang.Object r0 = r0.L$0
            com.stripe.android.networking.StripeApiRepository r0 = (com.stripe.android.networking.StripeApiRepository) r0
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L3e
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L6a
        L3e:
            r8 = move-exception
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L75
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4d:
            vz.r.b(r8)
            com.stripe.android.networking.StripeApiRepository$DnsCacheData r8 = r5.disableDnsCache()
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L73
            com.stripe.android.core.networking.StripeNetworkClient r2 = r5.stripeNetworkClient     // Catch: java.lang.Throwable -> L73
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L73
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L73
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L73
            r0.label = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.executeRequest(r6, r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L69
            return r1
        L69:
            r1 = r5
        L6a:
            com.stripe.android.core.networking.StripeResponse r0 = (com.stripe.android.core.networking.StripeResponse) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L71
            goto L7f
        L71:
            r0 = move-exception
            goto L75
        L73:
            r0 = move-exception
            r1 = r5
        L75:
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L7f:
            r7.invoke()
            java.lang.Throwable r7 = vz.q.e(r0)
            if (r7 != 0) goto L97
            com.stripe.android.core.networking.StripeResponse r0 = (com.stripe.android.core.networking.StripeResponse) r0
            boolean r6 = r0.isError()
            if (r6 == 0) goto L93
            r1.handleApiError(r0)
        L93:
            r1.resetDnsCache(r8)
            return r0
        L97:
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 == 0) goto La7
            com.stripe.android.core.exception.APIConnectionException$Companion r8 = com.stripe.android.core.exception.APIConnectionException.Companion
            java.io.IOException r7 = (java.io.IOException) r7
            java.lang.String r6 = r6.getBaseUrl()
            com.stripe.android.core.exception.APIConnectionException r7 = r8.create(r7, r6)
        La7:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.makeApiRequest$payments_core_release(com.stripe.android.core.networking.ApiRequest, h00.a, zz.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|(1:(4:9|10|11|12)(2:41|42))(4:43|44|45|(1:47)(1:48))|13|14|15|(1:17)(1:34)|18|(1:20)|21|(4:23|(1:25)|26|27)(2:29|(2:31|32)(1:33))))|52|6|(0)(0)|13|14|15|(0)(0)|18|(0)|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object makeFileUploadRequest$payments_core_release(com.stripe.android.core.networking.FileUploadRequest r6, h00.l<? super com.stripe.android.core.networking.RequestId, vz.b0> r7, zz.d<? super com.stripe.android.core.networking.StripeResponse<java.lang.String>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1 r0 = (com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1 r0 = new com.stripe.android.networking.StripeApiRepository$makeFileUploadRequest$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r6 = r0.L$3
            com.stripe.android.networking.StripeApiRepository$DnsCacheData r6 = (com.stripe.android.networking.StripeApiRepository.DnsCacheData) r6
            java.lang.Object r7 = r0.L$2
            h00.l r7 = (h00.l) r7
            java.lang.Object r1 = r0.L$1
            com.stripe.android.core.networking.FileUploadRequest r1 = (com.stripe.android.core.networking.FileUploadRequest) r1
            java.lang.Object r0 = r0.L$0
            com.stripe.android.networking.StripeApiRepository r0 = (com.stripe.android.networking.StripeApiRepository) r0
            vz.r.b(r8)     // Catch: java.lang.Throwable -> L3e
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L6a
        L3e:
            r8 = move-exception
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L75
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4d:
            vz.r.b(r8)
            com.stripe.android.networking.StripeApiRepository$DnsCacheData r8 = r5.disableDnsCache()
            vz.q$a r2 = vz.q.f54772b     // Catch: java.lang.Throwable -> L73
            com.stripe.android.core.networking.StripeNetworkClient r2 = r5.stripeNetworkClient     // Catch: java.lang.Throwable -> L73
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L73
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L73
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L73
            r0.label = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.executeRequest(r6, r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L69
            return r1
        L69:
            r1 = r5
        L6a:
            com.stripe.android.core.networking.StripeResponse r0 = (com.stripe.android.core.networking.StripeResponse) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = vz.q.b(r0)     // Catch: java.lang.Throwable -> L71
            goto L7f
        L71:
            r0 = move-exception
            goto L75
        L73:
            r0 = move-exception
            r1 = r5
        L75:
            vz.q$a r2 = vz.q.f54772b
            java.lang.Object r0 = vz.r.a(r0)
            java.lang.Object r0 = vz.q.b(r0)
        L7f:
            boolean r2 = vz.q.g(r0)
            r3 = 0
            if (r2 == 0) goto L88
            r2 = r3
            goto L89
        L88:
            r2 = r0
        L89:
            com.stripe.android.core.networking.StripeResponse r2 = (com.stripe.android.core.networking.StripeResponse) r2
            if (r2 != 0) goto L8e
            goto L92
        L8e:
            com.stripe.android.core.networking.RequestId r3 = r2.getRequestId()
        L92:
            r7.invoke(r3)
            java.lang.Throwable r7 = vz.q.e(r0)
            if (r7 != 0) goto Laa
            com.stripe.android.core.networking.StripeResponse r0 = (com.stripe.android.core.networking.StripeResponse) r0
            boolean r6 = r0.isError()
            if (r6 == 0) goto La6
            r1.handleApiError(r0)
        La6:
            r1.resetDnsCache(r8)
            return r0
        Laa:
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 == 0) goto Lba
            com.stripe.android.core.exception.APIConnectionException$Companion r8 = com.stripe.android.core.exception.APIConnectionException.Companion
            java.io.IOException r7 = (java.io.IOException) r7
            java.lang.String r6 = r6.getUrl()
            com.stripe.android.core.exception.APIConnectionException r7 = r8.create(r7, r6)
        Lba:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.makeFileUploadRequest$payments_core_release(com.stripe.android.core.networking.FileUploadRequest, h00.l, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object refreshPaymentIntent$payments_core_release(String str, ApiRequest.Options options, d<? super PaymentIntent> dVar) {
        List<String> i11;
        String paymentIntentId$payments_core_release = new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        ApiRequest.Factory factory = this.apiRequestFactory;
        String refreshPaymentIntentUrl$payments_core_release = Companion.getRefreshPaymentIntentUrl$payments_core_release(paymentIntentId$payments_core_release);
        i11 = w.i();
        return fetchStripeModel(factory.createPost(refreshPaymentIntentUrl$payments_core_release, options, createClientSecretParam(str, i11)), new PaymentIntentJsonParser(), new StripeApiRepository$refreshPaymentIntent$2(this), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrieveCustomer$payments_core_release(String str, Set<String> set, ApiRequest.Options options, d<? super Customer> dVar) {
        return fetchStripeModel(ApiRequest.Factory.createGet$default(this.apiRequestFactory, Companion.getRetrieveCustomerUrl$payments_core_release(str), options, null, 4, null), new CustomerJsonParser(), new StripeApiRepository$retrieveCustomer$2(this, set), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object retrieveIssuingCardPin$payments_core_release(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.stripe.android.core.networking.ApiRequest.Options r8, zz.d<? super java.lang.String> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1 r0 = (com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1 r0 = new com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r9)
            goto L61
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            vz.r.b(r9)
            com.stripe.android.core.networking.ApiRequest$Factory r9 = r4.apiRequestFactory
            com.stripe.android.networking.StripeApiRepository$Companion r2 = com.stripe.android.networking.StripeApiRepository.Companion
            java.lang.String r5 = r2.getIssuingCardPinUrl$payments_core_release(r5)
            java.util.Map r6 = com.stripe.android.networking.StripeApiRepository.Companion.access$createVerificationParam(r2, r6, r7)
            java.lang.String r7 = "verification"
            vz.p r6 = vz.v.a(r7, r6)
            java.util.Map r6 = wz.p0.f(r6)
            com.stripe.android.core.networking.ApiRequest r5 = r9.createGet(r5, r8, r6)
            com.stripe.android.model.parsers.IssuingCardPinJsonParser r6 = new com.stripe.android.model.parsers.IssuingCardPinJsonParser
            r6.<init>()
            com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1 r7 = new com.stripe.android.networking.StripeApiRepository$retrieveIssuingCardPin$issuingCardPin$1
            r7.<init>(r4)
            r0.label = r3
            java.lang.Object r9 = r4.fetchStripeModel(r5, r6, r7, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            com.stripe.android.model.IssuingCardPin r9 = (com.stripe.android.model.IssuingCardPin) r9
            if (r9 != 0) goto L67
            r5 = 0
            goto L6b
        L67:
            java.lang.String r5 = r9.getPin()
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.retrieveIssuingCardPin$payments_core_release(java.lang.String, java.lang.String, java.lang.String, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object retrieveObject$payments_core_release(java.lang.String r11, com.stripe.android.core.networking.ApiRequest.Options r12, zz.d<? super org.json.JSONObject> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.stripe.android.networking.StripeApiRepository$retrieveObject$1
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.networking.StripeApiRepository$retrieveObject$1 r0 = (com.stripe.android.networking.StripeApiRepository$retrieveObject$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$retrieveObject$1 r0 = new com.stripe.android.networking.StripeApiRepository$retrieveObject$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r13)
            goto L55
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            vz.r.b(r13)
            com.stripe.android.utils.StripeUrlUtils r13 = com.stripe.android.utils.StripeUrlUtils.INSTANCE
            boolean r13 = r13.isStripeUrl$payments_core_release(r11)
            if (r13 == 0) goto L5c
            com.stripe.android.core.networking.ApiRequest$Factory r4 = r10.apiRequestFactory
            r7 = 0
            r8 = 4
            r9 = 0
            r5 = r11
            r6 = r12
            com.stripe.android.core.networking.ApiRequest r11 = com.stripe.android.core.networking.ApiRequest.Factory.createGet$default(r4, r5, r6, r7, r8, r9)
            com.stripe.android.networking.StripeApiRepository$retrieveObject$response$1 r12 = new com.stripe.android.networking.StripeApiRepository$retrieveObject$response$1
            r12.<init>(r10)
            r0.label = r3
            java.lang.Object r13 = r10.makeApiRequest$payments_core_release(r11, r12, r0)
            if (r13 != r1) goto L55
            return r1
        L55:
            com.stripe.android.core.networking.StripeResponse r13 = (com.stripe.android.core.networking.StripeResponse) r13
            org.json.JSONObject r11 = com.stripe.android.core.networking.StripeResponseKtxKt.responseJson(r13)
            return r11
        L5c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Unrecognized domain: "
            java.lang.String r11 = kotlin.jvm.internal.s.p(r13, r11)
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.retrieveObject$payments_core_release(java.lang.String, com.stripe.android.core.networking.ApiRequest$Options, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrievePaymentIntent(String str, ApiRequest.Options options, List<String> list, d<? super PaymentIntent> dVar) {
        Map<String, ?> createClientSecretParam;
        String paymentIntentId$payments_core_release = new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release();
        if (options.getApiKeyIsUserKey()) {
            createClientSecretParam = Companion.createExpandParam(list);
        } else {
            createClientSecretParam = createClientSecretParam(str, list);
        }
        fireFraudDetectionDataRequest();
        return fetchStripeModel(this.apiRequestFactory.createGet(Companion.getRetrievePaymentIntentUrl$payments_core_release(paymentIntentId$payments_core_release), options, createClientSecretParam), new PaymentIntentJsonParser(), new StripeApiRepository$retrievePaymentIntent$2(this), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrievePaymentIntentWithOrderedPaymentMethods(String str, ApiRequest.Options options, Locale locale, d<? super PaymentIntent> dVar) {
        return retrieveStripeIntentWithOrderedPaymentMethods(str, options, locale, new PaymentMethodPreferenceForPaymentIntentJsonParser(), PaymentAnalyticsEvent.PaymentIntentRetrieve, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrieveSetupIntent(String str, ApiRequest.Options options, List<String> list, d<? super SetupIntent> dVar) {
        String setupIntentId$payments_core_release = new SetupIntent.ClientSecret(str).getSetupIntentId$payments_core_release();
        fireFraudDetectionDataRequest();
        return fetchStripeModel(this.apiRequestFactory.createGet(Companion.getRetrieveSetupIntentUrl$payments_core_release(setupIntentId$payments_core_release), options, createClientSecretParam(str, list)), new SetupIntentJsonParser(), new StripeApiRepository$retrieveSetupIntent$2(this), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrieveSetupIntentWithOrderedPaymentMethods(String str, ApiRequest.Options options, Locale locale, d<? super SetupIntent> dVar) {
        return retrieveStripeIntentWithOrderedPaymentMethods(str, options, locale, new PaymentMethodPreferenceForSetupIntentJsonParser(), PaymentAnalyticsEvent.SetupIntentRetrieve, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object retrieveSource$payments_core_release(String str, String str2, ApiRequest.Options options, d<? super Source> dVar) {
        return fetchStripeModel(this.apiRequestFactory.createGet(Companion.getRetrieveSourceApiUrl$payments_core_release(str), options, SourceParams.Companion.createRetrieveSourceParams(str2)), new SourceJsonParser(), new StripeApiRepository$retrieveSource$2(this), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    @Override // com.stripe.android.networking.StripeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object retrieveStripeIntent$payments_core_release(java.lang.String r6, com.stripe.android.core.networking.ApiRequest.Options r7, java.util.List<java.lang.String> r8, zz.d<? super com.stripe.android.model.StripeIntent> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.StripeApiRepository$retrieveStripeIntent$1
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.StripeApiRepository$retrieveStripeIntent$1 r0 = (com.stripe.android.networking.StripeApiRepository$retrieveStripeIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.networking.StripeApiRepository$retrieveStripeIntent$1 r0 = new com.stripe.android.networking.StripeApiRepository$retrieveStripeIntent$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            vz.r.b(r9)
            goto L6e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            vz.r.b(r9)
            goto L4c
        L38:
            vz.r.b(r9)
            com.stripe.android.model.PaymentIntent$ClientSecret$Companion r9 = com.stripe.android.model.PaymentIntent.ClientSecret.Companion
            boolean r9 = r9.isMatch(r6)
            if (r9 == 0) goto L5d
            r0.label = r4
            java.lang.Object r9 = r5.retrievePaymentIntent(r6, r7, r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            if (r9 == 0) goto L51
            com.stripe.android.model.StripeIntent r9 = (com.stripe.android.model.StripeIntent) r9
            goto L72
        L51:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Could not retrieve PaymentIntent."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L5d:
            com.stripe.android.model.SetupIntent$ClientSecret$Companion r9 = com.stripe.android.model.SetupIntent.ClientSecret.Companion
            boolean r9 = r9.isMatch(r6)
            if (r9 == 0) goto L7f
            r0.label = r3
            java.lang.Object r9 = r5.retrieveSetupIntent(r6, r7, r8, r0)
            if (r9 != r1) goto L6e
            return r1
        L6e:
            if (r9 == 0) goto L73
            com.stripe.android.model.StripeIntent r9 = (com.stripe.android.model.StripeIntent) r9
        L72:
            return r9
        L73:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Could not retrieve SetupIntent."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L7f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid client secret."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.StripeApiRepository.retrieveStripeIntent$payments_core_release(java.lang.String, com.stripe.android.core.networking.ApiRequest$Options, java.util.List, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object setCustomerShippingInfo$payments_core_release(String str, String str2, Set<String> set, ShippingInformation shippingInformation, ApiRequest.Options options, d<? super Customer> dVar) {
        Map<String, ?> f11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String retrieveCustomerUrl$payments_core_release = Companion.getRetrieveCustomerUrl$payments_core_release(str);
        f11 = r0.f(v.a("shipping", shippingInformation.toParamMap()));
        return fetchStripeModel(factory.createPost(retrieveCustomerUrl$payments_core_release, options, f11), new CustomerJsonParser(), new StripeApiRepository$setCustomerShippingInfo$2(this, set), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object setDefaultCustomerSource$payments_core_release(String str, String str2, Set<String> set, String str3, String str4, ApiRequest.Options options, d<? super Customer> dVar) {
        Map<String, ?> f11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String retrieveCustomerUrl$payments_core_release = Companion.getRetrieveCustomerUrl$payments_core_release(str);
        f11 = r0.f(v.a("default_source", str3));
        return fetchStripeModel(factory.createPost(retrieveCustomerUrl$payments_core_release, options, f11), new CustomerJsonParser(), new StripeApiRepository$setDefaultCustomerSource$2(this, set, str4), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object start3ds2Auth$payments_core_release(Stripe3ds2AuthParams stripe3ds2AuthParams, ApiRequest.Options options, d<? super Stripe3ds2AuthResult> dVar) {
        return fetchStripeModel(this.apiRequestFactory.createPost(Companion.getApiUrl("3ds2/authenticate"), options, stripe3ds2AuthParams.toParamMap()), new Stripe3ds2AuthResultJsonParser(), new StripeApiRepository$start3ds2Auth$2(this), dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object startConsumerVerification(String str, Locale locale, String str2, ApiRequest.Options options, d<? super ConsumerSession> dVar) {
        Map f11;
        Map l11;
        List d11;
        Map f12;
        Map f13;
        Map<String, ?> p11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String startConsumerVerificationUrl$payments_core_release = Companion.getStartConsumerVerificationUrl$payments_core_release();
        f11 = r0.f(v.a("consumer_session_client_secret", str));
        l11 = s0.l(v.a("credentials", f11), v.a("type", "SMS"), v.a("locale", locale.toLanguageTag()));
        if (str2 == null) {
            f13 = null;
        } else {
            d11 = wz.v.d(str2);
            f12 = r0.f(v.a("verification_session_client_secrets", d11));
            f13 = r0.f(v.a("cookies", f12));
        }
        if (f13 == null) {
            f13 = s0.i();
        }
        p11 = s0.p(l11, f13);
        return fetchStripeModel(factory.createPost(startConsumerVerificationUrl$payments_core_release, options, p11), new ConsumerSessionJsonParser(), StripeApiRepository$startConsumerVerification$3.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object updateIssuingCardPin$payments_core_release(String str, String str2, String str3, String str4, ApiRequest.Options options, d<? super b0> dVar) {
        Map<String, ?> l11;
        Object d11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        Companion companion = Companion;
        String issuingCardPinUrl$payments_core_release = companion.getIssuingCardPinUrl$payments_core_release(str);
        l11 = s0.l(v.a("verification", companion.createVerificationParam(str3, str4)), v.a("pin", str2));
        Object makeApiRequest$payments_core_release = makeApiRequest$payments_core_release(factory.createPost(issuingCardPinUrl$payments_core_release, options, l11), new StripeApiRepository$updateIssuingCardPin$2(this), dVar);
        d11 = a00.d.d();
        return makeApiRequest$payments_core_release == d11 ? makeApiRequest$payments_core_release : b0.f54756a;
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object updatePaymentDetails(String str, ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, ApiRequest.Options options, d<? super ConsumerPaymentDetails> dVar) {
        Map f11;
        Map f12;
        Map<String, ?> p11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerPaymentDetailsUrl$payments_core_release = Companion.getConsumerPaymentDetailsUrl$payments_core_release(consumerPaymentDetailsUpdateParams.getId());
        f11 = r0.f(v.a("consumer_session_client_secret", str));
        f12 = r0.f(v.a("credentials", f11));
        p11 = s0.p(f12, consumerPaymentDetailsUpdateParams.toParamMap());
        return fetchStripeModel(factory.createPost(consumerPaymentDetailsUrl$payments_core_release, options, p11), new ConsumerPaymentDetailsJsonParser(), StripeApiRepository$updatePaymentDetails$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object verifyPaymentIntentWithMicrodeposits(String str, int i11, int i12, ApiRequest.Options options, d<? super PaymentIntent> dVar) {
        List l11;
        Map<String, ?> l12;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String verifyMicrodepositsOnPaymentIntentUrl$payments_core_release = Companion.getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release());
        l11 = w.l(b.c(i11), b.c(i12));
        l12 = s0.l(v.a("client_secret", str), v.a("amounts", l11));
        return fetchStripeModel(factory.createPost(verifyMicrodepositsOnPaymentIntentUrl$payments_core_release, options, l12), new PaymentIntentJsonParser(), StripeApiRepository$verifyPaymentIntentWithMicrodeposits$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object verifySetupIntentWithMicrodeposits(String str, int i11, int i12, ApiRequest.Options options, d<? super SetupIntent> dVar) {
        List l11;
        Map<String, ?> l12;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String verifyMicrodepositsOnSetupIntentUrl$payments_core_release = Companion.getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(new SetupIntent.ClientSecret(str).getSetupIntentId$payments_core_release());
        l11 = w.l(b.c(i11), b.c(i12));
        l12 = s0.l(v.a("client_secret", str), v.a("amounts", l11));
        return fetchStripeModel(factory.createPost(verifyMicrodepositsOnSetupIntentUrl$payments_core_release, options, l12), new SetupIntentJsonParser(), StripeApiRepository$verifySetupIntentWithMicrodeposits$2.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object verifyPaymentIntentWithMicrodeposits(String str, String str2, ApiRequest.Options options, d<? super PaymentIntent> dVar) {
        Map<String, ?> l11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String verifyMicrodepositsOnPaymentIntentUrl$payments_core_release = Companion.getVerifyMicrodepositsOnPaymentIntentUrl$payments_core_release(new PaymentIntent.ClientSecret(str).getPaymentIntentId$payments_core_release());
        l11 = s0.l(v.a("client_secret", str), v.a("descriptor_code", str2));
        return fetchStripeModel(factory.createPost(verifyMicrodepositsOnPaymentIntentUrl$payments_core_release, options, l11), new PaymentIntentJsonParser(), StripeApiRepository$verifyPaymentIntentWithMicrodeposits$4.INSTANCE, dVar);
    }

    @Override // com.stripe.android.networking.StripeRepository
    public Object verifySetupIntentWithMicrodeposits(String str, String str2, ApiRequest.Options options, d<? super SetupIntent> dVar) {
        Map<String, ?> l11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String verifyMicrodepositsOnSetupIntentUrl$payments_core_release = Companion.getVerifyMicrodepositsOnSetupIntentUrl$payments_core_release(new SetupIntent.ClientSecret(str).getSetupIntentId$payments_core_release());
        l11 = s0.l(v.a("client_secret", str), v.a("descriptor_code", str2));
        return fetchStripeModel(factory.createPost(verifyMicrodepositsOnSetupIntentUrl$payments_core_release, options, l11), new SetupIntentJsonParser(), StripeApiRepository$verifySetupIntentWithMicrodeposits$4.INSTANCE, dVar);
    }

    public StripeApiRepository(Context context, h00.a<String> publishableKeyProvider, AppInfo appInfo, Logger logger, g workContext, Set<String> productUsageTokens, StripeNetworkClient stripeNetworkClient, AnalyticsRequestExecutor analyticsRequestExecutor, FraudDetectionDataRepository fraudDetectionDataRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, Set<? extends StripeApiBeta> betas, String apiVersion, String sdkVersion) {
        s.g(context, "context");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        s.g(betas, "betas");
        s.g(apiVersion, "apiVersion");
        s.g(sdkVersion, "sdkVersion");
        this.appInfo = appInfo;
        this.logger = logger;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
        this.stripeNetworkClient = stripeNetworkClient;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.fraudDetectionDataParamsUtils = fraudDetectionDataParamsUtils;
        this.apiRequestFactory = new ApiRequest.Factory(appInfo, apiVersion, sdkVersion);
        fireFraudDetectionDataRequest();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository(Context appContext, h00.a<String> publishableKeyProvider, @IOContext g workContext, Set<String> productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, Logger logger) {
        this(appContext, publishableKeyProvider, null, logger, workContext, productUsageTokens, null, analyticsRequestExecutor, null, paymentAnalyticsRequestFactory, null, null, null, null, 15684, null);
        s.g(appContext, "appContext");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(workContext, "workContext");
        s.g(productUsageTokens, "productUsageTokens");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(logger, "logger");
    }
}