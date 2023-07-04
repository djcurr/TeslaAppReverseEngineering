package com.stripe.android.model;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

/* loaded from: classes6.dex */
public final class CreateFinancialConnectionsSessionParams {
    public static final Companion Companion = new Companion(null);
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    private static final String PARAM_PAYMENT_METHOD_DATA = "payment_method_data";
    private final String clientSecret;
    private final String customerEmailAddress;
    private final String customerName;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CreateFinancialConnectionsSessionParams(String clientSecret, String customerName, String str) {
        s.g(clientSecret, "clientSecret");
        s.g(customerName, "customerName");
        this.clientSecret = clientSecret;
        this.customerName = customerName;
        this.customerEmailAddress = str;
    }

    public static /* synthetic */ CreateFinancialConnectionsSessionParams copy$default(CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = createFinancialConnectionsSessionParams.clientSecret;
        }
        if ((i11 & 2) != 0) {
            str2 = createFinancialConnectionsSessionParams.customerName;
        }
        if ((i11 & 4) != 0) {
            str3 = createFinancialConnectionsSessionParams.customerEmailAddress;
        }
        return createFinancialConnectionsSessionParams.copy(str, str2, str3);
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.customerName;
    }

    public final String component3() {
        return this.customerEmailAddress;
    }

    public final CreateFinancialConnectionsSessionParams copy(String clientSecret, String customerName, String str) {
        s.g(clientSecret, "clientSecret");
        s.g(customerName, "customerName");
        return new CreateFinancialConnectionsSessionParams(clientSecret, customerName, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateFinancialConnectionsSessionParams) {
            CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams = (CreateFinancialConnectionsSessionParams) obj;
            return s.c(this.clientSecret, createFinancialConnectionsSessionParams.clientSecret) && s.c(this.customerName, createFinancialConnectionsSessionParams.customerName) && s.c(this.customerEmailAddress, createFinancialConnectionsSessionParams.customerEmailAddress);
        }
        return false;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public final String getCustomerName() {
        return this.customerName;
    }

    public int hashCode() {
        int hashCode = ((this.clientSecret.hashCode() * 31) + this.customerName.hashCode()) * 31;
        String str = this.customerEmailAddress;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Map<String, Object> toMap() {
        Map<String, Object> l11;
        l11 = s0.l(v.a("client_secret", this.clientSecret), v.a("payment_method_data", PaymentMethodCreateParams.Companion.createUSBankAccount$default(PaymentMethodCreateParams.Companion, new PaymentMethod.BillingDetails(null, this.customerEmailAddress, this.customerName, null, 9, null), null, 2, null).toParamMap()));
        return l11;
    }

    public String toString() {
        return "CreateFinancialConnectionsSessionParams(clientSecret=" + this.clientSecret + ", customerName=" + this.customerName + ", customerEmailAddress=" + ((Object) this.customerEmailAddress) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}