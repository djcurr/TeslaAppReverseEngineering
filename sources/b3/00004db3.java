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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes2.dex */
public final class BankAccount extends PaymentAccount {
    private final String bankName;

    /* renamed from: id  reason: collision with root package name */
    private final String f20906id;
    private final String last4;
    private final String routingNumber;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BankAccount> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<BankAccount> serializer() {
            return BankAccount$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<BankAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccount createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new BankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccount[] newArray(int i11) {
            return new BankAccount[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BankAccount(int i11, String str, String str2, String str3, String str4, q1 q1Var) {
        super(null);
        if (3 != (i11 & 3)) {
            f1.a(i11, 3, BankAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.f20906id = str;
        this.last4 = str2;
        if ((i11 & 4) == 0) {
            this.bankName = null;
        } else {
            this.bankName = str3;
        }
        if ((i11 & 8) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str4;
        }
    }

    public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bankAccount.f20906id;
        }
        if ((i11 & 2) != 0) {
            str2 = bankAccount.last4;
        }
        if ((i11 & 4) != 0) {
            str3 = bankAccount.bankName;
        }
        if ((i11 & 8) != 0) {
            str4 = bankAccount.routingNumber;
        }
        return bankAccount.copy(str, str2, str3, str4);
    }

    public static /* synthetic */ void getBankName$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getLast4$annotations() {
    }

    public static /* synthetic */ void getRoutingNumber$annotations() {
    }

    public static final void write$Self(BankAccount self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.p(serialDesc, 0, self.f20906id);
        output.p(serialDesc, 1, self.last4);
        if (output.k(serialDesc, 2) || self.bankName != null) {
            output.D(serialDesc, 2, u1.f27647a, self.bankName);
        }
        if (output.k(serialDesc, 3) || self.routingNumber != null) {
            output.D(serialDesc, 3, u1.f27647a, self.routingNumber);
        }
    }

    public final String component1() {
        return this.f20906id;
    }

    public final String component2() {
        return this.last4;
    }

    public final String component3() {
        return this.bankName;
    }

    public final String component4() {
        return this.routingNumber;
    }

    public final BankAccount copy(String id2, String last4, String str, String str2) {
        s.g(id2, "id");
        s.g(last4, "last4");
        return new BankAccount(id2, last4, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BankAccount) {
            BankAccount bankAccount = (BankAccount) obj;
            return s.c(this.f20906id, bankAccount.f20906id) && s.c(this.last4, bankAccount.last4) && s.c(this.bankName, bankAccount.bankName) && s.c(this.routingNumber, bankAccount.routingNumber);
        }
        return false;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getId() {
        return this.f20906id;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public int hashCode() {
        int hashCode = ((this.f20906id.hashCode() * 31) + this.last4.hashCode()) * 31;
        String str = this.bankName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BankAccount(id=" + this.f20906id + ", last4=" + this.last4 + ", bankName=" + ((Object) this.bankName) + ", routingNumber=" + ((Object) this.routingNumber) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20906id);
        out.writeString(this.last4);
        out.writeString(this.bankName);
        out.writeString(this.routingNumber);
    }

    public /* synthetic */ BankAccount(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccount(String id2, String last4, String str, String str2) {
        super(null);
        s.g(id2, "id");
        s.g(last4, "last4");
        this.f20906id = id2;
        this.last4 = last4;
        this.bankName = str;
        this.routingNumber = str2;
    }
}