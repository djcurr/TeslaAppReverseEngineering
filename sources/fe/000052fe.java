package com.stripe.android.model.wallets;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Address;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class Wallet implements StripeModel {
    public static final int $stable = 0;
    private final Type walletType;

    /* loaded from: classes6.dex */
    public static final class AmexExpressCheckoutWallet extends Wallet {
        private final String dynamicLast4;
        public static final Parcelable.Creator<AmexExpressCheckoutWallet> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<AmexExpressCheckoutWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AmexExpressCheckoutWallet createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new AmexExpressCheckoutWallet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AmexExpressCheckoutWallet[] newArray(int i11) {
                return new AmexExpressCheckoutWallet[i11];
            }
        }

        public AmexExpressCheckoutWallet(String str) {
            super(Type.AmexExpressCheckout, null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ AmexExpressCheckoutWallet copy$default(AmexExpressCheckoutWallet amexExpressCheckoutWallet, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = amexExpressCheckoutWallet.dynamicLast4;
            }
            return amexExpressCheckoutWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final AmexExpressCheckoutWallet copy(String str) {
            return new AmexExpressCheckoutWallet(str);
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
            return (obj instanceof AmexExpressCheckoutWallet) && s.c(this.dynamicLast4, ((AmexExpressCheckoutWallet) obj).dynamicLast4);
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AmexExpressCheckoutWallet(dynamicLast4=" + ((Object) this.dynamicLast4) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.dynamicLast4);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ApplePayWallet extends Wallet {
        private final String dynamicLast4;
        public static final Parcelable.Creator<ApplePayWallet> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ApplePayWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApplePayWallet createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new ApplePayWallet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApplePayWallet[] newArray(int i11) {
                return new ApplePayWallet[i11];
            }
        }

        public ApplePayWallet(String str) {
            super(Type.ApplePay, null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ ApplePayWallet copy$default(ApplePayWallet applePayWallet, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = applePayWallet.dynamicLast4;
            }
            return applePayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final ApplePayWallet copy(String str) {
            return new ApplePayWallet(str);
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
            return (obj instanceof ApplePayWallet) && s.c(this.dynamicLast4, ((ApplePayWallet) obj).dynamicLast4);
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ApplePayWallet(dynamicLast4=" + ((Object) this.dynamicLast4) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.dynamicLast4);
        }
    }

    /* loaded from: classes6.dex */
    public static final class GooglePayWallet extends Wallet implements Parcelable {
        private final String dynamicLast4;
        public static final Parcelable.Creator<GooglePayWallet> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<GooglePayWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayWallet createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new GooglePayWallet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayWallet[] newArray(int i11) {
                return new GooglePayWallet[i11];
            }
        }

        public GooglePayWallet(String str) {
            super(Type.GooglePay, null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ GooglePayWallet copy$default(GooglePayWallet googlePayWallet, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = googlePayWallet.dynamicLast4;
            }
            return googlePayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final GooglePayWallet copy(String str) {
            return new GooglePayWallet(str);
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
            return (obj instanceof GooglePayWallet) && s.c(this.dynamicLast4, ((GooglePayWallet) obj).dynamicLast4);
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "GooglePayWallet(dynamicLast4=" + ((Object) this.dynamicLast4) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.dynamicLast4);
        }
    }

    /* loaded from: classes6.dex */
    public static final class MasterpassWallet extends Wallet {
        public static final int $stable = 0;
        public static final Parcelable.Creator<MasterpassWallet> CREATOR = new Creator();
        private final Address billingAddress;
        private final String email;
        private final String name;
        private final Address shippingAddress;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<MasterpassWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MasterpassWallet createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new MasterpassWallet(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MasterpassWallet[] newArray(int i11) {
                return new MasterpassWallet[i11];
            }
        }

        public MasterpassWallet(Address address, String str, String str2, Address address2) {
            super(Type.Masterpass, null);
            this.billingAddress = address;
            this.email = str;
            this.name = str2;
            this.shippingAddress = address2;
        }

        public static /* synthetic */ MasterpassWallet copy$default(MasterpassWallet masterpassWallet, Address address, String str, String str2, Address address2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                address = masterpassWallet.billingAddress;
            }
            if ((i11 & 2) != 0) {
                str = masterpassWallet.email;
            }
            if ((i11 & 4) != 0) {
                str2 = masterpassWallet.name;
            }
            if ((i11 & 8) != 0) {
                address2 = masterpassWallet.shippingAddress;
            }
            return masterpassWallet.copy(address, str, str2, address2);
        }

        public final Address component1() {
            return this.billingAddress;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final Address component4() {
            return this.shippingAddress;
        }

        public final MasterpassWallet copy(Address address, String str, String str2, Address address2) {
            return new MasterpassWallet(address, str, str2, address2);
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
            if (obj instanceof MasterpassWallet) {
                MasterpassWallet masterpassWallet = (MasterpassWallet) obj;
                return s.c(this.billingAddress, masterpassWallet.billingAddress) && s.c(this.email, masterpassWallet.email) && s.c(this.name, masterpassWallet.name) && s.c(this.shippingAddress, masterpassWallet.shippingAddress);
            }
            return false;
        }

        public final Address getBillingAddress() {
            return this.billingAddress;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final Address getShippingAddress() {
            return this.shippingAddress;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.billingAddress;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address2 = this.shippingAddress;
            return hashCode3 + (address2 != null ? address2.hashCode() : 0);
        }

        public String toString() {
            return "MasterpassWallet(billingAddress=" + this.billingAddress + ", email=" + ((Object) this.email) + ", name=" + ((Object) this.name) + ", shippingAddress=" + this.shippingAddress + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Address address = this.billingAddress;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i11);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            Address address2 = this.shippingAddress;
            if (address2 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            address2.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class SamsungPayWallet extends Wallet {
        private final String dynamicLast4;
        public static final Parcelable.Creator<SamsungPayWallet> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<SamsungPayWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SamsungPayWallet createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new SamsungPayWallet(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SamsungPayWallet[] newArray(int i11) {
                return new SamsungPayWallet[i11];
            }
        }

        public SamsungPayWallet(String str) {
            super(Type.SamsungPay, null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ SamsungPayWallet copy$default(SamsungPayWallet samsungPayWallet, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = samsungPayWallet.dynamicLast4;
            }
            return samsungPayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final SamsungPayWallet copy(String str) {
            return new SamsungPayWallet(str);
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
            return (obj instanceof SamsungPayWallet) && s.c(this.dynamicLast4, ((SamsungPayWallet) obj).dynamicLast4);
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.dynamicLast4;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SamsungPayWallet(dynamicLast4=" + ((Object) this.dynamicLast4) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.dynamicLast4);
        }
    }

    /* loaded from: classes6.dex */
    public enum Type {
        AmexExpressCheckout("amex_express_checkout"),
        ApplePay("apple_pay"),
        GooglePay("google_pay"),
        Masterpass("master_pass"),
        SamsungPay("samsung_pay"),
        VisaCheckout("visa_checkout");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromCode$payments_core_release(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (s.c(type.getCode(), str)) {
                        return type;
                    }
                }
                return null;
            }
        }

        Type(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* loaded from: classes6.dex */
    public static final class VisaCheckoutWallet extends Wallet {
        public static final int $stable = 0;
        public static final Parcelable.Creator<VisaCheckoutWallet> CREATOR = new Creator();
        private final Address billingAddress;
        private final String dynamicLast4;
        private final String email;
        private final String name;
        private final Address shippingAddress;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<VisaCheckoutWallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VisaCheckoutWallet createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new VisaCheckoutWallet(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VisaCheckoutWallet[] newArray(int i11) {
                return new VisaCheckoutWallet[i11];
            }
        }

        public VisaCheckoutWallet(Address address, String str, String str2, Address address2, String str3) {
            super(Type.VisaCheckout, null);
            this.billingAddress = address;
            this.email = str;
            this.name = str2;
            this.shippingAddress = address2;
            this.dynamicLast4 = str3;
        }

        public static /* synthetic */ VisaCheckoutWallet copy$default(VisaCheckoutWallet visaCheckoutWallet, Address address, String str, String str2, Address address2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                address = visaCheckoutWallet.billingAddress;
            }
            if ((i11 & 2) != 0) {
                str = visaCheckoutWallet.email;
            }
            String str4 = str;
            if ((i11 & 4) != 0) {
                str2 = visaCheckoutWallet.name;
            }
            String str5 = str2;
            if ((i11 & 8) != 0) {
                address2 = visaCheckoutWallet.shippingAddress;
            }
            Address address3 = address2;
            if ((i11 & 16) != 0) {
                str3 = visaCheckoutWallet.dynamicLast4;
            }
            return visaCheckoutWallet.copy(address, str4, str5, address3, str3);
        }

        public final Address component1() {
            return this.billingAddress;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final Address component4() {
            return this.shippingAddress;
        }

        public final String component5() {
            return this.dynamicLast4;
        }

        public final VisaCheckoutWallet copy(Address address, String str, String str2, Address address2, String str3) {
            return new VisaCheckoutWallet(address, str, str2, address2, str3);
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
            if (obj instanceof VisaCheckoutWallet) {
                VisaCheckoutWallet visaCheckoutWallet = (VisaCheckoutWallet) obj;
                return s.c(this.billingAddress, visaCheckoutWallet.billingAddress) && s.c(this.email, visaCheckoutWallet.email) && s.c(this.name, visaCheckoutWallet.name) && s.c(this.shippingAddress, visaCheckoutWallet.shippingAddress) && s.c(this.dynamicLast4, visaCheckoutWallet.dynamicLast4);
            }
            return false;
        }

        public final Address getBillingAddress() {
            return this.billingAddress;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final Address getShippingAddress() {
            return this.shippingAddress;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.billingAddress;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Address address2 = this.shippingAddress;
            int hashCode4 = (hashCode3 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str3 = this.dynamicLast4;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "VisaCheckoutWallet(billingAddress=" + this.billingAddress + ", email=" + ((Object) this.email) + ", name=" + ((Object) this.name) + ", shippingAddress=" + this.shippingAddress + ", dynamicLast4=" + ((Object) this.dynamicLast4) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Address address = this.billingAddress;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i11);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            Address address2 = this.shippingAddress;
            if (address2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address2.writeToParcel(out, i11);
            }
            out.writeString(this.dynamicLast4);
        }
    }

    private Wallet(Type type) {
        this.walletType = type;
    }

    public /* synthetic */ Wallet(Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    public final Type getWalletType$payments_core_release() {
        return this.walletType;
    }
}