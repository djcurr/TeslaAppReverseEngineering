package com.adyen.checkout.components.model.payments;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public class Amount extends c {
    public static final c.a<Amount> CREATOR = new c.a<>(Amount.class);
    private static final String CURRENCY = "currency";
    public static final Amount EMPTY;
    private static final String EMPTY_CURRENCY = "NONE";
    private static final int EMPTY_VALUE = -1;
    public static final c.b<Amount> SERIALIZER;
    private static final String VALUE = "value";
    private String currency;
    private int value;

    /* loaded from: classes.dex */
    class a implements c.b<Amount> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Amount a(JSONObject jSONObject) {
            Amount amount = new Amount();
            amount.setCurrency(jSONObject.optString(Amount.CURRENCY, null));
            amount.setValue(jSONObject.optInt("value", -1));
            return amount;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Amount amount) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(Amount.CURRENCY, amount.getCurrency());
                jSONObject.putOpt("value", Integer.valueOf(amount.getValue()));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Amount.class, e11);
            }
        }
    }

    static {
        Amount amount = new Amount();
        EMPTY = amount;
        amount.setCurrency(EMPTY_CURRENCY);
        amount.setValue(-1);
        SERIALIZER = new a();
    }

    public String getCurrency() {
        return this.currency;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEmpty() {
        return EMPTY_CURRENCY.equals(this.currency) || this.value == -1;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setValue(int i11) {
        this.value = i11;
    }

    public String toString() {
        return "Amount(" + this.currency + ", " + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}