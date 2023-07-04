package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public final class Item extends c {
    private static final String ID = "id";
    private static final String NAME = "name";

    /* renamed from: id  reason: collision with root package name */
    private String f9562id;
    private String name;
    public static final c.a<Item> CREATOR = new c.a<>(Item.class);
    public static final c.b<Item> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<Item> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Item a(JSONObject jSONObject) {
            Item item = new Item();
            item.setId(jSONObject.optString("id", null));
            item.setName(jSONObject.optString("name", null));
            return item;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Item item) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("id", item.getId());
                jSONObject.putOpt("name", item.getName());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Item.class, e11);
            }
        }
    }

    public String getId() {
        return this.f9562id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String str) {
        this.f9562id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}