package com.adyen.checkout.components.model.paymentmethods;

import android.os.Parcel;
import com.adyen.checkout.core.exception.ModelSerializationException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

/* loaded from: classes.dex */
public class PaymentMethod extends c {
    private static final String BRAND = "brand";
    private static final String BRANDS = "brands";
    private static final String CONFIGURATION = "configuration";
    private static final String DETAILS = "details";
    private static final String FUNDING_SOURCE = "fundingSource";
    private static final String ISSUERS = "issuers";
    private static final String NAME = "name";
    private static final String TYPE = "type";
    private String brand;
    private List<String> brands;
    private Configuration configuration;
    private List<InputDetail> details;
    private String fundingSource;
    private List<Issuer> issuers;
    private String name;
    private String type;
    public static final c.a<PaymentMethod> CREATOR = new c.a<>(PaymentMethod.class);
    public static final c.b<PaymentMethod> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<PaymentMethod> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public PaymentMethod a(JSONObject jSONObject) {
            PaymentMethod paymentMethod = new PaymentMethod();
            paymentMethod.setType(jSONObject.optString("type", null));
            paymentMethod.setName(jSONObject.optString("name", null));
            paymentMethod.setBrands(p7.a.a(jSONObject.optJSONArray(PaymentMethod.BRANDS)));
            paymentMethod.setBrand(jSONObject.optString("brand", null));
            paymentMethod.setFundingSource(jSONObject.optString(PaymentMethod.FUNDING_SOURCE, null));
            paymentMethod.setIssuers(d.c(jSONObject.optJSONArray(PaymentMethod.ISSUERS), Issuer.SERIALIZER));
            paymentMethod.setConfiguration((Configuration) d.b(jSONObject.optJSONObject(PaymentMethod.CONFIGURATION), Configuration.SERIALIZER));
            paymentMethod.setDetails(d.c(jSONObject.optJSONArray("details"), InputDetail.SERIALIZER));
            return paymentMethod;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(PaymentMethod paymentMethod) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", paymentMethod.getType());
                jSONObject.putOpt("name", paymentMethod.getName());
                jSONObject.putOpt(PaymentMethod.BRANDS, p7.a.c(paymentMethod.getBrands()));
                jSONObject.putOpt("brand", paymentMethod.getBrand());
                jSONObject.putOpt(PaymentMethod.FUNDING_SOURCE, paymentMethod.getFundingSource());
                jSONObject.putOpt(PaymentMethod.ISSUERS, d.f(paymentMethod.getIssuers(), Issuer.SERIALIZER));
                jSONObject.putOpt(PaymentMethod.CONFIGURATION, d.e(paymentMethod.getConfiguration(), Configuration.SERIALIZER));
                jSONObject.putOpt("details", d.f(paymentMethod.getDetails(), InputDetail.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentMethod.class, e11);
            }
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public List<String> getBrands() {
        return this.brands;
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public List<InputDetail> getDetails() {
        return this.details;
    }

    public String getFundingSource() {
        return this.fundingSource;
    }

    public List<Issuer> getIssuers() {
        return this.issuers;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setBrands(List<String> list) {
        this.brands = list;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public void setDetails(List<InputDetail> list) {
        this.details = list;
    }

    public void setFundingSource(String str) {
        this.fundingSource = str;
    }

    public void setIssuers(List<Issuer> list) {
        this.issuers = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}