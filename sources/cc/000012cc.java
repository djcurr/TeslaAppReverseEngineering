package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/components/model/payments/request/BacsDirectDebitPaymentMethod;", "Lcom/adyen/checkout/components/model/payments/request/PaymentMethodDetails;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lvz/b0;", "writeToParcel", "", BacsDirectDebitPaymentMethod.HOLDER_NAME, "Ljava/lang/String;", "getHolderName", "()Ljava/lang/String;", "setHolderName", "(Ljava/lang/String;)V", BacsDirectDebitPaymentMethod.BANK_ACCOUNT_NUMBER, "getBankAccountNumber", "setBankAccountNumber", BacsDirectDebitPaymentMethod.BANK_LOCATION_ID, "getBankLocationId", "setBankLocationId", "<init>", "()V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class BacsDirectDebitPaymentMethod extends PaymentMethodDetails {
    private static final String BANK_ACCOUNT_NUMBER = "bankAccountNumber";
    private static final String BANK_LOCATION_ID = "bankLocationId";
    private static final String HOLDER_NAME = "holderName";
    public static final String PAYMENT_METHOD_TYPE = "directdebit_GB";
    private String bankAccountNumber;
    private String bankLocationId;
    private String holderName;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<BacsDirectDebitPaymentMethod> CREATOR = new c.a(BacsDirectDebitPaymentMethod.class);
    public static final c.b<BacsDirectDebitPaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<BacsDirectDebitPaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public BacsDirectDebitPaymentMethod a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            BacsDirectDebitPaymentMethod bacsDirectDebitPaymentMethod = new BacsDirectDebitPaymentMethod();
            bacsDirectDebitPaymentMethod.setType(jsonObject.optString("type", null));
            bacsDirectDebitPaymentMethod.setHolderName(jsonObject.optString(BacsDirectDebitPaymentMethod.HOLDER_NAME, null));
            bacsDirectDebitPaymentMethod.setBankAccountNumber(jsonObject.optString(BacsDirectDebitPaymentMethod.BANK_ACCOUNT_NUMBER, null));
            bacsDirectDebitPaymentMethod.setBankLocationId(jsonObject.optString(BacsDirectDebitPaymentMethod.BANK_LOCATION_ID, null));
            return bacsDirectDebitPaymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(BacsDirectDebitPaymentMethod modelObject) {
            s.g(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(BacsDirectDebitPaymentMethod.HOLDER_NAME, modelObject.getHolderName());
                jSONObject.putOpt(BacsDirectDebitPaymentMethod.BANK_ACCOUNT_NUMBER, modelObject.getBankAccountNumber());
                jSONObject.putOpt(BacsDirectDebitPaymentMethod.BANK_LOCATION_ID, modelObject.getBankLocationId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BacsDirectDebitPaymentMethod.class, e11);
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

    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public final String getBankLocationId() {
        return this.bankLocationId;
    }

    public final String getHolderName() {
        return this.holderName;
    }

    public final void setBankAccountNumber(String str) {
        this.bankAccountNumber = str;
    }

    public final void setBankLocationId(String str) {
        this.bankLocationId = str;
    }

    public final void setHolderName(String str) {
        this.holderName = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}