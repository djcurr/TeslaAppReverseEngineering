package com.stripe.android.model.parsers;

import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodsList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import vz.q;
import vz.r;
import wz.n0;
import wz.w;

/* loaded from: classes6.dex */
public final class PaymentMethodsListJsonParser implements ModelJsonParser<PaymentMethodsList> {
    @Deprecated
    private static final String FIELD_DATA = "data";
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final PaymentMethodJsonParser PAYMENT_METHOD_JSON_PARSER = new PaymentMethodJsonParser();

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public PaymentMethodsList parse(JSONObject json) {
        List b11;
        List i11;
        i r11;
        s.g(json, "json");
        try {
            q.a aVar = q.f54772b;
            JSONArray optJSONArray = json.optJSONArray("data");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            r11 = l.r(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it2 = r11.iterator();
            while (it2.hasNext()) {
                int a11 = ((n0) it2).a();
                PaymentMethodJsonParser paymentMethodJsonParser = PAYMENT_METHOD_JSON_PARSER;
                JSONObject optJSONObject = optJSONArray.optJSONObject(a11);
                s.f(optJSONObject, "data.optJSONObject(it)");
                PaymentMethod parse = paymentMethodJsonParser.parse(optJSONObject);
                if (parse != null) {
                    arrayList.add(parse);
                }
            }
            b11 = q.b(arrayList);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        i11 = w.i();
        if (q.g(b11)) {
            b11 = i11;
        }
        return new PaymentMethodsList((List) b11);
    }
}