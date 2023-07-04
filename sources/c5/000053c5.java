package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CollectBankAccountResponse implements StripeModel {
    private final FinancialConnectionsSession financialConnectionsSession;
    private final StripeIntent intent;
    public static final Parcelable.Creator<CollectBankAccountResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CollectBankAccountResponse> {
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponse createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new CollectBankAccountResponse((StripeIntent) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()), (FinancialConnectionsSession) parcel.readParcelable(CollectBankAccountResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponse[] newArray(int i11) {
            return new CollectBankAccountResponse[i11];
        }
    }

    public CollectBankAccountResponse(StripeIntent intent, FinancialConnectionsSession financialConnectionsSession) {
        s.g(intent, "intent");
        s.g(financialConnectionsSession, "financialConnectionsSession");
        this.intent = intent;
        this.financialConnectionsSession = financialConnectionsSession;
    }

    public static /* synthetic */ CollectBankAccountResponse copy$default(CollectBankAccountResponse collectBankAccountResponse, StripeIntent stripeIntent, FinancialConnectionsSession financialConnectionsSession, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            stripeIntent = collectBankAccountResponse.intent;
        }
        if ((i11 & 2) != 0) {
            financialConnectionsSession = collectBankAccountResponse.financialConnectionsSession;
        }
        return collectBankAccountResponse.copy(stripeIntent, financialConnectionsSession);
    }

    public final StripeIntent component1() {
        return this.intent;
    }

    public final FinancialConnectionsSession component2() {
        return this.financialConnectionsSession;
    }

    public final CollectBankAccountResponse copy(StripeIntent intent, FinancialConnectionsSession financialConnectionsSession) {
        s.g(intent, "intent");
        s.g(financialConnectionsSession, "financialConnectionsSession");
        return new CollectBankAccountResponse(intent, financialConnectionsSession);
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
        if (obj instanceof CollectBankAccountResponse) {
            CollectBankAccountResponse collectBankAccountResponse = (CollectBankAccountResponse) obj;
            return s.c(this.intent, collectBankAccountResponse.intent) && s.c(this.financialConnectionsSession, collectBankAccountResponse.financialConnectionsSession);
        }
        return false;
    }

    public final FinancialConnectionsSession getFinancialConnectionsSession() {
        return this.financialConnectionsSession;
    }

    public final StripeIntent getIntent() {
        return this.intent;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.intent.hashCode() * 31) + this.financialConnectionsSession.hashCode();
    }

    public String toString() {
        return "CollectBankAccountResponse(intent=" + this.intent + ", financialConnectionsSession=" + this.financialConnectionsSession + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.intent, i11);
        out.writeParcelable(this.financialConnectionsSession, i11);
    }
}