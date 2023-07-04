package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Token;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import org.spongycastle.i18n.TextBundle;
import vz.v;
import wz.e0;
import wz.r0;
import wz.s0;
import wz.x0;
import wz.y0;

/* loaded from: classes6.dex */
public final class PaymentAnalyticsRequestFactory extends AnalyticsRequestFactory {
    public static final String FIELD_3DS2_UI_TYPE = "3ds2_ui_type";
    public static final String FIELD_PRODUCT_USAGE = "product_usage";
    public static final String FIELD_SOURCE_TYPE = "source_type";
    public static final String FIELD_TOKEN_TYPE = "token_type";
    private final Set<String> defaultProductUsageTokens;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.PaymentAnalyticsRequestFactory$1 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements h00.a<String> {
        final /* synthetic */ String $publishableKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(0);
            this.$publishableKey = str;
        }

        @Override // h00.a
        public final String invoke() {
            return this.$publishableKey;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public enum ThreeDS2UiType {
        None(null, PermissionsResponse.SCOPE_NONE),
        Text("01", TextBundle.TEXT_ENTRY),
        SingleSelect("02", "single_select"),
        MultiSelect("03", "multi_select"),
        Oob("04", "oob"),
        Html("05", "html");
        
        public static final Companion Companion = new Companion(null);
        private final String code;
        private final String typeName;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ThreeDS2UiType fromUiTypeCode(String str) {
                ThreeDS2UiType threeDS2UiType;
                ThreeDS2UiType[] values = ThreeDS2UiType.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        threeDS2UiType = null;
                        break;
                    }
                    threeDS2UiType = values[i11];
                    if (s.c(threeDS2UiType.code, str)) {
                        break;
                    }
                    i11++;
                }
                return threeDS2UiType == null ? ThreeDS2UiType.None : threeDS2UiType;
            }
        }

        ThreeDS2UiType(String str, String str2) {
            this.code = str;
            this.typeName = str2;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.typeName;
        }
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, packageInfo, str, provider, (i11 & 16) != 0 ? x0.d() : set);
    }

    /* renamed from: _init_$lambda-0 */
    public static final String m268_init_$lambda0(h00.a tmp0) {
        s.g(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    public static /* synthetic */ String a(h00.a aVar) {
        return m268_init_$lambda0(aVar);
    }

    private final Map<String, Object> additionalParams(Set<String> set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType) {
        Set m11;
        List O0;
        Map f11;
        Map p11;
        Map p12;
        Map<String, Object> p13;
        m11 = y0.m(this.defaultProductUsageTokens, set);
        if (m11.isEmpty()) {
            m11 = null;
        }
        if (m11 == null) {
            f11 = null;
        } else {
            O0 = e0.O0(m11);
            f11 = r0.f(v.a(FIELD_PRODUCT_USAGE, O0));
        }
        if (f11 == null) {
            f11 = s0.i();
        }
        Map f12 = str == null ? null : r0.f(v.a(FIELD_SOURCE_TYPE, str));
        if (f12 == null) {
            f12 = s0.i();
        }
        p11 = s0.p(f11, f12);
        p12 = s0.p(p11, createTokenTypeParam(str, type));
        Map f13 = threeDS2UiType != null ? r0.f(v.a(FIELD_3DS2_UI_TYPE, threeDS2UiType.toString())) : null;
        if (f13 == null) {
            f13 = s0.i();
        }
        p13 = s0.p(p12, f13);
        return p13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Map additionalParams$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = x0.d();
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            type = null;
        }
        if ((i11 & 8) != 0) {
            threeDS2UiType = null;
        }
        return paymentAnalyticsRequestFactory.additionalParams(set, str, type, threeDS2UiType);
    }

    public static /* synthetic */ AnalyticsRequest createAddSource$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set set, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = x0.d();
        }
        return paymentAnalyticsRequestFactory.createAddSource$payments_core_release(set, str);
    }

    public static /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return paymentAnalyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(str);
    }

    public static /* synthetic */ AnalyticsRequest createRequest$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, PaymentAnalyticsEvent paymentAnalyticsEvent, Set set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = x0.d();
        }
        return paymentAnalyticsRequestFactory.createRequest$payments_core_release(paymentAnalyticsEvent, set, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : type, (i11 & 16) != 0 ? null : threeDS2UiType);
    }

    public static /* synthetic */ AnalyticsRequest createSourceCreation$payments_core_release$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, Set set, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = x0.d();
        }
        return paymentAnalyticsRequestFactory.createSourceCreation$payments_core_release(str, set);
    }

    private final Map<String, String> createTokenTypeParam(String str, Token.Type type) {
        String str2;
        Map<String, String> i11;
        if (type != null) {
            str2 = type.getCode();
        } else {
            str2 = str == null ? "unknown" : null;
        }
        Map<String, String> f11 = str2 != null ? r0.f(v.a(FIELD_TOKEN_TYPE, str2)) : null;
        if (f11 == null) {
            i11 = s0.i();
            return i11;
        }
        return f11;
    }

    static /* synthetic */ Map createTokenTypeParam$default(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, String str, Token.Type type, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            type = null;
        }
        return paymentAnalyticsRequestFactory.createTokenTypeParam(str, type);
    }

    public final /* synthetic */ AnalyticsRequest create3ds2Challenge$payments_core_release(PaymentAnalyticsEvent event, String str) {
        s.g(event, "event");
        return createRequest$payments_core_release$default(this, event, null, null, null, ThreeDS2UiType.Companion.fromUiTypeCode(str), 14, null);
    }

    public final /* synthetic */ AnalyticsRequest createAddSource$payments_core_release(Set productUsageTokens, String sourceType) {
        s.g(productUsageTokens, "productUsageTokens");
        s.g(sourceType, "sourceType");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerAddSource, productUsageTokens, sourceType, null, null, 24, null);
    }

    public final /* synthetic */ AnalyticsRequest createAttachPaymentMethod$payments_core_release(Set productUsageTokens) {
        s.g(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerAttachPaymentMethod, productUsageTokens, null, null, null, 28, null);
    }

    public final /* synthetic */ AnalyticsRequest createDeleteSource$payments_core_release(Set productUsageTokens) {
        s.g(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerDeleteSource, productUsageTokens, null, null, null, 28, null);
    }

    public final /* synthetic */ AnalyticsRequest createDetachPaymentMethod$payments_core_release(Set productUsageTokens) {
        s.g(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.CustomerDetachPaymentMethod, productUsageTokens, null, null, null, 28, null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release(String str) {
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentIntentConfirm, null, str, null, null, 26, null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentMethodCreation$payments_core_release(PaymentMethod.Type type, Set productUsageTokens) {
        s.g(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.PaymentMethodCreate, productUsageTokens, type == null ? null : type.code, null, null, 24, null);
    }

    public final /* synthetic */ AnalyticsRequest createRequest$payments_core_release(PaymentAnalyticsEvent event, Set productUsageTokens, String str, Token.Type type, ThreeDS2UiType threeDS2UiType) {
        s.g(event, "event");
        s.g(productUsageTokens, "productUsageTokens");
        return createRequest(event, additionalParams(productUsageTokens, str, type, threeDS2UiType));
    }

    public final /* synthetic */ AnalyticsRequest createSetupIntentConfirmation$payments_core_release(String str) {
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.SetupIntentConfirm, null, str, null, null, 26, null);
    }

    public final /* synthetic */ AnalyticsRequest createSourceCreation$payments_core_release(String sourceType, Set productUsageTokens) {
        s.g(sourceType, "sourceType");
        s.g(productUsageTokens, "productUsageTokens");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.SourceCreate, productUsageTokens, sourceType, null, null, 24, null);
    }

    public final /* synthetic */ AnalyticsRequest createTokenCreation$payments_core_release(Set productUsageTokens, Token.Type tokenType) {
        s.g(productUsageTokens, "productUsageTokens");
        s.g(tokenType, "tokenType");
        return createRequest$payments_core_release$default(this, PaymentAnalyticsEvent.TokenCreate, productUsageTokens, null, tokenType, null, 20, null);
    }

    public final Set<String> getDefaultProductUsageTokens$payments_core_release() {
        return this.defaultProductUsageTokens;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, Provider<String> publishableKeyProvider, Set<String> defaultProductUsageTokens) {
        super(packageManager, packageInfo, packageName, publishableKeyProvider, null, 16, null);
        s.g(packageName, "packageName");
        s.g(publishableKeyProvider, "publishableKeyProvider");
        s.g(defaultProductUsageTokens, "defaultProductUsageTokens");
        this.defaultProductUsageTokens = defaultProductUsageTokens;
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(Context context, String str, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? x0.d() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(Context context, String publishableKey, Set<String> defaultProductUsageTokens) {
        this(context, new AnonymousClass1(publishableKey), defaultProductUsageTokens);
        s.g(context, "context");
        s.g(publishableKey, "publishableKey");
        s.g(defaultProductUsageTokens, "defaultProductUsageTokens");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentAnalyticsRequestFactory(android.content.Context r8, javax.inject.Provider<java.lang.String> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "publishableKeyProvider"
            kotlin.jvm.internal.s.g(r9, r0)
            android.content.Context r0 = r8.getApplicationContext()
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            com.stripe.android.utils.ContextUtils r0 = com.stripe.android.utils.ContextUtils.INSTANCE
            android.content.Context r1 = r8.getApplicationContext()
            java.lang.String r3 = "context.applicationContext"
            kotlin.jvm.internal.s.f(r1, r3)
            android.content.pm.PackageInfo r3 = r0.getPackageInfo$payments_core_release(r1)
            android.content.Context r8 = r8.getApplicationContext()
            java.lang.String r8 = r8.getPackageName()
            if (r8 != 0) goto L2d
            java.lang.String r8 = ""
        L2d:
            r4 = r8
            java.util.Set r6 = wz.v0.d()
            r1 = r7
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.PaymentAnalyticsRequestFactory.<init>(android.content.Context, javax.inject.Provider):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PaymentAnalyticsRequestFactory(android.content.Context r8, final h00.a<java.lang.String> r9, java.util.Set<java.lang.String> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r8, r0)
            java.lang.String r0 = "publishableKeyProvider"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "defaultProductUsageTokens"
            kotlin.jvm.internal.s.g(r10, r0)
            android.content.Context r0 = r8.getApplicationContext()
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            com.stripe.android.utils.ContextUtils r0 = com.stripe.android.utils.ContextUtils.INSTANCE
            android.content.Context r1 = r8.getApplicationContext()
            java.lang.String r3 = "context.applicationContext"
            kotlin.jvm.internal.s.f(r1, r3)
            android.content.pm.PackageInfo r3 = r0.getPackageInfo$payments_core_release(r1)
            android.content.Context r8 = r8.getApplicationContext()
            java.lang.String r8 = r8.getPackageName()
            if (r8 != 0) goto L32
            java.lang.String r8 = ""
        L32:
            r4 = r8
            com.stripe.android.networking.a r5 = new com.stripe.android.networking.a
            r5.<init>()
            r1 = r7
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.PaymentAnalyticsRequestFactory.<init>(android.content.Context, h00.a, java.util.Set):void");
    }
}