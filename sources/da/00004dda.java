package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes2.dex */
public final class FinancialConnectionsSessionManifest implements Parcelable {
    private final String cancelUrl;
    private final String hostedAuthUrl;
    private final String successUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsSessionManifest> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<FinancialConnectionsSessionManifest> serializer() {
            return FinancialConnectionsSessionManifest$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSessionManifest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSessionManifest createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new FinancialConnectionsSessionManifest(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSessionManifest[] newArray(int i11) {
            return new FinancialConnectionsSessionManifest[i11];
        }
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(int i11, String str, String str2, String str3, q1 q1Var) {
        if (7 != (i11 & 7)) {
            f1.a(i11, 7, FinancialConnectionsSessionManifest$$serializer.INSTANCE.getDescriptor());
        }
        this.hostedAuthUrl = str;
        this.successUrl = str2;
        this.cancelUrl = str3;
    }

    public static /* synthetic */ FinancialConnectionsSessionManifest copy$default(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = financialConnectionsSessionManifest.hostedAuthUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = financialConnectionsSessionManifest.successUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = financialConnectionsSessionManifest.cancelUrl;
        }
        return financialConnectionsSessionManifest.copy(str, str2, str3);
    }

    public static /* synthetic */ void getCancelUrl$annotations() {
    }

    public static /* synthetic */ void getHostedAuthUrl$annotations() {
    }

    public static /* synthetic */ void getSuccessUrl$annotations() {
    }

    public static final void write$Self(FinancialConnectionsSessionManifest self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.p(serialDesc, 0, self.hostedAuthUrl);
        output.p(serialDesc, 1, self.successUrl);
        output.p(serialDesc, 2, self.cancelUrl);
    }

    public final String component1() {
        return this.hostedAuthUrl;
    }

    public final String component2() {
        return this.successUrl;
    }

    public final String component3() {
        return this.cancelUrl;
    }

    public final FinancialConnectionsSessionManifest copy(String hostedAuthUrl, String successUrl, String cancelUrl) {
        s.g(hostedAuthUrl, "hostedAuthUrl");
        s.g(successUrl, "successUrl");
        s.g(cancelUrl, "cancelUrl");
        return new FinancialConnectionsSessionManifest(hostedAuthUrl, successUrl, cancelUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsSessionManifest) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) obj;
            return s.c(this.hostedAuthUrl, financialConnectionsSessionManifest.hostedAuthUrl) && s.c(this.successUrl, financialConnectionsSessionManifest.successUrl) && s.c(this.cancelUrl, financialConnectionsSessionManifest.cancelUrl);
        }
        return false;
    }

    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public int hashCode() {
        return (((this.hostedAuthUrl.hashCode() * 31) + this.successUrl.hashCode()) * 31) + this.cancelUrl.hashCode();
    }

    public String toString() {
        return "FinancialConnectionsSessionManifest(hostedAuthUrl=" + this.hostedAuthUrl + ", successUrl=" + this.successUrl + ", cancelUrl=" + this.cancelUrl + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.hostedAuthUrl);
        out.writeString(this.successUrl);
        out.writeString(this.cancelUrl);
    }

    public FinancialConnectionsSessionManifest(String hostedAuthUrl, String successUrl, String cancelUrl) {
        s.g(hostedAuthUrl, "hostedAuthUrl");
        s.g(successUrl, "successUrl");
        s.g(cancelUrl, "cancelUrl");
        this.hostedAuthUrl = hostedAuthUrl;
        this.successUrl = successUrl;
        this.cancelUrl = cancelUrl;
    }
}