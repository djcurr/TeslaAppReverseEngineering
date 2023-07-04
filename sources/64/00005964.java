package com.stripe.android.ui.core;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.i;
import u20.h;
import u20.n;
import u20.p;
import wz.r0;
import wz.s0;
import wz.v;
import wz.w;
import wz.w0;

/* loaded from: classes6.dex */
public final class FieldValuesToParamsMapConverter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void createMap(PaymentMethod.Type type, Map<String, Object> map, Map<String, String> map2) {
            List<String> d11;
            List<String> l11;
            d11 = v.d("type");
            addPath$payments_ui_core_release(map, d11, type.code);
            Iterator<T> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (type == PaymentMethod.Type.Sofort && s.c(entry.getKey(), "billing_details[address][country]")) {
                    Companion companion = FieldValuesToParamsMapConverter.Companion;
                    l11 = w.l("sofort", "country");
                    companion.addPath$payments_ui_core_release(map, l11, (String) entry.getValue());
                }
                Companion companion2 = FieldValuesToParamsMapConverter.Companion;
                companion2.addPath$payments_ui_core_release(map, companion2.getKeys$payments_ui_core_release((String) entry.getKey()), (String) entry.getValue());
            }
        }

        private final Map<String, Object> transformToParamsMap(Map<IdentifierSpec, FormFieldEntry> map, PaymentMethod.Type type) {
            int e11;
            int e12;
            Map<String, Object> linkedHashMap = new LinkedHashMap<>();
            e11 = r0.e(map.size());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e11);
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap2.put(entry.getKey(), ((FormFieldEntry) entry.getValue()).getValue());
            }
            e12 = r0.e(linkedHashMap2.size());
            Map<String, String> linkedHashMap3 = new LinkedHashMap<>(e12);
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(((IdentifierSpec) entry2.getKey()).getV1(), entry2.getValue());
            }
            createMap(type, linkedHashMap, linkedHashMap3);
            return linkedHashMap;
        }

        public final void addPath$payments_ui_core_release(Map<String, Object> map, List<String> keys, String str) {
            s.g(map, "map");
            s.g(keys, "keys");
            String str2 = keys.get(0);
            if (keys.size() == 1) {
                map.put(str2, str);
                return;
            }
            Object obj = map.get(str2);
            Map<String, Object> map2 = kotlin.jvm.internal.r0.o(obj) ? (Map) obj : null;
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
                map.put(str2, map2);
            }
            addPath$payments_ui_core_release(map2, keys.subList(1, keys.size()), str);
        }

        public final List<String> getKeys$payments_ui_core_release(String string) {
            h B;
            h h11;
            h r11;
            List<String> I;
            s.g(string, "string");
            B = p.B(i.e(new i("[*([A-Za-z_0-9]+)]*"), string, 0, 2, null), FieldValuesToParamsMapConverter$Companion$getKeys$1.INSTANCE);
            h11 = n.h(B);
            r11 = p.r(h11, FieldValuesToParamsMapConverter$Companion$getKeys$2.INSTANCE);
            I = p.I(r11);
            return I;
        }

        public final PaymentMethodCreateParams transformToPaymentMethodCreateParams(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, PaymentMethod.Type type) {
            Map filterOutNullValues;
            Map<String, ? extends Object> v11;
            Set<String> c11;
            s.g(fieldValuePairs, "fieldValuePairs");
            s.g(type, "type");
            filterOutNullValues = FieldValuesToParamsMapConverterKt.filterOutNullValues(transformToParamsMap(fieldValuePairs, type));
            v11 = s0.v(filterOutNullValues);
            PaymentMethodCreateParams.Companion companion = PaymentMethodCreateParams.Companion;
            c11 = w0.c("PaymentSheet");
            return companion.createWithOverride(type, v11, c11);
        }
    }
}