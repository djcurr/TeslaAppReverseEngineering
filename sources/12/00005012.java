package com.stripe.android.link.ui.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.forms.CardSpecKt;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public abstract class SupportedPaymentMethod implements Parcelable {
    private final LayoutSpec formSpec;
    private final PaymentMethod.Type type;

    /* loaded from: classes6.dex */
    public static final class Card extends SupportedPaymentMethod {
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return new Card();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        public Card() {
            super(PaymentMethod.Type.Card, CardSpecKt.getLinkCardForm(), null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod
        public Map<String, Map<String, Object>> extraConfirmationParams(PaymentMethodCreateParams paymentMethodCreateParams) {
            Map f11;
            Map<String, Map<String, Object>> f12;
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            Object obj = paymentMethodCreateParams.toParamMap().get("card");
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map == null) {
                return null;
            }
            f11 = r0.f(v.a("cvc", map.get("cvc")));
            f12 = r0.f(v.a("card", f11));
            return f12;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }

        @Override // com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod
        public ConsumerPaymentDetailsCreateParams.Card createParams(PaymentMethodCreateParams paymentMethodCreateParams, String email) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(email, "email");
            return new ConsumerPaymentDetailsCreateParams.Card(paymentMethodCreateParams.toParamMap(), email);
        }
    }

    private SupportedPaymentMethod(PaymentMethod.Type type, LayoutSpec layoutSpec) {
        this.type = type;
        this.formSpec = layoutSpec;
    }

    public /* synthetic */ SupportedPaymentMethod(PaymentMethod.Type type, LayoutSpec layoutSpec, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, layoutSpec);
    }

    public abstract ConsumerPaymentDetailsCreateParams createParams(PaymentMethodCreateParams paymentMethodCreateParams, String str);

    public Map<String, Object> extraConfirmationParams(PaymentMethodCreateParams paymentMethodCreateParams) {
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        return null;
    }

    public final LayoutSpec getFormSpec() {
        return this.formSpec;
    }

    public final PaymentMethod.Type getType() {
        return this.type;
    }
}