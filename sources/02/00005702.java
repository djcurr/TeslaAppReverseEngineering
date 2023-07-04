package com.stripe.android.paymentsheet.paymentdatacollection;

import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.s0;

/* loaded from: classes6.dex */
public final class FormFragmentArgumentsKt {
    private static final List<p<IdentifierSpec, String>> list = new ArrayList();

    private static final void addPath(Map<String, ? extends Object> map, String str) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                list.add(v.a(IdentifierSpec.Companion.get(addPathKey(str, entry.getKey())), null));
            } else if (value instanceof String) {
                List<p<IdentifierSpec, String>> list2 = list;
                IdentifierSpec identifierSpec = IdentifierSpec.Companion.get(addPathKey(str, entry.getKey()));
                Object value2 = entry.getValue();
                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.String");
                list2.add(v.a(identifierSpec, (String) value2));
            } else if (value instanceof Map) {
                Object value3 = entry.getValue();
                Objects.requireNonNull(value3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                addPath((Map) value3, addPathKey(str, entry.getKey()));
            }
        }
    }

    private static final String addPathKey(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        return str + '[' + str2 + ']';
    }

    public static final Map<IdentifierSpec, String> getInitialValuesMap(FormFragmentArguments formFragmentArguments) {
        PaymentSheet.Address address;
        PaymentSheet.Address address2;
        PaymentSheet.Address address3;
        PaymentSheet.Address address4;
        PaymentSheet.Address address5;
        Map l11;
        Map t11;
        Map<IdentifierSpec, String> p11;
        PaymentSheet.Address address6;
        s.g(formFragmentArguments, "<this>");
        List<p<IdentifierSpec, String>> list2 = list;
        list2.clear();
        PaymentMethodCreateParams initialPaymentMethodCreateParams = formFragmentArguments.getInitialPaymentMethodCreateParams();
        if (initialPaymentMethodCreateParams != null) {
            addPath(initialPaymentMethodCreateParams.toParamMap(), "");
        }
        p[] pVarArr = new p[9];
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        IdentifierSpec name = companion.getName();
        PaymentSheet.BillingDetails billingDetails = formFragmentArguments.getBillingDetails();
        String str = null;
        pVarArr[0] = v.a(name, billingDetails == null ? null : billingDetails.getName());
        IdentifierSpec email = companion.getEmail();
        PaymentSheet.BillingDetails billingDetails2 = formFragmentArguments.getBillingDetails();
        pVarArr[1] = v.a(email, billingDetails2 == null ? null : billingDetails2.getEmail());
        IdentifierSpec phone = companion.getPhone();
        PaymentSheet.BillingDetails billingDetails3 = formFragmentArguments.getBillingDetails();
        pVarArr[2] = v.a(phone, billingDetails3 == null ? null : billingDetails3.getPhone());
        IdentifierSpec line1 = companion.getLine1();
        PaymentSheet.BillingDetails billingDetails4 = formFragmentArguments.getBillingDetails();
        pVarArr[3] = v.a(line1, (billingDetails4 == null || (address = billingDetails4.getAddress()) == null) ? null : address.getLine1());
        IdentifierSpec line2 = companion.getLine2();
        PaymentSheet.BillingDetails billingDetails5 = formFragmentArguments.getBillingDetails();
        pVarArr[4] = v.a(line2, (billingDetails5 == null || (address2 = billingDetails5.getAddress()) == null) ? null : address2.getLine2());
        IdentifierSpec city = companion.getCity();
        PaymentSheet.BillingDetails billingDetails6 = formFragmentArguments.getBillingDetails();
        pVarArr[5] = v.a(city, (billingDetails6 == null || (address3 = billingDetails6.getAddress()) == null) ? null : address3.getCity());
        IdentifierSpec state = companion.getState();
        PaymentSheet.BillingDetails billingDetails7 = formFragmentArguments.getBillingDetails();
        pVarArr[6] = v.a(state, (billingDetails7 == null || (address4 = billingDetails7.getAddress()) == null) ? null : address4.getState());
        IdentifierSpec country = companion.getCountry();
        PaymentSheet.BillingDetails billingDetails8 = formFragmentArguments.getBillingDetails();
        pVarArr[7] = v.a(country, (billingDetails8 == null || (address5 = billingDetails8.getAddress()) == null) ? null : address5.getCountry());
        IdentifierSpec postalCode = companion.getPostalCode();
        PaymentSheet.BillingDetails billingDetails9 = formFragmentArguments.getBillingDetails();
        if (billingDetails9 != null && (address6 = billingDetails9.getAddress()) != null) {
            str = address6.getPostalCode();
        }
        pVarArr[8] = v.a(postalCode, str);
        l11 = s0.l(pVarArr);
        t11 = s0.t(list2);
        p11 = s0.p(l11, t11);
        return p11;
    }
}