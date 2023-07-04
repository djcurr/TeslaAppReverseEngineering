package com.stripe.android.stripe3ds2.observability;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transaction.Logger;
import e00.b;
import ezvcard.property.Kind;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;
import v20.k;
import v20.p0;
import vz.b0;
import vz.q;
import vz.r;
import vz.v;
import wz.e0;
import wz.p;
import wz.s0;
import wz.w;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultErrorReporter implements ErrorReporter {
    @Deprecated
    private static final String CONTENT_TYPE = "application/json; charset=utf-8";
    @Deprecated
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    @Deprecated
    private static final String HEADER_SENTRY_AUTH = "X-Sentry-Auth";
    @Deprecated
    private static final String HEADER_USER_AGENT = "User-Agent";
    @Deprecated
    private static final String HOST = "https://errors.stripe.com";
    @Deprecated
    private static final String HTTP_METHOD = "POST";
    @Deprecated
    private static final String USER_AGENT = "Android3ds2Sdk 6.1.5";
    private final Config config;
    private final Context context;
    private final String environment;
    private final String localeCountry;
    private final Logger logger;
    private final int osVersion;
    private final SentryConfig sentryConfig;
    private final g workContext;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String CHARSET = StandardCharsets.UTF_8.name();

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public interface Config {
        Map<String, String> getCustomTags();
    }

    /* loaded from: classes6.dex */
    public static final class EmptyConfig implements Config {
        public static final EmptyConfig INSTANCE = new EmptyConfig();
        private static final Map<String, String> customTags;

        static {
            Map<String, String> i11;
            i11 = s0.i();
            customTags = i11;
        }

        private EmptyConfig() {
        }

        @Override // com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config
        public Map<String, String> getCustomTags() {
            return customTags;
        }
    }

    public DefaultErrorReporter(Context context, Config config, g workContext, Logger logger, SentryConfig sentryConfig, String environment, String localeCountry, int i11) {
        s.g(context, "context");
        s.g(config, "config");
        s.g(workContext, "workContext");
        s.g(logger, "logger");
        s.g(sentryConfig, "sentryConfig");
        s.g(environment, "environment");
        s.g(localeCountry, "localeCountry");
        this.context = context;
        this.config = config;
        this.workContext = workContext;
        this.logger = logger;
        this.sentryConfig = sentryConfig;
        this.environment = environment;
        this.localeCountry = localeCountry;
        this.osVersion = i11;
    }

    private final HttpsURLConnection createPostConnection() {
        Map l11;
        HttpsURLConnection openConnection = openConnection();
        openConnection.setRequestMethod(HTTP_METHOD);
        openConnection.setDoOutput(true);
        l11 = s0.l(v.a("Content-Type", CONTENT_TYPE), v.a("User-Agent", USER_AGENT), v.a(HEADER_SENTRY_AUTH, createSentryAuthHeader$3ds2sdk_release()));
        for (Map.Entry entry : l11.entrySet()) {
            openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return openConnection;
    }

    private final String getResponseBody(InputStream inputStream) {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            Scanner useDelimiter = new Scanner(inputStream, CHARSET).useDelimiter("\\A");
            String next = useDelimiter.hasNext() ? useDelimiter.next() : null;
            inputStream.close();
            b11 = q.b(next);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        return q.g(b11) ? null : b11;
    }

    private final void logResponse(HttpsURLConnection httpsURLConnection, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailure(Throwable th2) {
        this.logger.error("Failed to send error report.", th2);
    }

    private final HttpsURLConnection openConnection() {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://errors.stripe.com/api/" + this.sentryConfig.getProjectId() + "/store/").openConnection());
        Objects.requireNonNull(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) uRLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void send(JSONObject jSONObject) {
        HttpsURLConnection createPostConnection = createPostConnection();
        OutputStream os2 = createPostConnection.getOutputStream();
        try {
            s.f(os2, "os");
            Charset UTF_8 = StandardCharsets.UTF_8;
            s.f(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os2, UTF_8);
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.flush();
            b0 b0Var = b0.f54756a;
            b.a(outputStreamWriter, null);
            b.a(os2, null);
            createPostConnection.connect();
            logResponse(createPostConnection, createPostConnection.getResponseCode());
            createPostConnection.disconnect();
        } finally {
        }
    }

    public final /* synthetic */ JSONObject createRequestBody$3ds2sdk_release(Throwable t11) {
        s.g(t11, "t");
        JSONObject put = new JSONObject().put("release", "com.stripe.android.stripe3ds2@6.1.5+22");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject put2 = new JSONObject().put("type", t11.getClass().getCanonicalName());
        String message = t11.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject put3 = put.put("exception", jSONObject.put("values", jSONArray.put(put2.put("value", message).put("stacktrace", createRequestStacktrace$3ds2sdk_release(t11)))));
        JSONObject put4 = new JSONObject().put("locale", this.localeCountry).put("environment", this.environment).put("android_os_version", this.osVersion);
        for (Map.Entry<String, String> entry : this.config.getCustomTags().entrySet()) {
            put4.put(entry.getKey(), entry.getValue());
        }
        b0 b0Var = b0.f54756a;
        JSONObject put5 = put3.put("tags", put4).put("contexts", createRequestContexts$3ds2sdk_release());
        s.f(put5, "JSONObject()\n           … createRequestContexts())");
        return put5;
    }

    public final /* synthetic */ JSONObject createRequestContexts$3ds2sdk_release() {
        Object b11;
        ApplicationInfo applicationInfo;
        int i11 = 0;
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (q.g(b11)) {
            b11 = null;
        }
        PackageInfo packageInfo = (PackageInfo) b11;
        CharSequence loadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(this.context.getPackageManager());
        JSONObject jSONObject = new JSONObject();
        JSONObject put = new JSONObject().put("app_identifier", this.context.getPackageName()).put(AnalyticsFields.APP_NAME, loadLabel);
        String str = packageInfo != null ? packageInfo.versionName : null;
        if (str == null) {
            str = "";
        }
        JSONObject put2 = jSONObject.put(Stripe3ds2AuthParams.FIELD_APP, put.put(AnalyticsFields.APP_VERSION, str));
        JSONObject put3 = new JSONObject().put("name", "Android").put("version", Build.VERSION.RELEASE);
        String str2 = Build.TYPE;
        JSONObject put4 = put2.put("os", put3.put("type", str2).put("build", Build.DISPLAY));
        JSONObject put5 = new JSONObject().put("model_id", Build.ID).put("model", Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str2);
        JSONArray jSONArray = new JSONArray();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        s.f(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        int length = SUPPORTED_ABIS.length;
        while (i11 < length) {
            String str3 = SUPPORTED_ABIS[i11];
            i11++;
            jSONArray.put(str3);
        }
        b0 b0Var = b0.f54756a;
        JSONObject put6 = put4.put(Kind.DEVICE, put5.put("archs", jSONArray));
        s.f(put6, "JSONObject()\n           …          )\n            )");
        return put6;
    }

    public final /* synthetic */ JSONObject createRequestStacktrace$3ds2sdk_release(Throwable t11) {
        List<StackTraceElement> e02;
        s.g(t11, "t");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = t11.getStackTrace();
        s.f(stackTrace, "t.stackTrace");
        e02 = p.e0(stackTrace);
        for (StackTraceElement stackTraceElement : e02) {
            jSONArray.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        b0 b0Var = b0.f54756a;
        JSONObject put = jSONObject.put("frames", jSONArray);
        s.f(put, "JSONObject()\n           …          }\n            )");
        return put;
    }

    public final /* synthetic */ String createSentryAuthHeader$3ds2sdk_release() {
        List l11;
        String l02;
        List l12;
        String l03;
        l11 = w.l(v.a("sentry_key", this.sentryConfig.getKey()), v.a("sentry_version", this.sentryConfig.getVersion()), v.a("sentry_timestamp", this.sentryConfig.getTimestamp()), v.a("sentry_client", USER_AGENT), v.a("sentry_secret", this.sentryConfig.getSecret()));
        l02 = e0.l0(l11, ", ", null, null, 0, null, DefaultErrorReporter$createSentryAuthHeader$1.INSTANCE, 30, null);
        l12 = w.l("Sentry", l02);
        l03 = e0.l0(l12, " ", null, null, 0, null, null, 62, null);
        return l03;
    }

    @Override // com.stripe.android.stripe3ds2.observability.ErrorReporter
    public void reportError(Throwable t11) {
        s.g(t11, "t");
        k.d(p0.a(this.workContext), null, null, new DefaultErrorReporter$reportError$1(this, t11, null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DefaultErrorReporter(android.content.Context r9, com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config r10, zz.g r11, com.stripe.android.stripe3ds2.transaction.Logger r12, com.stripe.android.stripe3ds2.observability.SentryConfig r13, java.lang.String r14, java.lang.String r15, int r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            if (r1 == 0) goto L9
            com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$EmptyConfig r1 = com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.EmptyConfig.INSTANCE
            goto La
        L9:
            r1 = r10
        La:
            r2 = r0 & 4
            if (r2 == 0) goto L13
            v20.j0 r2 = v20.e1.b()
            goto L14
        L13:
            r2 = r11
        L14:
            r3 = r0 & 8
            if (r3 == 0) goto L1b
            com.stripe.android.stripe3ds2.transaction.Logger$Noop r3 = com.stripe.android.stripe3ds2.transaction.Logger.Noop.INSTANCE
            goto L1c
        L1b:
            r3 = r12
        L1c:
            r4 = r0 & 16
            if (r4 == 0) goto L23
            com.stripe.android.stripe3ds2.observability.DefaultSentryConfig r4 = com.stripe.android.stripe3ds2.observability.DefaultSentryConfig.INSTANCE
            goto L24
        L23:
            r4 = r13
        L24:
            r5 = r0 & 32
            if (r5 == 0) goto L2b
            java.lang.String r5 = "release"
            goto L2c
        L2b:
            r5 = r14
        L2c:
            r6 = r0 & 64
            if (r6 == 0) goto L3e
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getCountry()
            java.lang.String r7 = "getDefault().country"
            kotlin.jvm.internal.s.f(r6, r7)
            goto L3f
        L3e:
            r6 = r15
        L3f:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L46
            int r0 = android.os.Build.VERSION.SDK_INT
            goto L48
        L46:
            r0 = r16
        L48:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.<init>(android.content.Context, com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$Config, zz.g, com.stripe.android.stripe3ds2.transaction.Logger, com.stripe.android.stripe3ds2.observability.SentryConfig, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}