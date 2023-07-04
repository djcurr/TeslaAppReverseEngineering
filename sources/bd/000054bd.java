package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class DefaultPrefsRepository implements PrefsRepository {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String PREF_FILE = "DefaultPrefsRepository";
    private final Context context;
    private final String customerId;
    private final vz.k prefs$delegate;
    private final zz.g workContext;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultPrefsRepository(Context context, String customerId, zz.g workContext) {
        vz.k a11;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(customerId, "customerId");
        kotlin.jvm.internal.s.g(workContext, "workContext");
        this.context = context;
        this.customerId = customerId;
        this.workContext = workContext;
        a11 = vz.m.a(new DefaultPrefsRepository$prefs$2(this));
        this.prefs$delegate = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getKey() {
        return "customer[" + this.customerId + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        Object value = this.prefs$delegate.getValue();
        kotlin.jvm.internal.s.f(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }

    private final void write(String str) {
        getPrefs().edit().putString(getKey(), str).apply();
    }

    @Override // com.stripe.android.paymentsheet.PrefsRepository
    public Object getSavedSelection(boolean z11, zz.d<? super SavedSelection> dVar) {
        return v20.i.g(this.workContext, new DefaultPrefsRepository$getSavedSelection$2(this, z11, null), dVar);
    }

    @Override // com.stripe.android.paymentsheet.PrefsRepository
    public void savePaymentSelection(PaymentSelection paymentSelection) {
        String str;
        if (kotlin.jvm.internal.s.c(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            str = "google_pay";
        } else if (paymentSelection instanceof PaymentSelection.Saved) {
            String str2 = ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().f20932id;
            if (str2 == null) {
                str2 = "";
            }
            str = kotlin.jvm.internal.s.p("payment_method:", str2);
        } else {
            str = null;
        }
        if (str == null) {
            return;
        }
        write(str);
    }
}