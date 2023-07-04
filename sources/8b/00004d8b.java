package com.stripe.android.financialconnections.launcher;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import java.security.InvalidParameterException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes2.dex */
public abstract class FinancialConnectionsSheetActivityArgs implements Parcelable {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_args";
    private final FinancialConnectionsSheet.Configuration configuration;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FinancialConnectionsSheetActivityArgs fromIntent$financial_connections_release(Intent intent) {
            s.g(intent, "intent");
            return (FinancialConnectionsSheetActivityArgs) intent.getParcelableExtra(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ForData extends FinancialConnectionsSheetActivityArgs {
        public static final Parcelable.Creator<ForData> CREATOR = new Creator();
        private final FinancialConnectionsSheet.Configuration configuration;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ForData> {
            @Override // android.os.Parcelable.Creator
            public final ForData createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new ForData(FinancialConnectionsSheet.Configuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ForData[] newArray(int i11) {
                return new ForData[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForData(FinancialConnectionsSheet.Configuration configuration) {
            super(configuration, null);
            s.g(configuration, "configuration");
            this.configuration = configuration;
        }

        public static /* synthetic */ ForData copy$default(ForData forData, FinancialConnectionsSheet.Configuration configuration, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                configuration = forData.getConfiguration();
            }
            return forData.copy(configuration);
        }

        public final FinancialConnectionsSheet.Configuration component1() {
            return getConfiguration();
        }

        public final ForData copy(FinancialConnectionsSheet.Configuration configuration) {
            s.g(configuration, "configuration");
            return new ForData(configuration);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForData) && s.c(getConfiguration(), ((ForData) obj).getConfiguration());
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public FinancialConnectionsSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public int hashCode() {
            return getConfiguration().hashCode();
        }

        public String toString() {
            return "ForData(configuration=" + getConfiguration() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.configuration.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ForToken extends FinancialConnectionsSheetActivityArgs {
        public static final Parcelable.Creator<ForToken> CREATOR = new Creator();
        private final FinancialConnectionsSheet.Configuration configuration;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ForToken> {
            @Override // android.os.Parcelable.Creator
            public final ForToken createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new ForToken(FinancialConnectionsSheet.Configuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ForToken[] newArray(int i11) {
                return new ForToken[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForToken(FinancialConnectionsSheet.Configuration configuration) {
            super(configuration, null);
            s.g(configuration, "configuration");
            this.configuration = configuration;
        }

        public static /* synthetic */ ForToken copy$default(ForToken forToken, FinancialConnectionsSheet.Configuration configuration, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                configuration = forToken.getConfiguration();
            }
            return forToken.copy(configuration);
        }

        public final FinancialConnectionsSheet.Configuration component1() {
            return getConfiguration();
        }

        public final ForToken copy(FinancialConnectionsSheet.Configuration configuration) {
            s.g(configuration, "configuration");
            return new ForToken(configuration);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForToken) && s.c(getConfiguration(), ((ForToken) obj).getConfiguration());
        }

        @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs
        public FinancialConnectionsSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public int hashCode() {
            return getConfiguration().hashCode();
        }

        public String toString() {
            return "ForToken(configuration=" + getConfiguration() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.configuration.writeToParcel(out, i11);
        }
    }

    private FinancialConnectionsSheetActivityArgs(FinancialConnectionsSheet.Configuration configuration) {
        this.configuration = configuration;
    }

    public /* synthetic */ FinancialConnectionsSheetActivityArgs(FinancialConnectionsSheet.Configuration configuration, DefaultConstructorMarker defaultConstructorMarker) {
        this(configuration);
    }

    public FinancialConnectionsSheet.Configuration getConfiguration() {
        return this.configuration;
    }

    public final void validate() {
        boolean w11;
        boolean w12;
        w11 = v.w(getConfiguration().getFinancialConnectionsSessionClientSecret());
        if (!w11) {
            w12 = v.w(getConfiguration().getPublishableKey());
            if (w12) {
                throw new InvalidParameterException("The publishable key cannot be an empty string.");
            }
            return;
        }
        throw new InvalidParameterException("The session client secret cannot be an empty string.");
    }
}