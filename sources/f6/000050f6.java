package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.s0;

/* loaded from: classes6.dex */
public final class ConsumerPaymentDetails implements StripeModel {
    private final List<PaymentDetails> paymentDetails;
    public static final Parcelable.Creator<ConsumerPaymentDetails> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Card extends PaymentDetails {
        public static final String type = "card";
        private final CardBrand brand;
        private final int expiryMonth;
        private final int expiryYear;

        /* renamed from: id */
        private final String f20926id;
        private final boolean isDefault;
        private final String last4;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final p<String, Object> getAddressFromMap(Map<String, ? extends Object> cardPaymentMethodCreateParamsMap) {
                Map l11;
                s.g(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
                Object obj = cardPaymentMethodCreateParamsMap.get("billing_details");
                Map map = obj instanceof Map ? (Map) obj : null;
                Object obj2 = map == null ? null : map.get("address");
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                if (map2 == null) {
                    return null;
                }
                l11 = s0.l(v.a("country_code", map2.get("country")), v.a(PlaceTypes.POSTAL_CODE, map2.get(PlaceTypes.POSTAL_CODE)));
                return v.a("billing_address", l11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), CardBrand.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String id2, boolean z11, int i11, int i12, CardBrand brand, String last4) {
            super(id2, z11, null);
            s.g(id2, "id");
            s.g(brand, "brand");
            s.g(last4, "last4");
            this.f20926id = id2;
            this.isDefault = z11;
            this.expiryYear = i11;
            this.expiryMonth = i12;
            this.brand = brand;
            this.last4 = last4;
        }

        public static /* synthetic */ Card copy$default(Card card, String str, boolean z11, int i11, int i12, CardBrand cardBrand, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = card.getId();
            }
            if ((i13 & 2) != 0) {
                z11 = card.isDefault();
            }
            boolean z12 = z11;
            if ((i13 & 4) != 0) {
                i11 = card.expiryYear;
            }
            int i14 = i11;
            if ((i13 & 8) != 0) {
                i12 = card.expiryMonth;
            }
            int i15 = i12;
            if ((i13 & 16) != 0) {
                cardBrand = card.brand;
            }
            CardBrand cardBrand2 = cardBrand;
            if ((i13 & 32) != 0) {
                str2 = card.last4;
            }
            return card.copy(str, z12, i14, i15, cardBrand2, str2);
        }

        public final String component1() {
            return getId();
        }

        public final boolean component2() {
            return isDefault();
        }

        public final int component3() {
            return this.expiryYear;
        }

        public final int component4() {
            return this.expiryMonth;
        }

        public final CardBrand component5() {
            return this.brand;
        }

        public final String component6() {
            return this.last4;
        }

        public final Card copy(String id2, boolean z11, int i11, int i12, CardBrand brand, String last4) {
            s.g(id2, "id");
            s.g(brand, "brand");
            s.g(last4, "last4");
            return new Card(id2, z11, i11, i12, brand, last4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Card) {
                Card card = (Card) obj;
                return s.c(getId(), card.getId()) && isDefault() == card.isDefault() && this.expiryYear == card.expiryYear && this.expiryMonth == card.expiryMonth && this.brand == card.brand && s.c(this.last4, card.last4);
            }
            return false;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final int getExpiryMonth() {
            return this.expiryMonth;
        }

        public final int getExpiryYear() {
            return this.expiryYear;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public String getId() {
            return this.f20926id;
        }

        public final String getLast4() {
            return this.last4;
        }

        public int hashCode() {
            int hashCode = getId().hashCode() * 31;
            boolean isDefault = isDefault();
            int i11 = isDefault;
            if (isDefault) {
                i11 = 1;
            }
            return ((((((((hashCode + i11) * 31) + Integer.hashCode(this.expiryYear)) * 31) + Integer.hashCode(this.expiryMonth)) * 31) + this.brand.hashCode()) * 31) + this.last4.hashCode();
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetails.PaymentDetails
        public boolean isDefault() {
            return this.isDefault;
        }

        public String toString() {
            return "Card(id=" + getId() + ", isDefault=" + isDefault() + ", expiryYear=" + this.expiryYear + ", expiryMonth=" + this.expiryMonth + ", brand=" + this.brand + ", last4=" + this.last4 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f20926id);
            out.writeInt(this.isDefault ? 1 : 0);
            out.writeInt(this.expiryYear);
            out.writeInt(this.expiryMonth);
            out.writeString(this.brand.name());
            out.writeString(this.last4);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ConsumerPaymentDetails> {
        @Override // android.os.Parcelable.Creator
        public final ConsumerPaymentDetails createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(parcel.readParcelable(ConsumerPaymentDetails.class.getClassLoader()));
            }
            return new ConsumerPaymentDetails(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ConsumerPaymentDetails[] newArray(int i11) {
            return new ConsumerPaymentDetails[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class PaymentDetails implements Parcelable {
        public static final int $stable = 0;

        /* renamed from: id */
        private final String f20927id;
        private final boolean isDefault;

        private PaymentDetails(String str, boolean z11) {
            this.f20927id = str;
            this.isDefault = z11;
        }

        public /* synthetic */ PaymentDetails(String str, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z11);
        }

        public String getId() {
            return this.f20927id;
        }

        public boolean isDefault() {
            return this.isDefault;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumerPaymentDetails(List<? extends PaymentDetails> paymentDetails) {
        s.g(paymentDetails, "paymentDetails");
        this.paymentDetails = paymentDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsumerPaymentDetails copy$default(ConsumerPaymentDetails consumerPaymentDetails, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = consumerPaymentDetails.paymentDetails;
        }
        return consumerPaymentDetails.copy(list);
    }

    public final List<PaymentDetails> component1() {
        return this.paymentDetails;
    }

    public final ConsumerPaymentDetails copy(List<? extends PaymentDetails> paymentDetails) {
        s.g(paymentDetails, "paymentDetails");
        return new ConsumerPaymentDetails(paymentDetails);
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
        return (obj instanceof ConsumerPaymentDetails) && s.c(this.paymentDetails, ((ConsumerPaymentDetails) obj).paymentDetails);
    }

    public final List<PaymentDetails> getPaymentDetails() {
        return this.paymentDetails;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.paymentDetails.hashCode();
    }

    public String toString() {
        return "ConsumerPaymentDetails(paymentDetails=" + this.paymentDetails + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        List<PaymentDetails> list = this.paymentDetails;
        out.writeInt(list.size());
        for (PaymentDetails paymentDetails : list) {
            out.writeParcelable(paymentDetails, i11);
        }
    }
}