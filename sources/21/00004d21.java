package com.stripe.android.financialconnections;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import h00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheet {
    public static final Companion Companion = new Companion(null);
    private final FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher;

    /* loaded from: classes2.dex */
    public static final class Configuration implements Parcelable {
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        private final String financialConnectionsSessionClientSecret;
        private final String publishableKey;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Configuration> {
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Configuration(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i11) {
                return new Configuration[i11];
            }
        }

        public Configuration(String financialConnectionsSessionClientSecret, String publishableKey) {
            s.g(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
            s.g(publishableKey, "publishableKey");
            this.financialConnectionsSessionClientSecret = financialConnectionsSessionClientSecret;
            this.publishableKey = publishableKey;
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = configuration.financialConnectionsSessionClientSecret;
            }
            if ((i11 & 2) != 0) {
                str2 = configuration.publishableKey;
            }
            return configuration.copy(str, str2);
        }

        public final String component1() {
            return this.financialConnectionsSessionClientSecret;
        }

        public final String component2() {
            return this.publishableKey;
        }

        public final Configuration copy(String financialConnectionsSessionClientSecret, String publishableKey) {
            s.g(financialConnectionsSessionClientSecret, "financialConnectionsSessionClientSecret");
            s.g(publishableKey, "publishableKey");
            return new Configuration(financialConnectionsSessionClientSecret, publishableKey);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Configuration) {
                Configuration configuration = (Configuration) obj;
                return s.c(this.financialConnectionsSessionClientSecret, configuration.financialConnectionsSessionClientSecret) && s.c(this.publishableKey, configuration.publishableKey);
            }
            return false;
        }

        public final String getFinancialConnectionsSessionClientSecret() {
            return this.financialConnectionsSessionClientSecret;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public int hashCode() {
            return (this.financialConnectionsSessionClientSecret.hashCode() * 31) + this.publishableKey.hashCode();
        }

        public String toString() {
            return "Configuration(financialConnectionsSessionClientSecret=" + this.financialConnectionsSessionClientSecret + ", publishableKey=" + this.publishableKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.financialConnectionsSessionClientSecret);
            out.writeString(this.publishableKey);
        }
    }

    public FinancialConnectionsSheet(FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher) {
        s.g(financialConnectionsSheetLauncher, "financialConnectionsSheetLauncher");
        this.financialConnectionsSheetLauncher = financialConnectionsSheetLauncher;
    }

    public final void present(Configuration configuration) {
        s.g(configuration, "configuration");
        this.financialConnectionsSheetLauncher.present(configuration);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FinancialConnectionsSheet create(ComponentActivity activity, FinancialConnectionsSheetResultCallback callback) {
            s.g(activity, "activity");
            s.g(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForDataLauncher(activity, callback));
        }

        public final FinancialConnectionsSheet createForBankAccountToken(ComponentActivity activity, l<? super FinancialConnectionsSheetForTokenResult, b0> callback) {
            s.g(activity, "activity");
            s.g(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForTokenLauncher(activity, callback));
        }

        public final FinancialConnectionsSheet create(Fragment fragment, FinancialConnectionsSheetResultCallback callback) {
            s.g(fragment, "fragment");
            s.g(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForDataLauncher(fragment, callback));
        }

        public final FinancialConnectionsSheet createForBankAccountToken(Fragment fragment, l<? super FinancialConnectionsSheetForTokenResult, b0> callback) {
            s.g(fragment, "fragment");
            s.g(callback, "callback");
            return new FinancialConnectionsSheet(new FinancialConnectionsSheetForTokenLauncher(fragment, callback));
        }
    }
}