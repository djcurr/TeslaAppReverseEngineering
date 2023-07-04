package com.stripe.android.payments;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class DefaultReturnUrl {
    public static final Companion Companion = new Companion(null);
    private final String packageName;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultReturnUrl create(Context context) {
            s.g(context, "context");
            String packageName = context.getPackageName();
            s.f(packageName, "context.packageName");
            return new DefaultReturnUrl(packageName);
        }
    }

    public DefaultReturnUrl(String packageName) {
        s.g(packageName, "packageName");
        this.packageName = packageName;
    }

    private final String component1() {
        return this.packageName;
    }

    public static /* synthetic */ DefaultReturnUrl copy$default(DefaultReturnUrl defaultReturnUrl, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = defaultReturnUrl.packageName;
        }
        return defaultReturnUrl.copy(str);
    }

    public final DefaultReturnUrl copy(String packageName) {
        s.g(packageName, "packageName");
        return new DefaultReturnUrl(packageName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultReturnUrl) && s.c(this.packageName, ((DefaultReturnUrl) obj).packageName);
    }

    public final String getValue() {
        return s.p("stripesdk://payment_return_url/", this.packageName);
    }

    public int hashCode() {
        return this.packageName.hashCode();
    }

    public String toString() {
        return "DefaultReturnUrl(packageName=" + this.packageName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}