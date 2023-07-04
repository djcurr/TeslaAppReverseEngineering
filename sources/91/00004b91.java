package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.ApiKeyValidator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes2.dex */
public final class PaymentConfiguration implements Parcelable {
    private static PaymentConfiguration instance;
    private final String publishableKey;
    private final String stripeAccountId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PaymentConfiguration> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void init$default(Companion companion, Context context, String str, String str2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            companion.init(context, str, str2);
        }

        private final PaymentConfiguration loadInstance(Context context) {
            PaymentConfiguration load$payments_core_release = new Store(context).load$payments_core_release();
            if (load$payments_core_release == null) {
                load$payments_core_release = null;
            } else {
                Companion companion = PaymentConfiguration.Companion;
                PaymentConfiguration.instance = load$payments_core_release;
            }
            if (load$payments_core_release != null) {
                return load$payments_core_release;
            }
            throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
        }

        public final /* synthetic */ void clearInstance() {
            PaymentConfiguration.instance = null;
        }

        public final PaymentConfiguration getInstance(Context context) {
            s.g(context, "context");
            PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
            return paymentConfiguration == null ? loadInstance(context) : paymentConfiguration;
        }

        public final void init(Context context, String publishableKey) {
            s.g(context, "context");
            s.g(publishableKey, "publishableKey");
            init$default(this, context, publishableKey, null, 4, null);
        }

        public final void init(Context context, String publishableKey, String str) {
            s.g(context, "context");
            s.g(publishableKey, "publishableKey");
            PaymentConfiguration.instance = new PaymentConfiguration(publishableKey, str);
            new Store(context).save(publishableKey, str);
            new DefaultFraudDetectionDataRepository(context, (g) null, 2, (DefaultConstructorMarker) null).refresh();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<PaymentConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentConfiguration createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new PaymentConfiguration(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentConfiguration[] newArray(int i11) {
            return new PaymentConfiguration[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class Store {
        @Deprecated
        private static final String KEY_ACCOUNT_ID = "key_account_id";
        @Deprecated
        private static final String KEY_PUBLISHABLE_KEY = "key_publishable_key";
        private final SharedPreferences prefs;
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String NAME = PaymentConfiguration.class.getCanonicalName();

        /* loaded from: classes2.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Store(Context context) {
            s.g(context, "context");
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(NAME, 0);
            s.f(sharedPreferences, "context.applicationConte…haredPreferences(NAME, 0)");
            this.prefs = sharedPreferences;
        }

        public final /* synthetic */ PaymentConfiguration load$payments_core_release() {
            String string = this.prefs.getString(KEY_PUBLISHABLE_KEY, null);
            if (string == null) {
                return null;
            }
            return new PaymentConfiguration(string, this.prefs.getString(KEY_ACCOUNT_ID, null));
        }

        public final /* synthetic */ void save(String publishableKey, String str) {
            s.g(publishableKey, "publishableKey");
            this.prefs.edit().putString(KEY_PUBLISHABLE_KEY, publishableKey).putString(KEY_ACCOUNT_ID, str).apply();
        }
    }

    public PaymentConfiguration(String publishableKey, String str) {
        s.g(publishableKey, "publishableKey");
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        ApiKeyValidator.Companion.get().requireValid(publishableKey);
    }

    public static /* synthetic */ PaymentConfiguration copy$default(PaymentConfiguration paymentConfiguration, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paymentConfiguration.publishableKey;
        }
        if ((i11 & 2) != 0) {
            str2 = paymentConfiguration.stripeAccountId;
        }
        return paymentConfiguration.copy(str, str2);
    }

    public static final PaymentConfiguration getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final void init(Context context, String str) {
        Companion.init(context, str);
    }

    public static final void init(Context context, String str, String str2) {
        Companion.init(context, str, str2);
    }

    public final String component1() {
        return this.publishableKey;
    }

    public final String component2() {
        return this.stripeAccountId;
    }

    public final PaymentConfiguration copy(String publishableKey, String str) {
        s.g(publishableKey, "publishableKey");
        return new PaymentConfiguration(publishableKey, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentConfiguration) {
            PaymentConfiguration paymentConfiguration = (PaymentConfiguration) obj;
            return s.c(this.publishableKey, paymentConfiguration.publishableKey) && s.c(this.stripeAccountId, paymentConfiguration.stripeAccountId);
        }
        return false;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public int hashCode() {
        int hashCode = this.publishableKey.hashCode() * 31;
        String str = this.stripeAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PaymentConfiguration(publishableKey=" + this.publishableKey + ", stripeAccountId=" + ((Object) this.stripeAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.publishableKey);
        out.writeString(this.stripeAccountId);
    }

    public /* synthetic */ PaymentConfiguration(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}