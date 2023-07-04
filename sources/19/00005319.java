package com.stripe.android.networking;

import android.os.Build;
import android.util.DisplayMetrics;
import cg.c;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes6.dex */
public final class FraudDetectionDataRequestParamsFactory {
    private static final Companion Companion = new Companion(null);
    private final String androidVersionString;
    private final DisplayMetrics displayMetrics;
    private final String packageName;
    private final String screen;
    private final String timeZone;
    private final String versionName;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createTimezone() {
            int convert = (int) TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
            if (convert % 60 == 0) {
                return String.valueOf(convert / 60);
            }
            String bigDecimal = new BigDecimal(convert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            s.f(bigDecimal, "decHours.toString()");
            return bigDecimal;
        }
    }

    public FraudDetectionDataRequestParamsFactory(DisplayMetrics displayMetrics, String packageName, String str, String timeZone) {
        s.g(displayMetrics, "displayMetrics");
        s.g(packageName, "packageName");
        s.g(timeZone, "timeZone");
        this.displayMetrics = displayMetrics;
        this.packageName = packageName;
        this.versionName = str;
        this.timeZone = timeZone;
        this.screen = displayMetrics.widthPixels + "w_" + displayMetrics.heightPixels + "h_" + displayMetrics.densityDpi + "dpi";
        this.androidVersionString = "Android " + ((Object) Build.VERSION.RELEASE) + ' ' + ((Object) Build.VERSION.CODENAME) + ' ' + Build.VERSION.SDK_INT;
    }

    private final Map<String, Object> createFirstMap() {
        Map<String, Object> l11;
        String locale = Locale.getDefault().toString();
        s.f(locale, "getDefault().toString()");
        l11 = s0.l(v.a(c.f9084i, createValueMap(locale)), v.a("d", createValueMap(this.androidVersionString)), v.a("f", createValueMap(this.screen)), v.a("g", createValueMap(this.timeZone)));
        return l11;
    }

    private final Map<String, Object> createSecondMap(FraudDetectionData fraudDetectionData) {
        Map l11;
        Map<String, Object> p11;
        p[] pVarArr = new p[9];
        String muid$payments_core_release = fraudDetectionData == null ? null : fraudDetectionData.getMuid$payments_core_release();
        if (muid$payments_core_release == null) {
            muid$payments_core_release = "";
        }
        pVarArr[0] = v.a("d", muid$payments_core_release);
        String sid$payments_core_release = fraudDetectionData == null ? null : fraudDetectionData.getSid$payments_core_release();
        pVarArr[1] = v.a("e", sid$payments_core_release != null ? sid$payments_core_release : "");
        pVarArr[2] = v.a("k", this.packageName);
        pVarArr[3] = v.a("o", Build.VERSION.RELEASE);
        pVarArr[4] = v.a("p", Integer.valueOf(Build.VERSION.SDK_INT));
        pVarArr[5] = v.a("q", Build.MANUFACTURER);
        pVarArr[6] = v.a("r", Build.BRAND);
        pVarArr[7] = v.a("s", Build.MODEL);
        pVarArr[8] = v.a("t", Build.TAGS);
        l11 = s0.l(pVarArr);
        String str = this.versionName;
        Map f11 = str != null ? r0.f(v.a("l", str)) : null;
        if (f11 == null) {
            f11 = s0.i();
        }
        p11 = s0.p(l11, f11);
        return p11;
    }

    private final Map<String, Object> createValueMap(String str) {
        Map<String, Object> f11;
        f11 = r0.f(v.a("v", str));
        return f11;
    }

    public final /* synthetic */ Map createParams$payments_core_release(FraudDetectionData fraudDetectionData) {
        Map l11;
        l11 = s0.l(v.a("v2", 1), v.a("tag", "20.5.0"), v.a("src", "android-sdk"), v.a("a", createFirstMap()), v.a("b", createSecondMap(fraudDetectionData)));
        return l11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FraudDetectionDataRequestParamsFactory(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r4, r0)
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r1 = "context.resources.displayMetrics"
            kotlin.jvm.internal.s.f(r0, r1)
            java.lang.String r1 = r4.getPackageName()
            if (r1 != 0) goto L1a
            java.lang.String r1 = ""
        L1a:
            com.stripe.android.utils.ContextUtils r2 = com.stripe.android.utils.ContextUtils.INSTANCE
            android.content.pm.PackageInfo r4 = r2.getPackageInfo$payments_core_release(r4)
            if (r4 != 0) goto L24
            r4 = 0
            goto L26
        L24:
            java.lang.String r4 = r4.versionName
        L26:
            com.stripe.android.networking.FraudDetectionDataRequestParamsFactory$Companion r2 = com.stripe.android.networking.FraudDetectionDataRequestParamsFactory.Companion
            java.lang.String r2 = com.stripe.android.networking.FraudDetectionDataRequestParamsFactory.Companion.access$createTimezone(r2)
            r3.<init>(r0, r1, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.FraudDetectionDataRequestParamsFactory.<init>(android.content.Context):void");
    }
}