package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class Card implements StripeModel, StripePaymentSource {
    private final String addressCity;
    private final String addressCountry;
    private final String addressLine1;
    private final String addressLine1Check;
    private final String addressLine2;
    private final String addressState;
    private final String addressZip;
    private final String addressZipCheck;
    private final CardBrand brand;
    private final String country;
    private final String currency;
    private final String customerId;
    private final String cvcCheck;
    private final Integer expMonth;
    private final Integer expYear;
    private final String fingerprint;
    private final CardFunding funding;

    /* renamed from: id  reason: collision with root package name */
    private final String f20925id;
    private final String last4;
    private final String name;
    private final TokenizationMethod tokenizationMethod;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Card> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CardBrand getCardBrand(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -993787207:
                        if (str.equals("Diners Club")) {
                            return CardBrand.DinersClub;
                        }
                        break;
                    case -298759312:
                        if (str.equals("American Express")) {
                            return CardBrand.AmericanExpress;
                        }
                        break;
                    case -231891079:
                        if (str.equals("UnionPay")) {
                            return CardBrand.UnionPay;
                        }
                        break;
                    case -46205774:
                        if (str.equals("MasterCard")) {
                            return CardBrand.MasterCard;
                        }
                        break;
                    case 73257:
                        if (str.equals("JCB")) {
                            return CardBrand.JCB;
                        }
                        break;
                    case 2666593:
                        if (str.equals("Visa")) {
                            return CardBrand.Visa;
                        }
                        break;
                    case 337828873:
                        if (str.equals("Discover")) {
                            return CardBrand.Discover;
                        }
                        break;
                }
            }
            return CardBrand.Unknown;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Card> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Card createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Card(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CardFunding.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TokenizationMethod.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Card[] newArray(int i11) {
            return new Card[i11];
        }
    }

    public Card(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand brand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod) {
        s.g(brand, "brand");
        this.expMonth = num;
        this.expYear = num2;
        this.name = str;
        this.addressLine1 = str2;
        this.addressLine1Check = str3;
        this.addressLine2 = str4;
        this.addressCity = str5;
        this.addressState = str6;
        this.addressZip = str7;
        this.addressZipCheck = str8;
        this.addressCountry = str9;
        this.last4 = str10;
        this.brand = brand;
        this.funding = cardFunding;
        this.fingerprint = str11;
        this.country = str12;
        this.currency = str13;
        this.customerId = str14;
        this.cvcCheck = str15;
        this.f20925id = str16;
        this.tokenizationMethod = tokenizationMethod;
    }

    public final Integer component1() {
        return this.expMonth;
    }

    public final String component10() {
        return this.addressZipCheck;
    }

    public final String component11() {
        return this.addressCountry;
    }

    public final String component12() {
        return this.last4;
    }

    public final CardBrand component13() {
        return this.brand;
    }

    public final CardFunding component14() {
        return this.funding;
    }

    public final String component15() {
        return this.fingerprint;
    }

    public final String component16() {
        return this.country;
    }

    public final String component17() {
        return this.currency;
    }

    public final String component18() {
        return this.customerId;
    }

    public final String component19() {
        return this.cvcCheck;
    }

    public final Integer component2() {
        return this.expYear;
    }

    public final String component20() {
        return getId();
    }

    public final TokenizationMethod component21() {
        return this.tokenizationMethod;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.addressLine1;
    }

    public final String component5() {
        return this.addressLine1Check;
    }

    public final String component6() {
        return this.addressLine2;
    }

    public final String component7() {
        return this.addressCity;
    }

    public final String component8() {
        return this.addressState;
    }

    public final String component9() {
        return this.addressZip;
    }

    public final Card copy(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand brand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod) {
        s.g(brand, "brand");
        return new Card(num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, brand, cardFunding, str11, str12, str13, str14, str15, str16, tokenizationMethod);
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
            return s.c(this.expMonth, card.expMonth) && s.c(this.expYear, card.expYear) && s.c(this.name, card.name) && s.c(this.addressLine1, card.addressLine1) && s.c(this.addressLine1Check, card.addressLine1Check) && s.c(this.addressLine2, card.addressLine2) && s.c(this.addressCity, card.addressCity) && s.c(this.addressState, card.addressState) && s.c(this.addressZip, card.addressZip) && s.c(this.addressZipCheck, card.addressZipCheck) && s.c(this.addressCountry, card.addressCountry) && s.c(this.last4, card.last4) && this.brand == card.brand && this.funding == card.funding && s.c(this.fingerprint, card.fingerprint) && s.c(this.country, card.country) && s.c(this.currency, card.currency) && s.c(this.customerId, card.customerId) && s.c(this.cvcCheck, card.cvcCheck) && s.c(getId(), card.getId()) && this.tokenizationMethod == card.tokenizationMethod;
        }
        return false;
    }

    public final String getAddressCity() {
        return this.addressCity;
    }

    public final String getAddressCountry() {
        return this.addressCountry;
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine1Check() {
        return this.addressLine1Check;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAddressState() {
        return this.addressState;
    }

    public final String getAddressZip() {
        return this.addressZip;
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

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCvcCheck() {
        return this.cvcCheck;
    }

    public final Integer getExpMonth() {
        return this.expMonth;
    }

    public final Integer getExpYear() {
        return this.expYear;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final CardFunding getFunding() {
        return this.funding;
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.f20925id;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getName() {
        return this.name;
    }

    public final TokenizationMethod getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        Integer num = this.expMonth;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expYear;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine1;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1Check;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressCity;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressState;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressZip;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressZipCheck;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressCountry;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.last4;
        int hashCode12 = (((hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.brand.hashCode()) * 31;
        CardFunding cardFunding = this.funding;
        int hashCode13 = (hashCode12 + (cardFunding == null ? 0 : cardFunding.hashCode())) * 31;
        String str11 = this.fingerprint;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.country;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currency;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.customerId;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.cvcCheck;
        int hashCode18 = (((hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        return hashCode18 + (tokenizationMethod != null ? tokenizationMethod.hashCode() : 0);
    }

    public String toString() {
        return "Card(expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", name=" + ((Object) this.name) + ", addressLine1=" + ((Object) this.addressLine1) + ", addressLine1Check=" + ((Object) this.addressLine1Check) + ", addressLine2=" + ((Object) this.addressLine2) + ", addressCity=" + ((Object) this.addressCity) + ", addressState=" + ((Object) this.addressState) + ", addressZip=" + ((Object) this.addressZip) + ", addressZipCheck=" + ((Object) this.addressZipCheck) + ", addressCountry=" + ((Object) this.addressCountry) + ", last4=" + ((Object) this.last4) + ", brand=" + this.brand + ", funding=" + this.funding + ", fingerprint=" + ((Object) this.fingerprint) + ", country=" + ((Object) this.country) + ", currency=" + ((Object) this.currency) + ", customerId=" + ((Object) this.customerId) + ", cvcCheck=" + ((Object) this.cvcCheck) + ", id=" + ((Object) getId()) + ", tokenizationMethod=" + this.tokenizationMethod + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        Integer num = this.expMonth;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.expYear;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.name);
        out.writeString(this.addressLine1);
        out.writeString(this.addressLine1Check);
        out.writeString(this.addressLine2);
        out.writeString(this.addressCity);
        out.writeString(this.addressState);
        out.writeString(this.addressZip);
        out.writeString(this.addressZipCheck);
        out.writeString(this.addressCountry);
        out.writeString(this.last4);
        out.writeString(this.brand.name());
        CardFunding cardFunding = this.funding;
        if (cardFunding == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cardFunding.name());
        }
        out.writeString(this.fingerprint);
        out.writeString(this.country);
        out.writeString(this.currency);
        out.writeString(this.customerId);
        out.writeString(this.cvcCheck);
        out.writeString(this.f20925id);
        TokenizationMethod tokenizationMethod = this.tokenizationMethod;
        if (tokenizationMethod == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(tokenizationMethod.name());
    }

    public /* synthetic */ Card(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardBrand cardBrand, CardFunding cardFunding, String str11, String str12, String str13, String str14, String str15, String str16, TokenizationMethod tokenizationMethod, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : str10, cardBrand, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : cardFunding, (i11 & 16384) != 0 ? null : str11, (32768 & i11) != 0 ? null : str12, (65536 & i11) != 0 ? null : str13, (131072 & i11) != 0 ? null : str14, (262144 & i11) != 0 ? null : str15, str16, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : tokenizationMethod);
    }
}