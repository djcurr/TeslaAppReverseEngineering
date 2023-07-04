package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Customer;
import com.stripe.android.model.CustomerPaymentSource;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.TokenizationMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.n0;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class CustomerJsonParser implements ModelJsonParser<Customer> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_DATA = "data";
    @Deprecated
    private static final String FIELD_DEFAULT_SOURCE = "default_source";
    @Deprecated
    private static final String FIELD_DESCRIPTION = "description";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_HAS_MORE = "has_more";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    @Deprecated
    private static final String FIELD_SOURCES = "sources";
    @Deprecated
    private static final String FIELD_TOTAL_COUNT = "total_count";
    @Deprecated
    private static final String FIELD_URL = "url";
    @Deprecated
    private static final String VALUE_CUSTOMER = "customer";
    @Deprecated
    private static final String VALUE_LIST = "list";
    private final CustomerPaymentSourceJsonParser customerSourceJsonParser = new CustomerPaymentSourceJsonParser();

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Customer parse(JSONObject json) {
        List i11;
        ArrayList arrayList;
        Integer num;
        String str;
        boolean z11;
        i r11;
        int t11;
        s.g(json, "json");
        if (s.c("customer", StripeJsonUtils.optString(json, FIELD_OBJECT))) {
            String optString = StripeJsonUtils.optString(json, "id");
            String optString2 = StripeJsonUtils.optString(json, FIELD_DEFAULT_SOURCE);
            JSONObject optJSONObject = json.optJSONObject(FIELD_SHIPPING);
            ShippingInformation parse = optJSONObject == null ? null : new ShippingInformationJsonParser().parse(optJSONObject);
            JSONObject optJSONObject2 = json.optJSONObject(FIELD_SOURCES);
            if (optJSONObject2 != null && s.c(VALUE_LIST, StripeJsonUtils.optString(optJSONObject2, FIELD_OBJECT))) {
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                boolean optBoolean = stripeJsonUtils.optBoolean(optJSONObject2, FIELD_HAS_MORE);
                Integer optInteger = stripeJsonUtils.optInteger(optJSONObject2, FIELD_TOTAL_COUNT);
                String optString3 = StripeJsonUtils.optString(optJSONObject2, "url");
                JSONArray optJSONArray = optJSONObject2.optJSONArray("data");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                r11 = l.r(0, optJSONArray.length());
                t11 = x.t(r11, 10);
                ArrayList<JSONObject> arrayList2 = new ArrayList(t11);
                Iterator<Integer> it2 = r11.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(optJSONArray.getJSONObject(((n0) it2).a()));
                }
                ArrayList arrayList3 = new ArrayList();
                for (JSONObject it3 : arrayList2) {
                    CustomerPaymentSourceJsonParser customerPaymentSourceJsonParser = this.customerSourceJsonParser;
                    s.f(it3, "it");
                    CustomerPaymentSource parse2 = customerPaymentSourceJsonParser.parse(it3);
                    if (parse2 != null) {
                        arrayList3.add(parse2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (!(((CustomerPaymentSource) obj).getTokenizationMethod() == TokenizationMethod.ApplePay)) {
                        arrayList4.add(obj);
                    }
                }
                num = optInteger;
                str = optString3;
                arrayList = arrayList4;
                z11 = optBoolean;
            } else {
                i11 = w.i();
                arrayList = i11;
                num = null;
                str = null;
                z11 = false;
            }
            return new Customer(optString, optString2, parse, arrayList, z11, num, str, StripeJsonUtils.optString(json, FIELD_DESCRIPTION), StripeJsonUtils.optString(json, "email"), json.optBoolean(FIELD_LIVEMODE, false));
        }
        return null;
    }
}