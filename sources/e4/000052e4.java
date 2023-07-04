package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.SourceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.n0;
import wz.x;

/* loaded from: classes6.dex */
public final class SourceOrderJsonParser implements ModelJsonParser<SourceOrder> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_AMOUNT = "amount";
    @Deprecated
    private static final String FIELD_CURRENCY = "currency";
    @Deprecated
    private static final String FIELD_EMAIL = "email";
    @Deprecated
    private static final String FIELD_ITEMS = "items";
    @Deprecated
    private static final String FIELD_SHIPPING = "shipping";
    private final ItemJsonParser itemJsonParser = new ItemJsonParser();

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class ItemJsonParser implements ModelJsonParser<SourceOrder.Item> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_AMOUNT = "amount";
        @Deprecated
        private static final String FIELD_CURRENCY = "currency";
        @Deprecated
        private static final String FIELD_DESCRIPTION = "description";
        @Deprecated
        private static final String FIELD_QUANTITY = "quantity";
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

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public SourceOrder.Item parse(JSONObject json) {
            s.g(json, "json");
            SourceOrder.Item.Type fromCode$payments_core_release = SourceOrder.Item.Type.Companion.fromCode$payments_core_release(StripeJsonUtils.optString(json, "type"));
            if (fromCode$payments_core_release != null) {
                StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
                return new SourceOrder.Item(fromCode$payments_core_release, stripeJsonUtils.optInteger(json, "amount"), StripeJsonUtils.optString(json, FIELD_CURRENCY), StripeJsonUtils.optString(json, FIELD_DESCRIPTION), stripeJsonUtils.optInteger(json, FIELD_QUANTITY));
            }
            return null;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ShippingJsonParser implements ModelJsonParser<SourceOrder.Shipping> {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final String FIELD_ADDRESS = "address";
        @Deprecated
        private static final String FIELD_CARRIER = "carrier";
        @Deprecated
        private static final String FIELD_NAME = "name";
        @Deprecated
        private static final String FIELD_PHONE = "phone";
        @Deprecated
        private static final String FIELD_TRACKING_NUMBER = "tracking_number";

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.stripe.android.core.model.parsers.ModelJsonParser
        public SourceOrder.Shipping parse(JSONObject json) {
            s.g(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            return new SourceOrder.Shipping(optJSONObject == null ? null : new AddressJsonParser().parse(optJSONObject), StripeJsonUtils.optString(json, FIELD_CARRIER), StripeJsonUtils.optString(json, "name"), StripeJsonUtils.optString(json, "phone"), StripeJsonUtils.optString(json, FIELD_TRACKING_NUMBER));
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public SourceOrder parse(JSONObject json) {
        i r11;
        int t11;
        s.g(json, "json");
        JSONArray optJSONArray = json.optJSONArray(FIELD_ITEMS);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        r11 = l.r(0, optJSONArray.length());
        t11 = x.t(r11, 10);
        ArrayList<JSONObject> arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            arrayList.add(optJSONArray.optJSONObject(((n0) it2).a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject it3 : arrayList) {
            ItemJsonParser itemJsonParser = this.itemJsonParser;
            s.f(it3, "it");
            SourceOrder.Item parse = itemJsonParser.parse(it3);
            if (parse != null) {
                arrayList2.add(parse);
            }
        }
        Integer optInteger = StripeJsonUtils.INSTANCE.optInteger(json, "amount");
        String optString = StripeJsonUtils.optString(json, FIELD_CURRENCY);
        String optString2 = StripeJsonUtils.optString(json, "email");
        JSONObject optJSONObject = json.optJSONObject(FIELD_SHIPPING);
        return new SourceOrder(optInteger, optString, optString2, arrayList2, optJSONObject == null ? null : new ShippingJsonParser().parse(optJSONObject));
    }
}