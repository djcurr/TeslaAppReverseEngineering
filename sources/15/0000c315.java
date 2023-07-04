package yu;

import com.stripe.android.model.PaymentMethodOptionsParams;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.data.HttpMethodType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import yu.f;

/* loaded from: classes6.dex */
public final class b0 implements js.e {

    /* renamed from: a  reason: collision with root package name */
    private final y f59776a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        com.tesla.logging.g.f21878b.a("TeslaRemoteAuthDataSource");
    }

    public b0(y sendOwnerRequest, ct.i realmHelper) {
        kotlin.jvm.internal.s.g(sendOwnerRequest, "sendOwnerRequest");
        kotlin.jvm.internal.s.g(realmHelper, "realmHelper");
        this.f59776a = sendOwnerRequest;
    }

    private final String b(boolean z11) {
        return BuildConfig.AUTH_CLIENT_ID;
    }

    private final String d(String str) {
        return str + "/token";
    }

    private final hy.m<com.tesla.data.oapi.k> e(String str, JSONObject jSONObject) {
        return f.a.d(this.f59776a, HttpMethodType.POST, str, null, jSONObject, null, null, null, false, false, 368, null);
    }

    @Override // js.e
    public hy.m<com.tesla.data.oapi.k> a(String refreshToken, String issuer) {
        kotlin.jvm.internal.s.g(refreshToken, "refreshToken");
        kotlin.jvm.internal.s.g(issuer, "issuer");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grant_type", "refresh_token");
        jSONObject.put("refresh_token", refreshToken);
        jSONObject.put("client_id", b(true));
        jSONObject.put("scope", "openid email offline_access phone");
        return e(d(issuer), jSONObject);
    }

    @Override // js.e
    public hy.m<com.tesla.data.oapi.k> c(String issuerUrl, String authorizationCode, String codeVerifier) {
        kotlin.jvm.internal.s.g(issuerUrl, "issuerUrl");
        kotlin.jvm.internal.s.g(authorizationCode, "authorizationCode");
        kotlin.jvm.internal.s.g(codeVerifier, "codeVerifier");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grant_type", "authorization_code");
        jSONObject.put("client_id", b(false));
        jSONObject.put(PaymentMethodOptionsParams.Blik.PARAM_CODE, authorizationCode);
        jSONObject.put("code_verifier", codeVerifier);
        jSONObject.put("redirect_uri", BuildConfig.AUTH_REDIRECT_URI);
        jSONObject.put("scope", "openid email offline_access phone");
        return e(d(issuerUrl), jSONObject);
    }
}