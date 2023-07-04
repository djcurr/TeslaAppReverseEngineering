package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f2037a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f2038b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f2039c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f2040d;

    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0040a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f2041a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f2042b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f2043c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f2044d;

        public a a() {
            return new a(this.f2041a, this.f2042b, this.f2043c, this.f2044d);
        }

        public C0040a b(int i11) {
            this.f2042b = Integer.valueOf(i11);
            return this;
        }

        public C0040a c(int i11) {
            this.f2041a = Integer.valueOf(i11 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f2037a = num;
        this.f2038b = num2;
        this.f2039c = num3;
        this.f2040d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f2037a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f2038b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f2039c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f2040d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}