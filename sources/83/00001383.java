package com.adyen.threeds2.util;

import android.text.TextUtils;
import com.adyen.threeds2.parameters.ConfigParameters;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public final class AdyenConfigParameters {
    public static final a DIRECTORY_SERVER_ID = new a("threeds2.directoryServer", "id");
    public static final a DIRECTORY_SERVER_PUBLIC_KEY = new a("threeds2.directoryServer", "publicKey");
    public static final a SECURITY_APP_SIGNATURE = new a("security", "appSignature");
    public static final a SECURITY_TRUSTED_APP_STORES = new a("security", "trustedAppStores");
    public static final a SECURITY_MALICIOUS_APPS = new a("security", "maliciousApps");
    public static final a DEVICE_PARAMETER_BLOCK_LIST = new a(null, "deviceParameterBlockList");

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final String f9722a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9723b;

        /* renamed from: c  reason: collision with root package name */
        private String f9724c;

        /* renamed from: d  reason: collision with root package name */
        private Set<String> f9725d;

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f9726e;

        /* renamed from: f  reason: collision with root package name */
        private Set<String> f9727f;

        public Builder(String str, String str2) {
            this.f9722a = str;
            this.f9723b = str2;
        }

        public Builder appSignature(String str) {
            this.f9724c = str;
            return this;
        }

        public ConfigParameters build() {
            Preconditions.requireNonEmpty("directoryServerId", this.f9722a);
            Preconditions.requireNonEmpty("directoryServerPublicKey", this.f9723b);
            ConfigParameters configParameters = new ConfigParameters();
            AdyenConfigParameters.a(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_ID, this.f9722a);
            AdyenConfigParameters.a(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_PUBLIC_KEY, this.f9723b);
            String str = this.f9724c;
            if (str != null) {
                AdyenConfigParameters.a(configParameters, AdyenConfigParameters.SECURITY_APP_SIGNATURE, str);
            }
            Set<String> set = this.f9725d;
            if (set != null) {
                AdyenConfigParameters.a(configParameters, AdyenConfigParameters.SECURITY_TRUSTED_APP_STORES, set);
            }
            Set<String> set2 = this.f9726e;
            if (set2 != null) {
                AdyenConfigParameters.a(configParameters, AdyenConfigParameters.SECURITY_MALICIOUS_APPS, set2);
            }
            Set<String> set3 = this.f9727f;
            if (set3 != null) {
                AdyenConfigParameters.a(configParameters, AdyenConfigParameters.DEVICE_PARAMETER_BLOCK_LIST, set3);
            }
            return configParameters;
        }

        public Builder deviceParameterBlockList(Set<String> set) {
            this.f9727f = set;
            return this;
        }

        public Builder maliciousApps(Set<String> set) {
            this.f9726e = set;
            return this;
        }

        public Builder trustedAppStores(Set<String> set) {
            this.f9725d = set;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f9728a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9729b;

        a(String str, String str2) {
            this.f9728a = str;
            this.f9729b = str2;
        }

        String a() {
            return this.f9728a;
        }

        String b() {
            return this.f9729b;
        }
    }

    private AdyenConfigParameters() {
        throw new IllegalStateException("No instances.");
    }

    static void a(ConfigParameters configParameters, a aVar, Collection<String> collection) {
        Preconditions.requireNonNull("paramValues", collection);
        a(configParameters, aVar, TextUtils.join(";", collection));
    }

    public static String getParamValue(ConfigParameters configParameters, a aVar) {
        Preconditions.requireNonNull("configParameters", configParameters);
        Preconditions.requireNonNull("parameter", aVar);
        return configParameters.getParamValue(aVar.a(), aVar.b());
    }

    public static Collection<String> getParamValues(ConfigParameters configParameters, a aVar) {
        String paramValue = getParamValue(configParameters, aVar);
        if (paramValue == null) {
            return null;
        }
        return Arrays.asList(paramValue.split(";"));
    }

    static void a(ConfigParameters configParameters, a aVar, String str) {
        Preconditions.requireNonNull("configParameters", configParameters);
        Preconditions.requireNonNull("parameter", aVar);
        Preconditions.requireNonEmpty("paramValue", str);
        configParameters.addParam(aVar.a(), aVar.b(), str);
    }
}