package com.adyen.checkout.components.model.payments.request;

import android.os.Parcel;
import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.components.model.payments.request.PaymentMethodDetails;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;
import p7.d;

/* loaded from: classes.dex */
public class PaymentComponentData<PaymentMethodDetailsT extends PaymentMethodDetails> extends c {
    private static final String AMOUNT = "amount";
    private static final String BILLING_ADDRESS = "billingAddress";
    private static final String DATE_OF_BIRTH = "dateOfBirth";
    private static final String DELIVERY_ADDRESS = "deliveryAddress";
    private static final String INSTALLMENTS = "installments";
    private static final String ORDER = "order";
    private static final String PAYMENT_METHOD = "paymentMethod";
    private static final String SHOPPER_EMAIL = "shopperEmail";
    private static final String SHOPPER_NAME = "shopperName";
    private static final String SHOPPER_REFERENCE = "shopperReference";
    private static final String SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
    private static final String STORE_PAYMENT_METHOD = "storePaymentMethod";
    private static final String TELEPHONE_NUMBER = "telephoneNumber";
    private Amount amount;
    private Address billingAddress;
    private String dateOfBirth;
    private Address deliveryAddress;
    private Installments installments;
    private OrderRequest order;
    private PaymentMethodDetailsT paymentMethod;
    private String shopperEmail;
    private ShopperName shopperName;
    private String shopperReference;
    private String socialSecurityNumber;
    private boolean storePaymentMethod;
    private String telephoneNumber;
    public static final c.a<PaymentComponentData> CREATOR = new c.a<>(PaymentComponentData.class);
    public static final c.b<PaymentComponentData> SERIALIZER = new a();

    /* loaded from: classes.dex */
    class a implements c.b<PaymentComponentData> {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p7.c.b
        /* renamed from: c */
        public PaymentComponentData a(JSONObject jSONObject) {
            PaymentComponentData paymentComponentData = new PaymentComponentData();
            paymentComponentData.setPaymentMethod((PaymentMethodDetails) d.b(jSONObject.optJSONObject(PaymentComponentData.PAYMENT_METHOD), PaymentMethodDetails.SERIALIZER));
            paymentComponentData.setStorePaymentMethod(jSONObject.optBoolean(PaymentComponentData.STORE_PAYMENT_METHOD));
            paymentComponentData.setShopperReference(jSONObject.optString(PaymentComponentData.SHOPPER_REFERENCE));
            paymentComponentData.setAmount((Amount) d.b(jSONObject.optJSONObject("amount"), Amount.SERIALIZER));
            JSONObject optJSONObject = jSONObject.optJSONObject(PaymentComponentData.BILLING_ADDRESS);
            c.b<Address> bVar = Address.SERIALIZER;
            paymentComponentData.setBillingAddress((Address) d.b(optJSONObject, bVar));
            paymentComponentData.setDeliveryAddress((Address) d.b(jSONObject.optJSONObject(PaymentComponentData.DELIVERY_ADDRESS), bVar));
            paymentComponentData.setShopperName((ShopperName) d.b(jSONObject.optJSONObject(PaymentComponentData.SHOPPER_NAME), ShopperName.SERIALIZER));
            paymentComponentData.setTelephoneNumber(jSONObject.optString(PaymentComponentData.TELEPHONE_NUMBER));
            paymentComponentData.setShopperEmail(jSONObject.optString(PaymentComponentData.SHOPPER_EMAIL));
            paymentComponentData.setDateOfBirth(jSONObject.optString(PaymentComponentData.DATE_OF_BIRTH));
            paymentComponentData.setSocialSecurityNumber(jSONObject.optString(PaymentComponentData.SOCIAL_SECURITY_NUMBER));
            paymentComponentData.setInstallments((Installments) d.b(jSONObject.optJSONObject(PaymentComponentData.INSTALLMENTS), Installments.SERIALIZER));
            paymentComponentData.setOrder((OrderRequest) d.b(jSONObject.optJSONObject(PaymentComponentData.ORDER), OrderRequest.SERIALIZER));
            return paymentComponentData;
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(PaymentComponentData paymentComponentData) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(PaymentComponentData.PAYMENT_METHOD, d.e(paymentComponentData.getPaymentMethod(), PaymentMethodDetails.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.STORE_PAYMENT_METHOD, Boolean.valueOf(paymentComponentData.isStorePaymentMethodEnable()));
                jSONObject.putOpt(PaymentComponentData.SHOPPER_REFERENCE, paymentComponentData.getShopperReference());
                jSONObject.putOpt("amount", d.e(paymentComponentData.getAmount(), Amount.SERIALIZER));
                Address billingAddress = paymentComponentData.getBillingAddress();
                c.b<Address> bVar = Address.SERIALIZER;
                jSONObject.putOpt(PaymentComponentData.BILLING_ADDRESS, d.e(billingAddress, bVar));
                jSONObject.putOpt(PaymentComponentData.DELIVERY_ADDRESS, d.e(paymentComponentData.getDeliveryAddress(), bVar));
                jSONObject.putOpt(PaymentComponentData.SHOPPER_NAME, d.e(paymentComponentData.getShopperName(), ShopperName.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.TELEPHONE_NUMBER, paymentComponentData.getTelephoneNumber());
                jSONObject.putOpt(PaymentComponentData.SHOPPER_EMAIL, paymentComponentData.getShopperEmail());
                jSONObject.putOpt(PaymentComponentData.DATE_OF_BIRTH, paymentComponentData.getDateOfBirth());
                jSONObject.putOpt(PaymentComponentData.SOCIAL_SECURITY_NUMBER, paymentComponentData.getSocialSecurityNumber());
                jSONObject.putOpt(PaymentComponentData.INSTALLMENTS, d.e(paymentComponentData.getInstallments(), Installments.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.ORDER, d.e(paymentComponentData.getOrder(), OrderRequest.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentComponentData.class, e11);
            }
        }
    }

    public Amount getAmount() {
        return this.amount;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public Address getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public Installments getInstallments() {
        return this.installments;
    }

    public OrderRequest getOrder() {
        return this.order;
    }

    public PaymentMethodDetailsT getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getShopperEmail() {
        return this.shopperEmail;
    }

    public ShopperName getShopperName() {
        return this.shopperName;
    }

    public String getShopperReference() {
        return this.shopperReference;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public boolean isStorePaymentMethodEnable() {
        return this.storePaymentMethod;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public void setDateOfBirth(String str) {
        this.dateOfBirth = str;
    }

    public void setDeliveryAddress(Address address) {
        this.deliveryAddress = address;
    }

    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    public void setOrder(OrderRequest orderRequest) {
        this.order = orderRequest;
    }

    public void setPaymentMethod(PaymentMethodDetailsT paymentmethoddetailst) {
        this.paymentMethod = paymentmethoddetailst;
    }

    public void setShopperEmail(String str) {
        this.shopperEmail = str;
    }

    public void setShopperName(ShopperName shopperName) {
        this.shopperName = shopperName;
    }

    public void setShopperReference(String str) {
        this.shopperReference = str;
    }

    public void setSocialSecurityNumber(String str) {
        this.socialSecurityNumber = str;
    }

    public void setStorePaymentMethod(boolean z11) {
        this.storePaymentMethod = z11;
    }

    public void setTelephoneNumber(String str) {
        this.telephoneNumber = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        p7.a.d(parcel, SERIALIZER.b(this));
    }
}