package com.adyen.checkout.components.model.payments.response;

import android.text.TextUtils;
import com.adyen.checkout.core.exception.CheckoutException;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public abstract class Action extends c {
    public static final String PAYMENT_DATA = "paymentData";
    public static final String PAYMENT_METHOD_TYPE = "paymentMethodType";
    public static final c.b<Action> SERIALIZER = new a();
    public static final String TYPE = "type";
    private String paymentData;
    private String paymentMethodType;
    private String type;

    /* loaded from: classes.dex */
    class a implements c.b<Action> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public Action a(JSONObject jSONObject) {
            String optString = jSONObject.optString("type");
            if (!TextUtils.isEmpty(optString)) {
                return Action.getChildSerializer(optString).a(jSONObject);
            }
            throw new CheckoutException("Action type not found");
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(Action action) {
            String type = action.getType();
            if (!TextUtils.isEmpty(type)) {
                return Action.getChildSerializer(type).b(action);
            }
            throw new CheckoutException("Action type not found");
        }
    }

    static c.b<? extends Action> getChildSerializer(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -952485970:
                if (str.equals(QrCodeAction.ACTION_TYPE)) {
                    c11 = 0;
                    break;
                }
                break;
            case -776144932:
                if (str.equals(RedirectAction.ACTION_TYPE)) {
                    c11 = 1;
                    break;
                }
                break;
            case 113722:
                if (str.equals(SdkAction.ACTION_TYPE)) {
                    c11 = 2;
                    break;
                }
                break;
            case 93223254:
                if (str.equals(AwaitAction.ACTION_TYPE)) {
                    c11 = 3;
                    break;
                }
                break;
            case 640192174:
                if (str.equals(VoucherAction.ACTION_TYPE)) {
                    c11 = 4;
                    break;
                }
                break;
            case 1021099710:
                if (str.equals(Threeds2ChallengeAction.ACTION_TYPE)) {
                    c11 = 5;
                    break;
                }
                break;
            case 1337458815:
                if (str.equals(Threeds2FingerprintAction.ACTION_TYPE)) {
                    c11 = 6;
                    break;
                }
                break;
            case 1473713957:
                if (str.equals(Threeds2Action.ACTION_TYPE)) {
                    c11 = 7;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return QrCodeAction.SERIALIZER;
            case 1:
                return RedirectAction.SERIALIZER;
            case 2:
                return SdkAction.SERIALIZER;
            case 3:
                return AwaitAction.SERIALIZER;
            case 4:
                return VoucherAction.SERIALIZER;
            case 5:
                return Threeds2ChallengeAction.SERIALIZER;
            case 6:
                return Threeds2FingerprintAction.SERIALIZER;
            case 7:
                return Threeds2Action.SERIALIZER;
            default:
                throw new CheckoutException("Action type not found - " + str);
        }
    }

    public String getPaymentData() {
        return this.paymentData;
    }

    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public String getType() {
        return this.type;
    }

    public void setPaymentData(String str) {
        this.paymentData = str;
    }

    public void setPaymentMethodType(String str) {
        this.paymentMethodType = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}