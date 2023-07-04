package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.ConsumerPaymentDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;

/* loaded from: classes6.dex */
public abstract class ConsumerPaymentDetailsUpdateParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;

    /* loaded from: classes6.dex */
    public static final class Card extends ConsumerPaymentDetailsUpdateParams {
        private final PaymentMethodCreateParams cardPaymentMethodCreateParams;

        /* renamed from: id  reason: collision with root package name */
        private final String f20928id;
        private final Boolean isDefault;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                Boolean valueOf;
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Card(readString, valueOf, parcel.readInt() != 0 ? PaymentMethodCreateParams.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        public /* synthetic */ Card(String str, Boolean bool, PaymentMethodCreateParams paymentMethodCreateParams, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : paymentMethodCreateParams);
        }

        public static /* synthetic */ Card copy$default(Card card, String str, Boolean bool, PaymentMethodCreateParams paymentMethodCreateParams, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = card.getId();
            }
            if ((i11 & 2) != 0) {
                bool = card.isDefault;
            }
            if ((i11 & 4) != 0) {
                paymentMethodCreateParams = card.cardPaymentMethodCreateParams;
            }
            return card.copy(str, bool, paymentMethodCreateParams);
        }

        public final String component1() {
            return getId();
        }

        public final Boolean component2() {
            return this.isDefault;
        }

        public final PaymentMethodCreateParams component3() {
            return this.cardPaymentMethodCreateParams;
        }

        public final Card copy(String id2, Boolean bool, PaymentMethodCreateParams paymentMethodCreateParams) {
            s.g(id2, "id");
            return new Card(id2, bool, paymentMethodCreateParams);
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
                return s.c(getId(), card.getId()) && s.c(this.isDefault, card.isDefault) && s.c(this.cardPaymentMethodCreateParams, card.cardPaymentMethodCreateParams);
            }
            return false;
        }

        public final PaymentMethodCreateParams getCardPaymentMethodCreateParams() {
            return this.cardPaymentMethodCreateParams;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetailsUpdateParams
        public String getId() {
            return this.f20928id;
        }

        public int hashCode() {
            int hashCode = getId().hashCode() * 31;
            Boolean bool = this.isDefault;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            PaymentMethodCreateParams paymentMethodCreateParams = this.cardPaymentMethodCreateParams;
            return hashCode2 + (paymentMethodCreateParams != null ? paymentMethodCreateParams.hashCode() : 0);
        }

        public final Boolean isDefault() {
            return this.isDefault;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, ? extends Object> paramMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = this.isDefault;
            if (bool != null) {
                linkedHashMap.put("is_default", Boolean.valueOf(bool.booleanValue()));
            }
            PaymentMethodCreateParams paymentMethodCreateParams = this.cardPaymentMethodCreateParams;
            if (paymentMethodCreateParams != null && (paramMap = paymentMethodCreateParams.toParamMap()) != null) {
                Object obj = paramMap.get("card");
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map != null) {
                    Object obj2 = map.get("exp_month");
                    if (obj2 != null) {
                        linkedHashMap.put("exp_month", obj2);
                    }
                    Object obj3 = map.get("exp_year");
                    if (obj3 != null) {
                        linkedHashMap.put("exp_year", obj3);
                    }
                }
                p<String, Object> addressFromMap = ConsumerPaymentDetails.Card.Companion.getAddressFromMap(paramMap);
                if (addressFromMap != null) {
                    linkedHashMap.put(addressFromMap.c(), addressFromMap.d());
                }
            }
            return linkedHashMap;
        }

        public String toString() {
            return "Card(id=" + getId() + ", isDefault=" + this.isDefault + ", cardPaymentMethodCreateParams=" + this.cardPaymentMethodCreateParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f20928id);
            Boolean bool = this.isDefault;
            if (bool == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool.booleanValue() ? 1 : 0);
            }
            PaymentMethodCreateParams paymentMethodCreateParams = this.cardPaymentMethodCreateParams;
            if (paymentMethodCreateParams == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            paymentMethodCreateParams.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String id2, Boolean bool, PaymentMethodCreateParams paymentMethodCreateParams) {
            super(null);
            s.g(id2, "id");
            this.f20928id = id2;
            this.isDefault = bool;
            this.cardPaymentMethodCreateParams = paymentMethodCreateParams;
        }
    }

    private ConsumerPaymentDetailsUpdateParams() {
    }

    public /* synthetic */ ConsumerPaymentDetailsUpdateParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getId();
}