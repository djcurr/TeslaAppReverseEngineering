package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class SourceTypeModel implements StripeModel {
    public static final int $stable = 0;

    /* loaded from: classes6.dex */
    public static final class Card extends SourceTypeModel {
        private final String addressLine1Check;
        private final String addressZipCheck;
        private final CardBrand brand;
        private final String country;
        private final String cvcCheck;
        private final String dynamicLast4;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final CardFunding funding;
        private final String last4;
        private final ThreeDSecureStatus threeDSecureStatus;
        private final TokenizationMethod tokenizationMethod;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), CardBrand.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : CardFunding.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TokenizationMethod.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum ThreeDSecureStatus {
            Required("required"),
            Optional("optional"),
            NotSupported("not_supported"),
            Recommended("recommended"),
            Unknown("unknown");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ThreeDSecureStatus fromCode(String str) {
                    ThreeDSecureStatus[] values;
                    for (ThreeDSecureStatus threeDSecureStatus : ThreeDSecureStatus.values()) {
                        if (s.c(threeDSecureStatus.code, str)) {
                            return threeDSecureStatus;
                        }
                    }
                    return null;
                }
            }

            ThreeDSecureStatus(String str) {
                this.code = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }
        }

        public /* synthetic */ Card(String str, String str2, CardBrand cardBrand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, cardBrand, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : num2, (i11 & 256) != 0 ? null : cardFunding, (i11 & 512) != 0 ? null : str6, (i11 & 1024) != 0 ? null : threeDSecureStatus, (i11 & 2048) != 0 ? null : tokenizationMethod);
        }

        public final String component1() {
            return this.addressLine1Check;
        }

        public final String component10() {
            return this.last4;
        }

        public final ThreeDSecureStatus component11() {
            return this.threeDSecureStatus;
        }

        public final TokenizationMethod component12() {
            return this.tokenizationMethod;
        }

        public final String component2() {
            return this.addressZipCheck;
        }

        public final CardBrand component3() {
            return this.brand;
        }

        public final String component4() {
            return this.country;
        }

        public final String component5() {
            return this.cvcCheck;
        }

        public final String component6() {
            return this.dynamicLast4;
        }

        public final Integer component7() {
            return this.expiryMonth;
        }

        public final Integer component8() {
            return this.expiryYear;
        }

        public final CardFunding component9() {
            return this.funding;
        }

        public final Card copy(String str, String str2, CardBrand brand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod) {
            s.g(brand, "brand");
            return new Card(str, str2, brand, str3, str4, str5, num, num2, cardFunding, str6, threeDSecureStatus, tokenizationMethod);
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
            if (obj instanceof Card) {
                Card card = (Card) obj;
                return s.c(this.addressLine1Check, card.addressLine1Check) && s.c(this.addressZipCheck, card.addressZipCheck) && this.brand == card.brand && s.c(this.country, card.country) && s.c(this.cvcCheck, card.cvcCheck) && s.c(this.dynamicLast4, card.dynamicLast4) && s.c(this.expiryMonth, card.expiryMonth) && s.c(this.expiryYear, card.expiryYear) && this.funding == card.funding && s.c(this.last4, card.last4) && this.threeDSecureStatus == card.threeDSecureStatus && this.tokenizationMethod == card.tokenizationMethod;
            }
            return false;
        }

        public final String getAddressLine1Check() {
            return this.addressLine1Check;
        }

        public final String getAddressZipCheck() {
            return this.addressZipCheck;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getCvcCheck() {
            return this.cvcCheck;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public final Integer getExpiryMonth() {
            return this.expiryMonth;
        }

        public final Integer getExpiryYear() {
            return this.expiryYear;
        }

        public final CardFunding getFunding() {
            return this.funding;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final ThreeDSecureStatus getThreeDSecureStatus() {
            return this.threeDSecureStatus;
        }

        public final TokenizationMethod getTokenizationMethod() {
            return this.tokenizationMethod;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.addressLine1Check;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.addressZipCheck;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.brand.hashCode()) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cvcCheck;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.dynamicLast4;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            CardFunding cardFunding = this.funding;
            int hashCode8 = (hashCode7 + (cardFunding == null ? 0 : cardFunding.hashCode())) * 31;
            String str6 = this.last4;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ThreeDSecureStatus threeDSecureStatus = this.threeDSecureStatus;
            int hashCode10 = (hashCode9 + (threeDSecureStatus == null ? 0 : threeDSecureStatus.hashCode())) * 31;
            TokenizationMethod tokenizationMethod = this.tokenizationMethod;
            return hashCode10 + (tokenizationMethod != null ? tokenizationMethod.hashCode() : 0);
        }

        public String toString() {
            return "Card(addressLine1Check=" + ((Object) this.addressLine1Check) + ", addressZipCheck=" + ((Object) this.addressZipCheck) + ", brand=" + this.brand + ", country=" + ((Object) this.country) + ", cvcCheck=" + ((Object) this.cvcCheck) + ", dynamicLast4=" + ((Object) this.dynamicLast4) + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", funding=" + this.funding + ", last4=" + ((Object) this.last4) + ", threeDSecureStatus=" + this.threeDSecureStatus + ", tokenizationMethod=" + this.tokenizationMethod + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.addressLine1Check);
            out.writeString(this.addressZipCheck);
            out.writeString(this.brand.name());
            out.writeString(this.country);
            out.writeString(this.cvcCheck);
            out.writeString(this.dynamicLast4);
            Integer num = this.expiryMonth;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            CardFunding cardFunding = this.funding;
            if (cardFunding == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cardFunding.name());
            }
            out.writeString(this.last4);
            ThreeDSecureStatus threeDSecureStatus = this.threeDSecureStatus;
            if (threeDSecureStatus == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(threeDSecureStatus.name());
            }
            TokenizationMethod tokenizationMethod = this.tokenizationMethod;
            if (tokenizationMethod == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(tokenizationMethod.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, CardBrand brand, String str3, String str4, String str5, Integer num, Integer num2, CardFunding cardFunding, String str6, ThreeDSecureStatus threeDSecureStatus, TokenizationMethod tokenizationMethod) {
            super(null);
            s.g(brand, "brand");
            this.addressLine1Check = str;
            this.addressZipCheck = str2;
            this.brand = brand;
            this.country = str3;
            this.cvcCheck = str4;
            this.dynamicLast4 = str5;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.funding = cardFunding;
            this.last4 = str6;
            this.threeDSecureStatus = threeDSecureStatus;
            this.tokenizationMethod = tokenizationMethod;
        }
    }

    /* loaded from: classes6.dex */
    public static final class SepaDebit extends SourceTypeModel {
        private final String bankCode;
        private final String branchCode;
        private final String country;
        private final String fingerPrint;
        private final String last4;
        private final String mandateReference;
        private final String mandateUrl;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i11) {
                return new SepaDebit[i11];
            }
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerPrint = str4;
            this.last4 = str5;
            this.mandateReference = str6;
            this.mandateUrl = str7;
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sepaDebit.bankCode;
            }
            if ((i11 & 2) != 0) {
                str2 = sepaDebit.branchCode;
            }
            String str8 = str2;
            if ((i11 & 4) != 0) {
                str3 = sepaDebit.country;
            }
            String str9 = str3;
            if ((i11 & 8) != 0) {
                str4 = sepaDebit.fingerPrint;
            }
            String str10 = str4;
            if ((i11 & 16) != 0) {
                str5 = sepaDebit.last4;
            }
            String str11 = str5;
            if ((i11 & 32) != 0) {
                str6 = sepaDebit.mandateReference;
            }
            String str12 = str6;
            if ((i11 & 64) != 0) {
                str7 = sepaDebit.mandateUrl;
            }
            return sepaDebit.copy(str, str8, str9, str10, str11, str12, str7);
        }

        public final String component1() {
            return this.bankCode;
        }

        public final String component2() {
            return this.branchCode;
        }

        public final String component3() {
            return this.country;
        }

        public final String component4() {
            return this.fingerPrint;
        }

        public final String component5() {
            return this.last4;
        }

        public final String component6() {
            return this.mandateReference;
        }

        public final String component7() {
            return this.mandateUrl;
        }

        public final SepaDebit copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            return new SepaDebit(str, str2, str3, str4, str5, str6, str7);
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
            if (obj instanceof SepaDebit) {
                SepaDebit sepaDebit = (SepaDebit) obj;
                return s.c(this.bankCode, sepaDebit.bankCode) && s.c(this.branchCode, sepaDebit.branchCode) && s.c(this.country, sepaDebit.country) && s.c(this.fingerPrint, sepaDebit.fingerPrint) && s.c(this.last4, sepaDebit.last4) && s.c(this.mandateReference, sepaDebit.mandateReference) && s.c(this.mandateUrl, sepaDebit.mandateUrl);
            }
            return false;
        }

        public final String getBankCode() {
            return this.bankCode;
        }

        public final String getBranchCode() {
            return this.branchCode;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getFingerPrint() {
            return this.fingerPrint;
        }

        public final String getLast4() {
            return this.last4;
        }

        public final String getMandateReference() {
            return this.mandateReference;
        }

        public final String getMandateUrl() {
            return this.mandateUrl;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bankCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerPrint;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.mandateReference;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.mandateUrl;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + ((Object) this.bankCode) + ", branchCode=" + ((Object) this.branchCode) + ", country=" + ((Object) this.country) + ", fingerPrint=" + ((Object) this.fingerPrint) + ", last4=" + ((Object) this.last4) + ", mandateReference=" + ((Object) this.mandateReference) + ", mandateUrl=" + ((Object) this.mandateUrl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bankCode);
            out.writeString(this.branchCode);
            out.writeString(this.country);
            out.writeString(this.fingerPrint);
            out.writeString(this.last4);
            out.writeString(this.mandateReference);
            out.writeString(this.mandateUrl);
        }
    }

    private SourceTypeModel() {
    }

    public /* synthetic */ SourceTypeModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}