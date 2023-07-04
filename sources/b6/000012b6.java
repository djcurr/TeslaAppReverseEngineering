package com.adyen.checkout.components.model.connection;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0019\u0010\n\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/components/model/connection/OrderStatusRequest;", "Lp7/c;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", OrderStatusRequest.ORDER_DATA, "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getOrderData", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class OrderStatusRequest extends c {
    private static final String ORDER_DATA = "orderData";
    private final String orderData;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<OrderStatusRequest> CREATOR = new c.a(OrderStatusRequest.class);
    private static final c.b<OrderStatusRequest> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<OrderStatusRequest> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public OrderStatusRequest a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                String string = jsonObject.getString(OrderStatusRequest.ORDER_DATA);
                s.f(string, "jsonObject.getString(ORDER_DATA)");
                return new OrderStatusRequest(string);
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderStatusRequest.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(OrderStatusRequest modelObject) {
            s.g(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(OrderStatusRequest.ORDER_DATA, modelObject.getOrderData());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderStatusRequest.class, e11);
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

        public final c.b<OrderStatusRequest> a() {
            return OrderStatusRequest.SERIALIZER;
        }
    }

    public OrderStatusRequest(String orderData) {
        s.g(orderData, "orderData");
        this.orderData = orderData;
    }

    public static /* synthetic */ OrderStatusRequest copy$default(OrderStatusRequest orderStatusRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderStatusRequest.orderData;
        }
        return orderStatusRequest.copy(str);
    }

    public static final c.b<OrderStatusRequest> getSERIALIZER() {
        return Companion.a();
    }

    public final String component1() {
        return this.orderData;
    }

    public final OrderStatusRequest copy(String orderData) {
        s.g(orderData, "orderData");
        return new OrderStatusRequest(orderData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderStatusRequest) && s.c(this.orderData, ((OrderStatusRequest) obj).orderData);
    }

    public final String getOrderData() {
        return this.orderData;
    }

    public int hashCode() {
        return this.orderData.hashCode();
    }

    public String toString() {
        return "OrderStatusRequest(orderData=" + this.orderData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}