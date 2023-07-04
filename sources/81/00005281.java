package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.n0;
import wz.v;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class ConsumerPaymentDetailsJsonParser implements ModelJsonParser<ConsumerPaymentDetails> {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CARD_BRAND = "brand";
    @Deprecated
    private static final String FIELD_CARD_DETAILS = "card_details";
    @Deprecated
    private static final String FIELD_CARD_EXPIRY_MONTH = "exp_month";
    @Deprecated
    private static final String FIELD_CARD_EXPIRY_YEAR = "exp_year";
    @Deprecated
    private static final String FIELD_CARD_LAST_4 = "last4";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_IS_DEFAULT = "is_default";
    @Deprecated
    private static final String FIELD_PAYMENT_DETAILS = "redacted_payment_details";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final ConsumerPaymentDetails.PaymentDetails parsePaymentDetails(JSONObject jSONObject) {
        String optString = StripeJsonUtils.optString(jSONObject, "type");
        if (optString == null) {
            return null;
        }
        String lowerCase = optString.toLowerCase(Locale.ROOT);
        s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (s.c(lowerCase, "card")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(FIELD_CARD_DETAILS);
            String string = jSONObject.getString("id");
            s.f(string, "json.getString(FIELD_ID)");
            boolean z11 = jSONObject.getBoolean(FIELD_IS_DEFAULT);
            int i11 = jSONObject2.getInt(FIELD_CARD_EXPIRY_YEAR);
            int i12 = jSONObject2.getInt(FIELD_CARD_EXPIRY_MONTH);
            CardBrand fromCode = CardBrand.Companion.fromCode(jSONObject2.getString("brand"));
            String string2 = jSONObject2.getString(FIELD_CARD_LAST_4);
            s.f(string2, "cardDetails.getString(FIELD_CARD_LAST_4)");
            return new ConsumerPaymentDetails.Card(string, z11, i11, i12, fromCode, string2);
        }
        return null;
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public ConsumerPaymentDetails parse(JSONObject json) {
        i r11;
        int t11;
        List arrayList;
        ConsumerPaymentDetails.PaymentDetails parsePaymentDetails;
        s.g(json, "json");
        JSONArray optJSONArray = json.optJSONArray(FIELD_PAYMENT_DETAILS);
        List list = null;
        if (optJSONArray == null) {
            arrayList = null;
        } else {
            r11 = l.r(0, optJSONArray.length());
            t11 = x.t(r11, 10);
            ArrayList<JSONObject> arrayList2 = new ArrayList(t11);
            Iterator<Integer> it2 = r11.iterator();
            while (it2.hasNext()) {
                arrayList2.add(optJSONArray.getJSONObject(((n0) it2).a()));
            }
            arrayList = new ArrayList();
            for (JSONObject it3 : arrayList2) {
                s.f(it3, "it");
                ConsumerPaymentDetails.PaymentDetails parsePaymentDetails2 = parsePaymentDetails(it3);
                if (parsePaymentDetails2 != null) {
                    arrayList.add(parsePaymentDetails2);
                }
            }
        }
        if (arrayList == null) {
            JSONObject optJSONObject = json.optJSONObject(FIELD_PAYMENT_DETAILS);
            if (optJSONObject != null && (parsePaymentDetails = parsePaymentDetails(optJSONObject)) != null) {
                list = v.d(parsePaymentDetails);
            }
            arrayList = list == null ? w.i() : list;
        }
        return new ConsumerPaymentDetails(arrayList);
    }
}