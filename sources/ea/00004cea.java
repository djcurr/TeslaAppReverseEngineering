package com.stripe.android.core.networking;

import android.os.Build;
import com.stripe.android.core.AppInfo;
import h00.l;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes2.dex */
public final class StripeClientUserAgentHeaderFactory {
    public static final Companion Companion = new Companion(null);
    private static final l<String, String> DEFAULT_SYSTEM_PROPERTY_SUPPLIER = StripeClientUserAgentHeaderFactory$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1.INSTANCE;
    public static final String HEADER_STRIPE_CLIENT_USER_AGENT = "X-Stripe-Client-User-Agent";
    private static final String PROP_USER_AGENT = "http.agent";
    private final l<String, String> systemPropertySupplier;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StripeClientUserAgentHeaderFactory() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StripeClientUserAgentHeaderFactory(l<? super String, String> systemPropertySupplier) {
        s.g(systemPropertySupplier, "systemPropertySupplier");
        this.systemPropertySupplier = systemPropertySupplier;
    }

    public static /* synthetic */ Map create$default(StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory, AppInfo appInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            appInfo = null;
        }
        return stripeClientUserAgentHeaderFactory.create(appInfo);
    }

    public static /* synthetic */ JSONObject createHeaderValue$default(StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory, AppInfo appInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            appInfo = null;
        }
        return stripeClientUserAgentHeaderFactory.createHeaderValue(appInfo);
    }

    public final Map<String, String> create(AppInfo appInfo) {
        Map<String, String> f11;
        f11 = r0.f(v.a(HEADER_STRIPE_CLIENT_USER_AGENT, createHeaderValue(appInfo).toString()));
        return f11;
    }

    public final JSONObject createHeaderValue(AppInfo appInfo) {
        Map l11;
        Map p11;
        l11 = s0.l(v.a("os.name", "android"), v.a("os.version", String.valueOf(Build.VERSION.SDK_INT)), v.a("bindings.version", "20.5.0"), v.a("lang", "Java"), v.a("publisher", "Stripe"), v.a(PROP_USER_AGENT, this.systemPropertySupplier.invoke(PROP_USER_AGENT)));
        Map<String, Map<String, String>> createClientHeaders$stripe_core_release = appInfo == null ? null : appInfo.createClientHeaders$stripe_core_release();
        if (createClientHeaders$stripe_core_release == null) {
            createClientHeaders$stripe_core_release = s0.i();
        }
        p11 = s0.p(l11, createClientHeaders$stripe_core_release);
        return new JSONObject(p11);
    }

    public /* synthetic */ StripeClientUserAgentHeaderFactory(l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DEFAULT_SYSTEM_PROPERTY_SUPPLIER : lVar);
    }
}