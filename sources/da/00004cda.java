package com.stripe.android.core.networking;

import android.system.Os;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeRequest;
import h00.a;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.d;
import vz.v;
import wz.e0;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes2.dex */
public abstract class RequestHeadersFactory {
    private static final String CHARSET;
    public static final Companion Companion = new Companion(null);
    public static final String UNDETERMINED_LANGUAGE = "und";
    private Map<String, String> postHeaders;

    /* loaded from: classes2.dex */
    public static final class Analytics extends RequestHeadersFactory {
        private static final Map<String, String> extraHeaders;
        public static final Analytics INSTANCE = new Analytics();
        private static final String userAgent = RequestHeadersFactory.Companion.getUserAgent("AndroidBindings/20.5.0");

        static {
            Map<String, String> i11;
            i11 = s0.i();
            extraHeaders = i11;
        }

        private Analytics() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            return extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            return userAgent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String getUserAgent$default(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "AndroidBindings/20.5.0";
            }
            return companion.getUserAgent(str);
        }

        public final String getCHARSET() {
            return RequestHeadersFactory.CHARSET;
        }

        public final String getUserAgent(String sdkVersion) {
            s.g(sdkVersion, "sdkVersion");
            return s.p("Stripe/v1 ", sdkVersion);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FraudDetection extends RequestHeadersFactory {
        public static final Companion Companion = new Companion(null);
        public static final String HEADER_COOKIE = "Cookie";
        private final Map<String, String> extraHeaders;
        private Map<String, String> postHeaders;
        private final String userAgent;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FraudDetection(String guid) {
            super(null);
            Map<String, String> f11;
            Map<String, String> f12;
            s.g(guid, "guid");
            f11 = r0.f(v.a(HEADER_COOKIE, s.p("m=", guid)));
            this.extraHeaders = f11;
            Companion companion = RequestHeadersFactory.Companion;
            this.userAgent = companion.getUserAgent("AndroidBindings/20.5.0");
            f12 = r0.f(v.a(NetworkConstantsKt.HEADER_CONTENT_TYPE, StripeRequest.MimeType.Json + "; charset=" + companion.getCHARSET()));
            this.postHeaders = f12;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            return this.extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            return this.userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected void setPostHeaders(Map<String, String> map) {
            s.g(map, "<set-?>");
            this.postHeaders = map;
        }
    }

    static {
        String name = d.f35187b.name();
        s.f(name, "UTF_8.name()");
        CHARSET = name;
    }

    private RequestHeadersFactory() {
        Map<String, String> i11;
        i11 = s0.i();
        this.postHeaders = i11;
    }

    public /* synthetic */ RequestHeadersFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Map<String, String> create() {
        Map l11;
        Map<String, String> p11;
        Map<String, String> extraHeaders = getExtraHeaders();
        l11 = s0.l(v.a(NetworkConstantsKt.HEADER_USER_AGENT, getUserAgent()), v.a(NetworkConstantsKt.HEADER_ACCEPT_CHARSET, CHARSET));
        p11 = s0.p(extraHeaders, l11);
        return p11;
    }

    public final Map<String, String> createPostHeader() {
        return getPostHeaders();
    }

    protected abstract Map<String, String> getExtraHeaders();

    protected Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    protected abstract String getUserAgent();

    protected void setPostHeaders(Map<String, String> map) {
        s.g(map, "<set-?>");
        this.postHeaders = map;
    }

    /* loaded from: classes2.dex */
    public static final class Api extends BaseApiHeadersFactory {
        private Map<String, String> postHeaders;

        /* renamed from: com.stripe.android.core.networking.RequestHeadersFactory$Api$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends u implements a<ApiRequest.Options> {
            final /* synthetic */ ApiRequest.Options $options;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiRequest.Options options) {
                super(0);
                this.$options = options;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            public final ApiRequest.Options invoke() {
                return this.$options;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ Api(com.stripe.android.core.networking.ApiRequest.Options r7, com.stripe.android.core.AppInfo r8, java.util.Locale r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r6 = this;
                r13 = r12 & 2
                if (r13 == 0) goto L5
                r8 = 0
            L5:
                r2 = r8
                r8 = r12 & 4
                if (r8 == 0) goto L13
                java.util.Locale r9 = java.util.Locale.getDefault()
                java.lang.String r8 = "getDefault()"
                kotlin.jvm.internal.s.f(r9, r8)
            L13:
                r3 = r9
                r8 = r12 & 8
                if (r8 == 0) goto L22
                com.stripe.android.core.ApiVersion$Companion r8 = com.stripe.android.core.ApiVersion.Companion
                com.stripe.android.core.ApiVersion r8 = r8.get()
                java.lang.String r10 = r8.getCode()
            L22:
                r4 = r10
                r8 = r12 & 16
                if (r8 == 0) goto L29
                java.lang.String r11 = "AndroidBindings/20.5.0"
            L29:
                r5 = r11
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.networking.RequestHeadersFactory.Api.<init>(com.stripe.android.core.networking.ApiRequest$Options, com.stripe.android.core.AppInfo, java.util.Locale, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected void setPostHeaders(Map<String, String> map) {
            s.g(map, "<set-?>");
            this.postHeaders = map;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(ApiRequest.Options options, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion) {
            super(new AnonymousClass1(options), appInfo, locale, apiVersion, sdkVersion);
            Map<String, String> f11;
            s.g(options, "options");
            s.g(locale, "locale");
            s.g(apiVersion, "apiVersion");
            s.g(sdkVersion, "sdkVersion");
            f11 = r0.f(v.a(NetworkConstantsKt.HEADER_CONTENT_TYPE, StripeRequest.MimeType.Form + "; charset=" + RequestHeadersFactory.Companion.getCHARSET()));
            this.postHeaders = f11;
        }
    }

    /* loaded from: classes2.dex */
    public static class BaseApiHeadersFactory extends RequestHeadersFactory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final Locale locale;
        private final a<ApiRequest.Options> optionsProvider;
        private final String sdkVersion;
        private final StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ BaseApiHeadersFactory(h00.a r7, com.stripe.android.core.AppInfo r8, java.util.Locale r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r6 = this;
                r13 = r12 & 2
                if (r13 == 0) goto L5
                r8 = 0
            L5:
                r2 = r8
                r8 = r12 & 4
                if (r8 == 0) goto L13
                java.util.Locale r9 = java.util.Locale.getDefault()
                java.lang.String r8 = "getDefault()"
                kotlin.jvm.internal.s.f(r9, r8)
            L13:
                r3 = r9
                r8 = r12 & 8
                if (r8 == 0) goto L22
                com.stripe.android.core.ApiVersion$Companion r8 = com.stripe.android.core.ApiVersion.Companion
                com.stripe.android.core.ApiVersion r8 = r8.get()
                java.lang.String r10 = r8.getCode()
            L22:
                r4 = r10
                r8 = r12 & 16
                if (r8 == 0) goto L29
                java.lang.String r11 = "AndroidBindings/20.5.0"
            L29:
                r5 = r11
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.networking.RequestHeadersFactory.BaseApiHeadersFactory.<init>(h00.a, com.stripe.android.core.AppInfo, java.util.Locale, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        private final String getLanguageTag() {
            boolean w11;
            String it2 = this.locale.toLanguageTag();
            s.f(it2, "it");
            w11 = kotlin.text.v.w(it2);
            boolean z11 = true;
            if ((!(w11 ^ true) || s.c(it2, RequestHeadersFactory.UNDETERMINED_LANGUAGE)) ? false : false) {
                return it2;
            }
            return null;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getExtraHeaders() {
            Map l11;
            Map p11;
            Map i11;
            Map p12;
            Map p13;
            Map p14;
            Map<String, String> p15;
            ApiRequest.Options invoke = this.optionsProvider.invoke();
            l11 = s0.l(v.a(NetworkConstantsKt.HEADER_ACCEPT, "application/json"), v.a(NetworkConstantsKt.HEADER_STRIPE_VERSION, this.apiVersion), v.a(NetworkConstantsKt.HEADER_AUTHORIZATION, s.p("Bearer ", invoke.getApiKey())));
            p11 = s0.p(l11, this.stripeClientUserAgentHeaderFactory.create(this.appInfo));
            if (invoke.getApiKeyIsUserKey()) {
                i11 = r0.f(v.a(NetworkConstantsKt.HEADER_STRIPE_LIVEMODE, String.valueOf(true ^ s.c(Os.getenv(NetworkConstantsKt.HEADER_STRIPE_LIVEMODE), "false"))));
            } else {
                i11 = s0.i();
            }
            p12 = s0.p(p11, i11);
            String stripeAccount = invoke.getStripeAccount();
            Map f11 = stripeAccount == null ? null : r0.f(v.a(NetworkConstantsKt.HEADER_STRIPE_ACCOUNT, stripeAccount));
            if (f11 == null) {
                f11 = s0.i();
            }
            p13 = s0.p(p12, f11);
            String idempotencyKey = invoke.getIdempotencyKey();
            Map f12 = idempotencyKey == null ? null : r0.f(v.a(NetworkConstantsKt.HEADER_IDEMPOTENCY_KEY, idempotencyKey));
            if (f12 == null) {
                f12 = s0.i();
            }
            p14 = s0.p(p13, f12);
            String languageTag = getLanguageTag();
            Map f13 = languageTag != null ? r0.f(v.a(NetworkConstantsKt.HEADER_ACCEPT_LANGUAGE, languageTag)) : null;
            if (f13 == null) {
                f13 = s0.i();
            }
            p15 = s0.p(p14, f13);
            return p15;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected String getUserAgent() {
            List n11;
            String l02;
            String[] strArr = new String[2];
            strArr[0] = RequestHeadersFactory.Companion.getUserAgent(this.sdkVersion);
            AppInfo appInfo = this.appInfo;
            strArr[1] = appInfo == null ? null : appInfo.toUserAgent$stripe_core_release();
            n11 = w.n(strArr);
            l02 = e0.l0(n11, " ", null, null, 0, null, null, 62, null);
            return l02;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseApiHeadersFactory(a<ApiRequest.Options> optionsProvider, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            s.g(optionsProvider, "optionsProvider");
            s.g(locale, "locale");
            s.g(apiVersion, "apiVersion");
            s.g(sdkVersion, "sdkVersion");
            this.optionsProvider = optionsProvider;
            this.appInfo = appInfo;
            this.locale = locale;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
            this.stripeClientUserAgentHeaderFactory = new StripeClientUserAgentHeaderFactory(null, 1, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FileUpload extends BaseApiHeadersFactory {
        private Map<String, String> postHeaders;

        /* renamed from: com.stripe.android.core.networking.RequestHeadersFactory$FileUpload$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends u implements a<ApiRequest.Options> {
            final /* synthetic */ ApiRequest.Options $options;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiRequest.Options options) {
                super(0);
                this.$options = options;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h00.a
            public final ApiRequest.Options invoke() {
                return this.$options;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ FileUpload(com.stripe.android.core.networking.ApiRequest.Options r8, com.stripe.android.core.AppInfo r9, java.util.Locale r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r7 = this;
                r15 = r14 & 2
                if (r15 == 0) goto L5
                r9 = 0
            L5:
                r2 = r9
                r9 = r14 & 4
                if (r9 == 0) goto L13
                java.util.Locale r10 = java.util.Locale.getDefault()
                java.lang.String r9 = "getDefault()"
                kotlin.jvm.internal.s.f(r10, r9)
            L13:
                r3 = r10
                r9 = r14 & 8
                if (r9 == 0) goto L22
                com.stripe.android.core.ApiVersion$Companion r9 = com.stripe.android.core.ApiVersion.Companion
                com.stripe.android.core.ApiVersion r9 = r9.get()
                java.lang.String r11 = r9.getCode()
            L22:
                r4 = r11
                r9 = r14 & 16
                if (r9 == 0) goto L29
                java.lang.String r12 = "AndroidBindings/20.5.0"
            L29:
                r5 = r12
                r0 = r7
                r1 = r8
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.networking.RequestHeadersFactory.FileUpload.<init>(com.stripe.android.core.networking.ApiRequest$Options, com.stripe.android.core.AppInfo, java.util.Locale, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        protected void setPostHeaders(Map<String, String> map) {
            s.g(map, "<set-?>");
            this.postHeaders = map;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileUpload(ApiRequest.Options options, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion, String boundary) {
            super(new AnonymousClass1(options), appInfo, locale, apiVersion, sdkVersion);
            Map<String, String> f11;
            s.g(options, "options");
            s.g(locale, "locale");
            s.g(apiVersion, "apiVersion");
            s.g(sdkVersion, "sdkVersion");
            s.g(boundary, "boundary");
            f11 = r0.f(v.a(NetworkConstantsKt.HEADER_CONTENT_TYPE, StripeRequest.MimeType.MultipartForm.getCode() + "; boundary=" + boundary));
            this.postHeaders = f11;
        }
    }
}