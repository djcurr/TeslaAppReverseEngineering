package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.e0;
import wz.r0;
import wz.s0;
import wz.x0;

/* loaded from: classes6.dex */
public abstract class ConsumerPaymentDetailsCreateParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    private final PaymentMethod.Type type;

    /* loaded from: classes6.dex */
    public static final class Card extends ConsumerPaymentDetailsCreateParams {
        private final Map<String, Object> cardPaymentMethodCreateParamsMap;
        private final String email;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(Card.class.getClassLoader()));
                }
                return new Card(linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(Map<String, ? extends Object> cardPaymentMethodCreateParamsMap, String email) {
            super(PaymentMethod.Type.Card, null);
            s.g(cardPaymentMethodCreateParamsMap, "cardPaymentMethodCreateParamsMap");
            s.g(email, "email");
            this.cardPaymentMethodCreateParamsMap = cardPaymentMethodCreateParamsMap;
            this.email = email;
        }

        private final Map<String, Object> convertParamsMap() {
            Map y11;
            Set i11;
            boolean T;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("billing_email_address", this.email);
            p<String, Object> addressFromMap = ConsumerPaymentDetails.Card.Companion.getAddressFromMap(this.cardPaymentMethodCreateParamsMap);
            if (addressFromMap != null) {
                linkedHashMap.put(addressFromMap.c(), addressFromMap.d());
            }
            Object obj = this.cardPaymentMethodCreateParamsMap.get("card");
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map != null) {
                y11 = s0.y(map);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : y11.entrySet()) {
                    Object key = entry.getKey();
                    i11 = x0.i("number", "exp_month", "exp_year");
                    T = e0.T(i11, key);
                    if (T) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.put("card", linkedHashMap2);
            }
            return linkedHashMap;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.model.ConsumerPaymentDetailsCreateParams, com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> p11;
            p11 = s0.p(super.toParamMap(), convertParamsMap());
            return p11;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Map<String, Object> map = this.cardPaymentMethodCreateParamsMap;
            out.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeValue(entry.getValue());
            }
            out.writeString(this.email);
        }
    }

    private ConsumerPaymentDetailsCreateParams(PaymentMethod.Type type) {
        this.type = type;
    }

    public /* synthetic */ ConsumerPaymentDetailsCreateParams(PaymentMethod.Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    public final PaymentMethod.Type getType$payments_core_release() {
        return this.type;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map<String, Object> f11;
        f11 = r0.f(v.a("type", this.type.code));
        return f11;
    }
}