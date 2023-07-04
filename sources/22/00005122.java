package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class FinancialConnectionsSession implements StripeModel {
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new Creator();
    private final String clientSecret;

    /* renamed from: id  reason: collision with root package name */
    private final String f20930id;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new FinancialConnectionsSession(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession[] newArray(int i11) {
            return new FinancialConnectionsSession[i11];
        }
    }

    public FinancialConnectionsSession(String str, String str2) {
        this.clientSecret = str;
        this.f20930id = str2;
    }

    public static /* synthetic */ FinancialConnectionsSession copy$default(FinancialConnectionsSession financialConnectionsSession, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = financialConnectionsSession.clientSecret;
        }
        if ((i11 & 2) != 0) {
            str2 = financialConnectionsSession.f20930id;
        }
        return financialConnectionsSession.copy(str, str2);
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.f20930id;
    }

    public final FinancialConnectionsSession copy(String str, String str2) {
        return new FinancialConnectionsSession(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsSession) {
            FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) obj;
            return s.c(this.clientSecret, financialConnectionsSession.clientSecret) && s.c(this.f20930id, financialConnectionsSession.f20930id);
        }
        return false;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getId() {
        return this.f20930id;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.clientSecret;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20930id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsSession(clientSecret=" + ((Object) this.clientSecret) + ", id=" + ((Object) this.f20930id) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.f20930id);
    }
}