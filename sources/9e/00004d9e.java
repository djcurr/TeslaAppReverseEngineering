package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c30.b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
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
public final class AccountHolder implements StripeModel, Parcelable {
    private final String account;
    private final String customer;
    private final Type type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountHolder> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<AccountHolder> serializer() {
            return AccountHolder$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<AccountHolder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountHolder createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AccountHolder(Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountHolder[] newArray(int i11) {
            return new AccountHolder[i11];
        }
    }

    @a
    /* loaded from: classes2.dex */
    public enum Type {
        ACCOUNT("account"),
        CUSTOMER(PaymentSheetEvent.FIELD_CUSTOMER),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<Type> serializer() {
                return AccountHolder$Type$$serializer.INSTANCE;
            }
        }

        Type(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public AccountHolder() {
        this((Type) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ AccountHolder(int i11, Type type, String str, String str2, q1 q1Var) {
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, AccountHolder$$serializer.INSTANCE.getDescriptor());
        }
        this.type = (i11 & 1) == 0 ? Type.UNKNOWN : type;
        if ((i11 & 2) == 0) {
            this.account = null;
        } else {
            this.account = str;
        }
        if ((i11 & 4) == 0) {
            this.customer = null;
        } else {
            this.customer = str2;
        }
    }

    public static /* synthetic */ AccountHolder copy$default(AccountHolder accountHolder, Type type, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            type = accountHolder.type;
        }
        if ((i11 & 2) != 0) {
            str = accountHolder.account;
        }
        if ((i11 & 4) != 0) {
            str2 = accountHolder.customer;
        }
        return accountHolder.copy(type, str, str2);
    }

    public static /* synthetic */ void getAccount$annotations() {
    }

    public static /* synthetic */ void getCustomer$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self(AccountHolder self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.type != Type.UNKNOWN) {
            output.q(serialDesc, 0, AccountHolder$Type$$serializer.INSTANCE, self.type);
        }
        if (output.k(serialDesc, 1) || self.account != null) {
            output.D(serialDesc, 1, u1.f27647a, self.account);
        }
        if (output.k(serialDesc, 2) || self.customer != null) {
            output.D(serialDesc, 2, u1.f27647a, self.customer);
        }
    }

    public final Type component1() {
        return this.type;
    }

    public final String component2() {
        return this.account;
    }

    public final String component3() {
        return this.customer;
    }

    public final AccountHolder copy(Type type, String str, String str2) {
        s.g(type, "type");
        return new AccountHolder(type, str, str2);
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
        if (obj instanceof AccountHolder) {
            AccountHolder accountHolder = (AccountHolder) obj;
            return this.type == accountHolder.type && s.c(this.account, accountHolder.account) && s.c(this.customer, accountHolder.customer);
        }
        return false;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final Type getType() {
        return this.type;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.account;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customer;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AccountHolder(type=" + this.type + ", account=" + ((Object) this.account) + ", customer=" + ((Object) this.customer) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.type.name());
        out.writeString(this.account);
        out.writeString(this.customer);
    }

    public AccountHolder(Type type, String str, String str2) {
        s.g(type, "type");
        this.type = type;
        this.account = str;
        this.customer = str2;
    }

    public /* synthetic */ AccountHolder(Type type, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Type.UNKNOWN : type, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}