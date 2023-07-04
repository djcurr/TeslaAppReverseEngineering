package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.core.networking.StripeResponseKtxKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import java.util.Map;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.m;
import vz.v;
import wz.r0;
import wz.s0;
import zz.d;

/* loaded from: classes2.dex */
public final class FinancialConnectionsApiRepository implements FinancialConnectionsRepository {
    private static final String API_HOST = "https://api.stripe.com";
    public static final Companion Companion = new Companion(null);
    public static final String PARAMS_APPLICATION_ID = "application_id";
    public static final String PARAMS_CLIENT_SECRET = "client_secret";
    public static final String PARAMS_FULLSCREEN = "fullscreen";
    public static final String PARAMS_HIDE_CLOSE_BUTTON = "hide_close_button";
    public static final String generateHostedUrl = "https://api.stripe.com/v1/link_account_sessions/generate_hosted_url";
    public static final String listAccountsUrl = "https://api.stripe.com/v1/link_account_sessions/list_accounts";
    public static final String sessionReceiptUrl = "https://api.stripe.com/v1/link_account_sessions/session_receipt";
    private final ApiRequest.Factory apiRequestFactory;
    private final a json;
    private final ApiRequest.Options options;
    private final StripeNetworkClient stripeNetworkClient;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FinancialConnectionsApiRepository(String publishableKey, StripeNetworkClient stripeNetworkClient, ApiRequest.Factory apiRequestFactory) {
        s.g(publishableKey, "publishableKey");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(apiRequestFactory, "apiRequestFactory");
        this.stripeNetworkClient = stripeNetworkClient;
        this.apiRequestFactory = apiRequestFactory;
        this.json = m.b(null, FinancialConnectionsApiRepository$json$1.INSTANCE, 1, null);
        this.options = new ApiRequest.Options(publishableKey, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <Response> java.lang.Object executeRequest(com.stripe.android.core.networking.StripeRequest r5, c30.b<Response> r6, zz.d<? super Response> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository$executeRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository$executeRequest$1 r0 = (com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository$executeRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository$executeRequest$1 r0 = new com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository$executeRequest$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            r6 = r5
            c30.b r6 = (c30.b) r6
            java.lang.Object r5 = r0.L$1
            com.stripe.android.core.networking.StripeRequest r5 = (com.stripe.android.core.networking.StripeRequest) r5
            java.lang.Object r0 = r0.L$0
            com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository r0 = (com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository) r0
            vz.r.b(r7)     // Catch: java.lang.Throwable -> L36
            goto L57
        L36:
            r7 = move-exception
            goto L60
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            vz.r.b(r7)
            vz.q$a r7 = vz.q.f54772b     // Catch: java.lang.Throwable -> L5e
            com.stripe.android.core.networking.StripeNetworkClient r7 = r4.stripeNetworkClient     // Catch: java.lang.Throwable -> L5e
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L5e
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L5e
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L5e
            r0.label = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.executeRequest(r5, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r4
        L57:
            com.stripe.android.core.networking.StripeResponse r7 = (com.stripe.android.core.networking.StripeResponse) r7     // Catch: java.lang.Throwable -> L36
            java.lang.Object r7 = vz.q.b(r7)     // Catch: java.lang.Throwable -> L36
            goto L6a
        L5e:
            r7 = move-exception
            r0 = r4
        L60:
            vz.q$a r1 = vz.q.f54772b
            java.lang.Object r7 = vz.r.a(r7)
            java.lang.Object r7 = vz.q.b(r7)
        L6a:
            java.lang.Throwable r1 = vz.q.e(r7)
            if (r1 != 0) goto L9a
            com.stripe.android.core.networking.StripeResponse r7 = (com.stripe.android.core.networking.StripeResponse) r7
            boolean r5 = r7.isError()
            if (r5 != 0) goto L95
            kotlinx.serialization.json.a r5 = r0.getJson$financial_connections_release()
            java.lang.Object r7 = r7.getBody()
            if (r7 == 0) goto L89
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.b(r6, r7)
            return r5
        L89:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L95:
            java.lang.Exception r5 = r0.handleApiError(r7)
            throw r5
        L9a:
            com.stripe.android.core.exception.APIConnectionException r6 = new com.stripe.android.core.exception.APIConnectionException
            java.lang.String r7 = "Failed to execute "
            java.lang.String r5 = kotlin.jvm.internal.s.p(r7, r5)
            r6.<init>(r5, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.repository.FinancialConnectionsApiRepository.executeRequest(com.stripe.android.core.networking.StripeRequest, c30.b, zz.d):java.lang.Object");
    }

    public static /* synthetic */ void getJson$financial_connections_release$annotations() {
    }

    private final Exception handleApiError(StripeResponse<String> stripeResponse) {
        RequestId requestId = stripeResponse.getRequestId();
        String value = requestId == null ? null : requestId.getValue();
        int code = stripeResponse.getCode();
        StripeError parse = new StripeErrorJsonParser().parse(StripeResponseKtxKt.responseJson(stripeResponse));
        if (code != 400) {
            if (code == 401) {
                throw new AuthenticationException(parse, value);
            }
            if (code == 403) {
                throw new PermissionException(parse, value);
            }
            if (code != 404) {
                if (code != 429) {
                    throw new APIException(parse, value, code, null, null, 24, null);
                }
                throw new RateLimitException(parse, value, null, null, 12, null);
            }
        }
        throw new InvalidRequestException(parse, value, code, null, null, 24, null);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object generateFinancialConnectionsSessionManifest(String str, String str2, d<? super FinancialConnectionsSessionManifest> dVar) {
        Map<String, ?> l11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        ApiRequest.Options options = this.options;
        l11 = s0.l(v.a(PARAMS_FULLSCREEN, b.a(true)), v.a(PARAMS_HIDE_CLOSE_BUTTON, b.a(true)), v.a("client_secret", str), v.a(PARAMS_APPLICATION_ID, str2));
        return executeRequest(factory.createPost(generateHostedUrl, options, l11), FinancialConnectionsSessionManifest.Companion.serializer(), dVar);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object getFinancialConnectionsAccounts(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, d<? super FinancialConnectionsAccountList> dVar) {
        return executeRequest(this.apiRequestFactory.createGet(listAccountsUrl, this.options, getFinancialConnectionsAcccountsParams.toParamMap()), FinancialConnectionsAccountList.Companion.serializer(), dVar);
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsRepository
    public Object getFinancialConnectionsSession(String str, d<? super FinancialConnectionsSession> dVar) {
        Map<String, ?> f11;
        ApiRequest.Factory factory = this.apiRequestFactory;
        ApiRequest.Options options = this.options;
        f11 = r0.f(v.a("client_secret", str));
        return executeRequest(factory.createGet(sessionReceiptUrl, options, f11), FinancialConnectionsSession.Companion.serializer(), dVar);
    }

    public final a getJson$financial_connections_release() {
        return this.json;
    }
}