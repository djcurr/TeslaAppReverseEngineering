package com.adyen.checkout.components.model.connection;

import android.os.Parcel;
import android.os.Parcelable;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001$B)\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006%"}, d2 = {"Lcom/adyen/checkout/components/model/connection/OrderPaymentMethod;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "Lcom/adyen/checkout/components/model/payments/Amount;", "component2", "component3", "component4", "type", "amount", OrderPaymentMethod.LAST_FOUR, OrderPaymentMethod.TRANSACTION_LIMIT, "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Lcom/adyen/checkout/components/model/payments/Amount;", "getAmount", "()Lcom/adyen/checkout/components/model/payments/Amount;", "getLastFour", "getTransactionLimit", "<init>", "(Ljava/lang/String;Lcom/adyen/checkout/components/model/payments/Amount;Ljava/lang/String;Lcom/adyen/checkout/components/model/payments/Amount;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class OrderPaymentMethod extends c {
    private static final String AMOUNT = "amount";
    private static final String LAST_FOUR = "lastFour";
    private static final String TRANSACTION_LIMIT = "transactionLimit";
    private static final String TYPE = "type";
    private final Amount amount;
    private final String lastFour;
    private final Amount transactionLimit;
    private final String type;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<OrderPaymentMethod> CREATOR = new c.a(OrderPaymentMethod.class);
    private static final c.b<OrderPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<OrderPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public OrderPaymentMethod a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                String string = jsonObject.getString("type");
                String string2 = jsonObject.getString(OrderPaymentMethod.LAST_FOUR);
                JSONObject optJSONObject = jsonObject.optJSONObject("amount");
                c.b<Amount> bVar = Amount.SERIALIZER;
                Amount amount = (Amount) d.b(optJSONObject, bVar);
                if (amount == null) {
                    amount = Amount.EMPTY;
                }
                s.f(string, "getString(TYPE)");
                s.f(amount, "ModelUtils.deserializeOpt(jsonObject.optJSONObject(AMOUNT), Amount.SERIALIZER) ?: Amount.EMPTY");
                s.f(string2, "getString(LAST_FOUR)");
                return new OrderPaymentMethod(string, amount, string2, (Amount) d.b(jsonObject.optJSONObject(OrderPaymentMethod.TRANSACTION_LIMIT), bVar));
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderPaymentMethod.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(OrderPaymentMethod modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(OrderPaymentMethod.LAST_FOUR, modelObject.getLastFour());
                Amount amount = modelObject.getAmount();
                c.b<Amount> bVar = Amount.SERIALIZER;
                jSONObject.putOpt("amount", d.e(amount, bVar));
                jSONObject.putOpt(OrderPaymentMethod.TRANSACTION_LIMIT, d.e(modelObject.getTransactionLimit(), bVar));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderPaymentMethod.class, e11);
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

        public final c.b<OrderPaymentMethod> a() {
            return OrderPaymentMethod.SERIALIZER;
        }
    }

    public OrderPaymentMethod(String type, Amount amount, String lastFour, Amount amount2) {
        s.g(type, "type");
        s.g(amount, "amount");
        s.g(lastFour, "lastFour");
        this.type = type;
        this.amount = amount;
        this.lastFour = lastFour;
        this.transactionLimit = amount2;
    }

    public static /* synthetic */ OrderPaymentMethod copy$default(OrderPaymentMethod orderPaymentMethod, String str, Amount amount, String str2, Amount amount2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            amount = orderPaymentMethod.amount;
        }
        if ((i11 & 4) != 0) {
            str2 = orderPaymentMethod.lastFour;
        }
        if ((i11 & 8) != 0) {
            amount2 = orderPaymentMethod.transactionLimit;
        }
        return orderPaymentMethod.copy(str, amount, str2, amount2);
    }

    public static final c.b<OrderPaymentMethod> getSERIALIZER() {
        return Companion.a();
    }

    public final String component1() {
        return this.type;
    }

    public final Amount component2() {
        return this.amount;
    }

    public final String component3() {
        return this.lastFour;
    }

    public final Amount component4() {
        return this.transactionLimit;
    }

    public final OrderPaymentMethod copy(String type, Amount amount, String lastFour, Amount amount2) {
        s.g(type, "type");
        s.g(amount, "amount");
        s.g(lastFour, "lastFour");
        return new OrderPaymentMethod(type, amount, lastFour, amount2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderPaymentMethod) {
            OrderPaymentMethod orderPaymentMethod = (OrderPaymentMethod) obj;
            return s.c(this.type, orderPaymentMethod.type) && s.c(this.amount, orderPaymentMethod.amount) && s.c(this.lastFour, orderPaymentMethod.lastFour) && s.c(this.transactionLimit, orderPaymentMethod.transactionLimit);
        }
        return false;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.type.hashCode() * 31) + this.amount.hashCode()) * 31) + this.lastFour.hashCode()) * 31;
        Amount amount = this.transactionLimit;
        return hashCode + (amount == null ? 0 : amount.hashCode());
    }

    public String toString() {
        return "OrderPaymentMethod(type=" + this.type + ", amount=" + this.amount + ", lastFour=" + this.lastFour + ", transactionLimit=" + this.transactionLimit + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}