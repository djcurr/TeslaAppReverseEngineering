package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c30.b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.serializer.JsonAsStringSerializer;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import g30.u1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes2.dex */
public final class FinancialConnectionsSession implements StripeModel, Parcelable {
    private final FinancialConnectionsAccountList accountsNew;
    private final FinancialConnectionsAccountList accountsOld;
    private final String bankAccountToken;
    private final String clientSecret;

    /* renamed from: id */
    private final String f20908id;
    private final boolean livemode;
    private final PaymentAccount paymentAccount;
    private final String returnUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<FinancialConnectionsSession> serializer() {
            return FinancialConnectionsSession$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsSession> {
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new FinancialConnectionsSession(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, (PaymentAccount) parcel.readParcelable(FinancialConnectionsSession.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsSession[] newArray(int i11) {
            return new FinancialConnectionsSession[i11];
        }
    }

    public /* synthetic */ FinancialConnectionsSession(int i11, String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z11, PaymentAccount paymentAccount, String str3, @a(with = JsonAsStringSerializer.class) String str4, q1 q1Var) {
        if (19 != (i11 & 19)) {
            f1.a(i11, 19, FinancialConnectionsSession$$serializer.INSTANCE.getDescriptor());
        }
        this.clientSecret = str;
        this.f20908id = str2;
        if ((i11 & 4) == 0) {
            this.accountsOld = null;
        } else {
            this.accountsOld = financialConnectionsAccountList;
        }
        if ((i11 & 8) == 0) {
            this.accountsNew = null;
        } else {
            this.accountsNew = financialConnectionsAccountList2;
        }
        this.livemode = z11;
        if ((i11 & 32) == 0) {
            this.paymentAccount = null;
        } else {
            this.paymentAccount = paymentAccount;
        }
        if ((i11 & 64) == 0) {
            this.returnUrl = null;
        } else {
            this.returnUrl = str3;
        }
        if ((i11 & 128) == 0) {
            this.bankAccountToken = null;
        } else {
            this.bankAccountToken = str4;
        }
    }

    public static /* synthetic */ void getAccountsNew$financial_connections_release$annotations() {
    }

    public static /* synthetic */ void getAccountsOld$financial_connections_release$annotations() {
    }

    @a(with = JsonAsStringSerializer.class)
    public static /* synthetic */ void getBankAccountToken$financial_connections_release$annotations() {
    }

    public static /* synthetic */ void getClientSecret$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getLivemode$annotations() {
    }

    public static /* synthetic */ void getPaymentAccount$annotations() {
    }

    public static /* synthetic */ void getReturnUrl$annotations() {
    }

    public static final void write$Self(FinancialConnectionsSession self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.p(serialDesc, 0, self.clientSecret);
        output.p(serialDesc, 1, self.f20908id);
        if (output.k(serialDesc, 2) || self.accountsOld != null) {
            output.D(serialDesc, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, self.accountsOld);
        }
        if (output.k(serialDesc, 3) || self.accountsNew != null) {
            output.D(serialDesc, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, self.accountsNew);
        }
        output.C(serialDesc, 4, self.livemode);
        if (output.k(serialDesc, 5) || self.paymentAccount != null) {
            output.D(serialDesc, 5, PaymentAccountSerializer.INSTANCE, self.paymentAccount);
        }
        if (output.k(serialDesc, 6) || self.returnUrl != null) {
            output.D(serialDesc, 6, u1.f27647a, self.returnUrl);
        }
        if (output.k(serialDesc, 7) || self.bankAccountToken != null) {
            output.D(serialDesc, 7, JsonAsStringSerializer.INSTANCE, self.bankAccountToken);
        }
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.f20908id;
    }

    public final FinancialConnectionsAccountList component3$financial_connections_release() {
        return this.accountsOld;
    }

    public final FinancialConnectionsAccountList component4$financial_connections_release() {
        return this.accountsNew;
    }

    public final boolean component5() {
        return this.livemode;
    }

    public final PaymentAccount component6() {
        return this.paymentAccount;
    }

    public final String component7() {
        return this.returnUrl;
    }

    public final String component8$financial_connections_release() {
        return this.bankAccountToken;
    }

    public final FinancialConnectionsSession copy(String clientSecret, String id2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z11, PaymentAccount paymentAccount, String str, String str2) {
        s.g(clientSecret, "clientSecret");
        s.g(id2, "id");
        return new FinancialConnectionsSession(clientSecret, id2, financialConnectionsAccountList, financialConnectionsAccountList2, z11, paymentAccount, str, str2);
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
            return s.c(this.clientSecret, financialConnectionsSession.clientSecret) && s.c(this.f20908id, financialConnectionsSession.f20908id) && s.c(this.accountsOld, financialConnectionsSession.accountsOld) && s.c(this.accountsNew, financialConnectionsSession.accountsNew) && this.livemode == financialConnectionsSession.livemode && s.c(this.paymentAccount, financialConnectionsSession.paymentAccount) && s.c(this.returnUrl, financialConnectionsSession.returnUrl) && s.c(this.bankAccountToken, financialConnectionsSession.bankAccountToken);
        }
        return false;
    }

    public final FinancialConnectionsAccountList getAccounts() {
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsNew;
        if (financialConnectionsAccountList == null) {
            FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsOld;
            s.e(financialConnectionsAccountList2);
            return financialConnectionsAccountList2;
        }
        return financialConnectionsAccountList;
    }

    public final FinancialConnectionsAccountList getAccountsNew$financial_connections_release() {
        return this.accountsNew;
    }

    public final FinancialConnectionsAccountList getAccountsOld$financial_connections_release() {
        return this.accountsOld;
    }

    public final String getBankAccountToken$financial_connections_release() {
        return this.bankAccountToken;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getId() {
        return this.f20908id;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final PaymentAccount getPaymentAccount() {
        return this.paymentAccount;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((this.clientSecret.hashCode() * 31) + this.f20908id.hashCode()) * 31;
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        int hashCode2 = (hashCode + (financialConnectionsAccountList == null ? 0 : financialConnectionsAccountList.hashCode())) * 31;
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        int hashCode3 = (hashCode2 + (financialConnectionsAccountList2 == null ? 0 : financialConnectionsAccountList2.hashCode())) * 31;
        boolean z11 = this.livemode;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode3 + i11) * 31;
        PaymentAccount paymentAccount = this.paymentAccount;
        int hashCode4 = (i12 + (paymentAccount == null ? 0 : paymentAccount.hashCode())) * 31;
        String str = this.returnUrl;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankAccountToken;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsSession(clientSecret=" + this.clientSecret + ", id=" + this.f20908id + ", accountsOld=" + this.accountsOld + ", accountsNew=" + this.accountsNew + ", livemode=" + this.livemode + ", paymentAccount=" + this.paymentAccount + ", returnUrl=" + ((Object) this.returnUrl) + ", bankAccountToken=" + ((Object) this.bankAccountToken) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.f20908id);
        FinancialConnectionsAccountList financialConnectionsAccountList = this.accountsOld;
        if (financialConnectionsAccountList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            financialConnectionsAccountList.writeToParcel(out, i11);
        }
        FinancialConnectionsAccountList financialConnectionsAccountList2 = this.accountsNew;
        if (financialConnectionsAccountList2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            financialConnectionsAccountList2.writeToParcel(out, i11);
        }
        out.writeInt(this.livemode ? 1 : 0);
        out.writeParcelable(this.paymentAccount, i11);
        out.writeString(this.returnUrl);
        out.writeString(this.bankAccountToken);
    }

    public FinancialConnectionsSession(String clientSecret, String id2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z11, PaymentAccount paymentAccount, String str, String str2) {
        s.g(clientSecret, "clientSecret");
        s.g(id2, "id");
        this.clientSecret = clientSecret;
        this.f20908id = id2;
        this.accountsOld = financialConnectionsAccountList;
        this.accountsNew = financialConnectionsAccountList2;
        this.livemode = z11;
        this.paymentAccount = paymentAccount;
        this.returnUrl = str;
        this.bankAccountToken = str2;
    }

    public /* synthetic */ FinancialConnectionsSession(String str, String str2, FinancialConnectionsAccountList financialConnectionsAccountList, FinancialConnectionsAccountList financialConnectionsAccountList2, boolean z11, PaymentAccount paymentAccount, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : financialConnectionsAccountList, (i11 & 8) != 0 ? null : financialConnectionsAccountList2, z11, (i11 & 32) != 0 ? null : paymentAccount, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4);
    }
}