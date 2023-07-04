package com.stripe.android.core.networking;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import h00.a;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import kotlin.text.v;
import wz.e0;
import wz.w;

/* loaded from: classes2.dex */
public final class ApiRequest extends StripeRequest {
    public static final String API_HOST = "https://api.stripe.com";
    public static final Companion Companion = new Companion(null);
    private final String apiVersion;
    private final AppInfo appInfo;
    private final String baseUrl;
    private final Map<String, String> headers;
    private final RequestHeadersFactory.Api headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Options options;
    private final Map<String, ?> params;
    private Map<String, String> postHeaders;
    private final String query;
    private final Iterable<Integer> retryResponseCodes;
    private final String sdkVersion;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ApiRequest(StripeRequest.Method method, String str, Map map, Options options, AppInfo appInfo, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, str, (i11 & 4) != 0 ? null : map, options, (i11 & 16) != 0 ? null : appInfo, (i11 & 32) != 0 ? ApiVersion.Companion.get().getCode() : str2, (i11 & 64) != 0 ? "AndroidBindings/20.5.0" : str3);
    }

    private final AppInfo component5() {
        return this.appInfo;
    }

    private final String component6() {
        return this.apiVersion;
    }

    private final String component7() {
        return this.sdkVersion;
    }

    public static /* synthetic */ ApiRequest copy$default(ApiRequest apiRequest, StripeRequest.Method method, String str, Map map, Options options, AppInfo appInfo, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            method = apiRequest.getMethod();
        }
        if ((i11 & 2) != 0) {
            str = apiRequest.baseUrl;
        }
        String str4 = str;
        Map<String, ?> map2 = map;
        if ((i11 & 4) != 0) {
            map2 = apiRequest.params;
        }
        Map map3 = map2;
        if ((i11 & 8) != 0) {
            options = apiRequest.options;
        }
        Options options2 = options;
        if ((i11 & 16) != 0) {
            appInfo = apiRequest.appInfo;
        }
        AppInfo appInfo2 = appInfo;
        if ((i11 & 32) != 0) {
            str2 = apiRequest.apiVersion;
        }
        String str5 = str2;
        if ((i11 & 64) != 0) {
            str3 = apiRequest.sdkVersion;
        }
        return apiRequest.copy(method, str4, map3, options2, appInfo2, str5, str3);
    }

    private final byte[] getPostBodyBytes() {
        try {
            byte[] bytes = this.query.getBytes(d.f35187b);
            s.f(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e11) {
            throw new InvalidRequestException(null, null, 0, "Unable to encode parameters to " + ((Object) d.f35187b.name()) + ". Please contact support@stripe.com for assistance.", e11, 7, null);
        }
    }

    public final StripeRequest.Method component1() {
        return getMethod();
    }

    public final String component2() {
        return this.baseUrl;
    }

    public final Map<String, ?> component3() {
        return this.params;
    }

    public final Options component4() {
        return this.options;
    }

    public final ApiRequest copy(StripeRequest.Method method, String baseUrl, Map<String, ?> map, Options options, AppInfo appInfo, String apiVersion, String sdkVersion) {
        s.g(method, "method");
        s.g(baseUrl, "baseUrl");
        s.g(options, "options");
        s.g(apiVersion, "apiVersion");
        s.g(sdkVersion, "sdkVersion");
        return new ApiRequest(method, baseUrl, map, options, appInfo, apiVersion, sdkVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApiRequest) {
            ApiRequest apiRequest = (ApiRequest) obj;
            return getMethod() == apiRequest.getMethod() && s.c(this.baseUrl, apiRequest.baseUrl) && s.c(this.params, apiRequest.params) && s.c(this.options, apiRequest.options) && s.c(this.appInfo, apiRequest.appInfo) && s.c(this.apiVersion, apiRequest.apiVersion) && s.c(this.sdkVersion, apiRequest.sdkVersion);
        }
        return false;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final Map<String, ?> getParams() {
        return this.params;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        List n11;
        boolean M;
        String l02;
        if (StripeRequest.Method.GET != getMethod() && StripeRequest.Method.DELETE != getMethod()) {
            return this.baseUrl;
        }
        String[] strArr = new String[2];
        strArr[0] = this.baseUrl;
        String str = this.query;
        if (!(str.length() > 0)) {
            str = null;
        }
        strArr[1] = str;
        n11 = w.n(strArr);
        M = kotlin.text.w.M(this.baseUrl, CallerData.NA, false, 2, null);
        l02 = e0.l0(n11, M ? "&" : CallerData.NA, null, null, 0, null, null, 62, null);
        return l02;
    }

    public int hashCode() {
        int hashCode = ((getMethod().hashCode() * 31) + this.baseUrl.hashCode()) * 31;
        Map<String, ?> map = this.params;
        int hashCode2 = (((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.options.hashCode()) * 31;
        AppInfo appInfo = this.appInfo;
        return ((((hashCode2 + (appInfo != null ? appInfo.hashCode() : 0)) * 31) + this.apiVersion.hashCode()) * 31) + this.sdkVersion.hashCode();
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    public String toString() {
        return getMethod().getCode() + ' ' + this.baseUrl;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) {
        s.g(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }

    public ApiRequest(StripeRequest.Method method, String baseUrl, Map<String, ?> map, Options options, AppInfo appInfo, String apiVersion, String sdkVersion) {
        s.g(method, "method");
        s.g(baseUrl, "baseUrl");
        s.g(options, "options");
        s.g(apiVersion, "apiVersion");
        s.g(sdkVersion, "sdkVersion");
        this.method = method;
        this.baseUrl = baseUrl;
        this.params = map;
        this.options = options;
        this.appInfo = appInfo;
        this.apiVersion = apiVersion;
        this.sdkVersion = sdkVersion;
        this.query = QueryStringFactory.INSTANCE.createFromParamsWithEmptyValues(map);
        RequestHeadersFactory.Api api = new RequestHeadersFactory.Api(options, appInfo, null, apiVersion, sdkVersion, 4, null);
        this.headersFactory = api;
        this.mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = NetworkConstantsKt.getDEFAULT_RETRY_CODES();
        this.headers = api.create();
        this.postHeaders = api.createPostHeader();
    }

    /* loaded from: classes2.dex */
    public static final class Factory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final String sdkVersion;

        public Factory() {
            this(null, null, null, 7, null);
        }

        public Factory(AppInfo appInfo, String apiVersion, String sdkVersion) {
            s.g(apiVersion, "apiVersion");
            s.g(sdkVersion, "sdkVersion");
            this.appInfo = appInfo;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createDelete$default(Factory factory, String str, Options options, Map map, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            return factory.createDelete(str, options, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createGet$default(Factory factory, String str, Options options, Map map, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            return factory.createGet(str, options, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createPost$default(Factory factory, String str, Options options, Map map, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            return factory.createPost(str, options, map);
        }

        public final ApiRequest createDelete(String url, Options options, Map<String, ?> map) {
            s.g(url, "url");
            s.g(options, "options");
            return new ApiRequest(StripeRequest.Method.DELETE, url, map, options, this.appInfo, this.apiVersion, this.sdkVersion);
        }

        public final ApiRequest createGet(String url, Options options, Map<String, ?> map) {
            s.g(url, "url");
            s.g(options, "options");
            return new ApiRequest(StripeRequest.Method.GET, url, map, options, this.appInfo, this.apiVersion, this.sdkVersion);
        }

        public final ApiRequest createPost(String url, Options options, Map<String, ?> map) {
            s.g(url, "url");
            s.g(options, "options");
            return new ApiRequest(StripeRequest.Method.POST, url, map, options, this.appInfo, this.apiVersion, this.sdkVersion);
        }

        public /* synthetic */ Factory(AppInfo appInfo, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : appInfo, (i11 & 2) != 0 ? ApiVersion.Companion.get().getCode() : str, (i11 & 4) != 0 ? "AndroidBindings/20.5.0" : str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Options implements Parcelable {
        public static final String UNDEFINED_PUBLISHABLE_KEY = "pk_undefined";
        private final String apiKey;
        private final String idempotencyKey;
        private final String stripeAccount;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Options> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Options> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Options(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options[] newArray(int i11) {
                return new Options[i11];
            }
        }

        public Options(String apiKey, String str, String str2) {
            s.g(apiKey, "apiKey");
            this.apiKey = apiKey;
            this.stripeAccount = str;
            this.idempotencyKey = str2;
            new ApiKeyValidator().requireValid(apiKey);
        }

        public static /* synthetic */ Options copy$default(Options options, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = options.apiKey;
            }
            if ((i11 & 2) != 0) {
                str2 = options.stripeAccount;
            }
            if ((i11 & 4) != 0) {
                str3 = options.idempotencyKey;
            }
            return options.copy(str, str2, str3);
        }

        public final String component1() {
            return this.apiKey;
        }

        public final String component2() {
            return this.stripeAccount;
        }

        public final String component3() {
            return this.idempotencyKey;
        }

        public final Options copy(String apiKey, String str, String str2) {
            s.g(apiKey, "apiKey");
            return new Options(apiKey, str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Options) {
                Options options = (Options) obj;
                return s.c(this.apiKey, options.apiKey) && s.c(this.stripeAccount, options.stripeAccount) && s.c(this.idempotencyKey, options.idempotencyKey);
            }
            return false;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final boolean getApiKeyIsUserKey() {
            boolean H;
            H = v.H(this.apiKey, "uk_", false, 2, null);
            return H;
        }

        public final String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        public final String getStripeAccount() {
            return this.stripeAccount;
        }

        public int hashCode() {
            int hashCode = this.apiKey.hashCode() * 31;
            String str = this.stripeAccount;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.idempotencyKey;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Options(apiKey=" + this.apiKey + ", stripeAccount=" + ((Object) this.stripeAccount) + ", idempotencyKey=" + ((Object) this.idempotencyKey) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.apiKey);
            out.writeString(this.stripeAccount);
            out.writeString(this.idempotencyKey);
        }

        public /* synthetic */ Options(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Options(a<String> publishableKeyProvider, a<String> stripeAccountIdProvider) {
            this(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke(), null, 4, null);
            s.g(publishableKeyProvider, "publishableKeyProvider");
            s.g(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }
}