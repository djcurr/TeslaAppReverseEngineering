package com.stripe.android.payments.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class CollectBankAccountConfiguration implements Parcelable {
    public static final int $stable = 0;

    /* loaded from: classes6.dex */
    public static final class USBankAccount extends CollectBankAccountConfiguration {
        private final String email;
        private final String name;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new USBankAccount(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i11) {
                return new USBankAccount[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public USBankAccount(String name, String str) {
            super(null);
            s.g(name, "name");
            this.name = name;
            this.email = str;
        }

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uSBankAccount.name;
            }
            if ((i11 & 2) != 0) {
                str2 = uSBankAccount.email;
            }
            return uSBankAccount.copy(str, str2);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.email;
        }

        public final USBankAccount copy(String name, String str) {
            s.g(name, "name");
            return new USBankAccount(name, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof USBankAccount) {
                USBankAccount uSBankAccount = (USBankAccount) obj;
                return s.c(this.name, uSBankAccount.name) && s.c(this.email, uSBankAccount.email);
            }
            return false;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.email;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "USBankAccount(name=" + this.name + ", email=" + ((Object) this.email) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
            out.writeString(this.email);
        }
    }

    private CollectBankAccountConfiguration() {
    }

    public /* synthetic */ CollectBankAccountConfiguration(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}