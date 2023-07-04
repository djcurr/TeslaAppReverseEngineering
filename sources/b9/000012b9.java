package com.adyen.checkout.components.model.connection;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.core.exception.ModelSerializationException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;
import wz.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001d\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/adyen/checkout/components/model/connection/OrderStatusResponse;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", "Lcom/adyen/checkout/components/model/connection/OrderPaymentMethod;", "component1", "Lcom/adyen/checkout/components/model/payments/Amount;", "component2", OrderStatusResponse.PAYMENT_METHODS, OrderStatusResponse.REMAINING_AMOUNT, "copy", "", "toString", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "Lcom/adyen/checkout/components/model/payments/Amount;", "getRemainingAmount", "()Lcom/adyen/checkout/components/model/payments/Amount;", "<init>", "(Ljava/util/List;Lcom/adyen/checkout/components/model/payments/Amount;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class OrderStatusResponse extends c {
    private static final String PAYMENT_METHODS = "paymentMethods";
    private static final String REMAINING_AMOUNT = "remainingAmount";
    private final List<OrderPaymentMethod> paymentMethods;
    private final Amount remainingAmount;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<OrderStatusResponse> CREATOR = new c.a(OrderStatusResponse.class);
    private static final c.b<OrderStatusResponse> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<OrderStatusResponse> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public OrderStatusResponse a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                List c11 = d.c(jsonObject.optJSONArray(OrderStatusResponse.PAYMENT_METHODS), OrderPaymentMethod.Companion.a());
                if (c11 == null) {
                    c11 = w.i();
                }
                Amount amount = (Amount) d.b(jsonObject.optJSONObject(OrderStatusResponse.REMAINING_AMOUNT), Amount.SERIALIZER);
                if (amount == null) {
                    amount = Amount.EMPTY;
                }
                s.f(amount, "ModelUtils.deserializeOpt(\n                            jsonObject.optJSONObject(REMAINING_AMOUNT),\n                            Amount.SERIALIZER\n                        ) ?: Amount.EMPTY");
                return new OrderStatusResponse(c11, amount);
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderStatusResponse.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(OrderStatusResponse modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(OrderStatusResponse.PAYMENT_METHODS, d.f(modelObject.getPaymentMethods(), OrderPaymentMethod.Companion.a()));
                jSONObject.putOpt(OrderStatusResponse.REMAINING_AMOUNT, modelObject.getRemainingAmount());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderStatusResponse.class, e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c.b<OrderStatusResponse> a() {
            return OrderStatusResponse.SERIALIZER;
        }
    }

    public OrderStatusResponse(List<OrderPaymentMethod> paymentMethods, Amount remainingAmount) {
        s.g(paymentMethods, "paymentMethods");
        s.g(remainingAmount, "remainingAmount");
        this.paymentMethods = paymentMethods;
        this.remainingAmount = remainingAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderStatusResponse copy$default(OrderStatusResponse orderStatusResponse, List list, Amount amount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderStatusResponse.paymentMethods;
        }
        if ((i11 & 2) != 0) {
            amount = orderStatusResponse.remainingAmount;
        }
        return orderStatusResponse.copy(list, amount);
    }

    public static final c.b<OrderStatusResponse> getSERIALIZER() {
        return Companion.a();
    }

    public final List<OrderPaymentMethod> component1() {
        return this.paymentMethods;
    }

    public final Amount component2() {
        return this.remainingAmount;
    }

    public final OrderStatusResponse copy(List<OrderPaymentMethod> paymentMethods, Amount remainingAmount) {
        s.g(paymentMethods, "paymentMethods");
        s.g(remainingAmount, "remainingAmount");
        return new OrderStatusResponse(paymentMethods, remainingAmount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderStatusResponse) {
            OrderStatusResponse orderStatusResponse = (OrderStatusResponse) obj;
            return s.c(this.paymentMethods, orderStatusResponse.paymentMethods) && s.c(this.remainingAmount, orderStatusResponse.remainingAmount);
        }
        return false;
    }

    public final List<OrderPaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final Amount getRemainingAmount() {
        return this.remainingAmount;
    }

    public int hashCode() {
        return (this.paymentMethods.hashCode() * 31) + this.remainingAmount.hashCode();
    }

    public String toString() {
        return "OrderStatusResponse(paymentMethods=" + this.paymentMethods + ", remainingAmount=" + this.remainingAmount + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}