package com.stripe.android.core;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.v;
import wz.x;
import wz.x0;

/* loaded from: classes2.dex */
public final class ApiVersion {
    private final Set<String> betaCodes;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final String API_VERSION_CODE = "2020-03-02";
    private static final ApiVersion INSTANCE = new ApiVersion(API_VERSION_CODE, null, 2, null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ApiVersion get() {
            return ApiVersion.INSTANCE;
        }
    }

    public ApiVersion(String version, Set<String> betaCodes) {
        s.g(version, "version");
        s.g(betaCodes, "betaCodes");
        this.version = version;
        this.betaCodes = betaCodes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiVersion copy$default(ApiVersion apiVersion, String str, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = apiVersion.version;
        }
        if ((i11 & 2) != 0) {
            set = apiVersion.betaCodes;
        }
        return apiVersion.copy(str, set);
    }

    public final String component1$stripe_core_release() {
        return this.version;
    }

    public final Set<String> component2$stripe_core_release() {
        return this.betaCodes;
    }

    public final ApiVersion copy(String version, Set<String> betaCodes) {
        s.g(version, "version");
        s.g(betaCodes, "betaCodes");
        return new ApiVersion(version, betaCodes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApiVersion) {
            ApiVersion apiVersion = (ApiVersion) obj;
            return s.c(this.version, apiVersion.version) && s.c(this.betaCodes, apiVersion.betaCodes);
        }
        return false;
    }

    public final Set<String> getBetaCodes$stripe_core_release() {
        return this.betaCodes;
    }

    public final String getCode() {
        List d11;
        int t11;
        List y02;
        String l02;
        d11 = v.d(this.version);
        Set<String> set = this.betaCodes;
        t11 = x.t(set, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (String str : set) {
            arrayList.add(str);
        }
        y02 = e0.y0(d11, arrayList);
        l02 = e0.l0(y02, ";", null, null, 0, null, null, 62, null);
        return l02;
    }

    public final String getVersion$stripe_core_release() {
        return this.version;
    }

    public int hashCode() {
        return (this.version.hashCode() * 31) + this.betaCodes.hashCode();
    }

    public String toString() {
        return "ApiVersion(version=" + this.version + ", betaCodes=" + this.betaCodes + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ApiVersion(String str, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? x0.d() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApiVersion(Set<String> betas) {
        this(API_VERSION_CODE, betas);
        s.g(betas, "betas");
    }
}