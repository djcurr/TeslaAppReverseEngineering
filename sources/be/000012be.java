package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

/* loaded from: classes.dex */
public final class InputDetail extends c {
    private static final String ITEMS = "items";
    private List<Item> items;
    public static final c.a<InputDetail> CREATOR = new c.a<>(InputDetail.class);
    public static final c.b<InputDetail> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<InputDetail> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public InputDetail a(JSONObject jSONObject) {
            InputDetail inputDetail = new InputDetail();
            inputDetail.setItems(d.c(jSONObject.optJSONArray(InputDetail.ITEMS), Item.SERIALIZER));
            return inputDetail;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(InputDetail inputDetail) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(InputDetail.ITEMS, d.f(inputDetail.getItems(), Item.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(InputDetail.class, e11);
            }
        }
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}