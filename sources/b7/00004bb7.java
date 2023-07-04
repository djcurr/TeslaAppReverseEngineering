package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public interface PaymentSessionPrefs {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String PREF_FILE = "PaymentSessionPrefs";

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPaymentMethodKey(String str) {
            return "customer[" + ((Object) str) + "].payment_method";
        }
    }

    /* loaded from: classes2.dex */
    public static final class Default implements PaymentSessionPrefs {
        public static final int $stable = 8;
        private final k prefs$delegate;

        public Default(Context context) {
            k a11;
            s.g(context, "context");
            a11 = m.a(new PaymentSessionPrefs$Default$prefs$2(context));
            this.prefs$delegate = a11;
        }

        @Override // com.stripe.android.PaymentSessionPrefs
        public String getPaymentMethodId(String str) {
            if (str == null) {
                return null;
            }
            return getPrefs().getString(PaymentSessionPrefs.Companion.getPaymentMethodKey(str), null);
        }

        public final SharedPreferences getPrefs() {
            Object value = this.prefs$delegate.getValue();
            s.f(value, "<get-prefs>(...)");
            return (SharedPreferences) value;
        }

        @Override // com.stripe.android.PaymentSessionPrefs
        public void savePaymentMethodId(String customerId, String str) {
            s.g(customerId, "customerId");
            getPrefs().edit().putString(PaymentSessionPrefs.Companion.getPaymentMethodKey(customerId), str).apply();
        }
    }

    String getPaymentMethodId(String str);

    void savePaymentMethodId(String str, String str2);
}