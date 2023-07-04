package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Token;
import ezvcard.property.Kind;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class BankAccountTokenParams extends TokenParams {
    @Deprecated
    private static final String PARAM_ACCOUNT_HOLDER_NAME = "account_holder_name";
    @Deprecated
    private static final String PARAM_ACCOUNT_HOLDER_TYPE = "account_holder_type";
    @Deprecated
    private static final String PARAM_ACCOUNT_NUMBER = "account_number";
    @Deprecated
    private static final String PARAM_COUNTRY = "country";
    @Deprecated
    private static final String PARAM_CURRENCY = "currency";
    @Deprecated
    private static final String PARAM_ROUTING_NUMBER = "routing_number";
    private final String accountHolderName;
    private final Type accountHolderType;
    private final String accountNumber;
    private final String country;
    private final String currency;
    private final String routingNumber;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BankAccountTokenParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<BankAccountTokenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccountTokenParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new BankAccountTokenParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankAccountTokenParams[] newArray(int i11) {
            return new BankAccountTokenParams[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum Type {
        Individual(Kind.INDIVIDUAL),
        Company("company");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Type fromCode$payments_core_release(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (s.c(type.getCode$payments_core_release(), str)) {
                        return type;
                    }
                }
                return null;
            }
        }

        Type(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String country, String currency, String accountNumber) {
        this(country, currency, accountNumber, null, null, null, 56, null);
        s.g(country, "country");
        s.g(currency, "currency");
        s.g(accountNumber, "accountNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type) {
        this(country, currency, accountNumber, type, null, null, 48, null);
        s.g(country, "country");
        s.g(currency, "currency");
        s.g(accountNumber, "accountNumber");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type, String str) {
        this(country, currency, accountNumber, type, str, null, 32, null);
        s.g(country, "country");
        s.g(currency, "currency");
        s.g(accountNumber, "accountNumber");
    }

    public /* synthetic */ BankAccountTokenParams(String str, String str2, String str3, Type type, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : type, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5);
    }

    private final String component1() {
        return this.country;
    }

    private final String component2() {
        return this.currency;
    }

    private final String component3() {
        return this.accountNumber;
    }

    private final Type component4() {
        return this.accountHolderType;
    }

    private final String component5() {
        return this.accountHolderName;
    }

    private final String component6() {
        return this.routingNumber;
    }

    public static /* synthetic */ BankAccountTokenParams copy$default(BankAccountTokenParams bankAccountTokenParams, String str, String str2, String str3, Type type, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bankAccountTokenParams.country;
        }
        if ((i11 & 2) != 0) {
            str2 = bankAccountTokenParams.currency;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = bankAccountTokenParams.accountNumber;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            type = bankAccountTokenParams.accountHolderType;
        }
        Type type2 = type;
        if ((i11 & 16) != 0) {
            str4 = bankAccountTokenParams.accountHolderName;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            str5 = bankAccountTokenParams.routingNumber;
        }
        return bankAccountTokenParams.copy(str, str6, str7, type2, str8, str5);
    }

    public final BankAccountTokenParams copy(String country, String currency, String accountNumber, Type type, String str, String str2) {
        s.g(country, "country");
        s.g(currency, "currency");
        s.g(accountNumber, "accountNumber");
        return new BankAccountTokenParams(country, currency, accountNumber, type, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BankAccountTokenParams) {
            BankAccountTokenParams bankAccountTokenParams = (BankAccountTokenParams) obj;
            return s.c(this.country, bankAccountTokenParams.country) && s.c(this.currency, bankAccountTokenParams.currency) && s.c(this.accountNumber, bankAccountTokenParams.accountNumber) && this.accountHolderType == bankAccountTokenParams.accountHolderType && s.c(this.accountHolderName, bankAccountTokenParams.accountHolderName) && s.c(this.routingNumber, bankAccountTokenParams.routingNumber);
        }
        return false;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        List<p> l11;
        Map<String, Object> i11;
        p[] pVarArr = new p[6];
        pVarArr[0] = v.a("country", this.country);
        pVarArr[1] = v.a(PARAM_CURRENCY, this.currency);
        pVarArr[2] = v.a(PARAM_ACCOUNT_HOLDER_NAME, this.accountHolderName);
        Type type = this.accountHolderType;
        pVarArr[3] = v.a(PARAM_ACCOUNT_HOLDER_TYPE, type == null ? null : type.getCode$payments_core_release());
        pVarArr[4] = v.a(PARAM_ROUTING_NUMBER, this.routingNumber);
        pVarArr[5] = v.a(PARAM_ACCOUNT_NUMBER, this.accountNumber);
        l11 = w.l(pVarArr);
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

    public int hashCode() {
        int hashCode = ((((this.country.hashCode() * 31) + this.currency.hashCode()) * 31) + this.accountNumber.hashCode()) * 31;
        Type type = this.accountHolderType;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        String str = this.accountHolderName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BankAccountTokenParams(country=" + this.country + ", currency=" + this.currency + ", accountNumber=" + this.accountNumber + ", accountHolderType=" + this.accountHolderType + ", accountHolderName=" + ((Object) this.accountHolderName) + ", routingNumber=" + ((Object) this.routingNumber) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.country);
        out.writeString(this.currency);
        out.writeString(this.accountNumber);
        Type type = this.accountHolderType;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(type.name());
        }
        out.writeString(this.accountHolderName);
        out.writeString(this.routingNumber);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccountTokenParams(String country, String currency, String accountNumber, Type type, String str, String str2) {
        super(Token.Type.BankAccount, null, 2, null);
        s.g(country, "country");
        s.g(currency, "currency");
        s.g(accountNumber, "accountNumber");
        this.country = country;
        this.currency = currency;
        this.accountNumber = accountNumber;
        this.accountHolderType = type;
        this.accountHolderName = str;
        this.routingNumber = str2;
    }
}