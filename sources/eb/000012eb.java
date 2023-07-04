package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/components/model/payments/request/OrderRequest;", "Lp7/c;", "Landroid/os/Parcel;", "dest", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "component2", OrderRequest.PSP_REFERENCE, OrderRequest.ORDER_DATA, "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getPspReference", "()Ljava/lang/String;", "getOrderData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class OrderRequest extends c {
    private static final String ORDER_DATA = "orderData";
    private static final String PSP_REFERENCE = "pspReference";
    private final String orderData;
    private final String pspReference;
    public static final b Companion = new b(null);
    public static final c.a<OrderRequest> CREATOR = new c.a<>(OrderRequest.class);
    public static final c.b<OrderRequest> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<OrderRequest> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public OrderRequest a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            String optString = jsonObject.optString(OrderRequest.PSP_REFERENCE, "");
            s.f(optString, "jsonObject.optString(PSP_REFERENCE, \"\")");
            String optString2 = jsonObject.optString(OrderRequest.ORDER_DATA, "");
            s.f(optString2, "jsonObject.optString(ORDER_DATA, \"\")");
            return new OrderRequest(optString, optString2);
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(OrderRequest modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(OrderRequest.PSP_REFERENCE, modelObject.getPspReference());
                jSONObject.putOpt(OrderRequest.ORDER_DATA, modelObject.getOrderData());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderRequest.class, e11);
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

    public OrderRequest(String pspReference, String orderData) {
        s.g(pspReference, "pspReference");
        s.g(orderData, "orderData");
        this.pspReference = pspReference;
        this.orderData = orderData;
    }

    public static /* synthetic */ OrderRequest copy$default(OrderRequest orderRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderRequest.pspReference;
        }
        if ((i11 & 2) != 0) {
            str2 = orderRequest.orderData;
        }
        return orderRequest.copy(str, str2);
    }

    public final String component1() {
        return this.pspReference;
    }

    public final String component2() {
        return this.orderData;
    }

    public final OrderRequest copy(String pspReference, String orderData) {
        s.g(pspReference, "pspReference");
        s.g(orderData, "orderData");
        return new OrderRequest(pspReference, orderData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OrderRequest) {
            OrderRequest orderRequest = (OrderRequest) obj;
            return s.c(this.pspReference, orderRequest.pspReference) && s.c(this.orderData, orderRequest.orderData);
        }
        return false;
    }

    public final String getOrderData() {
        return this.orderData;
    }

    public final String getPspReference() {
        return this.pspReference;
    }

    public int hashCode() {
        return (this.pspReference.hashCode() * 31) + this.orderData.hashCode();
    }

    public String toString() {
        return "OrderRequest(pspReference=" + this.pspReference + ", orderData=" + this.orderData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        s.g(dest, "dest");
        p7.a.d(dest, SERIALIZER.b(this));
    }
}