package com.adyen.checkout.components.model.payments.response;

import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001*B?\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003JM\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0011\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b%\u0010$R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b&\u0010\u001f¨\u0006+"}, d2 = {"Lcom/adyen/checkout/components/model/payments/response/OrderResponse;", "Lp7/c;", "Landroid/os/Parcel;", "dest", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "component2", "component3", "Lcom/adyen/checkout/components/model/payments/Amount;", "component4", "component5", "component6", OrderResponse.PSP_REFERENCE, OrderResponse.ORDER_DATA, OrderResponse.REFERENCE, "amount", OrderResponse.REMAINING_AMOUNT, OrderResponse.EXPIRES_AT, "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getPspReference", "()Ljava/lang/String;", "getOrderData", "getReference", "Lcom/adyen/checkout/components/model/payments/Amount;", "getAmount", "()Lcom/adyen/checkout/components/model/payments/Amount;", "getRemainingAmount", "getExpiresAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/model/payments/Amount;Lcom/adyen/checkout/components/model/payments/Amount;Ljava/lang/String;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class OrderResponse extends c {
    private static final String AMOUNT = "amount";
    private static final String EXPIRES_AT = "expiresAt";
    private static final String ORDER_DATA = "orderData";
    private static final String PSP_REFERENCE = "pspReference";
    private static final String REFERENCE = "reference";
    private static final String REMAINING_AMOUNT = "remainingAmount";
    private final Amount amount;
    private final String expiresAt;
    private final String orderData;
    private final String pspReference;
    private final String reference;
    private final Amount remainingAmount;
    public static final b Companion = new b(null);
    public static final c.a<OrderResponse> CREATOR = new c.a<>(OrderResponse.class);
    public static final c.b<OrderResponse> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<OrderResponse> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public OrderResponse a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            String optString = jsonObject.optString(OrderResponse.PSP_REFERENCE, "");
            s.f(optString, "jsonObject.optString(PSP_REFERENCE, \"\")");
            String optString2 = jsonObject.optString(OrderResponse.ORDER_DATA, "");
            s.f(optString2, "jsonObject.optString(ORDER_DATA, \"\")");
            String optString3 = jsonObject.optString(OrderResponse.REFERENCE, "");
            JSONObject optJSONObject = jsonObject.optJSONObject("amount");
            c.b<Amount> bVar = Amount.SERIALIZER;
            return new OrderResponse(optString, optString2, optString3, (Amount) d.b(optJSONObject, bVar), (Amount) d.b(jsonObject.optJSONObject(OrderResponse.REMAINING_AMOUNT), bVar), jsonObject.optString(OrderResponse.EXPIRES_AT, ""));
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(OrderResponse modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(OrderResponse.PSP_REFERENCE, modelObject.getPspReference());
                jSONObject.putOpt(OrderResponse.ORDER_DATA, modelObject.getOrderData());
                jSONObject.putOpt(OrderResponse.REFERENCE, modelObject.getReference());
                Amount amount = modelObject.getAmount();
                c.b<Amount> bVar = Amount.SERIALIZER;
                jSONObject.putOpt("amount", d.e(amount, bVar));
                jSONObject.putOpt(OrderResponse.REMAINING_AMOUNT, d.e(modelObject.getRemainingAmount(), bVar));
                jSONObject.putOpt(OrderResponse.EXPIRES_AT, modelObject.getExpiresAt());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderResponse.class, e11);
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
    }

    public OrderResponse(String pspReference, String orderData, String str, Amount amount, Amount amount2, String str2) {
        s.g(pspReference, "pspReference");
        s.g(orderData, "orderData");
        this.pspReference = pspReference;
        this.orderData = orderData;
        this.reference = str;
        this.amount = amount;
        this.remainingAmount = amount2;
        this.expiresAt = str2;
    }

    public static /* synthetic */ OrderResponse copy$default(OrderResponse orderResponse, String str, String str2, String str3, Amount amount, Amount amount2, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderResponse.pspReference;
        }
        if ((i11 & 2) != 0) {
            str2 = orderResponse.orderData;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = orderResponse.reference;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            amount = orderResponse.amount;
        }
        Amount amount3 = amount;
        if ((i11 & 16) != 0) {
            amount2 = orderResponse.remainingAmount;
        }
        Amount amount4 = amount2;
        if ((i11 & 32) != 0) {
            str4 = orderResponse.expiresAt;
        }
        return orderResponse.copy(str, str5, str6, amount3, amount4, str4);
    }

    public final String component1() {
        return this.pspReference;
    }

    public final String component2() {
        return this.orderData;
    }

    public final String component3() {
        return this.reference;
    }

    public final Amount component4() {
        return this.amount;
    }

    public final Amount component5() {
        return this.remainingAmount;
    }

    public final String component6() {
        return this.expiresAt;
    }

    public final OrderResponse copy(String pspReference, String orderData, String str, Amount amount, Amount amount2, String str2) {
        s.g(pspReference, "pspReference");
        s.g(orderData, "orderData");
        return new OrderResponse(pspReference, orderData, str, amount, amount2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderResponse) {
            OrderResponse orderResponse = (OrderResponse) obj;
            return s.c(this.pspReference, orderResponse.pspReference) && s.c(this.orderData, orderResponse.orderData) && s.c(this.reference, orderResponse.reference) && s.c(this.amount, orderResponse.amount) && s.c(this.remainingAmount, orderResponse.remainingAmount) && s.c(this.expiresAt, orderResponse.expiresAt);
        }
        return false;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getOrderData() {
        return this.orderData;
    }

    public final String getPspReference() {
        return this.pspReference;
    }

    public final String getReference() {
        return this.reference;
    }

    public final Amount getRemainingAmount() {
        return this.remainingAmount;
    }

    public int hashCode() {
        int hashCode = ((this.pspReference.hashCode() * 31) + this.orderData.hashCode()) * 31;
        String str = this.reference;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Amount amount = this.amount;
        int hashCode3 = (hashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.remainingAmount;
        int hashCode4 = (hashCode3 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        String str2 = this.expiresAt;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "OrderResponse(pspReference=" + this.pspReference + ", orderData=" + this.orderData + ", reference=" + ((Object) this.reference) + ", amount=" + this.amount + ", remainingAmount=" + this.remainingAmount + ", expiresAt=" + ((Object) this.expiresAt) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        s.g(dest, "dest");
        p7.a.d(dest, SERIALIZER.b(this));
    }
}