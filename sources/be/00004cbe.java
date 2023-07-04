package com.stripe.android.core.networking;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.q;
import vz.r;
import vz.v;
import wz.r0;
import wz.s0;
import wz.x0;

/* loaded from: classes2.dex */
public class AnalyticsRequestFactory {
    private static final String ANALYTICS_NAME = "stripe_android";
    private static final String ANALYTICS_PREFIX = "analytics";
    public static final String ANALYTICS_UA = "analytics.stripe_android-1.0";
    private static final String ANALYTICS_VERSION = "1.0";
    public static final Companion Companion = new Companion(null);
    private static final String DEVICE_TYPE;
    private final Set<String> defaultProductUsageTokens;
    private final PackageInfo packageInfo;
    private final PackageManager packageManager;
    private final String packageName;
    private final Provider<String> publishableKeyProvider;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) Build.MANUFACTURER);
        sb2.append('_');
        sb2.append((Object) Build.BRAND);
        sb2.append('_');
        sb2.append((Object) Build.MODEL);
        DEVICE_TYPE = sb2.toString();
    }

    public AnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, Provider<String> publishableKeyProvider, Set<String> defaultProductUsageTokens) {
        s.g(packageName, "packageName");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(defaultProductUsageTokens, "defaultProductUsageTokens");
        this.packageManager = packageManager;
        this.packageInfo = packageInfo;
        this.packageName = packageName;
        this.publishableKeyProvider = publishableKeyProvider;
        this.defaultProductUsageTokens = defaultProductUsageTokens;
    }

    private final Map<String, Object> createParams(AnalyticsEvent analyticsEvent) {
        Map p11;
        Map<String, Object> p12;
        p11 = s0.p(standardParams(), appDataParams$stripe_core_release());
        p12 = s0.p(p11, params(analyticsEvent));
        return p12;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.CharSequence getAppName(android.content.pm.PackageInfo r2, android.content.pm.PackageManager r3) {
        /*
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L5
        L3:
            r2 = r0
            goto Le
        L5:
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            if (r2 != 0) goto La
            goto L3
        La:
            java.lang.CharSequence r2 = r2.loadLabel(r3)
        Le:
            if (r2 == 0) goto L19
            boolean r3 = kotlin.text.m.w(r2)
            if (r3 == 0) goto L17
            goto L19
        L17:
            r3 = 0
            goto L1a
        L19:
            r3 = 1
        L1a:
            if (r3 != 0) goto L1d
            r0 = r2
        L1d:
            if (r0 != 0) goto L21
            java.lang.String r0 = r1.packageName
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.networking.AnalyticsRequestFactory.getAppName(android.content.pm.PackageInfo, android.content.pm.PackageManager):java.lang.CharSequence");
    }

    private final Map<String, String> params(AnalyticsEvent analyticsEvent) {
        Map<String, String> f11;
        f11 = r0.f(v.a("event", analyticsEvent.getEventName()));
        return f11;
    }

    private final Map<String, Object> standardParams() {
        Object b11;
        Map<String, Object> l11;
        p[] pVarArr = new p[8];
        pVarArr[0] = v.a(AnalyticsFields.ANALYTICS_UA, ANALYTICS_UA);
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(this.publishableKeyProvider.get());
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (q.g(b11)) {
            b11 = ApiRequest.Options.UNDEFINED_PUBLISHABLE_KEY;
        }
        pVarArr[1] = v.a(AnalyticsFields.PUBLISHABLE_KEY, b11);
        pVarArr[2] = v.a(AnalyticsFields.OS_NAME, Build.VERSION.CODENAME);
        pVarArr[3] = v.a(AnalyticsFields.OS_RELEASE, Build.VERSION.RELEASE);
        pVarArr[4] = v.a(AnalyticsFields.OS_VERSION, Integer.valueOf(Build.VERSION.SDK_INT));
        pVarArr[5] = v.a(AnalyticsFields.DEVICE_TYPE, DEVICE_TYPE);
        pVarArr[6] = v.a(AnalyticsFields.BINDINGS_VERSION, "20.5.0");
        pVarArr[7] = v.a(AnalyticsFields.IS_DEVELOPMENT, Boolean.FALSE);
        l11 = s0.l(pVarArr);
        return l11;
    }

    public final Map<String, Object> appDataParams$stripe_core_release() {
        Map<String, Object> i11;
        PackageInfo packageInfo;
        Map<String, Object> l11;
        PackageManager packageManager = this.packageManager;
        if (packageManager != null && (packageInfo = this.packageInfo) != null) {
            l11 = s0.l(v.a(AnalyticsFields.APP_NAME, getAppName(packageInfo, packageManager)), v.a(AnalyticsFields.APP_VERSION, Integer.valueOf(this.packageInfo.versionCode)));
            return l11;
        }
        i11 = s0.i();
        return i11;
    }

    public final AnalyticsRequest createRequest(AnalyticsEvent event, Map<String, ? extends Object> additionalParams) {
        Map p11;
        s.g(event, "event");
        s.g(additionalParams, "additionalParams");
        p11 = s0.p(createParams(event), additionalParams);
        return new AnalyticsRequest(p11, RequestHeadersFactory.Analytics.INSTANCE.create());
    }

    public final Set<String> getDefaultProductUsageTokens$stripe_core_release() {
        return this.defaultProductUsageTokens;
    }

    public /* synthetic */ AnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, packageInfo, str, provider, (i11 & 16) != 0 ? x0.d() : set);
    }
}