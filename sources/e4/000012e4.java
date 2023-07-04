package com.adyen.checkout.components.model.payments.request;

/* loaded from: classes.dex */
public abstract class IssuerListPaymentMethod extends PaymentMethodDetails {
    static final String ISSUER = "issuer";
    private String issuer;

    public String getIssuer() {
        return this.issuer;
    }

    public void setIssuer(String str) {
        this.issuer = str;
    }
}