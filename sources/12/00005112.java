package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CustomerBankAccount extends CustomerPaymentSource {
    private final BankAccount bankAccount;
    public static final Parcelable.Creator<CustomerBankAccount> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CustomerBankAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerBankAccount createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new CustomerBankAccount((BankAccount) parcel.readParcelable(CustomerBankAccount.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerBankAccount[] newArray(int i11) {
            return new CustomerBankAccount[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerBankAccount(BankAccount bankAccount) {
        super(null);
        s.g(bankAccount, "bankAccount");
        this.bankAccount = bankAccount;
    }

    public static /* synthetic */ CustomerBankAccount copy$default(CustomerBankAccount customerBankAccount, BankAccount bankAccount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bankAccount = customerBankAccount.bankAccount;
        }
        return customerBankAccount.copy(bankAccount);
    }

    public final BankAccount component1() {
        return this.bankAccount;
    }

    public final CustomerBankAccount copy(BankAccount bankAccount) {
        s.g(bankAccount, "bankAccount");
        return new CustomerBankAccount(bankAccount);
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
        return (obj instanceof CustomerBankAccount) && s.c(this.bankAccount, ((CustomerBankAccount) obj).bankAccount);
    }

    public final BankAccount getBankAccount() {
        return this.bankAccount;
    }

    @Override // com.stripe.android.model.CustomerPaymentSource
    public String getId() {
        return this.bankAccount.getId();
    }

    @Override // com.stripe.android.model.CustomerPaymentSource
    public TokenizationMethod getTokenizationMethod() {
        return null;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.bankAccount.hashCode();
    }

    public String toString() {
        return "CustomerBankAccount(bankAccount=" + this.bankAccount + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.bankAccount, i11);
    }
}