package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import g30.u1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

@a
/* loaded from: classes2.dex */
public final class GetFinancialConnectionsAcccountsParams implements Parcelable {
    @Deprecated
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    @Deprecated
    private static final String PARAM_STARTING_AFTER = "starting_after";
    private final String clientSecret;
    private final String startingAfterAccountId;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetFinancialConnectionsAcccountsParams> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<GetFinancialConnectionsAcccountsParams> serializer() {
            return GetFinancialConnectionsAcccountsParams$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<GetFinancialConnectionsAcccountsParams> {
        @Override // android.os.Parcelable.Creator
        public final GetFinancialConnectionsAcccountsParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new GetFinancialConnectionsAcccountsParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GetFinancialConnectionsAcccountsParams[] newArray(int i11) {
            return new GetFinancialConnectionsAcccountsParams[i11];
        }
    }

    public /* synthetic */ GetFinancialConnectionsAcccountsParams(int i11, String str, String str2, q1 q1Var) {
        if (3 != (i11 & 3)) {
            f1.a(i11, 3, GetFinancialConnectionsAcccountsParams$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = str;
        this.startingAfterAccountId = str2;
    }

    private final String component1() {
        return this.clientSecret;
    }

    private final String component2() {
        return this.startingAfterAccountId;
    }

    public static /* synthetic */ GetFinancialConnectionsAcccountsParams copy$default(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getFinancialConnectionsAcccountsParams.clientSecret;
        }
        if ((i11 & 2) != 0) {
            str2 = getFinancialConnectionsAcccountsParams.startingAfterAccountId;
        }
        return getFinancialConnectionsAcccountsParams.copy(str, str2);
    }

    private static /* synthetic */ void getClientSecret$annotations() {
    }

    private static /* synthetic */ void getStartingAfterAccountId$annotations() {
    }

    public static final void write$Self(GetFinancialConnectionsAcccountsParams self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.p(serialDesc, 0, self.clientSecret);
        output.D(serialDesc, 1, u1.f27647a, self.startingAfterAccountId);
    }

    public final GetFinancialConnectionsAcccountsParams copy(String clientSecret, String str) {
        s.g(clientSecret, "clientSecret");
        return new GetFinancialConnectionsAcccountsParams(clientSecret, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetFinancialConnectionsAcccountsParams) {
            GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams = (GetFinancialConnectionsAcccountsParams) obj;
            return s.c(this.clientSecret, getFinancialConnectionsAcccountsParams.clientSecret) && s.c(this.startingAfterAccountId, getFinancialConnectionsAcccountsParams.startingAfterAccountId);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.clientSecret.hashCode() * 31;
        String str = this.startingAfterAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Map<String, Object> toParamMap() {
        List<p> l11;
        Map<String, Object> i11;
        l11 = w.l(v.a("client_secret", this.clientSecret), v.a(PARAM_STARTING_AFTER, this.startingAfterAccountId));
        i11 = s0.i();
        for (p pVar : l11) {
            String str = (String) pVar.a();
            String str2 = (String) pVar.b();
            Map f11 = str2 == null ? null : r0.f(v.a(str, str2));
            if (f11 == null) {
                f11 = s0.i();
            }
            i11 = s0.p(i11, f11);
        }
        return i11;
    }

    public String toString() {
        return "GetFinancialConnectionsAcccountsParams(clientSecret=" + this.clientSecret + ", startingAfterAccountId=" + ((Object) this.startingAfterAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.startingAfterAccountId);
    }

    public GetFinancialConnectionsAcccountsParams(String clientSecret, String str) {
        s.g(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.startingAfterAccountId = str;
    }
}